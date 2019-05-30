package co.com.ejemplo.gradle.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/ejemplo.feature", glue = "co.com.ejemplo.gradle.step_definitions")


public class GoogleRunner {

}
