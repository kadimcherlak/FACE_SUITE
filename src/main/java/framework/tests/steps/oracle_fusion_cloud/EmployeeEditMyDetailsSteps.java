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
            context.employeeEditMyDetails.fillAlternateWorklocationAddress();
        });

        When("user click on submit button in Contact Information page", () -> {
            context.employeeEditMyDetails.clickContactSubmit();
        });

        When("Alternate Work location address should be displayed", () -> {
            context.employeeEditMyDetails.checkAlternateWorkLocationAddressDisplayed();
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

        And("user clicks Manage Salary option from task icon menu", () -> {
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

        When("^user clicks on Submit button in Manage Salary Review page$", () -> {
            context.employeeEditMyDetails.clickSubmitButtonInReviewPage();
        });

        And("^user clicks Yes button on popup modal$", () -> {
            context.employeeEditMyDetails.clickYesOnPopup();
        });

        And("^user clicks Ok button confirmation popup modal$", () -> {
            context.employeeEditMyDetails.clickOKOnPopup();
        });

        When("^user selects US Hourly Wages (\\d+) hours from Salary Basis$", (Integer arg0) -> {
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

        When("user clicks on Edit\\(Pencil Symbol) in the Address section", () -> {
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

    }

}