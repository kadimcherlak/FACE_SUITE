package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.java8.En;
import org.apache.logging.log4j.Logger;


public class TalentAcquisitionNewHireSteps implements En {

    private Logger logger;
    private Data data;

    public TalentAcquisitionNewHireSteps(Context context) {
        logger = context.getLogger();
        logger.debug("{} loaded", this.getClass().getName());

        When("user clicks on (.*?) link in Navigator Pane$", (String linkName) -> {
            context.loginAndHome.selectLinkInNavigatorPane(linkName);
        });

        When("user clicks on (.*?) on right side of the page under Tasks pane", (String linkName) -> {
            context.newPerson.clickTaskButton();
            context.newPerson.clickLinkElementInTaskPane(linkName);
        });

        Then("new Hire an employee screen should be displayed", () -> {
            context.hireAnEmployee.checkIdentificationTabAvailable();
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

        Then("Person Management: Search screen should be displayed", () -> {
            context.personManagment.checkPersonManagementSearchAvailable();
        });

        Then("user enter the Person number generated from previous step in Person Number field", () -> {
            context.personManagment.searchPerson();
        });

        Then("user click on Search button till person displayed", () -> {
            context.personManagment.clickSearchTillPersonDisplayed();
        });

        Then("user click on Search button to verify is person is not available in system", () -> {
            context.personManagment.clickSearchPersonNotDisplayed();
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

        When("Person Management screen should be displayed", () -> {
            context.personManagment.checkPersonManagementScreenAvailable();
        });

        When("Manage Work Relationship screen should be displayed", () -> {
            context.personManagment.checkManageWorkRelationshipDisplayed();
        });

        When("user click on Actions button and select Edit option", () -> {
            context.personManagment.clickActionAndEdit();
        });

        When("user clicks on Edit button and select Update option", () -> {
            context.personManagment.clickEditUpdate();
        });

        When("user clicks on Edit button and select Update option in Manage Person", () -> {
            context.personManagment.clickEditUpdateinManagePerson();
        });

        When("Edit Work Relationship screen should be displayed", () -> {
            context.personManagment.checkEditManageWorkRelationshipDisplayed();
        });

        When("user select Ready to verify value from I-9 Status", () -> {
            context.personManagment.selectI9Status();
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
            //context.personManagment.navigateToEmpInfoPage();
            context.hireAnEmployee.checkIdentificationTabAvailable();
            //context.hireAnEmployee.checkAndUpdateLegalEmployerIfEmpty();
            context.hireAnEmployee.clickNextButton();

            context.hireAnEmployee.checkPersonInformationTabAvailable();
            context.hireAnEmployee.clickNextButton();
        });

        When("user clicks on Manage Element Entries link under Payroll section", () -> {
            context.personManagment.clickPayrollOption();
            context.personManagment.manageElementEntriesClick();
        });

        Then("manage element entries screen should be displayed", () -> {
            context.personManagment.checkManageElementEntriesAvailable();
        });

        Then("user clicks on Add button", () -> {
            context.hireAnEmployee.clickCreateButton();
        });

        Then("user clicks on Delete button", () -> {
            context.personManagment.clickDeleteButton();
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

        Then("Manage Element entries page should be displayed with ADP Auto & Home row deleted", () -> {
            context.personManagment.adpRowDeleted();
        });

        When("user clicks on Edit and select Correct option", () -> {
            context.personManagment.clickEditCorrect();
        });

        Then("Correct Employment page should be displayed", () -> {
            context.personManagment.checkCorrectEmployementWindowDisplayed();
        });

        When("user Enter all the Mandatory fields of Correct Employment window and click Ok button", () -> {
            context.personManagment.enterCorrectEmploymentMandatoryFields();
        });

        When("user Enter all the Mandatory fields of Correct Name window and click Ok button", () -> {
            context.personManagment.enterCorrectNameMandatoryFields();
        });

        Then("Projected End Date field Should be Editable", () -> {
            context.personManagment.checkProjectedEndDateEditable();
        });

        When("User enters Projected End Date", () -> {
            context.personManagment.fillProjectedEndDate();
        });

        And("User Clicks on Review Button", () -> {
            context.personManagment.clickReviewButton();
        });

        When("user click on Done button at the top", () -> {
            context.personManagment.clickDoneButton();
        });

        When("Enter the seniority date under Legal Employer and under Enterprise", () -> {
            context.personManagment.enterHireDate();
        });
        And("^user clicks on Delete option$", () -> {
            context.personManagment.clickDeleteButton();
        });
        When("^user selects the element entry to be deleted$", () -> {
            context.personManagment.selectElementEntry();
        });

        Then("Mange Person page should be displayed", () -> {
            context.personManagment.checkManagePersonAvailable();
        });

        Then("Correct Name page should be displayed", () -> {
            context.personManagment.checkCorrectNameWindowDisplayed();
        });
        Then("Pending Workers grid should be displayed", () -> {
            context.hireAnEmployee.checkPendingWorkerGridDisplayed();
        });

        Then("user search Pending worker Person number generated from previous step", () -> {
            context.hireAnEmployee.searchPendingWorker();
        });

        When("user select Pending worker and click Convert under Actions Menu", () -> {
            context.hireAnEmployee.selectConvertPendingWorker();
        });
        When("user select Pending worker and click Quick Convert under Actions Menu", () -> {
            context.hireAnEmployee.selectQuickConvertPendingWorker();
        });

        When("confirmation popup box is displayed", () -> {
            context.hireAnEmployee.confirmationPopupDisplay();
        });


        Then("Convert Pending Worker: Identification page should be displayed", () -> {
            context.hireAnEmployee.checkPendingWorkerIdentificationPageDisplayed();
        });

        When("user validates details in Identification tab", () -> {
            context.hireAnEmployee.validateIdentificationTab();
        });

        When("user validates details in Person Information tab", () -> {
            context.hireAnEmployee.validatePersonInformationTab();
        });

        When("user validates details in Person Profile tab", () -> {
            context.hireAnEmployee.validatePersonProfileTab();
        });

        When("user validates details in Employment Information tab", () -> {
            context.hireAnEmployee.validateEmploymentInformationTab();
        });

        When("user validates details in Compensation and Other Information tab", () -> {
            context.hireAnEmployee.validateCompensationInformationTab();
        });

        Then("user checks if the pending worker is not displayed in Pending Workers grid", () -> {
            context.hireAnEmployee.checkPendingWorkerDetailNotDisplayed();
        });

        Then("user enter contingent worker details in Identification tab", () -> {
            context.hireAnEmployee.fillContingentWorkerIdentificationTab();
        });

        Then("user enter terminated employee details in Identification tab", () -> {
            context.hireAnEmployee.fillTerminatedEmpIdentificationTab();
        });

        Then("Matching Person Records should be displayed", () -> {
            context.hireAnEmployee.matchingPersonRecordDisplayed();
        });

        Then("user clicks on Select Person button", () -> {
            context.hireAnEmployee.clickSelectPersonButton();
        });

        Then("Warning message should be displayed", () -> {
            context.hireAnEmployee.warningMessageDisplayed();
        });

        Then("Identification tab should be displayed", () -> {
            context.hireAnEmployee.checkIdentificationTabAvailable();
        });

        Then("user clicks next button in identification tab", () -> {
            context.hireAnEmployee.clickNextButton();
        });

        Then("user clicks next button in Person information tab", () -> {
            context.hireAnEmployee.clickNextButton();
        });

        Then("user clicks next button in Employment Information tab", () -> {
            context.hireAnEmployee.clickNextButton();
        });

        Then("user clicks next button in Compensation and Other Information tab", () -> {
            context.hireAnEmployee.clickNextButton();
        });

        Then("user clicks on OK button in Warning popup", () -> {
            context.hireAnEmployee.clickWarningOkButton();
        });

        Then("user clicks on OK button to create new new work relationship", () -> {
            context.hireAnEmployee.clickOkBtn();
        });
        Then("user clicks on Continue button for Hire", () -> {
            context.hireAnEmployee.clickContinueButton();
        });

        Then("user enter details in When and Why section", () -> {
            context.hireAnEmployee.enterWhenWhySectionDetails();
        });

        Then("user enter details in Personal Details section", () -> {
            context.hireAnEmployee.enterPersonalSectionDetails();
        });

        Then("user enter details in Communication Info section", () -> {
            context.hireAnEmployee.enterCommunicationSectionDetails();
        });

        Then("user enter details in Addresses section", () -> {
            context.hireAnEmployee.enterAddressesSectionDetails();
        });

        Then("user enter details in Legislative Info section", () -> {
            context.hireAnEmployee.enterLegislativeInfoSectionDetails();
        });

        Then("user enter details in Passport Info section", () -> {
            context.hireAnEmployee.enterPassportInfoSectionDetails();
        });

        Then("user enter details in Citizenship Info section", () -> {
            context.hireAnEmployee.enterCitizenshipInfoSectionDetails();
        });

        Then("user enter details in Driver's Licenses section", () -> {
            context.hireAnEmployee.enterDriversLicensesSectionDetails();
        });

        Then("user enter details in Visas and Permits section", () -> {
            context.hireAnEmployee.enterVisasSectionDetails();
        });

        Then("user enter details in Family and Emergency Contacts section", () -> {
            context.hireAnEmployee.enterFamilyEmergencyContactsSectionDetails();
        });

        Then("user enter details in Employment Details section", () -> {
            context.hireAnEmployee.enterEmploymentSectionDetails();
        });

        Then("user enter details in Managers section", () -> {
            context.hireAnEmployee.enterManagerSectionDetails();
        });

        Then("user enter details in Contract Info section", () -> {
            context.hireAnEmployee.enterContractInfoSectionDetails();
        });

        Then("user enter details in Work Relationship Info section", () -> {
            context.hireAnEmployee.enterWorkRelationshipInfoSectionDetails();
        });

        Then("user enter details in Payroll Details section", () -> {
            context.hireAnEmployee.enterPayrollSectionDetails();
        });

        Then("user enter details in Salary section", () -> {
            context.hireAnEmployee.enterSalarySectionDetails();
        });

        Then("user enter details in Compensation section", () -> {
            context.hireAnEmployee.enterCompensationSectionDetails();
        });

        Then("user enter details in Direct Reports section", () -> {
            context.hireAnEmployee.enterDirectReportsSectionDetails();
        });

        Then("user enter details in Comments and Attachments section", () -> {
            context.hireAnEmployee.enterCommentsAttachmentSectionDetails();
        });

        When("user Enter all the Mandatory fields of Update Name window and click Ok button", () -> {
            context.personManagment.enterUpdateNameMandatoryFields();
        });

        When("user search for the person newly created using Quick Actions", () -> {
            context.personManagment.searchPersonName();
            context.personManagment.clickSearchTillPersonNameDisplayed();

        });
    }

}