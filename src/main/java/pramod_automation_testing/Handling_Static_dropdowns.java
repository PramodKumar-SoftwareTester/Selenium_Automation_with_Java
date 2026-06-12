package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Static_dropdowns {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        //what ever the locator we fetch that as web element to store

        //Select Tag -> Static Dropdown

        Select dropdown = new Select(staticdropdown);//here we providing that webelement for handling select method
        //created an object from select class

        dropdown.selectByIndex(3);//index are start from 0.... for the static dropdown values
        //selected by index
        System.out.println(dropdown.getFirstSelectedOption().getText());//displaying the selected option

        dropdown.selectByVisibleText("AED");//Selecting the dropdown values by Text of the values
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByValue("INR");//selecting the dropdown by Value showing in dev tool for the perticular dropdown options
        System.out.println(dropdown.getFirstSelectedOption().getText());
    }
}
