package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.java8.En;
import framework.tests.pages.oracle_fusion_cloud.LoginPage;
import framework.tests.pages.oracle_fusion_cloud.HomePage;
import org.apache.logging.log4j.Logger;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTestSteps implements En {

    private Logger logger;
    private Data data;
    private HomePage homePage;
    private LoginPage loginPage;

    public LoginTestSteps(Context context) {
        logger = context.getLogger();
        logger.debug("{} loaded", this.getClass().getName());

        Given("^we are running (.*?)$", (String testCaseKey) -> {
            context.setData(testCaseKey);
            data = context.getData();
        });

        And("^user is on the oracle fusion login page$", () -> {
            loginPage = new LoginPage(context);
            loginPage.goTo();
            assertThat(loginPage.checkPageAvailable()).isTrue();
        });

        And("^user provides credentials for login$", () -> {

            loginPage.enterCredentials();
        });

        When("^the user click on Sign In$", () -> {
            loginPage.signIn();
        });

        Then("^the Oracle Fusion Home Page is displayed", () -> {
            homePage = new HomePage(context);
            assertThat(homePage.checkPageAvailable()).isTrue();
        });

    }

}

