@TALENT_ACQUISITION
Feature: New Hire and Related Activities

  @LOGIN_LOGOUT

  Scenario Outline: Perform Login to Oracle Fusion Cloud
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user is on the oracle fusion login page
    And user provides credentials for login
    When the user click on Sign In
    Then the Oracle Fusion Home Page is displayed
    When user click on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario | Test File Name | Test Sheet Name    |
      | LOGIN_LOGOUT  | TestData.xlsx  | Talent_Acquisition |

  @NEW_HIRE
  Scenario Outline:  Create New Hire with veteran data
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link under My Workforce section
    And user clicks on Hire an employee on right side of the page under Tasks pane
    Then new Hire an employee screen should be displayed
    When user enter details in Identification tab
    And user enter details in Person information tab
    And user enter details in Employment Information tab
    And user enter details in Compensation and Other Information tab
    Then Review page should be displayed in view only mode
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    When user click on Sign Out option
    Then Sign out should be successful
    Examples:
      | Test Scenario | Test File Name | Test Sheet Name    |
      | NEW_HIRE      | TestData.xlsx  | Talent_Acquisition |

  @BILINGUAL_INDICATOR
  Scenario Outline: Hire a Employee with a bilingual indicator
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link under My Workforce section
    And user clicks on Hire an employee on right side of the page under Tasks pane
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
    And user clicks on Person Management link under My Workforce section
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button
    Then Employee name should be listed in search results
    When user click on Action Button
    And user clicks on Manage Element Entries link under Payroll section on right side of the page under Tasks pane
    Then manage element entries screen should be displayed
    And user clicks on Add button
    And user enter Effective date : System Date and Element Name as Bilingual Indicator
    And user click on continue button
    Then General Information page should be displayed with Bilingual field populated with Yes
    And user click on Submit button
    Then Manage Element entries page should be displayed with Bilingual Indicator row added
    And user click on Sign Out option
    Then Sign out should be successful
    Examples:
      | Test Scenario       | Test File Name | Test Sheet Name    |
      | BILINGUAL_INDICATOR | TestData.xlsx  | Talent_Acquisition |

  @UPDATE_ELEMENT_ENTRIES
  Scenario Outline: : Update Element Entries for the New Hire employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link under My Workforce section
    And user clicks on Hire an employee on right side of the page under Tasks pane
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
    And user clicks on Person Management link under My Workforce section
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button
    Then Employee name should be listed in search results
    When user click on Action Button
    And user clicks on Manage Element Entries link under Payroll section on right side of the page under Tasks pane
    Then manage element entries screen should be displayed
    And user clicks on Add button
    And user enter Effective date : System Date and Element Name as ADP Auto & Home
    And user click on continue button
    Then General Information page should be displayed with Actual Amount
    And user enter Actual Amount and Paycheck Date
    And user click on Submit button in ADP
    Then Manage Element entries page should be displayed with ADP Auto & Home row added
    And user click on Done button at the top
    And user click on Sign Out option
    Then Sign out should be successful
    Examples:
      | Test Scenario          | Test File Name | Test Sheet Name    |
      | UPDATE_ELEMENT_ENTRIES | TestData.xlsx  | Talent_Acquisition |


  @UPDATE_PERSONAL_ASSIGNMENT_DATA
  Scenario Outline: Create Global Temporary Assignment and perform Global Transfer for New Hire Employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link under My Workforce section
    And user clicks on Hire an employee on right side of the page under Tasks pane
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
    And user clicks on Person Management link under My Workforce section
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button
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
    And user click on Sign Out option
    Then Sign out should be successful
    Examples:
      | Test Scenario                   | Test File Name | Test Sheet Name    |
      | UPDATE_PERSONAL_ASSIGNMENT_DATA | TestData.xlsx  | Talent_Acquisition |


  @UPDATE_SALARY_FOR_EXISTING_EMP
  Scenario Outline: Updating salary component of an existing employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Person Management link under My Workforce section
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button
    Then Employee name should be listed in search results
    When user click on employee name link in search results
    And user click on Task Icon on the right side
    Then user clicks Manage Salary option from task icon menu
    And user clicks on Action button and select Edit option
    And user enters new Salary Amount under Current Salary section
    When user selects Use salary component checkbox
    Then Components tab is displayed in Manage Salary
    When user clicks on Add button in Components tab
    And user selects Promotion from Component dropdown
    And user enters amount in Amount field in Components tab
    And user clicks on Continue button in Manage Salary tab
    When user clicks on Submit button in Manage Salary Review page
    And user clicks Yes button on popup modal
    And user clicks Ok button confirmation popup modal
    And user click on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                  | Test File Name | Test Sheet Name    |
      | UPDATE_SALARY_FOR_EXISTING_EMP | TestData.xlsx  | Talent_Acquisition |

  @EDIT_SALARY_PROPOSAL_REASON
  Scenario Outline: Admin can edit Salary Proposal Reason
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Person Management link under My Workforce section
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button
    Then Employee name should be listed in search results
    When user click on employee name link in search results
    And user click on Task Icon on the right side
    Then user clicks Manage Salary option from task icon menu
    And user clicks on Action button and select Edit option
    And user enters new Salary Amount under Current Salary section
    And user clicks on Continue button in Manage Salary tab
    When user clicks on Submit button in Manage Salary Review page
    And user clicks Yes button on popup modal
    And user clicks Ok button confirmation popup modal
    And user click on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario               | Test File Name | Test Sheet Name    |
      | EDIT_SALARY_PROPOSAL_REASON | TestData.xlsx  | Talent_Acquisition |

  @CHANGE_SALARY_BASIS_FOR_EXISTING_EMP
  Scenario Outline: Administration changing salary basis of an employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Person Management link under My Workforce section
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button
    Then Employee name should be listed in search results
    When user click on employee name link in search results
    And user click on Task Icon on the right side
    Then user clicks Manage Salary option from task icon menu
    And user clicks on Action button and select Edit option
    When user selects US Hourly Wages 40 hours from Salary Basis
    Then user closes Warning modal by clicking OK button
    And user clicks on Continue button in Manage Salary tab
    When user clicks on Submit button in Manage Salary Review page
    And user clicks Yes button on popup modal
    And user clicks Ok button confirmation popup modal
    And user click on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                        | Test File Name | Test Sheet Name    |
      | CHANGE_SALARY_BASIS_FOR_EXISTING_EMP | TestData.xlsx  | Talent_Acquisition |
