package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.Utility;

public class IFrame2 extends Utility {
    public static void main(String[] args) {
        /**
         * Type your name in the input box
         * click the check box
         * print "Not a Friendly Topic"
         * */


        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // we are in the first frame

        WebElement topicInput = driver.findElement(By.tagName("input"));
        topicInput.sendKeys("Ipek");

        driver.switchTo().frame(0); // we are in the inner frame

        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().defaultContent(); // it goes to main frame

        WebElement topic = driver.findElement(By.xpath("//label[@style='font-size:40px']//span"));
        System.out.println(topic.getText());
    }
}
