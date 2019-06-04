package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Casestudy\\case2.feature",glue= {"StepDef"},plugin= {"html:target/case2.html"})
public class Runner1 {

}
