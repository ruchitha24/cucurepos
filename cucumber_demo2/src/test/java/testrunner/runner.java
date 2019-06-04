package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:target/cucumber.html-report"},tags={"@SmokeTest","~@sanityTest"},features="feature\\tagsdemo.feature")
public class runner {

}
