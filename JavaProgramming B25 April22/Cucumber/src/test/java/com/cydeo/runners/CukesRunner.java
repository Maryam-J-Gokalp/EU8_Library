package com.cydeo.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitons",
        dryRun = true // true means that do not run my step definitions but only check if any step is missing snippet.


)
public class CukesRunner {

}

//FALSE-->Library&WebDriver getExecuted

//Glue Provide The steps definition package location, where The selenium implementation code will be writing
//Open Web False to close--> dryRun = true
// true means that do not run my step definitions but only check if any step is missing snippet.

// To Pass the Location of Our project inside-->FeatureDirectory folder is where StoreSomeFeatures
//Steps and ISelect Content Roots from Features FolderMustApplyThisSteps--> features = "src/test/resources/features",
//Glue Is Where I Will Be Writing Java Code selenium implementation From
// Step_definitionsFolder-->glue = "com/cydeo/step_definitions",
//WhereTheDirectory willBe Storing feature steps--->onTheResources Folder-->inside features folder

//ToRunEverything InMyFeatureFileExcept Student UCanSay-->tags = "@Regression and not @student"
//ThisWill run everything inFeature file&CheckForOtherCondition &IfHaveStudentTagItWill Exclude

//plugin = {
//Suppose to generate under Target folder when u run and save in TargetFolder