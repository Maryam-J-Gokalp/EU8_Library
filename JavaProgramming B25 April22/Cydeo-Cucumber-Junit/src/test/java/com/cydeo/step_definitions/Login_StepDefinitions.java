package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters librarian username");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters librarian password");
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User should see the dashboard");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("User enters student username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("User enters student password");
    }

}

//Your steps must be unique
//TheLine Provide by Cucumber is a temporary Line until you implement the code
//InLine13-->WeAreNewLineProvideByCucumber-->throw new io.cucumber.java.PendingException(); When U runTheCode
//SayUNeed toImplementThen once u delete cucumber line is does not give u any more exception
//when write the steps and run it suppose to find the matching execution to implement the steps
//The Login stepDefinition Class must match with User story logIn Features to ExecuteThe() otherwise code fail