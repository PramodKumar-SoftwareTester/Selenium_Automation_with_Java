package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWait_Selenium {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//div[@id='start']/button")).click();

        //Fluent Wait - when dynamically changing the data if needs to be capture we Use this Fluent Wait
        //withTimeout -> actual time out needed, polling -> regular interval time its observes
        //Wait -> interface, wait -> Object, FluentWait -> Class
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5)).ignoring(NullPointerException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {

                if(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed())
                {
                    return driver.findElement(By.cssSelector("div[id='finish'] h4"));
                }
                else {
                    return null;
                }

            }
        });

        System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());
    }
}
