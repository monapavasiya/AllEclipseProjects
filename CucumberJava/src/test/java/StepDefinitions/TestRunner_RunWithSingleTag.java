package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags",
glue= {"StepDefinitions"},
//tags = {"@smoke"})
//tags = {"@smoke or @regression"})
//tags = {"@smoke and @regression"})
//tags = {"@smoke or @regression and @important"})
//tags = {"(@smoke or @regression) and @important"})
//tags = {" @regression and not @smoke"})
tags = {"@mustRun"})


public class TestRunner_RunWithSingleTag
{

}