@EMPLOYEE_EDIT_DETAILS
Feature: Employee performs edit on Address,Contact Type,Personal Payment Method and disability Information

  @NEW_ADDRESS_ALTERNATIVE_WORK_LOCATION
  Scenario Outline: Employee to add New Address to indicate an alternative work location
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
  Scenario Outline: Employee to select a contact type from Emergency Contact list and add details
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then Personal Info page should be displayed
    When user clicks on Family and Emergency Contacts section
    Then Family and Emergency Contacts page should be displayed
    When user clicks on Add and Create a New Contact option in My Contacts section
    Then Edit My Details: Contact Information page should be displayed
    When user clicks on Contacts icon on the left panel
    Then Edit My Details: Contacts page should be displayed
    When user clicks on Add icon in the Contacts section
    Then Add Contact dialog box should be displayed
    And user clicks on Select an existing person radiobutton
    And user clicks on Continue button
    And user Select value for Relationship as Contact from dropdown
    And user enter details in Emergency Contact Name
    And user select Emergency contact check box
    And user click on Save and Close button
    Then My Details page should be displayed
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                 | Test File Name | Test Sheet Name  |
      | ADD_EMERGENCY_CONTACT_DETAILS | TestData.xlsx  | Employee_Details |

  @UPDATE_PERSONAL_PAYMENT_METHODS_EXPENSES_ONLY
  Scenario Outline: Employee to update Personal Payment Method (Expenses only) details
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then My Details page should be displayed
    When user clicks on More Information icon under name icon
    Then A pop up window with employee details should be displayed
    When user clicks on Actions (v) button
    Then the values Absences,Compensation,Personal and Employment should be displayed
    When user clicks Manage Personal Payment Methods under Payroll option
    Then Create Personal Payment Method page should be displayed
    And user clicks on + icon
    Then Personal Payment Method page should be displayed
    And user enter value for Name,Payment Method and Percentage
    And user clicks on + icon under Bank Accounts
    Then Create Bank Account page should be displayed
    And enter the bank account details
    And user clicks on Submit button
    Then Overview personal payments page will be displayed
    When user click on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                                 | Test File Name | Test Sheet Name  |
      | UPDATE_PERSONAL_PAYMENT_METHODS_EXPENSES_ONLY | TestData.xlsx  | Employee_Details |

  @UPDATE_PERSONAL_PAYMENT_METHODS_NON_EXPENSES_ONLY
  Scenario Outline: Employee to update Personal Payment Method (Non - Expenses only) details
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then My Details page should be displayed
    When user clicks on More Information icon 'i'  under name icon
    Then A pop up window with employee details should be displayed.
    When user clicks on Actions (v) button
    Then the values Absence,Payroll,Personal and Employment should be displayed
    When user clicks Manage Personal Payment Methods under Payroll option
    Then Create Personal Payment Method page should be displayed
    And user clicks on + icon
    Then Personal Payment Method page should be displayed
    And user enter value for Name as "HSBC"
    And user enter value from Organization Payment Method dropdown as "Non - Expenses"
    And user clicks on + icon under Bank Accounts
    Then Create Bank Account page should be displayed
    And user enter value for Account Number as "464613164666"
    And user enter value from Account type as "Savings"
    And user enter value for Routing Number as "122105155"
    And user enter value for Routing Account Holder
    And user clicks on Submit button
    Then Overview personal payments page will be displayed
    And user clicks on Done button
    Then Person Gallery page should be displayed
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                                     | Test File Name | Test Sheet Name  |
      | UPDATE_PERSONAL_PAYMENT_METHODS_NON_EXPENSES_ONLY | TestData.xlsx  | Employee_Details |

  @VALIDATE_ADDRESS_FORMAT
  Scenario Outline: Employee to update Address, BiographicalInfo and Driving License Documents
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then My Details page should be displayed
    When user clicks on edit button on top right side of the page
    Then Contact Information page should be displayed
    When user clicks on Contact Information section
    Then Contact Information page should be displayed
    When user clicks on Edit(Pencil Symbol) in the Address section
    And Verify that the address format is valid
    And Click on Cancel button
    And Click Yes button
    Then My Details page should be displayed
    When user click on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario           | Test File Name | Test Sheet Name  |
      | VALIDATE_ADDRESS_FORMAT | TestData.xlsx  | Employee_Details |

  @UPDATE_ADDRESS_BIOGRAPHICAL_INFO_DRIVING_LICENSE_DOCUMENTS
  Scenario Outline: Employee to update Address, BiographicalInfo and Driving License Documents
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then My Details page should be displayed
    When user clicks on 'Edit' button on top right side of the page
    Then Edit My Details: Contact Information page should be displayed
    When user clicks on 'Contact Information' section
    Then Contact Information page should be displayed
    When user clicks on Edit(Pencil Symbol) in the Address section
    Then Personal address should be displayed
    And user enter value for effective date when address becomes active
    And user enter value for Address Line 1
    And user enter value for Zip Code
    And user clicks on Save and Close button
    Then My details page should be displayed
    When user clicks on "Biographical information" icon in the left side of the page which is available in Edit My Details page
    Then "Edit My Details: Biographical Information" page should be displayed
    And user clicks on Click on Edit Icon(Pencil icon)
    Then Biographical Information page should be displayed in edit mode
    And user enter value for Title
    And user enter value for First Name
    And user enter value for Last Name
    And user clicks on Save and Close button
    Then My details page should be displayed
    When user clicks on Documents icon which is available in Edit My Details in the left hand side of the page
    Then "Edit My Details: Contacts" page should be displayed
    When user clicks on Edit(Pencil Symbol) in the License section
    And user enters License number
    And user clicks on Save button
    Then License number is saved
    And user clicks on Done button
    Then Person Gallery page should be displayed
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then My Details page should be displayed
    When user clicks on 'Edit' button on top right side of the page
    Then Edit My Details: Contact Information page should be displayed
    When user clicks on Disability icon on the left panel
    Then Disability Information page should be displayed
    And user + icon
    Then Country Pop up should be displayed
    And user selects United States from the dropdown and clicks on Continue button
    And user selects Self-Disclosed Disability as "No, I don't have a disability"(Radio Button)
    And user enters effective start state
    And user clicks on "Form CC-305: Voluntary Self-Identification for Disability" Link
    Then Form CC-305: Voluntary Self-Identification for Disability page should be displayed
    When user clicks on print icon under Tools Option
    Then Print Page should be Displayed and employee should be able to print the Page
    When user clicks on download icon under Tools Option
    Then user should able to Download Form CC-503
    When user clicks on Done button
    Then The disability information page should be displayed
    When user clicks on save and close button
    Then My Details page should be displayed
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                                              | Test File Name | Test Sheet Name  |
      | UPDATE_ADDRESS_BIOGRAPHICAL_INFO_DRIVING_LICENSE_DOCUMENTS | TestData.xlsx  | Employee_Details |

  @UPDATE_SALARY_FOR_EXISTING_EMP
  Scenario Outline: Updating salary component of an existing employee
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
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                  | Test File Name | Test Sheet Name  |
      | UPDATE_SALARY_FOR_EXISTING_EMP | TestData.xlsx  | Employee_Details |

  @EDIT_SALARY_PROPOSAL_REASON
  Scenario Outline: Admin can edit Salary Proposal Reason
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
    Then user clicks Manage Salary option from task icon menu
    And user clicks on Action button and select Edit option
    And user enters new Salary Amount under Current Salary section
    And user clicks on Continue button in Manage Salary tab
    When user clicks on Submit button in Manage Salary Review page
    And user clicks Yes button on popup modal
    And user clicks Ok button confirmation popup modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario               | Test File Name | Test Sheet Name  |
      | EDIT_SALARY_PROPOSAL_REASON | TestData.xlsx  | Employee_Details |

  @CHANGE_SALARY_BASIS_FOR_EXISTING_EMP
  Scenario Outline: Administration changing salary basis of an employee
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
    Then user clicks Manage Salary option from task icon menu
    And user clicks on Action button and select Edit option
    When user selects US Hourly Wages 40 hours from Salary Basis
    Then user closes Warning modal by clicking OK button
    And user clicks on Continue button in Manage Salary tab
    When user clicks on Submit button in Manage Salary Review page
    And user clicks Yes button on popup modal
    And user clicks Ok button confirmation popup modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                        | Test File Name | Test Sheet Name  |
      | CHANGE_SALARY_BASIS_FOR_EXISTING_EMP | TestData.xlsx  | Employee_Details |
