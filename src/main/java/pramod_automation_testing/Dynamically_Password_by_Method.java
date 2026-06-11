package pramod_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Dynamically_Password_by_Method {
    static void main(String[] args) throws InterruptedException {

        String name="Pramod Kumar HL";

        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String password=getPassword(driver);//storing the returned password from getpassword method to string variable

        driver.get("https://rahulshettyacademy.com/locatorspractice/");//open that URL
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(1000);//after sign in just wait 1 sec to do perform
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        //driver.close();
    }

    public static String getPassword( WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        // going to the URL
        driver.findElement(By.linkText("Forgot your password?")).click();
        //clicking forgot password
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();//clicking reset button
        String passwordText=driver.findElement(By.cssSelector("form p")).getText();//what ever text gets will store it to String variable
        //getting theText of password compete lines
        //Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArr1=passwordText.split("'");//splitted the complete string to 2 parts on "'"
        //stored in string array
        //0th index - Please use temporary password
        //1st idex - rahulshettyacademy' to Login.
        String[] passwordArr2=passwordArr1[1].split("'");//againg we splitted the Text at "'"
        //so here we get 0th -> rahulshettyacademy and 1st-> to Login.
        //String password = passwordArr1[1].split("'")][0]; - directly u can assign the value to password by splitting and index
        String password=passwordArr2[0];//assigning rahulshettyacademy to password
        return password;


    }
}
