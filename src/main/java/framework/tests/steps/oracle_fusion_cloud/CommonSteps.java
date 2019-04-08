package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.java8.En;
import org.apache.logging.log4j.Logger;

import static org.junit.Assume.assumeTrue;

public class CommonSteps implements En {

    private Logger logger;
    private Data data;

    public CommonSteps(Context context) {
        logger = context.getLogger();
        logger.debug("{} loaded", this.getClass().getName());

        Given("^user runs (.*?) from (.*?) under (.*?)$", (String testScenario, String testFileName, String testSheetName) -> {
            context.setExcelDataStore(testFileName, testSheetName);
            context.setData(testScenario);
            data = context.getData();
            if (data.getScenarioRunFlag().equalsIgnoreCase("no")) {
                assumeTrue("Skipping this Scenario as not part of execution", false);
            }
            context.setDriver();
            context.setPages(context);
            context.loginAndHome.getCurrentDate();
        });

        And("^user is on the oracle fusion login page$", () -> {
            context.loginAndHome.openUrl();
            context.loginAndHome.checkLoginPageAvailable();
        });

        And("^user provides credentials for login$", () -> {
            context.loginAndHome.enterCredentials();
        });

        When("^the user clicks on Sign In$", () -> {
            context.loginAndHome.signIn();
        });

        Then("^the Oracle Fusion Home Page is displayed", () -> {
            context.loginAndHome.checkHomePageAvailable();
        });

        Then("user waits for few seconds before login", () -> {
            context.loginAndHome.waitNormalTime();
        });

        Given("user login to Oracle Applications Cloud web page", () -> {
            context.loginAndHome.openUrl();
            context.loginAndHome.checkLoginPageAvailable();
            context.loginAndHome.enterCredentials();
            context.loginAndHome.signIn();
            context.loginAndHome.checkHomePageAvailable();
        });

        When("user clicks on Bell icon", () -> {
            context.loginAndHome.clickBellIcon();
        });

        When("user checks for notifications", () -> {
            context.loginAndHome.checkNotification();
        });

        Then("Approved notification should be present", () -> {
            context.loginAndHome.checkApproved();
        });

        When("user clicks on Navigator icon", () -> {
            context.loginAndHome.navigatorScreen();
        });

        When("user clicks on submit button", () -> {
            context.hireAnEmployee.clickSubmitButton();
        });

        When("clicks ok in the Warning and confirmation message displayed", () -> {
            context.hireAnEmployee.clickWarningOkButton();
        });

        Then("Page should be submitted successfully", () -> {
            context.hireAnEmployee.clickConfirmButton();
        });

        Then("new employee details are stored into csv", () -> {
            context.hireAnEmployee.saveEmployeeDetails();
        });

        When("user clicks on Sign Out option", () -> {
            context.loginAndHome.signOut();
        });

        Then("Sign out should be successful", () -> {
            context.loginAndHome.signOutConfirm();
            context.loginAndHome.checkLoginPageAvailable();
        });

        And("^user updated the Excel file with Row Name (.*?) and Column Name (.*?) with value (.*?)$", (String rowName, String colName, String valToUpdate) -> {
            context.loginAndHome.writeToExcel(rowName, colName, valToUpdate);
            context.loginAndHome.csvReader();
            context.loginAndHome.csvWriter(valToUpdate, "firstName lastName");
        });
    }
}