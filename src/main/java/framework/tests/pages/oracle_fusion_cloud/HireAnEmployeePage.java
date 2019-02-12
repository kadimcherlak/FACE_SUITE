package framework.tests.pages.oracle_fusion_cloud;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;

import static org.assertj.core.api.Assertions.assertThat;

public class HireAnEmployeePage extends BasePage<HireAnEmployeePage> {

    Context context;
    Data data;
    Actions actions;
    WebElement hireActionElement;
    WebElement hireReasonElement;
    // Hire An Employee Page Elements
    @FindBy(xpath = "//*[text()='Hire an Employee: Identification']")
    private WebElement hireAnEmployeePageCheck;

    @FindBy(xpath = "//label[text()='Hire Date']/following::input[1]")
   // @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:inputDate1::content")
    private WebElement hireDate;

    @FindBy(xpath = "//input[@title='Hire']")
    //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:selectOneChoice1::content")
    private WebElement hireAction;

    @FindBy(xpath = "//label[text()='Hire Reason']/following::input[1]")
    //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:selectOneChoice2::content")
    private WebElement hireReason;

    @FindBy(xpath = "//label[text()='Legal Employer']/following::input[1]")
   // @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:selectOneChoice3::content")
    private WebElement legalEmployer;


    @FindBy(xpath = "//*[text()='Employee']")
    private WebElement checkWorkerType;

    @FindBy(xpath = "//label[text()='Last Name']/following::input[1]")
   // @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:NewPe1:0:pt_r1:0:r1:0:i1:4:it20::content")
    private WebElement lastName;

    @FindBy(xpath = "//label[text()='First Name']/following::input[1]")
    //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:NewPe1:0:pt_r1:0:r1:0:i1:5:it60::content")
    private WebElement firstName;

    @FindBy(xpath = "//label[text()='Gender']/following::input[1]")
    private WebElement gender;
    
    @FindBy(xpath = "//label[text()='Date of Birth']/following::input[1]")
    private WebElement dateOfBirth;

    @FindBy(xpath = "//input[contains(@id,'EmailRequired')]")
    //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:NewPe1:0:pt_r1:0:df1_PersonDFFIteratorpearsonEmailRequired__FLEX_EMPTY::content")
    private WebElement pearsonEmailRequired;
    
    private WebElement countryNationalId;
    @FindBy(xpath = "//input[contains(@class,'x2h')  and contains(@id,'soc2:content')]")
    //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:NewPe1:0:pt_r1:0:df1_PersonDFFIteratorpearsonEmailRequired__FLEX_EMPTY::content")
   
    private WebElement clickNationalIdType;
    @FindBy(xpath = "//li[text()='Social Security Number']")
    //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:NewPe1:0:pt_r1:0:df1_PersonDFFIteratorpearsonEmailRequired__FLEX_EMPTY::content")
   
    private WebElement selectNationalIdType;
    @FindBy(xpath = "//input[contains(@class,'x25') and contains(@id,'it1:content')]")
    //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:NewPe1:0:pt_r1:0:df1_PersonDFFIteratorpearsonEmailRequired__FLEX_EMPTY::content")
    private WebElement nationalId;
    
    
    @FindBy(xpath = "//div[@title='Next']")
    private WebElement next;
    
    @FindBy(xpath = "//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:pt_r1:0:panelLabelAndMessage4\"]/td[2]")
    private WebElement personNo;
    

    @FindBy(xpath = "//label[text()='Address Line 1']/following::input[1]")
    // @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:Perso1:0:Maint1:0:i1:0:inputText17::content")
     private WebElement addressLine1;

     @FindBy(xpath = "//label[text()='Address Line 2']/following::input[1]")
     //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:Perso1:0:Maint1:0:i1:1:inputText18::content")
     private WebElement addressLine2;

     @FindBy(xpath = "//label[text()='ZIP Code']/following::input[1]")
     //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:Perso1:0:Maint1:0:i1:2:inputComboboxListOfValues28::content")
     private WebElement zipCode;

     @FindBy(xpath = "//label[text()='City']/following::input[1]")
    // @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:Perso1:0:Maint1:0:i1:3:inputComboboxListOfValues27::content")
     private WebElement city;

     @FindBy(xpath = "//label[text()='County']/following::input[1]")
   //  @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:Perso1:0:Maint1:0:i1:4:inputComboboxListOfValues26::content")
     private WebElement county;

     @FindBy(xpath = "//label[text()='State']/following::input[1]")
     //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:Perso1:0:Maint1:0:i1:5:inputComboboxListOfValues25::content")
     private WebElement state;
     @FindBy(xpath = "//label[text()='Marital Status']/following::input[1]")
     //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:pt_r3:0:soc2::content")
     private WebElement maritalStatus;

     @FindBy(xpath = "//label[text()='Veteran Self-Identification Status']/following::input[1]")
    // @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:pt_r3:0:df1_PersonLegislativeIteratorVeteranSelfIdentification_DisplayUS::content")
     private WebElement veteranSelfIdentificationStatus;
     
     @FindBy(xpath = "//label[text()='Newly Separated Veteran Discharge Date']/following::input[1]")
   //  @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:pt_r3:0:df1_PersonLegislativeIteratormilitaryDischargeDateUS::content")
     private WebElement newlySeparatedVeteranDischargeDate;
     
     @FindBy(xpath = "//label[text()='Business Unit']/following::input[1]")
     //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:NewPe1:0:businessUnitId::content")
     private WebElement businessUnit;
     
     @FindBy(xpath = "//label[text()='Job']/following::input[1]")
    // @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:jobId::content")
     private WebElement job;
     
     @FindBy(xpath = "//label[text()='Grade']/following::input[1]")
   //  @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:gradeId::content")
     private WebElement grade;
     
     @FindBy(xpath = "//label[text()='Department']/following::input[1]")
    // @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:departmentId::content")
     private WebElement department;
    
     @FindBy(xpath = "//label[text()='Location']/following::input[1]")
     //  @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:locationId::content")
       private WebElement location;
       
       @FindBy(xpath = "//label[text()='Assignment Category']/following::input[1]")
       //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:selectOneChoice3::content")
       private WebElement assignmentCategory;
       
       @FindBy(xpath = "//label[text()='Working as a Manager']/following::input[1]")
      // @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:selectOneRadio2::drop")
       private WebElement workingAsManager;
       
       @FindBy(xpath = "//label[text()='Hourly Paid or Salaried']/following::input[1]")
       //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:selectOneChoice2::content")
       private WebElement hourlyPaidOrSalaried;
       
       @FindBy(xpath = "//label[text()='Company/Entity']/following::input[1]")
       //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:df2_BaseWorkerAsgDFFIteratorxxpsocompanyentity__FLEX_EMPTY::content")
       private WebElement companyEntity;
       
       @FindBy(xpath = "//label[text()='Cost Center']/following::input[1]")
       //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:df2_BaseWorkerAsgDFFIteratorcostCentre__FLEX_EMPTY::content")
       private WebElement costCenter;
       
       @FindBy(xpath = "//label[text()='ER/Profit Center']/following::input[1]")
       //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:df2_BaseWorkerAsgDFFIteratorxxpsoerprofitcenter__FLEX_EMPTY::content")
       private WebElement erProfitCenter;
    
       @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:r1:0:AT1:_ATp:cil113::icon")
       private WebElement addBtn;
       
       @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:r1:0:AT1:_ATp:table1:0:selectOneChoice1::content")
       private WebElement payroll;
         
       @FindBy(xpath = "//label[text()='I-9 Status']/following::input[1]")
      // @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:df2_WorkRelationshipLegDDFIterator_I9_STATUS_DisplayUS::content")
       private WebElement i9Status;
       
       @FindBy(xpath = "//label[text()='Salary Basis']/following::input[1]")
     //  @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:3:pt1:SP1:r1:0:r5:0:icAsgLov::content")
       private WebElement salaryBasis;
       
       @FindBy(xpath = "//label[text()='Salary Amount']/following::input[1]")
     //  @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:3:pt1:SP1:r1:0:r5:0:itSA::content")
       private WebElement salaryAmount;
       
      @FindBy(xpath = "//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:3:pt1:SP1:r1:0:r5:0:idUseComponents\"]/span/span/label")
       private WebElement salarycmpnt;
       
      @FindBy(xpath = "//div[@title='Submit']")
      // @FindBy(xpath = "//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:4:pt1:AP1:tt1:submit\"]/a/span")
       private WebElement submit;
      
      @FindBy(xpath = "//button[contains(@id,'okWarningDialog')]")
      //@FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:4:pt1:AP1:tt1:okWarningDialog")
      private WebElement warningBtn;
      
      @FindBy(xpath = "//button[contains(@id,'okConfirmationDialog')]")
     // @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:4:pt1:AP1:tt1:okConfirmationDialog")
      private WebElement confirmBtn;  
    
    @FindBy(xpath = "//*[text()='Person Management: Search']")
    private WebElement personManagementSearch;
    
    @FindBy(xpath = "//label[text()='Keywords']/following::input[1]")
    //@FindBy(xpath = "//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:1:MAt1:0:pt1:Perso1:0:SP3:q1:value30::content\"]")
    private WebElement keywords;
    
    @FindBy(xpath = "//label[text()='Effective As-of Date']/following::input[1]")
   // @FindBy(xpath = "//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:1:MAt1:0:pt1:Perso1:0:SP3:q1:value50::content\"]")
    private WebElement effectiveAsOfDate;
    
    @FindBy(xpath = "//button[text()='Search']")
    private WebElement searchBtn;
    
    @FindBy(xpath = "(//span[@class='x2qb'])[2]")
    //@FindBy(xpath = "//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:table2::db\"]/table/tbody/tr/td[2]/div/table/tbody/tr/td[2]/span")
    private WebElement personListed;
    
    @FindBy(xpath = "//img[@title='Actions']")
    private WebElement actionsBtn;
    
    @FindBy(xpath = "/html/body/div[1]/form/div[2]/div[2]/div[1]/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/table/tbody/tr[3]/td[2]")
    private WebElement payrollOption;
    
    @FindBy(xpath = "/html/body/div[1]/form/div[2]/div[2]/div[2]/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[2]")
    private WebElement manageElementEntries;
    
    @FindBy(xpath = "//img[@title='Create']")
    private WebElement createBtn;
    
    @FindBy(xpath = "//label[text()='Element Name']/following::input[1]")
    //@FindBy(xpath = "//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:AT1:ElementTypeLOV::content']")
    private WebElement elementName;
    
    @FindBy(xpath = "//label[text()='Assignment']")
    private WebElement assignment; 
      
    @FindBy(xpath = "//button[@title='Continue']")
    private WebElement continueBtn;
    
    @FindBy(xpath = "//label[text()='Bilingual']/following::input[1]")
    //@FindBy(xpath = "//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:evIter:0:lovScreenEntryValue::content\"]")
    private WebElement bilingualYes;
  
    @FindBy(xpath = "//*[contains(@class,'x10t') and contains(text(),'m')]")
    //@FindBy(xpath = "//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:cb4\"]")
    private WebElement bilingualSubmitBtn;
    
    @FindBy(xpath = "//a[text()='Bilingual Indicator']")
    private WebElement bilingualRowAdded;
  
      public HireAnEmployeePage(Context context) {
        super(context);
        this.context = context;
        this.data = context.getData();
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
        logger.debug("{} loaded", this.getClass().getName());
    }

    // Hire an Employee Page check available
    public boolean checkHireAnEmployeePageAvailable() {
        try {
            reportWithScreenShot("Checking if Hire An Employee Page is Displayed");
            waitFor(ExpectedConditions.visibilityOf(hireAnEmployeePageCheck), 5);
            return hireAnEmployeePageCheck.isDisplayed();
        } catch (Exception e) {
            reportWithScreenShot("Hire An Employee Page not Displayed");
            return hireAnEmployeePageCheck.isDisplayed();
        }
    }

    // Enter Value into Identification tab
    public void fillIdentificationTab() {
        try {
            // Enter Hire Date
            hireDate.clear();
            actions.doubleClick(hireDate).sendKeys(getCurrentDate());
           // actions.moveToElement(hireDate).sendKeys(getCurrentDate()).sendKeys(Keys.ENTER).perform();

            // Select Hire Action
            hireAction.click();
            waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getHireAction() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getHireAction() + "']")).click();
            hireAction.sendKeys(Keys.TAB);

            // Select Hire Reason
            hireReason.click();
            waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getHireReason() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getHireReason() + "']")).click();
            hireReason.sendKeys(Keys.TAB);

            // Check Worker Type
            actions.moveToElement(legalEmployer).click().sendKeys(data.getLegalEmployer()).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();
            assertThat(checkWorkerType.getText().equals(data.getWorkerType())).isTrue();
            Thread.sleep(3000);

            // Enter Last Name
            waitFor(ExpectedConditions.elementToBeClickable(lastName), 5);
            lastName.sendKeys(data.getLastName());
            lastName.sendKeys(Keys.TAB);

            // Enter First Name
            waitFor(ExpectedConditions.elementToBeClickable(firstName), 5);
            firstName.sendKeys(data.getFirstName());
            firstName.sendKeys(Keys.TAB);

            // Select Gender
            waitFor(ExpectedConditions.elementToBeClickable(gender), 5);
            gender.click();
            waitFor(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//li[text()='" + data.getGender() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getGender() + "']")).click();
            
         // Select Date of Birth
             waitFor(ExpectedConditions.elementToBeClickable(dateOfBirth), 5);
              dateOfBirth.sendKeys(data.getDateOfBirth());
              dateOfBirth.sendKeys(Keys.TAB);
            

            // Select Pearson Email Required
            waitFor(ExpectedConditions.elementToBeClickable(pearsonEmailRequired), 5);
            pearsonEmailRequired.click();
            waitFor(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//li[text()='" + data.getPearsonEmailRequired() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getPearsonEmailRequired() + "']")).click();
            reportWithScreenShot("Summary of Identification tab");
            clickNextButton(); //Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads
            System.out.println("before issue");
            
        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value into Identification Tab due to:" + e.getMessage());
        }
    }

    // Enter Value into Person Information tab
    public void fillPersonInformationTab() {
        try {
        	System.out.println("after issue");
        	actions.sendKeys(Keys.TAB);
        	System.out.println("after tab");
        	String personNumber=personNo.getText();
        	
        	System.out.println(personNumber);
        	data.setPersonNumber(personNumber);
        	
            // Enter Address Line 1
            waitFor(ExpectedConditions.elementToBeClickable(addressLine1), 5);
            addressLine1.sendKeys(data.getAddressLine1());
            addressLine1.sendKeys(Keys.TAB);

            // Enter Address Line 2
            waitFor(ExpectedConditions.elementToBeClickable(addressLine2), 5);
            addressLine2.sendKeys(data.getAddressLine2());
            addressLine2.sendKeys(Keys.TAB);

            // Enter Zip Code
            waitFor(ExpectedConditions.elementToBeClickable(zipCode), 5);
            zipCode.sendKeys(data.getZipCode());
            addressLine2.click();
           // zipCode.sendKeys(Keys.TAB);

			/*
			 * // Enter City waitFor(ExpectedConditions.elementToBeClickable(city), 5);
			 * city.sendKeys(data.getCity()); // city.sendKeys(Keys.TAB);
			 * 
			 * // Enter County waitFor(ExpectedConditions.elementToBeClickable(county),
			 * 5); county.sendKeys(data.getCounty());
			 * driver.switchTo().alert().dismiss(); county.sendKeys(Keys.TAB);
			 * 
			 * // Enter State waitFor(ExpectedConditions.elementToBeClickable(state), 5);
			 * state.clear(); state.sendKeys(data.getState());
			 * //driver.switchTo().alert().dismiss(); state.sendKeys(Keys.TAB);
			 */

            // Enter Marital Status
            waitFor(ExpectedConditions.elementToBeClickable(maritalStatus), 5);
            maritalStatus.click();
            waitFor(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//li[text()='" + data.getMaritalStatus() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getMaritalStatus() + "']")).click();
            maritalStatus.sendKeys(Keys.TAB);

            // Enter Veteran Self-Identification Status
            waitFor(ExpectedConditions.elementToBeClickable(veteranSelfIdentificationStatus), 5);
            veteranSelfIdentificationStatus.sendKeys(data.getVeteranSelfIdentificationStatus());
            veteranSelfIdentificationStatus.sendKeys(Keys.TAB);
            
         // Enter Newly Separated Veteran Discharge Date
            waitFor(ExpectedConditions.elementToBeClickable(newlySeparatedVeteranDischargeDate), 5);
            newlySeparatedVeteranDischargeDate.sendKeys(data.getnewlySeparatedVeteranDischargeDate());
           
                   
            scrollToPageTop(driver);
            waitFor(ExpectedConditions.elementToBeClickable(addressLine1), 5);
            clickNextButton(); //Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads
            reportWithScreenShot("Summary of Person Information tab");
        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value into Person Information  Tab due to:" + e.getMessage());
        }
    }

    // Enter Value into Employment Information tab
    public void fillEmploymentInformationTab() {
        try {
        	
        	 // Enter Business Unit
            waitFor(ExpectedConditions.elementToBeClickable(businessUnit), 5);
            businessUnit.sendKeys(data.getBusinessUnit());
        	
            // Enter Job
            waitFor(ExpectedConditions.elementToBeClickable(job), 5);
            job.sendKeys(data.getJob());
            
         // Enter Grade
            waitFor(ExpectedConditions.elementToBeClickable(grade), 5);
            grade.sendKeys(data.getGrade());
            Thread.sleep(3000);
            
         // Enter Department
            waitFor(ExpectedConditions.elementToBeClickable(department), 5);
            department.sendKeys(data.getDepartment());
            Thread.sleep(3000);
            
             // Enter Location
            waitFor(ExpectedConditions.elementToBeClickable(location), 5);
            location.sendKeys(data.getLocation());
            
         // Enter assignment Category
            waitFor(ExpectedConditions.elementToBeClickable(assignmentCategory), 5);
            assignmentCategory.sendKeys(data.getAssignmentCategory());
            
            // Enter working As Manager
            waitFor(ExpectedConditions.elementToBeClickable(workingAsManager), 5);
            workingAsManager.sendKeys(data.getWorkingAsManager());
            
         // Enter hourly Paid Or Salaried
            waitFor(ExpectedConditions.elementToBeClickable(hourlyPaidOrSalaried), 5);
            hourlyPaidOrSalaried.sendKeys(data.getHourlyPaidOrSalaried());
            
         // Enter Company/Entity
            waitFor(ExpectedConditions.elementToBeClickable(companyEntity), 5);
            companyEntity.sendKeys(data.getCompanyEntity());
            
         // Enter Cost Center
            waitFor(ExpectedConditions.elementToBeClickable(costCenter), 5);
            costCenter.sendKeys(data.getCostCenter());
            
         // Enter ER Profit Center
            waitFor(ExpectedConditions.elementToBeClickable(erProfitCenter), 5);
            erProfitCenter.sendKeys(data.getErProfitCenter());
            
            //Clicking Add button to enter Payroll Details
            addBtn.click();
            
            // Select Payroll Details
            waitFor(ExpectedConditions.elementToBeClickable(payroll), 5);
            payroll.sendKeys(data.getPayroll());
            
            scrollToPageTop(driver);
            waitFor(ExpectedConditions.elementToBeClickable(i9Status), 5);
            clickNextButton(); //Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads
           
        	
            reportWithScreenShot("Summary of Employment Information tab");
        	

        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value into Employement Information Tab due to:" + e.getMessage());
        }
    }

    // Enter Value into Compensation and Other Information tab
    public void fillCompensationAndOtherInformationTab() {
        try {

        	// Enter Salary Basis
            waitFor(ExpectedConditions.elementToBeClickable(salaryBasis), 5);
            salaryBasis.sendKeys(data.getSalaryBasis());
            
         // Enter Salary Amount
            waitFor(ExpectedConditions.elementToBeClickable(salaryAmount), 5);
            salaryAmount.sendKeys(data.getSalaryAmount());
        	
           // Enable  Use salary components check box
            waitFor(ExpectedConditions.elementToBeClickable(salarycmpnt), 5);
        	salarycmpnt.click();
        	
        	clickNextButton(); //Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads
                  	       	
        	 reportWithScreenShot("Summary of Compensation and Other Information Tab");
        	
        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value into Compensation and Other Information Tab due to:" + e.getMessage());
        }
    }

    // Check Review tab with Employee information
    public void checkReviewTabDisplayedWithInformation() {
        try {
        	
        	reportWithScreenShot("Summary of Review tab with Employee information");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Review Tab due to:" + e.getMessage());
        }
    }

    // Click on Submit Button to submit new Hire details
    public void clickSubmitButton() {
        try {
        	 waitFor(ExpectedConditions.elementToBeClickable(submit), 5);
         	submit.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While Submitting new Hire information due to:" + e.getMessage());
        }
    }

    // Click on Ok Button if Warning is displayed
    public void clickOk() {
        try {
        	waitFor(ExpectedConditions.elementToBeClickable(warningBtn), 5);
        	warningBtn.click();
        	
        	
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking OK button due to:" + e.getMessage());
        }
    }
    
    // Person Management Search check available
    public boolean checkpersonManagementSearchAvailable() {
        try {
            reportWithScreenShot("Checking if Person Management Search screen is Displayed");
            waitFor(ExpectedConditions.visibilityOf(personManagementSearch), 5);
            return personManagementSearch.isDisplayed();
        } catch (Exception e) {
            reportWithScreenShot("Person Management Search screen not Displayed");
            return personManagementSearch.isDisplayed();
        }
    }
    
 // Enter Value into Person Management: Search screen
    public void searchPerson() {
        try {
        	
        	// Enter person number into keywords
        	waitFor(ExpectedConditions.elementToBeClickable(keywords), 5);
            keywords.sendKeys(data.getPersonNumber());
            
         // Enter effective as of date
            waitFor(ExpectedConditions.elementToBeClickable(effectiveAsOfDate), 5);
            effectiveAsOfDate.clear();
            effectiveAsOfDate.sendKeys(data.geteffectiveAsOfDate());
            Thread.sleep(2500);
            //actions.sendKeys(Keys.TAB);
            //System.out.println("after effective date entered");  
        	reportWithScreenShot("Summary of Person Management: Search screen");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Person Management: Search screen:" + e.getMessage());
        }
    }

 // After entering person number, click on Search Button
    public void clickSearch() {
        try {
        	   System.out.println("before search btn click");     
        	waitFor(ExpectedConditions.elementToBeClickable(searchBtn), 5);
            searchBtn.click();
          
            WebElement personexists=driver.findElement(By.xpath("//td//span[text()='"+data.getPersonNumber()+"']"));
            int counter=0;
            while(!personexists.isDisplayed() && counter<=60)
            {
            	searchBtn.click();
            	counter++;
            }
 
        	reportWithScreenShot("Search Results of person Number");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking search results of employee:" + e.getMessage());
        }
    }
    
 // Validate if search result displays right person details
    public void validateSearchResult() {
        try {
        	
        	// Verify if person number searched matched the record displayed
        	
        	WebElement personexists=driver.findElement(By.xpath("//td//span[text()='"+data.getPersonNumber()+"']"));
            
        		waitFor(ExpectedConditions.visibilityOf(personexists), 5);
                                    	
        	reportWithScreenShot("Search Results of person Number");
        } catch (Exception e) {
            reportWithScreenShot("Error in person displayed from search:" + e.getMessage());
        }
    }

    // User click on actions button 
    public void empNameLinkClick() {
        try {
        	        
        	waitFor(ExpectedConditions.elementToBeClickable(actionsBtn), 5);
            actionsBtn.click();
           
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on EmpName Action click:" + e.getMessage());
        }
    }
    
 // User click on Manage Element Entries 
    public void manageElementEntriesClick() {
        try {
        	        
        	waitFor(ExpectedConditions.elementToBeClickable(payrollOption), 5);
        	payrollOption.click();
            
        	waitFor(ExpectedConditions.elementToBeClickable(manageElementEntries), 5);
        	manageElementEntries.click();
              	
        	reportWithScreenShot("Search Results of person Number");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Review Tab due to:" + e.getMessage());
        }
    }
   
    // Check if Manage Element Entries page available
    public boolean checkManageElementEntriesAvailable() {
        try {
            reportWithScreenShot("Checking if Manage Element Entries page  is Displayed");
            waitFor(ExpectedConditions.visibilityOf(createBtn), 5);
            return createBtn.isDisplayed();
        } catch (Exception e) {
            reportWithScreenShot("Manage Element Entries page  not Displayed");
            return createBtn.isDisplayed();
        }
    }
    
 // User click on Create button 
    public void createButtonClick() {
        try {
        	        
        	waitFor(ExpectedConditions.elementToBeClickable(createBtn), 5);
            createBtn.click();
           
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on Create button:" + e.getMessage());
        }
    }
    
 // User Enter Element Name details as BILINGUAL 
    public void fillElementEntryInfo() {
        try {
        	        
        	 // Enter Business Unit
            waitFor(ExpectedConditions.elementToBeClickable(elementName), 5);
            elementName.sendKeys(data.getelementName());
            actions.sendKeys(Keys.TAB);
            waitFor(ExpectedConditions.visibilityOf(assignment), 5);            
           
        } catch (Exception e) {
            reportWithScreenShot("Error While user enters Element Name:" + e.getMessage());
        }
    }
    
 // Click on Continue Button
    public void clickContinue() {
        try {
            continueBtn.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While User Click Continue Button:" + e.getMessage());
        }
    }
    
    // Hire an Employee Page check available
    public boolean bilingualYesDisplay() {
        try {
            reportWithScreenShot("Checking if Bilingual Field is Displayed");
            waitFor(ExpectedConditions.visibilityOf(bilingualYes), 5);
            return bilingualYes.isDisplayed();
        } catch (Exception e) {
            reportWithScreenShot("Bilingual field not Displayed");
            return bilingualYes.isDisplayed();
        }
    }
    
 // Click on Submit Button for Bilingual
    public void bilingualSubmit() {
        try {
        	bilingualSubmitBtn.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While User bilingual Submit Button:" + e.getMessage());
        }
    }
    
    public boolean bilingualRowAdded() {
        try {
            reportWithScreenShot("Checking if Bilingual row is Displayed");
            waitFor(ExpectedConditions.visibilityOf(bilingualRowAdded), 5);
            return bilingualRowAdded.isDisplayed();
        } catch (Exception e) {
            reportWithScreenShot("Bilingual row is not added");
            return bilingualRowAdded.isDisplayed();
        }
    }
      
// Click on Next to goto next tab
    public void clickNextButton() {
        try {
            next.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While Next Button due to:" + e.getMessage());
        }
    }

     public void checkSubmitSuccessful() {
    	 
        try {
        	waitFor(ExpectedConditions.elementToBeClickable(confirmBtn), 5);
        	confirmBtn.click();
        	Thread.sleep(3000);

        } catch (Exception e) {
            reportWithScreenShot("Submission not successful due to:" + e.getMessage());
        }
    }
     
     
}

