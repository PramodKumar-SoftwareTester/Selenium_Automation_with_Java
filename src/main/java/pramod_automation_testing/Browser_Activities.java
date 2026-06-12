package pramod_automation_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Activities {
    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();//Maximizingly opening the Browser/window
        driver.get("https://www.google.com/");
        driver.navigate().to("https://rahulshettyacademy.com/");//from one window to another window
        driver.navigate().back();//coming back to parent window
        Thread.sleep(1000);
        driver.navigate().forward();//again parent window to first mentioned child window
    }
}
