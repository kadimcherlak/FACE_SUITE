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
import org.testng.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class HireAnEmployeePage extends BasePage<HireAnEmployeePage> {

    private Context context;
    private Data data;
    private Actions actions;

    // Hire An Employee Page Elements
    @FindBy(xpath = "//h1[contains(text(),': Identification')]")
    private WebElement identificationTab;

    @FindBy(xpath = "//h1[contains(text(),': Person Information')]")
    private WebElement personInfoTab;

    @FindBy(xpath = "//h1[contains(text(),': Employment Information')]")
    private WebElement empInfoTab;

    @FindBy(xpath = "//h1[contains(text(),': Compensation and Other Information')]")
    private WebElement compAndOtherInfoTab;

    @FindBy(xpath = "//h1[contains(text(),': Review')]")
    private WebElement reviewTab;

    @FindBy(xpath = "(//input[@class='x2b'])[1]")
    private WebElement basicDetailsDate;

    @FindBy(xpath = "(//input[@class='x2h'])[1]")
    private WebElement basicDetailsAction;

    @FindBy(xpath = "(//input[@class='x2h'])[2]")
    private WebElement basicDetailsReason;

    @FindBy(xpath = "//label[text()='Legal Employer']/following::input[1]")
    private WebElement basicDetailsEmployer;

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

    //  @FindBy(xpath = "//input[contains(@id,'EmailRequired')]")
    @FindBy(xpath = "//label[text()='Location Contact ']/following::input[1]")
    private WebElement locationContact;

    @FindBy(xpath = "//img[@title='Add Row']")
    private WebElement addRow;

    //@FindBy(xpath = "//input[@class='x109' and contains(@id,'iclov1::content') and contains(@name,'iclov1')]")
    @FindBy(xpath = "(//input[@class='x10u'])[2]")
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

    @FindBy(xpath = "//label[text()='Zip Code']/following::input[1]")
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

    @FindBy(xpath = "//input[@class='x10u' and contains(@id,'table1:0:selectOneChoice1::content') and contains(@name,'table1:0:selectOneChoice1')]")
    private WebElement payroll;

    @FindBy(xpath = "//label[text()='I-9 Status']/following::input[1]")
    private WebElement i9Status;

    @FindBy(xpath = "//label[text()='Salary Basis']/following::input[1]")
    private WebElement salaryBasis;

    @FindBy(xpath = "//label[text()='Salary Amount']/following::input[1]")
    private WebElement salaryAmount;

    @FindBy(xpath = "//label[@class='x1cd']")
    private WebElement salarycmpnt;

    @FindBy(xpath = "//label[text()='Global Mobility Indicator']/following::input[1]")
    private WebElement empInfoGlobalMobilityInd;

    //koushik added 3/4 cog
    @FindBy(xpath = "//label[text()='Birthday']/following::input[1]")
    private WebElement birthday;

    public HireAnEmployeePage(Context context) {
        super(context);
        this.context = context;
        this.data = context.getData();
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
        logger.debug("{} loaded", this.getClass().getName());
    }

    // Identification Tab check available
    public void checkIdentificationTabAvailable() {
        try {
            waitFor(ExpectedConditions.visibilityOf(identificationTab), 15);
            assertThat(identificationTab.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Identification Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Identification Page not Displayed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // Person Information Tab check available
    public void checkPersonInformationTabAvailable() {
        try {
            waitFor(ExpectedConditions.visibilityOf(personInfoTab), 15);
            assertThat(personInfoTab.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Person Information Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Person Information Page not Displayed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // Employment Information Tab check available
    public void checkEmploymentInformationTabAvailable() {
        try {
            waitFor(ExpectedConditions.visibilityOf(empInfoTab), 15);
            assertThat(empInfoTab.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Employment Information Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Employment Information Page not Displayed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // Enter Value into Identification tab
    public void fillIdentificationTab() {
        try {
            // Enter Hire Date
            basicDetailsDate.clear();
            actions.doubleClick(basicDetailsDate).sendKeys(getCurrentDate());

            // Select Hire Action
            basicDetailsAction.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getHireAction() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getHireAction() + "']")).click();
            basicDetailsAction.sendKeys(Keys.TAB);
            waitNormalTime();

            // Select Hire Reason
            basicDetailsReason.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getHireReason() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getHireReason() + "']")).click();
            basicDetailsReason.sendKeys(Keys.TAB);

            // Check Worker Type
            actions.moveToElement(basicDetailsEmployer).click().sendKeys(data.getLegalEmployer()).sendKeys(Keys.ENTER)
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
            waitFor(ExpectedConditions.elementToBeClickable(dateOfBirth), 15);
            dateOfBirth.sendKeys(data.getDateOfBirth());
            dateOfBirth.sendKeys(Keys.TAB);

            // Select Location Contact Required
            waitFor(ExpectedConditions.elementToBeClickable(locationContact), 15);
            locationContact.click();
            locationContact.sendKeys(data.getPearsonEmailRequired());
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
            scrollToPageTop(driver);
            reportWithScreenShot("Summary of Identification tab");
            clickNextButton(); // Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads

            //check if person information tab loaded
            waitFor(ExpectedConditions.visibilityOf(personInfoTab), 15);
            assertThat(personInfoTab.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value into Identification Tab due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // Enter Value into Person Information tab
    public void fillPersonInformationTab() {
        try {
            // Set Person Number for Future Use and Reference
            waitFor(ExpectedConditions.visibilityOf(personNo), 15);
            String personNumber = personNo.getText();
            writeToExcel("UPDATE_REMOVE_I9_STATUS", "personNumber", personNumber);
            System.out.println(personNumber);

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
            scrollToPageTop(driver);
            reportWithScreenShot("Summary of Person Information tab");
            clickNextButton(); // Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads


            // Check if next page loaded
            waitFor(ExpectedConditions.elementToBeClickable(businessUnit), 15);
            assertThat(businessUnit.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value into Person Information  Tab due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // Enter Value into Employment Information tab
    public void fillEmploymentInformationTab() {
        try {
            // Enter Business Unit
            waitFor(ExpectedConditions.elementToBeClickable(businessUnit), 15);
            businessUnit.sendKeys(data.getBusinessUnit());
            businessUnit.sendKeys(Keys.ENTER);
            waitShortTime();

            // Enter Job
            waitFor(ExpectedConditions.elementToBeClickable(job), 15);
            job.sendKeys(data.getJob());
            job.sendKeys(Keys.ENTER);
            waitNormalTime();

            // Enter Grade - Not required as of now as its autoloaded
            /*waitFor(ExpectedConditions.elementToBeClickable(grade), 15);
            grade.clear();
            grade.sendKeys(data.getGrade());*/

            // Enter Department
            waitFor(ExpectedConditions.elementToBeClickable(department), 15);
            department.sendKeys(data.getDepartment());
            department.sendKeys(Keys.ENTER);
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

            //3/4 added for cognizant instance
            waitFor(ExpectedConditions.elementToBeClickable(birthday), 15);
            birthday.clear();
            birthday.sendKeys(data.getDateOfBirth());

            //3/4 - Koushik commenting for cognizant instance
           /* // Enter Company/Entity
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

            if (data.getGlobalMobilityIndicatorCheck()) {
                // Select Global Mobility Indicator
                waitFor(ExpectedConditions.elementToBeClickable(empInfoGlobalMobilityInd), 15);
                empInfoGlobalMobilityInd.click();
                waitFor(ExpectedConditions.elementToBeClickable(
                        driver.findElement(By.xpath("//li[text()='" + data.getGlobalMobilityIndicator() + "']"))), 15);
                driver.findElement(By.xpath("//li[text()='" + data.getGlobalMobilityIndicator() + "']")).click();
                waitShortTime();
            }*/

            // Clicking Add button to enter Payroll Details
            clickCreateButton();

            // Select Payroll Details
            waitFor(ExpectedConditions.elementToBeClickable(payroll), 15);
            payroll.sendKeys(data.getPayroll());
            waitNormalTime();

            // Goto next tab
            scrollToPageTop(driver);
            reportWithScreenShot("Summary of Employment Information tab");
            clickNextButton(); // Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads

            // Check if next page loaded
            waitFor(ExpectedConditions.elementToBeClickable(salaryBasis), 15);
            assertThat(salaryBasis.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While Entering Value into Employement Information Tab due to:" + e.getMessage());
            Assert.fail();
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

            //commented on 3/4 cog
           /* // Enable Use salary components check box
            waitFor(ExpectedConditions.visibilityOf(salarycmpnt), 15);
            salarycmpnt.click();
            waitShortTime();*/

            // Goto Next tab
            scrollToPageTop(driver);
            reportWithScreenShot("Summary of Compensation and Other Information Tab");
            clickNextButton(); // Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads

            // Check if next page loaded
            waitFor(ExpectedConditions.visibilityOf(reviewTab), 15);
            assertThat(reviewTab.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While Entering Value into Compensation and Other Information Tab due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // Check Review tab with Employee information
    public void checkReviewTabDisplayedWithInformation() {
        try {
            waitFor(ExpectedConditions.visibilityOf(reviewTab), 15);
            reportWithScreenShot("Summary of Review tab with Employee information");
            assertThat(reviewTab.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Review Tab due to:" + e.getMessage());
            Assert.fail();
        }
    }

}
