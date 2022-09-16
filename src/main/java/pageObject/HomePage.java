package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
@FindBy(id = "ridmik.boitoi:id/btnLogin")
WebElement phoneLogin;
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

    //login with phone
    public void setPhoneLogin(){
        phoneLogin.click();
    }
}
