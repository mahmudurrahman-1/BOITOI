package pageObject;

import driver.PageDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class GolpoSholpo extends Common {
    public GolpoSholpo(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
    //Locators
    //Actions
}
