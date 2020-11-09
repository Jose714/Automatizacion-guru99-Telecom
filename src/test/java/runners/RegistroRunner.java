package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "projectFeatures/registro.feature",glue = "stepdefinitions")

public class RegistroRunner {

}
