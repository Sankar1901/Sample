package runner.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Shankar\\eclipse-workspace\\"
		+ "Cheapair\\src\\test\\java\\feature\\com",
		glue = "com.app.stepdefinition",
		dryRun = false,
		publish = true,
		monochrome = true
		)
public class Runner {

}
