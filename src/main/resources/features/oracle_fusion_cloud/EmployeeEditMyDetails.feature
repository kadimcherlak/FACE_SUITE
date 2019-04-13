@EMPLOYEE_EDIT_DETAILS
Feature: Perform Edit on Employee Information

  @NEW_HIRE_USING_HDL
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
      | NEW_HIRE_USING_HDL | TestData.xlsx  | Employee_Details |

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
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                                 | Test File Name | Test Sheet Name  |
      | UPDATE_PERSONAL_PAYMENT_METHODS_EXPENSES_ONLY | TestData.xlsx  | Employee_Details |

  @VALIDATE_ADDRESS_FORMAT
  Scenario Outline: Employee to validate self Address Format
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

  @EMPLOYEE_UPLOADS_A_PHOTO
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

  @ADD_SKILLS_AND_QUALIFICATIONS
  Scenario Outline: Employee add Skills and Qualification details
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then Personal Info page should be displayed
    When user clicks on Personal Details link in Person Info page
    Then Personal Details page should be displayed
    And user clicks on ellipsis on Employee Logo name
    Then users More option menu is displayed
    And user clicks Skills and Qualifications link
    Then Skills and Qualifications page should be displayed
    When user clicks on Edit button on top right side
    Then edit Skills and Qualifications page should be displayed
    When user clicks on Add Content and select Degrees Link
    Then Degrees page should be displayed
    And user enter Degree details
    Then user clicks on Submit button in edit Skills and Qualifications page
    When user clicks on Add Content and select Licenses and Certifications Link
    Then Licenses and Certifications page should be displayed
    And user enter Licenses and Certifications details
    Then user clicks on Submit button in edit Skills and Qualifications page
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                        | Test File Name | Test Sheet Name  |
      | ADD_SKILLS_AND_QUALIFICATION_DETAILS | TestData.xlsx  | Employee_Details |

  @CHANGE_SALARY_BASIS_FOR_EXISTING_EMP
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
      | CHANGE_SALARY_BASIS_FOR_EXISTING_EMP | TestData.xlsx  | Employee_Details |

  @UPDATE_SALARY_FOR_EXISTING_EMP
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

  @EDIT_SALARY_PROPOSAL_REASON
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
      | EDIT_SALARY_PROPOSAL_REASON | TestData.xlsx  | Employee_Details |

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

  @ENTER_JOB_CHANGE
  Scenario Outline: Admin updating the Job Change of an employee
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
      | Test Scenario    | Test File Name | Test Sheet Name  |
      | ENTER_JOB_CHANGE | TestData.xlsx  | Employee_Details |

  @ADDRESS_CORRECTION
  Scenario Outline: Admin makes Address Correction of a Person
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
    Then from task menu user clicks on Manage Person option
    And user clicks on Edit button and select Correct option for Home Address
    Then update the address in correct address format and click on ok button
    Then validate the correct address is updated
    And user clicks on Submit button in Person Management screen
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario      | Test File Name | Test Sheet Name  |
      | ADDRESS_CORRECTION | TestData.xlsx  | Employee_Details |

  @MANAGE_PERSON_ADDRESS_UPDATE
  Scenario Outline: Admin updates Address of a Person
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
    Then from task menu user clicks on Manage Person option
    And user clicks on Edit button and select Update option for Home Address
    And enter the effective date
    Then update the address in correct address format and click on ok button
    And user clicks on Submit button in Person Management screen
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                | Test File Name | Test Sheet Name  |
      | MANAGE_PERSON_ADDRESS_UPDATE | TestData.xlsx  | Employee_Details |

  @MANAGE_PERSON_ADD_ALTERNATE_ADDRESS
  Scenario Outline: Admin adds a Secondary Address Type of a Person
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
    Then from task menu user clicks on Manage Person option
    And user clicks on create address button and select the address type
    Then add secondary address details and click on ok button
    Then validate the correct address is updated
    And user clicks on Submit button in Person Management screen
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                       | Test File Name | Test Sheet Name  |
      | MANAGE_PERSON_ADD_ALTERNATE_ADDRESS | TestData.xlsx  | Employee_Details |

  @ENTER_STATUS_ASSIGNMENT_CHANGE
  Scenario Outline: Admin updating the assignment status and salary of an employee
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
    And user click on Task Icon on the right side
    Then from task menu user clicks on Manage Salary option
    When user clicks on Propose New Salary button
    And user enters details in Propose New Salary section
    Then New Salary section should be displayed
    When user enters details in New Salary section
    And user click on continue button in New Salary section
    Then Review page should be validated in Manage Salary section
    When user click on Submit button
    Then The transaction should be saved properly and My Team page should be displayed
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                  | Test File Name | Test Sheet Name  |
      | ENTER_STATUS_ASSIGNMENT_CHANGE | TestData.xlsx  | Employee_Details |

  @ADDING_EXISTING_EMPLOYEE_AS_AN_EMERGENCY_CONTACT
  Scenario Outline: Manage Person - Add an Existing Employee as an Emergency Contact
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
    When user clicks Manage Person option from task icon menu
    Then Manage Person page is displayed
    And user clicks Contacts link on Manage Person page
    Then Personal Relationships page is displayed
    When user clicks on "Create from Existing Person" option in Personal Relationships page
    Then modal "Create Contact from Existing Person" is displayed
    And user enters details in Relationship Information modal
    And user clicks OK button in contact creation modal
    Then user clicks on Submit button in Manage Person
    When user clicks Yes button on popup modal
    Then user is displayed with confimation modal
    And user clicks OK button on Confirmation modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                                    | Test File Name | Test Sheet Name  |
      | ADDING_EXISTING_EMPLOYEE_AS_AN_EMERGENCY_CONTACT | TestData.xlsx  | Employee_Details |

  @CORRECT_PERSONAL_DESCRIPTIVE_FLEXFIELD_INFORMATION
  Scenario Outline: Manage Person - Correct Personal Descriptive Flexfield Information
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
    When user clicks Manage Person option from task icon menu
    Then Manage Person page is displayed
    When user clicks on Edit button in Manage Person page to edit Biographical Info
    Then persons Biographical Info modal displayed
    And user enters Biographical infomation from Manage Person page
    When user clicks OK button on Biographical Info modal
    Then user clicks on Submit button in Manage Person
    And Warning modal is diplayed to confirm the request
    When user clicks Yes button on popup modal
    Then user is displayed with confimation modal
    And user clicks OK button on Confirmation modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                                      | Test File Name | Test Sheet Name  |
      | CORRECT_PERSONAL_DESCRIPTIVE_FLEXFIELD_INFORMATION | TestData.xlsx  | Employee_Details |

  @MODIFY_EXISTING_EMERGENCY_CONTACT
  Scenario Outline: Manage Person - Modify Existing Emergency Contact
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
    When user clicks Manage Person option from task icon menu
    Then Manage Person page is displayed
    And user clicks Contacts link on Manage Person page
    Then Personal Relationships page is displayed
    When user clicks on "Edit" option in Personal Relationships page
    Then modal "Edit Contact" is displayed
    And user clicks on Edit optoin in Personal Info section
    And user selects Correct option to update details in Personal Info
    And user updates First name and Last name in Personal Info modal
    And user adds contact details in Phone section
    And user clicks on Edit option in Address section
    And user selects Update option to update details in Address modal
    And user updates address fields as need and click OK button
    Then user clicks on Submit button in Manage Person
    When user clicks Yes button on popup modal
    Then user is displayed with confimation modal
    And user clicks OK button on Confirmation modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                     | Test File Name | Test Sheet Name  |
      | MODIFY_EXISTING_EMERGENCY_CONTACT | TestData.xlsx  | Employee_Details |

  @ADD_EXTRA_INFORMATION_EIT
  Scenario Outline: Manage Person - Add Extra Information (EIT)
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
    When user clicks Manage Person option from task icon menu
    Then Manage Person page is displayed
    And user clicks Extra Information link on Manage Person page
    Then Extra Information page is displayed
    When user clicks on Edit button to add Extra information
    And user selects Correct option from Edit menu
    And user update all addition fields for Extra information
    Then user clicks on Submit button in Manage Person
    When user clicks Yes button on popup modal
    And user clicks OK button on Confirmation modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario             | Test File Name | Test Sheet Name  |
      | ADD_EXTRA_INFORMATION_EIT | TestData.xlsx  | Employee_Details |

  @MODIFY_EXTRA_INFORMATION_EIT
  Scenario Outline: Manage Person - Modify Extra Information (EIT)
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
    When user clicks Manage Person option from task icon menu
    Then Manage Person page is displayed
    And user clicks Extra Information link on Manage Person page
    Then Extra Information page is displayed
    When user clicks on Edit button to add Extra information
    And user selects Update option to update details in Extra Information page
    And user selects Effective update date to update Extra Information and clicks OK button
    And user update all addition fields for Extra information
    Then user clicks on Submit button in Manage Person
    When user clicks Yes button on popup modal
    And user clicks OK button on Confirmation modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                | Test File Name | Test Sheet Name  |
      | MODIFY_EXTRA_INFORMATION_EIT | TestData.xlsx  | Employee_Details |

  @EMPLOYEE_CREATE_PROFILE_CONTENT_TYPE_INFORMATION
  Scenario Outline: Manage Talent Profile - Employee Create Profile Content Type Information
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
    When user clicks Manage Talent Profile option from task icon menu
    Then person talent profile page is displayed in Manage Talent page
    And user clicks on Edit button in Manage Talent page
    Then Area of Expertise section is displayed in Manage Talent page
    And user clicks on Add Content and select Degrees Link
    Then Degrees page should be displayed
    And user enter Degree details
    Then user clicks on Submit button in edit Skills and Qualifications page
    When user clicks on Add Content and select Licenses and Certifications Link
    Then Licenses and Certifications page should be displayed
    And user enter Licenses and Certifications details
    Then user clicks on Submit button in edit Skills and Qualifications page
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                                    | Test File Name | Test Sheet Name  |
      | EMPLOYEE_CREATE_PROFILE_CONTENT_TYPE_INFORMATION | TestData.xlsx  | Employee_Details |

  @CANCEL_WORK_RELATIONSHIP_OF_PENDING_WORKER
  Scenario Outline: Cancel Work Relationship of Pending Worker
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
    Then Manage Work Relationship page is displayed
    And user clicks on Action button and selects Cancel Work Relationship
    Then user clicks on Submit button in termination review page
    And user clicks Yes button on popup modal
    And user clicks Ok button confirmation popup modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                              | Test File Name | Test Sheet Name  |
      | CANCEL_WORK_RELATIONSHIP_OF_PENDING_WORKER | TestData.xlsx  | Employee_Details |

  @EMPLOYEE_CREATE_PROFILE_CONTENT_TYPE_INFORMATION_QUICK_ACTIONS
  Scenario Outline: Employee Termination from Quick Action Menu
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user navigates to Quick Action menu
    Then the Quick Action page should be displayed
    And user clicks on Manage Talent Profile option from All Actions list
    Then Person Profile tab is displayed
    And search Person Profile with Location
    Then Profile section is populated with Person profile links
    And user clicks on first person name link from search result
    Then Persons Skills and Qualifications page displayed
    And user clicks on Edit button on top right side
    And user clicks on Add Content and select Degrees Link
    Then Degrees page should be displayed
    And user enter Degree details
    Then user clicks on Submit button in edit Skills and Qualifications page
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                                                  | Test File Name | Test Sheet Name  |
      | EMPLOYEE_CREATE_PROFILE_CONTENT_TYPE_INFORMATION_QUICK_ACTIONS | TestData.xlsx  | Employee_Details |

  #  @NEW_ADDRESS_ALTERNATIVE_WORK_LOCATION - Not in  Datasheet
  #  Scenario Outline: Employee add New Address of type Alternative Work Location
  #    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
  #    And user login to Oracle Applications Cloud web page
  #    When user clicks on Navigator icon
  #    And user clicks on Personal Information link under About me section
  #    Then Personal Info page should be displayed
  #    When user clicks on Contact Information section
  #    Then Contact Information page should be displayed
  #    When user clicks on Add icon in the Address section
  #    And user Enter Details in Address fields
  #    And user click on submit button in Contact Information page
  #    Then New Mailing address should be displayed
  #    When user clicks on Sign Out option
  #    Then Sign out should be successful
  #
  #    Examples:
  #      | Test Scenario                         | Test File Name | Test Sheet Name  |
  #      | NEW_ADDRESS_ALTERNATIVE_WORK_LOCATION | TestData.xlsx  | Employee_Details |
  @CREATE_PAY_METHOD_WITH_EXISTING_BANK
  Scenario Outline: Employee to update Create Pay Method with Existing Bank
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
    When user clicks Manage Personal Payment Methods option from task icon menu
    Then Person Management page is displayed
    And user clicks on + icon
    Then Personal Payment Method page should be displayed
    And user enter value for Name,Payment Method and Percentage
    And user clicks on + icon under Bank Accounts
    Then Create Bank Account page should be displayed
    And enter the bank account details
    And user clicks on Submit button
    Then Person Management page is displayed
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                        | Test File Name | Test Sheet Name  |
      | CREATE_PAY_METHOD_WITH_EXISTING_BANK | TestData.xlsx  | Employee_Details |

  @CREATE_PAY_METHOD_WITH_EXISTING_BANK_QUICK_ACTION
  Scenario Outline: Employee to update Create Pay Method with Existing Bank form Quick Action
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button till person displayed
    Then Employee name should be listed in search results
    And user clicks on Actions ICON Orange Chevron next to Employee Name
    Then click on Payroll Option and select Manage Personal Payment Methods
    And user clicks on + icon
    Then Personal Payment Method page should be displayed
    And user enter value for Name,Payment Method and Percentage
    And user clicks on + icon under Bank Accounts
    Then Create Bank Account page should be displayed
    And enter the bank account details
    And user clicks on Submit button
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                                     | Test File Name | Test Sheet Name  |
      | CREATE_PAY_METHOD_WITH_EXISTING_BANK_QUICK_ACTION | TestData.xlsx  | Employee_Details |

  @CREATE_PAY_METHOD_WITH_NEW_BANK
  Scenario Outline: Employee to update Create Pay Method with New Bank
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
    When user clicks Manage Personal Payment Methods option from task icon menu
    Then Person Management page is displayed
    And user clicks on + icon
    Then Personal Payment Method page should be displayed
    And user enter value for Name,Payment Method and Percentage
    And user clicks on + icon under Bank Accounts
    Then Create Bank Account page should be displayed
    And enter the bank account details
    And user clicks on Submit button
    Then Person Management page is displayed
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                   | Test File Name | Test Sheet Name  |
      | CREATE_PAY_METHOD_WITH_NEW_BANK | TestData.xlsx  | Employee_Details |

  @CREATE_PAY_METHOD_WITH_NEW_BANK_QUICK_ACTION
  Scenario Outline: Employee to update Create Pay Method with Existing Bank form Quick Action
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button till person displayed
    Then Employee name should be listed in search results
    And user clicks on Actions ICON Orange Chevron next to Employee Name
    Then click on Payroll Option and select Manage Personal Payment Methods
    And user clicks on + icon
    Then Personal Payment Method page should be displayed
    And user enter value for Name,Payment Method and Percentage
    And user clicks on + icon under Bank Accounts
    Then Create Bank Account page should be displayed
    And enter the bank account details
    And user clicks on Submit button
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples: 
      | Test Scenario                                | Test File Name | Test Sheet Name  |
      | CREATE_PAY_METHOD_WITH_NEW_BANK_QUICK_ACTION | TestData.xlsx  | Employee_Details |
#  @ADD_EMERGENCY_CONTACT_DETAILS - Not in  Datasheet
#  Scenario Outline: Employee add Emergency Contact details
#    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
#    And user login to Oracle Applications Cloud web page
#    When user clicks on Navigator icon
#    And user clicks on Personal Information link under About me section
#    Then Personal Info page should be displayed
#    When user clicks on Family and Emergency Contacts section
#    Then Family and Emergency Contacts page should be displayed
#    When user clicks on Add and Create a New Contact option in My Contacts section
#    Then New Contact page should be displayed
#    And user Enter Details in New Contact page
#    And user click on submit button in New Contact page
#    Then Family and Emergency Contacts page should be displayed
#    When user clicks on Sign Out option
#    Then Sign out should be successful
#
#    Examples:
#      | Test Scenario                 | Test File Name | Test Sheet Name  |
#      | ADD_EMERGENCY_CONTACT_DETAILS | TestData.xlsx  | Employee_Details |
#
#  @UPDATE_PERSONAL_PAYMENT_METHODS_NON_EXPENSES_ONLY  - Not in  Datasheet
#  Scenario Outline: Employee to update Personal Payment Method (Non - Expenses only) details
#    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
#    And user login to Oracle Applications Cloud web page
#    When user clicks on Navigator icon
#    And user clicks on Personal Information link under About me section
#    Then My Details page should be displayed
#    When user clicks on More Information icon 'i'  under name icon
#    Then A pop up window with employee details should be displayed.
#    When user clicks on Actions (v) button
#    Then the values Absence,Payroll,Personal and Employment should be displayed
#    When user clicks Manage Personal Payment Methods under Payroll option
#    Then Create Personal Payment Method page should be displayed
#    And user clicks on + icon
#    Then Personal Payment Method page should be displayed
#    And user enter value for Name as "HSBC"
#    And user enter value from Organization Payment Method dropdown as "Non - Expenses"
#    And user clicks on + icon under Bank Accounts
#    Then Create Bank Account page should be displayed
#    And user enter value for Account Number as "464613164666"
#    And user enter value from Account type as "Savings"
#    And user enter value for Routing Number as "122105155"
#    And user enter value for Routing Account Holder
#    And user clicks on Submit button
#    Then Overview personal payments page will be displayed
#    And user clicks on Done button
#    Then Person Gallery page should be displayed
#    When user clicks on Sign Out option
#    Then Sign out should be successful
#
#    Examples:
#      | Test Scenario                                     | Test File Name | Test Sheet Name  |
#      | UPDATE_PERSONAL_PAYMENT_METHODS_NON_EXPENSES_ONLY | TestData.xlsx  | Employee_Details |
#
#  @UPDATE_ADDRESS_BIOGRAPHICAL_INFO_DRIVING_LICENSE_DOCUMENTS  - Not in  Datasheet
#  Scenario Outline: Employee to update Address, BiographicalInfo and Driving License Documents
#    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
#    And user login to Oracle Applications Cloud web page
#    When user clicks on Navigator icon
#    And user clicks on Personal Information link under About me section
#    Then Personal Info page should be displayed
#    When user clicks on Contact Information section
#    Then Contact Information page should be displayed
#    And validate user is able to view work phone, work email and home address
#    When user clicks on Edit in the Address section
#    And Verify that the address format is valid
#    And Click on Cancel button
#    And click on back button
#    Then Personal Info page should be displayed
#    And user clicks on Personal Details link in Person Info page
#    Then Personal Details page should be displayed
#    Then validate Biographical Information are displayed
#    And click on back button
#    And user clicks on Document Records link under Personal Info
#    Then validate user is able to view the documents
#    When user clicks on Sign Out option
#    Then Sign out should be successful
#
#    Examples:
#      | Test Scenario                                              | Test File Name | Test Sheet Name  |
#      | UPDATE_ADDRESS_BIOGRAPHICAL_INFO_DRIVING_LICENSE_DOCUMENTS | TestData.xlsx  | Employee_Details |
