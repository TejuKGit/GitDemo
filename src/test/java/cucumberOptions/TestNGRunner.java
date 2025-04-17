package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", dryRun=true,
glue="stepDefinitions", monochrome=true,  tags="@RegressionTest or @SmokeTest",
plugin={ "pretty","html:target/cucumber.html" , "json:target/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests
{
	

}

//dryrun= just to compile- not running- it will say where the implementation missing so that we can add and then run
