package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.java8.En;
import org.apache.logging.log4j.Logger;

public class EmployeeEditMyDetailsSteps implements En {

    private Logger logger;
    private Data data;

    public EmployeeEditMyDetailsSteps(Context context) {
        logger = context.getLogger();
        logger.debug("{} loaded", this.getClass().getName());

        When("user clicks on (.*?) link under About me section$", (String linkName) -> {
            context.loginAndHome.selectLinkInNavigatorPane(linkName);
        });

        When("Personal Info page should be displayed", () -> {
            context.loginAndHome.checkPersonalInfoPageDisplayed();
        });

        When("Import and Load Data page should be displayed", () -> {
            context.employeeEditMyDetails.checkImportAndLoadDataDisplayed();
        });

        When("user clicks on Import File option", () -> {
            context.employeeEditMyDetails.clickImportFile();
        });


        When("Select File page should be displayed", () -> {
            context.employeeEditMyDetails.checkSelectFilePageDisplayed();
        });

        When("user upload HDL File and click Submit button", () -> {
            context.employeeEditMyDetails.uploadFile();
        });

        When("File should be successfully submitted", () -> {
            context.employeeEditMyDetails.fileSubmit();
        });

        When("Process Id should be generated", () -> {
            context.employeeEditMyDetails.CheckProcessIdGeneration();
        });

        When("user search for the process id generated in search screen", () -> {
            context.employeeEditMyDetails.searchProcessId();
        });

        When("user clicks on Refresh button1 till file is imported and loaded", () -> {
            context.employeeEditMyDetails.clickRefreshBtn1TillFileLoaded();
        });

        When("user clicks on Person Management Link in Navigation pane", () -> {
            context.employeeEditMyDetails.clickPersonManagementLink();
        });


        When("user search for the person newly created from file", () -> {
            context.employeeEditMyDetails.searchNewPerson();
        });

        When("user clicks on Edit button on top right side", () -> {
            context.employeeEditMyDetails.clickMyDetailsEdit();
        });

        When("user clicks on Family and Emergency Contacts section", () -> {
            context.employeeEditMyDetails.clickFamilyandEmergencyContacts();
        });

        When("Family and Emergency Contacts page should be displayed", () -> {
            context.employeeEditMyDetails.checkFamilyandEmergencyContactsPageDisplayed();
        });

        When("user clicks on Add and Create a New Contact option in My Contacts section", () -> {
            context.employeeEditMyDetails.clickAddandNewContact();
        });


        When("New Contact page should be displayed", () -> {
            context.employeeEditMyDetails.checkNewContactPageDisplayed();
        });

        When("user Enter Details in New Contact page", () -> {
            context.employeeEditMyDetails.fillNewContactInfo();
        });


        When("Edit My Details: Contact Information page should be displayed", () -> {
            context.loginAndHome.checkEmpMyDetailsContactInfoPageDisplayed();
        });


        When("user clicks on Add icon in the Address section", () -> {
            context.employeeEditMyDetails.clickAddressAdd();
        });


        When("user click on submit button in New Contact page", () -> {
            context.employeeEditMyDetails.clickEmergencyContactSubmit();
        });

        When("user Enter Details in Address fields", () -> {
            context.employeeEditMyDetails.fillNewAddressType();
        });

        When("user click on submit button in Contact Information page", () -> {
            context.employeeEditMyDetails.clickContactSubmit();
        });

        When("New Mailing address should be displayed", () -> {
            context.employeeEditMyDetails.checkNewMailingAddressDisplayed();
        });

        When("user click on Save and Close button", () -> {
            context.employeeEditMyDetails.clickSaveAndClose();
        });

        When("user clicks on Contacts icon on the left panel", () -> {
            context.employeeEditMyDetails.clickContactsIcon();
        });

        When("Edit My Details: Contacts page should be displayed", () -> {
            context.loginAndHome.checkEmpMyDetailsContactPageDisplayed();
        });

        When("user clicks on Add icon in the Contacts section", () -> {
            context.employeeEditMyDetails.clickContactsAdd();
        });

        When("Add Contact dialog box should be displayed", () -> {
            context.employeeEditMyDetails.checkAddContactDialogBoxDisplayed();
        });

        When("user clicks on Select an existing person radiobutton", () -> {
            context.employeeEditMyDetails.clickSelectExistPerson();
        });

        When("user clicks on Continue button", () -> {
            context.employeeEditMyDetails.clickContinueBtn();
        });

        When("user Select value for Relationship as Contact from dropdown", () -> {
            context.employeeEditMyDetails.selectRelationship();
        });

        When("user enter details in Emergency Contact Name", () -> {
            context.employeeEditMyDetails.enterEmergencyContactName();
        });

        When("user select Emergency contact check box", () -> {
            context.employeeEditMyDetails.clickEmergencyContactCheckbox();
        });

        When("user clicks on More Information icon under name icon", () -> {
            context.employeeEditMyDetails.clickMoreInformationImage();
        });

        Then("A pop up window with employee details should be displayed", () -> {
            context.employeeEditMyDetails.checkMoreInformationPopupDisplayed();
        });

        When("user clicks on Actions \\(v) button", () -> {
            context.employeeEditMyDetails.clickMoreInformationActionButton();
        });


        Then("the values Absences,Compensation,Personal and Employment should be displayed", () -> {
            context.employeeEditMyDetails.validateLinksPresentInMoreInformationPage();
        });


//----

        And("user click on Task Icon on the right side", () -> {
            context.employeeEditMyDetails.taskIconClick();
        });

        And("from task menu user clicks on Manage Salary option", () -> {
            context.employeeEditMyDetails.manageSalaryClick();
        });

        When("user clicks on Action button and select Edit option", () -> {
            context.employeeEditMyDetails.clickActionEdit();
        });

        When("user enters new Salary Amount under Current Salary section", () -> {
            context.employeeEditMyDetails.enterSalaryAmount();
        });


        When("user selects Use salary component checkbox", () -> {
            context.employeeEditMyDetails.checkboxUseSalary();
        });

        Then("Components tab is displayed in Manage Salary", () -> {
            context.employeeEditMyDetails.tabComponentsManageSalary();
        });


        When("user clicks on Add button in Components tab", () -> {
            context.employeeEditMyDetails.clickAddComponent();
        });

        And("^user selects (.*?) from Component dropdown$", (String linkName) -> {
            context.employeeEditMyDetails.selectComponentTypeManageSalary(linkName);
        });

        And("^user enters amount in Amount field in Components tab$", () -> {
            context.employeeEditMyDetails.enterAmountInComponent();
        });

        And("^user clicks on Continue button in Manage Salary tab$", () -> {
            context.employeeEditMyDetails.clickButtonContinueInManageSalary();

        });

        When("^user clicks on Submit button in Review page$", () -> {
            context.employeeEditMyDetails.clickSubmitButtonInReviewPage();
        });

        And("^user clicks Yes button on popup modal$", () -> {
            context.employeeEditMyDetails.clickYesOnPopup();
        });

        And("^user clicks Ok button confirmation popup modal$", () -> {
            context.employeeEditMyDetails.clickOKOnPopup();
        });

        When("^user selects US Hourly Wages hours from Salary Basis$", () -> {
            context.employeeEditMyDetails.selectSalaryBasis();
        });

        Then("^user closes Warning modal by clicking OK button$", () -> {
            context.employeeEditMyDetails.clickBtnOK_WarningModal();

        });

        When("user clicks Manage Personal Payment Methods under Payroll option", () -> {
            context.employeeEditMyDetails.clcikOnManagePersonalPaymentMethod();
        });

        Then("Create Personal Payment Method page should be displayed", () -> {
            context.employeeEditMyDetails.validatePersonalPaymentMethodPage();
        });

        Then("user clicks on + icon", () -> {
            context.employeeEditMyDetails.clickCreateNewPaymentMethodLink();
        });

        Then("Personal Payment Method page should be displayed", () -> {
            context.employeeEditMyDetails.validateCreatePersonalPaymentMethodPage();
        });

        Then("user enter value for Name,Payment Method and Percentage", () -> {
            context.employeeEditMyDetails.enterValuesInCreatePersonalPaymentPage();
        });

        Then("user clicks on + icon under Bank Accounts", () -> {
            context.employeeEditMyDetails.clickCreateNewPaymentMethodLink();
        });

        Then("Create Bank Account page should be displayed", () -> {
            context.employeeEditMyDetails.validateBankAccountCreatePage();
        });

        Then("enter the bank account details", () -> {
            context.employeeEditMyDetails.enterValuesInBankAccountCreatePage();
        });

        Then("user clicks on Submit button", () -> {
            context.employeeEditMyDetails.clickSubmitButton();
        });

        Then("Overview personal payments page will be displayed", () -> {
            context.employeeEditMyDetails.validatePersonalPaymentMethodPage();
        });

        When("user clicks on edit button on top right side of the page", () -> {
            context.employeeEditMyDetails.clickEditButton();
        });

        Then("Contact Information page should be displayed", () -> {
            context.employeeEditMyDetails.validateContactInformationPage();
        });

        Then("user clicks on Contact Information section", () -> {
            context.employeeEditMyDetails.clickContactInformationLink();
        });

        When("user clicks on Edit in the Address section", () -> {
            context.employeeEditMyDetails.clickEditAddressLink();
        });

        When("Verify that the address format is valid", () -> {
            context.employeeEditMyDetails.verifyAddressFormat();
            ;
        });

        When("Click on Cancel button", () -> {
            context.employeeEditMyDetails.clickCancelButton();
        });

        When("Click Yes button", () -> {
            context.employeeEditMyDetails.clickYesButtonInPopUp();
        });
        Then("^My Details page should be displayed$", () -> {
        });
        When("^user clicks on Actions \\(v\\) button$", () -> {
        });
        And("^user clicks on \\+ icon$", () -> {
        });
        And("^user clicks on \\+ icon under Bank Accounts$", () -> {
        });
        When("^user click on Sign Out option$", () -> {
        });
        When("^user clicks on More Information icon 'i'  under name icon$", () -> {
        });
        Then("^A pop up window with employee details should be displayed\\.$", () -> {
        });
        Then("^the values Absence,Payroll,Personal and Employment should be displayed$", () -> {
        });
        And("^user enter value for Name as \"([^\"]*)\"$", (String arg0) -> {
        });
        And("^user enter value from Organization Payment Method dropdown as \"([^\"]*)\"$", (String arg0) -> {
        });
        And("^user enter value for Account Number as \"([^\"]*)\"$", (String arg0) -> {
        });
        And("^user enter value from Account type as \"([^\"]*)\"$", (String arg0) -> {
        });
        And("^user enter value for Routing Number as \"([^\"]*)\"$", (String arg0) -> {
        });
        And("^user enter value for Routing Account Holder$", () -> {
        });
        And("^user clicks on Done button$", () -> {
        });
        Then("^Person Gallery page should be displayed$", () -> {
        });
        When("^user clicks on Edit\\(Pencil Symbol\\) in the Address section$", () -> {
        });
        When("^user clicks on 'Edit' button on top right side of the page$", () -> {
        });
        When("^user clicks on 'Contact Information' section$", () -> {
        });
        Then("^Personal address should be displayed$", () -> {
        });
        And("^user enter value for effective date when address becomes active$", () -> {
        });
        And("^user enter value for Address Line (\\d+)$", (Integer arg0) -> {
        });
        And("^user enter value for Zip Code$", () -> {
        });
        And("^user clicks on Save and Close button$", () -> {
            context.employeeEditMyDetails.clickSaveAndClose();
        });
        When("^user clicks on \"([^\"]*)\" icon in the left side of the page which is available in Edit My Details page$", (String arg0) -> {
        });
        Then("^\"([^\"]*)\" page should be displayed$", (String arg0) -> {
        });
        And("^user clicks on Click on Edit Icon\\(Pencil icon\\)$", () -> {
        });
        Then("^Biographical Information page should be displayed in edit mode$", () -> {
        });
        And("^user enter value for Title$", () -> {
        });
        And("^user enter value for First Name$", () -> {
        });
        And("^user enter value for Last Name$", () -> {
        });
        When("^user clicks on Documents icon which is available in Edit My Details in the left hand side of the page$", () -> {
        });
        When("^user clicks on Edit\\(Pencil Symbol\\) in the License section$", () -> {
        });
        And("^user enters License number$", () -> {
        });
        And("^user clicks on Save button$", () -> {
        });
        Then("^License number is saved$", () -> {
        });
        When("^user clicks on Disability icon on the left panel$", () -> {
        });
        Then("^Disability Information page should be displayed$", () -> {
        });
        And("^user \\+ icon$", () -> {
        });
        Then("^Country Pop up should be displayed$", () -> {
        });
        And("^user selects United States from the dropdown and clicks on Continue button$", () -> {
        });
        And("^user selects Self-Disclosed Disability as \"([^\"]*)\"\\(Radio Button\\)$", (String arg0) -> {
        });
        And("^user enters effective start state$", () -> {
        });
        And("^user clicks on \"([^\"]*)\" Link$", (String arg0) -> {
        });
        Then("^Form CC-(\\d+): Voluntary Self-Identification for Disability page should be displayed$", (Integer arg0) -> {
        });
        When("^user clicks on print icon under Tools Option$", () -> {
        });
        Then("^Print Page should be Displayed and employee should be able to print the Page$", () -> {
        });
        When("^user clicks on download icon under Tools Option$", () -> {
        });
        Then("^user should able to Download Form CC-(\\d+)$", (Integer arg0) -> {
        });
        Then("^The disability information page should be displayed$", () -> {
        });

        When("^user clicks on Personal Details link in Person Info page$", () -> {
            context.employeeEditMyDetails.clickPersonalDetailsLink();

        });

        Then("^Personal Details page should be displayed$", () -> {
            context.employeeEditMyDetails.checkPersonalDetailPageDisplayed();
        });

        And("^user clicks on ellipsis on Employee Logo name$", () -> {
            context.employeeEditMyDetails.clickEllipsisOnLogo();
        });

        Then("^users More option menu is displayed$", () -> {
            context.employeeEditMyDetails.checkMoreOptionMenuDisplayed();
        });

        And("^user clicks Update Photo link to upload photo$", () -> {
            context.employeeEditMyDetails.clickUpdatePhotoLink();
        });

        And("^user clicks Skills and Qualifications link$", () -> {
            context.employeeEditMyDetails.clickSkillsAndQualificationsLink();
        });

        Then("^Photo upload page should be displayed$", () -> {
            context.employeeEditMyDetails.checkPhotPageDisplayed();
        });

        Then("^Skills and Qualifications page should be displayed$", () -> {
            context.employeeEditMyDetails.checkSkillsAndQualificationsPageDisplayed();
        });

        Then("^edit Skills and Qualifications page should be displayed$", () -> {
            context.employeeEditMyDetails.checkEditSkillsAndQualificationsPageDisplayed();
        });

        Then("^user clicks on Add Content and select Degrees Link$", () -> {
            context.employeeEditMyDetails.clickAddContentDegree();
        });

        Then("^user clicks on Add Content and select Licenses and Certifications Link$", () -> {
            context.employeeEditMyDetails.clickAddContentLicense();
        });

        Then("^Degrees page should be displayed$", () -> {
            context.employeeEditMyDetails.checkDegreePageDisplayed();
        });

        Then("^Licenses and Certifications page should be displayed$", () -> {
            context.employeeEditMyDetails.checkLicensesAndCertificationsPageDisplayed();
        });

        Then("^user enter Degree details$", () -> {
            context.employeeEditMyDetails.enterDegreeDetails();
        });

        Then("^user enter Licenses and Certifications details$", () -> {
            context.employeeEditMyDetails.enterLicensesAndCertificationsDetails();
        });

        Then("^user clicks on Submit button in edit Skills and Qualifications page$", () -> {
            context.employeeEditMyDetails.clickSkillsSubmitButton();
        });

        When("^user clicks on Choose File button to upload a photo$", () -> {
            context.employeeEditMyDetails.choosePhotoToUpload();
        });

        Then("^user selected photo is uploaded to system$", () -> {
            context.employeeEditMyDetails.checkUserPhotoUploaded();
        });
        When("^user enters details in Update Employment Window and click on Ok button$", () -> {

            context.employeeEditMyDetails.fillUpdateEmpWindow_PersonMgmt();
        });
        And("^user selects Assignment Status as (.*?)$", (String value) -> {
            context.employeeEditMyDetails.selectAssignmentStatus(value);
        });
        When("^user clicks on Review button in Management Employment page$", () -> {
            context.employeeEditMyDetails.clickReviewButton();

        });

        Then("validate user is able to view work phone, work email and home address", () -> {
            context.employeeEditMyDetails.validatePhoneEmailAndAddressIsDisplayed();
        });

        When("click on back button", () -> {
            context.employeeEditMyDetails.clickOnBackButton();
        });

        When("user clicks on Personal Details link under Personal Info", () -> {
            context.employeeEditMyDetails.clickPersonalDetailsLink();
        });

        Then("validate Biographical Information are displayed", () -> {
            context.employeeEditMyDetails.validateBiographicalInfoIsDisplayed();
        });

        Then("user clicks on Document Records link under Personal Info", () -> {
            context.employeeEditMyDetails.clickDocumentRecordsLink();
        });

    }

}