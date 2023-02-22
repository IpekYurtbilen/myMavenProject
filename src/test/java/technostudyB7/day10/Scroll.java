package technostudyB7.day10;

import org.openqa.selenium.JavascriptExecutor;
import technostudyB7.Utilities.Utility;

public class Scroll extends Utility {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com");

        Wait(3);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // window.scrollBy(int x, int y) // positive y value means scroll down, negative y value means scroll up and
        // positive x value means scroll right, negative x values means scroll left by specified pixel
        // window.scrollTo(0, "document.body.scrollHeight') // scroll to the end of the page
        // "argument[0].scrollIntoView(true) ;" // scroll to the specified element


        js.executeScript("window.scrollBy(0, 3000)"); // scrolled down by 3000 pixels

        Wait(2);
        js.executeScript("window.scrollBy(0, -1000)"); // scrolled up by 1000 pixels

        quitDriver(2);

    }
}
