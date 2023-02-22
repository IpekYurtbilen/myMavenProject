package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.Utility;

import java.util.List;
import java.util.Set;

public class WindowSwitchExample extends Utility {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");

        String mainPageId = driver.getWindowHandle();

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));

//        we opened the links all together

        for (WebElement link : links) {
            if (!link.getAttribute("href").contains("mailto"))
                link.click();

        }

        Set<String> allIds = driver.getWindowHandles();

        for (String id : allIds) {
            if (!id.equals(mainPageId)) {
                driver.switchTo().window(id);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        Wait(2);

//        We opened the links and got the titles one by one
//        for (WebElement link : links) {
//            if (!link.getAttribute("href").contains("mailto"))
//                link.click();
//
//            Set<String> allIds1 = driver.getWindowHandles();
//
//            for (String id : allIds1) {
//                if (!id.equals(mainPageId)) {
//                    driver.switchTo().window(id);
//                    System.out.println(driver.getTitle());
//                    driver.close();
//                    driver.switchTo().window(mainPageId);
//                }
//            }
//
//        }



        driver.switchTo().window(mainPageId);

        System.out.println(driver.getTitle());

        driver.quit();

    }
}
