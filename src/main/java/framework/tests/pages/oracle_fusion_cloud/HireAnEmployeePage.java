package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.Assertions.assertThat;

public class HireAnEmployeePage extends BasePage<HireAnEmployeePage> {

    private Context context;
    private Data data;
    private Actions actions;

    // Hire An Employee Page Elements
    @FindBy(xpath = "//*[text()='Hire an Employee: Identification']")
    private WebElement hireAnEmployeePageCheck;

    @FindBy(xpath = "//*[text()='Hire an Employee: Person Information']")
    private WebElement personInfoPageCheck;

    @FindBy(xpath = "//label[text()='Hire Date']/following::input[1]")
    private WebElement hireDate;

    @FindBy(xpath = "//input[@title='Hire']")
    private WebElement hireAction;

    @FindBy(xpath = "//label[text()='Hire Reason']/following::input[1]")
    private WebElement hireReason;

    @FindBy(xpath = "//label[text()='Legal Employer']/following::input[1]")
    private WebElement legalEmployer;

    @FindBy(xpath = "//*[text()='Employee']")
    private WebElement checkWorkerType;

    @FindBy(xpath = "//label[text()='Last Name']/following::input[1]")
    private WebElement lastName;

    @FindBy(xpath = "//label[text()='First Name']/following::input[1]")
    private WebElement firstName;

    @FindBy(xpath = "//label[text()='Gender']/following::input[1]")
    private WebElement gender;

    @FindBy(xpath = "//label[text()='Date of Birth']/following::input[1]")
    private WebElement dateOfBirth;

    @FindBy(xpath = "//input[contains(@id,'EmailRequired')]")
    private WebElement pearsonEmailRequired;

    @FindBy(xpath = "//img[@title='Add Row']")
    private WebElement addRow;

    @FindBy(xpath = "//input[@class='x109' and contains(@id,'iclov1::content') and contains(@name,'iclov1')]")
    private WebElement country;

    @FindBy(xpath = "//input[@class='x2h' and contains(@id,'soc2::content') and contains(@aria-owns,'soc2::pop')]")
    private WebElement clickNationalIdType;

    @FindBy(xpath = "//input[@class='x25' and contains(@id,'table2:0:it1::content') and contains(@name,'table2:0:it1')]")
    private WebElement nationalId;

    @FindBy(xpath = "//label[text()='Person Number']/following::td[1]")
    private WebElement personNo;

    @FindBy(xpath = "//label[text()='Address Line 1']/following::input[1]")
    private WebElement addressLine1;

    @FindBy(xpath = "//label[text()='Address Line 2']/following::input[1]")
    private WebElement addressLine2;

    @FindBy(xpath = "//label[text()='ZIP Code']/following::input[1]")
    private WebElement zipCode;

    @FindBy(xpath = "//label[text()='City']/following::input[1]")
    private WebElement city;

    @FindBy(xpath = "//label[text()='County']/following::input[1]")
    private WebElement county;

    @FindBy(xpath = "//label[text()='State']/following::input[1]")
    private WebElement state;

    @FindBy(xpath = "//label[text()='Marital Status']/following::input[1]")
    private WebElement maritalStatus;

    @FindBy(xpath = "//label[text()='Veteran Self-Identification Status']/following::input[1]")
    private WebElement veteranSelfIdentificationStatus;

    @FindBy(xpath = "//label[text()='Newly Separated Veteran Discharge Date']/following::input[1]")
    private WebElement newlySeparatedVeteranDischargeDate;

    @FindBy(xpath = "//label[text()='Business Unit']/following::input[1]")
    private WebElement businessUnit;

    @FindBy(xpath = "//label[text()='Job']/following::input[1]")
    private WebElement job;

    @FindBy(xpath = "//label[text()='Grade']/following::input[1]")
    private WebElement grade;

    @FindBy(xpath = "//label[text()='Department']/following::input[1]")
    private WebElement department;

    @FindBy(xpath = "//label[text()='Location']/following::input[1]")
    private WebElement location;

    @FindBy(xpath = "//label[text()='Assignment Category']/following::input[1]")
    private WebElement assignmentCategory;

    @FindBy(xpath = "//label[text()='Working as a Manager']/following::input[1]")
    private WebElement workingAsManager;

    @FindBy(xpath = "//label[text()='Hourly Paid or Salaried']/following::input[1]")
    private WebElement hourlyPaidOrSalaried;

    @FindBy(xpath = "//label[text()='Company/Entity']/following::input[1]")
    private WebElement companyEntity;

    @FindBy(xpath = "//label[text()='Cost Center']/following::input[1]")
    private WebElement costCenter;

    @FindBy(xpath = "//label[text()='ER/Profit Center']/following::input[1]")
    private WebElement erProfitCenter;

    @FindBy(xpath = "//input[@class='x109' and contains(@id,'table1:0:selectOneChoice1::content') and contains(@name,'table1:0:selectOneChoice1')]")
    private WebElement payroll;

    @FindBy(xpath = "//label[text()='I-9 Status']/following::input[1]")
    private WebElement i9Status;

    @FindBy(xpath = "//label[text()='Salary Basis']/following::input[1]")
    private WebElement salaryBasis;

    @FindBy(xpath = "//label[text()='Salary Amount']/following::input[1]")
    private WebElement salaryAmount;

    @FindBy(xpath = "//label[@class='x1cd']")
    private WebElement salarycmpnt;

    @FindBy(xpath = "//*[text()='Hire an Employee: Review']")
    private WebElement reviewTab;

    @FindBy(xpath = "//*[text()='Person Management: Search']")
    private WebElement personManagementSearch;

    @FindBy(xpath = "//label[text()='Keywords']/following::input[1]")
    private WebElement keywords;

    @FindBy(xpath = "//label[text()='Effective As-of Date']/following::input[1]")
    private WebElement effectiveAsOfDate;

    @FindBy(xpath = "//button[text()='Search']")
    private WebElement searchBtn;

    @FindBy(xpath = "(//span[@class='x2qb'])[2]")
    private WebElement personListed;

    @FindBy(xpath = "//img[@title='Actions']")
    private WebElement actionsBtn;

    @FindBy(xpath = "(//td[text()='Payroll'])[2]")
    private WebElement payrollOption;

    //@TODO - Locator to be fixed
    @FindBy(xpath = "/html/body/div[1]/form/div[2]/div[2]/div[2]/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[2]")
    private WebElement manageElementEntries;

    @FindBy(xpath = "(//*[text()='Manage Element Entries'])[1]")
    private WebElement manageElementEnteriesTextCheck;

    @FindBy(xpath = "//label[text()='Element Name']/following::input[1]")
    private WebElement elementName;

    @FindBy(xpath = "//label[text()='Assignment']")
    private WebElement assignment;

    @FindBy(xpath = "//label[text()='Payroll Relationship']")
    private WebElement payrollRelationship;

    @FindBy(xpath = "//button[@title='Continue']")
    private WebElement continueBtn;

    @FindBy(xpath = "//label[text()='Bilingual']/following::input[1]")
    private WebElement bilingualYes;

    @FindBy(xpath = "//a[text()='Bilingual Indicator']")
    private WebElement bilingualRowAdded;

    @FindBy(xpath = "//label[text()='Actual Amount']/following::input[1]")
    private WebElement actualAmount;

    @FindBy(xpath = "//label[text()='Paycheck Date']/following::input[1]")
    private WebElement payCheckDate;

    @FindBy(xpath = "//*[contains(@class,'x10t') and contains(text(),'m')]")
    private WebElement bilingualSubmitBtn;

    @FindBy(xpath = "//*[contains(@class,'x10t') and contains(text(),'m')]")
    private WebElement adpSubmitBtn;

    @FindBy(xpath = "//*[contains(text(),'ADP Auto & Home')]")
    private WebElement adpRowAdded;

    @FindBy(xpath = "(//span[@class='xwb'])[1]")
    private WebElement done;

    //@TODO - Locator to be fixed
    @FindBy(xpath = "//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:table2:0:gl1\"]")
    private WebElement personLink;

    @FindBy(xpath = "//a[@title='Edit']")
    private WebElement personMgmtEdit;

    @FindBy(xpath = "//tr[contains(@id,'updBtn')]")
    private WebElement personMgmtUpdate;

    @FindBy(xpath = "//div[text()='Update Employment']")
    private WebElement updateEmploymentTitle;

    @FindBy(xpath = "//div[@title='Close person management']")
    private WebElement personMgmtDone;

    @FindBy(xpath = "//label[contains(@for,'effectiveDate')]//following::input[1]")
    private WebElement updateEmploymentEffectiveDate;

    @FindBy(xpath = "//label[contains(@for,'actionsName')]/following::input[1]")
    private WebElement updateEmploymentAction;

    @FindBy(xpath = "//label[contains(@for,'actionReason')]/following::input[1]")
    private WebElement updateEmploymentActionReason;

    @FindBy(xpath = "//button[@accesskey='K']")
    private WebElement btnOK;

    @FindBy(xpath = "//label[text()='Destination Legal Employer']/following::input[1]")
    private WebElement updateEmploymentDestLegalEmployer;

    @FindBy(xpath = "//label[contains(@for,'rdoMakePrimary:_0')]")
    private WebElement updateEmploymentCreatePrimaryWork;

    @FindBy(xpath = "//h1[text()='Global Temporary Assignment: Identification']")
    private WebElement globalTempAssignment;

    @FindBy(xpath = "//label[text()='Existing Address']")
    private WebElement personalInfoExistingAddress;

    @FindBy(xpath = "//label[text()='Global Mobility Indicator']/following::input[1]")
    private WebElement empInfoGlobalMobilityInd;

    @FindBy(xpath = "//label[text()='Working Hours']/following::input[1]")
    private WebElement empInfoWorkingHrs;

    @FindBy(xpath = "//h1[text()='Global Temporary Assignment: Employment Information']")
    private WebElement globalTempAssignmentEmpInfo;

    public HireAnEmployeePage(Context context) {
        super(context);
        this.context = context;
        this.data = context.getData();
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
        logger.debug("{} loaded", this.getClass().getName());
    }

    // Hire an Employee Page check available
    public void checkHireAnEmployeePageAvailable() {
        try {
            waitFor(ExpectedConditions.visibilityOf(hireAnEmployeePageCheck), 15);
            assertThat(hireAnEmployeePageCheck.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Hire An Employee Page is Displayed");
        } catch (Exception e) {
            assertThat(hireAnEmployeePageCheck.isDisplayed()).isTrue();
            reportWithScreenShot("Hire An Employee Page not Displayed due to: " + e.getMessage());

        }
    }

    // Enter Value into Identification tab
    public void fillIdentificationTab() {
        try {
            // Enter Hire Date
            hireDate.clear();
            actions.doubleClick(hireDate).sendKeys(getCurrentDate());

            // Select Hire Action
            hireAction.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getHireAction() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getHireAction() + "']")).click();
            hireAction.sendKeys(Keys.TAB);

            // Select Hire Reason
            hireReason.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getHireReason() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getHireReason() + "']")).click();
            hireReason.sendKeys(Keys.TAB);

            // Check Worker Type
            actions.moveToElement(legalEmployer).click().sendKeys(data.getLegalEmployer()).sendKeys(Keys.ENTER)
                    .sendKeys(Keys.TAB).perform();
            assertThat(checkWorkerType.getText().equals(data.getWorkerType())).isTrue();
            waitNormalTime();

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
            waitFor(ExpectedConditions
                    .elementToBeClickable(driver.findElement(By.xpath("//li[text()='" + data.getGender() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getGender() + "']")).click();

            // Select Date of Birth
            waitFor(ExpectedConditions.elementToBeClickable(dateOfBirth), 5);
            dateOfBirth.sendKeys(data.getDateOfBirth());
            dateOfBirth.sendKeys(Keys.TAB);

            // Select Pearson Email Required
            waitFor(ExpectedConditions.elementToBeClickable(pearsonEmailRequired), 5);
            pearsonEmailRequired.click();
            waitFor(ExpectedConditions.elementToBeClickable(
                    driver.findElement(By.xpath("//li[text()='" + data.getPearsonEmailRequired() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getPearsonEmailRequired() + "']")).click();
            waitShortTime();

            // Click to create new row
            waitFor(ExpectedConditions.elementToBeClickable(addRow), 15);
            addRow.click();

            // Enter Country
            waitFor(ExpectedConditions.visibilityOf(country), 15);
            country.clear();
            country.sendKeys(data.getCountry());
            waitNormalTime();
            country.sendKeys(Keys.ENTER);
            country.sendKeys(Keys.TAB);

            // Enter National ID type
            clickNationalIdType.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getNationalIDType() + "']"))), 15);
            driver.findElement(By.xpath("//li[text()='" + data.getNationalIDType() + "']")).click();
            clickNationalIdType.sendKeys(Keys.TAB);

            // Enter National ID
            waitFor(ExpectedConditions.visibilityOf(nationalId), 15);
            nationalId.sendKeys(data.getNationalID());

            // Goto next tab
            reportWithScreenShot("Summary of Identification tab");
            clickNextButton(); // Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads

            //check if person information tab loaded
            waitFor(ExpectedConditions.visibilityOf(personInfoPageCheck), 15);
            assertThat(personInfoPageCheck.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value into Identification Tab due to:" + e.getMessage());
            assertThat(personInfoPageCheck.isDisplayed()).isTrue();
        }
    }

    // Enter Value into Person Information tab
    public void fillPersonInformationTab() {
        try {
            // Set Person Number for Future Use and Reference
            waitFor(ExpectedConditions.visibilityOf(personNo), 15);
            String personNumber = personNo.getText();
            data.setPersonNumber(personNumber);

            // Enter Address Line 1
            waitFor(ExpectedConditions.elementToBeClickable(addressLine1), 15);
            addressLine1.sendKeys(data.getAddressLine1());
            addressLine1.sendKeys(Keys.TAB);

            // Enter Address Line 2
            waitFor(ExpectedConditions.elementToBeClickable(addressLine2), 15);
            addressLine2.sendKeys(data.getAddressLine2());
            addressLine2.sendKeys(Keys.TAB);

            // Enter Zip Code
            waitFor(ExpectedConditions.elementToBeClickable(zipCode), 15);
            zipCode.sendKeys(data.getZipCode());
            addressLine2.click();

            /*
             * // Enter City waitFor(ExpectedConditions.elementToBeClickable(city), 5);
             * city.sendKeys(data.getCity()); // city.sendKeys(Keys.TAB);
             *
             * // Enter County waitFor(ExpectedConditions.elementToBeClickable(county), 5);
             * county.sendKeys(data.getCounty()); driver.switchTo().alert().dismiss();
             * county.sendKeys(Keys.TAB);
             *
             * // Enter State waitFor(ExpectedConditions.elementToBeClickable(state), 5);
             * state.clear(); state.sendKeys(data.getState());
             * //driver.switchTo().alert().dismiss(); state.sendKeys(Keys.TAB);
             */

            // Enter Marital Status
            waitFor(ExpectedConditions.elementToBeClickable(maritalStatus), 15);
            maritalStatus.click();
            waitFor(ExpectedConditions.elementToBeClickable(
                    driver.findElement(By.xpath("//li[text()='" + data.getMaritalStatus() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getMaritalStatus() + "']")).click();
            maritalStatus.sendKeys(Keys.TAB);

            // Enter Veteran Self-Identification Status
            waitFor(ExpectedConditions.elementToBeClickable(veteranSelfIdentificationStatus), 15);
            veteranSelfIdentificationStatus.sendKeys(data.getVeteranSelfIdentificationStatus());
            veteranSelfIdentificationStatus.sendKeys(Keys.TAB);

            // Enter Newly Separated Veteran Discharge Date
            waitFor(ExpectedConditions.elementToBeClickable(newlySeparatedVeteranDischargeDate), 15);
            newlySeparatedVeteranDischargeDate.sendKeys(data.getNewlySeparatedVeteranDischargeDate());

            // Goto next tab
            waitNormalTime();
            clickNextButton(); // Next Button to go to next page
            reportWithScreenShot("Summary of Person Information tab");
            waitUntilPageLoad(); // wait until next tab loads


            // Check if next page loaded
            waitFor(ExpectedConditions.elementToBeClickable(businessUnit), 15);
            assertThat(businessUnit.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value into Person Information  Tab due to:" + e.getMessage());
            assertThat(businessUnit.isDisplayed()).isTrue();
        }
    }

    // Enter Value into Employment Information tab
    public void fillEmploymentInformationTab() {
        try {
            // Enter Business Unit
            waitFor(ExpectedConditions.elementToBeClickable(businessUnit), 15);
            businessUnit.sendKeys(data.getBusinessUnit());

            // Enter Job
            waitFor(ExpectedConditions.elementToBeClickable(job), 15);
            job.sendKeys(data.getJob());
            waitShortTime();

            // Enter Grade - Not required as of now as its autoloaded
            /*waitFor(ExpectedConditions.elementToBeClickable(grade), 15);
            grade.clear();
            grade.sendKeys(data.getGrade());*/

            // Enter Department
            waitFor(ExpectedConditions.elementToBeClickable(department), 15);
            department.sendKeys(data.getDepartment());
            waitNormalTime();

            // Enter Location
            waitFor(ExpectedConditions.elementToBeClickable(location), 15);
            location.sendKeys(data.getLocation());
            waitShortTime();

            // Enter assignment Category
            waitFor(ExpectedConditions.elementToBeClickable(assignmentCategory), 15);
            assignmentCategory.sendKeys(data.getAssignmentCategory());

            // Enter working As Manager
            waitFor(ExpectedConditions.elementToBeClickable(workingAsManager), 15);
            workingAsManager.sendKeys(data.getWorkingAsManager());

            // Enter hourly Paid Or Salaried
            waitFor(ExpectedConditions.elementToBeClickable(hourlyPaidOrSalaried), 15);
            hourlyPaidOrSalaried.sendKeys(data.getHourlyPaidOrSalaried());

            // Enter Company/Entity
            waitFor(ExpectedConditions.elementToBeClickable(companyEntity), 15);
            companyEntity.sendKeys(data.getCompanyEntity());

            // Enter Cost Center
            waitFor(ExpectedConditions.elementToBeClickable(costCenter), 15);
            costCenter.sendKeys(data.getCostCenter());
            waitShortTime();

            // Enter ER Profit Center
            waitFor(ExpectedConditions.elementToBeClickable(erProfitCenter), 15);
            erProfitCenter.sendKeys(data.getErProfitCenter());
            waitShortTime();

            if (!data.getGlobalMobilityIndicator().isEmpty()) {
                // Select Global Mobility Indicator
                waitFor(ExpectedConditions.elementToBeClickable(empInfoGlobalMobilityInd), 15);
                empInfoGlobalMobilityInd.click();
                waitFor(ExpectedConditions.elementToBeClickable(
                        driver.findElement(By.xpath("//li[text()='" + data.getGlobalMobilityIndicator() + "']"))), 15);
                driver.findElement(By.xpath("//li[text()='" + data.getGlobalMobilityIndicator() + "']")).click();
                waitShortTime();
            }

            // Clicking Add button to enter Payroll Details
            clickCreateButton();

            // Select Payroll Details
            waitFor(ExpectedConditions.elementToBeClickable(payroll), 15);
            payroll.sendKeys(data.getPayroll());
            waitShortTime();

            // Goto next tab
            clickNextButton(); // Next Button to go to next page
            reportWithScreenShot("Summary of Employment Information tab");
            waitUntilPageLoad(); // wait until next tab loads

            // Check if next page loaded
            waitFor(ExpectedConditions.elementToBeClickable(salaryBasis), 15);
            assertThat(salaryBasis.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While Entering Value into Employement Information Tab due to:" + e.getMessage());
            assertThat(salaryBasis.isDisplayed()).isTrue();
        }
    }

    // Enter Value into Compensation and Other Information tab
    public void fillCompensationAndOtherInformationTab() {
        try {
            // Enter Salary Basis
            waitFor(ExpectedConditions.elementToBeClickable(salaryBasis), 15);
            salaryBasis.sendKeys(data.getSalaryBasis());

            // Enter Salary Amount
            waitFor(ExpectedConditions.elementToBeClickable(salaryAmount), 15);
            salaryAmount.clear();
            salaryAmount.sendKeys(data.getSalaryAmount());
            waitShortTime();

            // Enable Use salary components check box
            waitFor(ExpectedConditions.visibilityOf(salarycmpnt), 15);
            salarycmpnt.click();
            waitShortTime();

            // Goto Next tab
            clickNextButton(); // Next Button to go to next page
            reportWithScreenShot("Summary of Compensation and Other Information Tab");
            waitUntilPageLoad(); // wait until next tab loads


            // Check if next page loaded
            waitFor(ExpectedConditions.visibilityOf(reviewTab),15);
            assertThat(reviewTab.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While Entering Value into Compensation and Other Information Tab due to:" + e.getMessage());
            assertThat(reviewTab.isDisplayed()).isTrue();
        }
    }

    // Check Review tab with Employee information
    public void checkReviewTabDisplayedWithInformation() {
        try {
            waitFor(ExpectedConditions.visibilityOf(reviewTab),15);
            reportWithScreenShot("Summary of Review tab with Employee information");
            assertThat(reviewTab.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Review Tab due to:" + e.getMessage());
            assertThat(reviewTab.isDisplayed()).isTrue();
        }
    }

    // Person Management Search check available
    public void checkpersonManagementSearchAvailable() {
        try {
            reportWithScreenShot("Checking if Person Management Search screen is Displayed");
            waitFor(ExpectedConditions.visibilityOf(personManagementSearch), 15);
            assertThat(personManagementSearch.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Person Management Search screen not Displayed");
            assertThat(personManagementSearch.isDisplayed()).isTrue();
        }
    }

    // Enter Value into Person Management: Search screen
    public void searchPerson() {
        try {

            // Enter person number into keywords
            waitFor(ExpectedConditions.elementToBeClickable(keywords), 15);
            keywords.sendKeys(data.getPersonNumber());

            // Enter effective as of date
            waitFor(ExpectedConditions.elementToBeClickable(effectiveAsOfDate), 15);
            effectiveAsOfDate.clear();
            effectiveAsOfDate.sendKeys(getCurrentDate());
            waitShortTime();
            reportWithScreenShot("Summary of Person Management: Search screen");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Person Management: Search screen:" + e.getMessage());
        }
    }

    // After entering person number, click on Search Button until person
    public void clickSearch() {
        try {
            searchBtn.click(); // Click Search Button

            // Check for Employee for max 60 seconds
            int elementsize = driver
                    .findElements(By.xpath("//td//span[text()='" + data.getPersonNumber() + "']")).size();
            int counter = 0;
            while (elementsize == 0 && counter <= 60) {
                elementsize = driver
                        .findElements(By.xpath("//td//span[text()='" + data.getPersonNumber() + "']")).size();
                searchBtn.click();
                counter++;
            }
            if (elementsize == 0 && counter > 60) {
                throw new Exception("Person number not found");
            }

            reportWithScreenShot("Search Results of person Number");
            assertThat(true).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Error While checking search results of employee:" + e.getMessage());
            assertThat(false).isTrue();
        }
    }


    // Validate if search result displays right person details
    public void validateSearchResult() {
        try {

            // Verify if person number searched matched the record displayed
            int elementsize = driver
                    .findElements(By.xpath("//td//span[text()='" + data.getPersonNumber() + "']")).size();
            if (elementsize == 1) {
                reportWithScreenShot("Search Results of person Number");
            }
        } catch (Exception e) {
            reportWithScreenShot("Error in person displayed from search:" + e.getMessage());
        }
    }

    // User click on actions button
    public void empNameLinkClick() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(actionsBtn), 15);
            actionsBtn.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on EmpName Action click:" + e.getMessage());
        }
    }

    // User click on Employee Name link
    public void clickPersonNameLink() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(personLink), 15);
            personLink.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on person Name link:" + e.getMessage());
        }
    }

    // User click on Edit and Update button
    public void clickEditUpdate() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(personMgmtEdit), 15);
            personMgmtEdit.click();

            waitFor(ExpectedConditions.elementToBeClickable(personMgmtUpdate), 15);
            personMgmtUpdate.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on Edit and update button:" + e.getMessage());
        }
    }

    // User checks if Update Employment Window is Displayed
    public void checkUpdateEmployementWindowDisplayed() {
        try {
            waitUntilPageLoad();
            reportWithScreenShot("Checking if Update Employment Window is Displayed");
            assertThat(updateEmploymentTitle.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Update Employment Window is not Displayed");
            assertThat(updateEmploymentTitle.isDisplayed()).isTrue();
        }
    }

    // User enter details in Update Employment Window
    public void fillUpdateEmpWindow() {
        try {

            // Enter current date into effective date
            waitFor(ExpectedConditions.elementToBeClickable(updateEmploymentEffectiveDate), 15);
            updateEmploymentEffectiveDate.sendKeys(getCurrentDate());

            // Enter Action value
            waitFor(ExpectedConditions.elementToBeClickable(updateEmploymentAction), 15);
            updateEmploymentAction.sendKeys(data.getEmploymentAction());

            // Enter Action Reason value
            waitFor(ExpectedConditions.elementToBeClickable(updateEmploymentActionReason), 15);
            updateEmploymentActionReason.sendKeys(data.getEmploymentActionReason());

            // Enter Destination Legal Employer value
            waitFor(ExpectedConditions.elementToBeClickable(updateEmploymentDestLegalEmployer), 15);
            updateEmploymentDestLegalEmployer.sendKeys(data.getDestinationLegalEmployer());

            waitFor(ExpectedConditions.elementToBeClickable(updateEmploymentCreatePrimaryWork), 15);
            updateEmploymentCreatePrimaryWork.click();

            waitFor(ExpectedConditions.elementToBeClickable(btnOK), 15);
            btnOK.click();

            waitFor(ExpectedConditions.elementToBeClickable(btnOK), 15);
            btnOK.click();

        } catch (Exception e) {
            reportWithScreenShot("Error While user enter details in Update Employment Window:" + e.getMessage());
        }
    }

    // User checks if Update Employment Window is Displayed
    public void checkGlobalAssignmentPageDisplayed() {
        try {
            waitUntilPageLoad();
            reportWithScreenShot("Checking if Global Temporary Assignment: Identification page is Displayed");
            assertThat(globalTempAssignment.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Global Temporary Assignment: Identification page is not Displayed");
            assertThat(globalTempAssignment.isDisplayed()).isTrue();
        }
    }

    // User Navigate to Employment Information page
    public void navigateToEmpInfoPage() {
        try {

            waitNormalTime();
            clickNextButton(); // Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads

            waitNormalTime();
            clickNextButton(); // Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads

        } catch (Exception e) {
            reportWithScreenShot("Error While user Navigate to Employment Information page:" + e.getMessage());
        }
    }

    // User click on Manage Element Entries
    public void manageElementEntriesClick() {
        try {

            waitFor(ExpectedConditions.elementToBeClickable(payrollOption), 15);
            payrollOption.click();

            waitFor(ExpectedConditions.elementToBeClickable(manageElementEntries), 15);
            manageElementEntries.click();

            reportWithScreenShot("Search Results of person Number");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Review Tab due to:" + e.getMessage());
        }
    }

    // Check if Manage Element Entries page available
    public void checkManageElementEntriesAvailable() {
        try {
            reportWithScreenShot("Checking if Manage Element Entries page  is Displayed");
            waitFor(ExpectedConditions.visibilityOf(manageElementEnteriesTextCheck), 15);
            assertThat(manageElementEnteriesTextCheck.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Manage Element Entries page  not Displayed");
            assertThat(manageElementEnteriesTextCheck.isDisplayed()).isTrue();
        }
    }

    // User Enter Element Name details as BILINGUAL
    public void fillElementEntryInfo() {
        try {

            // Enter Business Unit
            waitFor(ExpectedConditions.elementToBeClickable(elementName), 15);
            elementName.sendKeys(data.getElementName());
            elementName.sendKeys(Keys.TAB);
            waitFor(ExpectedConditions.visibilityOf(assignment), 15);

        } catch (Exception e) {
            reportWithScreenShot("Error While user enters Element Name:" + e.getMessage());
        }
    }

    // User Enter Element Name details as ADP Auto & Home
    public void fillADPElementEntryInfo() {
        try {

            // Enter Business Unit
            waitFor(ExpectedConditions.elementToBeClickable(elementName), 15);
            elementName.sendKeys(data.getElementNameADP());
            actions.sendKeys(Keys.TAB);
            waitFor(ExpectedConditions.visibilityOf(payrollRelationship), 15);

        } catch (Exception e) {
            reportWithScreenShot("Error While user enters Element Name as ADP:" + e.getMessage());
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

    // Actual Amount field check available
    public void actualAmountDisplay() {
        try {
            reportWithScreenShot("Checking if actual amount Field is Displayed");
            waitFor(ExpectedConditions.visibilityOf(actualAmount), 15);
            assertThat(actualAmount.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Actual Amount field not Displayed");
            assertThat(actualAmount.isDisplayed()).isTrue();
        }
    }

    // Enter Actual Amount and date
    public void enteractualAmountAndDate() {
        try {
            // Enter Actual Amount
            waitFor(ExpectedConditions.elementToBeClickable(actualAmount), 15);
            actualAmount.sendKeys(data.getActualAmount());

            // Enter effective as of date
            waitFor(ExpectedConditions.elementToBeClickable(payCheckDate), 15);
            payCheckDate.clear();
            payCheckDate.sendKeys(data.getPayCheckDate());
            Thread.sleep(2500);
        } catch (Exception e) {
            reportWithScreenShot("Error While User entering Amount and date:" + e.getMessage());

        }
    }

    // Click on Submit Button for ADP
    public void adpSubmit() {
        try {
            adpSubmitBtn.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While User Submit Button for ADP scenario:" + e.getMessage());
        }
    }

    public void adpRowAdded() {
        try {
            reportWithScreenShot("Checking if ADP Auto & Home row is Displayed");
            waitFor(ExpectedConditions.visibilityOf(adpRowAdded), 15);
            assertThat(adpRowAdded.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("ADP Auto & Home r row is not added");
            assertThat(adpRowAdded.isDisplayed()).isTrue();
        }
    }

    // Click on Done button
    public void clickDoneButton() {
        try {
            done.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While user click Done Button due to:" + e.getMessage());
        }
    }

    // Hire an Employee Page check available
    public void bilingualYesDisplay() {
        try {
            reportWithScreenShot("Checking if Bilingual Field is Displayed");
            waitFor(ExpectedConditions.visibilityOf(bilingualYes), 15);
            assertThat(bilingualYes.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Bilingual field not Displayed");
            assertThat(bilingualYes.isDisplayed()).isTrue();
        }
    }

    // Click on Submit Button for Bilingual
    public void bilingualSubmit() {
        try {
            clickSubmitButton();
        } catch (Exception e) {
            reportWithScreenShot("Error While User bilingual Submit Button:" + e.getMessage());
        }
    }

    public void bilingualRowAdded() {
        try {
            reportWithScreenShot("Checking if Bilingual row is Displayed");
            waitFor(ExpectedConditions.visibilityOf(bilingualRowAdded), 15);
            assertThat(bilingualRowAdded.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Bilingual row is not added");
            assertThat(bilingualRowAdded.isDisplayed()).isTrue();
        }
    }

}
