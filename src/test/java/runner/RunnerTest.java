package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./Features/",
		glue = {"stepDefinition"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/htmlReports"}
		)
public class RunnerTest {
	

}
