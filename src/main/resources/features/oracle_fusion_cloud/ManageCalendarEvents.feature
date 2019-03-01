@MANAGE_CALENDAR_EVENTS
Feature: Manage Calendar Events

  @WORK_SCHEDULE_CREATE
  Scenario Outline: Create Work Schedule for an employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Manage Calendar Events link in Navigator Pane
    Then Calendar Event page should be displayed
    When user clicks on Manage Work Schedules link in Calendar Event page
    Then Manage Work Schedules page should be displayed
    And check for existing schedule and delete
    When user clicks on Create button to Create Work Schedule
    And user enters work schedule information
    And user clicks on submit button in Create Work Schedule page
    Then confirmation message with The work schedule was created. should be displayed
    When user clicks on OK button
    Then Manage Work Schedules page should be displayed
    When user clicks on Home button
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario        | Test File Name | Test Sheet Name        |
      | WORK_SCHEDULE_CREATE | TestData.xlsx  | Manage_Calendar_Events |

  @WORK_SCHEDULE_UPDATE
  Scenario Outline: Update Work Schedule to future date for an employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Manage Calendar Events link in Navigator Pane
    Then Calendar Event page should be displayed
    When user clicks on Manage Work Schedules link in Calendar Event page
    Then Manage Work Schedules page should be displayed
    When user search for existing Work Schedule in Manage Work Schedules page
    Then work schedule should be displayed with Name in search results
    When user clicks on Name link in manage Work Schedule page
    And user updates the work schedule
    And user clicks on submit button in Create Work Schedule page
    Then confirmation message with The work schedule was updated. should be displayed
    When user clicks on OK button
    Then Manage Work Schedules page should be displayed
    When user clicks on Home button
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario        | Test File Name | Test Sheet Name        |
      | WORK_SCHEDULE_UPDATE | TestData.xlsx  | Manage_Calendar_Events |

  @WORK_SCHEDULE_INACTIVE
  Scenario Outline: Update Work Schedule to past date to make schedule inactive for an employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Manage Calendar Events link in Navigator Pane
    Then Calendar Event page should be displayed
    When user clicks on Manage Work Schedules link in Calendar Event page
    Then Manage Work Schedules page should be displayed
    When user search for existing Work Schedule in Manage Work Schedules page
    Then work schedule should be displayed with Name in search results
    When user clicks on Name link in manage Work Schedule page
    And user updates the work schedule
    And user clicks on submit button in Create Work Schedule page
    Then confirmation message with The work schedule was updated. should be displayed
    When user clicks on OK button
    Then Manage Work Schedules page should be displayed
    When user clicks on Home button
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario          | Test File Name | Test Sheet Name        |
      | WORK_SCHEDULE_INACTIVE | TestData.xlsx  | Manage_Calendar_Events |