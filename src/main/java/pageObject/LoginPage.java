package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }

    /**************
     * Locators
     */
    @FindBy(id = "ridmik.boitoi:id/btnLogin")
    WebElement phoneLogin;
    @FindBy(id = "ridmik.boitoi:id/tvYes")
    WebElement yesBtn;
    @FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    WebElement allowPermission;
    @FindBy(id = "com.google.android.gms:id/credential_picker_options")
    WebElement selectNumber;
    @FindBy(id = "ridmik.boitoi:id/next")
    WebElement nextSigninbtn;
    @FindBy(id = "ridmik.boitoi:id/firstNameEditText")
    WebElement firstName;
    @FindBy(id = "ridmik.boitoi:id/lastNameEditText")
    WebElement lastName;
    @FindBy(id = "ridmik.boitoi:id/someOption")
    WebElement skipBtn;
    /**************
     * Actions
     */
    //configure for log in
    public void setPhoneLogin(){
        phoneLogin.click();
        yesBtn.click();
        allowPermission.click();
    }
    //login with phone number
    public void loginWithPhone(){
        selectNumber.click();
    }
    //click on sign in
    public void clickLogin() throws InterruptedException{
        nextSigninbtn.click();
        Thread.sleep(3000);
    }
    //click on verify button
    public void verify() {
        nextSigninbtn.click();
    }
    //do settings for personal information
    public void settingUp() throws InterruptedException{
        firstName.sendKeys("Mahmudur");
        lastName.sendKeys("Rahman");
        nextSigninbtn.click();
        skipBtn.click();
        Thread.sleep(3000);
    }
}
