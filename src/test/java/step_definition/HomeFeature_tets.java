package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.HomePage;

public class HomeFeature_tets {
    /*********************
     * Instances
     */
HomePage home =new HomePage();
    /*********************
     * Actions
     */

    @Given("^Shihab opens the application$")
    public void test_step_1() {
     home.entry();
    }
    @And("^Shihab goes to profile$")
    public void test_step_2() throws InterruptedException{

        home.goProfile();

    }
    @And("^Shihab clicks login with phone$")
    public void test_step_3(){
        home.setPhoneLogin();
    }
}
