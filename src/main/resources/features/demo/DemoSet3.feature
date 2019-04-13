@DemoSet3
Feature: New Hire to Transfer

  @NEW_HIRE
  Scenario Outline: Create a New Hire
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link in Navigator Pane
    And user clicks on Hire an Employee on right side of the page under Tasks pane
    Then new Hire an employee screen should be displayed
    When user enter details in Identification tab
    And user enter details in Person information tab
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
      | Test Scenario | Test File Name | Test Sheet Name    |
      | NEW_HIRE      | TestData.xlsx  | Talent_Acquisition |

  @CHANGE_ASSIGNMENT_VIA_PRSN_MGMNT
  Scenario Outline: Admin updating the assignment status of an employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button till person displayed
    Then Employee name should be listed in search results
    When user click on employee name link in search results
    And user clicks on Edit button and select Update option
    Then Update Employment new window should be displayed
    When user enters details in Update Employment Window and click on Ok button
    And user selects Assignment Status as Active - No Payroll
    When user clicks on Review button in Management Employment page
    When user clicks on Submit button in Review page
    And user clicks Yes button on popup modal
    And user clicks Ok button confirmation popup modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                    | Test File Name | Test Sheet Name  |
      | CHANGE_ASSIGNMENT_VIA_PRSN_MGMNT | TestData.xlsx  | Employee_Details |


  @LEGAL_ENTITY_TRANSFER
  Scenario Outline: Perform Global Transfer for New Hire Employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button till person displayed
    Then Employee name should be listed in search results
    When user click on employee name link in search results
    And user clicks on Edit button and select Update option
    Then Update Employment new window should be displayed
    When user enter details in Update Employment Window and click on Ok button
    Then Global Temporary Assignment page should be displayed
    When user navigate to Employment Information page
    And user enter details in Employment Information tab
    And user enter details in Compensation and Other Information tab
    Then Review page should be displayed in view only mode
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    When user click on Done button at the top
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario         | Test File Name | Test Sheet Name    |
      | LEGAL_ENTITY_TRANSFER | TestData.xlsx  | Talent_Acquisition |