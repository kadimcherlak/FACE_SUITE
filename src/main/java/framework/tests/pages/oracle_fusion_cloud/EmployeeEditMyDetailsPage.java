package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EmployeeEditMyDetailsPage extends BasePage<EmployeeEditMyDetailsPage> {

    Context context;
    Data data;
    Actions actions;
    private int elementsize;
    private String status;

    // Edit My Details Page Elements

    @FindBy(xpath = "//button[contains(.,'Edit')]")
    private WebElement myDetailsEdit;

    @FindBy(xpath = "(//span[text()='Add'])[2]")
    private WebElement addressAddBtn;

    @FindBy(xpath = "//a[@title='Add']")
    private WebElement contactsAddBtn;

    @FindBy(xpath = "//a[@title='Import File']")
    private WebElement importFileBtn;

    @FindBy(xpath = "//td[text()='Import Local File']")
    private WebElement importLocalFileBtn;

    @FindBy(xpath = "//div[text()='Select File']")
    private WebElement selectFilePage;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement chooseFile;

    @FindBy(xpath = "(//td[contains(@class,'x1o')])[1]")
    private WebElement processId;

    @FindBy(xpath = "(//button[@class='x111 p_AFTextOnly' and text()='OK'])[1]")
    private WebElement processOkBtn;

    @FindBy(xpath = "//*@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_data_exchange:0:MAt2:0:AP1:AT1:_ATp:ATt4:0:ot2\"]")
    private WebElement loadedPercent;

    @FindBy(xpath = "//a[@title='Expand Search']")
    private WebElement processIdSearch;

    // @FindBy(xpath = "//span[@class='xwy' and text()='Add Fields']")
    // private WebElement processIdAddFields;

    //@FindBy(xpath = "(//td[contains(.,'Process ID')])[22]")
    // private WebElement includeProcessId;

    // @FindBy(xpath = "(//td[contains(.,'Process ID')])[22]")
    // private WebElement enterProcessId;

    @FindBy(xpath = "(//label[contains(.,'Process ID')])[1]")
    private WebElement processIdDisplayed;

    @FindBy(xpath = "//input[contains(@name,'exchange:0:MAt2:0:AP1:qryId1:value00')]")
    private WebElement enterProcessId;

    @FindBy(xpath = "//button[contains(.,'Search')]")
    private WebElement searchBtn;

    @FindBy(xpath = "//label[text()='Name']//following::input[1]")
    private WebElement hdlName;

    @FindBy(xpath = "//span[text()='Salary.zip']//following::img[2]")
    private WebElement loadStatus;

    @FindBy(xpath = "(//div[@class='xys'])[1]")
    private WebElement altWorkLocationAddType;

    // @FindBy(xpath = "(//label[text()='Country']/following::input[1])[1]")
    @FindBy(xpath = "//input[@class='x1xc']")
    private WebElement altWorkLocationCountry;

    @FindBy(xpath = "(//input[@class='x2h'])[5]")
    private WebElement emergencyAddType;

    @FindBy(xpath = "(//input[@class='x1xc'])[2]")
    private WebElement emergencyContactCountry;

    @FindBy(xpath = "//span[text()='United States']")
    private WebElement selectCountryFromPopUp;

    @FindBy(xpath = "(//label[text()='Address Line 1']/following::input[1])[1]")
    private WebElement altWorkLocationAddressLine1;

    @FindBy(xpath = "(//label[text()='Address Line 2']/following::input[1])[1]")
    private WebElement altWorkLocationAddressLine2;

    @FindBy(xpath = "(//label[text()='ZIP Code']/following::input[1])[1]")
    private WebElement altWorkLocationZipCode;

    @FindBy(xpath = "//div[text()='Contacts']")
    private WebElement contactsIcon;

    @FindBy(xpath = "//div[text()='Add Contact']")
    private WebElement addContactDialog;

    @FindBy(xpath = "//*[text()='ave and Close']")
    private WebElement saveAndCloseBtn;

    @FindBy(xpath = "//label[text()='Select an existing person']")
    private WebElement selectExistPerson;

    @FindBy(xpath = "//button[text()='Contin']")
    private WebElement continueBtn;

    @FindBy(xpath = "//a[@class='x1p8']")
    private WebElement relationshipOption;

    @FindBy(xpath = "//label[text()='Name']/following::input[1]")
    private WebElement emergencyContactName;

    @FindBy(xpath = "//label[@class='x1cd']")
    private WebElement emergencyContactCheckbox;

    @FindBy(xpath = "//img[@title='More Information']")
    private WebElement myDetailsMoreInformation;

    @FindBy(xpath = "//a[@title='Recent Actions']")
    private WebElement moreInformationPopUp;

    @FindBy(xpath = "//a[@title='Absences']")
    private WebElement moreInformationAbsencesLink;

    @FindBy(xpath = "//a[@title='Compensation']")
    private WebElement moreInformationCompensationLink;

    @FindBy(xpath = "//a[@title='Personal and Employment']")
    private WebElement moreInformationPersonalAndEmploymentLink;

    @FindBy(xpath = "//img[@title='Actions']")
    private WebElement moreInformationActionButton;


    @FindBy(xpath = "//img[@title='Tasks']")
    private WebElement taskIcon;

    @FindBy(xpath = "//a[text()='Manage Salary']")
    private WebElement linkManagesalary;

    @FindBy(xpath = "//button[@title='Action']")
    private WebElement btnAction_ManageSalary;

    @FindBy(xpath = "//td[@class='x1gk']")
    private WebElement manageSalaryTab_personInfoSection;

    @FindBy(xpath = "//div[@class='x1gs']")
    private WebElement manageSalaryTab_currentSalarySection;

    @FindBy(xpath = "//td[text()='Edit']")
    private WebElement linkActionEdit_ManageSalary;


    @FindBy(xpath = "//label[contains(@for,'UseComponents')]")
    private WebElement chkboxSalarycomponents_ManageSalary;

    @FindBy(xpath = "//label[text()='Salary Amount']//following::input[1]")
    private WebElement txtboxComponentAmt_ManageSalary;

    //    @FindBy(xpath = "//div[1][@class='xb7 p_AFSelected']")
    @FindBy(xpath = "//a[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:1:AP1:sdi1::disAcr']")
    private WebElement tabComponents_ManageSalary;


    @FindBy(xpath = "//img[contains(@id,'create')]")
    private WebElement addButton_ComponentsTab;


    @FindBy(xpath = "//h1[contains(.,'My Details')]")
    private WebElement empMyDetails;

    @FindBy(xpath = "//label[text()='Annual Salary']//following::span[1]")
    private WebElement txtAnnualSalary;


    @FindBy(xpath = "//span[@class='x1z p_AFCustom']//input[@role='combobox']")
    private WebElement selectComponentDropdown;

    @FindBy(xpath = "//li[@class='x1pk'][text()='Promotion']")
    private WebElement valPromotion;

    @FindBy(xpath = "//a[@accesskey='u']")
    private WebElement btnContinue_ManageSalary;

    @FindBy(xpath = "//button[@accesskey='o']")
    private WebElement btnDone;

    @FindBy(xpath = "//a[@accesskey='m']")
    private WebElement btnSubmit_ManageSalary;

    @FindBy(xpath = "//button[@accesskey='Y']")
    private WebElement popButtonYes;

    @FindBy(xpath = "//button[@accesskey='K']")
    private WebElement confirmBtnOK;

    @FindBy(xpath = "//a[@accesskey='B']")
    private WebElement btnBack_ManageSalary;

    @FindBy(xpath = "//img[@title='New']")
    private WebElement btnComponentsNew_ManageSalary;

    @FindBy(xpath = "//td[2]/span[@class='x2qb']//input[@type='text']")
    private WebElement txtFieldAmount_Components;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:1:AP1:AT1:_ATp:table1:0:sc1::content")
    private WebElement drpdownComponent_ManageSalary;

    @FindBy(xpath = "//button[text()='OK']")
    private WebElement popupOK_ManageSalary;

    @FindBy(xpath = "//label[text()='Action Reason']//following::input[1]")
    private WebElement txtboxActionReason_ManageSalary;

    @FindBy(xpath = "//span[text()='Edit']")
    private WebElement btnEdit_ManageEmployment;

    @FindBy(xpath = "//a[@title='Search: Salary Basis']")
    private WebElement dropdownSalaryBasis_ManageSalary;

    @FindBy(xpath = "//button[@id='_FOd1::msgDlg::cancel']")
    private WebElement btnOK_WarningPopup;


    @FindBy(xpath = "//h1[text()='Salary.zip: Details']")
    private WebElement salaryDetailsSection;

    @FindBy(xpath = "//h1[text()='Search Results']")
    private WebElement searchResultsSection;

    //@FindBy(xpath = "//span[text()='US Hourly Wages']")
    //private WebElement usHourlyWages;

    @FindBy(xpath = "//span[text()='United States Hourly Salary Basis']")
    private WebElement usHourlyWages;

    @FindBy(xpath = "//tr[7]//td[2][@class='xy7 xy6']/span[1]")
    private WebElement txtAdjustAmount;

    @FindBy(xpath = "//a[@title='Personal Payment Methods']")
    private WebElement personalPaymentMethods;

    @FindBy(xpath = "(//a[text()='Manage Personal Payment Methods'])[1]")
    private WebElement ManagePersonalPaymentMethods;

    @FindBy(xpath = "//th/descendant::span[contains(text(),'Processing Order')]")
    private WebElement createPersonalPaymentMethodIndicator;

    @FindBy(xpath = "//img[@title='Create']")
    private WebElement create_Btn;

    @FindBy(xpath = "//h1[contains(text(),'Create Personal Payment Method')]")
    private WebElement personalPaymentMethodPageIndicator;

    @FindBy(xpath = "//label[text()='Name']/following::input[1]")
    private WebElement bankName;

    @FindBy(xpath = "//label[text()='Organization Payment Method']//following::input[1]")
    private WebElement orgPaymentMethod;

    @FindBy(xpath = "//label[text()='Percentage']//following::input[1]")
    private WebElement percentage;

    @FindBy(xpath = "//div[contains(text(),'Create Bank Account')]")
    private WebElement createBankAccountPageIndicator;

    @FindBy(xpath = "//label[text()='Account Number']//following::input[1]")
    private WebElement AccountNumber;

    @FindBy(xpath = "//label[text()='Account Type']//following::input[1]")
    private WebElement AccountType;

    @FindBy(xpath = "//label[text()='Account Holder']//following::input[1]")
    private WebElement AccountHolder;

    @FindBy(xpath = "//label[text()='Routing Number']//following::input[1]")
    private WebElement RoutingNumber;

    @FindBy(xpath = "//button[text()='Save and Close']")
    private WebElement saveclose_btn;

    @FindBy(xpath = "(//a[@role='button'])[2]")
    private WebElement submitButton;

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitButtonFileUpload;

    @FindBy(xpath = "//span[text()='Submit']")
    private WebElement submitButtonImportDataLoad;

    @FindBy(xpath = "//div[text()='Submitted']")
    private WebElement fileSubmitted;

    @FindBy(xpath = "//button[contains(.,'Edit')]")
    private WebElement editButton;

    // @FindBy(xpath = "//h1[contains(text(),'Edit My Details: Contact Information')]")
    @FindBy(xpath = "//h1[contains(.,'Contact Information')]")
    private WebElement contactInformationPageIndicator;

    @FindBy(xpath = "//h1[contains(.,'Family and Emergency Contacts')]")
    private WebElement familyAndEmergencyPageIndicator;

    @FindBy(xpath = "//h1[contains(.,'Import and Load Data')]")
    private WebElement importAndLoadDataPage;

    @FindBy(xpath = "//a[text()='Person Management']")
    private WebElement clickPersonManagementLink;

    @FindBy(xpath = "//h1[contains(.,'New Contact')]")
    private WebElement newContactPage;

    @FindBy(xpath = "//span[contains(text(),'Contact Information')]")
    private WebElement contactInformationLink;

    @FindBy(xpath = "//span[contains(.,'Family and Emergency Contacts')]")
    private WebElement familyAndEmergencyContactsLink;

    @FindBy(xpath = "//img[@alt='Edit']")
    private WebElement button_Edit;

    @FindBy(xpath = "//label[text()='When does this address change start?']/parent::div/descendant::span[@title='Required']")
    private WebElement effectiveStartDateRequiredValidation;

    @FindBy(xpath = "//label[text()='Address Line 1']/parent::div/descendant::span[@title='Required']")
    private WebElement addLine1RequiredValidation;

    @FindBy(xpath = "(//label[text()='ZIP Code']/following::input)[2]")
    private WebElement zipCode;

    @FindBy(xpath = "(//label[text()='City']/following::input)[2]")
    private WebElement city;

    @FindBy(xpath = "(//label[text()='State']/following::input)[2]")
    private WebElement state;

    @FindBy(xpath = "//label[text()='Type']/following::span[1]")
    private WebElement addressType;

    @FindBy(xpath = "(//label[text()='County']/following::input)[2]")
    private WebElement county;

    @FindBy(xpath = "//label[text()='Address Line 2']/following::span[1]")
    private WebElement addressLine2;

    @FindBy(xpath = "//label[text()='Country']/following::span[1]")
    private WebElement country;

    @FindBy(xpath = "//a[@accesskey='C']")
    private WebElement cancelBtn;

    @FindBy(xpath = "//button[text()='Yes']")
    private WebElement yesBtn;

    @FindBy(xpath = "(//a[@class='xwv'])[8]")
    private WebElement contactSubmitBtn;

    @FindBy(xpath = "//span[text()='Add']")
    private WebElement myContactsAddBtn;

    @FindBy(xpath = "//td[text()='Create a New Contact']")
    private WebElement createNewContactOption;

    @FindBy(xpath = "//h1[contains(.,'Contact Information')]")
    private WebElement newAddressDisplay;

    @FindBy(xpath = "(//div[@title='Address']/descendant::img[@alt='Edit'])[1]")
    private WebElement editAddressButton;

    @FindBy(xpath = "//label[text()='First Name']//following::input[1]")
    private WebElement firstName;

    @FindBy(xpath = "//label[text()='Last Name']//following::input[1]")
    private WebElement lastName;

    //@FindBy(xpath = "//label[text()='Relationship']//following::input[1]")
    @FindBy(xpath = "(//input[contains(@class,'x2h')])[1]")
    private WebElement relationship;

    @FindBy(xpath = "//label[text()='What is the start date of this relationship?']//following::input[1]")
    private WebElement relationshipDate;

    @FindBy(xpath = "//label[text()='Gender']//following::input[1]")
    private WebElement gender;

    @FindBy(xpath = "//label[@class='x1da']")
    private WebElement personEmergencyContactCheckbox;


    @FindBy(xpath = "(//label[text()='Type']//following::input[1])[1]")
    private WebElement phoneType;

    @FindBy(xpath = "//label[contains(.,'Enter a New Address')]")
    private WebElement enterNewAddCheckBox;

    @FindBy(xpath = "(//label[text()='Type']//following::input[1])[2]")
    private WebElement emailType;

    //@FindBy(xpath = "//label[text()='Country Code']//following::input[1]")
    @FindBy(xpath = "//input[@class='x1xc']")
    private WebElement countryCode;

    @FindBy(xpath = "//label[text()='Number']//following::input[1]")
    private WebElement phoneNumber;

    @FindBy(xpath = "//label[text()='Email']//following::input[1]")
    private WebElement email;
    //---------
    @FindBy(xpath = "//img[@title='More Information']")
    private WebElement personMoreInfoEllipsis;

    @FindBy(xpath = "//span[text()='Personal Details']")
    private WebElement lnkPersonalDetails;

    @FindBy(xpath = "//div[@title='Personal Details']")
    private WebElement pagePersonalDetails;

    @FindBy(xpath = "//span[@class='xmg'][text()='Update Photo']")
    private WebElement optionUpdatePhoto;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement choosePhotoFile;

    @FindBy(xpath = "//td[@class='x1ul']")
    private WebElement moreMenu;

    @FindBy(xpath = "//button[@id='_FOpt1:_FOr1:0:_FOSrPER_HCMPEOPLETOP_FUSE_PER_INFO:0:MAnt2:2:pim1Upl:UPsp1:sh1:if1::upBtn']")
    private WebElement btnPhotoUpdated;

    @FindBy(xpath = "//label[contains(@for,'effectiveDate')]//following::input[1]")
    private WebElement modalUpdateEmploymentEffectiveDate;

    @FindBy(xpath = "//label[contains(@for,'actionsName')]/following::input[1]")
    private WebElement modalUpdateEmploymentAction;

    @FindBy(xpath = "(//label[text()='Action'][1]/following::input[1])[2]")
    private WebElement correctEmploymentAction;

    @FindBy(xpath = "//label[contains(@for,'actionReason')]/following::input[1]")
    private WebElement modalUpdateEmploymentActionReason;

    @FindBy(xpath = "(//label[text()='Action Reason']/following::input[1])[2]")
    private WebElement correctEmploymentActionReason;

    @FindBy(xpath = "//h1[contains(text(),'Edit Employment')]")
    private WebElement editEmploymentPage;

    @FindBy(xpath = "//button[@accesskey='K']")
    private WebElement btnOK;

    @FindBy(xpath = "(//button[text()='OK'])[1]")
    private WebElement correctButtonOK;

    @FindBy(xpath = "//label[text()='Assignment Status']//following::input[1]")
    private WebElement dropdownAssignmentStatus;

    @FindBy(xpath = "//span[text()='Review']")
    private WebElement btnReview;

    @FindBy(xpath = "//label[text()='Work Phone']/following::a[1]")
    private WebElement workPhoneLink;

    @FindBy(xpath = "//label[text()='Work Email']/following::a[1]")
    private WebElement workEmailLink;

    @FindBy(xpath = "(//label[text()='Home Address']/following::div)[1]")
    private WebElement homeAddress;

    @FindBy(xpath = "//a[@title='Done']")
    private WebElement backButton;

    @FindBy(xpath = "//label[text()='Last Name']/following::span[1]")
    private WebElement lastNameReadOnly;

    @FindBy(xpath = "//label[text()='First Name']/following::span[1]")
    private WebElement firstNameReadOnly;

    @FindBy(xpath = "//label[text()='Ethnicity']/following::span[1]")
    private WebElement ethnicityReadOnly;

    @FindBy(xpath = "//label[text()='Marital Status']/following::span[1]")
    private WebElement maritalStatusReadOnly;

    @FindBy(xpath = "//label[text()='Gender']/following::span[1]")
    private WebElement genderReadOnly;

    @FindBy(xpath = "//label[text()='Date of Birth']/following::span[1]")
    private WebElement dateOfBirthReadOnly;

    @FindBy(xpath = "//span[text()='Document Records']")
    private WebElement lnkDocumentRecords;

    @FindBy(xpath = "(//div[@title='Document Records'])[1]")
    private WebElement pageDocumentRecord;

    @FindBy(xpath = "//a[contains(@id,'table2:0:gl1')]/following::span[1]")
    private WebElement hdlPersonNo;

    @FindBy(xpath = "//a[contains(@id,'table2:0:gl1')]")
    private WebElement personLink;

    @FindBy(xpath = "//span[text()='Skills and Qualifications']")
    private WebElement skillsAndQualificationsLink;

    @FindBy(xpath = "//h1[contains(text(),'Skills and Qualifications')]")
    private WebElement skillsAndQualificationsPage;

    @FindBy(xpath = "//h1[contains(text(),'Edit Skills and Qualifications')]")
    private WebElement editSkillsAndQualificationsPage;

    @FindBy(xpath = "//a[text()='Add Content']")
    private WebElement addContent;

    @FindBy(xpath = "//td[text()='Degrees']")
    private WebElement degreesLink;

    @FindBy(xpath = "//td[text()='Licenses and Certifications']")
    private WebElement licensesLink;

    @FindBy(xpath = "//span[text()='Degrees']")
    private WebElement degreeText;

    @FindBy(xpath = "//span[text()='Number']")
    private WebElement numberLicensestext;

    @FindBy(xpath = "//input[contains(@id,'name1Id::content')]")
    private WebElement degreeSkillsName;

    @FindBy(xpath = "//span[text()='Major']/following::input[2]")
    private WebElement degreeMajor;

    @FindBy(xpath = "//span[text()='Major']/following::input[3]")
    private WebElement degreeSchool;

    @FindBy(xpath = "//span[text()='Major']/following::input[4]")
    private WebElement degreeYear;

    @FindBy(xpath = "//span[text()='Number']/following::input[2]")
    private WebElement skillsNumber;

    @FindBy(xpath = "//span[text()='Personal and Employment']/following::a[text()='Manage Person'][1]")
    private WebElement linkManagePerson;

    @FindBy(xpath = "//*[@title='Manage Person']/descendant::h1[text()='Manage Person']")
    private WebElement managePersonPage;

    @FindBy(xpath = "//label[text()='Home Address']/following::a[@title='Edit'][1]")
    private WebElement homeAddressEditButton;

    @FindBy(xpath = "//tr[contains(@id,'correctMenuItem')]")
    private WebElement managePersonCorrectDropdown;

    @FindBy(xpath = "//div[text()='Correct Address']")
    private WebElement correctAddressPopup;

    @FindBy(xpath = "(//label[text()='City']/following::input)[1]")
    private WebElement managePersonCity;

    @FindBy(xpath = "//div[text()='Search and Select: ZIP Code']")
    private WebElement searchAndSelectZipCodePopUp;

    @FindBy(xpath = "(//label[text()='ZIP Code']/following::input)[1]")
    private WebElement managePersonZip;

    @FindBy(xpath = "//tr[contains(@id,'correctMenuItem')]/preceding::td[text()='Update'][1]")
    private WebElement managePersonUpdateDropdown;

    @FindBy(xpath = "//div[text()='Update Address']")
    private WebElement effectiveDateAddressPopUp;

    @FindBy(xpath = "//label[text()='Effective Start Date']/following::input[1]")
    private WebElement effectiveDate;

    @FindBy(xpath = "(//button[@accesskey='K'])[2]")
    private WebElement managePersonConfirmBtnOK;

    @FindBy(xpath = "//img[@title='Create Address']")
    private WebElement createAddressButton;

    @FindBy(xpath = "//td[2]//button[text()='Edit']")
    private WebElement button_EditBioInfo;

    @FindBy(xpath = "//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:0:SP1:pt_r2:0:id1::content']")
    private WebElement text_dateOfBirth;

    @FindBy(xpath = "//input[contains(@id,'countryNameId')]")
    private WebElement text_countryOfBirth;

    @FindBy(xpath = "//input[contains(@id,'MAt2:0:SP1:pt_r2:0:it2')]")
    private WebElement text_regionOfBirth;

    @FindBy(xpath = "//input[contains(@id,'0:MAt2:0:SP1:pt_r2:0:it1')]")
    private WebElement text_townOfBirth;

    @FindBy(xpath = "//a[contains(@id,'MAt2:0:SP1:pt_r2:0:soc4')]")
    private WebElement comboBox_correspondenceLanguage;

    @FindBy(xpath = "//a[contains(@id,'MAt2:0:SP1:pt_r2:0:soc2::drop')]")
    private WebElement comboBox_bloodType;

    @FindBy(xpath = "//*[@accesskey='m']")
    private WebElement button_Submit;

    @FindBy(xpath = "//label[text()='Address Line 1']/following::input[1]")
    private WebElement text_updateAddressModal_AddressLine1;
    @FindBy(xpath = "//label[text()='ZIP Code']/following::input[1]")
    private WebElement text_updateAddressModal_ZipCode;
    @FindBy(xpath = "//label[text()='City']/following::input[1]")
    private WebElement text_updateAddressModal_City;
    @FindBy(xpath = "//label[text()='State']/following::input[1]")
    private WebElement text_updateAddressModal_State;
    @FindBy(xpath = "//label[text()='County']/following::input[1]")
    private WebElement text_updateAddressModal_County;

    @FindBy(xpath = "//div[@class='x163']//a[text()='Contacts']")
    private WebElement link_ContactsInManagePersonPage;

    @FindBy(xpath = "//div[@class='x163']//a[text()='Extra Information']")
    private WebElement link_ExtraInformationInManagePersonPage;

    @FindBy(xpath = "//div[text()='Create Contact from Existing Person']")
    private WebElement modal_CreateContactFromExistingPerson;

    @FindBy(xpath = "//span[text()='Create from Existing Person']")
    private WebElement button_CreateFromExistingPerson;

    @FindBy(xpath = "//label[text()='Contact Type']/following::input[1]")
    private WebElement comboBox_ContactType;

    @FindBy(xpath = "//label[text()='Emergency Contact']/following::input[1]")
    private WebElement comboBox_emergencyContact;

    @FindBy(xpath = "//a[@title='Search: Name']")
    private WebElement comboBox_Name;

    @FindBy(xpath = "//label[text()='Effective Start Date']/following::input[1]")
    private WebElement datePicker_EffectiveStartDate;

    @FindBy(xpath = "//label[text()='Effective Start Date']/following::td[1]/input[1]")
    private WebElement datePicker_updateAddressEffectiveStartDate;

    @FindBy(xpath = "//table[@class=\"x1n0\"]/tbody/tr[1]")
    private WebElement comboBox_selectName;

    @FindBy(xpath = "//label[text()='Home Address']/following::a[@title='Edit'][1]")
    private WebElement button_EditAddress;

    @FindBy(xpath = "//label[text()='Name']/following::a[@title='Edit'][1]")
    private WebElement button_EditName;

    @FindBy(xpath = "//label[text()='Name']/following::td[text()='Correct'][2]")
    private WebElement button_CorrectName;

    @FindBy(xpath = "//label[text()='Home Address']/following::td[text()='Update'][1]")
    private WebElement button_UpdateAddress;

    @FindBy(xpath = "//label[text()='Last Name']/following::input[1]")
    private WebElement text_lastName_PersonalInfo;

    @FindBy(xpath = "//label[text()='First Name']/following::input[1]")
    private WebElement text_firstName_PersonalInfo;

    @FindBy(xpath = "//label[text()='Enter local name']/following::button[@accesskey='K']")
    private WebElement button_OK_UpdateName;

    @FindBy(xpath = "//label[text()='County']/following::span/button[@accesskey='K']")
    private WebElement button_OK_UpdatAddress;

    @FindBy(xpath = "//label[text()='Effective Start Date']/following::span/button[@accesskey='K']")
    private WebElement button_OK_UpdatAddressDate;

    @FindBy(xpath = "//label[text()='Home Address']/following::span[text()='K']")
    private WebElement button_OK_CloseEditWindow;

    @FindBy(xpath = "//img[@alt='Add Row']")
    private WebElement button_AddRowForPhoneDetails;

    @FindBy(xpath = "//a[contains(@id,'AT1:_ATp:table1:0:soc1')]")
    private WebElement comboBox_emergencyPhoneType;

    @FindBy(xpath = "//a[@title='Search and Select: Country Code']")
    private WebElement comboBox_emergencyCountryCode;

    @FindBy(xpath = "//label[text()='Country Code']/following::input[1]")
    private WebElement text_emergencyAreaCode;

    @FindBy(xpath = "//label[text()='Country Code']/following::input[2]")
    private WebElement text_emergencyPhoneNumber;

    @FindBy(xpath = "//label[text()='Type']/following::input[1]")
    private WebElement text_CountryCode;


    @FindBy(xpath = "//td[text()='Correct']")
    private WebElement button_CorrectExtraInfo;

    @FindBy(xpath = "//a[contains(@id,'_COMMUNITY')]")
    private WebElement comboBox_Comminity;

    @FindBy(xpath = "//input[contains(@id,'_CASTE')]")
    private WebElement text_CasteTribe;

    @FindBy(xpath = "//input[contains(@id,'_HEIGHT')]")
    private WebElement text_Height;

    @FindBy(xpath = "//input[contains(@id,'_WEIGHT')]")
    private WebElement text_Weight;

    @FindBy(xpath = "//input[contains(@id,'_PAN_REFERENCE')]")
    private WebElement text_PANAcknowledgmentNumber;

    @FindBy(xpath = "//a[contains(@id,'_RESIDENTIAL')]")
    private WebElement comboBox_ResidentialStatus;

    @FindBy(xpath = "//label[text()='PAN Applied']")
    private WebElement checkBox_PANApplied;

    @FindBy(xpath = "//label[text()='Ex-Service Person']")
    private WebElement checkBox_ExServicePerson;

    @FindBy(xpath = "//h1[text()='Extra Information']/following::td[text()='Update']")
    private WebElement button_UpdateExtraInfo;

    public EmployeeEditMyDetailsPage(Context context) {
        super(context);
        this.context = context;
        this.data = context.getData();
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
        logger.debug("{} loaded", this.getClass().getName());
    }

    // Click on Edit button
    public void clickMyDetailsEdit() {
        try {
            // Click Edit button in My details Page
            waitFor(ExpectedConditions.visibilityOf(myDetailsEdit), 15);
            myDetailsEdit.click();
            reportWithScreenShot("User clicks on Edit Button");
            waitShortTime();

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user clicks on Edit button due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // Click on Address Add button
    public void clickAddressAdd() {
        try {
            waitFor(ExpectedConditions.visibilityOf(addressAddBtn), 15);
            addressAddBtn.click();
            waitShortTime();
            reportWithScreenShot("User clicks on Address Add Button");

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user clicks on Address Add button due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // User enters New Mailing Address details
    public void fillNewAddressType() {
        try {
            waitShortTime();
            // Enter Country
            // waitFor(ExpectedConditions.visibilityOf(altWorkLocationCountry), 15);
            altWorkLocationCountry.clear();
            altWorkLocationCountry.sendKeys(data.getAltWorkLocationCountry());
            waitNormalTime();
            altWorkLocationCountry.sendKeys(Keys.DOWN, Keys.RETURN);
            altWorkLocationCountry.sendKeys(Keys.TAB);
            waitNormalTime();
            //Enter Address Type
            altWorkLocationAddType.click();
            waitFor(ExpectedConditions.visibilityOf(altWorkLocationAddType), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getAltWorkLocationAddressType() + "']")).click();
            waitNormalTime();
            //Enter Address Line1
            waitFor(ExpectedConditions.elementToBeClickable(altWorkLocationAddressLine1), 5);
            altWorkLocationAddressLine1.sendKeys(data.getAltWorkLocationAddressLine1());
            //Enter Address Line2
            waitFor(ExpectedConditions.elementToBeClickable(altWorkLocationAddressLine2), 5);
            altWorkLocationAddressLine2.sendKeys(data.getAltWorkLocationAddressLine2());
            //Enter ZipCode
            waitFor(ExpectedConditions.elementToBeClickable(altWorkLocationZipCode), 5);
            altWorkLocationZipCode.sendKeys(data.getAltWorkLocationZipCode());
            waitShortTime();
            altWorkLocationAddressLine1.click();
            waitShortTime();
            altWorkLocationAddressLine1.click();
            reportWithScreenShot("User enter Alternate work location Address details");
            // assertThat(contactSubmitBtn.isDisplayed()).isTrue();

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user enter Alternate work location Address details due to:" + e.getMessage());
            Assert.fail();
        }
    }


    // User enter Emergency Contact details
    public void fillNewContactInfo() {
        try {
            waitFor(ExpectedConditions.visibilityOf(firstName), 5);
            firstName.sendKeys(data.getFirstName());

            waitFor(ExpectedConditions.visibilityOf(lastName), 5);
            lastName.sendKeys(data.getLastName());
            waitShortTime();

            relationship.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getRelationship() + "']"))), 15);
            //waitFor(ExpectedConditions.visibilityOf(relationship),5);

            driver.findElement(By.xpath("//li[text()='" + data.getRelationship() + "']")).click();
            //relationship.sendKeys(Keys.TAB);

            waitFor(ExpectedConditions.visibilityOf(relationshipDate), 10);
            relationshipDate.clear();
            relationshipDate.sendKeys(getCurrentDate());

            // gender.click();
            // waitFor(ExpectedConditions.visibilityOf(gender), 5);
            //driver.findElement(By.xpath("//li[text()='" + data.getGender() + "']")).click();

            waitFor(ExpectedConditions.visibilityOf(personEmergencyContactCheckbox), 5);
            personEmergencyContactCheckbox.click();

            phoneType.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getPhoneType() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getPhoneType() + "']")).click();
            phoneType.sendKeys(Keys.TAB);

            waitShortTime();
            waitFor(ExpectedConditions.visibilityOf(countryCode), 5);
            countryCode.clear();
            countryCode.sendKeys(data.getCountryCode());
            waitShortTime();
            countryCode.sendKeys(Keys.DOWN, Keys.RETURN);
            //countryCode.sendKeys(Keys.TAB);
            waitShortTime();

            waitFor(ExpectedConditions.visibilityOf(phoneNumber), 5);
            phoneNumber.clear();
            phoneNumber.sendKeys(data.getPhoneNumber());

            emailType.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getEmailType() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getEmailType() + "']")).click();
            emailType.sendKeys(Keys.TAB);


            waitFor(ExpectedConditions.visibilityOf(email), 5);
            email.clear();
            email.sendKeys(data.getEmail());

            waitFor(ExpectedConditions.visibilityOf(enterNewAddCheckBox), 5);
            enterNewAddCheckBox.click();
            actions.sendKeys(Keys.TAB);

            waitShortTime();
            // Enter Country
            // waitFor(ExpectedConditions.visibilityOf(altWorkLocationCountry), 15);
            emergencyContactCountry.clear();
            emergencyContactCountry.sendKeys(data.getAltWorkLocationCountry());
            waitNormalTime();
            emergencyContactCountry.sendKeys(Keys.DOWN, Keys.RETURN);
            emergencyContactCountry.sendKeys(Keys.TAB);
            waitNormalTime();
            //Enter Address Type
            emergencyAddType.click();
            waitFor(ExpectedConditions.visibilityOf(emergencyAddType), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getAltWorkLocationAddressType() + "']")).click();
            emergencyAddType.sendKeys(Keys.TAB);
            waitShortTime();
            //Enter Address Line1
            waitFor(ExpectedConditions.elementToBeClickable(altWorkLocationAddressLine1), 5);
            altWorkLocationAddressLine1.sendKeys(data.getAltWorkLocationAddressLine1());
            //Enter Address Line2
            waitFor(ExpectedConditions.elementToBeClickable(altWorkLocationAddressLine2), 5);
            altWorkLocationAddressLine2.sendKeys(data.getAltWorkLocationAddressLine2());
            //Enter ZipCode
            waitFor(ExpectedConditions.elementToBeClickable(altWorkLocationZipCode), 5);
            altWorkLocationZipCode.sendKeys(data.getAltWorkLocationZipCode());
            waitShortTime();

            altWorkLocationAddressLine1.click();
            altWorkLocationAddressLine2.click();
            waitNormalTime();

            reportWithScreenShot("User enter Emergency Contact details");
            // assertThat(btnSubmit_ManageSalary.isDisplayed()).isTrue();

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user enter Emergency Contact details due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // Click on submit button in Contacts page
    public void clickContactSubmit() {
        try {
            // Click submit button in Contacts Page
            waitFor(ExpectedConditions.visibilityOf(contactSubmitBtn), 15);
            contactSubmitBtn.click();
            reportWithScreenShot("User clicks on Submit Button in contacts page");

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user clicks on Submit button in contact page due to:" + e.getMessage());
            Assert.fail();
        }
    }


    // Click on submit button in Emergency Contacts page
    public void clickEmergencyContactSubmit() {
        try {
            // Click submit button in Contacts Page
            waitUntilPageLoad();
            waitFor(ExpectedConditions.visibilityOf(btnSubmit_ManageSalary), 15);
            btnSubmit_ManageSalary.click();
            reportWithScreenShot("User clicks on Submit Button in Emergency contacts page");

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user clicks on Submit button in Emergency contact page due to:" + e.getMessage());
            Assert.fail();
        }
    }

    //check for display of New Address
    public void checkNewMailingAddressDisplayed() {
        try {
            waitUntilPageLoad();
            waitShortTime();
            waitFor(ExpectedConditions.visibilityOf(newAddressDisplay), 15);
            assertThat(newAddressDisplay.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if New Address is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("New Address is not Displayed");
            Assert.fail();
        }
    }

    // User click on Contacts Icon
    public void clickContactsIcon() {
        try {

            waitFor(ExpectedConditions.elementToBeClickable(contactsIcon), 15);
            contactsIcon.click();
            waitShortTime();

        } catch (Exception e) {
            reportWithScreenShot("Error While user click on save and close button:" + e.getMessage());
            Assert.fail();
        }
    }

    // Click on Add button in Contacts page
    public void clickContactsAdd() {
        try {
            // Click Edit button in My details Page
            waitFor(ExpectedConditions.visibilityOf(contactsAddBtn), 15);
            contactsAddBtn.click();
            reportWithScreenShot("User clicks on Add Button in contacts page");

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user clicks on Add button in contact page due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // User checks if My Details Contact Page is displayed
    public void checkAddContactDialogBoxDisplayed() {
        try {
            waitUntilPageLoad();
            reportWithScreenShot("Checking if My Details Contact Page is Displayed");
            assertThat(addContactDialog.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("My Details Contact Page is not Displayed");
            Assert.fail();
        }
    }

    // User click on Select existing person radio button
    public void clickSelectExistPerson() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(selectExistPerson), 15);
            selectExistPerson.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on select Existing Person radio button:" + e.getMessage());
            Assert.fail();
        }
    }

    // Click on Continue button in Contacts page
    public void clickContinueBtn() {
        try {
            // Click Edit button in My details Page
            waitFor(ExpectedConditions.visibilityOf(continueBtn), 15);
            continueBtn.click();
            reportWithScreenShot("User clicks on Continue Button in contacts page");
            waitShortTime();

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user clicks on Continue button in contact page due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // User select value from Relationship
    public void selectRelationship() {
        try {
            // User select value from Relationship

            relationshipOption.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getContactsRelationship() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getContactsRelationship() + "']")).click();
            relationshipOption.sendKeys(Keys.TAB);

            reportWithScreenShot("User select contact value from Relationship");

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While User select value from Relationship due to:" + e.getMessage());
            Assert.fail();
        }
    }

    public void enterEmergencyContactName() {
        try {

            // Enter emergency contact Name
            waitFor(ExpectedConditions.elementToBeClickable(emergencyContactName), 15);
            emergencyContactName.sendKeys(data.getContactsEmergencyContactName());

        } catch (Exception e) {
            reportWithScreenShot("Error While user enter Emergency contact name:" + e.getMessage());
            Assert.fail();
        }
    }

    // Click on Continue button in Contacts page
    public void clickEmergencyContactCheckbox() {
        try {
            // Click Edit button in My details Page
            waitFor(ExpectedConditions.visibilityOf(emergencyContactCheckbox), 15);
            emergencyContactCheckbox.click();
            reportWithScreenShot("User clicks on Emergency Contact Checkbox in contacts page");

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user clicks on Emergency Contact Checkbox in contact page due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // User click on save and close button
    public void clickSaveAndClose() {
        try {

            waitFor(ExpectedConditions.elementToBeClickable(saveAndCloseBtn), 15);
            saveAndCloseBtn.click();
            reportWithScreenShot("User click on save and close button:");

        } catch (Exception e) {
            reportWithScreenShot("Error While user click on save and close button:" + e.getMessage());
            Assert.fail();
        }
    }

    // User click on More Information below My Details Page

    /**
     * This method will click on the more information icon under my details page
     *
     * @author Rakesh Ghosal
     */
    public void clickMoreInformationImage() {
        try {

            waitFor(ExpectedConditions.elementToBeClickable(myDetailsMoreInformation), 15);
            myDetailsMoreInformation.click();

        } catch (Exception e) {
            reportWithScreenShot("Error while click on more information on my details page:" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * This method will validate if the pop up is displayed or not after clicking on more information in my details page
     *
     * @author Rakesh Ghosal
     */
    public void checkMoreInformationPopupDisplayed() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(moreInformationPopUp), 15);
            assertThat(moreInformationPopUp.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if My Details more information pop up is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("My Details more information pop up is not Displayed");
            Assert.fail();
        }
    }

    /**
     * This method will click on the more information action button page
     *
     * @author Rakesh Ghosal
     */
    public void clickMoreInformationActionButton() {
        try {

            waitFor(ExpectedConditions.elementToBeClickable(moreInformationActionButton), 15);
            moreInformationActionButton.click();

        } catch (Exception e) {
            reportWithScreenShot("Error while click on more information action button:" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * This method will validate Absences, Compensation , Personal and Employment link in more information link
     *
     * @author Rakesh Ghosal
     */
    public void validateLinksPresentInMoreInformationPage() {
        try {
            assertThat(moreInformationActionButton.isDisplayed()).isTrue();
            assertThat(moreInformationCompensationLink.isDisplayed()).isTrue();
            assertThat(moreInformationPersonalAndEmploymentLink.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if My Details more information Absences, Compensation , Personal and Employment link in more information link is displayed");
        } catch (Exception e) {
            reportWithScreenShot("Checking if My Details more information Absences, Compensation , Personal and Employment link in more information link is displayed:" + e.getMessage());
            Assert.fail();
        }
    }

    // User click  Task icon right side
    public void taskIconClick() {
        try {
            waitUntilPageLoad();
            waitNormalTime();
            waitFor(ExpectedConditions.elementToBeClickable(taskIcon), 30);
            mouseHover(taskIcon);
            taskIcon.click();
            waitFor(ExpectedConditions.elementToBeClickable(linkManagesalary), 30);
            assertThat(linkManagesalary.isDisplayed()).isTrue();
            reportWithScreenShot("Task icon on right is open");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Review Tab due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // User click on Manage Salary under Task icon
    public void manageSalaryClick() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(linkManagesalary), 15);
            assertThat(linkManagesalary.isDisplayed()).isTrue();
            linkManagesalary.click();
            waitFor(ExpectedConditions.visibilityOf(btnAction_ManageSalary), 60);
            assertThat(manageSalaryTab_personInfoSection.isDisplayed()).isTrue();
            reportWithScreenShot("Salary page of a person searched");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Review Tab due to:" + e.getMessage());
            Assert.fail();
        }
    }


    // User click on Action and Edit button
    public void clickActionEdit() {
        try {
            btnAction_ManageSalary.click();
            waitFor(ExpectedConditions.elementToBeClickable(linkActionEdit_ManageSalary), 60);
            linkActionEdit_ManageSalary.click();
            waitFor(ExpectedConditions.elementToBeClickable(manageSalaryTab_currentSalarySection), 60);
            assertThat(manageSalaryTab_currentSalarySection.isDisplayed()).isTrue();
            reportWithScreenShot("User click on Action and Edit button");
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on Edit and update button:" + e.getMessage());
            Assert.fail();
        }
    }

    // User enters new Salary Amount under Current Salary section
    public void enterSalaryAmount() {
        try {
//                if (driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected()) {
//                    Thread.sleep(2000);
//                    chkboxSalarycomponents_ManageSalary.click();
//                    setSalaryAmount();
//                    Thread.sleep(2000);
//                } else {
            setSalaryAmount();
//                }
            Thread.sleep(2000);
        } catch (Exception e) {
            reportWithScreenShot("Error while enter new salary amount :" + e.getMessage());
            Assert.fail();
        }
    }


    // User enter amount in Salary field
    public void setSalaryAmount() throws InterruptedException {
        Thread.sleep(2000);
        scrollToElement(txtboxComponentAmt_ManageSalary);
        waitFor(ExpectedConditions.visibilityOf(txtboxComponentAmt_ManageSalary), 60);
        txtboxComponentAmt_ManageSalary.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        txtboxComponentAmt_ManageSalary.clear();
        txtboxComponentAmt_ManageSalary.sendKeys(data.getSalaryAmount());
        txtboxComponentAmt_ManageSalary.sendKeys(Keys.TAB);
        Thread.sleep(4000);
        String actAmt = txtAnnualSalary.getText().replace(",", "");
//        Assertions.assertThat(txtAnnualSalary.getText().trim().equals(data.getSalaryAmount().trim())).isTrue();
        reportWithScreenShot("user entered new salary amount in Salary amount field");
    }

    public void checkboxUseSalary() {
        try {
            chkboxSalarycomponents_ManageSalary.click();
            waitShortTime();
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabComponents_ManageSalary);
            Thread.sleep(500);
            assertThat(tabComponents_ManageSalary.isDisplayed());
            reportWithScreenShot("Selected checkbox Use salary component");
        } catch (Exception e) {
            reportWithScreenShot("Error while selecting checkbox Use salary component :" + e.getMessage());
            Assert.fail();
        }
    }


    // user validating the Component tab is created on select Use Component is checked
    public void tabComponentsManageSalary() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabComponents_ManageSalary);
            assertThat(tabComponents_ManageSalary.isDisplayed());
            reportWithScreenShot("Components tab is displayed on selecting Use salary component checkbox");
        } catch (Exception e) {
            reportWithScreenShot("Error in displaying component tab:" + e.getMessage());
            Assert.fail();
        }
    }

    // user clicking on Add(+) button in component tab
    public void clickAddComponent() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabComponents_ManageSalary);
            tabComponents_ManageSalary.click();
            waitShortTime();
            addButton_ComponentsTab.click();
            waitFor(ExpectedConditions.visibilityOf(selectComponentDropdown), 15);
            assertThat(selectComponentDropdown.isDisplayed());
            reportWithScreenShot("User clicked on Add(+) button in component tab");
        } catch (Exception e) {
            reportWithScreenShot("Error in clicking Add(+) button in component tab:" + e.getMessage());
            Assert.fail();
        }
    }

    // user selecting component type under component tab in manage salary page
    public void selectComponentTypeManageSalary(String linkName) {

        try {

            selectComponentDropdown.click();
            waitFor(ExpectedConditions.elementToBeClickable(valPromotion), 15);
            assertThat(valPromotion.isDisplayed()).isTrue();
            valPromotion.click();
            reportWithScreenShot(linkName + " is selected from dropdown:");
        } catch (Exception e) {
            reportWithScreenShot("Error While selecting " + linkName + " from dropdown:" + e.getMessage());
            Assert.fail();
        }
    }

    // user clicking on continue button in manage salary page
    public void clickButtonContinueInManageSalary() {

        try {
            btnContinue_ManageSalary.click();
            waitForLoad();
            waitFor(ExpectedConditions.visibilityOf(btnBack_ManageSalary), 30);
            assertThat(btnBack_ManageSalary.isDisplayed()).isTrue();
            reportWithScreenShot(" Adjust amount is entered");
        } catch (Exception e) {
            reportWithScreenShot("Error While entering adjust amountin components tab :" + e.getMessage());
            Assert.fail();
        }

    }


    //user clicks submit button on Manage salary review page

    public void clickSubmitButtonInReviewPage() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(btnSubmit_ManageSalary), 60);
            btnSubmit_ManageSalary.click();
            waitFor(ExpectedConditions.elementToBeClickable(popButtonYes), 60);
            assertThat(popButtonYes.isDisplayed()).isTrue();
            reportWithScreenShot(" Submit button in Manage salary review page is clicked");
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking submit button:" + e.getMessage());
            Assert.fail();
        }
    }

    //user clicks Yes button on Manage salary review page

    public void clickYesOnPopup() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(popButtonYes), 30);
            popButtonYes.click();
            waitFor(ExpectedConditions.elementToBeClickable(confirmBtnOK), 30);
            assertThat(confirmBtnOK.isDisplayed()).isTrue();
            reportWithScreenShot(" Ok button in Manage salary review page is clicked");
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking ok button:" + e.getMessage());
            Assert.fail();
        }
    }


    //user clicks Yes button on Manage salary review page
    public void clickOKOnPopup() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(confirmBtnOK), 30);
            confirmBtnOK.click();
            waitFor(ExpectedConditions.elementToBeClickable(btnDone), 30);
            assertThat(btnDone.isDisplayed()).isTrue();
            reportWithScreenShot(" Ok button in Manage salary review page is clicked");
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking ok button:" + e.getMessage());
            Assert.fail();
        }
    }

    // user selecting component type under component tab in manage salary page
    public void selectSalaryBasis() {
        try {
            String selectValue = null;
            selectValue = data.getSalaryBasis();
            //System.out.println("Salary basis " + selectValue);
            waitFor(ExpectedConditions.elementToBeClickable(dropdownSalaryBasis_ManageSalary), 15);
            dropdownSalaryBasis_ManageSalary.click();
            waitNormalTime();
            WebElement dropdownElement = driver.findElement(By.xpath("//span[text()='" + selectValue + "']"));
            waitFor(ExpectedConditions.elementToBeClickable(dropdownElement), 15);
            assertThat(dropdownElement.isDisplayed()).isTrue();
            dropdownElement.click();
            waitShortTime();
            reportWithScreenShot(" is selected from dropdown:");
        } catch (Exception e) {
            reportWithScreenShot("Error While selecting  from dropdown:" + e.getMessage());
            Assert.fail();
        }
    }

    //user clicks Ok button on Warning modal - Manage salary review page
    public void clickBtnOK_WarningModal() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(btnOK_WarningPopup), 15);
            btnOK_WarningPopup.click();
            waitFor(ExpectedConditions.elementToBeClickable(btnContinue_ManageSalary), 15);
            assertThat(btnContinue_ManageSalary.isDisplayed()).isTrue();
            reportWithScreenShot(" User closes the warning modal by clicking OK button");
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking ok button on warning modal:" + e.getMessage());
            Assert.fail();
        }
    }

    // user entering amount in Amount field under components tab
    public void enterAmountInComponent() {

        try {

            txtFieldAmount_Components.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            waitShortTime();
            txtFieldAmount_Components.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END));
            waitShortTime();
            txtFieldAmount_Components.sendKeys(data.getActualAmount());
            txtFieldAmount_Components.sendKeys(Keys.TAB);
            Thread.sleep(2000);
            assertThat(data.getActualAmount().trim().equals(txtAdjustAmount.getText())).isTrue();
            reportWithScreenShot(" Adjust amount is entered");
        } catch (Exception e) {
            reportWithScreenShot("Error While entering adjust amountin components tab :" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * This method will click on manage personal payment method
     *
     * @author Rakesh Ghosal
     */
    public void clcikOnManagePersonalPaymentMethod() {
        try {

            waitFor(ExpectedConditions.elementToBeClickable(personalPaymentMethods), 15);
            personalPaymentMethods.click();
            Thread.sleep(1000);
            waitFor(ExpectedConditions.elementToBeClickable(ManagePersonalPaymentMethods), 15);
            ManagePersonalPaymentMethods.click();

        } catch (Exception e) {

            reportWithScreenShot("Error while click on manage personal payment method:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * This method validate if we and landed on create personal payment method
     * page
     *
     * @author Rakesh Ghosal
     */
    public void validatePersonalPaymentMethodPage() {
        try {

            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(createPersonalPaymentMethodIndicator), 15);
            assertThat(createPersonalPaymentMethodIndicator.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Personal Payment Method Page is displayed");

        } catch (Exception e) {

            reportWithScreenShot("Create Personal Payment Method page is not displayed:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * This method click on create new payment method button
     *
     * @author Rakesh Ghosal
     */
    public void clickCreateNewPaymentMethodLink() {
        try {

            waitFor(ExpectedConditions.elementToBeClickable(create_Btn), 15);
            create_Btn.click();

        } catch (Exception e) {

            reportWithScreenShot("Create new payment method operation is not done:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * This method validate if we and landed on create personal payment method
     * page
     *
     * @author Rakesh Ghosal
     */
    public void validateCreatePersonalPaymentMethodPage() {
        try {

            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(personalPaymentMethodPageIndicator), 15);
            assertThat(personalPaymentMethodPageIndicator.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Create Personal Payment Method page is displayed");

        } catch (Exception e) {

            reportWithScreenShot("Create Personal Payment Method page is not displayed:" + e.getMessage());
            Assert.fail();
        }

    }


    /**
     * This method will enter value in the fileds of create personal payment
     * page
     *
     * @author Rakesh Ghosal
     */
    public void enterValuesInCreatePersonalPaymentPage() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(bankName), 15);
            bankName.clear();
            bankName.sendKeys(data.getBankName());
            try {
                if (percentage.isDisplayed()) {
                    waitFor(ExpectedConditions.elementToBeClickable(percentage), 15);
                    percentage.clear();
                    percentage.sendKeys(data.getPercentage());
                }
            } catch (Exception e) {
                System.out.println("Percentage is not displayed,skipping");
            }
            selectInputDropdownValue(orgPaymentMethod, data.getOrganizationPaymentMethod());
            reportWithScreenShot("Entering values in create personal payment page");
        } catch (Exception e) {
            reportWithScreenShot("Error while entering bank name,percentage and organization payment method:" + e.getMessage());
        }

    }

    /**
     * This method will validate if we are landed on bank account create page
     *
     * @author Rakesh Ghosal
     */
    public void validateBankAccountCreatePage() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(createBankAccountPageIndicator), 15);
            assertThat(createBankAccountPageIndicator.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Bank Account create page is displayed");
        } catch (Exception e) {
            reportWithScreenShot("Create Bank account page indicator is not displayed:" + e.getMessage());
        }
    }

    /**
     * This method will enter value in the fileds of bank account create page
     * page
     *
     * @author Rakesh Ghosal
     */
    public void enterValuesInBankAccountCreatePage() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(AccountNumber), 15);
            AccountNumber.clear();
            AccountNumber.sendKeys(data.getAccountNumber());
            selectInputDropdownValue(AccountType, data.getAccountType());
            waitFor(ExpectedConditions.elementToBeClickable(AccountHolder), 15);
            AccountHolder.clear();
            AccountHolder.sendKeys(data.getAccountHolder());
            waitFor(ExpectedConditions.elementToBeClickable(RoutingNumber), 15);
            RoutingNumber.clear();
            RoutingNumber.sendKeys(data.getRoutingNumber());
            waitFor(ExpectedConditions.elementToBeClickable(saveclose_btn), 15);
            reportWithScreenShot("Entering values in bank account create page");
            saveclose_btn.click();
            waitFor(ExpectedConditions.invisibilityOf(saveclose_btn));
            Thread.sleep(1000);

        } catch (Exception e) {
            reportWithScreenShot("Error while entering bank details:" + e.getMessage());
        }

    }

    /**
     * This method will click on submit button after Bank Account creation is done
     *
     * @author Rakesh Ghosal
     */
    public void clickSubmitButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(submitButton), 15);
            submitButton.click();
            reportWithScreenShot("Clicking submit button");

        } catch (Exception e) {
            reportWithScreenShot("Submit button is not clicked properly:" + e.getMessage());
        }

    }

    /**
     * This method will click on edit button at the upper right corner in my details page
     *
     * @author Rakesh Ghosal
     */
    public void clickEditButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(editButton), 15);
            editButton.click();
            reportWithScreenShot("Clicking edit button");

        } catch (Exception e) {
            reportWithScreenShot("Edit button is not clicked properly:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * This method will validate if we are landed on contact information page
     *
     * @author Rakesh Ghosal
     */
    public void validateContactInformationPage() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(contactInformationPageIndicator), 15);
            assertThat(contactInformationPageIndicator.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if we are landed on contact information page");
        } catch (Exception e) {
            reportWithScreenShot("Contact information page is not displayed:" + e.getMessage());
            Assert.fail();
        }
    }

    //Check for display of Family and Emergency Contacts Page Display
    public void checkFamilyandEmergencyContactsPageDisplayed() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(familyAndEmergencyPageIndicator), 15);
            assertThat(familyAndEmergencyPageIndicator.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if we are landed on family And Emergency page");
        } catch (Exception e) {
            reportWithScreenShot("Family And Emergency page is not displayed:" + e.getMessage());
            Assert.fail();
        }
    }


    //Check for display of Import and Load Data Page Display
    public void checkImportAndLoadDataDisplayed() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(importAndLoadDataPage), 15);
            assertThat(importAndLoadDataPage.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if we are landed on Import and Load Data Page Display");
        } catch (Exception e) {
            reportWithScreenShot("Import and Load Data Page Display is not displayed:" + e.getMessage());
            Assert.fail();
        }
    }


    //Check for display of Select File Page Display
    public void checkSelectFilePageDisplayed() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(selectFilePage), 15);
            assertThat(selectFilePage.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if we are landed on Select File Page Display");
        } catch (Exception e) {
            reportWithScreenShot("Select File Page Display is not displayed:" + e.getMessage());
            Assert.fail();
        }
    }

    //User clicks on Import File button and Import Local File Option
    public void clickImportFile() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(importFileBtn), 15);
            importFileBtn.click();
            reportWithScreenShot("Clicking Import File button");
            waitFor(ExpectedConditions.elementToBeClickable(importLocalFileBtn), 15);
            importLocalFileBtn.click();
            reportWithScreenShot("Clicking Import Local File Option");

        } catch (Exception e) {
            reportWithScreenShot("Import File button is not clicked properly:" + e.getMessage());
            Assert.fail();
        }

    }

    //User Upload File and click submit button
    // public void clickChooseFile() {
    public void uploadFile() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(chooseFile), 15);
            chooseFile.sendKeys(data.getFilePath());
            reportWithScreenShot("Checking if File path is searched and placed");
            waitFor(ExpectedConditions.elementToBeClickable(submitButtonFileUpload), 15);
            submitButtonFileUpload.click();
            reportWithScreenShot("User clicks Submit after file is browsed");
            waitFor(ExpectedConditions.elementToBeClickable(submitButtonImportDataLoad), 15);
            submitButtonImportDataLoad.click();
            reportWithScreenShot("User clicks Submit for file Upload");

        } catch (Exception e) {
            reportWithScreenShot("Choose File button is not clicked properly:" + e.getMessage());
            Assert.fail();
        }

    }

    //Check for file is submitted successfully
    public void fileSubmit() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(fileSubmitted), 15);
            assertThat(fileSubmitted.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if File is submitted successfully");
        } catch (Exception e) {
            reportWithScreenShot("File submission is not successful due to:" + e.getMessage());
            Assert.fail();
        }
    }


    //User checks if Process ID is generated and sets them back for validating if file is imported properly
    public void CheckProcessIdGeneration() {
        try {
            waitFor(ExpectedConditions.visibilityOf(processId), 15);
            String processId1 = processId.getText();
            //System.out.println(processId1);
            String[] parts = processId1.split(" ");
            String OS = parts[2];
            Integer processId = Integer.parseInt(OS);
            //System.out.println(processId);
            data.setProcessId(processId);
            reportWithScreenShot("Clicking OK button in Process ID generation page");
            processOkBtn.click();
        } catch (Exception e) {
            reportWithScreenShot("Choose File button is not clicked properly:" + e.getMessage());
            Assert.fail();
        }

    }

    //User search for the process ID
    public void searchProcessId() {
        try {
            waitFor(ExpectedConditions.visibilityOf(processIdSearch), 15);
            processIdSearch.click();
            waitFor(ExpectedConditions.visibilityOf(processIdDisplayed), 15);
            assertThat(processIdDisplayed.isDisplayed()).isTrue();

            waitFor(ExpectedConditions.visibilityOf(enterProcessId), 15);
            enterProcessId.sendKeys(String.valueOf(data.getProcessId()));
            reportWithScreenShot("user enter the Process ID in search screen");
            waitFor(ExpectedConditions.elementToBeClickable(searchBtn), 15);
            searchBtn.click();
        } catch (Exception e) {
            reportWithScreenShot("Choose File button is not clicked properly:" + e.getMessage());
            Assert.fail();
        }

    }


    // Click on Refresh Button until File status is imported and loaded
    public void clickRefreshBtn1TillFileLoaded() {
        try {

            elementsize = driver.findElements(By.xpath("//span[text()='" + data.getProcessId() + "']")).size();
            int counter = 0;
            while (elementsize == 0 && counter <= 30) {
                elementsize = driver.findElements(By.xpath("//span[text()='" + data.getProcessId() + "']")).size();
                searchBtn.click();
                waitShortTime();
                counter++;
            }

            waitFor(ExpectedConditions.visibilityOf(salaryDetailsSection), 15);
            scrollToElement(salaryDetailsSection);

            int count = 0;

            waitFor(ExpectedConditions.visibilityOf(loadStatus), 15);

            while (count <= 110) {
                status = loadStatus.getAttribute("title");
                if (status.equals("Success")) {
                    break;
                } else if (status.equals("Error")) {
                    throw new Exception("File Load failure");
                } else {
                    waitShortTime();
                    clickRefreshBtn1();
                }
                count++;
            }
            scrollToElement(processId);
            reportWithScreenShot("Import and load status view");


        } catch (
                Exception e) {
            reportWithScreenShot("Error While importing and loading files:" + e.getMessage());
            Assert.fail();
        }

    }


    //User click person Management
    public void clickPersonManagementLink() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(clickPersonManagementLink), 15);
            clickPersonManagementLink.click();
            reportWithScreenShot("Click person management link");
        } catch (Exception e) {
            reportWithScreenShot("Unable to click person management link due to:" + e.getMessage());
            Assert.fail();
        }
    }

    //User search person created from file
    public void searchNewPerson() {
        try {

            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(hdlName), 15);
            hdlName.sendKeys(data.getHdlName());
            waitFor(ExpectedConditions.elementToBeClickable(searchBtn), 15);
            searchBtn.click();

            // Check for Employee for max 60 seconds
            elementsize = driver
                    .findElements(By.xpath("//img[@title='Actions']")).size();
            int counter = 0;
            while (elementsize == 0 && counter <= 40) {
                elementsize = driver
                        .findElements(By.xpath("//img[@title='Actions']")).size();
                searchBtn.click();
                waitShortTime();
                counter++;
            }

            // Throw Exception if Person name now found after 60 seconds
            if (elementsize == 0) {
                throw new Exception("Person number not found after 60 seconds");
            }
            waitFor(ExpectedConditions.visibilityOf(searchResultsSection), 15);
            scrollToElement(searchResultsSection);
            reportWithScreenShot("Search result displayed");

            waitFor(ExpectedConditions.visibilityOf(hdlPersonNo), 15);
            String hdlPersonNumber = hdlPersonNo.getText();

            // Get generated Person Number and Person Name as store it in data class for other scenarios
            waitFor(ExpectedConditions.visibilityOf(personLink), 15);
            String flName = personLink.getText();
            String[] name = splitString(flName);
            data.setPersonNumber(hdlPersonNumber);
            data.setPersonName(name[1] + " " + name[0]);
        } catch (Exception e) {
            reportWithScreenShot("Unable to search person due to:" + e.getMessage());
            Assert.fail();
        }
    }

    //Check if New Contact Page is displayed
    public void checkNewContactPageDisplayed() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(newContactPage), 15);
            assertThat(newContactPage.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if we are landed on New Contact page");
        } catch (Exception e) {
            reportWithScreenShot("New Contact page is not displayed:" + e.getMessage());
            Assert.fail();
        }
    }


    /**
     * This method will click on contact information link in contact information page
     *
     * @author Rakesh Ghosal
     */
    public void clickContactInformationLink() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(contactInformationLink), 15);
            contactInformationLink.click();
            reportWithScreenShot("Clicking contact information link");

        } catch (Exception e) {
            reportWithScreenShot("Contact information link is not clicked properly:" + e.getMessage());
            Assert.fail();
        }

    }

    //User Clicks on Family and Emergency Contacts option
    public void clickFamilyandEmergencyContacts() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(familyAndEmergencyContactsLink), 15);
            familyAndEmergencyContactsLink.click();
            reportWithScreenShot("Clicking Family And Emergency Contacts Link");

        } catch (Exception e) {
            reportWithScreenShot("Family And Emergency Contacts link is not clicked properly:" + e.getMessage());
            Assert.fail();
        }
    }

    //User Clicks on Add button and New Contact option
    public void clickAddandNewContact() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(myContactsAddBtn), 15);
            myContactsAddBtn.click();
            reportWithScreenShot("Clicking Add Button");

            waitFor(ExpectedConditions.elementToBeClickable(createNewContactOption), 15);
            createNewContactOption.click();
            reportWithScreenShot("Clicking Create a new Contact option");

        } catch (Exception e) {
            reportWithScreenShot("Create a new Contact option is not clicked properly:" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * This method will click on edit address button
     *
     * @author Rakesh Ghosal
     */
    public void clickEditAddressLink() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(editAddressButton), 15);
            editAddressButton.click();
            reportWithScreenShot("Clicking edit address link in Edit my details contact information page");

        } catch (Exception e) {
            reportWithScreenShot("Edit address link is not clicked in Edit my details contact information page:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * Verify that the address format
     *
     * @author Rakesh Ghosal
     */
    public void verifyAddressFormat() {
        try {
            validateElementIsDisplayed(effectiveStartDateRequiredValidation);
            validateElementIsDisplayed(addLine1RequiredValidation);
            validateElementIsDisplayed(zipCode);
            validateElementIsDisplayed(city);
            validateElementIsDisplayed(state);
            validateElementIsDisplayed(addressType);
            validateElementIsDisplayed(country);
            validateElementIsDisplayed(addressLine2);
            //validateElementIsDisplayed(county);
            reportWithScreenShot("Clicking if address format is valid");
        } catch (Exception e) {
            reportWithScreenShot("Address format is not valid:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * This method will click on cancel button
     *
     * @author Rakesh Ghosal
     */
    public void clickCancelButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(cancelBtn), 15);
            cancelBtn.click();
            reportWithScreenShot("Clicking Cancel button");
        } catch (Exception e) {
            reportWithScreenShot("Cancel button is not clicked:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * This method will click on Yes button in the pop up
     *
     * @author Rakesh Ghosal
     */
    public void clickYesButtonInPopUp() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(yesBtn), 15);
            yesBtn.click();
            reportWithScreenShot("Clicking yes button in pop up");
        } catch (Exception e) {
            reportWithScreenShot("Yes button is not clicked in pop up:" + e.getMessage());
            Assert.fail();
        }

    }

    public void clickPersonalDetailsLink() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(lnkPersonalDetails), 30);
//            mouseHover(lnkPersonalDetails);
//            clickWebElement(lnkPersonalDetails);
//            doubleClick(lnkPersonalDetails);
////            lnkPersonalDetails.click();
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", lnkPersonalDetails);
            Thread.sleep(2000);
            waitUntilPageLoad();
            waitFor(ExpectedConditions.visibilityOf(pagePersonalDetails), 60);
            assertThat(pagePersonalDetails.isDisplayed());
            reportWithScreenShot("User clicked on Personal Details link :");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking Personal details link:" + e.getMessage());
            Assert.fail();
        }
    }

    public void checkPersonalDetailPageDisplayed() {
        try {
            assertThat(pagePersonalDetails.isDisplayed());
            reportWithScreenShot("Persona Details page displayed :");
        } catch (Exception e) {
            reportWithScreenShot("Error in displaying Persona Details page displayed:" + e.getMessage());
            Assert.fail();
        }
    }

    public void clickEllipsisOnLogo() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(personMoreInfoEllipsis), 60);
            doubleClick(personMoreInfoEllipsis);
//            personMoreInfoEllipsis.click();
            waitFor(ExpectedConditions.visibilityOf(moreMenu), 60);
            scrollToElement(optionUpdatePhoto);
            assertThat(optionUpdatePhoto.isDisplayed());
            reportWithScreenShot("Users clicked on ellipsis to open More options menu :");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking ellipsis :" + e.getMessage());
            Assert.fail();
        }
    }

    public void checkMoreOptionMenuDisplayed() {
        try {
            scrollToElement(optionUpdatePhoto);
            assertThat(optionUpdatePhoto.isDisplayed());
            reportWithScreenShot("Users More options menu displayed :");
        } catch (Exception e) {
            reportWithScreenShot("Error in displaying More option menu :" + e.getMessage());
            Assert.fail();
        }
    }

    public void clickUpdatePhotoLink() {

        try {
            waitFor(ExpectedConditions.elementToBeClickable(optionUpdatePhoto), 15);
            optionUpdatePhoto.click();
            waitFor(ExpectedConditions.visibilityOf(choosePhotoFile), 60);
            assertThat(choosePhotoFile.isDisplayed());
            reportWithScreenShot("User clicks on Update Photo link from more options menu :");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking Update Photo link :" + e.getMessage());
            Assert.fail();
        }
    }

    public void checkPhotPageDisplayed() {
        try {

            assertThat(choosePhotoFile.isDisplayed());
            reportWithScreenShot("Photo page is displayed :");
        } catch (Exception e) {
            reportWithScreenShot("Error in displaying Photo page:" + e.getMessage());
            Assert.fail();
        }
    }

    public void choosePhotoToUpload() {

        try {
            //String imgLocation = System.getProperty("user.dir") + "/src/main/resources/testdata/TestImage.jpg";
            String imgLocation = data.getFilePath();
            choosePhotoFile.sendKeys(imgLocation);
            Thread.sleep(2000);
            waitFor(ExpectedConditions.visibilityOf(btnPhotoUpdated), 100);
            assertThat(btnPhotoUpdated.isDisplayed()).isTrue();
            reportWithScreenShot("User uploaded the photo :");
        } catch (Exception e) {
            reportWithScreenShot("Error while uploading the photo :" + e.getMessage());
            Assert.fail();
        }
    }

    public void checkUserPhotoUploaded() {
        try {

            waitFor(ExpectedConditions.visibilityOf(btnPhotoUpdated), 100);
            assertThat(btnPhotoUpdated.isDisplayed()).isTrue();
            reportWithScreenShot("User updated the photo Successfully :");
        } catch (Exception e) {
            reportWithScreenShot("Error while updating the photo :" + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Update Employment Window
    public void fillUpdateEmpWindow_PersonMgmt() {
        try {
            // Enter current date into effective date
            waitFor(ExpectedConditions.elementToBeClickable(modalUpdateEmploymentEffectiveDate), 15);
            modalUpdateEmploymentEffectiveDate.clear();
            modalUpdateEmploymentEffectiveDate.sendKeys(getDynamicDate("-", 10));
            modalUpdateEmploymentEffectiveDate.sendKeys(Keys.TAB);
            waitShortTime();

            // Enter Action value
            waitFor(ExpectedConditions.elementToBeClickable(modalUpdateEmploymentAction), 15);
            modalUpdateEmploymentAction.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getEmploymentAction() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getEmploymentAction() + "']")).click();
            modalUpdateEmploymentAction.sendKeys(Keys.TAB);
            waitNormalTime();

            // Enter Action Reason value
            waitFor(ExpectedConditions.elementToBeClickable(modalUpdateEmploymentActionReason), 15);
            modalUpdateEmploymentActionReason.click();
            waitShortTime();
//            waitFor(ExpectedConditions
//                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getEmploymentActionReason() + "']"))), 5);
            if (!data.getEmploymentActionReason().isEmpty()) {
                driver.findElement(By.xpath("//li[text()='" + data.getEmploymentActionReason() + "']")).click();
                modalUpdateEmploymentActionReason.sendKeys(Keys.TAB);
            }
            waitShortTime();
            reportWithScreenShot("User updated the values in Update Employment Modal");
            // Click OK
            btnOK.click();
            waitFor(ExpectedConditions.visibilityOf(editEmploymentPage), 30);
            assertThat(editEmploymentPage.isDisplayed()).isTrue();
            reportWithScreenShot("User clicked OK button on Update Employment Modal");
        } catch (Exception e) {
            reportWithScreenShot("Error While updating values in Update Employment Modal:" + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Update Employment Window
    public void fillCorrectEmpWindow_PersonMgmt() {
        try {
            // Enter Action value
            waitFor(ExpectedConditions.elementToBeClickable(correctEmploymentAction), 15);
            correctEmploymentAction.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getEmploymentAction() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getEmploymentAction() + "']")).click();
            correctEmploymentAction.sendKeys(Keys.TAB);
            waitNormalTime();


            waitShortTime();
            reportWithScreenShot("User updated the values in Correct Employment Modal");
            // Click OK
            correctButtonOK.click();
            waitFor(ExpectedConditions.visibilityOf(editEmploymentPage), 30);
            assertThat(editEmploymentPage.isDisplayed()).isTrue();
            reportWithScreenShot("User clicked OK button on Correct Employment Modal");
        } catch (Exception e) {

            reportWithScreenShot("Error While updating values in Correct Employment Modal:" + e.getMessage());
            Assert.fail();
        }
    }

    public void selectAssignmentStatus(String value) {

        try {
            waitFor(ExpectedConditions.elementToBeClickable(dropdownAssignmentStatus), 30);
            dropdownAssignmentStatus.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getAssignmentStatus() + "']"))), 15);
            WebElement valueToBeSelected = driver.findElement(By.xpath("//li[text()='" + data.getAssignmentStatus() + "']"));
            waitFor(ExpectedConditions.elementToBeClickable(valueToBeSelected), 15);
            assertThat(valueToBeSelected.isDisplayed()).isTrue();
            valueToBeSelected.click();
            reportWithScreenShot("User clicked OK button on Update Employment Modal");
        } catch (Exception e) {
            reportWithScreenShot("Error While updating values in Update Employment Modal:" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * user clicks on Review button
     * Author: Sangameshwar Balur
     */
    public void clickReviewButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(btnReview), 30);
            btnReview.click();
            waitFor(ExpectedConditions.elementToBeClickable(btnBack_ManageSalary), 60);
            Assertions.assertThat(btnBack_ManageSalary.isDisplayed()).isTrue();
            reportWithScreenShot("User clicked on Review  button");
        } catch (Exception e) {
            reportWithScreenShot("Error while user clicks Review button");
            Assert.fail();
        }
    }

    /**
     * Validate work phone, email and address
     * Author: Rakesh Ghosal
     */
    public void validatePhoneEmailAndAddressIsDisplayed() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(workPhoneLink), 30);
            Assertions.assertThat(workPhoneLink.isDisplayed()).isTrue();
            Assertions.assertThat(workEmailLink.isDisplayed()).isTrue();
            Assertions.assertThat(homeAddress.isDisplayed()).isTrue();
            reportWithScreenShot("Phone, home and address is displayed ");
        } catch (Exception e) {
            reportWithScreenShot("Phone, home and address is not displayed");
            Assert.fail();
        }
    }

    /**
     * Click on back button
     * Author: Rakesh Ghosal
     */
    public void clickOnBackButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(backButton), 15);
            backButton.click();
            reportWithScreenShot("User clicks on back button ");
        } catch (Exception e) {
            reportWithScreenShot("Back button is not clicked");
            Assert.fail();
        }
    }

    /**
     * Validate First Name, Last Name, Ethnicity, Marital Status, Gender and Date of Birth is displayed
     * Author: Rakesh Ghosal
     */
    public void validateBiographicalInfoIsDisplayed() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(lastNameReadOnly), 30);
            Assertions.assertThat(lastNameReadOnly.isDisplayed()).isTrue();
            Assertions.assertThat(firstNameReadOnly.isDisplayed()).isTrue();
            Assertions.assertThat(ethnicityReadOnly.isDisplayed()).isTrue();
            Assertions.assertThat(maritalStatusReadOnly.isDisplayed()).isTrue();
            Assertions.assertThat(genderReadOnly.isDisplayed()).isTrue();
            Assertions.assertThat(dateOfBirthReadOnly.isDisplayed()).isTrue();
            reportWithScreenShot("First Name, Last Name, Ethnicity, Marital Status, Gender and Date of Birth is displayed ");
        } catch (Exception e) {
            reportWithScreenShot("First Name, Last Name, Ethnicity, Marital Status, Gender and Date of Birth is not displayed");
            Assert.fail();
        }
    }


    /**
     * Validate First Name, Last Name, Ethnicity, Marital Status, Gender and Date of Birth is displayed
     * Author: Rakesh Ghosal
     */

    public void clickDocumentRecordsLink() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(lnkDocumentRecords), 30);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", lnkDocumentRecords);
            Thread.sleep(2000);
            waitUntilPageLoad();
            assertThat(pageDocumentRecord.isDisplayed());
            reportWithScreenShot("User clicked on Document Records link :");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking Document Records link:" + e.getMessage());
            Assert.fail();
        }
    }

    //clicking Skills and Qualifications link in personal information page
    public void clickSkillsAndQualificationsLink() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(skillsAndQualificationsLink), 15);
            skillsAndQualificationsLink.click();
            reportWithScreenShot("User clicks on Skills and Qualifications link ");
        } catch (Exception e) {
            reportWithScreenShot("Skills and Qualifications link is not clicked");
            Assert.fail();
        }
    }

    //checking Skills and Qualifications page is displayed
    public void checkSkillsAndQualificationsPageDisplayed() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(skillsAndQualificationsPage), 15);
            skillsAndQualificationsPage.click();
            reportWithScreenShot("Skills and Qualifications Page Displayed ");
        } catch (Exception e) {
            reportWithScreenShot("Skills and Qualifications Page is not Displayed");
            Assert.fail();
        }
    }

    //checking Edit Skills and Qualifications page is displayed
    public void checkEditSkillsAndQualificationsPageDisplayed() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(editSkillsAndQualificationsPage), 15);
            editSkillsAndQualificationsPage.click();
            reportWithScreenShot("Edit Skills and Qualifications Page Displayed ");
        } catch (Exception e) {
            reportWithScreenShot("Edit Skills and Qualifications Page is not Displayed");
            Assert.fail();
        }
    }

    // user clicks on Add Content and Degree Link
    public void clickAddContentDegree() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(addContent), 15);
            addContent.click();
            waitFor(ExpectedConditions.elementToBeClickable(degreesLink), 15);
            degreesLink.click();
            reportWithScreenShot("User clicks on Degree Link ");
        } catch (Exception e) {
            reportWithScreenShot("Unable to Click on Degrees Link");
            Assert.fail();
        }
    }

    // user clicks on Add Content and License and Certifications Link
    public void clickAddContentLicense() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(addContent), 15);
            addContent.click();
            waitFor(ExpectedConditions.elementToBeClickable(licensesLink), 15);
            licensesLink.click();
            reportWithScreenShot("User clicks on License and Certifications Link ");
        } catch (Exception e) {
            reportWithScreenShot("Unable to Click on License and Certifications Link");
            Assert.fail();
        }
    }

    //checking Degree page is displayed
    public void checkDegreePageDisplayed() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.visibilityOf(degreeText), 15);
            assertThat(degreeText.isDisplayed()).isTrue();
            reportWithScreenShot("Degree Page Displayed ");
        } catch (Exception e) {
            reportWithScreenShot("Degree Page is not Displayed");
            Assert.fail();
        }
    }

    //checking License and Certifications page is displayed
    public void checkLicensesAndCertificationsPageDisplayed() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.visibilityOf(numberLicensestext), 15);
            assertThat(numberLicensestext.isDisplayed()).isTrue();
            reportWithScreenShot("License and Certifications Page Displayed ");
        } catch (Exception e) {
            reportWithScreenShot("License and Certifications Page is not Displayed");
            Assert.fail();
        }
    }

    // user enter Degree details
    public void enterDegreeDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(degreeSkillsName), 15);
            degreeSkillsName.sendKeys(data.getDegreeName());
            waitFor(ExpectedConditions.elementToBeClickable(degreeMajor), 15);
            degreeMajor.sendKeys(data.getDegreeMajor());
            waitFor(ExpectedConditions.elementToBeClickable(degreeSchool), 15);
            degreeSchool.sendKeys(data.getDegreeSchool());
            waitFor(ExpectedConditions.elementToBeClickable(degreeYear), 15);
            degreeYear.sendKeys(data.getDegreeYear());
            reportWithScreenShot("User enter Degree details ");
        } catch (Exception e) {
            reportWithScreenShot("Error while entering Degree details:" + e.getMessage());
            Assert.fail();
        }
    }

    // user enter License and Certifications details
    public void enterLicensesAndCertificationsDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(degreeSkillsName), 15);
            degreeSkillsName.sendKeys(data.getLicenseName());
            waitFor(ExpectedConditions.elementToBeClickable(skillsNumber), 15);
            skillsNumber.sendKeys(data.getLicenseNumber());
            reportWithScreenShot("User enter License and Certifications details ");
        } catch (Exception e) {
            reportWithScreenShot("Error while entering License and Certifications details:" + e.getMessage());
            Assert.fail();
        }
    }

    // user Clicks Submit button
    public void clickSkillsSubmitButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(btnSubmit_ManageSalary), 15);
            btnSubmit_ManageSalary.click();
            reportWithScreenShot("User clicks Submit button ");
            waitFor(ExpectedConditions.elementToBeClickable(confirmBtnOK), 15);
            confirmBtnOK.click();
            reportWithScreenShot("User clicks ok button in confirmation pop up ");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking Submit button:" + e.getMessage());
            Assert.fail();
        }
    }

    // User click on Manage Person under Task icon
    public void managePersonClick() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(linkManagePerson), 15);
            linkManagePerson.click();
            waitFor(ExpectedConditions.visibilityOf(managePersonPage), 60);
            assertThat(managePersonPage.isDisplayed()).isTrue();
            reportWithScreenShot("Manage Person link clicked and Manage Person page is displayed");
        } catch (Exception e) {
            reportWithScreenShot("Error While Manage Person Link is clicked:" + e.getMessage());
            Assert.fail();
        }
    }

    // User click on Edit and Update button

    /**
     * User clicks on Edit Button and then click on Correct from the dropdown
     *
     * @author Rakesh
     */
    public void clickEditCorrectManagePerson() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(homeAddressEditButton), 15);
            homeAddressEditButton.click();
            waitShortTime();

            waitFor(ExpectedConditions.elementToBeClickable(managePersonCorrectDropdown), 15);
            managePersonCorrectDropdown.click();
            waitShortTime();

            waitFor(ExpectedConditions.visibilityOf(correctAddressPopup), 15);
            assertThat(correctAddressPopup.isDisplayed()).isTrue();

            reportWithScreenShot("Correct option is selected from the edit menu in address:");
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on Edit and Correct button:" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * This method will update the correct address format as given in test data
     * excel
     *
     * @author Rakesh
     */
    public void correctAddressManagePerson() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(altWorkLocationAddressLine1), 15);
            altWorkLocationAddressLine1.clear();
            altWorkLocationAddressLine1.sendKeys(data.getAddressLine1());

            waitFor(ExpectedConditions.elementToBeClickable(altWorkLocationAddressLine2), 15);
            altWorkLocationAddressLine2.clear();
            altWorkLocationAddressLine2.sendKeys(data.getAddressLine2());

            waitFor(ExpectedConditions.elementToBeClickable(zipCode), 15);
            managePersonZip.clear();
            managePersonZip.sendKeys(data.getZipCode());
            managePersonZip.sendKeys(Keys.TAB);
            waitShortTime();

            try {
                waitFor(ExpectedConditions.visibilityOf(searchAndSelectZipCodePopUp), 10);
                String cityToBeSelectedXpath = "//*[contains(text(),'" + data.getCity() + "')]";
                waitShortTime();
                waitFor(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(cityToBeSelectedXpath))),
                        15);
                // driver.findElement(By.xpath(cityToBeSelectedXpath)).click();
                Actions actions = new Actions(driver);
                actions.doubleClick(driver.findElement(By.xpath(cityToBeSelectedXpath))).build().perform();
                waitShortTime();
            } catch (Exception er) {
                logger.info("Search and find Zip code is not displayed ");
            }

            waitFor(ExpectedConditions.elementToBeClickable(managePersonCity), 15);
            if (managePersonCity.getAttribute("value").equalsIgnoreCase(data.getCity()) == false) {
                reportWithScreenShot("Expected city is not matching :");
                Assert.fail();
            }

            try {
                waitFor(ExpectedConditions.visibilityOf(confirmBtnOK), 15);
                confirmBtnOK.click();
            } catch (Exception e) {
                try {
                    managePersonConfirmBtnOK.click();
                } catch (Exception ex) {
                    reportWithScreenShot("Error while correcting home address :");
                    Assert.fail();
                }
            }

            reportWithScreenShot("Correcting Address:");

        } catch (Exception e) {
            reportWithScreenShot("Error while correcting home address :" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * Validate the address is updated in Manage Person Screen
     *
     * @author Rakesh
     */
    public void validateCorrectAddressDisplayed() {
        try {

            waitShortTime();
            String addressXpath = "//span[contains(text(),'" + data.getAddressLine1() + "')]";
            waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(addressXpath))), 15);
            reportWithScreenShot("Address is udpated successfully:");
        } catch (Exception e) {
            reportWithScreenShot("Address is not udpated :" + e.getMessage());
            Assert.fail();
        }
    }

    // User click on Edit and Update button

    /**
     * User clicks on Edit Button and then click on Update from the dropdown
     *
     * @author Rakesh
     */
    public void clickEditUpdateManagePerson() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(homeAddressEditButton), 15);
            homeAddressEditButton.click();
            waitShortTime();

            waitFor(ExpectedConditions.elementToBeClickable(managePersonUpdateDropdown), 15);
            managePersonUpdateDropdown.click();
            waitShortTime();

            waitFor(ExpectedConditions.visibilityOf(effectiveDateAddressPopUp), 15);
            assertThat(effectiveDateAddressPopUp.isDisplayed()).isTrue();
            reportWithScreenShot("Update option is selected from the edit menu in address:");
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on Edit and Correct button:" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * Enter Effective date during address update in Manage Person Screen
     *
     * @author Rakesh
     */
    public void enterEffectiveDate() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(effectiveDate), 15);
            effectiveDate.clear();
            //System.out.println(getCurrentDateWithGivenFormat("MM/dd/yy"));
            effectiveDate.sendKeys(addDaysToDate(getCurrentDateWithGivenFormat("MM/dd/yy"), 2, "MM/dd/yy"));
            effectiveDate.sendKeys(Keys.TAB);
            reportWithScreenShot("Effective date has been entered:");
            waitFor(ExpectedConditions.elementToBeClickable(confirmBtnOK), 15);
            confirmBtnOK.click();
        } catch (Exception e) {
            reportWithScreenShot("Error while entering effective date :" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * User clicks on create address button
     *
     * @author Rakesh
     */
    public void clickCreateAddressButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(createAddressButton), 15);
            createAddressButton.click();
            selectInputDropdownValue(addressType, data.getAltWorkLocationAddressType());
            reportWithScreenShot("Clicked on new address button and selected Address Type:");

        } catch (Exception e) {
            reportWithScreenShot("Error while clicking new address button and selecting Address Type :" + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * This method is to click tabs links on Manage Person page
     *
     * @author Sangameshwar Balur
     *
     * */
    public void taskLinkPage(String taskLinkPage) {
        waitShortTime();
        try {
//            assertThat(context.basePage.checkTaskLinkPageDisplayed(taskLinkPage)).isTrue();
//            reportWithScreenShot(taskLinkPage + " page is displayed successfully");
            Thread.sleep(2000);
            WebElement checkTaskLinkPage = driver.findElement(By.xpath("//div[contains(@title,'" + taskLinkPage + "')]/h1"));
            waitFor(ExpectedConditions.visibilityOf(checkTaskLinkPage));
            boolean status = checkTaskLinkPageDisplayed(taskLinkPage);
            if (status) {
                reportWithScreenShot(taskLinkPage + " page is displayed successfully");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            reportWithScreenShot("Error while displaying " + taskLinkPage + " page");
            Assert.fail();
        }
    }

    /*
     * This method is to click Edit option in Bio info page
     *
     * @author Sangameshwar Balur
     *
     * */
    public void clickEditButtonOfBioInfo() {
        try {
            button_EditBioInfo.click();
            waitFor(ExpectedConditions.visibilityOf(confirmBtnOK));
            assertThat(confirmBtnOK.isDisplayed()).isTrue();
            reportWithScreenShot("User clicked Edit button for Biographical Info");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking Edit button of Biographical Info");
            Assert.fail();
        }
    }

    /*
     * This method is to check Bio Info modal display
     *
     * @author Sangameshwar Balur
     *
     * */
    public void checkBioInfoModalDisplayed() {

        try {
            waitFor(ExpectedConditions.visibilityOf(confirmBtnOK));
            assertThat(confirmBtnOK.isDisplayed()).isTrue();
            reportWithScreenShot("Biographical Info modal is displayed");
        } catch (Exception e) {
            reportWithScreenShot("Error while displaying Biographical Info");
            Assert.fail();
        }
    }

    /*
     * This method is to enter details in Biiographcal Info page
     *
     * @author Sangameshwar Balur
     *
     * */
    public void enterBiographicalInfo() {
        try {
            text_dateOfBirth.clear();
            text_dateOfBirth.sendKeys(data.getDateOfBirth());
            text_dateOfBirth.sendKeys(Keys.TAB);
            text_countryOfBirth.clear();
            text_countryOfBirth.sendKeys(data.getCountryOfBirth());
            waitNormalTime();
            text_countryOfBirth.sendKeys(Keys.ENTER);
            text_countryOfBirth.sendKeys(Keys.TAB);
            waitNormalTime();
            text_regionOfBirth.clear();
            text_regionOfBirth.sendKeys(data.getRegionOfBirth());
            text_townOfBirth.clear();
            text_townOfBirth.sendKeys(data.getTownOfBirth());
            comboBox_correspondenceLanguage.click();
            waitNormalTime();
            WebElement elementToSelect = driver.findElement(By.xpath("//li[text()='" + data.getCorrespondenceLanguage() + "']"));
            elementToSelect.click();
            waitNormalTime();
            comboBox_bloodType.click();
            elementToSelect = driver.findElement(By.xpath("//li[text()='" + data.getBloodType() + "']"));
            elementToSelect.click();
            waitNormalTime();
            reportWithScreenShot("User entered Biographical Info");
        } catch (Exception e) {
            reportWithScreenShot("Error while entering Biographical Info");
            Assert.fail();
        }
    }

    /*
     * This method is to click button OK on BidInfo Modal
     *
     * @author Sangameshwar Balur
     *
     * */
    public void clickOKButtonOnBioInfoModal() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(btnOK), 30);
            btnOK.click();
            waitFor(ExpectedConditions.elementToBeClickable(button_Submit), 30);
            assertThat(button_Submit.isDisplayed()).isTrue();
            reportWithScreenShot("User clicked OK button");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking on OK button");
            Assert.fail();
        }
    }

    /*
     * This method is to click Submit button in Manage Person Page
     *
     * @author Sangameshwar Balur
     *
     * */
    public void clickSubmitButtonInManagePerson() {

        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_Submit), 30);
            waitShortTime();
            button_Submit.click();
            reportWithScreenShot("User clicked Submit button");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking Submit button");
            Assert.fail();
        }
    }

    /*
     * This method is to check display of Warning Modal
     *
     * @author Sangameshwar Balur
     *
     * */

    public void checkWarningModal() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(popButtonYes), 30);
            assertThat(popButtonYes.isDisplayed()).isTrue();
            reportWithScreenShot("Warning modal is displayed");
        } catch (Exception e) {
            reportWithScreenShot("Error while displaying Warning modal");
            Assert.fail();
        }
    }

    /*
     * This method is to check display of Confimation Modal
     *
     * @author Sangameshwar Balur
     *
     * */
    public void checkConfirmationModal() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(confirmBtnOK), 30);
            assertThat(confirmBtnOK.isDisplayed()).isTrue();
            reportWithScreenShot("Confirmation modal is displayed");
        } catch (Exception e) {
            reportWithScreenShot("Error while displaying Confirmation modal");
            Assert.fail();
        }
    }

    /*
     * This method is to click button OK on Confirmaiton modal
     *
     * @author Sangameshwar Balur
     *
     * */

    public void clickOKButtonOnConfirmationModal() {

        try {
            waitFor(ExpectedConditions.elementToBeClickable(confirmBtnOK), 30);
            confirmBtnOK.click();
            reportWithScreenShot("User clicked OK button on confirmation modal");
        } catch (Exception e) {
            reportWithScreenShot("Error while while clicking OK button on Confirmation modal");
            Assert.fail();
        }
    }

    /*
     * This method is to click link Contact in Manage person page
     *
     * @author Sangameshwar Balur
     *
     * */
    public void clickContactsLinkInManagePersonPage() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(link_ContactsInManagePersonPage), 30);
            link_ContactsInManagePersonPage.click();
            waitShortTime();
            reportWithScreenShot("User clicked Contacts link in Manage Person page");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking Contacts link in Manage Person page - " + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * This method is to select Update option from Edit menu.
     *
     * @author Sangameshwar Balur
     *
     * */

    public void clickEditOptionInPersonalRelationshipsPage(String optionToBeClicked) {
        waitNormalTime();
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_CreateFromExistingPerson), 30);
            createEmergencyContact(optionToBeClicked);
            Thread.sleep(1000);
//            waitFor(ExpectedConditions.visibilityOf(modal_CreateContactFromExistingPerson));
            assertThat(driver.findElement(By.xpath("//div[contains(@id,'MAt2:0:SP1:Manag1:0:AT')]//span[text()='" + optionToBeClicked + "']")).isDisplayed()).isTrue();
            waitShortTime();
            reportWithScreenShot("User clicked " + optionToBeClicked + " in Personal Relations page");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking " + optionToBeClicked + " in Personal Relations page" + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * This method is to select Contact type in emergency details
     *
     * @author Sangameshwar Balur
     *
     * */
    public void checkContactTypeModal(String modalName) {
        waitShortTime();
        try {
            WebElement elementContactTypeModal = driver.findElement(By.xpath("//div[text()='" + modalName + "']"));
            waitFor(ExpectedConditions.visibilityOf(elementContactTypeModal));
            assertThat(elementContactTypeModal.isDisplayed()).isTrue();
            reportWithScreenShot(modalName + " modal is displayed");
        } catch (Exception e) {
            reportWithScreenShot("Error while displaying " + modalName + " modal - " + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * This method is to enter details in Relationship Info
     *
     * @author Sangameshwar Balur
     *
     * */
    public void enterDetailsInRelationshipInformationModal() {
        try {
            comboBox_ContactType.click();
            waitShortTime();
            WebElement selectDropDownValues = driver.findElement(By.xpath("//li[text()='" + data.getContactType() + "']"));
            selectDropDownValues.click();
            waitShortTime();
            comboBox_emergencyContact.click();
            selectDropDownValues = driver.findElement(By.xpath("//li[text()='" + data.getEmergencyContact() + "']"));
            selectDropDownValues.click();
            waitShortTime();
            datePicker_EffectiveStartDate.clear();
            datePicker_EffectiveStartDate.sendKeys(getDynamicDate("-", 1));
            datePicker_EffectiveStartDate.sendKeys(Keys.TAB);
            waitShortTime();
            comboBox_Name.click();
            waitShortTime();
            comboBox_selectName.click();
            waitShortTime();
            reportWithScreenShot(" User enter details of Emergency contact details");
        } catch (Exception e) {
            reportWithScreenShot("Error while enteronh Emergency contact details - " + e.getMessage());
            Assert.fail();
        }
    }


    /*
     * This method is to click  Edit in relationship info
     *
     * @author Sangameshwar Balur
     *
     * */

    public void clickEditInPersonalInfo() {

        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_EditName), 30);
            button_EditName.click();
            waitFor(ExpectedConditions.elementToBeClickable(button_CorrectName), 30);
            assertThat(button_CorrectName.isDisplayed()).isTrue();
            reportWithScreenShot("User clicked Edit in Personal Info section");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking on Edit button in personal info" + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * This method is to select Correct option from Edit menu.
     *
     * @author Sangameshwar Balur
     *
     * */

    public void selectCorrectFromEdit() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_CorrectName), 30);
            button_CorrectName.click();
            waitFor(ExpectedConditions.elementToBeClickable(text_lastName_PersonalInfo), 30);
            assertThat(text_lastName_PersonalInfo.isDisplayed()).isTrue();
            reportWithScreenShot("User selected Correct option from Edit menu and displayed Personal Info modal");
        } catch (Exception e) {
            reportWithScreenShot("Error while selecting Correct option from Edit menu in personal info" + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * This method is to select Update Name in Relationship Info
     *
     * @author Sangameshwar Balur
     *
     * */

    public void updateNameRelationshipInfo() {

        try {
            waitFor(ExpectedConditions.elementToBeClickable(text_lastName_PersonalInfo), 30);
            text_lastName_PersonalInfo.clear();
            text_lastName_PersonalInfo.sendKeys(data.getLastName());
            text_lastName_PersonalInfo.sendKeys(Keys.TAB);
            waitShortTime();
            text_firstName_PersonalInfo.clear();
            text_firstName_PersonalInfo.sendKeys(data.getFirstName());
            text_firstName_PersonalInfo.sendKeys(Keys.TAB);
            button_OK_UpdateName.click();
            waitShortTime();
//            assertThat(!button_OK_UpdateName.isDisplayed()).isTrue();
            reportWithScreenShot("User updates First and Last name in Update name modal");
        } catch (Exception e) {
            reportWithScreenShot("Error while selecting Correct option from Edit menu in personal info" + e.getMessage());
            Assert.fail();
        }

    }

    /*
     * This method is to enter Emergency Phone number
     *
     * @author Sangameshwar Balur
     *
     * */

    public void addEmergencyPhoneNumber() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_AddRowForPhoneDetails), 30);
            button_AddRowForPhoneDetails.click();
            waitFor(ExpectedConditions.elementToBeClickable(comboBox_emergencyPhoneType), 30);
            comboBox_emergencyPhoneType.click();
            WebElement selectDropDownValues = driver.findElement(By.xpath("//li[text()='" + data.getEmergencyContactType() + "']"));
            selectDropDownValues.click();

            text_CountryCode.clear();
            text_CountryCode.sendKeys(data.getCountryCode());
            text_CountryCode.sendKeys(Keys.TAB);

            text_emergencyAreaCode.clear();
            text_emergencyAreaCode.sendKeys(data.getAreaCode());
            text_emergencyAreaCode.sendKeys(Keys.TAB);

            text_emergencyPhoneNumber.clear();
            text_emergencyPhoneNumber.sendKeys(data.getPhoneNumber());
            text_emergencyPhoneNumber.sendKeys(Keys.TAB);
            waitNormalTime();

            reportWithScreenShot("User update the emergency contact details in Phone section");

        } catch (Exception e) {
            reportWithScreenShot("Error while updating emergency contact details in Phone section - " + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * This method is to click Edit in Address Area
     *
     * @author Sangameshwar Balur
     *
     * */

    public void clickEditInAddressArea() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_EditAddress), 30);
            button_EditAddress.click();
            waitFor(ExpectedConditions.elementToBeClickable(button_UpdateAddress), 30);
            assertThat(button_UpdateAddress.isDisplayed()).isTrue();
            reportWithScreenShot("User clicked Edit in Address area");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking Edit button in Address area:" + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * This method is to select Update option from Edit menu.
     *
     * @author Sangameshwar Balur
     *
     * */
    public void selectUpdateFromEditMenu() {

        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_UpdateAddress), 30);
            button_UpdateAddress.click();
            waitFor(ExpectedConditions.elementToBeClickable(datePicker_updateAddressEffectiveStartDate), 30);
            assertThat(datePicker_updateAddressEffectiveStartDate.isDisplayed()).isTrue();
            reportWithScreenShot("User selected Update option from Edit menu in address area");
        } catch (Exception e) {
            reportWithScreenShot("Error while selecting Update option from Edit menu in Address area:" + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * This method is to select Update Address details
     *
     * @author Sangameshwar Balur
     * */
    public void updateEmergencyAddressDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(datePicker_updateAddressEffectiveStartDate), 30);
//            datePicker_updateAddressEffectiveStartDate.clear();
//            datePicker_updateAddressEffectiveStartDate.sendKeys(getCurrentDate());
//            datePicker_updateAddressEffectiveStartDate.sendKeys(Keys.TAB);
            button_OK_UpdatAddressDate.click();
            waitShortTime();
            waitFor(ExpectedConditions.elementToBeClickable(button_OK_UpdatAddress), 30);
            assertThat(button_OK_UpdatAddress.isDisplayed()).isTrue();
            updateEmergencyAddress();
            waitNormalTime();
            button_OK_UpdatAddress.click();
            waitNormalTime();
            button_OK_CloseEditWindow.click();
            waitNormalTime();
//            if (button_OK_CloseEditWindow.isDisplayed()) {
//                button_OK_CloseEditWindow.click();
//                waitNormalTime();
//            }
            reportWithScreenShot("User updated emergency address details");

        } catch (Exception e) {
            reportWithScreenShot("Error while updating emergency address details : " + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * This method is to update Emergency Address in Contacts
     *
     * @author Sangameshwar Balur
     * */

    public void updateEmergencyAddress() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(text_updateAddressModal_AddressLine1), 30);
            text_updateAddressModal_AddressLine1.click();
            text_updateAddressModal_AddressLine1.sendKeys(data.getAddressLine1());
            text_updateAddressModal_ZipCode.clear();
            text_updateAddressModal_ZipCode.sendKeys(data.getZipCode());
            text_updateAddressModal_City.clear();
            text_updateAddressModal_City.sendKeys(data.getCity());
            text_updateAddressModal_State.clear();
            text_updateAddressModal_State.sendKeys(data.getState());
            waitNormalTime();
            text_updateAddressModal_County.clear();
            text_updateAddressModal_County.sendKeys(data.getCounty());
            text_updateAddressModal_County.sendKeys(Keys.TAB);
            reportWithScreenShot("User updates emergency contact address");

        } catch (Exception e) {
            reportWithScreenShot("Error while updating emergency contact address : " + e.getMessage());
            Assert.fail();
        }

    }

    /*
     * This method is to click Extra Information tab
     *
     * @author Sangameshwar Balur
     * */

    public void clickLinkExtraInformation() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(link_ExtraInformationInManagePersonPage), 30);
            link_ExtraInformationInManagePersonPage.click();
            waitFor(ExpectedConditions.elementToBeClickable(button_Edit), 30);
            assertThat(button_Edit.isDisplayed()).isTrue();
            reportWithScreenShot("User clicked link Extra Information on Manage Person page");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking link Extra Information on Manage person page : " + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * This method is to click Edit in Extran Info page
     *
     * @author Sangameshwar Balur
     * */
    public void clickEditExtraInfo() {
        try {
            button_Edit.click();
            waitFor(ExpectedConditions.elementToBeClickable(button_CorrectExtraInfo), 15);
            assertThat(button_CorrectExtraInfo.isDisplayed()).isTrue();
            reportWithScreenShot("User clicked on Edit button in Extra info page and edit option are displayed ");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking Edit in Extra Information on Manage person page : " + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * This method is to select Correct option from Edit menu.
     *
     * @author Sangameshwar Balur
     * */
    public void selectCorrectFromEdit_ExtraInfo() {

        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_CorrectExtraInfo), 30);
            button_CorrectExtraInfo.click();
            waitFor(ExpectedConditions.elementToBeClickable(comboBox_Comminity), 30);
            assertThat(comboBox_Comminity.isDisplayed()).isTrue();
            reportWithScreenShot("User selected Correct option from Edit menu and displayed Usage Code for Person page");
        } catch (Exception e) {
            reportWithScreenShot("Error while selecting Correct option from Edit menu in Extra info page" + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * This method is to enter details in Extra Information page.
     *
     * @author Sangameshwar Balur
     * */
    public void fillMiscellaneousInfo_ExtraInfo() {

        try {
            waitFor(ExpectedConditions.elementToBeClickable(comboBox_Comminity), 15);
            comboBox_Comminity.click();
            String dataCommunity = data.getCommunity();
            WebElement selectCommunity = driver.findElement(By.xpath("//li[text()='" + dataCommunity + "']"));
            waitFor(ExpectedConditions.elementToBeClickable(selectCommunity), 15);
            selectCommunity.click();
            checkBox_ExServicePerson.click();
            text_CasteTribe.clear();
            text_CasteTribe.sendKeys(data.getCasteTribe());
            comboBox_ResidentialStatus.click();
            waitNormalTime();
            String resiValue = data.getResidentialStatus();
            WebElement selectResiStatusValue = driver.findElement(By.xpath("//span[text()='" + resiValue + "']"));
            waitFor(ExpectedConditions.elementToBeClickable(selectResiStatusValue), 30);
            selectResiStatusValue.click();
            text_Height.clear();
            text_Height.sendKeys(data.getHeight());
            text_Weight.clear();
            text_Weight.sendKeys(data.getWeight());
            checkBox_PANApplied.click();
            text_PANAcknowledgmentNumber.clear();
            text_PANAcknowledgmentNumber.sendKeys(data.getpanNumber());
            reportWithScreenShot("User fills the Extra info form");
        } catch (Exception e) {
            reportWithScreenShot("Error while filling Extran info form : " + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * This method is to select Update option from Edit menu.
     *
     * @author Sangameshwar Balur
     * */

    public void selectUpdateFromEditMenu_ExtraInfoPage() {

        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_UpdateExtraInfo), 30);
            button_UpdateExtraInfo.click();
            waitFor(ExpectedConditions.elementToBeClickable(datePicker_updateAddressEffectiveStartDate), 30);
            assertThat(datePicker_updateAddressEffectiveStartDate.isDisplayed()).isTrue();
            reportWithScreenShot("User selected Update option to update Extra Information");
        } catch (Exception e) {
            reportWithScreenShot("Error while selecting Update option to Update extra information:" + e.getMessage());
            Assert.fail();
        }
    }

    public void checkPersonalTalentPageDisplayed() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(skillsAndQualificationsPage), 30);
            assertThat(skillsAndQualificationsPage.isDisplayed()).isTrue();
            reportWithScreenShot("Persons Skills and Qualification page is displayed");

        } catch (Exception e) {
            reportWithScreenShot("Error while displaying Persons Skills and Qualification page : " + e.getLocalizedMessage());
            Assert.fail();

        }
    }

    public void clickEditButtonInManageTalentProfilePage() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_EditBioInfo), 15);
            button_EditBioInfo.click();
            reportWithScreenShot("User clicks on Edit button in Skills and Qualifcation page under Talent profile page");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking Edit button in Skills and Qualification page : "+e.getMessage());
            Assert.fail();
        }

    }

    @FindBy(xpath = "//span[text()='Areas of Expertise']")
    private WebElement label_AreaOfExpertise;

    public void checkAreaOfExpertiseSection() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(label_AreaOfExpertise), 15);
            reportWithScreenShot("Area of Expertise page is displayed on clicking Edit button in Skills and Qualifcation page under Talent profile page");
        } catch (Exception e) {
            reportWithScreenShot("Error while displaying Area of Expertise : "+e.getMessage());
            Assert.fail();
        }
    }
}
