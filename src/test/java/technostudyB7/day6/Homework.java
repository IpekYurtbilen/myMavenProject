package technostudyB7.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import technostudyB7.Utilities.Utility;

import java.util.concurrent.TimeUnit;

public class Homework extends Utility {
    /** Navigate to https://www.phptravels.net
     * Click on Account button
     * Click on Customer Sign Up
     * Fill the form
     * Check the "I am not robot" check box
     * Click on Sign Up button
     * Check if the title is "Login - PHPTRAVELS"
     * Enter same login information that you used during registration and click login
     * Verify the welcome message contains the first name that you used during registration then close the browser
     *
     * Note: You can use any locator you want.
     * */

    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        driver.get("https://www.phptravels.net");

        WebElement account = driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle waves-effect']"));
        account.click();

        WebElement customerSignUp = driver.findElement(By.xpath("//a[text()='Customer Signup']"));
        customerSignUp.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Jane");

        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Doe");

        WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
        phone.sendKeys("123987");

        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        email.sendKeys("abc@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("asdqwe");

        WebElement accountType = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
        accountType.click();


        WebElement agent = driver.findElement(By.xpath("//li[text()='Agent']"));
        agent.click();

//        WebElement robotButton = driver.findElement();
//        robotButton.click();

//        WebElement signUp = driver.findElement(By.xpath("//span[text()='Signup']"));
//        signUp.click();


    }
}
