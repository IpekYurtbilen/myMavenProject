package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.Utility;

import java.util.ArrayList;
import java.util.List;

public class FindElementsExample2 extends Utility {
    /**1- Go to https://www.saucedemo.com/
     2- login with valid credentials
     3- Add 3 random products to the cart
     4- Click on the cart
     5- Click on the Check Out button
     6- Fill the form and click on Continue
     7- Check if you see your products*/

    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");

//        <input class="input_error form_input" placeholder="Username" type="text" data-test="username"
//        id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value="">

        WebElement userName = driver.findElement(By.xpath("//input[@class='input_error form_input']"));
        userName.sendKeys("standard_user");

//        <input class="input_error form_input" placeholder="Password" type="password"
//        data-test="password" id="password" name="password" autocorrect="off" autocapitalize="none" value="">

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

//        List<WebElement> inventoryItems = driver.findElements(By.cssSelector(".inventory_item_name"));
        List<String> inventoryItemsNames = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();


        while (inventoryItemsNames.size()<3){
            List<WebElement> inventoryItems = driver.findElements(By.cssSelector(".inventory_item_name"));
            int randomIndex = (int)(Math.random()*inventoryItems.size());

            if(indexList.contains(randomIndex)){
                continue;
            }
            indexList.add(randomIndex);
            inventoryItemsNames.add(inventoryItems.get(randomIndex).getText());
            inventoryItems.get(randomIndex).click();
            WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
            addToCartButton.click();
            driver.navigate().back();
        }

//       <a class="shopping_cart_link"><span class="shopping_cart_badge">3</span></a>
        WebElement cartIcon = driver.findElement(By.cssSelector("a[class='shopping_cart_link']"));
        cartIcon.click();

        WebElement checkOutButton = driver.findElement(By.id("checkout"));
        checkOutButton.click();

        WebElement name = driver.findElement(By.id("first-name"));
        name.sendKeys("John");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Snow");

        WebElement zipCode = driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("55555");

        WebElement continueButton=driver.findElement(By.id("continue"));
        continueButton.click();

        List<WebElement> checkOutItemsList = driver.findElements(By.className("inventory_item_name")) ;

        for (WebElement product: checkOutItemsList) {

            System.out.println(inventoryItemsNames.contains(product.getText()));

        }

        driver.quit();








    }
}
