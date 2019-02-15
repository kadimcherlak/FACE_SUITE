package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.java8.En;
import framework.tests.pages.oracle_fusion_cloud.ChangeManagerPage;
import framework.tests.pages.oracle_fusion_cloud.LoginAndHomePage;
import framework.tests.pages.oracle_fusion_cloud.NewPersonPage;
import org.apache.logging.log4j.Logger;

public class ChangeManagerSteps implements En {

    private Logger logger;
    private Data data;
    private LoginAndHomePage loginAndHomePage;
    private NewPersonPage newPersonPage;
    private ChangeManagerPage changeManager;

    public ChangeManagerSteps(Context context) {
        logger = context.getLogger();
        logger.debug("{} loaded", this.getClass().getName());

        /*
         * Given("^user runs (.*?)$", (String testCaseKey) -> {
         * context.setData(testCaseKey); data = context.getData(); loginAndHomePage =
         * new LoginAndHomePage(context); });
         *
         * And("^user is on the oracle fusion login page$", () -> {
         * loginAndHomePage.openUrl();
         * assertThat(loginAndHomePage.checkLoginPageAvailable()).isTrue(); });
         *
         * And("^user provides credentials for login$", () -> {
         * loginAndHomePage.enterCredentials(); });
         *
         * When("^the user click on Sign In$", () -> { loginAndHomePage.signIn(); });
         *
         * Then("^the Oracle Fusion Home Page is displayed", () -> {
         * assertThat(loginAndHomePage.checkHomePageAvailable()).isTrue(); });
         *
         * Given("user login to Oracle Applications Cloud web page", () -> {
         * loginAndHomePage.openUrl();
         * assertThat(loginAndHomePage.checkLoginPageAvailable()).isTrue();
         * loginAndHomePage.enterCredentials(); loginAndHomePage.signIn();
         * assertThat(loginAndHomePage.checkHomePageAvailable()).isTrue(); });
         *
         * When("user clicks on Navigator icon", () -> {
         * loginAndHomePage.navigatorScreen(); });
         */

        When("user clicks on My Team link under My Team section", () -> {
            changeManager.navigatorTeam();
        });

        When("My Team page should be displayed", () -> {
            changeManager.checkMyTeamPageDisplay();
            ;
        });

        When("user clicks on the Employee link", () -> {
            changeManager.clickEmpLink();

        });

        Then("user navigates to Change Manager option", () -> {
            changeManager.navigateToChangeManagerPage();
        });

        When("Change Manager page should be displayed", () -> {
            changeManager.checkMyTeamPageDisplay();
            ;
        });

        When("user Select value for Change Manager Reason from dropdown", () -> {
            changeManager.selectChangeManagerReason();
        });

        When("user Select the value in Manager dropdown", () -> {
            changeManager.selectNewManager();
        });

        When("user click on Review button in Change Manager page", () -> {
            changeManager.clickReviewButton();
        });

        When("the current value and proposed values are displayed correctly in Review Page", () -> {
            changeManager.checkCurrentAndProposedValue();
        });

        When("user clicks on Submit button in Change Manager page", () -> {
            changeManager.clickSubmitButton();
        });

        When("The transaction should be saved properly and My Team page should be displayed", () -> {
            changeManager.clickOk();
            changeManager.clickConfirm();
        });

        /*
         * Then("user click on Sign Out option", () -> { // Write code here that turns
         * the phrase above into concrete actions loginAndHomePage.signOut(); });
         *
         * Then("Sign out should be successful", () -> { // Write code here that turns
         * the phrase above into concrete actions loginAndHomePage.signOutConfirm();
         * assertThat(loginAndHomePage.checkLoginPageAvailable()).isTrue(); });
         */

    }

}