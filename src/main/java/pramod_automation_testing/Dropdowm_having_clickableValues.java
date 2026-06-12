package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowm_having_clickableValues {
    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());//before loop logic

        driver.findElement(By.id("divpaxinfo")).click();//click the dropdown - Passenger
        Thread.sleep(2000);//wait for some time to load values

        for (int i=1;i<=4;i++) {
            driver.findElement(By.id("hrefIncAdt")).click();//Adult clicked 4 times, but already 1 adult selected so 1+4 times = 5 adults
            //we have to click multiple time here if need to add more adults on that time we can use loops
        }

        int j=1;
        while(j<4)
        {
            driver.findElement(By.id("hrefIncChd")).click();//it will click 3 times - 3 child select
            j++;
        }

        for (int k=1;k<=2;k++)
        {
            driver.findElement(By.id("hrefIncInf")).click();//it will click 2 times - 2 infants selects
        }

        driver.findElement(By.id("btnclosepaxoption")).click();

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());//after loop logic
    }
}
