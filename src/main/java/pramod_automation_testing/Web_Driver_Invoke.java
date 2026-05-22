package pramod_automation_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver_Invoke {
    public static void main(String[] args) {

        //Invoking Browser
        //Chrome Browser -> ChromeDriver -> Methods, Get, Close exmpls
        //FireFox Browser -> Firefox Driver -> Methods - get, Close examples
        // Safari--- also


        //ChromeDriver driver= new ChromeDriver(); -> this Object usable only for
        //---Chrome driver Methods usage, it will not effect for Fire Fox or any other Browsers

        // webdriver - Methods
        //Webdriver + Own Class Menthods -> Chrome Driver

        //ChromeDriver.exe --> Chrome Browser
        // to invoke Chrome Browser There are 2 steps
        //1 -> Selenium Manager


        //2  -> Steps to invoke Chromedriver.exe
        //System.setProperty("webdriver.chrome.driver","/Users/pramo/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");//Flipkart Web Site Opened

        System.out.println(driver.getTitle());// to get the Title of the Web page in Below Output Console
        //Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers! - title of the webpage

        System.out.println(driver.getCurrentUrl()); // Validate the URL is it correct or not

        System.out.println(driver.getPageSource());// Gves the source of the last page Loaded

        driver.close();// to close the Opened particular Browser window

        driver.quit();// it closes all assosiated Browser windows wrt opened by selenium when doing automation



    }
}
