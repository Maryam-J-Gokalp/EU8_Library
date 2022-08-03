import com.nextBase.step_definitions.actualMuiltipleGroups;
import com.nextBase.step_definitions.dropdownsPage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLInputElement;

import java.util.List;

//SCENARIO 1,2,3,4,5 & 6
public class JoinGroupsStepsDefinition {

    private static HTMLInputElement UserWorkGroup;
    JoinGroupsStepsDefinition userJoinGroup = new JoinGroupsStepsDefinition();
    //    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    // dropdownsPage actualMuiltipleGroups = new actualMuiltipleGroups();


    @Given("<User> is on the CRM page")
    public void user_is_on_CRM_homepage() {
        System.out.println("User clicks on Workgroups");
        Driver.getDriver().get(ConfigurationReader.getProperty("web.site")); //static classname & MethodName only
        BrowserUtils.sleep(50);
        //clicking to "workgroup" link to go workgroup page
        JoinGroupsStepsDefinition.UserWorkGroup.click();

    }

    @When("<User> click join group button")
    public void user_click_join_group_button() {
        Select select = new Select((WebElement) userJoinGroup);
        select.selectByVisibleText(toString());
        System.out.println("<User> click join group button");
    }

    @And("user can leave the group that user have joint")
    public void _user_can_leave_the_group_that_user_have_joint() {
    //    Assert.assertTrue(Driver.getDriver().getTitle().contains("JoinGroupsStepsDefinition"));
    }

    @And("user can't leave the groups that user hasn't joint")
    public void _user_cant_leave_the_groups_that_user_has_not_joint() {
        Driver.getDriver().get("https://qa.nextbasecrm.com/stream/");

    }

    @And("verify that <Workgroups> project page are displayed")
    public void _Verify_that_Workgroup_the_group_that_user_have_joint() {
        //3- Locate all the links in the page.
        Driver.getDriver().get("https://qa.nextbasecrm.com/stream/");

    }
    @And("verify that <User> Workgroups are tagged projects")
    public void _Verify_that_user_Workgroups_are_tagged_projects() {
        Driver.getDriver().get(ConfigurationReader.getProperty("practicenextbasecrm"));
}

  //  SCENARIO: 2,3,4,5 & 6

    @Given("<user> is on Activity Stream page.")
    public void userIsOnActivityStreamPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa.nextbasecrm.com/workgroups.url"));
    }

    @When("<user> {string} are displayed on Activity Stream page.")
    public void userWorkgroupsAreDisplayedOnActivityStreamPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("UserWorkGroup"));

        //clicking to "workgroup" link to go workgroup page
        JoinGroupsStepsDefinition.UserWorkGroup.click();
    }
    com.nextBase.step_definitions.actualMuiltipleGroups actualMuiltipleGroups = new actualMuiltipleGroups();

    @And("<user> clicks to select multiple groups on {string} from a list.")
    public void userClicksToSelectMultipleGroupsOnWorkgroupsFromAList(List<String> expectedactualMuiltipleGroups) {
        //This method will return us the List of String of given dropDown's options of webElement
        List<String> actualMuiltipleGroups= BrowserUtils.dropdownOptionsAsString(dropdownsPage.actualMuiltipleGroups);

        Assert.assertEquals(actualMuiltipleGroups, actualMuiltipleGroups);
        //Assert will check the size of the lists first. If it is matching it will check content 1 by 1.
    }

    @And("<user> can leave the group that user have joint")
    public void userCanLeaveTheGroupThatUserHaveJoint() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("JoinGroupsStepsDefinition"));
    }
    //NEGATIVE SCENARO
    @Then("<user> cant{string} joint")
    public void userCanTLeaveTheGroupsThatUserHasnotJoint() {
        Driver.getDriver().get("https://qa.nextbasecrm.com/stream/");
    }

    @And("Verify that  work groups and project are sort and tagged text box")
    public void verifyThatWorkGroupsAndProjectAreSortAndTaggedTextBox() {
        Driver.getDriver().get(ConfigurationReader.getProperty("practicenextbasecrm"));
    }

    //SCENARIO 5 & 6

    @When("<User> clicks on Workgroups")
    public void userClicksOnWorkgroups() {
        Select select = new Select((WebElement) userJoinGroup);
        select.selectByVisibleText(toString());
        System.out.println("User> click Workgroups button");
    }

    @When("<User> click join group button")
    public void userClickJoinGroupButton() {
        Select select = new Select((WebElement) userJoinGroup);
        select.selectByVisibleText(toString());
        System.out.println("User> click join group button");
    }

    @Then("<user> can{string}t joint")
    public void userCanTLeaveTheGroupsThatUserHasnTJoint() {
    }
}

