package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Add_To_Cart_ArrayList {
    static void main(String[] args) throws InterruptedException {

        String[] itemsNeeded = {"Cucumber","Brocolli","Tomato","Beetroot"};//assigning the values to the arrays
        int j=0;

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");//Practicing Ecommerce Website
        Thread.sleep(3000);

        //list of product names stored in Products
        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

        for(int i=0; i<products.size(); i++)//
        {
            //storing each iteration Product Name in the Name Variable each time
            //String name = products.get(i).getText();

            //here need to foramt the names like if Brocolli - 1kg in web, we have to split and trim it lke below
            // Brocolli, 1kg // splitted '-'
            String[] name = products.get(i).getText().split("-");//name[0] - Brocolli space  name[1]- 1kg
            String formattedName = name[0].trim();//trim the white space beside the string of Brocolli

            //here we need to convert the Array to Array List then we have to pass that into if condition
            List itemsNeededList = Arrays.asList(itemsNeeded);

            if(itemsNeededList.contains(formattedName))//condition for checking the name with Arralisted name
            {
                j++;//to get j value increased

                //so many add to cart buttons present, but click on the i index(present) button
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                //break; we should not use break directly when used the array list

                if(j==itemsNeeded.length)//here we check the number of items in array similarly execute number of iterations for loop
                {
                    break;
                }
                //length for Arrays, size() for Array list
            }
        }
    }
}
