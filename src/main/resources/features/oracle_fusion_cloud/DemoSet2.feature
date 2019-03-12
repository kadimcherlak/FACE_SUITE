@DemoSet2
Feature: Employee edits Personal Information

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
    When user clicks on Edit in the Address section
    And Verify that the address format is valid
    And Click on Cancel button
    When user clicks on Sign Out option
    Then Sign out should be successful
    Examples:
      | Test Scenario           | Test File Name | Test Sheet Name  |
      | VALIDATE_ADDRESS_FORMAT | TestData.xlsx  | Employee_Details |

  @UPLOAD_HDL_FILE
  Scenario Outline: Upload HDL File
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Data Exchange link in Navigator Pane
    And user clicks on Import and Load Data on right side of the page under Tasks pane
    Then Import and Load Data page should be displayed
    When user clicks on Import File option
    Then Select File page should be displayed
    When user clicks on Choose File option
    And user upload HDL File and click Submit button
    Then File should be successfully submitted
    And Process Id should be generated
    When user search for the process id generated in search screen
    And user clicks on Refresh button1 till process Id displayed
    And user clicks on Refresh button1 till file is imported and loaded
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    #And user enter the Person number generated from previous step in Person Number field
    #And user click on Search button till person displayed
    When user clicks on Sign Out option
    Then Sign out should be successful
    Examples:
      | Test Scenario   | Test File Name | Test Sheet Name  |
      | UPLOAD_HDL_FILE | TestData.xlsx  | Employee_Details |