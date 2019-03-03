package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.java8.En;
import org.apache.logging.log4j.Logger;


public class ManageCalendarEventsSteps implements En {

    private Logger logger;
    private Data data;

    public ManageCalendarEventsSteps(Context context) {
        logger = context.getLogger();
        logger.debug("{} loaded", this.getClass().getName());

        Then("Calendar Event page should be displayed", () -> {
            context.manageCalendarEvents.checkCalendarEventPageDisplayed();
        });

        When("user clicks on (.*?) link in Calendar Event page", (String linkName) -> {
            context.manageCalendarEvents.clickLinkInCalendarEventPage(linkName);
        });

        Then("Manage Work Schedules page should be displayed", () -> {
            context.manageCalendarEvents.checkManageWorkSchedulesPageDisplayed();
        });

        Then("check for existing schedule and delete", () -> {
            context.manageCalendarEvents.checkExistingScheduleAndDelete();
        });

        When("user clicks on Create button to Create Work Schedule", () -> {
            context.manageCalendarEvents.clickCreateInCreateWorkSchedule();
        });

        When("user enters work schedule information", () -> {
            context.manageCalendarEvents.enterWorkScheduleInfo();
        });


        When("user clicks on submit button in Create Work Schedule page", () -> {
            context.manageCalendarEvents.clickSubmitButton();
        });

        When("user clicks on OK button", () -> {
            context.manageCalendarEvents.clickOkButton();
        });

        When("user search for existing Work Schedule in Manage Work Schedules page", () -> {
            context.manageCalendarEvents.searchWorkSchedule();
        });

        Then("work schedule should be displayed with Name in search results", () -> {
            context.manageCalendarEvents.checkWorkScheduleDisplayed();
        });

        When("user clicks on Name link in manage Work Schedule page", () -> {
            context.manageCalendarEvents.clickWorkScheduleName();
        });

        When("user updates the work schedule", () -> {
            context.manageCalendarEvents.updateWorkSchedule();
        });

        Then("confirmation message with (.*?) should be displayed", (String message) -> {
            context.manageCalendarEvents.checkConfirmationMessage(message);
        });

        When("user clicks on Home button", () -> {
            context.manageCalendarEvents.clickHomeButton();
        });
    }
}