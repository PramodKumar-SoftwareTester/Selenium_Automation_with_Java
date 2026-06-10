package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators_Selenium {
    static void main(String[] args) throws InterruptedException {

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
        //Css selector -> tagname.class name or "Tagname[attribute='value']"
        //out put - use sout
        driver.findElement(By.linkText("Forgot your password?")).click();
        //here where <a ---></a> ike this in web anchor we can use link text
        Thread.sleep(1000);//pausing script for 1 sec
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pramod Kumar HL");
        //X - Path "//Tagname[@attribute='value']"
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("pramod@gmail.com");
        //Customised CSS Selctor - Tagname[attribute='value']
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();//clear the text entered automatically
        //here X - Path after[1/2/3/...] is indexing to make the attribute Unique
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("pramod@gmail.com");
        //Used Css selector with indexing - Tagname[attribute='value']:nth-child(index)
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9090908787");
        //X-Path //Parenttag/ChildTag
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        //we can use.classname instead of Tagname.classname
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());// CSS selector - traverse method for locator
        //parentTagname childTagname -> form p
        driver.findElement(By.cssSelector("button.go-to-login-btn")).click();//Css selecto for login button
        //driver.quit();

    }
}
