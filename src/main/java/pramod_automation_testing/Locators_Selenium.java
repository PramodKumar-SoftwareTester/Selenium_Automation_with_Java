package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators_Selenium {
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        //Implicit wait -> 5 second Time out
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");//open that URL
        driver.findElement(By.id("inputUsername")).sendKeys("PramodKumar");
        //ID -> Locator, send keys -> type values
        driver.findElement(By.name("inputPassword")).sendKeys("Hello123");
        //name -> Locator
        driver.findElement(By.className("signInBtn")).click();//Class Name-> Locator
        //Click -> clicking the button
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        //Css selector -> tagname.class name
        //out put - use sout

    }
}
