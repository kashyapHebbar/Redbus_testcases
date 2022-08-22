package stepdefinition;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Features" , glue = {"stepdefinition"},

plugin = {"pretty","html:target/HtmlReports", "junit:target/JUnitReports/report.xml",
"json:target/JSONReports/report.json"},
useFileNameCompatibleName=true)

public class TestRunner {

}
