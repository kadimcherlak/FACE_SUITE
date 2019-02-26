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

        When("My Details page should be displayed", () -> {
            context.loginAndHome.checkEmpMyDetailsPageDisplayed();
        });

        When("user clicks on Edit button on top right side", () -> {
            context.employeeEditMyDetails.clickMyDetailsEdit();
        });

        When("Edit My Details: Contact Information page should be displayed", () -> {
            context.loginAndHome.checkEmpMyDetailsContactInfoPageDisplayed();
        });

        When("user clicks on Add icon in the Address section", () -> {
            context.employeeEditMyDetails.clickAddressAdd();
        });

        When("user Enter Details in Address fields", () -> {
            context.employeeEditMyDetails.fillAlternateWorklocationAddress();
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

    }

}