package utilities;

import driver.PageDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class Common {
    /*******************************************
     * *****************************************
     * PassValue in the input field using sendTextMethod
     * @param element
     * @param value
     */
    // send text method sends values in a web element like inputs
    public static void sendText(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
    /*********************************
     * *******************************
     * Method---------3 Search by "text" scrolling top bottom
     */

    //with instance
    public void androidScrollToAnElementByText(String text) {
        try {
            (PageDriver.getCurrentDriver()).findElement(
                    MobileBy.AndroidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().text(\"" + text + "\").instance(0))")).click();
        } catch (Exception e) {
            throw new NoSuchElementException("No element " + e);
        }
    }

    //without instance
    public void androidScrollByText(String text) {
        try {
            (PageDriver.getCurrentDriver()).findElement(
                    MobileBy.AndroidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + text + "\").instance(0))")).click();
        } catch (Exception e) {
            throw new NoSuchElementException("No element " + e);
        }
    }
}
