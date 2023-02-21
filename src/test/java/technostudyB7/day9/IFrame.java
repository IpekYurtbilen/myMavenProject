package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.Utility;

public class IFrame extends Utility {

    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

//        driver.switchTo().frame("frame1");
//        WebElement iFrame = driver.findElement(By.id("frame1"));
//        driver.switchTo().frame(iFrame);

        driver.switchTo().frame(0);

        WebElement topicInput = driver.findElement(By.tagName("input"));
        topicInput.sendKeys("John Snow");

        driver.switchTo().parentFrame(); // it goes 1 one frame up
        driver.switchTo().defaultContent(); // it goes to main frame

        WebElement topic = driver.findElement(By.xpath("//label[text()='Topic : ']"));
        System.out.println(topic.getText());


    }
}
