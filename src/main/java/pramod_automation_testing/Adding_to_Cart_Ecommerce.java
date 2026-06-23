package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Adding_to_Cart_Ecommerce {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");//Practicing Ecommerce Website

        //list of product names stored in Products
        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

        for(int i=0; i<products.size(); i++)//
        {
            //storing each iteration Product Name in the Name Variable each time
            String name = products.get(i).getText();

            if(name.contains("Cucumber"))
            {
                //so many add to cart buttons present, but click on the i index(present) button
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                break;
            }
        }
    }
}
