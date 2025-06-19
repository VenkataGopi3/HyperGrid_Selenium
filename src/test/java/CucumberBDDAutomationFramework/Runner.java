package CucumberBDDAutomationFramework;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "CucumberBDDAutomationFramework",
    tags = "@LT3",
    plugin = "pretty",
    monochrome = true
            )


    public class Runner extends AbstractTestNGCucumberTests {
    }
