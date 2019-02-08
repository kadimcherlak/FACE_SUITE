package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import framework.tests.pages.oracle_fusion_cloud.HireAnEmployeePage;
import framework.tests.pages.oracle_fusion_cloud.LoginAndHomePage;
import framework.tests.pages.oracle_fusion_cloud.NewPersonPage;

import org.apache.logging.log4j.Logger;

import static org.assertj.core.api.Assertions.assertThat;

public class TalentAcquisitionNewHireSteps implements En {

    private Logger logger;
    private Data data;
    private LoginAndHomePage loginAndHomePage;
    private NewPersonPage newPersonPage;
    private HireAnEmployeePage hireAnEmployee;

    public TalentAcquisitionNewHireSteps(Context context) {
        logger = context.getLogger();
        logger.debug("{} loaded", this.getClass().getName());

        Given("^user runs (.*?)$", (String testCaseKey) -> {
            context.setData(testCaseKey);
            data = context.getData();
            loginAndHomePage = new LoginAndHomePage(context);
        });

        And("^user is on the oracle fusion login page$", () -> {
            loginAndHomePage.openUrl();
            assertThat(loginAndHomePage.checkLoginPageAvailable()).isTrue();
        });

        And("^user provides credentials for login$", () -> {
            loginAndHomePage.enterCredentials();
        });

        When("^the user click on Sign In$", () -> {
            loginAndHomePage.signIn();
        });

        Then("^the Oracle Fusion Home Page is displayed", () -> {
            assertThat(loginAndHomePage.checkHomePageAvailable()).isTrue();
        });

        Given("user login to Oracle Applications Cloud web page", () -> {
            loginAndHomePage.openUrl();
            assertThat(loginAndHomePage.checkLoginPageAvailable()).isTrue();
            loginAndHomePage.enterCredentials();
            loginAndHomePage.signIn();
            assertThat(loginAndHomePage.checkHomePageAvailable()).isTrue();
        });

        When("user clicks on Navigator icon", () -> {
            loginAndHomePage.navigatorScreen();
        });

        When("user clicks on new person link under My Workforce section", () -> {
            loginAndHomePage.navigatorScreenNewPersonSelect();
        });

        When("user clicks on Hire an employee on right side of the page under Tasks pane", () -> {
            newPersonPage = new NewPersonPage(context);
            newPersonPage.clickTaskButton();
            newPersonPage.clickHireAnEmployee();
        });

        Then("new Hire an employee screen should be displayed", () -> {
            hireAnEmployee = new HireAnEmployeePage(context);
            assertThat(hireAnEmployee.checkHireAnEmployeePageAvailable()).isTrue();
        });

        When("user enter details in Identification tab", () -> {
            hireAnEmployee.fillIdentificationTab();
        });

        When("user enter details in Person information tab", () -> {
            hireAnEmployee.fillPersonInformationTab();
        });

        When("user enter details in Employment Information tab", () -> {
            hireAnEmployee.fillEmploymentInformationTab();
        });

        When("user enter details in Compensation and Other Information tab", () -> {
            hireAnEmployee.fillCompensationAndOtherInformationTab();
        });

        Then("Review page should be displayed in view only mode", () -> {
            hireAnEmployee.checkReviewTabDisplayedWithInformation();
        });

        When("user clicks on submit button", () -> {
            hireAnEmployee.clickSubmitButton();
        });

        When("clicks ok in the Warning and confirmation message displayed", () -> {
            hireAnEmployee.clickOk();
        });

        Then("Page should be submitted successfully", () -> {
            hireAnEmployee.checkSubmitSuccessful();
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
            loginAndHomePage.signOut();
        });

        Then("Sign out should be successful", () -> {
            // Write code here that turns the phrase above into concrete actions
            loginAndHomePage.signOutConfirm();
            assertThat(loginAndHomePage.checkLoginPageAvailable()).isTrue();
        });

    }

}