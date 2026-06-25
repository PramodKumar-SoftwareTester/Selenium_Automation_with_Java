package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class Actions_Selenium {
    static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));//Explicit Wait
        driver.get("https://www.amazon.com/");

        //Action is a Class
        Actions act = new Actions(driver);//here we pass driver to the Object

        //Click on Search field, entering Capital Letters and Selecting the Text
        //KeyDown(Keys.SHIFT) - it will like pressing shift and next if entered any small letter - it will caps
        //doubleClick() - select word
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        //Explicit Wait

        //w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='nav-link-accountList']")));
        WebElement field = driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));
        //To Mouse Hover on any field - we can use Actions
        act.moveToElement(field).build().perform();//Context Click - its like Right Click
        //Performing the Action of Mouse hover on the target
        //target - driver.findElement(By.xpath("//div[@id='nav-link-accountList']")
    }
}
