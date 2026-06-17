package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class End_to_End_UI_Automation {
    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();//chrome browser
        driver.manage().window().maximize();//Maximise window
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");//Calling URL

        driver.findElement(By.id("autosuggest")).sendKeys("ind");//Auto suggestive dropdown
        Thread.sleep(2000);
        List<WebElement> Options= driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
        for(WebElement Option:Options)
        {
            if(Option.getText().equalsIgnoreCase("India"))
            {
                Option.click();
            }
        }

        //Dynamic Dropdown Handling
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();

        //Calendar
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
        Thread.sleep(2000);
        System.out.println("before enabled the return date");//disabled checking
        if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5"))
        {
            System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style")+" disabled");
            Assert.assertTrue(true);
        }
        else {
            System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style")+"enabled");
            Assert.assertTrue(false);
        }

        //drop down with increment values
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        for(int i=1;i<3;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        for(int j=1;j<3;j++)
        {
            driver.findElement(By.id("hrefIncChd")).click();
        }
        for(int k=1;k<3;k++)
        {
            driver.findElement(By.id("hrefIncInf")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();

        //static Dropdown
        WebElement selected=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select sel=new Select(selected);
        sel.selectByIndex(2);

        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();//check box handling

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();//Radio Button

        Thread.sleep(2000);
        System.out.println("After enabled the return date");//calendar enabled
        if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
        {
            System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
            Assert.assertTrue(true);
        }
        else {
            System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
            Assert.assertTrue(false);
        }

        //Submit
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();


    }
}
