package stepdef;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Cucumber.class)

@CucumberOptions(
        dryRun = false,
        features = "src/test/java/features.Altoro",
        glue="Altoro.feature",
        plugin = {"json:target/cucumber.json"},
        tags = {"~@ignore","@wp"}
)

public class CucumberRunnerTest{

}
