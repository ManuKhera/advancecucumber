package Cucumber.Advance;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/java/features",
		glue = "StepDefination",tags="@RegTest",strict=true, dryRun=true, monochrome=true,
		plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}

