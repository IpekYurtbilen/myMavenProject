package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.Utility;

import java.util.Set;

public class Window extends Utility {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");

        String mainPageId = driver.getWindowHandle(); // we are getting the id of the active window

        WebElement registerNowButton = driver.findElement(By.xpath("//a[text()='Get Tickets']"));
        registerNowButton.click();

        Set<String> allIds = driver.getWindowHandles();

        for (String id : allIds) {
            if (!id.equals(mainPageId)) {
                driver.switchTo().window(id);
            }
        }

        System.out.println(driver.getTitle());
        driver.close(); // we closed the active window (register)

        driver.switchTo().window(mainPageId); // w must switch to the other window to use it after we close the active window
        System.out.println(driver.getTitle());

    }
}
