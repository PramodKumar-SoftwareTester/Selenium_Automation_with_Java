package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Parent_to_child_andreverse_switchto {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(3));
        driver.manage().window().maximize();
        //open below website
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        //click on the link
        driver.findElement(By.cssSelector(".blinkingText")).click();

        Set<String> windows=driver.getWindowHandles();//getwindowhandles will handling the parent to child windows
        Iterator<String> it=windows.iterator();//it will use to iteration on Parent, child window
        String parent=it.next();//Parent
        String child=it.next();//child

        driver.switchTo().window(child);//here switching the window from parent to child
        //wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".im-para.red")));

        //selected teh whole text from child window
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

        //getting the email fromm the Texts
        String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        //this will also works -> String email = driver.findElement(By.cssSelector(".im-para.red a")).getText();
        //Switch back to Parent from child
        driver.switchTo().window(parent);

        //send that email to username
        driver.findElement(By.id("username")).sendKeys(email);
    }
}
