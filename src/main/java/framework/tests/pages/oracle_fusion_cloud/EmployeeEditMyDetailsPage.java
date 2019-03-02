package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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


    @FindBy(xpath = "//img[@title='Tasks']")
    private WebElement taskIcon;

    @FindBy(xpath = "//li[@class='x1ui']/a[text()='Manage Salary']")
    private WebElement linkManagesalary;

    @FindBy(xpath = "//button[@title='Action']")
    private WebElement btnAction_ManageSalary;

    @FindBy(xpath = "//div[@class='x1l0']/a[contains(.,'Manage Salary')]")
    private WebElement manageSalaryTab;

    @FindBy(xpath = "//td[text()='Edit']")
    private WebElement linkActionEdit_ManageSalary;


    @FindBy(xpath = "//label[contains(@for,'UseComponents')]")
    private WebElement chkboxSalarycomponents_ManageSalary;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:1:AP1:itSA::content")
    private WebElement txtboxComponentAmt_ManageSalary;

    //    @FindBy(xpath = "//div[1][@class='xb7 p_AFSelected']")
    @FindBy(xpath = "//a[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:1:AP1:sdi1::disAcr']")
    private WebElement tabComponents_ManageSalary;


    @FindBy(xpath = "//img[contains(@id,'create')]")
    private WebElement addButton_ComponentsTab;


    @FindBy(xpath = "//h1[contains(.,'My Details')]")
    private WebElement empMyDetails;

    @FindBy(xpath = "//td[@class='xy7 xy6']//td[1]//span/span[1]")
    private WebElement txtAnnualSalary;


    @FindBy(xpath = "//span[@class='x1z p_AFCustom']//input[@role='combobox']")
    private WebElement selectComponentDropdown;

    @FindBy(xpath = "//li[@class='x1pk'][text()='Promotion']")
    private WebElement valPromotion;

    @FindBy(xpath = "//a[@accesskey='u']")
    private WebElement btnContinue_ManageSalary;

    @FindBy(xpath = "//button[@accesskey='o']")
    private WebElement btnDone;

    @FindBy(xpath = "//a[@accesskey='m']")
    private WebElement btnSubmit_ManageSalary;

    @FindBy(xpath = "//button[@accesskey='Y']")
    private WebElement popButtonYes;

    @FindBy(xpath = "//button[@accesskey='K']")
    private WebElement confirmBtnOK;

    @FindBy(xpath = "//a[@accesskey='B']")
    private WebElement btnBack_ManageSalary;

    @FindBy(xpath = "//img[@title='New']")
    private WebElement btnComponentsNew_ManageSalary;

    @FindBy(xpath = "//td[2]/span[@class='x2qb']//input[@type='text']")
    private WebElement txtFieldAmount_Components;

    @FindBy(id = "_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:1:AP1:AT1:_ATp:table1:0:sc1::content")
    private WebElement drpdownComponent_ManageSalary;

    @FindBy(xpath = "//button[text()='OK']")
    private WebElement popupOK_ManageSalary;

    @FindBy(xpath = "//label[text()='Action Reason']//following::input[1]")
    private WebElement txtboxActionReason_ManageSalary;

    @FindBy(xpath = "//span[text()='Edit']")
    private WebElement btnEdit_ManageEmployment;

    @FindBy(xpath = "//a[@title='Search: Salary Basis']")
    private WebElement dropdownSalaryBasis_ManageSalary;

    @FindBy(xpath = "//button[@id='_FOd1::msgDlg::cancel']")
    private WebElement btnOK_WarningPopup;

    @FindBy(xpath = "//tr[3]//td//span[@class='x2qb']")
    private WebElement usHourlyWages40;

    @FindBy(xpath = "//tr[7]//td[2][@class='xy7 xy6']/span[1]")
    private WebElement txtAdjustAmount;

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
            Assert.fail();
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
            waitShortTime();

        } catch (Exception e) {
            reportWithScreenShot(
                    "Error While user clicks on Continue button in contact page due to:" + e.getMessage());
            Assert.fail();
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

    // User click  Task icon right side
    public void taskIconClick() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(taskIcon), 15);
            assertThat(taskIcon.isDisplayed()).isTrue();
            taskIcon.click();

            reportWithScreenShot("Task icon on right is open");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Review Tab due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // User click on Manage Salary under Task icon
    public void manageSalaryClick() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(linkManagesalary), 15);
            assertThat(linkManagesalary.isDisplayed()).isTrue();
            linkManagesalary.click();
            waitFor(ExpectedConditions.visibilityOf(btnAction_ManageSalary), 60);
            assertThat(manageSalaryTab.isDisplayed()).isTrue();
            reportWithScreenShot("Salary page of a person searched");
        } catch (Exception e) {
            reportWithScreenShot("Error While checking values in Review Tab due to:" + e.getMessage());
            Assert.fail();
        }
    }


    // User click on Action and Edit button
    public void clickActionEdit() {
        try {
            btnAction_ManageSalary.click();
            waitFor(ExpectedConditions.elementToBeClickable(linkActionEdit_ManageSalary), 60);
            linkActionEdit_ManageSalary.click();
            waitFor(ExpectedConditions.elementToBeClickable(chkboxSalarycomponents_ManageSalary), 60);
            assertThat(chkboxSalarycomponents_ManageSalary.isDisplayed()).isTrue();
            reportWithScreenShot("User click on Action and Edit button");
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on Edit and update button:" + e.getMessage());
            Assert.fail();
        }
    }

    // User enters new Salary Amount under Current Salary section
    public void enterSalaryAmount() {
        try {
            if (driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected()) {
                Thread.sleep(2000);
                chkboxSalarycomponents_ManageSalary.click();
                setSalaryAmount();
                Thread.sleep(2000);
            } else {
                setSalaryAmount();
            }
            Thread.sleep(2000);
        } catch (Exception e) {
            reportWithScreenShot("Error while enter new salary amount :" + e.getMessage());
            Assert.fail();
        }
    }


    // User enter amount in Salary field
    public void setSalaryAmount() throws InterruptedException {
        Thread.sleep(2000);
        waitFor(ExpectedConditions.visibilityOf(txtboxComponentAmt_ManageSalary), 60);
        txtboxComponentAmt_ManageSalary.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        txtboxComponentAmt_ManageSalary.clear();
        txtboxComponentAmt_ManageSalary.sendKeys(data.getSalaryAmount());
        txtboxComponentAmt_ManageSalary.sendKeys(Keys.TAB);
        Thread.sleep(4000);
        Assertions.assertThat(txtAnnualSalary.getText().trim().equals(data.getSalaryAmount().trim())).isTrue();
        reportWithScreenShot("user entered new salary amount in Salary amount field");
    }

    public void checkboxUseSalary() {
        try {
            chkboxSalarycomponents_ManageSalary.click();
            waitShortTime();
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabComponents_ManageSalary);
            Thread.sleep(500);
            assertThat(tabComponents_ManageSalary.isDisplayed());
            reportWithScreenShot("Selected checkbox Use salary component");
        } catch (Exception e) {
            reportWithScreenShot("Error while selecting checkbox Use salary component :" + e.getMessage());
            Assert.fail();
        }
    }


    // user validating the Component tab is created on select Use Component is checked
    public void tabComponentsManageSalary() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabComponents_ManageSalary);
            assertThat(tabComponents_ManageSalary.isDisplayed());
            reportWithScreenShot("Components tab is displayed on selecting Use salary component checkbox");
        } catch (Exception e) {
            reportWithScreenShot("Error in displaying component tab:" + e.getMessage());
            Assert.fail();
        }
    }

    // user clicking on Add(+) button in component tab
    public void clickAddComponent() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabComponents_ManageSalary);
            tabComponents_ManageSalary.click();
            waitShortTime();
            addButton_ComponentsTab.click();
            waitFor(ExpectedConditions.visibilityOf(selectComponentDropdown), 15);
            assertThat(selectComponentDropdown.isDisplayed());
            reportWithScreenShot("User clicked on Add(+) button in component tab");
        } catch (Exception e) {
            reportWithScreenShot("Error in clicking Add(+) button in component tab:" + e.getMessage());
            Assert.fail();
        }
    }

    // user selecting component type under component tab in manage salary page
    public void selectComponentTypeManageSalary(String linkName) {

        try {

            selectComponentDropdown.click();
            waitFor(ExpectedConditions.elementToBeClickable(valPromotion), 15);
            assertThat(valPromotion.isDisplayed()).isTrue();
            valPromotion.click();
            reportWithScreenShot(linkName + " is selected from dropdown:");
        } catch (Exception e) {
            reportWithScreenShot("Error While selecting " + linkName + " from dropdown:" + e.getMessage());
            Assert.fail();
        }
    }

    // user clicking on continue button in manage salary page
    public void clickButtonContinueInManageSalary() {

        try {
            btnContinue_ManageSalary.click();
            waitForLoad();
            waitFor(ExpectedConditions.visibilityOf(btnBack_ManageSalary), 30);
            assertThat(btnBack_ManageSalary.isDisplayed()).isTrue();
            reportWithScreenShot(" Adjust amount is entered");
        } catch (Exception e) {
            reportWithScreenShot("Error While entering adjust amountin components tab :" + e.getMessage());
            Assert.fail();
        }

    }


    //user clicks submit button on Manage salary review page

    public void clickSubmitButtonInReviewPage() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(btnSubmit_ManageSalary), 15);
            btnSubmit_ManageSalary.click();
            waitFor(ExpectedConditions.elementToBeClickable(popButtonYes), 15);
            assertThat(popButtonYes.isDisplayed()).isTrue();
            reportWithScreenShot(" Submit button in Manage salary review page is clicked");
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking submit button:" + e.getMessage());
            Assert.fail();
        }
    }

    //user clicks Yes button on Manage salary review page

    public void clickYesOnPopup() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(popButtonYes), 15);
            popButtonYes.click();
            waitFor(ExpectedConditions.elementToBeClickable(confirmBtnOK), 15);
            assertThat(confirmBtnOK.isDisplayed()).isTrue();
            reportWithScreenShot(" Ok button in Manage salary review page is clicked");
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking ok button:" + e.getMessage());
            Assert.fail();
        }
    }


    //user clicks Yes button on Manage salary review page
    public void clickOKOnPopup() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(confirmBtnOK), 15);
            confirmBtnOK.click();
            waitFor(ExpectedConditions.elementToBeClickable(btnDone), 15);
            assertThat(btnDone.isDisplayed()).isTrue();
            reportWithScreenShot(" Ok button in Manage salary review page is clicked");
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking ok button:" + e.getMessage());
            Assert.fail();
        }
    }

    // user selecting component type under component tab in manage salary page
    public void selectSalaryBasis() {

        try {

            dropdownSalaryBasis_ManageSalary.click();
            waitFor(ExpectedConditions.elementToBeClickable(usHourlyWages40), 15);
            assertThat(usHourlyWages40.isDisplayed()).isTrue();
            usHourlyWages40.click();
            reportWithScreenShot( " is selected from dropdown:");
        } catch (Exception e) {
            reportWithScreenShot("Error While selecting  from dropdown:" + e.getMessage());
            Assert.fail();
        }
    }

    //user clicks Ok button on Warning modal - Manage salary review page
    public void clickBtnOK_WarningModal() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(btnOK_WarningPopup), 15);
            btnOK_WarningPopup.click();
            waitFor(ExpectedConditions.elementToBeClickable(btnContinue_ManageSalary), 15);
            assertThat(btnContinue_ManageSalary.isDisplayed()).isTrue();
            reportWithScreenShot(" User closes the warning modal by clicking OK button");
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking ok button on warning modal:" + e.getMessage());
            Assert.fail();
        }
    }

    // user entering amount in Amount field under components tab
    public void enterAmountInComponent() {

        try {

            txtFieldAmount_Components.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            waitShortTime();
            txtFieldAmount_Components.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END));
            waitShortTime();
            txtFieldAmount_Components.sendKeys(data.getActualAmount());
            txtFieldAmount_Components.sendKeys(Keys.TAB);
            Thread.sleep(2000);
            assertThat(data.getActualAmount().trim().equals(txtAdjustAmount.getText())).isTrue();
            reportWithScreenShot(" Adjust amount is entered");
        } catch (Exception e) {
            reportWithScreenShot("Error While entering adjust amountin components tab :" + e.getMessage());
            Assert.fail();
        }

    }


}
