@Termination
Feature: Line Manager terminates a direct report who is a regular employee and PPS approves the termination


  @Line_manager_terminate_direct_reportees
  Scenario Outline: As an Line Manager, i should be able to terminate a direct report who is a regular employee

    Given user runs <Test Scenario>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on new person link under My Workforce section
    And user clicks on My Team link under My Team section
    Then My Team page should be displayed
    And user clicks on the Actions icon of the Employee <EmpId>
    When user navigates to Personal and Employement
    And user clicks on Terminate option
    And user enter details in Terminate details tab
    And user clicks on Review button
    Then Review Terminate Work Relationship should be displayed
    When user clicks on Submit button
    Then The transaction should be saved properly and My Team page should be displayed
    And user click on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario      |
      | New Hire Scenario1 |


  @PPS_approves_termination
  Scenario Outline: As an PPS Tier 2 Workforce and Assignment Administration, i should be able to approves request of termination for direct reportee who is Regular employee
    Given user runs <Test Scenario>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Worklist link under Tools section
    And user clicks on the Termination record of the Employee <EmpId>
    Then Termination for the employee page should be displayed in a secondary window
    And user clicks on Claim option
    And user clicks on the Termination record of the Employee <EmpId>
    Then Termination for the employee page should be displayed in a secondary window
    And user clicks on Approve option
    Then The Worklist: Notifications and Approvals page should be displayed
    And user click on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario      |
      | New Hire Scenario1 |
      
 