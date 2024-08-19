package CucumberRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/login.feature",
                    "src/test/resources/features/createCourse.feature"},
        glue = "stepDefinitions",
        plugin = {"pretty","html:target/cucumber-reports.html" }

)
public class CucumberTestRunner {
}
