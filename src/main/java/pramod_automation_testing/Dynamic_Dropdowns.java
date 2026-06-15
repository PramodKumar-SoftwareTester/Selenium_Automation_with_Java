package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdowns {
    static void main(String[] argsS) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //Opened the website

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        //Clicked on the Dropdown

        // //a[@value='BLR'] - X - Path for Bengaluru
        // //a[@value='MAA'] - X - Path for chennai

        /*
        driver.findElement(By.xpath("//a[@value='BLR']")).click();//select the value
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//select the value
        */

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
        // X-Path -> Parent X Path and Child X-Path Cobination
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        //X-Path -> Parent X Path and Child X-Path Cobination -> Parent Xpath space Child Xpath



    }
}
