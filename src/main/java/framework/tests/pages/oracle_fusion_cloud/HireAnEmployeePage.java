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

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:NewPe1:0:pt_r1:0:df1_PersonDFFIteratorpearsonEmailRequired__FLEX_EMPTY::content")
    private WebElement pearsonEmailRequired;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:pt1:SP1:tt1:next")
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
            actions.moveToElement(hireDate).sendKeys(getCurrentDate()).sendKeys(Keys.ENTER).perform();

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

            // Select Pearson Email Required
            waitFor(ExpectedConditions.elementToBeClickable(pearsonEmailRequired), 5000);
            pearsonEmailRequired.click();
            waitFor(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//li[text()='" + data.getPearsonEmailRequired() + "']"))), 5000);
            driver.findElement(By.xpath("//li[text()='" + data.getPearsonEmailRequired() + "']")).click();

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
            zipCode.sendKeys(Keys.TAB);

            // Enter City
            waitFor(ExpectedConditions.elementToBeClickable(city), 5000);
            city.sendKeys(data.getCity());
            city.sendKeys(Keys.TAB);

            // Enter County
            waitFor(ExpectedConditions.elementToBeClickable(county), 5000);
            county.sendKeys(data.getCounty());
            county.sendKeys(Keys.TAB);

            // Enter State
            waitFor(ExpectedConditions.elementToBeClickable(state), 5000);
            state.sendKeys(data.getState());
            state.sendKeys(Keys.TAB);

            // Enter Marital Status
            waitFor(ExpectedConditions.elementToBeClickable(maritalStatus), 5000);
            maritalStatus.sendKeys(data.getMaritalStatus());
            maritalStatus.sendKeys(Keys.TAB);

            // Enter Veteran Self-Identification Status
            waitFor(ExpectedConditions.elementToBeClickable(veteranSelfIdentificationStatus), 5000);
            veteranSelfIdentificationStatus.sendKeys(data.getVeteranSelfIdentificationStatus());
            veteranSelfIdentificationStatus.sendKeys(Keys.TAB);

            clickNextButton(); //Next Button to go to next page
            waitUntilPageLoad(); // wait until next tab loads
        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value into Person Information  Tab due to:" + e.getMessage());
        }
    }

    // Enter Value into Employement Information tab
    public void fillEmploymentInformationTab() {
        try {

        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value into Employement Information Tab due to:" + e.getMessage());
        }
    }

    // Enter Value into Compensation and Other Information tab
    public void fillCompensationAndOtherInformationTab() {
        try {

        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value into Compensation and Other Information Tab due to:" + e.getMessage());
        }
    }

    // Check Review tab with Employee information
    public void checkReviewTabDisplayedWithInformation() {
        try {

        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Reveiw Tab due to:" + e.getMessage());
        }
    }

    // Click on Submit Button to submit new Hire details
    public void clickSubmitButton() {
        try {

        } catch (Exception e) {
            reportWithScreenShot("Error While Submitting new Hire information due to:" + e.getMessage());
        }
    }

    // Click on Ok Button if Warning is displayed
    public void clickOk() {
        try {

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

        } catch (Exception e) {
            reportWithScreenShot("Submission not successful due to:" + e.getMessage());
        }
    }
}

