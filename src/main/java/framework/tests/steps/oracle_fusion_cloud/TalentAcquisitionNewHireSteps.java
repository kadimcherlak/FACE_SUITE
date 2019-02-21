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
            context.personManagment.checkPersonManagementSearchAvailable();
        });

        Then("user enter the Person number generated from previous step in Person Number field", () -> {
            context.personManagment.searchPerson();
        });

        Then("user click on Search button", () -> {
            context.personManagment.clickSearch();
        });

        Then("Employee name should be listed in search results", () -> {
            context.personManagment.validateSearchResult();
        });

        When("user click on Action Button", () -> {
            context.personManagment.clickActionButton();
        });

        When("user click on employee name link in search results", () -> {
            context.personManagment.clickPersonNameLink();
        });

        When("user clicks on Edit button and select Update option", () -> {
            context.personManagment.clickEditUpdate();
        });

        Then("Update Employment new window should be displayed", () -> {
            context.personManagment.checkUpdateEmployementWindowDisplayed();
        });

        When("user enter details in Update Employment Window and click on Ok button", () -> {
            context.personManagment.fillUpdateEmpWindow();
        });

        When("Global Temporary Assignment page should be displayed", () -> {
            context.personManagment.checkGlobalAssignmentPageDisplayed();
        });

        When("user navigate to Employment Information page", () -> {
            context.personManagment.navigateToEmpInfoPage();
        });

        When("user clicks on Manage Element Entries link under Payroll section on right side of the page under Tasks pane", () -> {
            context.personManagment.clickPayrollOption();
            context.personManagment.manageElementEntriesClick();
        });

        Then("manage element entries screen should be displayed", () -> {
            context.personManagment.checkManageElementEntriesAvailable();
        });

        Then("user clicks on Add button", () -> {
            context.hireAnEmployee.clickCreateButton();
        });

        Then("user enter Effective date : System Date and Element Name as Bilingual Indicator", () -> {
            context.personManagment.fillElementEntryInfo();
        });

        Then("user enter Effective date : System Date and Element Name as ADP Auto & Home", () -> {
            context.personManagment.fillADPElementEntryInfo();
        });

        Then("user click on continue button", () -> {
            context.personManagment.clickContinue();
        });

        Then("General Information page should be displayed with Bilingual field populated with Yes", () -> {
            context.personManagment.bilingualYesDisplay();
        });

        Then("General Information page should be displayed with Actual Amount", () -> {
            context.personManagment.actualAmountDisplay();
        });

        Then("user enter Actual Amount and Paycheck Date", () -> {
            context.personManagment.enteractualAmountAndDate();
        });

        Then("user click on Submit button", () -> {
            context.personManagment.bilingualSubmit();
        });

        Then("user click on Submit button in ADP", () -> {
            context.personManagment.adpSubmit();
        });

        Then("Manage Element entries page should be displayed with Bilingual Indicator row added", () -> {
            context.personManagment.bilingualRowAdded();
        });

        Then("Manage Element entries page should be displayed with ADP Auto & Home row added", () -> {
            context.personManagment.adpRowAdded();
        });

        When("user click on Done button at the top", () -> {
            context.personManagment.clickDoneButton();
        });

    }
}