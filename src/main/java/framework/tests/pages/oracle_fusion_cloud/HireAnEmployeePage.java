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

    Context context;
    Data data;
    Actions actions;

    // Hire An Employee Page Elements
    @FindBy(xpath = "//*[text()='Hire an Employee: Identification']")
    private WebElement hireAnEmployeePageCheck;

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

    @FindBy(xpath = "(//input[@class='x109'])[2]")
    private WebElement country;

    @FindBy(xpath = "//span[text()='United States']")
    private WebElement selectCountryFromPopUp;

    @FindBy(xpath = "(//input[contains(@class,'x2h')])[6]")
    private WebElement clickNationalIdType;

    @FindBy(xpath = "(//input[@class='x25'])[10]")
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

    @FindBy(xpath = "(//input[@class='x109'])[16]")
    private WebElement payroll;

    @FindBy(xpath = "//label[text()='I-9 Status']/following::input[1]")
    private WebElement i9Status;

    @FindBy(xpath = "//label[text()='Salary Basis']/following::input[1]")
    private WebElement salaryBasis;

    @FindBy(xpath = "//label[text()='Salary Amount']/following::input[1]")
    private WebElement salaryAmount;

    @FindBy(xpath = "//label[@class='x1cd']")
    private WebElement salarycmpnt;

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

    @FindBy(xpath = "/html/body/div[1]/form/div[2]/div[2]/div[2]/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[2]")
    private WebElement manageElementEntries;

    @FindBy(xpath = "(//*[text()='Manage Element Entries'])[1]")
    private WebElement manageElementEnteriesTextCheck;

    @FindBy(xpath = "//label[text()='Element Name']/following::input[1]")
    private WebElement elementName;

    @FindBy(xpath = "//label[text()='Assignment']")
    private WebElement assignment;

    @FindBy(xpath = "//button[@title='Continue']")
    private WebElement continueBtn;

    @FindBy(xpath = "//label[text()='Bilingual']/following::input[1]")
    private WebElement bilingualYes;

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
            country.sendKeys(Keys.TAB);
            waitShortTime();

            // If Country Pop up screen is present
            if (selectCountryFromPopUp.isDisplayed()) {
                //selectCountryFromPopUp.click();
                clickOkButton();
                waitShortTime();
            }

            // Enter National ID type
            clickNationalIdType.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getNationalIDType() + "']"))), 15);
            driver.findElement(By.xpath("//li[text()='" + data.getNationalIDType() + "']")).click();
            clickNationalIdType.sendKeys(Keys.TAB);
            waitShortTime();

            // Enter National ID
            waitFor(ExpectedConditions.visibilityOf(nationalId), 15);
            nationalId.sendKeys(data.getNationalID());
            waitShortTime();
            clickNextButton(); // Next Button to go to next page
            reportWithScreenShot("Summary of Identification tab");
            waitUntilPageLoad(); // wait until next tab loads

        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value into Identification Tab due to:" + e.getMessage());
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
            // zipCode.sendKeys(Keys.TAB);

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
            newlySeparatedVeteranDischargeDate.sendKeys(data.getnewlySeparatedVeteranDischargeDate());
            waitNormalTime();
            clickNextButton(); // Next Button to go to next page
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
            waitFor(ExpectedConditions.elementToBeClickable(businessUnit), 15);
            businessUnit.sendKeys(data.getBusinessUnit());

            // Enter Job
            waitFor(ExpectedConditions.elementToBeClickable(job), 15);
            job.sendKeys(data.getJob());

            // Enter Grade
//            waitFor(ExpectedConditions.elementToBeClickable(grade), 15);
//            grade.clear();
//            grade.sendKeys(data.getGrade());
            waitNormalTime();

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

            // Clicking Add button to enter Payroll Details
            clickCreateButton();
            waitNormalTime();

            // Select Payroll Details
            waitFor(ExpectedConditions.elementToBeClickable(payroll), 15);
            payroll.sendKeys(data.getPayroll());
            waitShortTime();
            clickNextButton(); // Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads

            reportWithScreenShot("Summary of Employment Information tab");

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While Entering Value into Employement Information Tab due to:" + e.getMessage());
        }
    }

    // Enter Value into Compensation and Other Information tab
    public void fillCompensationAndOtherInformationTab() {
        try {

            // Enter Salary Basis
            waitFor(ExpectedConditions.elementToBeClickable(salaryBasis), 15);
            salaryBasis.sendKeys(data.getSalaryBasis());
            waitShortTime();

            // Enter Salary Amount
            waitFor(ExpectedConditions.elementToBeClickable(salaryAmount), 15);
            salaryAmount.clear();
            salaryAmount.sendKeys(data.getSalaryAmount());
            waitShortTime();

            // Enable Use salary components check box
            waitFor(ExpectedConditions.visibilityOf(salarycmpnt), 15);
            salarycmpnt.click();

            clickNextButton(); // Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads
            reportWithScreenShot("Summary of Compensation and Other Information Tab");

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While Entering Value into Compensation and Other Information Tab due to:" + e.getMessage());
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


    // Person Management Search check available
    public boolean checkpersonManagementSearchAvailable() {
        try {
            reportWithScreenShot("Checking if Person Management Search screen is Displayed");
            waitFor(ExpectedConditions.visibilityOf(personManagementSearch), 15);
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
            waitFor(ExpectedConditions.elementToBeClickable(keywords), 15);
            keywords.sendKeys(data.getPersonNumber());

            // Enter effective as of date
            waitFor(ExpectedConditions.elementToBeClickable(effectiveAsOfDate), 15);
            effectiveAsOfDate.clear();
            effectiveAsOfDate.sendKeys(data.geteffectiveAsOfDate());
            Thread.sleep(2500);
            // actions.sendKeys(Keys.TAB);
            // System.out.println("after effective date entered");
            reportWithScreenShot("Summary of Person Management: Search screen");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Person Management: Search screen:" + e.getMessage());
        }
    }

    // After entering person number, click on Search Button
    public void clickSearch() {
        try {
            System.out.println("before search btn click");
            waitFor(ExpectedConditions.elementToBeClickable(searchBtn), 15);
            searchBtn.click();

            WebElement personexists = driver
                    .findElement(By.xpath("//td//span[text()='" + data.getPersonNumber() + "']"));
            int counter = 0;
            while (!personexists.isDisplayed() && counter <= 60) {
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

            WebElement personexists = driver
                    .findElement(By.xpath("//td//span[text()='" + data.getPersonNumber() + "']"));

            waitFor(ExpectedConditions.visibilityOf(personexists), 15);

            reportWithScreenShot("Search Results of person Number");
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
    public boolean checkManageElementEntriesAvailable() {
        try {
            reportWithScreenShot("Checking if Manage Element Entries page  is Displayed");
            waitFor(ExpectedConditions.visibilityOf(manageElementEnteriesTextCheck), 15);
            return manageElementEnteriesTextCheck.isDisplayed();
        } catch (Exception e) {
            reportWithScreenShot("Manage Element Entries page  not Displayed");
            return manageElementEnteriesTextCheck.isDisplayed();
        }
    }

    // User Enter Element Name details as BILINGUAL
    public void fillElementEntryInfo() {
        try {

            // Enter Business Unit
            waitFor(ExpectedConditions.elementToBeClickable(elementName), 15);
            elementName.sendKeys(data.getelementName());
            actions.sendKeys(Keys.TAB);
            waitFor(ExpectedConditions.visibilityOf(assignment), 15);

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
            waitFor(ExpectedConditions.visibilityOf(bilingualYes), 15);
            return bilingualYes.isDisplayed();
        } catch (Exception e) {
            reportWithScreenShot("Bilingual field not Displayed");
            return bilingualYes.isDisplayed();
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

    public boolean bilingualRowAdded() {
        try {
            reportWithScreenShot("Checking if Bilingual row is Displayed");
            waitFor(ExpectedConditions.visibilityOf(bilingualRowAdded), 15);
            return bilingualRowAdded.isDisplayed();
        } catch (Exception e) {
            reportWithScreenShot("Bilingual row is not added");
            return bilingualRowAdded.isDisplayed();
        }
    }

}
