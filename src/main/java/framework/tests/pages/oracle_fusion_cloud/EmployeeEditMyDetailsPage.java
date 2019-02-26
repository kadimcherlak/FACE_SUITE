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

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EmployeeEditMyDetailsPage extends BasePage<EmployeeEditMyDetailsPage> {

    Context context;
    Data data;
    Actions actions;

    // Edit My Details Page Elements

    @FindBy(xpath = "//button[contains(.,'Edit')]")
    private WebElement myDetailsEdit;

    @FindBy(xpath = "(//a[@title='Add'])[2]")
    private WebElement addressAddBtn;

    @FindBy(xpath = "//a[@title='Add']")
    private WebElement contactsAddBtn;

    @FindBy(xpath = "(//*[@class='x2h'])[3]")
    private WebElement altWorkLocationAddType;

    @FindBy(xpath = "(//input[@class='x109'])[1]")
    private WebElement altWorkLocationcountry;

    @FindBy(xpath = "//span[text()='United States']")
    private WebElement selectCountryFromPopUp;

    @FindBy(xpath = "(//label[text()='Address Line 1']/following::input[1])[1]")
    private WebElement altWorkLocationaddressLine1;

    @FindBy(xpath = "(//label[text()='ZIP Code']/following::input[1])[1]")
    private WebElement altWorkLocationzipCode;

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

    @FindBy(xpath = "//h1[contains(.,'My Details')]")
    private WebElement empMyDetails;

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
        }
    }

    // Click on Address Add button
    public void clickAddressAdd() {
        try {
            // Click Edit button in My details Page
            waitFor(ExpectedConditions.visibilityOf(addressAddBtn), 15);
            addressAddBtn.click();
            reportWithScreenShot("User clicks on Address Add Button");

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user clicks on Address Add button due to:" + e.getMessage());
        }
    }

    // User enters Alternate work location Address details
    public void fillAlternateWorklocationAddress() {
        try {
            // Click Edit button in My details Page
            waitShortTime();
            altWorkLocationAddType.click();
            waitFor(ExpectedConditions
                    .visibilityOf(driver.findElement(By.xpath("//li[text()='" + data.getAltWorkLocationaddressType() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getAltWorkLocationaddressType() + "']")).click();
            altWorkLocationAddType.sendKeys(Keys.TAB);

            // Enter Country
            waitFor(ExpectedConditions.visibilityOf(altWorkLocationcountry), 15);
            altWorkLocationcountry.clear();
            altWorkLocationcountry.sendKeys(data.getAltWorkLocationcountry());
            altWorkLocationcountry.sendKeys(Keys.TAB);
            waitShortTime();

            // If Country Pop up screen is present
            if (selectCountryFromPopUp.isDisplayed()) {
                //selectCountryFromPopUp.click();
                clickOkButton();
                waitShortTime();
            }

            waitFor(ExpectedConditions.elementToBeClickable(altWorkLocationaddressLine1), 5);
            altWorkLocationaddressLine1.sendKeys(data.getAltWorkLocationaddressLine1());
            waitFor(ExpectedConditions.elementToBeClickable(altWorkLocationzipCode), 5);
            altWorkLocationzipCode.sendKeys(data.getAltWorkLocationzipCode());
            altWorkLocationaddressLine1.click();
            reportWithScreenShot("User enter Alternate work location Address details");
            assertThat(saveAndCloseBtn.isDisplayed()).isTrue();

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user enter Alternate work location Address details due to:" + e.getMessage());
            assertThat(saveAndCloseBtn.isDisplayed()).isTrue();
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
            assertThat(addContactDialog.isDisplayed()).isTrue();
        }
    }

    // User click on Select existing person radio button
    public void clickSelectExistPerson() {
        try {

            waitFor(ExpectedConditions.elementToBeClickable(selectExistPerson), 15);
            selectExistPerson.click();

        } catch (Exception e) {
            reportWithScreenShot("Error While user click on select Existing Person radio button:" + e.getMessage());
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
        }
    }

    public void enterEmergencyContactName() {
        try {

            // Enter emergency contact Name
            waitFor(ExpectedConditions.elementToBeClickable(emergencyContactName), 15);
            emergencyContactName.sendKeys(data.getContactsEmergencyContactName());

        } catch (Exception e) {
            reportWithScreenShot("Error While user enter Emergency contact name:" + e.getMessage());
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
        }
    }

    // User click on save and close button
    public void clickSaveAndClose() {
        try {

            waitFor(ExpectedConditions.elementToBeClickable(saveAndCloseBtn), 15);
            saveAndCloseBtn.click();

        } catch (Exception e) {
            reportWithScreenShot("Error While user click on save and close button:" + e.getMessage());
        }
    }


}
