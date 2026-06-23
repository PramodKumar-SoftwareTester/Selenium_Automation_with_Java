package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Waits_Selenium {
    static void main(String[] args) throws InterruptedException {

        String[] itemsNeeded = {"Cucumber", "Brocolli", "Tomato", "Beetroot"};//assigning the values to the arrays


        WebDriver driver = new ChromeDriver();

        //Implicit Wait with duration of 5 seconds
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Explicit wait Object Creation
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");//Practicing Ecommerce Website
        //Thread.sleep(3000);
        addItems(driver,itemsNeeded);//Calling method related to Adding items to cart

        //Using Cart applying coupon and proceed

        //Click on Cart Image Cart
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();

        //Click on Proceed to Checkout
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        //Explicitly wait till the Promo code text box appears
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
        //sending promocode
        driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");

        //click on APPLY
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        //here we Use the Explicit Wait Until the Text Visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        //getting the Text of success
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

        //Place Order
        driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();



    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        int j = 0;
        //list of product names stored in Products
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++)//
        {
            //storing each iteration Product Name in the Name Variable each time
            //String name = products.get(i).getText();

            //here need to foramt the names like if Brocolli - 1kg in web, we have to split and trim it lke below
            // Brocolli, 1kg // splitted '-'
            String[] name = products.get(i).getText().split("-");//name[0] - Brocolli space  name[1]- 1kg
            String formattedName = name[0].trim();//trim the white space beside the string of Brocolli

            //here we need to convert the Array to Array List then we have to pass that into if condition
            List itemsNeededList = Arrays.asList(itemsNeeded);

            if (itemsNeededList.contains(formattedName))//condition for checking the name with Arralisted name
            {
                j++;//to get j value increased

                //so many add to cart buttons present, but click on the i index(present) button
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                //break; we should not use break directly when used the array list

                if (j == itemsNeeded.length)//here we check the number of items in array similarly execute number of iterations for loop
                {
                    break;
                }
                //length for Arrays, size() for Array list
            }
        }
    }

}
