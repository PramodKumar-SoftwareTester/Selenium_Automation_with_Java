package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Handling {
    static void main(String[] args) {

        String name="Pramod Kumar";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("name")).sendKeys(name);//sending Text to field

        driver.findElement(By.id("alertbtn")).click();//Clcicking Alert Button

        //to get the Text of the Alert
        System.out.println(driver.switchTo().alert().getText());
        //Accept the Alert -> Ok/Yes
        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmbtn")).click();//Clciking confirm Button

        //to get the Text of the Alert
        System.out.println(driver.switchTo().alert().getText());
        //Cancel the Alert -> No/Cancel
        driver.switchTo().alert().dismiss();
    }
}
