package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue="stepDefinitions",
        tags="@task", //"@Test213 or @Test214"
        dryRun = false //dryRun=true adımlarda eksik varsa onu bildirir, calistirmaz.
)

public class Runners {



}
