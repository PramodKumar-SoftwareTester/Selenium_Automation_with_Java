package pramod_automation_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire_Fox_Browser {
    public static void main(String[] args) {

        //Fire Fox Browser
        //geckodriver

        //System.setProperty("webdriver.gecko.driver","/Users/pramo/Documents/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://rahulshettyacademy.com/");// URL opened in Fire Fox Browser

        System.out.println(driver.getTitle());//Showing the title of the web page in Output

        System.out.println(driver.getCurrentUrl());// validated the URL

        //driver.close();//closing the perticular one browser window

        driver.quit();// close all assosiated browser windows wrt opened by selenium while automation





    }
}
