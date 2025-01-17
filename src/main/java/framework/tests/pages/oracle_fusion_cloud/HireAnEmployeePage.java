package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class HireAnEmployeePage extends BasePage<HireAnEmployeePage> {

    private Context context;
    private Data data;
    private Actions actions;
    //private int elementsize;

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

    @FindBy(xpath = "(//label[text()='Legal Employer']/following::input[1])[1]")
    private WebElement basicDetailsEmployer;

    @FindBy(xpath = "//*[text()='Employee']")
    private WebElement checkWorkerType;

    @FindBy(xpath = "//label[text()='Nonworker Type']/following::input[1]")
    private WebElement nonWorkerType;

    @FindBy(xpath = "//label[text()='Proposed Worker Type']/following::input[1]")
    private WebElement pendingWorkerType;

    @FindBy(xpath = "//label[text()='Last Name']/following::input[1]")
    private WebElement lastName;

    @FindBy(xpath = "//label[text()='First Name']/following::input[1]")
    private WebElement firstName;

    @FindBy(xpath = "//label[text()='Gender']/following::input[1]")
    private WebElement gender;

    @FindBy(xpath = "//label[text()='Date of Birth']/following::input[1]")
    private WebElement dateOfBirth;

    //@FindBy(xpath = "//input[contains(@id,'EmailRequired')]")
    @FindBy(xpath = "//label[text()='Location Contact ']/following::input[1]")
    private WebElement locationContact;

    @FindBy(xpath = "//img[@title='Add Row']")
    private WebElement addRow;

    // @FindBy(xpath = "(//input[@class='x10u'])[2]"
    @FindBy(xpath = "(//label[contains(text(),'Country')]/following::span[1])[1]")
    private WebElement country;

    @FindBy(xpath = "//input[@class='x2h' and contains(@id,'soc2::content') and contains(@aria-owns,'soc2::pop')]")
    private WebElement clickNationalIdType;

    @FindBy(xpath = "//input[@class='x25' and contains(@id,'table2:0:it1::content') and contains(@name,'table2:0:it1')]")
    private WebElement nationalId;

    @FindBy(xpath = "//label[text()='Person Number']/following::td[1]")
    private WebElement personNo;

    @FindBy(xpath = "//label[text()='Name']/following::td[1]")
    private WebElement personName;

    @FindBy(xpath = "//label[text()='Address Line 1']/following::input[1]")
    private WebElement addressLine1;

    @FindBy(xpath = "//label[text()='Address Line 2']/following::input[1]")
    private WebElement addressLine2;

    @FindBy(xpath = "//label[text()='ZIP Code']/following::input[1]")
    private WebElement zipCode;

    @FindBy(xpath = "(//input[@class='x1xc'])[2]")
    private WebElement dropDown_ZipCode;

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

    @FindBy(xpath = "(//label[text()='Business Unit']/following::input[1])[1]")
    private WebElement businessUnit;

    @FindBy(xpath = "(//label[text()='Job']/following::input[1])[1]")
    private WebElement job;

    @FindBy(xpath = "(//label[text()='Grade']/following::input[1])[1]")
    private WebElement grade;

    @FindBy(xpath = "(//label[text()='Department']/following::input[1])[1]")
    private WebElement department;

    @FindBy(xpath = "(//label[text()='Location']/following::input[1])[1]")
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

    @FindBy(xpath = "(//label[text()='Salary Amount']/following::input[1])[1]")
    private WebElement salaryAmount;

    @FindBy(xpath = "//label[@class='x1cd']")
    private WebElement salarycmpnt;

    @FindBy(xpath = "//label[text()='Global Mobility Indicator']/following::input[1]")
    private WebElement empInfoGlobalMobilityInd;

    //koushik added 3/4 cog
    @FindBy(xpath = "//label[text()='Birthday']/following::input[1]")
    private WebElement birthday;

    //koushik added 3/16 cog
    @FindBy(xpath = "//input[contains(@id,'ManagerName')]")
    private WebElement managerName;

    // raghav added 3/18
    @FindBy(xpath = "//label[text()='Type']/following::input[1]")
    private WebElement managerType;

    //raghav added 3/18
    @FindBy(xpath = "//img[contains(@id,'AU2:insert::icon')]")
    private WebElement managerAddRow;

    //venkat added 3/31
    @FindBy(xpath = "(//a[text()='Pending Workers'])[1]")
    private WebElement label_PendingWorkerGrid;

    //venkat added 3/31
    @FindBy(xpath = "//input[contains(@id,'c11::content')]")
    private WebElement textBox_PersonNumber;

    //venkat added 3/31
    @FindBy(xpath = "(//td[@class='xeq'])[1]")
    private WebElement label_SelectPersonNumber;

    //venkat added 3/31
    @FindBy(xpath = "//a[@title='Actions']")
    private WebElement button_ActionsButton;

    //venkat added 3/31
    @FindBy(xpath = "//td[text()='Convert']")
    private WebElement link_Convert;

    //venkat added 4/02
    @FindBy(xpath = "//td[text()='Quick Convert']")
    private WebElement link_QuickConvert;

    //venkat added 3/31
    @FindBy(xpath = "//h1[contains(.,'Convert Pending Worker: Identification')]")
    private WebElement label_ConvertPendingWorker;

    //venkat added 4/02
    @FindBy(xpath = "//div[text()='Confirmation']")
    private WebElement popup_Confirmation;

    @FindBy(xpath = "//div[text()='Matching Person Records']")
    private WebElement popup_matchingPersonRecords;

    @FindBy(xpath = "//a[@title='Select Match']")
    private WebElement icon_SelectPerson;

    @FindBy(xpath = "(//div[text()='Warning'])[2]")
    private WebElement popup_warning;

    @FindBy(xpath = "//button[@accesskey='K']")
    private WebElement button_OKWarning;


    //raghav added 4/6
    @FindBy(xpath = "//h1[contains(text(),': Job Change')]")
    private WebElement jobChange;

    @FindBy(xpath = "//span[text()='Continue']")
    private WebElement button_Continue;

    @FindBy(xpath = "//label[contains(text(),'date?')]/following::input[1]")
    private WebElement date_Hire;

    //@FindBy(xpath = "(//label[text()='Legal Employer']/following::input[1])[1]")
    //private WebElement dropDown_legalEmployer;

    @FindBy(xpath = "//label[contains(text(),'Why are you')]/following::input[1]")
    private WebElement dropDown_HireReason;

    @FindBy(xpath = "//label[contains(text(),'Proposed Worker Type')]/following::input[1]")
    private WebElement dropDown_ProposedWorkerType;

    @FindBy(xpath = "//button[@title='Continue']")
    private WebElement button_Hire_Continue;
    @FindBy(xpath = "(//label[contains(text(),'Country')]/following::span[1])[1]")
    private WebElement dropDown_Country;

    @FindBy(xpath = "//label[contains(text(),'National ID Type')]/following::input[1]")
    private WebElement dropDown_NationalIDType;

    @FindBy(xpath = "//label[(text()='National ID')]/following::input[1]")
    private WebElement textBox_NationalID;


    @FindBy(xpath = "(//label[(text()='Type')]/following::input[1])[1]")
    private WebElement dropDown_PhoneType;

    @FindBy(xpath = "(//label[text()='Country']/following::span[1])[1]")
    private WebElement dropDown_CountryCode;


    @FindBy(xpath = "//label[text()='Number']//following::input[1]")
    private WebElement textBox_PhoneNumber;

    @FindBy(xpath = "(//label[(text()='Type')]/following::input[1])[2]")
    private WebElement dropDown_EmailType;

    @FindBy(xpath = "//label[text()='Email']//following::input[1]")
    private WebElement textBox_Email;

    @FindBy(xpath = "//label[contains(text(),'Marital Status')]/following::input[1]")
    private WebElement dropDown_MaritalStatus;

    @FindBy(xpath = "//label[(text()='Citizenship')]/following::input[1]")
    private WebElement dropDown_Citizenship;

    @FindBy(xpath = "//label[(text()='Citizenship Status')]/following::input[1]")
    private WebElement dropDown_CitizenshipStatus;

    @FindBy(xpath = "//label[text()='Payroll']/following::input[1]")
    private WebElement dropDown_Payroll;

    @FindBy(xpath = "//input[contains(@class,'x1xc')]")
    private WebElement dropDown_SalaryBasis;

    @FindBy(xpath = "//label[text()='Comments']//following::textarea[1]")
    private WebElement dropDown_Comments;

    @FindBy(xpath = "//label[text()='Type']/following::span[1]")
    private WebElement addressType;

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

    // Compensation and other Information Tab check available
    public void checkCompensationInformationTabAvailable() {
        try {
            waitFor(ExpectedConditions.visibilityOf(compAndOtherInfoTab), 15);
            assertThat(compAndOtherInfoTab.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Compensation and other Information Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Compensation and other Information Page not Displayed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // Enter Value into Identification tab
    public void fillIdentificationTab() {
        try {
            // Enter Hire Date
            basicDetailsDate.clear();
            //   actions.doubleClick(basicDetailsDate).sendKeys(data.getHireDate());
            String hireDate = getDynamicDate("-", 60);
            System.out.println(hireDate);
            actions.doubleClick(basicDetailsDate).sendKeys(hireDate);

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
            actions.moveToElement(basicDetailsEmployer).click().sendKeys(data.getLegalEmployer()).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();
            waitShortTime();

            // Check Scenario and perform Action
            if (data.getScenario().contains("PENDING_WORKER")) {
                pendingWorkerType.click();
                waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']"))), 30);
                driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']")).click();
                pendingWorkerType.sendKeys(Keys.TAB);
            } else if (data.getScenario().contains("NON_WORKER")) {
                nonWorkerType.click();
                waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']"))), 30);
                driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']")).click();
                nonWorkerType.sendKeys(Keys.TAB);
                waitShortTime();
            }

            //waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='" + data.getWorkerType() + "']"))), 30);
            //assertThat(driver.findElement(By.xpath("//*[text()='" + data.getWorkerType() + "']")).getText().equals(data.getWorkerType())).isTrue();

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

          /*  // Select Location Contact Required
            waitFor(ExpectedConditions.elementToBeClickable(locationContact), 15);
            locationContact.click();
            locationContact.sendKeys(data.getLocationContact());*/
            waitShortTime();

            // Click to create new row
            waitFor(ExpectedConditions.elementToBeClickable(addRow), 15);
            addRow.click();

            // Enter Country
            waitFor(ExpectedConditions.visibilityOf(country), 30);
            country.clear();
            //country.sendKeys(data.getCountry());
            waitNormalTime();
            country.sendKeys(Keys.ENTER);
            country.sendKeys(Keys.TAB);
            waitNormalTime();
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
            //String personNumber = personNo.getText();
            data.setPersonNumber(personNo.getText());
            data.setPersonName(personName.getText());
            /*writeToExcel("UPDATE_REMOVE_I9_STATUS", "personNumber", personNumber);
            writeToExcel("UPDATE_ELEMENT_ENTRIES", "personNumber", personNumber);
            writeToExcel("UPDATE_PERSONAL_ASSIGNMENT_DATA", "personNumber", personNumber);
            writeToExcel("EDIT_PROJECTED_ENDDATE", "personNumber", personNumber);*/
            //System.out.println(personNumber);

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
            /*waitFor(ExpectedConditions.elementToBeClickable(veteranSelfIdentificationStatus), 15);
            veteranSelfIdentificationStatus.sendKeys(data.getVeteranSelfIdentificationStatus());
            veteranSelfIdentificationStatus.sendKeys(Keys.TAB);

            // Enter Newly Separated Veteran Discharge Date
            waitFor(ExpectedConditions.elementToBeClickable(newlySeparatedVeteranDischargeDate), 15);
            newlySeparatedVeteranDischargeDate.sendKeys(data.getNewlySeparatedVeteranDischargeDate());*/

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
            businessUnit.clear();
            waitNormalTime();
            businessUnit.sendKeys(data.getBusinessUnit());
            businessUnit.sendKeys(Keys.ENTER);
            waitNormalTime();

            // Enter Job
            waitFor(ExpectedConditions.elementToBeClickable(job), 15);
            job.clear();
            job.sendKeys(data.getJob());
            job.sendKeys(Keys.ENTER);
            waitNormalTime();

            // Enter Grade - Not required as of now as its autoloaded
            /*waitFor(ExpectedConditions.elementToBeClickable(grade), 15);
            grade.clear();
            grade.sendKeys(data.getGrade());*/

            // Enter Department
            waitFor(ExpectedConditions.elementToBeClickable(department), 15);
            department.clear();
            department.sendKeys(data.getDepartment());
            department.sendKeys(Keys.ENTER);
            waitNormalTime();

            // Enter Location
            try {
                waitFor(ExpectedConditions.elementToBeClickable(location), 15);
                location.clear();
                waitShortTime();
                location.sendKeys(data.getLocation());
                waitShortTime();
            } catch (StaleElementReferenceException e) {
                waitShortTime();
                location.sendKeys(data.getLocation());
            }


            // Enter assignment Category
            waitFor(ExpectedConditions.elementToBeClickable(assignmentCategory), 15);
            assignmentCategory.sendKeys(data.getAssignmentCategory());

            // Enter working As Manager
            waitFor(ExpectedConditions.elementToBeClickable(workingAsManager), 15);
            workingAsManager.sendKeys(data.getWorkingAsManager());

            // Enter hourly Paid Or Salaried
            waitFor(ExpectedConditions.elementToBeClickable(hourlyPaidOrSalaried), 15);
            hourlyPaidOrSalaried.sendKeys(data.getHourlyPaidOrSalaried());
            waitNormalTime();

            //3/16 adding Manager name logic
            //3/18 Adding additional logic for handling global scenario
            if (driver.findElements(By.xpath("//input[contains(@id,'ManagerName')]")).size() != 0) {
                waitFor(ExpectedConditions.elementToBeClickable(managerName), 15);
                managerName.clear();
                managerName.sendKeys(data.getManagerName());
            } else {
                waitFor(ExpectedConditions.elementToBeClickable(managerAddRow), 15);
                managerAddRow.click();

                waitFor(ExpectedConditions.elementToBeClickable(managerName), 15);
                managerName.clear();
                managerName.sendKeys(data.getManagerName());

                waitFor(ExpectedConditions.elementToBeClickable(managerType), 15);
                managerType.click();
                managerType.sendKeys(data.getManagerType());
            }


           /* //3/4 added for cognizant instance
            waitFor(ExpectedConditions.elementToBeClickable(birthday), 15);
            birthday.clear();
            birthday.sendKeys(data.getDateOfBirth());
*/
            // Clicking Add button to enter Payroll Details
            if (driver.findElements(By.xpath("//h1[contains(text(),' Change')]")).size() == 0) {
                waitShortTime();
                clickCreateButton();

                // Select Payroll Details
                waitFor(ExpectedConditions.elementToBeClickable(payroll), 15);
                payroll.clear();
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
            }

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

    public void checkAndUpdateLegalEmployerIfEmpty() {
        try {
            waitFor(ExpectedConditions.visibilityOf(basicDetailsEmployer), 15);
            if (basicDetailsEmployer.getText().equalsIgnoreCase(""))
                actions.moveToElement(basicDetailsEmployer).click().sendKeys(data.getLegalEmployer()).sendKeys(Keys.ENTER).perform();
        } catch (Exception e) {
            reportWithScreenShot("Error While updating Legal Employer value in Information Tab due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // Checking if Pending Workers grid is Displayed
    public void checkPendingWorkerGridDisplayed() {
        try {
            waitFor(ExpectedConditions.visibilityOf(label_PendingWorkerGrid), 15);
            assertThat(label_PendingWorkerGrid.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Pending Workers grid is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Pending Workers grid is not Displayed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // search pending worker created in previous step
    public void searchPendingWorker() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(textBox_PersonNumber), 15);
            textBox_PersonNumber.sendKeys(csvReader().get("personNumber"));
            textBox_PersonNumber.sendKeys(Keys.ENTER);

            reportWithScreenShot("Pending Worker person Number is Displayed in the grid");
        } catch (Exception e) {
            reportWithScreenShot("Pending Worker person Number is Displayed in the grid: " + e.getMessage());
            Assert.fail();
        }
    }

    // select Convert of Pending worker from grid
    public void selectConvertPendingWorker() {
        try {
            waitFor(ExpectedConditions.visibilityOf(label_SelectPersonNumber), 30);
            label_SelectPersonNumber.click();
            waitShortTime();
            waitFor(ExpectedConditions.visibilityOf(button_ActionsButton), 30);
            button_ActionsButton.click();
            reportWithScreenShot("User click on Actions Button");
            waitFor(ExpectedConditions.visibilityOf(link_Convert), 30);
            link_Convert.click();
            reportWithScreenShot("User clicks on Convert link");
        } catch (Exception e) {
            reportWithScreenShot("User unable to click on actions and convert link due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // select Quick convert for Pending worker from grid
    public void selectQuickConvertPendingWorker() {
        try {
            waitFor(ExpectedConditions.visibilityOf(label_SelectPersonNumber), 30);
            label_SelectPersonNumber.click();
            waitShortTime();
            waitFor(ExpectedConditions.visibilityOf(button_ActionsButton), 30);
            button_ActionsButton.click();
            reportWithScreenShot("User click on Actions Button");
            waitFor(ExpectedConditions.visibilityOf(link_QuickConvert), 30);
            link_QuickConvert.click();
            reportWithScreenShot("User clicks on Quick Convert link");
        } catch (Exception e) {
            reportWithScreenShot("User unable to click on actions and Quick convert link due to: " + e.getMessage());
            Assert.fail();
        }
    }


    // Checking if confirmation popup is Displayed
    public void confirmationPopupDisplay() {
        try {
            waitFor(ExpectedConditions.visibilityOf(popup_Confirmation), 45);
            assertThat(popup_Confirmation.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if confirmation popup is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("confirmation popup is not Displayed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // Checking if Pending Worker Identification Page is Displayed
    public void checkPendingWorkerIdentificationPageDisplayed() {
        try {
            waitFor(ExpectedConditions.visibilityOf(label_ConvertPendingWorker), 15);
            assertThat(label_ConvertPendingWorker.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Pending Worker Identification Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Pending Worker Identification Page is not Displayed due to : " + e.getMessage());
            Assert.fail();
        }
    }

    // validate Identification Tab
    public void validateIdentificationTab() {
        try {
            checkIdentificationTabAvailable();
            clickNextButton();
            reportWithScreenShot("Validate data on the identification form");
        } catch (Exception e) {
            reportWithScreenShot("Identification tab is not displayed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // validate Person Information Tab
    public void validatePersonInformationTab() {
        try {
            checkPersonInformationTabAvailable();
            clickNextButton();
            reportWithScreenShot("Review Person Information");
        } catch (Exception e) {
            reportWithScreenShot("Unable to Review Person Information due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // validate Person Profile Tab
    public void validatePersonProfileTab() {
        try {
            waitUntilPageLoad();
            clickNextButton();
            reportWithScreenShot("Review Person Profile information");
        } catch (Exception e) {
            reportWithScreenShot("Unable to Review Person Profile Information due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // validate Employment Information Tab
    public void validateEmploymentInformationTab() {
        try {
            checkEmploymentInformationTabAvailable();
            clickNextButton();
            reportWithScreenShot("Review Employment information");
        } catch (Exception e) {
            reportWithScreenShot("Unable to Review Employment Information Tab due to: " + e.getMessage());
            Assert.fail();
        }
    }


    // validate Compensation Information Tab
    public void validateCompensationInformationTab() {
        try {
            checkCompensationInformationTabAvailable();
            clickNextButton();
            reportWithScreenShot("Review Compensation and other information");
        } catch (Exception e) {
            reportWithScreenShot("Unable to Review Compensation and other Information Tab due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // validate if the Pending Worker is not Displayed
    public void checkPendingWorkerDetailNotDisplayed() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(textBox_PersonNumber), 15);
            textBox_PersonNumber.sendKeys(csvReader().get("personNumber"));
            textBox_PersonNumber.sendKeys(Keys.ENTER);
            waitShortTime();

            reportWithScreenShot("Pending Worker person details is not Displayed in the grid");
        } catch (Exception e) {
            reportWithScreenShot("Issue in searching Pending Workers details due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter Contingent worker details in Identification tab
    public void fillContingentWorkerIdentificationTab() {
        try {
            // Enter Hire Date
            basicDetailsDate.clear();
            //   actions.doubleClick(basicDetailsDate).sendKeys(data.getHireDate());
            //   String hireDate = getDynamicDate(60);
            Date date = new Date();
            //String hireDate = increaseDateFromCurrentDateByGivenDays(date, 4, "MM/dd/yyyy");
            String hireDate = getDynamicDate("+", 4);
            System.out.println(hireDate);
            actions.doubleClick(basicDetailsDate).sendKeys(hireDate);

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
            actions.moveToElement(basicDetailsEmployer).click().sendKeys(data.getLegalEmployer()).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();
            waitShortTime();

            // Check Scenario and perform Action
            if (data.getScenario().contains("PENDING_WORKER")) {
                pendingWorkerType.click();
                waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']"))), 30);
                driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']")).click();
                pendingWorkerType.sendKeys(Keys.TAB);
            } else if (data.getScenario().contains("NON_WORKER")) {
                nonWorkerType.click();
                waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']"))), 30);
                driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']")).click();
                nonWorkerType.sendKeys(Keys.TAB);
                waitShortTime();
            }

            //waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='" + data.getWorkerType() + "']"))), 30);
            //assertThat(driver.findElement(By.xpath("//*[text()='" + data.getWorkerType() + "']")).getText().equals(data.getWorkerType())).isTrue();

            waitNormalTime();

            // Enter Last Name
            waitFor(ExpectedConditions.elementToBeClickable(lastName), 15);
            lastName.sendKeys(csvReader().get("personName").trim().split(" ")[1]);
            lastName.sendKeys(Keys.TAB);

            // Enter First Name
            waitFor(ExpectedConditions.elementToBeClickable(firstName), 15);
            firstName.sendKeys(csvReader().get("personName").trim().split(" ")[0]);
            firstName.sendKeys(Keys.TAB);

            // Select Gender
            waitFor(ExpectedConditions.elementToBeClickable(gender), 5);
            gender.click();
            waitFor(ExpectedConditions
                    .elementToBeClickable(driver.findElement(By.xpath("//li[text()='" + data.getGender() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getGender() + "']")).click();

            // Select Date of Birth
            // waitFor(ExpectedConditions.elementToBeClickable(dateOfBirth), 15);
            //dateOfBirth.sendKeys(data.getDateOfBirth());
            // dateOfBirth.sendKeys(Keys.TAB);

          /*  // Select Location Contact Required
            waitFor(ExpectedConditions.elementToBeClickable(locationContact), 15);
            locationContact.click();
            locationContact.sendKeys(data.getLocationContact());*/
            waitShortTime();

            // Click to create new row
         /*   waitFor(ExpectedConditions.elementToBeClickable(addRow), 15);
            addRow.click();

            // Enter Country
            waitFor(ExpectedConditions.visibilityOf(country), 30);
            country.clear();
            country.sendKeys(data.getCountry());
            waitNormalTime();
            country.sendKeys(Keys.ENTER);
            country.sendKeys(Keys.TAB);
            waitNormalTime();
            // Enter National ID type
            clickNationalIdType.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getNationalIDType() + "']"))), 15);
            driver.findElement(By.xpath("//li[text()='" + data.getNationalIDType() + "']")).click();
            clickNationalIdType.sendKeys(Keys.TAB);

            // Enter National ID
            waitFor(ExpectedConditions.visibilityOf(nationalId), 15);
            nationalId.sendKeys(data.getNationalID());*/

            // Goto next tab
            scrollToPageTop(driver);
            reportWithScreenShot("Summary of Identification tab");
            clickNextButton(); // Next Button to go to next page

        } catch (Exception e) {
            reportWithScreenShot("Issue when entering details in identification tab due to: " + e.getMessage());
            Assert.fail();
        }
    }


    // User enter Terminated Employee details in Identification tab
    public void fillTerminatedEmpIdentificationTab() {
        try {
            // Enter Hire Date
            basicDetailsDate.clear();
            //   actions.doubleClick(basicDetailsDate).sendKeys(data.getHireDate());
            //   String hireDate = getDynamicDate(60);
            Date date = new Date();
            //String hireDate = increaseDateFromCurrentDateByGivenDays(date, 4, "MM/dd/yyyy");
            String hireDate = getDynamicDate("+", 4);
            System.out.println(hireDate);
            actions.doubleClick(basicDetailsDate).sendKeys(hireDate);

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
            actions.moveToElement(basicDetailsEmployer).click().sendKeys(data.getLegalEmployer()).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();
            waitShortTime();

            // Check Scenario and perform Action
            if (data.getScenario().contains("PENDING_WORKER")) {
                pendingWorkerType.click();
                waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']"))), 30);
                driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']")).click();
                pendingWorkerType.sendKeys(Keys.TAB);
            } else if (data.getScenario().contains("NON_WORKER")) {
                nonWorkerType.click();
                waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']"))), 30);
                driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']")).click();
                nonWorkerType.sendKeys(Keys.TAB);
                waitShortTime();
            }

            //waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='" + data.getWorkerType() + "']"))), 30);
            //assertThat(driver.findElement(By.xpath("//*[text()='" + data.getWorkerType() + "']")).getText().equals(data.getWorkerType())).isTrue();

            waitNormalTime();

            // Enter Last Name
            waitFor(ExpectedConditions.elementToBeClickable(lastName), 15);
            lastName.sendKeys(csvReader().get("personName").trim().split(" ")[1]);
            lastName.sendKeys(Keys.TAB);

            // Enter First Name
            waitFor(ExpectedConditions.elementToBeClickable(firstName), 15);
            firstName.sendKeys(csvReader().get("personName").trim().split(" ")[0]);
            firstName.sendKeys(Keys.TAB);

            // Select Gender
            waitFor(ExpectedConditions.elementToBeClickable(gender), 5);
            gender.click();
            waitFor(ExpectedConditions
                    .elementToBeClickable(driver.findElement(By.xpath("//li[text()='" + data.getGender() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getGender() + "']")).click();

            // Select Date of Birth
            // waitFor(ExpectedConditions.elementToBeClickable(dateOfBirth), 15);
            //dateOfBirth.sendKeys(data.getDateOfBirth());
            // dateOfBirth.sendKeys(Keys.TAB);

          /*  // Select Location Contact Required
            waitFor(ExpectedConditions.elementToBeClickable(locationContact), 15);
            locationContact.click();
            locationContact.sendKeys(data.getLocationContact());*/
            waitShortTime();

            // Click to create new row
         /*   waitFor(ExpectedConditions.elementToBeClickable(addRow), 15);
            addRow.click();

            // Enter Country
            waitFor(ExpectedConditions.visibilityOf(country), 30);
            country.clear();
            country.sendKeys(data.getCountry());
            waitNormalTime();
            country.sendKeys(Keys.ENTER);
            country.sendKeys(Keys.TAB);
            waitNormalTime();
            // Enter National ID type
            clickNationalIdType.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getNationalIDType() + "']"))), 15);
            driver.findElement(By.xpath("//li[text()='" + data.getNationalIDType() + "']")).click();
            clickNationalIdType.sendKeys(Keys.TAB);

            // Enter National ID
            waitFor(ExpectedConditions.visibilityOf(nationalId), 15);
            nationalId.sendKeys(data.getNationalID());*/

            // Goto next tab
            scrollToPageTop(driver);
            reportWithScreenShot("Summary of Identification tab");
            clickNextButton(); // Next Button to go to next page

        } catch (Exception e) {
            reportWithScreenShot("Issue when entering details in identification tab due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // Check if the Matching person Record popup is Displayed
    public void matchingPersonRecordDisplayed() {
        try {
            waitFor(ExpectedConditions.visibilityOf(popup_matchingPersonRecords), 30);
            assertThat(popup_matchingPersonRecords.isDisplayed()).isTrue();
            reportWithScreenShot("Check if the Matching person Record popup is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Matching person Record popup is not Displayed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User clicks on Select Person Button
    public void clickSelectPersonButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(icon_SelectPerson), 15);
            icon_SelectPerson.click();
            waitShortTime();

            reportWithScreenShot("Pending Worker person details is not Displayed in the grid");
        } catch (Exception e) {
            reportWithScreenShot("Issue in searching Pending Workers details due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // validate if the warning message is Displayed
    public void warningMessageDisplayed() {
        try {
            waitFor(ExpectedConditions.visibilityOf(popup_warning), 30);
            assertThat(popup_warning.isDisplayed()).isTrue();
            reportWithScreenShot("Check if the Warning popup is Displayed");

        } catch (Exception e) {
            reportWithScreenShot("Warning pop up message not displayed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User clicks on ok Button
    public void clickOkBtn() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_OKWarning), 15);
            button_OKWarning.click();
            waitShortTime();
            reportWithScreenShot("After user click ok in warning popup window");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user click ok in warning popup window due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User clicks on Continue Button for Quick Action all new hires
    public void clickContinueButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_Continue), 15);
            button_Continue.click();
            waitShortTime();
            reportWithScreenShot("User clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user click on Continue button due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in When why section
    public void enterWhenWhySectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(date_Hire), 15);
            date_Hire.clear();
            String hireDate = getDynamicDate("-", 60);
            //actions.doubleClick(date_Hire).sendKeys(hireDate);
            date_Hire.sendKeys(hireDate);
            waitFor(ExpectedConditions.elementToBeClickable(basicDetailsEmployer), 15);
            basicDetailsEmployer.sendKeys(data.getLegalEmployer());
            waitShortTime();
            basicDetailsEmployer.sendKeys(Keys.TAB);

            // Check Scenario and perform Action
            if (data.getScenario().contains("PENDING_WORKER")) {
                pendingWorkerType.click();
                waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']"))), 30);
                driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']")).click();
                pendingWorkerType.sendKeys(Keys.TAB);
            } else if (data.getScenario().contains("NON_WORKER")) {
                nonWorkerType.click();
                waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']"))), 30);
                driver.findElement(By.xpath("//li[text()='" + data.getWorkerType() + "']")).click();
                nonWorkerType.sendKeys(Keys.TAB);
                waitShortTime();
            }


            //  checkAndUpdateLegalEmployerIfEmpty();
            // Select Hire Reason
          /*  waitFor(ExpectedConditions.elementToBeClickable(dropDown_HireReason), 15);
            dropDown_HireReason.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getHireReason() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getHireReason() + "']")).click();
            dropDown_HireReason.sendKeys(Keys.TAB);*/

            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            reportWithScreenShot("User enter details in When why section and clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user enter details in When why section due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Personal details section
    public void enterPersonalSectionDetails() {
        try {
            waitNormalTime();

            // Enter Last Name
            waitFor(ExpectedConditions.elementToBeClickable(lastName), 5);
            lastName.sendKeys(data.getLastName());
            lastName.sendKeys(Keys.TAB);

            // Enter First Name
            waitFor(ExpectedConditions.elementToBeClickable(firstName), 5);
            firstName.sendKeys(data.getFirstName());
            firstName.sendKeys(Keys.TAB);

            csvWriter("", data.getFirstName() + " " + data.getLastName());

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
            // Enter National ID type
            dropDown_NationalIDType.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getNationalIDType() + "']"))), 15);
            driver.findElement(By.xpath("//li[text()='" + data.getNationalIDType() + "']")).click();
            dropDown_NationalIDType.sendKeys(Keys.TAB);

            // Enter National ID
            waitFor(ExpectedConditions.visibilityOf(textBox_NationalID), 15);
            textBox_NationalID.sendKeys(data.getNationalID());
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            reportWithScreenShot("User enter details in personal details section and clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user enter details in personal details section due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Communication Info section
    public void enterCommunicationSectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 35);
            button_Hire_Continue.click();
            reportWithScreenShot("User clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user click on Continue button due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Addresses section
    public void enterAddressesSectionDetails() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.visibilityOf(country), 40);
            waitShortTime();
            //waitFor(ExpectedConditions.elementToBeClickable(country), 15);
            country.click();
            System.out.println("First click");
            country.click();
            System.out.println("2nd click");
            waitShortTime();
            // country.sendKeys("United States");
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getCountry() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getCountry() + "']")).click();
            // country.sendKeys(Keys.TAB);
            //country.clear();
            //System.out.println("After clearing");
            // country.sendKeys(data.getCountry());
            //System.out.println("After entering states");
            // country.sendKeys(Keys.ARROW_DOWN);
            //  country.sendKeys(Keys.ENTER);
            waitShortTime();
            //  dropDown_Country.sendKeys(Keys.ENTER);
            // dropDown_Country.sendKeys(Keys.TAB);
            waitFor(ExpectedConditions.visibilityOf(addressType), 30);
            selectInputDropdownValue(addressType, data.getAltWorkLocationAddressType());

            // Enter Address Line 1
            waitFor(ExpectedConditions.elementToBeClickable(addressLine1), 15);
            addressLine1.sendKeys(data.getAddressLine1());
            addressLine1.sendKeys(Keys.TAB);

            // Enter Address Line 2
            waitFor(ExpectedConditions.elementToBeClickable(addressLine2), 15);
            addressLine2.sendKeys(data.getAddressLine2());
            addressLine2.sendKeys(Keys.TAB);

            // Enter Zip Code
            waitFor(ExpectedConditions.elementToBeClickable(dropDown_ZipCode), 15);
            dropDown_ZipCode.sendKeys(data.getZipCode());
            addressLine2.click();
            waitNormalTime();
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();

            reportWithScreenShot("User enter details in Addresses details section and clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user enter details in Addresses details section due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in legislative Info section
    public void enterLegislativeInfoSectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            reportWithScreenShot("User clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user click on Continue button due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Passport Details section
    public void enterPassportInfoSectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            waitShortTime();
            reportWithScreenShot("User clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user click on Continue button due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Citizenship Info section
    public void enterCitizenshipInfoSectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            waitShortTime();
            reportWithScreenShot("User clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user click on Continue button due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Drivers Licenses section
    public void enterDriversLicensesSectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            waitShortTime();
            reportWithScreenShot("User clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user click on Continue button due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Visa permits section
    public void enterVisasSectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            waitShortTime();
            reportWithScreenShot("User clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user click on Continue button due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter Family Emergency Contacts section
    public void enterFamilyEmergencyContactsSectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            waitShortTime();
            reportWithScreenShot("User clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user click on Continue button due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter Employment Details section
    public void enterEmploymentSectionDetails() {
        try {
            // Enter Business Unit
            waitFor(ExpectedConditions.elementToBeClickable(businessUnit), 15);
            businessUnit.clear();
            waitNormalTime();
            businessUnit.sendKeys(data.getBusinessUnit());
            businessUnit.sendKeys(Keys.ENTER);
            waitNormalTime();

            // Enter Job
            waitFor(ExpectedConditions.elementToBeClickable(job), 15);
            job.clear();
            job.sendKeys(data.getJob());
            job.sendKeys(Keys.ENTER);
            waitNormalTime();

            // Enter Grade - Not required as of now as its autoloaded
            /*waitFor(ExpectedConditions.elementToBeClickable(grade), 15);
            grade.clear();
            grade.sendKeys(data.getGrade());*/

            // Enter Department
            waitFor(ExpectedConditions.elementToBeClickable(department), 15);
            department.clear();
            department.sendKeys(data.getDepartment());
            department.sendKeys(Keys.ENTER);
            waitNormalTime();

            // Enter Location
            try {
                waitFor(ExpectedConditions.elementToBeClickable(location), 15);
                location.clear();
                waitShortTime();
                location.sendKeys(data.getLocation());
                waitShortTime();
            } catch (StaleElementReferenceException e) {
                waitShortTime();
                location.sendKeys(data.getLocation());
            }
            waitShortTime();
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            waitShortTime();
            reportWithScreenShot("User enter details in Employment details section and clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user enter details in Employment details section due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter Manager Details section
    public void enterManagerSectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            waitShortTime();
            reportWithScreenShot("User clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user click on Continue button due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User clicks on Continue Button for Quick Action all new hires
    public void enterContractInfoSectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_Continue), 15);
            button_Continue.click();
            waitShortTime();
            reportWithScreenShot("User clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user click on Continue button due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Work Relationship Info
    public void enterWorkRelationshipInfoSectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            waitShortTime();
            reportWithScreenShot("User clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user click on Continue button due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Payroll details section
    public void enterPayrollSectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(dropDown_Payroll), 15);
            dropDown_Payroll.click();
            waitFor(ExpectedConditions.elementToBeClickable(
                    driver.findElement(By.xpath("//li[text()='" + data.getPayroll() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getPayroll() + "']")).click();
            dropDown_Payroll.sendKeys(Keys.TAB);
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            waitShortTime();
            reportWithScreenShot("User enter details in Payroll details section and clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user enter details in Payroll details section due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Salary section
    public void enterSalarySectionDetails() {
        try {
            // Enter Salary Basis
            waitFor(ExpectedConditions.elementToBeClickable(dropDown_SalaryBasis), 15);
            dropDown_SalaryBasis.sendKeys(data.getSalaryBasis());

            // Enter Salary Amount
            waitFor(ExpectedConditions.elementToBeClickable(salaryAmount), 15);
            salaryAmount.clear();
            salaryAmount.sendKeys(data.getSalaryAmount());
            waitShortTime();
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            waitShortTime();
            reportWithScreenShot("User enter details in Salary section and clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user enter details in Salary section due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Compensation section
    public void enterCompensationSectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            waitShortTime();
            reportWithScreenShot("User clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user click on Continue button due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Direct Reports section
    public void enterDirectReportsSectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(button_Hire_Continue), 15);
            button_Hire_Continue.click();
            waitShortTime();
            reportWithScreenShot("User clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user click on Continue button due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // User enter details in Comments section
    public void enterCommentsAttachmentSectionDetails() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(dropDown_Comments), 15);
            dropDown_Comments.sendKeys("Captured info for New hire");
            waitShortTime();
            reportWithScreenShot("User enter details in comments section and clicks on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Issue while user enter comments due to: " + e.getMessage());
            Assert.fail();
        }
    }


}
