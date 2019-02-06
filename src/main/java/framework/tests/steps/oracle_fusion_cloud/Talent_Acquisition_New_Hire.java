package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import framework.tests.pages.oracle_fusion_cloud.BasePage;
import org.apache.logging.log4j.Logger;

import static org.assertj.core.api.Assertions.assertThat;

public class Talent_Acquisition_New_Hire implements En {

    private Logger logger;
    private Data data;
    private BasePage basePage;

    public Talent_Acquisition_New_Hire(Context context) {
        logger = context.getLogger();
        logger.debug("{} loaded", this.getClass().getName());

        Given("^user runs (.*?)$", (String testCaseKey) -> {
            context.setData(testCaseKey);
            data = context.getData();
        });

        And("^user is on the oracle fusion login page$", () -> {
            basePage = new BasePage(context);
            basePage.goTo();
            assertThat(basePage.checkLoginPageAvailable()).isTrue();
        });

        And("^user provides credentials for login$", () -> {
            basePage.enterCredentials();
        });

        When("^the user click on Sign In$", () -> {
            basePage.signIn();
        });

        Then("^the Oracle Fusion Home Page is displayed", () -> {
            assertThat(basePage.checkHomePageAvailable()).isTrue();
        });

        Given("user login to Oracle Applications Cloud web page", () -> {
            basePage.goTo();
            assertThat(basePage.checkLoginPageAvailable()).isTrue();
            basePage.enterCredentials();
            basePage.signIn();
            assertThat(basePage.checkHomePageAvailable()).isTrue();
        });

        When("user clicks on Navigator icon", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("user clicks on new person link under My Workforce section", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("user clicks on Hire an employee on right side of the page under Tasks pane", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("new Hire an employee screen should be displayed", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("user enter details in Identification tab", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("user enter details in Person information tab", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("user enter details in Employment Information tab", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("user enter details in Compensation and Other Information tab", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("Review page should be displayed in view only mode", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("user clicks on submit button", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("clicks ok in the Warning and confirmation message displayed", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("Page should be submitted successfully", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("user clicks on Person Management link under My Workforce section", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("Person Management: Search screen should be displayed", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("user enter the <Target Employee>\\(Above hired employee number) in Person Number field", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("user click on Search button", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("Employee name should be listed in search results", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("user click on employee name link", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("<Target Employee>: Person Management page should be displayed", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("user clicks on Manage Element Entries link under Payroll section on right side of the page under Tasks pane", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("manage element entries screen should be displayed", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("user clicks on Add button", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("Create Element Entry page should be displayed", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("user enter Effective date : System Date and Element Name as Bilingual Indicator", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("user click on continue button", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("General Information page should be displayed with Bilingual field populated with Yes", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("user click on Submit button", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("Manage Element entries page should be displayed with Bilingual Indicator row added", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("user click on Sign Out option", () -> {
            // Write code here that turns the phrase above into concrete actions
            basePage.signOut();
        });

        Then("Sign out should be successful", () -> {
            // Write code here that turns the phrase above into concrete actions
            basePage.signOutConfirm();
            assertThat(basePage.checkLoginPageAvailable()).isTrue();
        });

    }

}

