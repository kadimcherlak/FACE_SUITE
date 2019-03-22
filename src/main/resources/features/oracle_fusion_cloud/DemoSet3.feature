@DemoSet3
Feature: Employee edits Personal Information

  @EMPLOYEE_UPDATE_A_PHOTO
  Scenario Outline: Employee updating photo from personal information page
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then Personal Info page should be displayed
    When user clicks on Personal Details link in Person Info page
    Then Personal Details page should be displayed
    And user clicks on ellipsis on Employee Logo name
    Then users More option menu is displayed
    And user clicks Update Photo link to upload photo
    Then Photo upload page should be displayed
    When user clicks on Choose File button to upload a photo
    And user clicks on Save and Close button
    Then Personal Info page should be displayed
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario            | Test File Name | Test Sheet Name  |
      | EMPLOYEE_UPDATE_A_PHOTO | TestData.xlsx  | Employee_Details |


  @VALIDATE_ADDRESS_FORMAT
  Scenario Outline: Validate US Address format after clicking on edit address
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then Personal Info page should be displayed
    When user clicks on Contact Information section
    Then Contact Information page should be displayed
    When user clicks on Edit in the Address section
    And Verify that the address format is valid
    And Click on Cancel button
    When user clicks on Sign Out option
    Then Sign out should be successful
    Examples:
      | Test Scenario           | Test File Name | Test Sheet Name  |
      | VALIDATE_ADDRESS_FORMAT | TestData.xlsx  | Employee_Details |


  @ADD_NEW_ADDRESS_TYPE_DETAILS
  Scenario Outline: Employee add New Address of type Mailing Address
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then Personal Info page should be displayed
    When user clicks on Contact Information section
    Then Contact Information page should be displayed
    When user clicks on Add icon in the Address section
    And user Enter Details in Address fields
    And user click on submit button in New Contact page
    Then New Mailing address should be displayed
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                | Test File Name | Test Sheet Name  |
      | ADD_NEW_ADDRESS_TYPE_DETAILS | TestData.xlsx  | Employee_Details |



  @ADD_NEW_EMERGENCY_CONTACT_DETAILS
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
      | Test Scenario                     | Test File Name | Test Sheet Name  |
      | ADD_NEW_EMERGENCY_CONTACT_DETAILS | TestData.xlsx  | Employee_Details |