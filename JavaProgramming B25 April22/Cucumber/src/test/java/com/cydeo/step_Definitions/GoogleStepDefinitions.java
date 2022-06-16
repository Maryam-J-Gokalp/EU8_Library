package com.cydeo.step_Definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinitions {

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitled = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitled, expectedTitle);

        Driver.closeDriver();

    }


}


//ThisLineTurnMy Story intoAction-->Driver.getDriver().get("https://www.google.com");

//ThisCaseWeJust find the title-->Driver.getDriver().get("https://www.google.com");
//1st Line-->@When turn theLineIntoActionWhen TheLineIs ExecutedGoThrough UtilityClass&OpenTheBrowser
//2rdLine-->@When IsToDoTheAssertionVerifyTheWebPage--> In Line 18, 19 & 21 then Driver.CloseDrive