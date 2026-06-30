package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Count_of_links {
    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Req - 1 -> Count of links present in the web page
        System.out.println(driver.findElements(By.tagName("a")).size());//all links are start with tag names "a"

        //Req - 2 -> count of links present only inside the footer of the page
        //first we should subset to footer from driver
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        //now get the count of links in footer driver
        System.out.println(footerdriver.findElements(By.tagName("a")).size());

        //Req - 3- > only links present in first column of footer
        //subsequet to first column from footerdriver
        WebElement columndriver=footerdriver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
        //count of links in the first column of foot driver
        System.out.println(columndriver.findElements(By.tagName("a")).size());

        //Req - 4 -> click on each link in the first column links of the footer and check all are opening or not
        for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)//i starts with 1 because in that column
            // starts from 0th but we need to click on from 1st so
        {
            //we use Keys ctrl and enter on the respective links
            String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);//keys ctrl+enter stored in a string var

            //clicking on each links
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);//passing the clickonlink var to each link
            Thread.sleep(5000);

        }
        //we use get handler and iterator and while loop to get the Title of all opened windows
        Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();

        while (it.hasNext())
        {
            driver.switchTo().window(it.next());//go to next window

            System.out.println(driver.getTitle());//get the title of the windows
        }
    }
}
