package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class Auto_Suggestive_Dropdown {
    static void main(String[] args) throws InterruptedException {

        String name="ind";//hard input
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("autosuggest")).sendKeys(name);//by used literals
        Thread.sleep(3000);
        List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        //list of all the records in that CSS Path is stored to List of Web Elements
        //here we use driver.findElements

        for( WebElement option :options)
        {
            if(option.getText().equalsIgnoreCase("India"))
            {
                option.click();
                break;
            }
        }


    }
}
