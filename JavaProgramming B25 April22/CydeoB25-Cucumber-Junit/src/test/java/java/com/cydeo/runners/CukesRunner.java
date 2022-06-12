package java.com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@librarian"

)

public class CukesRunner {
}

// To Pass the Location of Our project provide something
//WhereTheDirectory willBe Storing feature steps--->onTheResources Folder-->inside features folder

