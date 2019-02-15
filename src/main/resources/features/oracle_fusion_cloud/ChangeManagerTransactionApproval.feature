#@Manager_Change
#Feature: Change Manager Transaction and Approval
#
#@Line_manager_performs_change_manager
#Scenario Outline: As an Line Manager, i should be able to Perform Change Manager transaction for my direct reportees
#
#    Given user runs <Test Scenario>
#    And user login to Oracle Applications Cloud web page
#    When user clicks on Navigator icon
#    And user clicks on My Team link under My Team section
#    Then My Team page should be displayed
#    And user clicks on the Actions icon of the Employee
#    When user navigates to Personal and Employement
#    And user clicks on Change Manager option
#     And user enter details in Change Manager tab
#     And user clicks on Review button
#    Then the current value and proposed values are displayed correctly in Review Page
#    When user clicks on Submit button
#    Then The transaction should be saved properly and My Team page should be displayed
#     And user click on Sign Out option
#    Then Sign out should be successful
#
#   Examples:
#      | Test Scenario  |
#      | Change Manager |
#
#
#  @Line_manager1_approves_change_manager_request
#Scenario Outline: As an Line Manager 1, i should be able to approves request of employee's manager change
#    Given user runs <Test Scenario>
#    And user login to Oracle Applications Cloud web page
#    When user clicks on Notifications bell icon
#    And user clicks on Action Required Notification link
#    Then notification details should be opened in new window with employee's manager change details
#    When user clicks on Approve button
#    Then The request should be approved and home page should be displayed
#    And user click on Sign Out option
#    Then Sign out should be successful
#
#    Examples:
#      | Test Scenario  |
#      | Change Manager |
#
#