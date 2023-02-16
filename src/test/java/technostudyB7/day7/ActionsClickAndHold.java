package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.Utility;

public class ActionsClickAndHold extends Utility {
    public static void main(String[] args) {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement washington = driver.findElement(By.id("box3"));

        WebElement unitedStates = driver.findElement(By.id("box103"));

        Actions actions=new Actions(driver);

//        Action clickAndHoldWashington = actions.clickAndHold(washington).build();
//        clickAndHoldWashington.perform();
//
//        Action moveWashington = actions.moveToElement(unitedStates).release().build();
//        moveWashington.perform();

        Action clickAndHoldWashington2 = actions.clickAndHold(washington).moveToElement(unitedStates).release().build(); // combined 2 actions
        clickAndHoldWashington2.perform();
    }
}
