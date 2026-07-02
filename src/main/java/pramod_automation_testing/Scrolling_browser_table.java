package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Scrolling_browser_table {
    static void main(String[] args) throws InterruptedException {

        int sum=0;

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //to scroll the browser or Table by default not having any thing from selenium
        // we use javascript executer
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Scrolling the browser
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);

        //Scrolling Table in the Browser
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        //sum of all the amounts in the table
        List<WebElement> amounts = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        //we can use xpath - //div[@class='tableFixHead']//table//tr/td[4]

        for(int i=0; i< amounts.size();i++)
        {
            //amounts are
            System.out.println(Integer.parseInt(amounts.get(i).getText()));

            int amt=Integer.parseInt(amounts.get(i).getText());
            //converting the grabbed text to Integer to do summation

            sum+=amt;//adding sum with amt
        }

        System.out.println("the sum of all amount is "+sum);

        //compare the sum with total in the web page
        String webvalue=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
        //split the text gets and trim it -> 296

        Assert.assertEquals(sum,Integer.parseInt(webvalue));//comparing the value



    }
}
