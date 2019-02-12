@Talent_Acquisition
Feature: Set up a New Hire

  @Login_Logout_Test
  Scenario Outline: Perform Login to Oracle Fusion Cloud
    Given user runs <Test Scenario>
    And user is on the oracle fusion login page
    And user provides credentials for login
    When the user click on Sign In
    Then the Oracle Fusion Home Page is displayed
    When user click on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario      |
      | New Hire Scenario1 |

  @VETSDATA
  Scenario Outline:  As an PPS Tier2 Recruitment and Onboarding Administration User Role, i should be able to set up a New Hire and enter VETS data
    Given user runs <Test Scenario>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on new person link under My Workforce section
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
      | Test Scenario      |
      | New Hire Scenario1 |
#
#  @BILINGUALINDICATOR
#  Scenario Outline: : As an PPS Tier2 Recruitment and Onboarding Administration User Role, i should be able to Hire a Employee with a bilingual indicator
#    Given user runs <Test Scenario>
#    And user login to Oracle Applications Cloud web page
#    When user clicks on Navigator icon
#    And user clicks on new person link under My Workforce section
#    And user clicks on Hire an employee on right side of the page under Tasks pane
#    Then new Hire an employee screen should be displayed
#    And user enter details in Identification tab
#    And user enter details in Person information tab
#    And user enter details in Employment Information tab
#    And user enter details in Compensation and Other Information tab
#    Then Review page should be displayed in view only mode
#    When user clicks on submit button
#    And clicks ok in the Warning and confirmation message displayed
#    Then Page should be submitted successfully
#    When user clicks on Navigator icon
#    And user clicks on Person Management link under My Workforce section
#    Then Person Management: Search screen should be displayed
#    And user enter the <Target Employee>(Above hired employee number) in Person Number field
#    And user click on Search button
#    Then Employee name should be listed in search results
#    When user click on employee name link
#    Then <Target Employee>: Person Management page should be displayed
#    When user clicks on Manage Element Entries link under Payroll section on right side of the page under Tasks pane
#    Then manage element entries screen should be displayed
#    And user clicks on Add button
#    Then Create Element Entry page should be displayed
#    And user enter Effective date : System Date and Element Name as Bilingual Indicator
#    And user click on continue button
#    Then General Information page should be displayed with Bilingual field populated with Yes
#    And user click on Submit button
#    Then Manage Element entries page should be displayed with Bilingual Indicator row added
#    And user click on Sign Out option
#    Then Sign out should be successful
#
#    Examples:
#      |Test Scenario|
#      |New_Hire_Scenario2|
#
#
