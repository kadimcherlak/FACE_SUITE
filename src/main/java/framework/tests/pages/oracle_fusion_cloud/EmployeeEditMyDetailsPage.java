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

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EmployeeEditMyDetailsPage extends BasePage<EmployeeEditMyDetailsPage> {

    Context context;
    Data data;
    Actions actions;

    // Edit My Details Page Elements

    @FindBy(xpath = "//a[@title='Edit']")
    private WebElement myDetailsEdit;

    @FindBy(xpath = "(//a[@title='Add'])[2]")
    private WebElement addressAddBtn;

    @FindBy(xpath = "//a[@title='Add']")
    private WebElement contactsAddBtn;

    @FindBy(xpath = "(//*[@class='x2h'])[4]")
    private WebElement altWorkLocationAddType;

    @FindBy(xpath = "(//input[@class='x109'])[2]")
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

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user clicks on Edit button due to:" + e.getMessage());
            Assert.fail();
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
            Assert.fail();
        }
    }

    // User enters Alternate work location Address details
    public void fillAlternateWorklocationAddress() {
        try {
            // Click Edit button in My details Page
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

            reportWithScreenShot("User enter Alternate work location Address details");

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user enter Alternate work location Address details due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // User click on Contacts Icon
    public void clickContactsIcon() {
        try {

            waitFor(ExpectedConditions.elementToBeClickable(contactsIcon), 15);
            contactsIcon.click();

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

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user clicks on Continue button in contact page due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // User select value from Relationship
    public void selectRelationship() {
        try {
            // Click Edit button in My details Page
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

        } catch (Exception e) {
            reportWithScreenShot("Error While user click on save and close button:" + e.getMessage());
            Assert.fail();
        }
    }
    
    // User click on More Information below My Details Page
    
    /**
     * This method will click on the more information icon under my details page
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


}
