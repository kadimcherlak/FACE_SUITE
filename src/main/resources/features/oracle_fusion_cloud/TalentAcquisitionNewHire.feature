@TALENT_ACQUISITION
Feature: New Hire and Related Activities

  @LOGIN_LOGOUT
  Scenario Outline: Perform Login to Oracle Fusion Cloud
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user is on the oracle fusion login page
    And user provides credentials for login
    When the user clicks on Sign In
    Then the Oracle Fusion Home Page is displayed
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario | Test File Name | Test Sheet Name    |
      | LOGIN_LOGOUT  | TestData.xlsx  | Talent_Acquisition |

  @NEW_HIRE
  Scenario Outline:  Create New Hire with veteran data
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
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario | Test File Name | Test Sheet Name    |
      | NEW_HIRE      | TestData.xlsx  | Talent_Acquisition |

  @BILINGUAL_INDICATOR
  Scenario Outline: Hire a Employee with a bilingual indicator
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link in Navigator Pane
    And user clicks on Hire an Employee on right side of the page under Tasks pane
    Then new Hire an employee screen should be displayed
    And user enter details in Identification tab
    And user enter details in Person information tab
    And user enter details in Employment Information tab
    And user enter details in Compensation and Other Information tab
    Then Review page should be displayed in view only mode
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button till person displayed
    Then Employee name should be listed in search results
    When user click on Action Button
    And user clicks on Manage Element Entries link under Payroll section
    Then manage element entries screen should be displayed
    And user clicks on Add button
    And user enter Effective date : System Date and Element Name as Bilingual Indicator
    And user click on continue button
    Then General Information page should be displayed with Bilingual field populated with Yes
    And user click on Submit button
    Then Manage Element entries page should be displayed with Bilingual Indicator row added
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario       | Test File Name | Test Sheet Name    |
      | BILINGUAL_INDICATOR | TestData.xlsx  | Talent_Acquisition |

  @UPDATE_ELEMENT_ENTRIES
  Scenario Outline: : Update Element Entries for the New Hire employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link in Navigator Pane
    And user clicks on Hire an Employee on right side of the page under Tasks pane
    Then new Hire an employee screen should be displayed
    And user enter details in Identification tab
    And user enter details in Person information tab
    And user enter details in Employment Information tab
    And user enter details in Compensation and Other Information tab
    Then Review page should be displayed in view only mode
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button till person displayed
    Then Employee name should be listed in search results
    When user click on Action Button
    And user clicks on Manage Element Entries link under Payroll section
    Then manage element entries screen should be displayed
    And user clicks on Add button
    And user enter Effective date : System Date and Element Name as ADP Auto & Home
    And user click on continue button
    Then General Information page should be displayed with Actual Amount
    And user enter Actual Amount and Paycheck Date
    And user click on Submit button in ADP
    Then Manage Element entries page should be displayed with ADP Auto & Home row added
    And user click on Done button at the top
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario          | Test File Name | Test Sheet Name    |
      | UPDATE_ELEMENT_ENTRIES | TestData.xlsx  | Talent_Acquisition |

  @UPDATE_PERSONAL_ASSIGNMENT_DATA
  Scenario Outline: Create Global Temporary Assignment and perform Global Transfer for New Hire Employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link in Navigator Pane
    And user clicks on Hire an Employee on right side of the page under Tasks pane
    Then new Hire an employee screen should be displayed
    And user enter details in Identification tab
    And user enter details in Person information tab
    And user enter details in Employment Information tab
    And user enter details in Compensation and Other Information tab
    Then Review page should be displayed in view only mode
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
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
      | Test Scenario                   | Test File Name | Test Sheet Name    |
      | UPDATE_PERSONAL_ASSIGNMENT_DATA | TestData.xlsx  | Talent_Acquisition |
