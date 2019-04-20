@TALENT_ACQUISITION
Feature: New Hire and Related Activities

  @NEW_HIRE
  Scenario Outline: Create a New Hire
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
    And new employee details are stored into csv
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario | Test File Name | Test Sheet Name    |
      | NEW_HIRE      | TestData.xlsx  | Talent_Acquisition |

  @NEW_HIRE_NON_WORKER
  Scenario Outline: Create a Non Worker New Hire
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link in Navigator Pane
    And user clicks on Add a Nonworker on right side of the page under Tasks pane
    Then new Hire an employee screen should be displayed
    When user enter details in Identification tab
    And user enter details in Person information tab
    And user enter details in Employment Information tab
    And user enter details in Compensation and Other Information tab
    Then Review page should be displayed in view only mode
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    And new employee details are stored into csv
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario       | Test File Name | Test Sheet Name    |
      | NEW_HIRE_NON_WORKER | TestData.xlsx  | Talent_Acquisition |

  @NEW_HIRE_PENDING_WORKER
  Scenario Outline: Create a Pending Worker New Hire
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link in Navigator Pane
    And user clicks on Add a Pending Worker on right side of the page under Tasks pane
    Then new Hire an employee screen should be displayed
    When user enter details in Identification tab
    And user enter details in Person information tab
    And user enter details in Employment Information tab
    And user enter details in Compensation and Other Information tab
    Then Review page should be displayed in view only mode
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    And new employee details are stored into csv
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario           | Test File Name | Test Sheet Name    |
      | NEW_HIRE_PENDING_WORKER | TestData.xlsx  | Talent_Acquisition |

  @NEW_HIRE_CONTINGENT_WORKER
  Scenario Outline: Create a Contingent Worker New Hire
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link in Navigator Pane
    And user clicks on Add a Contingent Worker on right side of the page under Tasks pane
    Then new Hire an employee screen should be displayed
    When user enter details in Identification tab
    And user enter details in Person information tab
    And user enter details in Employment Information tab
    And user enter details in Compensation and Other Information tab
    Then Review page should be displayed in view only mode
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    And new employee details are stored into csv
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario              | Test File Name | Test Sheet Name    |
      | NEW_HIRE_CONTINGENT_WORKER | TestData.xlsx  | Talent_Acquisition |

  @CONVERT_NONWORKER_TO_CONTINGENT_WORKER
  Scenario Outline: Convert a Non Worker to Contingent Worker
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
    #Then Manage work relationship page is displayed
    And user clicks on Action button and select Terminate option
    Then user navigated to Termination Details page
    And user selects Termination Action
    And user selects Work Incident or Work Related Illness Reason
    And user updates Termination date
    And user selects Yes as Recommended for Rehire
    And user clicks on Review button in termination page
    Then user clicks on Submit button in termination review page
    And user clicks Yes button on popup modal in termination review page
    And user clicks Ok button confirmation popup modal in termination review page
    When user clicks on Navigator icon
    And user clicks on New Person link in Navigator Pane
    And user clicks on Add a Contingent Worker on right side of the page under Tasks pane
    Then new Hire an employee screen should be displayed
    When user enter contingent worker details in Identification tab
    Then Matching Person Records should be displayed
    And user clicks on Select Person button
    Then Warning message should be displayed
    When user clicks on OK button to create new new work relationship
    Then Identification tab should be displayed
    When user clicks next button in identification tab
    When user clicks next button in Person information tab
    And user enter details in Employment Information tab
    And user enter details in Compensation and Other Information tab
    Then Review page should be displayed in view only mode
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                          | Test File Name | Test Sheet Name    |
      | CONVERT_NONWORKER_TO_CONTINGENT_WORKER | TestData.xlsx  | Talent_Acquisition |

  @CONVERT_PENDING_WORKER_TO_EMPLOYEE
  Scenario Outline: Convert a Pending Worker to an Employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link in Navigator Pane
    Then Pending Workers grid should be displayed
    And user search Pending worker Person number generated from previous step
    When user select Pending worker and click Convert under Actions Menu
    Then Convert Pending Worker: Identification page should be displayed
    When user validates details in Identification tab
    And user validates details in Person Information tab
    And user validates details in Person Profile tab
    And user validates details in Employment Information tab
    And user validates details in Compensation and Other Information tab
    Then Review page should be displayed in view only mode
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    Then Pending Workers grid should be displayed
    And user checks if the pending worker is not displayed in Pending Workers grid
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                      | Test File Name | Test Sheet Name    |
      | CONVERT_PENDING_WORKER_TO_EMPLOYEE | TestData.xlsx  | Talent_Acquisition |

  @QUICK_CONVERT_PENDING_WORKER_TO_EMPLOYEE
  Scenario Outline: Quick Convert of a Pending worker
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on New Person link in Navigator Pane
    Then Pending Workers grid should be displayed
    And user search Pending worker Person number generated from previous step
    When user select Pending worker and click Quick Convert under Actions Menu
    Then confirmation popup box is displayed
    When user clicks on OK button
    Then Pending Workers grid should be displayed
    And user checks if the pending worker is not displayed in Pending Workers grid
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                            | Test File Name | Test Sheet Name    |
      | QUICK_CONVERT_PENDING_WORKER_TO_EMPLOYEE | TestData.xlsx  | Talent_Acquisition |

  @CONVERT_CONTINGENT_WORKER_TO_EMPLOYEE
  Scenario Outline: Convert a Contingent Worker to an Employee
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
    And user clicks on Action button and select Terminate option
    Then user navigated to Termination Details page
    And user selects Termination Action
    And user selects Work Incident or Work Related Illness Reason
    And user updates Termination date
    And user selects Yes as Recommended for Rehire
    And user clicks on Review button in termination page
    Then user clicks on Submit button in termination review page
    And user clicks Yes button on popup modal in termination review page
    And user clicks Ok button confirmation popup modal in termination review page
    When user clicks on Navigator icon
    And user clicks on New Person link in Navigator Pane
    And user clicks on Hire an Employee on right side of the page under Tasks pane
    Then new Hire an employee screen should be displayed
    When user enter contingent worker details in Identification tab
    Then Matching Person Records should be displayed
    And user clicks on Select Person button
    Then Warning message should be displayed
    When user clicks on OK button to create new new work relationship
    Then Identification tab should be displayed
    When user clicks next button in identification tab
    When user clicks next button in Person information tab
    And user enter details in Employment Information tab
    And user enter details in Compensation and Other Information tab
    Then Review page should be displayed in view only mode
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    And new employee details are stored into csv
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                         | Test File Name | Test Sheet Name    |
      | CONVERT_CONTINGENT_WORKER_TO_EMPLOYEE | TestData.xlsx  | Talent_Acquisition |

  @CREATE_ELEMENT_ENTRIES
  Scenario Outline: Create Element Entries for the New Hire employee
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
    And user clicks on Manage Element Entries on right side of the page under Tasks pane
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
      | CREATE_ELEMENT_ENTRIES | TestData.xlsx  | Talent_Acquisition |

  @UPDATE_ELEMENT_ENTRIES
  Scenario Outline: Update Element Entries for the New Hire employee
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
    And user clicks on Manage Element Entries on right side of the page under Tasks pane
    Then manage element entries screen should be displayed
    And user clicks on Edit and select Correct option
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

  @DELETE_ELEMENT_ENTRIES
  Scenario Outline: Delete Element Entries for the New Hire employee
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
    And user clicks on Manage Element Entries on right side of the page under Tasks pane
    Then manage element entries screen should be displayed
    When user selects the element entry to be deleted
    And user clicks on Delete option
    Then Manage Element entries page should be displayed with ADP Auto & Home row deleted
    And user clicks on Sign Out option
    And Sign out should be successful

    Examples:
      | Test Scenario          | Test File Name | Test Sheet Name    |
      | DELETE_ELEMENT_ENTRIES | TestData.xlsx  | Talent_Acquisition |

  @UPDATE_I9_STATUS
  Scenario Outline: Verify PPS is able to update I9 Status
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
    Then Manage Work Relationship page is displayed
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
      | UPDATE_I9_STATUS | TestData.xlsx  | Talent_Acquisition |

  @EDIT_PROJECTED_ENDDATE
  Scenario Outline: Perform Edit Projected end date for limited term Employee
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
    When user clicks on Edit and select Correct option
    Then Correct Employment page should be displayed
    When user Enter all the Mandatory fields of Correct Employment window and click Ok button
    Then Projected End Date field Should be Editable
    When User enters Projected End Date
    And User Clicks on Review Button
    Then Review page should be displayed in view only mode
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario          | Test File Name | Test Sheet Name    |
      | EDIT_PROJECTED_ENDDATE | TestData.xlsx  | Talent_Acquisition |

  @EDIT_SENIORITY_DATE
  Scenario Outline: Update hire date in Manage Work Relationship screen
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
    Then user click on Actions button and select Edit option
    And Enter the seniority date under Legal Employer and under Enterprise
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario       | Test File Name | Test Sheet Name    |
      | EDIT_SENIORITY_DATE | TestData.xlsx  | Talent_Acquisition |

  @LEGAL_ENTITY_TRANSFER
  Scenario Outline: Perform Global Transfer for New Hire Employee
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
      | Test Scenario         | Test File Name | Test Sheet Name    |
      | LEGAL_ENTITY_TRANSFER | TestData.xlsx  | Talent_Acquisition |

  @MANAGE_PERSON_NAME_CORRECTION
  Scenario Outline: Correct the First Name of a Person
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
    And user clicks on Manage Person on right side of the page under Tasks pane
    Then Mange Person page should be displayed
    When user clicks on Edit and select Correct option
    Then Correct Name page should be displayed
    When user Enter all the Mandatory fields of Correct Name window and click Ok button
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    When user click on Done button at the top
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                 | Test File Name | Test Sheet Name    |
      | MANAGE_PERSON_NAME_CORRECTION | TestData.xlsx  | Talent_Acquisition |

  @JOB_CHANGE
  Scenario Outline: Perform Job Change for New Hire Employee
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
    And user enter details in Employment Information tab
    And user clicks on Review button in Management Employment page
    And user clicks on Submit button in Review page
    And user clicks Yes button on popup modal
    And user clicks Ok button confirmation popup modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario | Test File Name | Test Sheet Name    |
      | JOB_CHANGE    | TestData.xlsx  | Talent_Acquisition |

  @CORRECT_INFORMATION
  Scenario Outline: Perform Location Correction for New Hire Employee
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Person Management link in Navigator Pane
    Then Person Management: Search screen should be displayed
    And user enter the Person number generated from previous step in Person Number field
    And user click on Search button till person displayed
    Then Employee name should be listed in search results
    When user click on employee name link in search results
    And user clicks on Edit and select Correct option
    Then Correct Employment page should be displayed
    When user enters details in Correct Employment Window and click on Ok button
    And user enter details in Employment Information tab
    And user clicks on Review button in Management Employment page
    And user clicks on Submit button in Review page
    And user clicks Yes button on popup modal
    And user clicks Ok button confirmation popup modal
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario       | Test File Name | Test Sheet Name    |
      | CORRECT_INFORMATION | TestData.xlsx  | Talent_Acquisition |

#  @NEW_HIRE_QUICK_ACTIONS  - Not in  Datasheet
#  Scenario Outline: Create a New Hire using Quick Actions and Responsive UI
#    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
#    And user login to Oracle Applications Cloud web page
#    When user clicks on Quick Actions icon
#    Then Quick Actions page should be displayed
#    And user clicks on Hire an Employee under All Actions section
#    Then user selects relevant actions on Hire an Employee page
#    When user enter details in When and Why section
#    And user enter details in Communication Info section
#    And user enter details in Addresses section
#    And user enter details in Legislative Info section
#    And user enter details in Passport Info section
#    And user enter details in Citizenship Info section
#    And user enter details in Driver's Licenses section
#    And user enter details in Visas and Permits section
#    And user enter details in Family and Emergency Contacts section
#    And user enter details in Employment Details section
#    And user enter details in Managers section
#    And user enter details in Contract Info section
#    And user enter details in Work Relationship Info section
#    And user enter details in Payroll Details section
#    And user enter details in Salary section
#    And user enter details in Compensation section
#    And user enter details in Direct Reports section
#    And user enter details in Comments and Attachments section
#    When user clicks on submit button
#    Then Quick Actions page should be displayed
#    When user clicks on Navigator icon
#    And user clicks on Person Management Link in Navigation pane
#    Then Person Management: Search screen should be displayed
#    And user search for the person newly created using Quick Actions
#    When user clicks on Sign Out option
#    Then Sign out should be successful
#
#    Examples:
#      | Test Scenario          | Test File Name | Test Sheet Name    |
#      | NEW_HIRE_QUICK_ACTIONS | TestData.xlsx  | Talent_Acquisition |
#
  @NEW_HIRE_PENDING_WORKER_QUICK_ACTIONS
  Scenario Outline: Create a New Pending Worker using Quick Actions and Responsive UI
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user navigates to Quick Action menu
    Then the Quick Action page should be displayed
    And user clicks on Add a Contingent Worker link from the Quick Action menu
    Then user clicks on Continue button for Hire
    When user enter details in When and Why section
#    And user enter details in Communication Info section
#    And user enter details in Addresses section
#    And user enter details in Legislative Info section
#    And user enter details in Passport Info section
#    And user enter details in Citizenship Info section
#    And user enter details in Driver's Licenses section
#    And user enter details in Visas and Permits section
#    And user enter details in Family and Emergency Contacts section
#    And user enter details in Employment Details section
#    And user enter details in Managers section
#    And user enter details in Contract Info section
#    And user enter details in Work Relationship Info section
#    And user enter details in Payroll Details section
#    And user enter details in Salary section
#    And user enter details in Compensation section
#    And user enter details in Direct Reports section
#    And user enter details in Comments and Attachments section
#    When user clicks on submit button
#    Then Quick Actions page should be displayed
#    When user clicks on Navigator icon
#    And user clicks on Person Management Link in Navigation pane
#    Then Person Management: Search screen should be displayed
#    And user search for the person newly created using Quick Actions
#    When user clicks on Sign Out option
#    Then Sign out should be successful

    Examples:
      | Test Scenario                         | Test File Name | Test Sheet Name    |
      | NEW_HIRE_PENDING_WORKER_QUICK_ACTIONS | TestData.xlsx  | Talent_Acquisition |
#
#  @NEW_HIRE_CONTINGENT_WORKER_QUICK_ACTIONS  - Not in  Datasheet
#  Scenario Outline: Create a New Contingent Worker using Quick Actions and Responsive UI
#    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
#    And user login to Oracle Applications Cloud web page
#    When user clicks on Quick Actions icon
#    Then Quick Actions page should be displayed
#    And user clicks on Add a Contingent Worker under All Actions section
#    Then user selects relevant actions on Add a Contingent Worker page
#    When user enter details in When and Why section
#    And user enter details in Communication Info section
#    And user enter details in Addresses section
#    And user enter details in Legislative Info section
#    And user enter details in Passport Info section
#    And user enter details in Citizenship Info section
#    And user enter details in Driver's Licenses section
#    And user enter details in Visas and Permits section
#    And user enter details in Family and Emergency Contacts section
#    And user enter details in Employment Details section
#    And user enter details in Managers section
#    And user enter details in Contract Info section
#    And user enter details in Work Relationship Info section
#    And user enter details in Payroll Details section
#    And user enter details in Salary section
#    And user enter details in Compensation section
#    And user enter details in Direct Reports section
#    And user enter details in Comments and Attachments section
#    When user clicks on submit button
#    Then Quick Actions page should be displayed
#    When user clicks on Navigator icon
#    And user clicks on Person Management Link in Navigation pane
#    Then Person Management: Search screen should be displayed
#    And user search for the person newly created using Quick Actions
#    When user clicks on Sign Out option
#    Then Sign out should be successful
#
#    Examples:
#      | Test Scenario                            | Test File Name | Test Sheet Name    |
#      | NEW_HIRE_CONTINGENT_WORKER_QUICK_ACTIONS | TestData.xlsx  | Talent_Acquisition |
#
  @NEW_HIRE_NON_WORKER_QUICK_ACTIONS
  Scenario Outline: Create a New Non Worker using Quick Actions and Responsive UI
    Given user runs <Test Scenario> from <Test File Name> under <Test Sheet Name>
    And user login to Oracle Applications Cloud web page
    When user navigates to Quick Action menu
    Then the Quick Action page should be displayed
    And user clicks on Add a Nonworker link from the Quick Action menu
    Then new Hire an employee screen should be displayed
    When user enter details in Identification tab
    And user enter details in Person information tab
    And user enter details in Employment Information tab
    And user enter details in Compensation and Other Information tab
    Then Review page should be displayed in view only mode
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    And new employee details are stored into csv
    When user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                     | Test File Name | Test Sheet Name    |
      | NEW_HIRE_NON_WORKER_QUICK_ACTIONS | TestData.xlsx  | Talent_Acquisition |

  @MANANGE_PERSON_NAME_UPDATE
  Scenario Outline: Update the First Name of a Person
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
    And user clicks on Manage Person on right side of the page under Tasks pane
    Then Mange Person page should be displayed
    And user clicks on Edit button and select Update option in Manage Person
    When user Enter all the Mandatory fields of Update Name window and click Ok button
    When user clicks on submit button
    And clicks ok in the Warning and confirmation message displayed
    Then Page should be submitted successfully
    When user click on Done button at the top
    And user clicks on Sign Out option
    Then Sign out should be successful

    Examples:
      | Test Scenario                  | Test File Name | Test Sheet Name    |
      | MANANGE_PERSON_NAME_CORRECTION | TestData.xlsx  | Talent_Acquisition |