package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
    /***********
     * Locators
     */
    @FindBy(id = "ridmik.boitoi:id/nextButton")
    WebElement nextbtn;
    @FindBy(id = "ridmik.boitoi:id/rlProfile")
    WebElement profile;

    /*********************
     * Actions
     */
    //next btn
    public void entry(){
        nextbtn.click();
        nextbtn.click();
        nextbtn.click();
        nextbtn.click();
        nextbtn.click();

    }
    //enter profile page
    public void goProfile(){
        profile.click();
    }


}
