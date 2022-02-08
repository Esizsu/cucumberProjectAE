package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//This is used for more readable reports or outputs--consolda güzel cikti
                "html:target/default-cucumber-reports.html",//Use this reports--we will mostly use this one
                "json:target/json-reports/cucumber.json",//firefox ile guzel calisiyor
                "junit:target/xml-report/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", // pdf ve sparkreport olusturmak icin
//                for rerun
                "rerun:target/failedRerun.txt"
//                sadece fail olan scenario ları .txt dosyasına yazar. target folder in altina ekler
//                bunun için yeni bir class ekledik.. FailedScenarioRunner
        },
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@register_user",
        dryRun = false  // dry-run is used to checks if any step missing in step definition.
)
public class Runner {
}

/*
 * -dryRun : to check if there's any missing step definition (JAVA code)
 *         : dryRun can be TRUE or FALSE
 *         : dryRun = false --> default behaviour, it runs the test on the browser while checking the missing steps
 *         : dryRun = true --> don't run tests on the browser and checks if there's any missing step definition

 */
