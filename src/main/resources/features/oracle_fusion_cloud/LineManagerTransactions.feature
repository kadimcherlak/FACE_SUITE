@LINE_MANAGER_TRANSACTION
Feature: Line Manager Transaction and Approval

  @TERMINATION
  Scenario Outline: Employee Termination
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button till person displayed
    Then Employee name should be listed in search results
    When user click on employee name link in search results
    And user click on Task Icon on the right side
    When user clicks Manage Work Relationship option from task icon menu
    Then Manage Work Relationship page is displayed
    And user clicks on Action button and select Terminate option
    Then user navigated to Termination Details page
    And user selects Termination Action
    And user selects Work Incident or Work Related Illness Reason
    And user updates Termination date
    And user selects Yes as Recommended for Rehire
    And user clicks on Review button in termination page
    Then user clicks on Submit button in termination review page
    And user clicks Yes button on popup modal in termination review page
    And user clicks Ok button confirmation popup modal in termination review page
    And user clicks on Sign Out option
    Then Sign out should be successful
    And user waits for few seconds before login
    And user login to Oracle Applications Cloud web page
    When user clicks on Bell icon
    And user checks for notifications
    Then Approved notification should be present
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    When user enter the Person number generated from previous step in Person Number field
    And user click on Search button to verify is person is not available in system
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario | Test File Name | Test Sheet Name |
      | TERMINATION   | TestData.xlsx  | Line_Manager    |

  @REHIRE_TERMINATED_EMPLOYEE
  Scenario Outline: Employee Termination
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link in Navigator Pane
    And user clicks on Hire an Employee on right side of the page under Tasks pane
    Then new Hire an employee screen should be displayed
    When user enter terminated employee details in Identification tab
    Then Matching Person Records should be displayed
    And user clicks on Select Person button
    Then Warning message should be displayed
    When user clicks on OK button to create new new work relationship
    Then Identification tab should be displayed
    When user clicks next button in identification tab
    When user clicks next button in Person information tab
    And user enter details in Employment Information tab
    And user enter details in Compensation and Other Information tab
    Then Review page should be displayed in view only mode
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    And new employee details are stored into csv
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario              | Test File Name | Test Sheet Name    |
      | REHIRE_TERMINATED_EMPLOYEE | TestData.xlsx  | Talent_Acquisition |

  @RETIREMENT
  Scenario Outline: Employee Retirement
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button till person displayed
    Then Employee name should be listed in search results
    When user click on employee name link in search results
    And user click on Task Icon on the right side
    When user clicks Manage Work Relationship option from task icon menu
    Then Manage Work Relationship page is displayed
    And user clicks on Action button and select Terminate option
    Then user navigated to Termination Details page
    And user selects Retirement Action
    And user updates Termination date
    And user selects Yes as Recommended for Rehire
    And user clicks on Review button in termination page
    Then user clicks on Submit button in termination review page
    And user clicks Yes button on popup modal in termination review page
    And user clicks Ok button confirmation popup modal in termination review page
    And user clicks on Sign Out option
    Then Sign out should be successful
    And user waits for few seconds before login
    And user login to Oracle Applications Cloud web page
    When user clicks on Bell icon
    And user checks for notifications
    Then Approved notification should be present
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    When user enter the Person number generated from previous step in Person Number field
    And user click on Search button to verify is person is not available in system
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario | Test File Name | Test Sheet Name |
      | RETIREMENT    | TestData.xlsx  | Line_Manager    |

  @LINE_MANAGER_PERFORMS_CHANGE_MANAGER
  Scenario Outline: Line Manager to Perform Change Manager transaction for direct reportees
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on My Team link under My Team section
    Then My Team page should be displayed
    When user navigates to Change Manager option
    Then Change Manager page should be displayed
    And user Select value for Change Manager Reason from dropdown
    And user Select the value in Manager dropdown
    And user add comments in the textarea
    When user clicks on Submit button in Change Manager page
    Then The transaction should be saved properly and My Team page should be displayed
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                        | Test File Name | Test Sheet Name |
      | LINE_MANAGER_PERFORMS_CHANGE_MANAGER | TestData.xlsx  | Line_Manager    |


  @QUICK_ACTION_LINE_MANAGER_PERFORMS_CHANGE_MANAGER
  Scenario Outline: Line Manager to Perform Change Manager transaction for direct reportees from Quick Actions
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user navigates to Quick Action menu
    Then the Quick Action page should be displayed
    And user selects the person name from the dropdown
    And user clicks on Change Manager link from the Quick Action menu
    When user clicks on Continue button for Change Manager
    Then Change Manager page should be displayed
    And user Select value for Change Manager Reason from dropdown
    And user Select the value in Manager dropdown
    And user add comments in the textarea
    When user clicks on Submit button in Change Manager page
    Then the Quick Action page should be displayed
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                                     | Test File Name | Test Sheet Name |
      | QUICK_ACTION_LINE_MANAGER_PERFORMS_CHANGE_MANAGER | TestData.xlsx  | Line_Manager    |

  @LINEMANAGER_CHANGE_OF_SALARY_ACTION
  Scenario Outline: Line Manager performs a Change of salary with Reason Change in Working Hours for employee moving to part-time hours
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on My Team link under My Team section
    Then My Team page should be displayed
    And user clicks on the More Information icon of the Employee
    And user navigates to Compensation And user clicks on Manage Salary Option
    Then Manage Salary page should be displayed
    And user clicks on Propose New Salary button
    And user enters details in Propose New Salary section
    Then New Salary section should be displayed
    When user enters details in New Salary section
    And user click on continue button in New Salary section
    Then Review page should be validated in Manage Salary section
    And user click on Submit button
    Then The transaction should be saved properly and My Team page should be displayed
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                       | Test File Name | Test Sheet Name |
      | LINEMANAGER_CHANGE_OF_SALARY_ACTION | TestData.xlsx  | Line_Manager    |

  @QUICK_ACTION_TERMINATION
  Scenario Outline: Employee Termination from Quick Action Menu
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user navigates to Quick Action menu
    Then the Quick Action page should be displayed
    And user selects the person name from the dropdown
    And user clicks on Terminate link from the Quick Action menu
    Then Terminate Work Relationship page should be displayed
    And user enters all the termination details
    And user add comments in the textarea for termination
    When user clicks on Submit button in Termination Work Relationship page
    Then the Quick Action page should be displayed
    #And user selects the person name from the dropdown
    #And user clicks on Terminate link from the Quick Action menu
    #Then user should see the message selected work relationship was already terminated
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario            | Test File Name | Test Sheet Name |
      | QUICK_ACTION_TERMINATION | TestData.xlsx  | Line_Manager    |

  @QUICK_ACTION_CONTINGENT_WORKER_TERMINATION
  Scenario Outline: Employee Termination from Quick Action Menu
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user navigates to Quick Action menu
    Then the Quick Action page should be displayed
    And user selects the person name from the dropdown
    And user clicks on Terminate link from the Quick Action menu
    Then Terminate Work Relationship page should be displayed
    And user enters all the termination details
    And user add comments in the textarea for termination
    When user clicks on Submit button in Termination Work Relationship page
    Then the Quick Action page should be displayed
    #And user selects the person name from the dropdown
    #And user clicks on Terminate link from the Quick Action menu
    #Then user should see the message selected work relationship was already terminated
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                              | Test File Name | Test Sheet Name |
      | QUICK_ACTION_CONTINGENT_WORKER_TERMINATION | TestData.xlsx  | Line_Manager    |

  @CONTINGENT_WORKER_TERMINATION
  Scenario Outline: Contingent Worker Termination
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button till person displayed
    Then Employee name should be listed in search results
    When user click on employee name link in search results
    And user click on Task Icon on the right side
    When user clicks Manage Work Relationship option from task icon menu
    #Then Manage Work Relationship page is displayed
    And user clicks on Action button and select Terminate option
    Then user navigated to Termination Details page
    And user selects Termination Action
    And user selects Work Incident or Work Related Illness Reason
    And user updates Termination date
    And user selects Yes as Recommended for Rehire
    And user clicks on Review button in termination page
    Then user clicks on Submit button in termination review page
    And user clicks Yes button on popup modal in termination review page
    And user clicks Ok button confirmation popup modal in termination review page
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                 | Test File Name | Test Sheet Name |
      | CONTINGENT_WORKER_TERMINATION | TestData.xlsx  | Line_Manager    |

  @REVERSE_TERMINATION

  Scenario Outline: Reversing a Termination
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button till person displayed
    Then Employee name should be listed in search results
    When user click on employee name link in search results
    And user click on Task Icon on the right side
    When user clicks Manage Work Relationship option from task icon menu
   # Then Manage Work Relationship page is displayed
    And user clicks on Action button and select Terminate option
    Then user navigated to Termination Details page
    And user selects Termination Action
    And user selects Work Incident or Work Related Illness Reason
    And user updates Termination date
    And user selects Yes as Recommended for Rehire
    And user clicks on Review button in termination page
    Then user clicks on Submit button in termination review page
    And user clicks Yes button on popup modal in termination review page
    And user clicks Ok button confirmation popup modal in termination review page
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button till person displayed
    Then Employee name should be listed in search results
    When user click on employee name link in search results
    And user click on Task Icon on the right side
    When user clicks Manage Work Relationship option from task icon menu
    #Then Manage Work Relationship page is displayed
    And user clicks on Action button and select View Termination option
    When user clicks on Reverse Termination button
    And user clicks on YES button in warning popup
    And user clicks on OK button
    #And user clicks on Done button
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario       | Test File Name | Test Sheet Name |
      | REVERSE_TERMINATION | TestData.xlsx  | Line_Manager    |
#
#  @LINE_MANAGER_APPROVES_CHANGE_MANAGER_REQUEST - Not in Datasheet
#  Scenario Outline: Line Manager to approve request of employee's manager change
#    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
#    And user login to Oracle Applications Cloud web page
#    #    When user clicks on Notifications bell icon
#    #    And user clicks on Action Required Notification link
#    #    Then notification details should be opened in new window with employee's manager change details
#    #    When user clicks on Approve button
#    #    Then The request should be approved and home page should be displayed
#    And user clicks on Sign Out option
#    Then Sign out should be successful
#
#    Examples:
#      | Test Scenario                                 | Test File Name | Test Sheet Name |
#      | LINE_MANAGER1_APPROVES_CHANGE_MANAGER_REQUEST | TestData.xlsx  | Change_Manager  |
#
#  @LINEMANAGER_TERMINATE_DIRECT_REPORTEES
#  Scenario Outline: Line Manager terminates a Direct Reportee who is a Regular Employee
#    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
#    And user login to Oracle Applications Cloud web page
#    When user clicks on Navigator icon
#    And user clicks on New Person link in Navigator Pane
#    And user clicks on My Team link under My Team section
#    Then My Team page should be displayed
#    #    And user clicks on the Actions icon of the Employee <EmpId>
#    #    When user navigates to Personal and Employement
#    #    And user clicks on Terminate option
#    #    And user enter details in Terminate details tab
#    #    And user clicks on Review button
#    #    Then Review Terminate Work Relationship should be displayed
#    When user clicks on Submit button
#    Then The transaction should be saved properly and My Team page should be displayed
#    And user clicks on Sign Out option
#    Then Sign out should be successful
#
#    Examples:
#      | Test Scenario                          | Test File Name | Test Sheet Name      |
#      | LINEMANAGER_TERMINATE_DIRECT_REPORTEES | TestData.xlsx  | Termination_Approval |
#
#  @PPS_APPROVES_TERMINATION
#  Scenario Outline: Approve request of termination for Direct Reportee who is Regular Employee
#    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
#    And user login to Oracle Applications Cloud web page
#    When user clicks on Navigator icon
#    #    And user clicks on Worklist link under Tools section
#    #    And user clicks on the Termination record of the Employee <EmpId>
#    #    Then Termination for the employee page should be displayed in a secondary window
#    #    And user clicks on Claim option
#    #    And user clicks on the Termination record of the Employee <EmpId>
#    #    Then Termination for the employee page should be displayed in a secondary window
#    #    And user clicks on Approve option
#    #    Then The Worklist: Notifications and Approvals page should be displayed
#    And user clicks on Sign Out option
#    Then Sign out should be successful
#
#    Examples:
#      | Test Scenario            | Test File Name | Test Sheet Name      |
#      | PPS_APPROVES_TERMINATION | TestData.xlsx  | Termination_Approval |