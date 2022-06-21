package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/cydeo/stepDefinitions",
        dryRun = true

)
public class CukesRunner {

}

//Glue Provide The steps definition package location, where The selenium implementation code will be writing
//Open Web False to close--> dryRun = true
// true means that do not run my step definitions but only check if any step is missing snippet.