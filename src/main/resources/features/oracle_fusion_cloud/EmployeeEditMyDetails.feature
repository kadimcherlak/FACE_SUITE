@Employee_Edit_Details
Feature: Perform edit on Address,Contact Type,Personal Payment Method and disability Information 

  @NewAddress_alternative_work_location
  Scenario Outline:  As an Employee, i should be able to add a New Address to indicate an alternative work location
    Given user runs <Test Scenario>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then My Details page should be displayed
    When user clicks on Edit button on top right side
    Then Edit My Details: Contact Information page should be displayed
    When user clicks on Add icon in the Address section 
    And user Enter Details in Address fields
    And user click on Save and Close button
    Then My Details page should be displayed
    When user click on Sign Out option
    Then Sign out should be successful


    Examples:
      | Test Scenario      |
      | New Hire Scenario1 |

 @Add_Emergency_Contact_details
  Scenario Outline:  As an Employee, i should be able to select a contact type from Emergency Contact list and add details
    Given user runs <Test Scenario>
    And user login to Oracle Applications Cloud web page
    When user clicks on Navigator icon
    And user clicks on Personal Information link under About me section
    Then My Details page should be displayed
    When user clicks on Edit button on top right side
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
    When user click on Sign Out option
    Then Sign out should be successful

   Examples:
     | Test Scenario      |
     | New Hire Scenario1 |
#@Update_Personal_Payment_Method_Expenses_only
  #Scenario Outline:  As an Employee, i should be able to update Personal Payment Method (Expenses only) details
    #Given user runs <Test Scenario>
    #And user login to Oracle Applications Cloud web page
    #When user clicks on Navigator icon
    #And user clicks on Personal Information link under About me section
    #Then My Details page should be displayed
    #When user clicks on More Information icon 'i'  under name icon
    #Then A pop up window with employee details should be displayed.
    #When user clicks on Actions (v) button
    #Then the values Absence,Payroll,Personal and Employment should be displayed
    #When user clicks Manage Personal Payment Methods under Payroll option
    #Then Create Personal Payment Method page should be displayed
    #And user clicks on + icon
    #Then Personal Payment Method page should be displayed
    #And user enter value for Name as "BNB"
    #And user enter value from Organization Payment Method dropdown as "Expenses"
    #And user clicks on + icon under Bank Accounts
    #Then Create Bank Account page should be displayed
    #And user enter value for Account Number as "464613164664"
    #And user enter value from Account type as "Savings"
    #And user enter value for Routing Number as "122105155"
    #And user enter value for Routing Account Holder
    #And user clicks on Submit button
    #Then Overview personal payments page will be displayed
    #And user clicks on Done button
    #Then Person Gallery page should be displayed
    #When user click on Sign Out option
    #Then Sign out should be successful
    #
#@Update_Personal_Payment_Method_Non-Expenses_only
  #Scenario Outline:  As an Employee, i should be able to update Personal Payment Method (Non - Expenses only) details
    #Given user runs <Test Scenario>
    #And user login to Oracle Applications Cloud web page
    #When user clicks on Navigator icon
    #And user clicks on Personal Information link under About me section
    #Then My Details page should be displayed
    #When user clicks on More Information icon 'i'  under name icon
    #Then A pop up window with employee details should be displayed.
    #When user clicks on Actions (v) button
    #Then the values Absence,Payroll,Personal and Employment should be displayed
    #When user clicks Manage Personal Payment Methods under Payroll option
    #Then Create Personal Payment Method page should be displayed
    #And user clicks on + icon
    #Then Personal Payment Method page should be displayed
    #And user enter value for Name as "HSBC"
    #And user enter value from Organization Payment Method dropdown as "Non - Expenses"
    #And user clicks on + icon under Bank Accounts
    #Then Create Bank Account page should be displayed
    #And user enter value for Account Number as "464613164666"
    #And user enter value from Account type as "Savings"
    #And user enter value for Routing Number as "122105155"
    #And user enter value for Routing Account Holder
    #And user clicks on Submit button
    #Then Overview personal payments page will be displayed
    #And user clicks on Done button
    #Then Person Gallery page should be displayed
    #When user click on Sign Out option
    #Then Sign out should be successful  
  #
  #
  #@Update_Address_BiographicalInfo_DrivingLicense_Documents
   #Scenario Outline:  As an Employee, i should be able to update Address,BiographicalInfo and DrivingLicense Documents
    #Given user runs <Test Scenario>
    #And user login to Oracle Applications Cloud web page
    #When user clicks on Navigator icon
    #And user clicks on Personal Information link under About me section
    #Then My Details page should be displayed
    #When user clicks on 'Edit' button on top right side of the page
    #Then Edit My Details: Contact Information page should be displayed
    #When user clicks on 'Contact Information' section
    #Then Contact Information page should be displayed
    #When user clicks on Edit(Pencil Symbol) in the Address section
    #Then Personal address should be displayed
    #And user enter value for effective date when address becomes active
    #And user enter value for Address Line 1
    #And user enter value for Zip Code
    #And user clicks on Save and Close button
    #Then My details page should be displayed
    #When user clicks on "Biographical information" icon in the left side of the page which is available in Edit My Details page
    #Then "Edit My Details: Biographical Information" page should be displayed
    #And user clicks on Click on Edit Icon(Pencil icon)
    #Then Biographical Information page should be displayed in edit mode
    #And user enter value for Title
    #And user enter value for First Name
    #And user enter value for Last Name
    #And user clicks on Save and Close button
    #Then My details page should be displayed
    #When user clicks on Documents icon which is available in Edit My Details in the left hand side of the page
    #Then "Edit My Details: Contacts" page should be displayed
    #When user clicks on Edit(Pencil Symbol) in the License section
    #And user enters License number
    #And user clicks on Save button
    #Then License number is saved
    #And user clicks on Done button
    #Then Person Gallery page should be displayed
    #When user clicks on Navigator icon
    #And user clicks on Personal Information link under About me section
    #Then My Details page should be displayed
    #When user clicks on 'Edit' button on top right side of the page
    #Then Edit My Details: Contact Information page should be displayed
    #When user clicks on Disability icon on the left panel
    #Then Disability Information page should be displayed
    #And user + icon
    #Then Country Pop up should be displayed
    #And user selects United States from the dropdown and clicks on Continue button
    #And user selects Self-Disclosed Disability as "No, I don't have a disability"(Radio Button)
    #And user enters effective start state
    #And user clicks on "Form CC-305: Voluntary Self-Identification for Disability" Link
    #Then Form CC-305: Voluntary Self-Identification for Disability page should be displayed
    #When user clicks on print icon under Tools Option
    #Then Print Page should be Displayed and employee should be able to print the Page
    #When user clicks on download icon under Tools Option
    #Then user should able to Download Form CC-503
    #When user clicks on Done button
    #Then The disability information page should be displayed
    #When user clicks on save and close button
    #Then My Details page should be displayed
    #When user click on Sign Out option
    #Then Sign out should be successful
