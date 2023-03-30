package Runners;

import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;


@CucumberOptions(
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
        },
        features = "src\\test\\resources\\features\\ebebek.feature",
        glue = "Steps",
        dryRun = false,
        tags = "@SmokeTest"
)

public class SmokeTest extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void afterClass() {
        Reporter.loadXMLConfig("src/main/java/XMLFiles/extendReportSet.xml");

        Reporter.setSystemInfo("Intern: ", "gngr");
        Reporter.setSystemInfo("App Name: ", "Ebebek test");
        Reporter.setSystemInfo("Operating System Info: ", System.getProperty("os.name"));
        Reporter.setTestRunnerOutput("Test execution Cucumber report");
    }
}
