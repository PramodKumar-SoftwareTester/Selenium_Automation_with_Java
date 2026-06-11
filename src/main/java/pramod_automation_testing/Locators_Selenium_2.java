package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators_Selenium_2 {
    static void main(String[] args) throws InterruptedException {

        String name="Pramod Kumar HL";

        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");//open that URL
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(1000);//after sign in just wait 1 sec to do perform
        System.out.println(driver.findElement(By.tagName("p")).getText());
        //Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        //Aseertion - compare the Text
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
        //Using string variable in the script
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        // if any element to check through Text using X - Path like above
        driver.close();
    }
}
