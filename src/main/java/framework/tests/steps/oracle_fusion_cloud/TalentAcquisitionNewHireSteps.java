package framework.tests.steps.oracle_fusion_cloud;

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
            hireAnEmployee.clickWarningOkButton();
        });

        Then("Page should be submitted successfully", () -> {
            hireAnEmployee.clickConfirmButton();
        });

        When("user clicks on Person Management link under My Workforce section", () -> {
            loginAndHomePage.navigatorPersonManagement();
        });

        Then("Person Management: Search screen should be displayed", () -> {
            assertThat(hireAnEmployee.checkpersonManagementSearchAvailable()).isTrue();
        });

        Then("user enter the Person number generated from previous step in Person Number field", () -> {
            hireAnEmployee.searchPerson();
        });

        Then("user click on Search button", () -> {
            assertThat(hireAnEmployee.clickSearch()).isTrue();

        });

        Then("Employee name should be listed in search results", () -> {
            hireAnEmployee.validateSearchResult();
        });

        When("user click on employee name link", () -> {
            hireAnEmployee.empNameLinkClick();
        });

        When("user click on employee name link in search results", () -> {
            hireAnEmployee.clickPersonNameLink();
        });

        When("user clicks on Edit button and select Update option", () -> {
            hireAnEmployee.clickEditUpdate();
        });

        When("Update Employment new window should be displayed", () -> {
            assertThat(hireAnEmployee.checkUpdateEmployementWindowDisplayed()).isTrue();
        });

        When("user enter details in Update Employment Window and click on Ok button", () -> {
            hireAnEmployee.fillUpdateEmpWindow();
        });

        When("Global Temporary Assignment page should be displayed", () -> {
            hireAnEmployee.checkGlobalAssignmentPageDisplayed();
        });

        When("user navigate to Employment Information page", () -> {
            hireAnEmployee.navigateToEmpInfoPage();
        });

        When("user clicks on Manage Element Entries link under Payroll section on right side of the page under Tasks pane", () -> {
            hireAnEmployee.manageElementEntriesClick();
        });

        Then("manage element entries screen should be displayed", () -> {
            hireAnEmployee.checkManageElementEntriesAvailable();
        });

        Then("user clicks on Add button", () -> {
            hireAnEmployee.clickCreateButton();
        });

        Then("user enter Effective date : System Date and Element Name as Bilingual Indicator", () -> {
            hireAnEmployee.fillElementEntryInfo();
        });

        Then("user enter Effective date : System Date and Element Name as ADP Auto & Home", () -> {
            hireAnEmployee.fillADPElementEntryInfo();
        });

        Then("user click on continue button", () -> {
            hireAnEmployee.clickContinue();
        });

        Then("General Information page should be displayed with Bilingual field populated with Yes", () -> {
            hireAnEmployee.bilingualYesDisplay();
        });

        Then("General Information page should be displayed with Actual Amount", () -> {
            hireAnEmployee.actualAmountDisplay();
        });

        Then("user enter Actual Amount and Paycheck Date", () -> {
            hireAnEmployee.enteractualAmountAndDate();
        });


        Then("user click on Submit button", () -> {
            hireAnEmployee.bilingualSubmit();
        });

        Then("user click on Submit button in ADP", () -> {
            hireAnEmployee.adpSubmit();
        });

        Then("Manage Element entries page should be displayed with Bilingual Indicator row added", () -> {
            hireAnEmployee.bilingualRowAdded();
        });

        Then("Manage Element entries page should be displayed with ADP Auto & Home row added", () -> {
            hireAnEmployee.adpRowAdded();
        });

        Then("user click on Done button at the top", () -> {
            hireAnEmployee.clickDoneButton();
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