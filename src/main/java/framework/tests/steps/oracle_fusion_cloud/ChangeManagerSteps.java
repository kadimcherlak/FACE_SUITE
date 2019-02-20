package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.java8.En;
import org.apache.logging.log4j.Logger;

public class ChangeManagerSteps implements En {

    private Logger logger;
    private Data data;

    public ChangeManagerSteps(Context context) {
        logger = context.getLogger();
        logger.debug("{} loaded", this.getClass().getName());

        When("user clicks on My Team link under My Team section", () -> {
            context.changeManager.navigatorTeam();
        });

        When("My Team page should be displayed", () -> {
            context.changeManager.checkMyTeamPageDisplay();
            ;
        });

        When("user clicks on the Employee link", () -> {
            context.changeManager.clickEmpLink();

        });

        Then("user navigates to Change Manager option", () -> {
            context.changeManager.navigateToChangeManagerPage();
        });

        When("Change Manager page should be displayed", () -> {
            context.changeManager.checkMyTeamPageDisplay();
            ;
        });

        When("user Select value for Change Manager Reason from dropdown", () -> {
            context.changeManager.selectChangeManagerReason();
        });

        When("user Select the value in Manager dropdown", () -> {
            context.changeManager.selectNewManager();
        });

        When("user click on Review button in Change Manager page", () -> {
            context.changeManager.clickReviewButton();
        });

        When("the current value and proposed values are displayed correctly in Review Page", () -> {
            context.changeManager.checkCurrentAndProposedValue();
        });

        When("user clicks on Submit button in Change Manager page", () -> {
            context.changeManager.clickSubmitButton();
        });

        When("The transaction should be saved properly and My Team page should be displayed", () -> {
            context.changeManager.clickOk();
            context.changeManager.clickConfirm();
        });

    }

}