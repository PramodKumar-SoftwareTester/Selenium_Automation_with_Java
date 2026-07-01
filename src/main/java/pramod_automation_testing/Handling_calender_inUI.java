package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Handling_calender_inUI {
    static void main(String[] args) {

        //in our code no Hard coded
        String month = "8";
        String year = "2028";
        String date = "20";
        String[] expected ={month,date,year};

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");//selenium Practice// offers

        //Clicking on the calender
        driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();

        //clickin on Month of the UI Calender 2 times to get years
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

        //cicking the year 2028 -> Used the concatination
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();

        //clicking the month
        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
        //converted from String to Integer

        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
        //clicked on date by concatinating

        //list of webelements in the calender selected date
        List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

        for(int i=0; i<actualList.size();i++)
        {
            //print the text in the calender field
            System.out.println(actualList.get(i).getDomAttribute("value"));

            //Assertion
            Assert.assertEquals(actualList.get(i).getDomAttribute("value"),expected[i]);
        }
        driver.close();

    }
}
