package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion_Methods {
    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@id,'IndArm')]")).isSelected());
        //Before selecting the check box - assertFalse(False) -> True -> if its True, script will continue or else it will through error
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@id,'IndArm')]")).click();
        //select check Box
        Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'IndArm')]")).isSelected());
        // after selected check box - AsserTrue(True) -> True
        //here Assertion is Using to be compare out put with the provided Condition

        Assert.assertEquals(driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_IndArm']")).getText(), "Indian Armed Forces");
        //comparing the text in out put and with condition
    }
}
