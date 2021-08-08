package testRunnerPackage;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 
features = {"src/test/resources/FeatureFile"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/report/report.html"},
tags = {"@Regression"},
glue = {"stepDefinationPackage"},
dryRun = false,
monochrome = false)

public class TestRunner {

}
