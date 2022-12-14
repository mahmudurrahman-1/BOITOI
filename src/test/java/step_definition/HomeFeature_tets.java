package step_definition;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.LoginPage;

public class HomeFeature_tets {
    /*********************
     * Instances
     */
    HomePage home = new HomePage();
    LoginPage login = new LoginPage();
    String freetext = "সেরা ফ্রি বই";

    /*********************
     * Actions
     */

    @Given("^Shihab opens the application$")
    public void test_step_1() {
        home.entry();
    }

    @And("^Shihab goes to profile$")
    public void test_step_2() {

        home.goProfile();

    }

    @And("^Shihab clicks login with phone$")
    public void test_step_3() {
        login.setPhoneLogin();
        login.loginWithPhone();
    }

    @And("^Shihab completes login$")
    public void test_step_4() throws InterruptedException {
        login.clickLogin();
        Thread.sleep(3000);
        login.verify();
        Thread.sleep(3000);
    }

    @And("^Shihab settings up with personal information$")
    public void test_step_5() throws InterruptedException {
        login.settingUp();

    }

    @When("^Shihab selects \"([^\"]*)\" from homepage$")
    public void test_step_6(String text) {
        if (text.equals(freetext)) {
            home.freeContainer();
        }
    }

    @And("^Shihab selects second book from the list$")
    public void test_step_7() {
        home.selectBook();
    }

    @And("^Shihab clicks download for that book$")
    public void test_step_8() throws InterruptedException {
        home.clickDownloadBtn();
    }

    @Then("^Shihab starts reading it$")
    public void test_step_9() {
        home.clickReadbtn();
    }
}
