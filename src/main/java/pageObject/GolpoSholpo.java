package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class GolpoSholpo extends Common {
    public GolpoSholpo() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    //Locators
    //sholpogolpo
    //goto second feature
    @FindBy(id = "ridmik.boitoi:id/rlShortStory")
    WebElement storyCon;

    //  click write sholpo golpo
    @FindBy(id = "ridmik.boitoi:id/viewWriteShortStory")
    WebElement storyWriteViewBtn;

    //click write new story
    @FindBy(id = "ridmik.boitoi:id/fabWriteNewBook")
    WebElement storyNewWriteBtn;


    //-enter
    @FindBy(id = "ridmik.boitoi:id/tvEditBookName")
    WebElement storyBookName;

    //-next
    @FindBy(id = "ridmik.boitoi:id/tvNext")
    WebElement storyNextBtn;

    //image upload
    //-upload
    @FindBy(id = "ridmik.boitoi:id/tvUploadImage")
    WebElement storyCoveruploadBtn;


    //--scroll
    String imgTextSize = "1.41 MB";
    String scrollConId = " com.android.documentsui:id/dir_list";

    //  add new chapter click
    @FindBy(id = "ridmik.boitoi:id/tvAddNewBookOnNoBook")
    WebElement storyChapterAddBtn;

    //enter or start writting
    @FindBy(id = "ridmik.boitoi:id/storyEditorEditText")
    WebElement storyInputText;

    // bold you writting
    @FindBy(id = "ridmik.boitoi:id/storyEditorButtonBold")
    WebElement storyInputBoldBtn;

    //--save
    @FindBy(id = "ridmik.boitoi:id/tvSaveChapter")
    WebElement storySaveBtn;

    //  publish click
    @FindBy(id = "ridmik.boitoi:id/tvButtonThree")
    WebElement storyPublishbyThirdBtn;

    //       click
    //free-
    @FindBy(id = "ridmik.boitoi:id/viewFree")
    WebElement storyViewFreeBtn;
    //--publish click
    @FindBy(id = "ridmik.boitoi:id/tvPublish")
    WebElement storyPublishNow;

    /****************
     * Take All The Necessary Actions
     */

}
