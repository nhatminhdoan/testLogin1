package ExampleRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "PageLogin", features = "src/test/resources/features/PageLogin.feature", glue = "ExampleDefinitions",
                 plugin = {})
public class CucumberRunnerTests {

}
