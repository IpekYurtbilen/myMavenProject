package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.Utility;

import java.util.Arrays;
import java.util.List;

public class FindElementsExample extends Utility {

    public static void main(String[] args) {
        //        1- Go to https://www.saucedemo.com/
//2- login with valid credentials
//3- Click on Sauce Labs Backpack and add to the cart
//4- Click on Back To Products
//5- Click on Sauce Labs Bolt T-Shirt and add to the cart
//6- Click on the cart
//7- Click on the Check Out button
//8- Fill the form and click on Continue
//9- Check if you see your products

        driver.get("https://www.saucedemo.com/");

//        <input class="input_error form_input" placeholder="Username" type="text" data-test="username"
//        id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value="">

        WebElement userName = driver.findElement(By.xpath("//input[@class='input_error form_input']"));
        userName.sendKeys("standard_user");

//        <input class="input_error form_input" placeholder="Password" type="password"
//        data-test="password" id="password" name="password" autocorrect="off" autocapitalize="none" value="">

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");

//        <input type="submit" class="submit-button btn_action" data-test="login-button"
//        id="login-button" name="login-button" value="Login">

        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

//        <div class="inventory_item_name">Sauce Labs Backpack</div>
        WebElement product1 = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String product1Str = product1.getText();
        product1.click();


//        <button class="btn btn_primary btn_small btn_inventory" data-test="add-to-cart-sauce-labs-backpack"
//        id="add-to-cart-sauce-labs-backpack" name="add-to-cart-sauce-labs-backpack">Add to cart</button>
        WebElement addToCart = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();

        driver.navigate().back();

        WebElement product2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        String product2Str = product2.getText();
        product2.click();


        WebElement addToCart1 = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCart1.click();

        WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cart.click();

        WebElement checkOut = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
        checkOut.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@data-test='firstName']"));
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.xpath("//input[@data-test='lastName']"));
        lastName.sendKeys("Doe");

        WebElement zipCode = driver.findElement(By.xpath("//input[@data-test='postalCode']"));
        zipCode.sendKeys("12345");

        WebElement continueButton = driver.findElement(By.xpath("//input[@data-test='continue']"));
        continueButton.click();

//        <div class="inventory_item_name">Sauce Labs Backpack</div>

        List<WebElement> inventoryItemName = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

        System.out.println(inventoryItemName.get(0).getText().equals(product1Str));
        System.out.println(inventoryItemName.get(1).getText().equals(product2Str));

        quitDriver(4);

    }
}
