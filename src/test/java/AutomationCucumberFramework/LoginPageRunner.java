package AutomationCucumberFramework;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/resources/features",
        glue = "AutomationCucumberFramework",
        tags ="@LT3",
        plugin = "pretty",
        monochrome = true
)
public class LoginPageRunner extends AbstractTestNGCucumberTests {
}
