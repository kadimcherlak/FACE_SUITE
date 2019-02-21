package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.java8.En;
import org.apache.logging.log4j.Logger;


public class CommonSteps implements En {

    private Logger logger;
    private Data data;

    public CommonSteps(Context context) {
        logger = context.getLogger();
        logger.debug("{} loaded", this.getClass().getName());

        Given("^user runs (.*?)$", (String testCaseKey) -> {
            context.setData(testCaseKey);
            data = context.getData();
            context.setPages(context);
        });

        And("^user is on the oracle fusion login page$", () -> {
            context.loginAndHome.openUrl();
            context.loginAndHome.checkLoginPageAvailable();
        });

        And("^user provides credentials for login$", () -> {
            context.loginAndHome.enterCredentials();
        });

        When("^the user click on Sign In$", () -> {
            context.loginAndHome.signIn();
        });

        Then("^the Oracle Fusion Home Page is displayed", () -> {
            context.loginAndHome.checkHomePageAvailable();
        });

        Given("user login to Oracle Applications Cloud web page", () -> {
            context.loginAndHome.openUrl();
            context.loginAndHome.checkLoginPageAvailable();
            context.loginAndHome.enterCredentials();
            context.loginAndHome.signIn();
            context.loginAndHome.checkHomePageAvailable();
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

        When("user click on Sign Out option", () -> {
            context.loginAndHome.signOut();
        });

        Then("Sign out should be successful", () -> {
            context.loginAndHome.signOutConfirm();
            context.loginAndHome.checkLoginPageAvailable();
        });

    }
}