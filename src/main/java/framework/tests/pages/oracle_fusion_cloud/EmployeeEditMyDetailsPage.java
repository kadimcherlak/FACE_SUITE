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

    @FindBy(xpath = "(//span[text()='Add'])[5]")
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
    private WebElement EditBtn;

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

    @FindBy(xpath = "//label[contains(@for,'actionReason')]/following::input[1]")
    private WebElement modalUpdateEmploymentActionReason;

    @FindBy(xpath = "//h1[contains(text(),'Edit Employment')]")
    private WebElement editEmploymentPage;

    @FindBy(xpath = "//button[@accesskey='K']")
    private WebElement btnOK;

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

            // Get generated Person Number and Person Name as store it in CSV data sheet for other scenarios
            waitFor(ExpectedConditions.visibilityOf(personLink), 15);
            String flName = personLink.getText();
            String[] name = splitString(flName);
            csvWriter(hdlPersonNumber, name[1] + " " + name[0]);
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
            modalUpdateEmploymentEffectiveDate.sendKeys(getCurrentDate());
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
            if(!data.getEmploymentActionReason().isEmpty()){
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
    
}
