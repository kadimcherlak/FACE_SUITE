@EMPLOYEE_EDIT_DETAILS
Feature: Perform Edit on Employee Information

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
    Then New Mailing address should be displayed
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                         | Test File Name | Test Sheet Name  |
      | NEW_ADDRESS_ALTERNATIVE_WORK_LOCATION | TestData.xlsx  | Employee_Details |

  #@ADD_EMERGENCY_CONTACT_DETAILS
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

  @UPDATE_ADDRESS_BIOGRAPHICAL_INFO_DRIVING_LICENSE_DOCUMENTS
  Scenario Outline: Employee to update Address, BiographicalInfo and Driving License Documents
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then Personal Info page should be displayed
    When user clicks on Contact Information section
    Then Contact Information page should be displayed
    And validate user is able to view work phone, work email and home address
    When user clicks on Edit in the Address section
    And Verify that the address format is valid
    And Click on Cancel button
    And click on back button
    Then Personal Info page should be displayed
    And user clicks on Personal Details link in Person Info page
    Then Personal Details page should be displayed
    Then validate Biographical Information are displayed
    And click on back button
    And user clicks on Document Records link under Personal Info
    Then validate user is able to view the documents
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                                              | Test File Name | Test Sheet Name  |
      | UPDATE_ADDRESS_BIOGRAPHICAL_INFO_DRIVING_LICENSE_DOCUMENTS | TestData.xlsx  | Employee_Details |

  @CHANGE_SALARY_BASIS_FOR_EXISTING_EMP @DryRun
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
    Then user clicks Manage Salary option from task icon menu
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
      | CHANGE_SALARY_BASIS_FOR_EXISTING_EMP | TestData.xlsx  | Employee_Details |

  @UPDATE_SALARY_FOR_EXISTING_EMP @DryRun
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
    Then user clicks Manage Salary option from task icon menu
    And user clicks on Action button and select Edit option
    And user enters new Salary Amount under Current Salary section
    #    When user selects Use salary component checkbox
    #    Then Components tab is displayed in Manage Salary
    #    When user clicks on Add button in Components tab
    #    And user selects Promotion from Component dropdown
    #    And user enters amount in Amount field in Components tab
    And user clicks on Continue button in Manage Salary tab
    When user clicks on Submit button in Review page
    And user clicks Yes button on popup modal
    And user clicks Ok button confirmation popup modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                  | Test File Name | Test Sheet Name  |
      | UPDATE_SALARY_FOR_EXISTING_EMP | TestData.xlsx  | Employee_Details |

  @EDIT_SALARY_PROPOSAL_REASON @DryRun
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
    Then user clicks Manage Salary option from task icon menu
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
      | EDIT_SALARY_PROPOSAL_REASON | TestData.xlsx  | Employee_Details |

  @EMPLOYEE_UPLOADS_A_PHOTO @DryRun
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
    #    Then user selected photo is uploaded to system
    When user clicks on Save and Close button
    Then Personal Info page should be displayed
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario            | Test File Name | Test Sheet Name  |
      | EMPLOYEE_UPLOADS_A_PHOTO | TestData.xlsx  | Employee_Details |

  @CHANGE_ASSIGNMENT_VIA_PRSN_MGMNT @DryRun
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
