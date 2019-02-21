package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.java8.En;
import org.apache.logging.log4j.Logger;


public class TalentAcquisitionNewHireSteps implements En {

    private Logger logger;
    private Data data;

    public TalentAcquisitionNewHireSteps(Context context) {
        logger = context.getLogger();
        logger.debug("{} loaded", this.getClass().getName());

        When("user clicks on new person link under My Workforce section", () -> {
            context.loginAndHome.navigatorScreenNewPersonSelect();
        });

        When("user clicks on Hire an employee on right side of the page under Tasks pane", () -> {
            context.newPerson.clickTaskButton();
            context.newPerson.clickHireAnEmployee();
        });

        Then("new Hire an employee screen should be displayed", () -> {
            context.hireAnEmployee.checkHireAnEmployeePageAvailable();
        });

        When("user enter details in Identification tab", () -> {
            context.hireAnEmployee.fillIdentificationTab();
        });

        When("user enter details in Person information tab", () -> {
            context.hireAnEmployee.fillPersonInformationTab();
        });

        When("user enter details in Employment Information tab", () -> {
            context.hireAnEmployee.fillEmploymentInformationTab();
        });

        When("user enter details in Compensation and Other Information tab", () -> {
            context.hireAnEmployee.fillCompensationAndOtherInformationTab();
        });

        Then("Review page should be displayed in view only mode", () -> {
            context.hireAnEmployee.checkReviewTabDisplayedWithInformation();
        });

        When("user clicks on Person Management link under My Workforce section", () -> {
            context.loginAndHome.navigatorPersonManagement();
        });

        Then("Person Management: Search screen should be displayed", () -> {
            context.hireAnEmployee.checkPersonManagementSearchAvailable();
        });

        Then("user enter the Person number generated from previous step in Person Number field", () -> {
            context.hireAnEmployee.searchPerson();
        });

        Then("user click on Search button", () -> {
            context.hireAnEmployee.clickSearch();
        });

        Then("Employee name should be listed in search results", () -> {
            context.hireAnEmployee.validateSearchResult();
        });

        When("user click on Action Button", () -> {
            context.hireAnEmployee.clickActionButton();
        });

        When("user click on employee name link in search results", () -> {
            context.hireAnEmployee.clickPersonNameLink();
        });

        When("user clicks on Edit button and select Update option", () -> {
            context.hireAnEmployee.clickEditUpdate();
        });

        When("Update Employment new window should be displayed", () -> {
            context.hireAnEmployee.checkUpdateEmployementWindowDisplayed();
        });

        When("user enter details in Update Employment Window and click on Ok button", () -> {
            context.hireAnEmployee.fillUpdateEmpWindow();
        });

        When("Global Temporary Assignment page should be displayed", () -> {
            context.hireAnEmployee.checkGlobalAssignmentPageDisplayed();
        });

        When("user navigate to Employment Information page", () -> {
            context.hireAnEmployee.navigateToEmpInfoPage();
        });

        When("user clicks on Manage Element Entries link under Payroll section on right side of the page under Tasks pane", () -> {
            context.hireAnEmployee.clickPayrollOption();
            context.hireAnEmployee.manageElementEntriesClick();
        });

        Then("manage element entries screen should be displayed", () -> {
            context.hireAnEmployee.checkManageElementEntriesAvailable();
        });

        Then("user clicks on Add button", () -> {
            context.hireAnEmployee.clickCreateButton();
        });

        Then("user enter Effective date : System Date and Element Name as Bilingual Indicator", () -> {
            context.hireAnEmployee.fillElementEntryInfo();
        });

        Then("user enter Effective date : System Date and Element Name as ADP Auto & Home", () -> {
            context.hireAnEmployee.fillADPElementEntryInfo();
        });

        Then("user click on continue button", () -> {
            context.hireAnEmployee.clickContinue();
        });

        Then("General Information page should be displayed with Bilingual field populated with Yes", () -> {
            context.hireAnEmployee.bilingualYesDisplay();
        });

        Then("General Information page should be displayed with Actual Amount", () -> {
            context.hireAnEmployee.actualAmountDisplay();
        });

        Then("user enter Actual Amount and Paycheck Date", () -> {
            context.hireAnEmployee.enteractualAmountAndDate();
        });

        Then("user click on Submit button", () -> {
            context.hireAnEmployee.bilingualSubmit();
        });

        Then("user click on Submit button in ADP", () -> {
            context.hireAnEmployee.adpSubmit();
        });

        Then("Manage Element entries page should be displayed with Bilingual Indicator row added", () -> {
            context.hireAnEmployee.bilingualRowAdded();
        });

        Then("Manage Element entries page should be displayed with ADP Auto & Home row added", () -> {
            context.hireAnEmployee.adpRowAdded();
        });

        Then("user click on Done button at the top", () -> {
            context.hireAnEmployee.clickDoneButton();
        });

    }
}