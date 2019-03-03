@LINE_MANAGER_TRANSACTION
Feature: Line Manager Transaction and Approval

  @LINE_MANAGER_PERFORMS_CHANGE_MANAGER
  Scenario Outline: Line Manager to Perform Change Manager transaction for direct reportees
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on My Team link under My Team section
    Then My Team page should be displayed
    And user clicks on the Employee link
    When user navigates to Change Manager option
    Then Change Manager page should be displayed
    And user Select value for Change Manager Reason from dropdown
    And user Select the value in Manager dropdown
    And user click on Review button in Change Manager page
    Then the current value and proposed values are displayed correctly in Review Page
    When user clicks on Submit button in Change Manager page
    Then The transaction should be saved properly and My Team page should be displayed
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                        | Test File Name | Test Sheet Name |
      | LINE_MANAGER_PERFORMS_CHANGE_MANAGER | TestData.xlsx  | Change_Manager  |

  @LINE_MANAGER_APPROVES_CHANGE_MANAGER_REQUEST
  Scenario Outline: Line Manager to approve request of employee's manager change
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Notifications bell icon
    And user clicks on Action Required Notification link
    Then notification details should be opened in new window with employee's manager change details
    When user clicks on Approve button
    Then The request should be approved and home page should be displayed
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                                 | Test File Name | Test Sheet Name |
      | LINE_MANAGER1_APPROVES_CHANGE_MANAGER_REQUEST | TestData.xlsx  | Change_Manager  |

  @LINEMANAGER_TERMINATE_DIRECT_REPORTEES
  Scenario Outline: Line Manager terminates a Direct Reportee who is a Regular Employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link in Navigator Pane
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
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                          | Test File Name | Test Sheet Name      |
      | LINEMANAGER_TERMINATE_DIRECT_REPORTEES | TestData.xlsx  | Termination_Approval |


  @PPS_APPROVES_TERMINATION
  Scenario Outline: Approve request of termination for Direct Reportee who is Regular Employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
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
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario            | Test File Name | Test Sheet Name      |
      | PPS_APPROVES_TERMINATION | TestData.xlsx  | Termination_Approval |
