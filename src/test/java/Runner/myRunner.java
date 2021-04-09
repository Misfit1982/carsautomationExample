package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/P2803481/Desktop/carsTestE2E/src/test/resources/Features/TestScenario.feature", 
	glue = {"StepDefinition"})
public class myRunner {

}
