package technostudyB7.day10;

import org.openqa.selenium.JavascriptExecutor;
import technostudyB7.Utilities.Utility;

public class ScrollTo extends Utility {
    public static void main(String[] args) {

        driver.get("https://triplebyte.com/");

        // window.scrollTo(0, "document.body.scrollHeight') // scroll to the end of the page

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // scrolled to the bottom
        Wait(2);

        js.executeScript("window.scrollTo(0, 0);"); // scrolled to the top of the page

    }
}
