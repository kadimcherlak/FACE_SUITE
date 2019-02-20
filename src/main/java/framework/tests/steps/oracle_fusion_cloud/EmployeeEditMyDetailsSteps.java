package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.java8.En;
import framework.tests.pages.oracle_fusion_cloud.EmployeeEditMyDetailsPage;
import framework.tests.pages.oracle_fusion_cloud.HireAnEmployeePage;
import framework.tests.pages.oracle_fusion_cloud.LoginAndHomePage;
import framework.tests.pages.oracle_fusion_cloud.NewPersonPage;
import org.apache.logging.log4j.Logger;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeEditMyDetailsSteps implements En {

    private Logger logger;
    private Data data;
    private LoginAndHomePage loginAndHomePage;
    private NewPersonPage newPersonPage;
    private HireAnEmployeePage hireAnEmployee;
    private EmployeeEditMyDetailsPage employeeEditMyDetailsPage;

    public EmployeeEditMyDetailsSteps(Context context) {
        logger = context.getLogger();
        logger.debug("{} loaded", this.getClass().getName());

        When("user clicks on Personal Information link under About me section", () -> {
            data = context.getData();
            loginAndHomePage = new LoginAndHomePage(context);
            loginAndHomePage.navigateToPersonalInfoMyDetailspage();
        });

        When("My Details page should be displayed", () -> {
            loginAndHomePage.checkEmpMyDetailsPageDisplayed();
        });

        When("user clicks on Edit button on top right side", () -> {
            employeeEditMyDetailsPage.clickMyDetailsEdit();
        });

        When("Edit My Details: Contact Information page should be displayed", () -> {
            loginAndHomePage.checkEmpMyDetailsContactInfoPageDisplayed();
        });

        When("user clicks on Add icon in the Address section", () -> {
            employeeEditMyDetailsPage.clickAddressAdd();
        });

        When("user Enter Details in Address fields", () -> {
            employeeEditMyDetailsPage.fillAlternateWorklocationAddress();
        });

        When("user click on Save and Close button", () -> {
            employeeEditMyDetailsPage.clickSaveAndClose();
        });

        When("user clicks on Contacts icon on the left panel", () -> {
            employeeEditMyDetailsPage.clickContactsIcon();
        });

        When("Edit My Details: Contacts page should be displayed", () -> {
            loginAndHomePage.checkEmpMyDetailsContactPageDisplayed();
        });

        When("user clicks on Add icon in the Contacts section", () -> {
            employeeEditMyDetailsPage.clickContactsAdd();
        });

        When("Add Contact dialog box should be displayed", () -> {
            assertThat(employeeEditMyDetailsPage.checkAddContactDialogBoxDisplayed()).isTrue();
        });

        When("user clicks on Select an existing person radiobutton", () -> {
            employeeEditMyDetailsPage.clickSelectExistPerson();
        });

        When("user clicks on Continue button", () -> {
            employeeEditMyDetailsPage.clickContinueBtn();
        });

        When("user Select value for Relationship as Contact from dropdown", () -> {
            employeeEditMyDetailsPage.selectRelationship();
        });

        When("user enter details in Emergency Contact Name", () -> {
            employeeEditMyDetailsPage.enterEmergencyContactName();
        });

        When("user select Emergency contact check box", () -> {
            employeeEditMyDetailsPage.clickEmergencyContactCheckbox();
        });

    }

}