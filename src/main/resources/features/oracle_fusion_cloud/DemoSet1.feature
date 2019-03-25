@DemoSet1
Feature: New Hire and Related Activities

  @NEW_HIRE_USING_HDL1
  Scenario Outline: New Hire Process using HDL File upload
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Data Exchange link in Navigator Pane
    And user clicks on Import and Load Data on right side of the page under Tasks pane
    Then Import and Load Data page should be displayed
    When user clicks on Import File option
    Then Select File page should be displayed
    When user upload HDL File and click Submit button
    Then File should be successfully submitted
    And Process Id should be generated
    When user search for the process id generated in search screen
    And user clicks on Refresh button1 till file is imported and loaded
    When user clicks on Navigator icon
    And user clicks on Person Management Link in Navigation pane
    Then Person Management: Search screen should be displayed
    And user search for the person newly created from file
    And new employee details are stored into csv
    When user clicks on Sign Out option
    Then Sign out should be successful
    Examples:
      | Test Scenario      | Test File Name | Test Sheet Name  |
      | NEW_HIRE_USING_HDL1 | TestData.xlsx  | Employee_Details |


  @UPDATE_I9_STATUS1
  Scenario Outline:  Verify PPS is able to update I9 Status
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button till person displayed
    Then Employee name should be listed in search results
    When user click on employee name link in search results
    Then Person Management screen should be displayed
    And user clicks on Manage Work Relationship on right side of the page under Tasks pane
    Then Manage Work Relationship screen should be displayed
    When user click on Actions button and select Edit option
    Then Edit Work Relationship screen should be displayed
    And user select Ready to verify value from I-9 Status
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    When user click on Done button at the top
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario    | Test File Name | Test Sheet Name    |
      | UPDATE_I9_STATUS1 | TestData.xlsx  | Talent_Acquisition |


  @EDIT_SALARY_PROPOSAL_REASON1
  Scenario Outline: Admin updating Salary Proposal Reason for an employee
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
    Then from task menu user clicks on Manage Salary option
    And user clicks on Action button and select Edit option
    And user enters new Salary Amount under Current Salary section
    And user clicks on Continue button in Manage Salary tab
    When user clicks on Submit button in Review page
    And user clicks Yes button on popup modal
    And user clicks Ok button confirmation popup modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario               | Test File Name | Test Sheet Name  |
      | EDIT_SALARY_PROPOSAL_REASON1 | TestData.xlsx  | Employee_Details |


  @CHANGE_SALARY_BASIS_FOR_EXISTING_EMP1
  Scenario Outline: Admin changing salary basis of an employee to 40 hours
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
    Then from task menu user clicks on Manage Salary option
    And user clicks on Action button and select Edit option
    When user selects US Hourly Wages hours from Salary Basis
    Then user closes Warning modal by clicking OK button
    And user clicks on Continue button in Manage Salary tab
    When user clicks on Submit button in Review page
    And user clicks Yes button on popup modal
    And user clicks Ok button confirmation popup modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                        | Test File Name | Test Sheet Name  |
      | CHANGE_SALARY_BASIS_FOR_EXISTING_EMP1 | TestData.xlsx  | Employee_Details |


  @UPDATE_SALARY_FOR_EXISTING_EMP1
  Scenario Outline: Admin updating salary component of an existing employee
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
    Then from task menu user clicks on Manage Salary option
    And user clicks on Action button and select Edit option
    And user enters new Salary Amount under Current Salary section
    And user clicks on Continue button in Manage Salary tab
    When user clicks on Submit button in Review page
    And user clicks Yes button on popup modal
    And user clicks Ok button confirmation popup modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                  | Test File Name | Test Sheet Name  |
      | UPDATE_SALARY_FOR_EXISTING_EMP1 | TestData.xlsx  | Employee_Details |


  @LINE_MANAGER_PERFORMS_CHANGE_MANAGER1
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
      | LINE_MANAGER_PERFORMS_CHANGE_MANAGER1 | TestData.xlsx  | Line_Manager    |


  @RETIREMENT1
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
    Then Manange work relationship page is displayed
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
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    When user enter the Person number generated from previous step in Person Number field
    And user click on Search button to verify is person is not available in system
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario | Test File Name | Test Sheet Name |
      | RETIREMENT1   | TestData.xlsx  | Line_Manager    |