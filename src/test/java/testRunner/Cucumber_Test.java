package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "src/test/java/features/home.feature",
        glue = "step_definition"
)

public class Cucumber_Test extends AbstractTestNGCucumberTests {

}
