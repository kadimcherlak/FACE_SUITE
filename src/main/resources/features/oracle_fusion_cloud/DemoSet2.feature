@DemoSet2
Feature: New Hire and Related Activities

  @NEW_HIRE
  Scenario Outline:  Create a New Hire
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

  @UPDATE_PERSONAL_ASSIGNMENT_DATA
  Scenario Outline: Create Global Temporary Assignment and perform Global Transfer for New Hire Employee
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
      | Test Scenario                   | Test File Name | Test Sheet Name    |
      | UPDATE_PERSONAL_ASSIGNMENT_DATA | TestData.xlsx  | Talent_Acquisition |

  @NEW_ADDRESS_ALTERNATIVE_WORK_LOCATION
  Scenario Outline: Employee add New Address of type Alternative Work Location
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then Personal Info page should be displayed
    When user clicks on Contact Information section
    Then Contact Information page should be displayed
    When user clicks on Add icon in the Address section
    And user Enter Details in Address fields
    And user click on submit button in Contact Information page
    Then Alternate Work location address should be displayed
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                         | Test File Name | Test Sheet Name  |
      | NEW_ADDRESS_ALTERNATIVE_WORK_LOCATION | TestData.xlsx  | Employee_Details |

  @ADD_EMERGENCY_CONTACT_DETAILS
  Scenario Outline: Employee add Emergency Contact details
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then Personal Info page should be displayed
    When user clicks on Family and Emergency Contacts section
    Then Family and Emergency Contacts page should be displayed
    When user clicks on Add and Create a New Contact option in My Contacts section
    Then New Contact page should be displayed
    And user Enter Details in New Contact page
    And user click on submit button in New Contact page
    Then Family and Emergency Contacts page should be displayed
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                 | Test File Name | Test Sheet Name  |
      | ADD_EMERGENCY_CONTACT_DETAILS | TestData.xlsx  | Employee_Details |

  @VALIDATE_ADDRESS_FORMAT
  Scenario Outline: Validate US Address format after clicking on edit address
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then Personal Info page should be displayed
    When user clicks on Contact Information section
    Then Contact Information page should be displayed
    When user clicks on Edit(Pencil Symbol) in the Address section
    And Verify that the address format is valid
    And Click on Cancel button
    When user clicks on Sign Out option
    Then Sign out should be successful
    Examples:
      | Test Scenario           | Test File Name | Test Sheet Name  |
      | VALIDATE_ADDRESS_FORMAT | TestData.xlsx  | Employee_Details |