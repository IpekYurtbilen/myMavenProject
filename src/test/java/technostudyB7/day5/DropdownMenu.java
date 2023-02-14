package technostudyB7.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMenu {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

//        <select class="form-control" id="select-demo">
//				<option value="" selected="" disabled="">Please select</option>
//				 <option value="Sunday">Sunday</option>
//				  <option value="Monday">Monday</option>
//				  <option value="Tuesday">Tuesday</option>
//				  <option value="Wednesday">Wednesday</option>
//				  <option value="Thursday">Thursday</option>
//				  <option value="Friday">Friday</option>
//				  <option value="Saturday">Saturday</option>
//			  </select>

        WebElement dropdown = driver.findElement(By.id("select-demo"));
        Select dropdownMenu = new Select(dropdown);
        dropdownMenu.selectByIndex(1);
        Thread.sleep(1000);

        dropdownMenu.selectByValue("Tuesday");
        Thread.sleep(1000);

        dropdownMenu.selectByVisibleText("Thursday");

        String selectedOption = dropdownMenu.getFirstSelectedOption().getText();
        String expected = "Thursday";

        if(selectedOption.equals(expected)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }
}
