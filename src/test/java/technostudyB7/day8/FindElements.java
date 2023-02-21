package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.Utility;

import java.util.List;

public class FindElements extends Utility {
    public static void main(String[] args) {
        driver.get("http://www.youtube.com");

        List<WebElement> videoTitles= driver.findElements(By.id("video-title"));
        System.out.println(videoTitles.get(10).getText());
    }
}
