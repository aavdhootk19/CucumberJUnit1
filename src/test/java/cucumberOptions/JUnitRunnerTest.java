package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

/*  In JUnit Only feature files can parallel mode (for one feature file 
 * one browser will open and for another feature file another browser will Open)
 * 
 * 
 * 
 * 
 */




@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features = "src/test/java/features/magneto.feature", glue = "stepDefinations",

dryRun = false,
tags = "@magneto", monochrome = true, plugin = {
		"html:target/cucumber.html", "json:target/cucumber.json",
		"rerun:target/failed_scenarios.txt"
}
)
public class JUnitRunnerTest {

}
