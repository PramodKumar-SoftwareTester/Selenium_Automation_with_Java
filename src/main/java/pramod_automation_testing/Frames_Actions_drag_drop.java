package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_Actions_drag_drop {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        //how many number of frames in the webpage
        System.out.println(driver.findElements(By.tagName("iframe")).size());

        //web element of the frame, driver is switching to frame
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        //driver.switchTo().frame(1), by index also we can switch to fames if multiple frames available
        //but usually not suggest by index, through the locator is good, because if dev added multiple frames after that indes script will fail

        //to drag and drop we use below Actions
        Actions act = new Actions(driver);

        //Web element for the dragging and droppings
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        //drag and drop by actions
        act.dragAndDrop(source,target).build().perform();

        //to come back from frames to the default contet by driver
        driver.switchTo().defaultContent();
    }
}
