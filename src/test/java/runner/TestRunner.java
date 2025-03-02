package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
            features = "src/test/java/features",
    glue = {"StepDefinitions","Utility"},
    plugin = {"pretty",
            "json:target/cucumber-reports.json",
            "junit:target/cucumber-reports.xml",
            "rerun:target/rerun.txt"}
    )
    public class TestRunner {
}
