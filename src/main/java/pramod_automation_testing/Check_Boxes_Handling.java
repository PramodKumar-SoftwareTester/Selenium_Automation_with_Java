package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Boxes_Handling {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        //Before Selecting the Check Box
        //Here we used Css Selector Regular Expression, we can also use Xpath Regular Expression like
        // //input[contains(@id,'friendsandfamily')]
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        //Clicking the check Box
        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        //After Clicking the check Box


        //Total Number of Check Boxes in the Page - .size();
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
    }
}
