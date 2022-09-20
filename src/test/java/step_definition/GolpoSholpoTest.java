package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import pageObject.GolpoSholpo;
import pageObject.HomePage;

public class GolpoSholpoTest {
    //Instances
    HomePage homePage =new HomePage();
    GolpoSholpo golpoSholpo =new GolpoSholpo();

    /***************
     * Actions
     */
    @Given("^Shihab goes to Story$")
    public void test_step_1(){
        homePage.entry();
        golpoSholpo.gotoStory();
    }
    @And("^Shihab moves towards to write a story$")
    public void test_step_2(){
        golpoSholpo.gotowriteStory();
    }
    @And("^Shihab gives a name for his story$")
    public void test_step_3(){
        golpoSholpo.writeStoryName();
    }
    @And("^Shihab upload image for book's cover$")
    public void test_step_4(){
        golpoSholpo.imageUpload();
    }
    @When("^Shihab uploaded image he starts writing story$")
    public void test_step_5(){
        golpoSholpo.writeStoryBody();
    }
    @And("^Shihab saves his story$")
    public void test_step_6(){
        golpoSholpo.saveStory();
    }
    @Then("^Shihab publish his story as free for all$")
    public void test_step_7(){
        golpoSholpo.viewStoryforFree();
    }
}
