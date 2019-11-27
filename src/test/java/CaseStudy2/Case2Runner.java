package CaseStudy2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"json:src/test/java/CaseStudy2/output/cucreport23.json"})
public class Case2Runner {

}
