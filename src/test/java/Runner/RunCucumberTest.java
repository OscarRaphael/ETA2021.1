package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepsDef"},
        plugin = {"pretty", "html:target/cucumber-reports/Cucumber.html"},
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunCucumberTest {
}
