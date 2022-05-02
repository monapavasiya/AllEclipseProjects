package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/BackgroudDemo/BackgroudDemo.feature",
glue= {"SteosForBackgroud"},
monochrome = true,
plugin ={"pretty","html:target/HtmlReports"}
//plugin ={"pretty","json:target/JSONReports/reports.json"}
//plugin ={"pretty","junit:target/JUnitReports/reports.xml","json:target/JSONReports/reports.json","html:target/HtmlReports"}

)

public class TestRunnerForBackgroundDemo
{

}