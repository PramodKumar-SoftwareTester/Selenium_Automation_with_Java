package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Selenium_3 {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        //Parent to Sibling X-Path - //header/div/button[1]
        //Parent to Sibling and Sibling to Sibling X-Path - //header/div/button[1]/following-sibling::button[1]
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[3]")).getText());
        // X Path for Parent to child and child to Parent and then to child - //header/div/button[1]/parent::div/button[3]
    }
}
