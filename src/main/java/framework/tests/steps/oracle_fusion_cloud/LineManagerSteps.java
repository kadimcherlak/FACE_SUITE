package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.java8.En;
import org.apache.logging.log4j.Logger;

public class LineManagerSteps implements En {

    private Logger logger;
    private Data data;

    public LineManagerSteps(Context context) {
        logger = context.getLogger();
        logger.debug("{} loaded", this.getClass().getName());

        When("user clicks on My Team link under My Team section", () -> {
            context.lineManager.navigatorTeam();
        });

        When("My Team page should be displayed", () -> {
            context.lineManager.checkMyTeamPageDisplay();
            ;
        });

        When("user clicks on the Employee link", () -> {
            context.lineManager.clickEmpLink();

        });

        Then("user navigates to Change Manager option", () -> {
            context.lineManager.navigateToChangeManagerPage();
        });

        When("Change Manager page should be displayed", () -> {
            context.lineManager.checkChangeManagerPageDisplay();
            ;
        });

        When("user Select value for Change Manager Reason from dropdown", () -> {
            context.lineManager.selectChangeManagerReason();
        });

        When("user Select the value in Manager dropdown", () -> {
            context.lineManager.selectNewManager();
        });

        When("user click on Review button in Change Manager page", () -> {
            context.lineManager.clickReviewButton();
        });

        When("the current value and proposed values are displayed correctly in Review Page", () -> {
            context.lineManager.checkCurrentAndProposedValue();
        });

        When("user clicks on Submit button in Change Manager page", () -> {
            context.lineManager.clickSubmitButton();
        });

        When("The transaction should be saved properly and My Team page should be displayed", () -> {
            context.lineManager.checkMyTeamPageDisplay();
        });

        // --
        Then("user clicks on the More Information icon of the Employee", () -> {
            context.lineManager.clickMoreInfo();
        });

        Then("user navigates to Compensation And user clicks on Manage Salary Option", () -> {
            context.lineManager.clickCompensation();
            context.lineManager.clickManageSalary();
        });

        Then("Manage Salary page should be displayed", () -> {
            context.lineManager.checkManageSalaryPageDisplayed();
        });

        Then("user clicks on Propose New Salary button", () -> {
            context.lineManager.clickProposeNewSalary();
        });

        Then("user enters details in Propose New Salary section", () -> {
            context.lineManager.enterProposeNewSalaryDetails();
        });

        Then("New Salary section should be displayed", () -> {
            context.lineManager.checkNewSalaryPageDisplayed();
        });

        When("user enters details in New Salary section", () -> {
            context.lineManager.setSalaryinMyteam();
        });

        When("user click on continue button in New Salary section", () -> {
            context.lineManager.clickButtonContinueInManageSalary();
        });

        Then("Review page should be validated in Manage Salary section", () -> {
            context.lineManager.reviewSalaryInMyTeam();
        });
        
        Then("user add comments in the textarea", () -> {
            context.lineManager.enterComments();
        });
    }

}