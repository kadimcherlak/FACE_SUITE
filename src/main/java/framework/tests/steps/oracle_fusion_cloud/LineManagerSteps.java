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

        When("user clicks on Continue button for Change Manager", () -> {
            context.lineManager.clickContinueButtonInChangeManagerPage();
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
            context.lineManager.enterComments("Changing the Manager for above reason");
        });
        Then("^user clicks (.*?) option from task icon menu$", (String linkName) -> {
            context.lineManager.clickLinkElementInTaskPane(linkName);
        });
        // Then("^Manange work relationship page is displayed$", () -> {
        //   context.lineManager.manageWorkRelationShipPageDisplayed();
        //});

        Then("user clicks on Action button and select View Termination option", () -> {
            context.lineManager.clickActionAndViewTermination();
        });

        Then("user clicks on Reverse Termination button", () -> {
            context.lineManager.clickReverseTermination();
        });


        Then("user clicks on YES button in warning popup", () -> {
            context.lineManager.clickYesWarningPopup();
        });


        And("^user clicks on Action button and select Terminate option$", () -> {
            context.lineManager.clickActionAndTerminate();

        });

        Then("^user navigated to Termination Details page$", () -> {
            context.lineManager.terminationPageDisplayed();

        });

        And("^user selects (.*?) Action$", (String actionType) -> {
            context.lineManager.selectTerminationAction(actionType);

        });

        And("^user selects (.*?) Reason$", (String actionReason) -> {
            context.lineManager.selectTerminationReason(actionReason);

        });
        And("^user updates Termination date$", () -> {

            context.lineManager.updateTerminationDate();

        });

        And("^user selects (.*?) as Recommended for Rehire$", (String rehireYesNo) -> {
            context.lineManager.selectRehireReason(rehireYesNo);

        });
        Then("^user clicks on Submit button in termination review page$", () -> {
            context.lineManager.clickButtonSubmit();
        });
        And("^user clicks on Review button in termination page$", () -> {
            context.lineManager.clickReviewButton();
        });
        And("^user clicks Yes button on popup modal in termination review page$", () -> {
            context.employeeEditMyDetails.clickYesOnPopup();
        });
        And("^user clicks Ok button confirmation popup modal in termination review page$", () -> {
            context.lineManager.clickOKOnPopup();
        });

        And("^user navigates to Quick Action menu$", () -> {
            context.loginAndHome.navigateToQuickAction();
        });

        And("^the Quick Action page should be displayed$", () -> {
            context.quickActionPage.validateQuickActionPageDisplayed();
        });

        And("^user selects the person name from the dropdown$", () -> {
            context.quickActionPage.selectPersonFromQuickActionDropdown();
        });

        Then("user clicks on (.*?) link from the Quick Action menu", (String quickActionLinkMenu) -> {
            context.quickActionPage.clickQuickActionMenuLink(quickActionLinkMenu);
        });

        Then("Terminate Work Relationship page should be displayed", () -> {
            context.quickActionPage.validateTerminateWorkRelationshipPageDisplayed();
        });

        Then("user enters all the termination details", () -> {
            context.quickActionPage.enterTerminationDetails();
        });

        Then("user add comments in the textarea for termination", () -> {
            context.lineManager.enterComments("Termination initiated for this employee");
        });

        When("user clicks on Submit button in Termination Work Relationship page", () -> {
            context.lineManager.clickSubmitButton();
        });

        When("user should see the message selected work relationship was already terminated", () -> {
            context.lineManager.terminationPageDisplayed();
        });
        And("^user clicks on Action button and selects Cancel Work Relationship$", () -> {
            context.lineManager.clickActionAndCancelWorkRelation();
        });
        
        And("^user clicks on Review button in self resignation page$", () -> {
            context.lineManager.clickReviewButton();
        });
    }

}