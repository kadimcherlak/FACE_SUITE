package framework.tests.pages.oracle_fusion_cloud;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:inputDate1::content")
    private WebElement hireDate;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:selectOneChoice1::content")
    private WebElement hireAction;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:selectOneChoice2::content")
    private WebElement hireReason;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:selectOneChoice3::content")
    private WebElement legalEmployer;

    @FindBy(xpath = "//*[text()='Employee']")
    private WebElement checkWorkerType;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:NewPe1:0:pt_r1:0:r1:0:i1:4:it20::content")
    private WebElement lastName;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:NewPe1:0:pt_r1:0:r1:0:i1:5:it60::content")
    private WebElement firstName;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:NewPe1:0:pt_r1:0:soc3::content")
    private WebElement gender;
    
    @FindBy(xpath = "(//input[@placeholder='dd-mmm-yyyy'])[2]")
    private WebElement dateOfBirth;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:NewPe1:0:pt_r1:0:df1_PersonDFFIteratorpearsonEmailRequired__FLEX_EMPTY::content")
    private WebElement pearsonEmailRequired;

    @FindBy(xpath = "//div[@title='Next']")
    private WebElement next;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:Perso1:0:Maint1:0:i1:0:inputText17::content")
    private WebElement addressLine1;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:Perso1:0:Maint1:0:i1:1:inputText18::content")
    private WebElement addressLine2;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:Perso1:0:Maint1:0:i1:2:inputComboboxListOfValues28::content")
    private WebElement zipCode;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:Perso1:0:Maint1:0:i1:3:inputComboboxListOfValues27::content")
    private WebElement city;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:Perso1:0:Maint1:0:i1:4:inputComboboxListOfValues26::content")
    private WebElement county;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:Perso1:0:Maint1:0:i1:5:inputComboboxListOfValues25::content")
    private WebElement state;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:pt_r3:0:soc2::content")
    private WebElement maritalStatus;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:pt_r3:0:df1_PersonLegislativeIteratorVeteranSelfIdentification_DisplayUS::content")
    private WebElement veteranSelfIdentificationStatus;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:pt1:SP1:Perso2:0:pt_r3:0:df1_PersonLegislativeIteratormilitaryDischargeDateUS::content")
    private WebElement newlySeparatedVeteranDischargeDate;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:NewPe1:0:businessUnitId::content")
    private WebElement businessUnit;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:jobId::content")
    private WebElement job;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:gradeId::content")
    private WebElement grade;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:departmentId::content")
    private WebElement department;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:locationId::content")
    private WebElement location;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:selectOneChoice3::content")
    private WebElement assignmentCategory;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:selectOneRadio2::drop")
    private WebElement workingAsManager;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:selectOneChoice2::content")
    private WebElement hourlyPaidOrSalaried;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:df2_BaseWorkerAsgDFFIteratorxxpsocompanyentity__FLEX_EMPTY::content")
    private WebElement companyEntity;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:df2_BaseWorkerAsgDFFIteratorcostCentre__FLEX_EMPTY::content")
    private WebElement costCenter;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:JobDe1:0:df2_BaseWorkerAsgDFFIteratorxxpsoerprofitcenter__FLEX_EMPTY::content")
    private WebElement erProfitCenter;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:r1:0:AT1:_ATp:cil113::icon")
    private WebElement addBtn;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:r1:0:AT1:_ATp:table1:0:selectOneChoice1::content")
    private WebElement payroll;
        
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:df2_WorkRelationshipLegDDFIterator_I9_STATUS_DisplayUS::content")
    private WebElement i9Status;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:3:pt1:SP1:r1:0:r5:0:icAsgLov::content")
    private WebElement salaryBasis;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:3:pt1:SP1:r1:0:r5:0:itSA::content")
    private WebElement salaryAmount;
    
    @FindBy(xpath = "//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:3:pt1:SP1:r1:0:r5:0:idUseComponents\"]/span/span/label")
    private WebElement salarycmpnt;
    
    @FindBy(xpath = "//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:4:pt1:AP1:tt1:submit\"]/a/span")
    private WebElement submit;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:4:pt1:AP1:tt1:okWarningDialog")
    private WebElement warningBtn;
    
    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:4:pt1:AP1:tt1:okConfirmationDialog")
    private WebElement confirmBtn;  
    
    

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
            waitFor(ExpectedConditions.visibilityOf(hireAnEmployeePageCheck), 5000);
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
            waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getHireAction() + "']"))), 5000);
            driver.findElement(By.xpath("//li[text()='" + data.getHireAction() + "']")).click();
            hireAction.sendKeys(Keys.TAB);

            // Select Hire Reason
            hireReason.click();
            waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getHireReason() + "']"))), 5000);
            driver.findElement(By.xpath("//li[text()='" + data.getHireReason() + "']")).click();
            hireReason.sendKeys(Keys.TAB);

            // Check Worker Type
            actions.moveToElement(legalEmployer).click().sendKeys(data.getLegalEmployer()).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();
            assertThat(checkWorkerType.getText().equals(data.getWorkerType())).isTrue();

            // Enter Last Name
            waitFor(ExpectedConditions.elementToBeClickable(lastName), 5000);
            lastName.sendKeys(data.getLastName());
            lastName.sendKeys(Keys.TAB);

            // Enter First Name
            waitFor(ExpectedConditions.elementToBeClickable(firstName), 5000);
            firstName.sendKeys(data.getFirstName());
            firstName.sendKeys(Keys.TAB);

            // Select Gender
            waitFor(ExpectedConditions.elementToBeClickable(gender), 5000);
            gender.click();
            waitFor(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//li[text()='" + data.getGender() + "']"))), 5000);
            driver.findElement(By.xpath("//li[text()='" + data.getGender() + "']")).click();
            
         // Select Date of Birth
             waitFor(ExpectedConditions.elementToBeClickable(dateOfBirth), 5000);
              dateOfBirth.sendKeys(data.getDateOfBirth());
              dateOfBirth.sendKeys(Keys.TAB);
            

            // Select Pearson Email Required
            waitFor(ExpectedConditions.elementToBeClickable(pearsonEmailRequired), 5000);
            pearsonEmailRequired.click();
            waitFor(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//li[text()='" + data.getPearsonEmailRequired() + "']"))), 5000);
            driver.findElement(By.xpath("//li[text()='" + data.getPearsonEmailRequired() + "']")).click();
            reportWithScreenShot("Summary of Identification tab");
            clickNextButton(); //Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads
            
        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value into Identification Tab due to:" + e.getMessage());
        }
    }

    // Enter Value into Person Information tab
    public void fillPersonInformationTab() {
        try {
            // Enter Address Line 1
            waitFor(ExpectedConditions.elementToBeClickable(addressLine1), 5000);
            addressLine1.sendKeys(data.getAddressLine1());
            addressLine1.sendKeys(Keys.TAB);

            // Enter Address Line 2
            waitFor(ExpectedConditions.elementToBeClickable(addressLine2), 5000);
            addressLine2.sendKeys(data.getAddressLine2());
            addressLine2.sendKeys(Keys.TAB);

            // Enter Zip Code
            waitFor(ExpectedConditions.elementToBeClickable(zipCode), 5000);
            zipCode.sendKeys(data.getZipCode());
            addressLine2.click();
           // zipCode.sendKeys(Keys.TAB);

			/*
			 * // Enter City waitFor(ExpectedConditions.elementToBeClickable(city), 5000);
			 * city.sendKeys(data.getCity()); // city.sendKeys(Keys.TAB);
			 * 
			 * // Enter County waitFor(ExpectedConditions.elementToBeClickable(county),
			 * 5000); county.sendKeys(data.getCounty());
			 * driver.switchTo().alert().dismiss(); county.sendKeys(Keys.TAB);
			 * 
			 * // Enter State waitFor(ExpectedConditions.elementToBeClickable(state), 5000);
			 * state.clear(); state.sendKeys(data.getState());
			 * //driver.switchTo().alert().dismiss(); state.sendKeys(Keys.TAB);
			 */

            // Enter Marital Status
            waitFor(ExpectedConditions.elementToBeClickable(maritalStatus), 5000);
            maritalStatus.click();
            waitFor(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//li[text()='" + data.getMaritalStatus() + "']"))), 5000);
            driver.findElement(By.xpath("//li[text()='" + data.getMaritalStatus() + "']")).click();
            maritalStatus.sendKeys(Keys.TAB);

            // Enter Veteran Self-Identification Status
            waitFor(ExpectedConditions.elementToBeClickable(veteranSelfIdentificationStatus), 5000);
            veteranSelfIdentificationStatus.sendKeys(data.getVeteranSelfIdentificationStatus());
            veteranSelfIdentificationStatus.sendKeys(Keys.TAB);
            
         // Enter Newly Separated Veteran Discharge Date
            waitFor(ExpectedConditions.elementToBeClickable(newlySeparatedVeteranDischargeDate), 5000);
            newlySeparatedVeteranDischargeDate.sendKeys(data.getnewlySeparatedVeteranDischargeDate());
           
                   
            scrollToPageTop(driver);
            waitFor(ExpectedConditions.elementToBeClickable(addressLine1), 5000);
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
            waitFor(ExpectedConditions.elementToBeClickable(businessUnit), 5000);
            businessUnit.sendKeys(data.getBusinessUnit());
        	
            // Enter Job
            waitFor(ExpectedConditions.elementToBeClickable(job), 5000);
            job.sendKeys(data.getJob());
            
         // Enter Grade
            waitFor(ExpectedConditions.elementToBeClickable(grade), 5000);
            grade.sendKeys(data.getGrade());
            Thread.sleep(3000);
            
         // Enter Department
            waitFor(ExpectedConditions.elementToBeClickable(department), 5000);
            department.sendKeys(data.getDepartment());
            Thread.sleep(3000);
            
             // Enter Location
            waitFor(ExpectedConditions.elementToBeClickable(location), 5000);
            location.sendKeys(data.getLocation());
            
         // Enter assignment Category
            waitFor(ExpectedConditions.elementToBeClickable(assignmentCategory), 5000);
            assignmentCategory.sendKeys(data.getAssignmentCategory());
            
            // Enter working As Manager
            waitFor(ExpectedConditions.elementToBeClickable(workingAsManager), 5000);
            workingAsManager.sendKeys(data.getWorkingAsManager());
            
         // Enter hourly Paid Or Salaried
            waitFor(ExpectedConditions.elementToBeClickable(hourlyPaidOrSalaried), 5000);
            hourlyPaidOrSalaried.sendKeys(data.getHourlyPaidOrSalaried());
            
         // Enter Company/Entity
            waitFor(ExpectedConditions.elementToBeClickable(companyEntity), 5000);
            companyEntity.sendKeys(data.getCompanyEntity());
            
         // Enter Cost Center
            waitFor(ExpectedConditions.elementToBeClickable(costCenter), 5000);
            costCenter.sendKeys(data.getCostCenter());
            
         // Enter ER Profit Center
            waitFor(ExpectedConditions.elementToBeClickable(erProfitCenter), 5000);
            erProfitCenter.sendKeys(data.getErProfitCenter());
            
            //Clicking Add button to enter Payroll Details
            addBtn.click();
            
            // Select Payroll Details
            waitFor(ExpectedConditions.elementToBeClickable(payroll), 5000);
            payroll.sendKeys(data.getPayroll());
            
            scrollToPageTop(driver);
            waitFor(ExpectedConditions.elementToBeClickable(i9Status), 5000);
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
            waitFor(ExpectedConditions.elementToBeClickable(salaryBasis), 5000);
            salaryBasis.sendKeys(data.getSalaryBasis());
            
         // Enter Salary Amount
            waitFor(ExpectedConditions.elementToBeClickable(salaryAmount), 5000);
            salaryAmount.sendKeys(data.getSalaryAmount());
        	
           // Enable  Use salary components check box
            waitFor(ExpectedConditions.elementToBeClickable(salarycmpnt), 5000);
        	salarycmpnt.click();
        	
        	clickNextButton(); //Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads
            
            Thread.sleep(5000);
        	       	
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
        	 waitFor(ExpectedConditions.elementToBeClickable(submit), 5000);
         	submit.click();

        } catch (Exception e) {
            reportWithScreenShot("Error While Submitting new Hire information due to:" + e.getMessage());
        }
    }

    // Click on Ok Button if Warning is displayed
    public void clickOk() {
        try {
        	waitFor(ExpectedConditions.elementToBeClickable(warningBtn), 5000);
        	warningBtn.click();
        	
        	
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking OK button due to:" + e.getMessage());
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
        	waitFor(ExpectedConditions.elementToBeClickable(confirmBtn), 5000);
        	confirmBtn.click();
        	Thread.sleep(3000);

        } catch (Exception e) {
            reportWithScreenShot("Submission not successful due to:" + e.getMessage());
        }
    }
}

