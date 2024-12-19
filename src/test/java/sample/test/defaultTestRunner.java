package sample.test;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // JUnit runner
@CucumberOptions(
    features = "src/test/features", // Path to the feature files
    glue = "src/main/java", // Package where step definitions are located
    plugin = {
        "pretty", // Output the execution results in a human-readable format
        "html:target/cucumber-reports/html-report", // Generate an HTML report
        "json:target/cucumber-reports/cucumber.json", // Generate a JSON report
        "junit:target/cucumber-reports/cucumber.xml" // Generate a JUnit-style XML report
    },
    tags = "@smoke", // Only run scenarios with this tag
    monochrome = true, // Makes the console output more readable (true/false)
    dryRun = false // Check if all steps have corresponding step definitions without executing the tests
)
public class defaultTestRunner {
    // No code needed here, this class is simply used to configure and run the Cucumber tests
}