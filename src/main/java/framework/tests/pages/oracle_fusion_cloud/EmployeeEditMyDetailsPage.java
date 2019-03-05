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

    @FindBy(xpath = "(//*[@class='x2h'])[4]")
    private WebElement altWorkLocationAddType;

    @FindBy(xpath = "(//input[@class='x109'])[2]")
    private WebElement altWorkLocationCountry;

    @FindBy(xpath = "//span[text()='United States']")
    private WebElement selectCountryFromPopUp;

    @FindBy(xpath = "(//label[text()='Address Line 1']/following::input[1])[1]")
    private WebElement altWorkLocationAddressLine1;

    @FindBy(xpath = "(//label[text()='ZIP Code']/following::input[1])[1]")
    private WebElement altWorkLocationZipCode;

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

    @FindBy(xpath = "//a[text()='Manage Salary']")
    private WebElement linkManagesalary;

    @FindBy(xpath = "//button[@title='Action']")
    private WebElement btnAction_ManageSalary;

    @FindBy(xpath = "//td[@class='x1gk']")
    private WebElement manageSalaryTab_personInfoSection;

    @FindBy(xpath = "//div[@class='x1gs']")
    private WebElement manageSalaryTab_currentSalarySection;

    @FindBy(xpath = "//td[text()='Edit']")
    private WebElement linkActionEdit_ManageSalary;


    @FindBy(xpath = "//label[contains(@for,'UseComponents')]")
    private WebElement chkboxSalarycomponents_ManageSalary;

    @FindBy(xpath = "//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt3:1:AP1:itSA::content']")
    private WebElement txtboxComponentAmt_ManageSalary;

    //    @FindBy(xpath = "//div[1][@class='xb7 p_AFSelected']")
    @FindBy(xpath = "//a[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:1:AP1:sdi1::disAcr']")
    private WebElement tabComponents_ManageSalary;


    @FindBy(xpath = "//img[contains(@id,'create')]")
    private WebElement addButton_ComponentsTab;


    @FindBy(xpath = "//h1[contains(.,'My Details')]")
    private WebElement empMyDetails;

    @FindBy(xpath = "//span[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt3:1:AP1:inputText1::content']")
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

    @FindBy(xpath = "//span[text()='US Hourly Wages']")
    private WebElement usHourlyWages;

    @FindBy(xpath = "//tr[7]//td[2][@class='xy7 xy6']/span[1]")
    private WebElement txtAdjustAmount;

    @FindBy(xpath = "//a[@title='Personal Payment Methods']")
    private WebElement personalPaymentMethods;

    @FindBy(xpath = "(//a[text()='Manage Personal Payment Methods'])[1]")
    private WebElement ManagePersonalPaymentMethods;

    @FindBy(xpath = "//th/descendant::span[contains(text(),'Processing Order')]")
    private WebElement createPersonalPaymentMethodIndicator;

    @FindBy(xpath = "//img[@title='Create']")
    private WebElement create_Btn;

    @FindBy(xpath = "//h1[contains(text(),'Create Personal Payment Method')]")
    private WebElement personalPaymentMethodPageIndicator;

    @FindBy(xpath = "//label[text()='Name']/following::input[1]")
    private WebElement bankName;

    @FindBy(xpath = "//label[text()='Organization Payment Method']//following::input[1]")
    private WebElement orgPaymentMethod;

    @FindBy(xpath = "//label[text()='Percentage']//following::input[1]")
    private WebElement percentage;

    @FindBy(xpath = "//div[contains(text(),'Create Bank Account')]")
    private WebElement createBankAccountPageIndicator;

    @FindBy(xpath = "//label[text()='Account Number']//following::input[1]")
    private WebElement AccountNumber;

    @FindBy(xpath = "//label[text()='Account Type']//following::input[1]")
    private WebElement AccountType;

    @FindBy(xpath = "//label[text()='Account Holder']//following::input[1]")
    private WebElement AccountHolder;

    @FindBy(xpath = "//label[text()='Routing Number']//following::input[1]")
    private WebElement RoutingNumber;

    @FindBy(xpath = "//button[text()='Save and Close']")
    private WebElement saveclose_btn;

    @FindBy(xpath = "(//a[@role='button'])[2]")
    private WebElement submitButton;

    @FindBy(xpath = "//button[contains(.,'Edit')]")
    private WebElement editButton;

    @FindBy(xpath = "//h1[contains(text(),'Edit My Details: Contact Information')]")
    private WebElement contactInformationPageIndicator;

    @FindBy(xpath = "//div[contains(text(),'Contact Information')]")
    private WebElement contactInformationLink;

    @FindBy(xpath = "//img[@alt='Edit']")
    private WebElement EditBtn;

    @FindBy(xpath = "//label[text()='Effective Start Date']/parent::td/descendant::span[@title='Required']")
    private WebElement effectiveStartDateRequiredValidation;

    @FindBy(xpath = "//label[text()='Address Line 1']/parent::td/descendant::span[@title='Required']")
    private WebElement addLine1RequiredValidation;

    @FindBy(xpath = "//label[text()='ZIP Code']/parent::td/descendant::span[@title='Required']")
    private WebElement zipCodeRequiredValidation;

    @FindBy(xpath = "//label[text()='City']/parent::td/descendant::span[@title='Required']")
    private WebElement cityRequiredValidation;

    @FindBy(xpath = "//label[text()='State']/parent::td/descendant::span[@title='Required']")
    private WebElement stateRequiredValidation;

    @FindBy(xpath = "//td/descendant::label[text()='Effective Start Date']/preceding::tr[1]/descendant::label[contains(text(),'Type')]")
    private WebElement addressType;

    @FindBy(xpath = "//label[text()='Country']")
    private WebElement country;

    @FindBy(xpath = "//label[text()='Address Line 2']")
    private WebElement addressLine2;

    @FindBy(xpath = "//a[@accesskey='C']")
    private WebElement cancelBtn;

    @FindBy(xpath = "//button[text()='Yes']")
    private WebElement yesBtn;


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
            addressAddBtn.sendKeys(Keys.TAB);
            altWorkLocationAddType.click();
            waitFor(ExpectedConditions
                    .visibilityOf(altWorkLocationAddType), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getAltWorkLocationAddressType() + "']")).click();
            altWorkLocationAddType.sendKeys(Keys.TAB);

            // Enter Country
            waitFor(ExpectedConditions.visibilityOf(altWorkLocationCountry), 15);
            altWorkLocationCountry.clear();
            altWorkLocationCountry.sendKeys(data.getAltWorkLocationCountry());
            waitNormalTime();
            altWorkLocationCountry.sendKeys(Keys.ENTER);
            altWorkLocationCountry.sendKeys(Keys.TAB);

            waitFor(ExpectedConditions.elementToBeClickable(altWorkLocationAddressLine1), 5);
            altWorkLocationAddressLine1.sendKeys(data.getAltWorkLocationAddressLine1());
            waitFor(ExpectedConditions.elementToBeClickable(altWorkLocationZipCode), 5);
            altWorkLocationZipCode.sendKeys(data.getAltWorkLocationZipCode());
            waitShortTime();
            altWorkLocationAddressLine1.click();
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
            reportWithScreenShot("User click on save and close button:");

        } catch (Exception e) {
            reportWithScreenShot("Error While user click on save and close button:" + e.getMessage());
            Assert.fail();
        }
    }

    // User click on More Information below My Details Page

    /**
     * This method will click on the more information icon under my details page
     *
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
     *
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
     *
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
     *
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
            waitFor(ExpectedConditions.elementToBeClickable(taskIcon), 30);
            mouseHover(taskIcon);
            taskIcon.click();
            waitFor(ExpectedConditions.elementToBeClickable(linkManagesalary), 30);
            assertThat(linkManagesalary.isDisplayed()).isTrue();
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
            assertThat(manageSalaryTab_personInfoSection.isDisplayed()).isTrue();
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
            waitFor(ExpectedConditions.elementToBeClickable(manageSalaryTab_currentSalarySection), 60);
            assertThat(manageSalaryTab_currentSalarySection.isDisplayed()).isTrue();
            reportWithScreenShot("User click on Action and Edit button");
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on Edit and update button:" + e.getMessage());
            Assert.fail();
        }
    }

    // User enters new Salary Amount under Current Salary section
    public void enterSalaryAmount() {
        try {
//                if (driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected()) {
//                    Thread.sleep(2000);
//                    chkboxSalarycomponents_ManageSalary.click();
//                    setSalaryAmount();
//                    Thread.sleep(2000);
//                } else {
                    setSalaryAmount();
//                }
            Thread.sleep(2000);
        } catch (Exception e) {
            reportWithScreenShot("Error while enter new salary amount :" + e.getMessage());
            Assert.fail();
        }
    }


    // User enter amount in Salary field
    public void setSalaryAmount() throws InterruptedException {
        Thread.sleep(2000);
        scrollToElement(txtboxComponentAmt_ManageSalary);
        waitFor(ExpectedConditions.visibilityOf(txtboxComponentAmt_ManageSalary), 60);
        txtboxComponentAmt_ManageSalary.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        txtboxComponentAmt_ManageSalary.clear();
        txtboxComponentAmt_ManageSalary.sendKeys(data.getSalaryAmount());
        txtboxComponentAmt_ManageSalary.sendKeys(Keys.TAB);
        Thread.sleep(4000);
        String actAmt = txtAnnualSalary.getText().replace(",","");
        System.out.println("act amt - "+actAmt);
        System.out.println("exp amt - "+data.getSalaryAmount().trim());
//        Assertions.assertThat(txtAnnualSalary.getText().trim().equals(data.getSalaryAmount().trim())).isTrue();
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
            waitFor(ExpectedConditions.elementToBeClickable(usHourlyWages), 15);
            assertThat(usHourlyWages.isDisplayed()).isTrue();
            usHourlyWages.click();
            reportWithScreenShot(" is selected from dropdown:");
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

    /**
     * This method will click on manage personal payment method
     *
     * @author Rakesh Ghosal
     */
    public void clcikOnManagePersonalPaymentMethod() {
        try {

            waitFor(ExpectedConditions.elementToBeClickable(personalPaymentMethods), 15);
            personalPaymentMethods.click();
            Thread.sleep(1000);
            waitFor(ExpectedConditions.elementToBeClickable(ManagePersonalPaymentMethods), 15);
            ManagePersonalPaymentMethods.click();

        } catch (Exception e) {

            reportWithScreenShot("Error while click on manage personal payment method:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * This method validate if we and landed on create personal payment method
     * page
     *
     * @author Rakesh Ghosal
     */
    public void validatePersonalPaymentMethodPage() {
        try {

            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(createPersonalPaymentMethodIndicator), 15);
            assertThat(createPersonalPaymentMethodIndicator.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Personal Payment Method Page is displayed");

        } catch (Exception e) {

            reportWithScreenShot("Create Personal Payment Method page is not displayed:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * This method click on create new payment method button
     *
     * @author Rakesh Ghosal
     */
    public void clickCreateNewPaymentMethodLink() {
        try {

            waitFor(ExpectedConditions.elementToBeClickable(create_Btn), 15);
            create_Btn.click();

        } catch (Exception e) {

            reportWithScreenShot("Create new payment method operation is not done:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * This method validate if we and landed on create personal payment method
     * page
     *
     * @author Rakesh Ghosal
     */
    public void validateCreatePersonalPaymentMethodPage() {
        try {

            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(personalPaymentMethodPageIndicator), 15);
            assertThat(personalPaymentMethodPageIndicator.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Create Personal Payment Method page is displayed");

        } catch (Exception e) {

            reportWithScreenShot("Create Personal Payment Method page is not displayed:" + e.getMessage());
            Assert.fail();
        }

    }


    /**
     * This method will enter value in the fileds of create personal payment
     * page
     *
     * @author Rakesh Ghosal
     */
    public void enterValuesInCreatePersonalPaymentPage() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(bankName), 15);
            bankName.clear();
            bankName.sendKeys(data.getBankName());
            try {
                if (percentage.isDisplayed()) {
                    waitFor(ExpectedConditions.elementToBeClickable(percentage), 15);
                    percentage.clear();
                    percentage.sendKeys(data.getPercentage());
                }
            } catch (Exception e) {
                System.out.println("Percentage is not displayed,skipping");
            }
            selectInputDropdownValue(orgPaymentMethod, data.getOrganizationPaymentMethod());
            reportWithScreenShot("Entering values in create personal payment page");
        } catch (Exception e) {
            reportWithScreenShot("Error while entering bank name,percentage and organization payment method:" + e.getMessage());
        }

    }

    /**
     * This method will validate if we are landed on bank account create page
     *
     * @author Rakesh Ghosal
     */
    public void validateBankAccountCreatePage() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(createBankAccountPageIndicator), 15);
            assertThat(createBankAccountPageIndicator.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Bank Account create page is displayed");
        } catch (Exception e) {
            reportWithScreenShot("Create Bank account page indicator is not displayed:" + e.getMessage());
        }
    }

    /**
     * This method will enter value in the fileds of bank account create page
     * page
     *
     * @author Rakesh Ghosal
     */
    public void enterValuesInBankAccountCreatePage() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(AccountNumber), 15);
            AccountNumber.clear();
            AccountNumber.sendKeys(data.getAccountNumber());
            selectInputDropdownValue(AccountType, data.getAccountType());
            waitFor(ExpectedConditions.elementToBeClickable(AccountHolder), 15);
            AccountHolder.clear();
            AccountHolder.sendKeys(data.getAccountHolder());
            waitFor(ExpectedConditions.elementToBeClickable(RoutingNumber), 15);
            RoutingNumber.clear();
            RoutingNumber.sendKeys(data.getRoutingNumber());
            waitFor(ExpectedConditions.elementToBeClickable(saveclose_btn), 15);
            reportWithScreenShot("Entering values in bank account create page");
            saveclose_btn.click();
            waitFor(ExpectedConditions.invisibilityOf(saveclose_btn));
            Thread.sleep(1000);

        } catch (Exception e) {
            reportWithScreenShot("Error while entering bank details:" + e.getMessage());
        }

    }

    /**
     * This method will click on submit button after Bank Account creation is done
     *
     * @author Rakesh Ghosal
     */
    public void clickSubmitButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(submitButton), 15);
            submitButton.click();
            reportWithScreenShot("Clicking submit button");

        } catch (Exception e) {
            reportWithScreenShot("Submit button is not clicked properly:" + e.getMessage());
        }

    }

    /**
     * This method will click on edit button at the upper right corner in my details page
     *
     * @author Rakesh Ghosal
     */
    public void clickEditButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(editButton), 15);
            editButton.click();
            reportWithScreenShot("Clicking edit button");

        } catch (Exception e) {
            reportWithScreenShot("Edit button is not clicked properly:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * This method will validate if we are landed on contact information page
     *
     * @author Rakesh Ghosal
     */
    public void validateContactInformationPage() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(contactInformationPageIndicator), 15);
            assertThat(contactInformationPageIndicator.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if we are landed on contact information page");
        } catch (Exception e) {
            reportWithScreenShot("Contact information page is not displayed:" + e.getMessage());
        }
    }


    /**
     * This method will click on contact information link in contact information page
     *
     * @author Rakesh Ghosal
     */
    public void clickContactInformationLink() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(contactInformationLink), 15);
            contactInformationLink.click();
            reportWithScreenShot("Clicking contact information link");

        } catch (Exception e) {
            reportWithScreenShot("Contact information link is not clicked properly:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * This method will click on edit address button
     *
     * @author Rakesh Ghosal
     */
    public void clickEditAddressLink() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(EditBtn), 15);
            EditBtn.click();
            reportWithScreenShot("Clicking edit address link in Edit my details contact information page");

        } catch (Exception e) {
            reportWithScreenShot("Edit address link is not clicked in Edit my details contact information page:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * Verify that the address format
     *
     * @author Rakesh Ghosal
     */
    public void verifyAddressFormat() {
        try {
            validateElementIsDisplayed(effectiveStartDateRequiredValidation);
            validateElementIsDisplayed(addLine1RequiredValidation);
            validateElementIsDisplayed(zipCodeRequiredValidation);
            validateElementIsDisplayed(cityRequiredValidation);
            validateElementIsDisplayed(stateRequiredValidation);
            validateElementIsDisplayed(addressType);
            validateElementIsDisplayed(country);
            validateElementIsDisplayed(addressLine2);
            reportWithScreenShot("Clicking if address format is valid");
        } catch (Exception e) {
            reportWithScreenShot("Address format is not valid:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * This method will click on cancel button
     *
     * @author Rakesh Ghosal
     */
    public void clickCancelButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(cancelBtn), 15);
            cancelBtn.click();
            reportWithScreenShot("Clicking Cancel button");
        } catch (Exception e) {
            reportWithScreenShot("Cancel button is not clicked:" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * This method will click on Yes button in the pop up
     *
     * @author Rakesh Ghosal
     */
    public void clickYesButtonInPopUp() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(yesBtn), 15);
            yesBtn.click();
            reportWithScreenShot("Clicking yes button in pop up");
        } catch (Exception e) {
            reportWithScreenShot("Yes button is not clicked in pop up:" + e.getMessage());
            Assert.fail();
        }

    }


}
