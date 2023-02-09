package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask_2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement sum1 =driver.findElement(By.id("sum1"));
        sum1.sendKeys("3");

        WebElement sum2 = driver.findElement(By.id("sum2"));
        sum2.sendKeys("5");

        WebElement button = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        button.click();

        WebElement result = driver.findElement(By.id("displayvalue"));

        String actualResult =  result.getText();

        int a = 3;
        int b = 5;
        int total = a+b;

        String expectedResult=Integer.toString(total);

        if(expectedResult.equals(actualResult)){
            System.out.println("verification is : PASSED");
        }else {
            System.out.println("verification is: FAILED");
            System.out.println(actualResult);
        }

        driver.quit();


    }

}
