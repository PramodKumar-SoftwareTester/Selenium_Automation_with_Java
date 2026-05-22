package pramod_automation_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Microsoft_Edge_Browser {

    static void main(String[] args) {

        //Microsoft Edge Browser
        //edge driver

        System.setProperty("webdriver.edge.driver","/Users/pramo/Documents/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://tmnas.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());// Gves the source of the last page Loaded

        driver.close();

        //driver.quit();
    }
}
