package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		glue = "StepDefinaiton",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:output"}
		)

public class Testrun {
}
