package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import framework.tests.pages.oracle_fusion_cloud.ChangeManagerPage;
import framework.tests.pages.oracle_fusion_cloud.HireAnEmployeePage;
import framework.tests.pages.oracle_fusion_cloud.LoginAndHomePage;
import framework.tests.pages.oracle_fusion_cloud.NewPersonPage;

import org.apache.logging.log4j.Logger;

import static org.assertj.core.api.Assertions.assertThat;

public class ChangeManagerSteps implements En {

    private Logger logger;
    private Data data;
    private LoginAndHomePage loginAndHomePage;
    private NewPersonPage newPersonPage;
    private ChangeManagerPage changeManager;

    public ChangeManagerSteps(Context context) {
        logger = context.getLogger();
        logger.debug("{} loaded", this.getClass().getName());

        /*Given("^user runs (.*?)$", (String testCaseKey) -> {
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
        });*/

        When("My Team page should be displayed", () -> {
            loginAndHomePage.navigatorScreenNewPersonSelect();
        });

        When("user clicks on the Actions icon of the Employee", () -> {
            newPersonPage = new NewPersonPage(context);
            newPersonPage.clickTaskButton();
            newPersonPage.clickHireAnEmployee();
        });

        Then("user navigates to Personal and Employement", () -> {
        	changeManager = new ChangeManagerPage(context);
            assertThat(changeManager.checkHireAnEmployeePageAvailable()).isTrue();
        });

        When("user clicks on Change Manager option", () -> {
        	changeManager.fillIdentificationTab();
        });

        When("user enter details in Change Manager tab", () -> {
        	changeManager.fillPersonInformationTab();
        });

        When("user clicks on Review button", () -> {
        	changeManager.fillEmploymentInformationTab();
        });

        When("the current value and proposed values are displayed correctly in Review Page", () -> {
        	changeManager.fillCompensationAndOtherInformationTab();
        });

        /*When("user clicks on submit button", () -> {
        	changeManager.clickSubmitButton();
        });*/

        When("The transaction should be saved properly and My Team page should be displayed", () -> {
        	changeManager.clickOk();
        });

       /*Then("user click on Sign Out option", () -> {
            // Write code here that turns the phrase above into concrete actions
            loginAndHomePage.signOut();
        });

        Then("Sign out should be successful", () -> {
            // Write code here that turns the phrase above into concrete actions
            loginAndHomePage.signOutConfirm();
            assertThat(loginAndHomePage.checkLoginPageAvailable()).isTrue();
        });*/

    }

}