package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    /***********
     * Locators
     */
    @FindBy(id = "ridmik.boitoi:id/nextButton")
    WebElement nextbtn;
    @FindBy(id = "ridmik.boitoi:id/rlProfile")
    WebElement profile;
    @FindBy(id = "ridmik.boitoi:id/tvTopFreeTab")
    WebElement freeBtn;
    @FindBy(id = "ridmik.boitoi:id/tvGenericBookName")
    List<WebElement> books;
    @FindBy(id = "ridmik.boitoi:id/viewDownload")
    WebElement downloadBtn;
    @FindBy(id = "ridmik.boitoi:id/clActions")
    WebElement readBtn;

    /*********************
     * Actions
     */
    //next btn
    public void entry() {
        nextbtn.click();
        nextbtn.click();
        nextbtn.click();
        nextbtn.click();
        nextbtn.click();

    }

    //enter profile page
    public void goProfile() {
        profile.click();
    }

    //enter free container
    public void freeContainer() {
        freeBtn.click();
    }

    //clicks second book
    public void selectBook() {
        books.get(1).click();
    }

    //clicks download
    public void clickDownloadBtn() throws InterruptedException {
        downloadBtn.click();
        Thread.sleep(8000);
    }

    //clicks read
    public void clickReadbtn() {
        readBtn.click();
    }


}
