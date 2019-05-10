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

public class PersonManagementPage extends BasePage<PersonManagementPage> {

    private Context context;
    private Data data;
    private int elementsize;
    private String searchDate;
    private Actions actions;

    // Person Management Page Locators
    @FindBy(className = "svg-icon03")
    private WebElement navigatorOpen;

    @FindBy(xpath = "//h1[contains(text(),': Identification')]")
    private WebElement identificationTab;

    @FindBy(xpath = "//h1[contains(text(),': Person Information')]")
    private WebElement personInfoTab;

    @FindBy(xpath = "//*[text()='Person Management: Search']")
    private WebElement personManagementSearch;

    @FindBy(xpath = "//h1[contains(text(),': Person Management')]")
    private WebElement personManagement;

    @FindBy(xpath = "//label[text()='Keywords']/following::input[1]")
    private WebElement keywords;

    @FindBy(xpath = "//label[text()='Effective As-of Date']/following::input[1]")
    private WebElement effectiveAsOfDate;

    @FindBy(xpath = "//button[text()='Search']")
    private WebElement searchBtn;

    @FindBy(xpath = "(//img[@title='Actions'])[1]")
    private WebElement actionsBtn;

    @FindBy(xpath = "(//td[text()='Payroll'])[2]")
    //This locator is only available option to select, no other locator style exist
    private WebElement payrollOption;

    @FindBy(xpath = "(//td[@class='xnn'][contains(.,'Manage Element Entries')])[2]")
    private WebElement manageElementEntries;

    @FindBy(xpath = "//li[@class='x1ui']//a[contains(text(),'Manage Salary')]")
    private WebElement manageSalary;

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

    @FindBy(xpath = "//label[text()='Amount']/following::input[1]")
    private WebElement actualAmount;

    @FindBy(xpath = "//label[text()='Paycheck Date']/following::input[1]")
    private WebElement payCheckDate;

    @FindBy(xpath = "//*[contains(@class,'x10t') and contains(text(),'m')]")
    private WebElement bilingualSubmitBtn;

    @FindBy(xpath = "//*[contains(@class,'x11e') and contains(text(),'m')]")
    private WebElement adpSubmitBtn;

    @FindBy(xpath = "(//*[contains(text(),'Comp One Off Bonus Pay')])[1]")
    private WebElement adpRowAdded;

    @FindBy(xpath = "(//*[contains(text(),'Comp One Off Bonus Pay')])[1]")
    private WebElement adpRowDeleted;

    @FindBy(xpath = "(//span[@class='xwy'])[1]")
    private WebElement done;

    @FindBy(xpath = "//a[contains(@id,'table2:0:gl1')]")
    private WebElement personLink;

    @FindBy(xpath = "//a[@title='Edit']")
    private WebElement personMgmtEdit;

    @FindBy(xpath = "(//a[@title='Edit'])[2]")
    private WebElement manageElementEntriesEdit;

    @FindBy(xpath = "//tr[contains(@id,'updBtn')]")
    private WebElement personMgmtUpdate;

    @FindBy(xpath = "//div[text()='Update Employment']")
    private WebElement updateEmploymentTitle;

    @FindBy(xpath = "//h1[contains(.,'Manage Employment')]")
    private WebElement manageEmployment;

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

    @FindBy(xpath = "//button[@accesskey='K' and contains(@id,'Manag1:0:AP1:ctb1') and contains(.,'O')]")
    private WebElement btnOK1;

    @FindBy(xpath = "//button[@accesskey='K' and contains(@id,'Manag1:0:commandButton1') and contains(.,'O')]")
    private WebElement btnOK2;
    
    @FindBy(xpath = "//h1[contains(.,'Global Temporary Assignment: Employment Information')]")
    private WebElement employmentInfoPage;

    @FindBy(xpath = "(//div[contains(.,'Select Assignment Status')])[8]")
    private WebElement selectAssignmentStatus;

    @FindBy(xpath = "//label[text()='Destination Legal Employer']/following::input[1]")
    private WebElement updateEmploymentDestLegalEmployer;

    @FindBy(xpath = "//label[contains(@for,'rdoMakePrimary:_0')]")
    private WebElement updateEmploymentCreatePrimaryWork;

    @FindBy(xpath = "//h1[text()='Global Temporary Assignment: Identification']")
    private WebElement globalTempAssignment;

    @FindBy(xpath = "//label[text()='Existing Address']")
    private WebElement personalInfoExistingAddress;

    @FindBy(xpath = "//label[text()='Working Hours']/following::input[1]")
    private WebElement empInfoWorkingHrs;


    @FindBy(xpath = "//td[@class='xmz' and text()='Edit']")
    private WebElement editAction;

    @FindBy(xpath = "//div[1][@class='xjd']//button[@title='Action']")
    private WebElement btnAction;

    @FindBy(xpath = "//h1[@class='xyx'][contains(text(),'Current Salary')]")
    private WebElement currentSalaryTab;

    @FindBy(xpath = "//a[text()='Components']")
    private WebElement linkComponents_ManageSalary;

    @FindBy(xpath = "//td[text()='Edit']")
    private WebElement linkActionEdit;

    @FindBy(xpath = "//label[@class='af_selectOneChoice_label-text' and text()='Action']//following::input[1]")
    private WebElement dropdownAction_ManageEmployment;

    @FindBy(xpath = "//label[@class='af_selectOneChoice_label-text' and text()='Action Reason']//following::input[1]")
    private WebElement dropdownActionReason_ManageEmployment;

    @FindBy(xpath = "//label[text()='Projected End Date']//following::input[1]")
    private WebElement projectedEndDate_ManageEmployment;

    @FindBy(xpath = "//a[text()='Manage Work Relationship']")
    private WebElement linkManageWorkRelationship;

    @FindBy(xpath = "//a[@title='Actions']")
    private WebElement btnActions_Manageworkrelationship;

    @FindBy(xpath = "//label[text()='Seniority Date'][1]//following::input[1]")
    private WebElement txtboxSeniorityDtLegal_Manageworkrelationship;

    @FindBy(xpath = "//label[text()='Seniority Date'][2]//following::input[1]")
    private WebElement txtboxSeniorityDtEnterprise_Manageworkrelationship;

    @FindBy(xpath = "//h1[@class='xmu']")
    private WebElement reviewSalaryPage;

    @FindBy(xpath = "//a[text()='Manage Work Relationship']")
    private WebElement manageWorkRelationship;

    @FindBy(xpath = "//h1[contains(.,'Work Relationship Details')]")
    private WebElement manageWorkRelationshipPage;

    @FindBy(xpath = "//h1[contains(text(),'Edit Work Relationship:')]")
    private WebElement editManageWorkRelationshipPage;

    @FindBy(xpath = "//a[@title='Actions']")
    private WebElement manageWorkRelactionsBtn;

    @FindBy(xpath = "//td[contains(@class,'xnn') and contains(text(),'Edit')]")
    private WebElement manageWorkRelEditBtn;

    @FindBy(xpath = "//label[text()='I-9 Status']/following::input[1]")
    private WebElement i9Status;

    @FindBy(xpath = "(//td[text() = 'Correct'])[4]")
    private WebElement personMgmtCorrect;

    @FindBy(xpath = "//td[text() = 'Correct']")
    private WebElement personClickCorrect;

    @FindBy(xpath = "//div[text() = 'Correct Employment']")
    private WebElement correctEmploymentTitle;

    @FindBy(xpath = "//label[@class = 'af_selectOneChoice_label-text' and text()='Action']/following::input[1]")
    private WebElement correctEmploymentAction;

    @FindBy(xpath = "(//label[ @class ='af_selectOneChoice_label-text' and text()='Action Reason'])/following::input[1]")
    private WebElement correctEmploymentActionReason;

    @FindBy(xpath = "//button[contains(@id,'_FOpt1:_FOr1:0:')and text() = 'OK']")
    private WebElement correctEmploymentOk;

    @FindBy(xpath = "//span[text()='Review']")
    private WebElement reviewButton_ManageEmployment;

    @FindBy(xpath = "(//label[text()='Hire Date']/following::input[1])[1]")
    private WebElement hireDate;

    @FindBy(xpath = "(//label[text()='Hire Date'])[3]/following::span[1]")
    private WebElement enterpriseHireDate;

    @FindBy(xpath = "//img[@title='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = "//button[@accesskey='Y']")
    private WebElement confirmButton;

    @FindBy(xpath = "//div[text()='Correct Name']")
    private WebElement textCorrectName;

    @FindBy(xpath = "//label[text()='First Name' and contains(@class,'inputText_label-text')]/following::input[1]")
    private WebElement textFirstName;

    @FindBy(xpath = "//h1[text()='National Identifiers']")
    private WebElement textNationalIdentifiers;

    @FindBy(xpath = "//label[text()='Effective Start Date']/following::input[1]")
    private WebElement textEffectiveStartDate;

    @FindBy(xpath = "(//td[text() = 'Update'])[4]")
    private WebElement buttonManagePersonUpdate;

    @FindBy(xpath = "//label[text()='Name']/following::input[1]")
    private WebElement personName;
    
    // Person Management Contructor
    public PersonManagementPage(Context context) {
        super(context);
        this.context = context;
        this.data = context.getData();
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
        logger.debug("{} loaded", this.getClass().getName());
    }


    // Person Management Search check available
    public void checkPersonManagementSearchAvailable() {
        try {
            reportWithScreenShot("Checking if Person Management Search screen is Displayed");
            waitFor(ExpectedConditions.visibilityOf(personManagementSearch), 15);
            assertThat(personManagementSearch.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Person Management Search screen not Displayed");
            Assert.fail();
        }
    }

    // Person Management Screen check available
    public void checkPersonManagementScreenAvailable() {
        try {
            reportWithScreenShot("Checking if Person Management screen is Displayed");
            waitFor(ExpectedConditions.visibilityOf(personManagement), 15);
            assertThat(personManagement.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Person Management screen not Displayed");
            assertThat(personManagement.isDisplayed()).isTrue();
        }
    }

    // Enter Value into Person Management: Search screen
    public void searchPerson() {
        try {
            // Enter person number into keywords
            waitFor(ExpectedConditions.elementToBeClickable(keywords), 15);
            keywords.sendKeys(csvReader().get("personNumber"));

            // Enter effective as of date
            waitFor(ExpectedConditions.elementToBeClickable(effectiveAsOfDate), 15);
            effectiveAsOfDate.clear();

            // Add Current Date + 1 as the senario runs before this test changes the date to current date +1 (Scenario name : Seniority date)
            searchDate = addDaysToDate(getCurrentDate(), 0, "mm/dd/yyyy");

            effectiveAsOfDate.sendKeys(searchDate);
            waitShortTime();
            reportWithScreenShot("Summary of Person Management: Search screen");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Person Management: Search screen:" + e.getMessage());
            Assert.fail();
        }
    }

    // After entering person number, click on Search Button until person
    public void clickSearchTillPersonDisplayed() {
        try {
            clickSearch(); // Click Search Button

            // Check for Employee for max 60 seconds
            elementsize = driver
                    .findElements(By.xpath("//span[text()='" + csvReader().get("personNumber") + "']")).size();
            int counter = 0;
            while (elementsize == 0 && counter <= 20) {
                elementsize = driver
                        .findElements(By.xpath("//span[text()='" + csvReader().get("personNumber") + "']")).size();
                clickSearch();
                waitShortTime();
                counter++;
            }

            // Throw Exception if Person name now found after 60 seconds
            if (elementsize == 0) {
                throw new Exception("Person number not found after 60 seconds");
            }
            reportWithScreenShot("User is on search result page");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking search results of employee:" + e.getMessage());
            Assert.fail();
        }
    }

    // Enter Value into Person Management: Search screen
    public void searchPersonName() {
        try {
            // Enter person number into keywords
            waitFor(ExpectedConditions.elementToBeClickable(personName), 15);
            personName.sendKeys(csvReader().get("personName"));

            // Enter effective as of date
            waitFor(ExpectedConditions.elementToBeClickable(effectiveAsOfDate), 15);
            effectiveAsOfDate.clear();

            // Add Current Date + 1 as the senario runs before this test changes the date to current date +1 (Scenario name : Seniority date)
            searchDate = addDaysToDate(getCurrentDate(), 0, "mm/dd/yyyy");

            effectiveAsOfDate.sendKeys(searchDate);
            waitShortTime();
            reportWithScreenShot("Summary of Person Management: Search screen");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Person Management: Search screen:" + e.getMessage());
            Assert.fail();
        }
    }

    // After entering person number, click on Search Button until person
    public void clickSearchTillPersonNameDisplayed() {
        try {
            clickSearch(); // Click Search Button
            // Check for Employee for max 60 seconds
            elementsize = driver
                    .findElements(By.xpath("(//img[@title='Actions'])[1]")).size();
            int counter = 0;
            while (elementsize == 0 && counter <= 20) {
                elementsize = driver
                        .findElements(By.xpath("(//img[@title='Actions'])[1]")).size();
                clickSearch();
                waitShortTime();
                counter++;
            }

            // Throw Exception if Person name now found after 60 seconds
            if (elementsize == 0) {
                throw new Exception("Person Name not found after 60 seconds");
            }
            reportWithScreenShot("User is on search result page");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking search results of employee:" + e.getMessage());
            Assert.fail();
        }
    }


    // After entering person number, click on Search Button until person
    public void clickSearchPersonNotDisplayed() {
        try {
            clickSearch(); // Click Search Button

            // Check for Employee for max 60 seconds
            elementsize = driver
                    .findElements(By.xpath("//span[text()='" + csvReader().get("personNumber") + "']")).size();
            int counter = 0;
            while (elementsize >= 1 && counter <= 20) {
                elementsize = driver
                        .findElements(By.xpath("//span[text()='" + csvReader().get("personNumber") + "']")).size();
                clickSearch();
                waitShortTime();
                counter++;
            }

            // Throw Exception if Person name now found after 60 seconds
            if (elementsize >= 1) {
                throw new Exception("Person number present even after 60 seconds");
            }
            reportWithScreenShot("User is not present search result page as expected");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking search results of employee:" + e.getMessage());
            Assert.fail();
        }
    }


    // Validate if search result displays right person details
    public void validateSearchResult() {
        // Report Person number with screenshot (as this methods is always True)
        reportWithScreenShot("Search Results of person Number");
    }

    // User click on actions button
    public void clickActionButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(actionsBtn), 15);
            actionsBtn.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on EmpName Action click:" + e.getMessage());
            Assert.fail();
        }
    }

    // Click on Payroll Options under Actions
    public void clickPayrollOption() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(payrollOption), 15);
            assertThat(payrollOption.isDisplayed()).isTrue();
            payrollOption.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While selecting Payroll options:" + e.getMessage());
            Assert.fail();
        }
    }

    // User click on Manage Element Entries
    public void manageElementEntriesClick() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(manageElementEntries), 15);
            assertThat(manageElementEntries.isDisplayed()).isTrue();
            manageElementEntries.click();

            reportWithScreenShot("Search Results of person Number");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Review Tab due to:" + e.getMessage());
            Assert.fail();
        }
    }


    // Check if Manage Element Entries page available
    public void checkManageElementEntriesAvailable() {
        try {
            reportWithScreenShot("Checking if Manage Element Entries page  is Displayed");
            waitFor(ExpectedConditions.visibilityOf(manageElementEnteriesTextCheck), 15);
            assertThat(manageElementEnteriesTextCheck.isDisplayed()).isTrue();
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Manage Element Entries page  not Displayed");
            Assert.fail();
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
            Assert.fail();

        }
    }

    // User Enter Element Name details as ADP Auto & Home
    public void fillADPElementEntryInfo() {
        try {
            // Enter Business Unit
            waitFor(ExpectedConditions.elementToBeClickable(elementName), 15);
            elementName.sendKeys(data.getElementNameADP());
            elementName.sendKeys(Keys.ENTER);
            waitNormalTime();
            //   waitFor(ExpectedConditions.visibilityOf(payrollRelationship), 15);

        } catch (Exception e) {
            reportWithScreenShot("Error While user enters Element Name as ADP:" + e.getMessage());
            Assert.fail();
        }
    }

    // Click on Continue Button
    public void clickContinue() {
        try {
            continueBtn.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While User Click Continue Button:" + e.getMessage());
            Assert.fail();
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
            Assert.fail();
        }
    }

    // Enter Actual Amount and date
    public void enteractualAmountAndDate() {
        try {
            // Enter Actual Amount
            waitFor(ExpectedConditions.elementToBeClickable(actualAmount), 15);
            actualAmount.clear();
            actualAmount.sendKeys(data.getActualAmount());

            // Enter effective as of date - Not required for COgnizant instance
            /*waitFor(ExpectedConditions.elementToBeClickable(payCheckDate), 15);
            payCheckDate.clear();
            payCheckDate.sendKeys(data.getPayCheckDate());*/
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Error While User entering Amount and date:" + e.getMessage());
            Assert.fail();
        }
    }

    // Click on Submit Button for ADP
    public void adpSubmit() {
        try {
            adpSubmitBtn.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While User Submit Button for ADP scenario:" + e.getMessage());
            Assert.fail();
        }
    }

    public void adpRowAdded() {
        try {
            reportWithScreenShot("Checking if ADP Auto & Home row is Displayed");
            waitFor(ExpectedConditions.visibilityOf(adpRowAdded), 15);
            assertThat(adpRowAdded.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("ADP Auto & Home r row is not added");
            Assert.fail();
        }
    }


    public void adpRowDeleted() {
        try {
            waitNormalTime();
            reportWithScreenShot("Checking if ADP Auto & Home row is Displayed");
            assertThat(driver.findElements(By.xpath("(//*[contains(text(),'Comp One Off Bonus Pay')])[1]")).isEmpty()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("ADP Auto & Home row is not deleted");
            Assert.fail();
        }
    }

    // Click on Done button
    public void clickDoneButton() {
        try {
            waitUntilPageLoad();
            waitNormalTime();
            waitFor(ExpectedConditions.visibilityOf(done), 15);
            waitFor(ExpectedConditions.elementToBeClickable(done), 15);
            done.click();
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Error While user click Done Button due to:" + e.getMessage());
            Assert.fail();
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
            Assert.fail();
        }
    }

    // Click on Submit Button for Bilingual
    public void bilingualSubmit() {
        try {
            clickSubmitButton();
        } catch (Exception e) {
            reportWithScreenShot("Error While User bilingual Submit Button:" + e.getMessage());
            Assert.fail();
        }
    }

    public void bilingualRowAdded() {
        try {
            reportWithScreenShot("Checking if Bilingual row is Displayed");
            waitFor(ExpectedConditions.visibilityOf(bilingualRowAdded), 15);
            assertThat(bilingualRowAdded.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Bilingual row is not added");
            Assert.fail();
        }
    }

    // User click on Employee Name link
    public void clickPersonNameLink() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(personLink), 15);
            personLink.click();
            reportWithScreenShot("User clicked on Employee Name link");
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on person Name link:" + e.getMessage());
            Assert.fail();
        }
    }

    // User click on Edit and Update button
    public void clickEditUpdate() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(personMgmtEdit), 15);
            personMgmtEdit.click();
            waitShortTime();

            waitFor(ExpectedConditions.elementToBeClickable(personMgmtUpdate), 15);
            personMgmtUpdate.click();
            waitShortTime();

            waitFor(ExpectedConditions.visibilityOf(updateEmploymentTitle), 15);
            assertThat(updateEmploymentTitle.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on Edit and update button:" + e.getMessage());
            Assert.fail();
        }
    }

    // User checks if Update Employment Window is Displayed
    public void checkUpdateEmployementWindowDisplayed() {
        try {
            reportWithScreenShot("Checking if Update Employment Window is Displayed");
            waitFor(ExpectedConditions.visibilityOf(updateEmploymentTitle), 15);
            assertThat(updateEmploymentTitle.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Update Employment Window is not Displayed");
            Assert.fail();
        }
    }

    // User enter details in Update Employment Window
    public void fillUpdateEmpWindow() {
        try {
            // Enter current date into effective date
            waitFor(ExpectedConditions.elementToBeClickable(updateEmploymentEffectiveDate), 15);
            updateEmploymentEffectiveDate.clear();

            // Add Current Date + 1 as the senario runs before this test changes the date to current date +1 (Scenario name : Seniority date
            //updateEmploymentEffectiveDate.sendKeys(data.getEffectiveAsOfDate());
            updateEmploymentEffectiveDate.sendKeys(getDynamicDate("-", 5));
            updateEmploymentEffectiveDate.sendKeys(Keys.TAB);
            waitShortTime();

            // Enter Action value
            waitFor(ExpectedConditions.elementToBeClickable(updateEmploymentAction), 15);
            updateEmploymentAction.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getEmploymentAction() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getEmploymentAction() + "']")).click();
            updateEmploymentAction.sendKeys(Keys.TAB);
            waitNormalTime();

            // Enter Action Reason value
            waitFor(ExpectedConditions.elementToBeClickable(updateEmploymentActionReason), 15);
            updateEmploymentActionReason.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getEmploymentActionReason() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getEmploymentActionReason() + "']")).click();
            updateEmploymentActionReason.sendKeys(Keys.TAB);
            waitShortTime();

            // Enter Destination Legal Employer value
            waitFor(ExpectedConditions.elementToBeClickable(updateEmploymentDestLegalEmployer), 15);
            updateEmploymentDestLegalEmployer.click();
            updateEmploymentDestLegalEmployer.sendKeys(data.getDestinationLegalEmployer());
            updateEmploymentDestLegalEmployer.sendKeys(Keys.TAB);

            // Select Create Primary Work Relationship Yes option
            waitFor(ExpectedConditions.elementToBeClickable(updateEmploymentCreatePrimaryWork), 15);
            updateEmploymentCreatePrimaryWork.click();

            // Click OK
            btnOK.click();

            // Click ok - Not working unable to click ok
            waitFor(ExpectedConditions.elementToBeClickable(btnOK1), 15);
            btnOK1.click();

            waitFor(ExpectedConditions.visibilityOf(globalTempAssignment), 15);
            assertThat(globalTempAssignment.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Error While user enter details in Update Employment Window:" + e.getMessage());
            Assert.fail();
        }
    }

    // User checks if Update Employment Window is Displayed
    public void checkGlobalAssignmentPageDisplayed() {
        try {
            waitShortTime();
            waitFor(ExpectedConditions.visibilityOf(globalTempAssignment), 15);
            reportWithScreenShot("Checking if Global Temporary Assignment: Identification page is Displayed");
            assertThat(globalTempAssignment.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Global Temporary Assignment: Identification page is not Displayed");
            Assert.fail();
        }
    }

    // User Navigate to Employment Information page
    public void navigateToEmpInfoPage() {
        try {

            waitFor(ExpectedConditions.visibilityOf(identificationTab), 15);
            clickNextButton(); // Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads

            waitFor(ExpectedConditions.visibilityOf(personInfoTab), 15);
            clickNextButton(); // Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads

            waitFor(ExpectedConditions.visibilityOf(employmentInfoPage), 15);
            assertThat(employmentInfoPage.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Error While user Navigate to Employment Information page:" + e.getMessage());
            Assert.fail();
        }
    }


    // User checks if Manage Work Relationship page is Displayed
    public void checkManageWorkRelationshipDisplayed() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(manageWorkRelationshipPage), 15);
            reportWithScreenShot("Checking if Manage Work Relationship page is Displayed");
            assertThat(manageWorkRelationshipPage.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Manage Work Relationship page  is not Displayed");
            Assert.fail();
        }
    }

    // User checks if Edit Manage Work Relationship page is Displayed
    public void checkEditManageWorkRelationshipDisplayed() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(editManageWorkRelationshipPage), 15);
            reportWithScreenShot("Checking if Edit Manage Work Relationship page is Displayed");
            assertThat(editManageWorkRelationshipPage.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Edit Manage Work Relationship page  is not Displayed");
            Assert.fail();
        }
    }

    //User select Ready to Verify value in i9 status
    public void selectI9Status() {
        try {
            // Select i9 status
            waitFor(ExpectedConditions.visibilityOf(i9Status), 5);
            i9Status.clear();
            i9Status.sendKeys(data.getI9Status());
            reportWithScreenShot("User select value from i9 status");
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Failed to select i9 status due to :" + e.getMessage());
            Assert.fail();
        }
    }

    //User clicks on Action and Edit button
    public void clickActionAndEdit() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(manageWorkRelactionsBtn), 15);
            assertThat(manageWorkRelactionsBtn.isDisplayed()).isTrue();
            manageWorkRelactionsBtn.click();
            reportWithScreenShot("User Clicks Actions button");


            waitFor(ExpectedConditions.elementToBeClickable(manageWorkRelEditBtn), 15);
            assertThat(manageWorkRelEditBtn.isDisplayed()).isTrue();
            manageWorkRelEditBtn.click();
            reportWithScreenShot("User Clicks Edit button");
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Failed to Click Actions and Edit button due to :" + e.getMessage());
            Assert.fail();
        }
    }


    /**
     * Check Manage Employment Screen displayed or not
     * Author: Koushik Kadimcherla
     */
    public void checkManageEmploymentScreenAvailable() {
        try {
            // reportWithScreenShot("Checking if  Manageme Employment screen is Displayed");
            waitFor(ExpectedConditions.visibilityOf(manageEmployment), 15);
            assertThat(manageEmployment.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if  Manage Employment screen is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Manage Employment screen not Displayed");
            Assert.fail();
        }
    }


    /**
     * User click on Edit and Correct button
     * Author: Koushik Kadimcherla
     */
    public void clickEditCorrect() {
        try {
            if (data.getScenario().equalsIgnoreCase("UPDATE_ELEMENT_ENTRIES")) {
                waitFor(ExpectedConditions.elementToBeClickable(manageElementEntriesEdit), 15);
                manageElementEntriesEdit.click();
            } else {
                waitFor(ExpectedConditions.elementToBeClickable(personMgmtEdit), 15);
                personMgmtEdit.click();
                waitFor(ExpectedConditions.elementToBeClickable(personClickCorrect), 15);
                personClickCorrect.click();
            }
            reportWithScreenShot("Selected Correct Option after clicking on Edit");
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on Edit and Correct button:" + e.getMessage());
            Assert.fail();
        }
    }


    /**
     * User checks if  Correct Employment Window is displayed
     * Author: Koushik Kadimcherla
     */
    public void checkCorrectEmployementWindowDisplayed() {
        try {
            reportWithScreenShot("Checking if Correct Employment Window is Displayed");
            waitFor(ExpectedConditions.visibilityOf(correctEmploymentTitle), 15);
            assertThat(correctEmploymentTitle.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Correct Employment Window is not Displayed");
            Assert.fail();
        }
    }

    /**
     * User checks if  Correct Name Window is displayed
     * Author: Koushik Kadimcherla
     */
    public void checkCorrectNameWindowDisplayed() {
        try {
            reportWithScreenShot("Checking if Correct Name Window is Displayed");
            waitFor(ExpectedConditions.visibilityOf(textCorrectName), 15);
            assertThat(textCorrectName.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Correct Name Window is not Displayed");
            Assert.fail();
        }
    }

    /**
     * Enter the mandatory fields of Correct Employment Screen
     * Author: Koushik Kadimcherla
     */
    public void enterCorrectEmploymentMandatoryFields() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(correctEmploymentAction), 15);
            assertThat(correctEmploymentAction.isDisplayed()).isTrue();
            correctEmploymentAction.click();
            waitFor(ExpectedConditions.visibilityOf(
                    driver.findElement(By.xpath("//li[text()='" + data.getCorrectEmploymentAction() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getCorrectEmploymentAction() + "']")).click();
            // Enter Action Reason value
            waitFor(ExpectedConditions.elementToBeClickable(correctEmploymentActionReason), 15);
            assertThat(correctEmploymentActionReason.isDisplayed()).isTrue();
            correctEmploymentActionReason.click();
            waitFor(ExpectedConditions.visibilityOf(
                    driver.findElement(By.xpath("//li[text()='" + data.getCorrectEmploymentActionReason() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getCorrectEmploymentActionReason() + "']")).click();
            waitFor(ExpectedConditions.elementToBeClickable(correctEmploymentOk), 15);
            assertThat(correctEmploymentOk.isDisplayed()).isTrue();
            reportWithScreenShot("Entered mandatory fields of Correct Employment Screen");
            correctEmploymentOk.click();
        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user entering Mandatory Fields of Correct Employment Screen :" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * Enter the mandatory fields of Correct Name Screen
     * Author: Koushik Kadimcherla
     */
    public void enterCorrectNameMandatoryFields() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(textCorrectName), 15);
            assertThat(textCorrectName.isDisplayed()).isTrue();
            textFirstName.clear();
            textFirstName.sendKeys(data.getFirstName());
            btnOK.click();
        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user entering Mandatory Fields of Correct Name Screen :" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * User checks if Projected End date Field is editable
     * Author: Koushik Kadimcherla
     */
    public void checkProjectedEndDateEditable() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(projectedEndDate_ManageEmployment), 15);
            assertThat(projectedEndDate_ManageEmployment.isEnabled()).isTrue();
            reportWithScreenShot("Projected End date is Editable ");
        } catch (Exception e) {
            reportWithScreenShot("Projected End date is not Editable ");
            Assert.fail();
        }
    }

    /**
     * User Enters the  Projected End date Field
     * Author: Koushik Kadimcherla
     */
    public void fillProjectedEndDate() {
        try {

            // waitFor(ExpectedConditions.elementToBeClickable(projectedEndDate_ManageEmployment),15);
            projectedEndDate_ManageEmployment.sendKeys(data.getProjectedEndDate());
            assertThat(projectedEndDate_ManageEmployment.isEnabled()).isTrue();
            reportWithScreenShot("User updated Projected End Date ");

        } catch (Exception e) {
            reportWithScreenShot("Error while updating Projected End Date");
            // assertThat.isDisplayed()).isTrue();
            Assert.fail();
        }
    }

    /**
     * user clicks on Review button
     * Author: Koushik Kadimcherla
     */
    public void clickReviewButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(reviewButton_ManageEmployment), 15);
            reviewButton_ManageEmployment.click();
            assertThat(reviewButton_ManageEmployment.isDisplayed()).isTrue();
            reportWithScreenShot("User clicked on Review  button");
        } catch (Exception e) {
            reportWithScreenShot("Error while user clicks Review button");
            Assert.fail();
        }
    }

    /**
     * User changes hire date
     * Author: Rakesh Ghosal
     */
    public void enterHireDate() {
        try {
            String newHireDate;
            scrollToElement(hireDate);
            waitFor(ExpectedConditions.elementToBeClickable(hireDate), 15);
            String existingHireDate = enterpriseHireDate.getText().trim();
            hireDate.clear();
            newHireDate = addDaysToDate(existingHireDate, 1, "mm/dd/yy");
            hireDate.sendKeys(newHireDate);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            reportWithScreenShot("Error while entering hire date");
            Assert.fail();
        }
    }


    /*
     * Raghav - Created Delete option for Element entries
     */
    public void clickDeleteButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(deleteButton), 15);
            deleteButton.click();
            waitFor(ExpectedConditions.elementToBeClickable(confirmButton), 15);
            confirmButton.click();
            waitNormalTime();
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on Delete button:" + e.getMessage());
            Assert.fail();
        }
    }

    /*
     * Raghav - Created select option for Element entries
     */
    public void selectElementEntry() {
        try {
            waitNormalTime();
            waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='" + data.getElementNameADP() + "']"))), 15);
            actions.moveToElement(driver.findElement(By.xpath("//a[text()='" + data.getElementNameADP() + "']"))).perform();
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Error While looking for Element entry: " + data.getElementNameADP() + " due to : " + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * Verify Manage Person page is available
     * Author: Koushik Kadimcherla
     */
    public void checkManagePersonAvailable() {
        try {
            waitShortTime();
            reportWithScreenShot("Checking if Manage Person page  is Displayed");
            waitFor(ExpectedConditions.visibilityOf(textNationalIdentifiers), 15);
            assertThat(textNationalIdentifiers.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Manage Person page  not Displayed");
            Assert.fail();
        }

    }

    // User click on Edit and Update button in Manage Person Page
    public void clickEditUpdateinManagePerson() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(personMgmtEdit), 15);
            personMgmtEdit.click();
            waitShortTime();

            waitFor(ExpectedConditions.elementToBeClickable(buttonManagePersonUpdate), 15);
            buttonManagePersonUpdate.click();
            waitShortTime();
            btnOK.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on Edit and update button:" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * Enter the mandatory fields of Update Name Screen
     * Author: Koushik Kadimcherla
     */
    public void enterUpdateNameMandatoryFields() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(textEffectiveStartDate), 15);
            assertThat(textEffectiveStartDate.isDisplayed()).isTrue();
            textEffectiveStartDate.clear();
            textEffectiveStartDate.sendKeys(getCurrentDate());
            btnOK.click();
            waitShortTime();
            waitFor(ExpectedConditions.elementToBeClickable(textFirstName), 15);
            textFirstName.clear();
            textFirstName.sendKeys(data.getFirstName());
            waitShortTime();
            btnOK2.click();
            reportWithScreenShot("User updated name");
            waitNormalTime();
        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user entering Mandatory Fields of Update Name Screen :" + e.getMessage());
            Assert.fail();
        }
    }
}
