package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import junit.framework.Assert;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LineManagerPage extends BasePage<LineManagerPage> {

    WebElement hireActionElement;
    WebElement hireReasonElement;
    private Context context;
    private Data data;
    private Actions actions;
    private String currentSalaryAmount;
    private WebElement appWebElement;

    // Hire An Employee Page Elements

    @FindBy(linkText = "My Team")
    private WebElement myTeam;

    @FindBy(xpath = "//*[text()='Employment Info:']")
    private WebElement employmentInfoPageCheck;

    @FindBy(xpath = "//img[contains(@src,'/hcmUI/images/func_contextpop_orange_20_hov.png')]")
    private WebElement moreInfoIcon;

    // To Check WorkRelationshipDetails tab in Work Relationship Details
    @FindBy(xpath = "//td[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:0:pt1:r1:0:pt1:SP1:sdh1::_afrTtxt']")
    private WebElement WorkRelationshipDetails;

    // To check if My Team page is displayed
    @FindBy(xpath = "//div[@title='My Team']/descendant::h1[text()='My Team']")
    private WebElement myTeamHeader;

    // To select Change Manager option
    @FindBy(xpath = "//td[text()='Change Manager']")
    private WebElement changeManagerLink;

    // To Click Continue Button
    @FindBy(xpath = "//span[text()='Continue']")
    private WebElement continueBtn;

    // To select Personal and Employment option
    @FindBy(xpath = "//*[contains(@class,'xmy') and contains(text(),'Personal and Employment')]")
    private WebElement personalEmployment;

    // To Click Continue Button after selecting Change Manager Reason
    @FindBy(xpath = "//button[@title='Continue']")
    private WebElement continueBtnAftrMgrChange;

    // To select Change Manager option
    // @FindBy(xpath = "//*[contains(@class,'xmz') and contains(text(),'Change Manager')]")
    // private WebElement changeManagerOption;


    // Change Manager Reason
    @FindBy(xpath = "//input[@role='combobox']")
    private WebElement changeManagerReason;

    @FindBy(xpath = "//*[@id=\"_FOpt1:_FOr1:0:_FOSrPER_HCMPEOPLETOP_FUSE_MY_TEAM:0:MAnt2:4:up1Upl:UPsp1:gpRgn:0:GPmtfr1:1:pce1:lv1Lv:0:pse1:PSEcil6::icon\"]")
    private WebElement editBtn;

    // New Manager Name
    @FindBy(xpath = "(//label[text()='Name']/following::input[@role='combobox'])[1]")
    private WebElement managerName;

    // Click review button
    @FindBy(xpath = "//span[text()='Review']")
    private WebElement reviewBtn;

    // To check for Current value and new value displayed
    @FindBy(xpath = "//div[@title='Current Value']")
    private WebElement currentValue;

    @FindBy(xpath = "//a[@accesskey='m'][@role='button']")
    private WebElement managerChangeSubmit;

    @FindBy(xpath = "//button[contains(@id,'okWarningDialog')]")
    private WebElement managerChangeWarningBtn;

    @FindBy(xpath = "//button[contains(@id,'okConfirmationDialog')]")
    private WebElement managerChangeConfirmBtn;

    //--
    @FindBy(xpath = "//h1[text()='My Team ']")
    private WebElement txtboxMyTeam;

    @FindBy(xpath = "//a[text()='Compensation']")
    private WebElement lnkCompensation_MyTeam;

    @FindBy(xpath = "//a[text()='Manage Salary']")
    private WebElement lnkManageSalary_MyTeam;

    @FindBy(xpath = "//button[text()='Propose New Salary']")
    private WebElement btnProposeNewSal_ManageSalary;

    @FindBy(xpath = "//input[contains(@name,'NewStartDate')]")
    private WebElement dtStartDate_ManageSalary;

    @FindBy(xpath = "//input[contains(@name,'NewAction')]")
    private WebElement drpdownAction_ManageSalary;

    @FindBy(xpath = "//input[contains(@name,'Reason')]")
    private WebElement drpdownReason_ManageSalary;

    @FindBy(xpath = "//button[@accesskey='K']")
    private WebElement btnOK;

    @FindBy(xpath = "//label[text()='Salary Amount']/following::input[contains(@id,'SA')]")
    private WebElement salaryAmount;

    @FindBy(xpath = "//label[text()='Salary Amount']/following::input[contains(@id,'AA')]")
    private WebElement AdjAmount;

    @FindBy(xpath = "//a[@accesskey='u']")
    private WebElement btnContinue_ManageSalary;

    @FindBy(xpath = "//div[contains(text(),'0.00')]")
    private WebElement currentsal_ReviewSalary;

    @FindBy(xpath = "//div[@title='Change Manager']/descendant::h1[text()='Change Manager']")
    private WebElement changeManagerPageDisplayed;

    @FindBy(xpath = "//button[@title='Continue']")
    private WebElement changeManagerContinueButton;

    @FindBy(xpath = "//img[@title='Edit']")
    private WebElement changeManagerEditButton;

    @FindBy(xpath = "//td[@title='Add Comments and Attachments']/following::textarea[1]")
    private WebElement addCommentsAndAttachments;

    @FindBy(xpath = "//tr[@aria-rowindex='1']")
    private WebElement searchManagerDropdown;

    @FindBy(xpath = "//*[text()='Work Relationship Details']")
    private WebElement workRelationshiDetailsTab;

    @FindBy(xpath = "//a[@title='Actions']")
    private WebElement buttonActions;

    @FindBy(xpath = "//td[text()='Terminate']")
    private WebElement buttonTerminate;

    @FindBy(xpath = "//td[text()='Cancel Work Relationship']")
    private WebElement comboBox_CancelWorkRelation;

    @FindBy(xpath = "//td[text()='View Termination']")
    private WebElement link_ViewTermination;

    @FindBy(xpath = "//button[contains(.,'Reverse Termination')]")
    private WebElement button_ReverseTermination;

    @FindBy(xpath = "//div[text()='Warning']")
    private WebElement popup_WarningText;

    @FindBy(xpath = "//a[contains(@id,'Action::drop')]")
    private WebElement terminationActionDropdown;

    @FindBy(xpath = "//a[contains(@id,'selectOneChoice2::drop')]")
    private WebElement terminationSelectReasonDropdown;

    @FindBy(xpath = "//a[contains(@id,'RehireRecom::drop')]")
    private WebElement terminationRecommendedforRehireDropdown;

    @FindBy(xpath = "//label[contains(text(),'Termination Date')]//following::input[1]")
    private WebElement text_terminationDate_field;

    @FindBy(xpath = "//*[@accesskey='m']")
    private WebElement btnSubmit;

    @FindBy(xpath = "//button[@accesskey='Y']")
    private WebElement btnYes;

    @FindBy(xpath = "//*[@accesskey='B']")
    private WebElement btnBack;

    @FindBy(xpath = "//button[text()='Review']")
    private WebElement btnReview;

    @FindBy(xpath = "//input[contains(@id,'keywordSearchBox')]")
    private WebElement personSearchTextBox;

    @FindBy(xpath = "//img[@title='Search']")
    private WebElement searchImage;

    @FindBy(xpath = "//span[text()='Continue']")
    private WebElement button_Continue;

    public LineManagerPage(Context context) {
        super(context);
        this.context = context;
        this.data = context.getData();
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
        logger.debug("{} loaded", this.getClass().getName());
    }

    // Team selection in Navigator Screen
    public void navigatorTeam() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(myTeam), 5);
            myTeam.click();
            waitUntilPageLoad();
            reportWithScreenShot("My Team Page displayed");
        } catch (Exception e) {
            reportWithScreenShot("Unable to open My Team Screen due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // To check if My Team page is displayed
    public void checkMyTeamPageDisplay() {
        try {
            reportWithScreenShot("Checking if My Team Page is Displayed");
            waitFor(ExpectedConditions.visibilityOf(myTeamHeader), 30);
            assertThat(myTeamHeader.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("My Team Page not Displayed");
            Assert.fail();
        }
    }

    // user clicks on the Employee link
    public void clickEmpLink() {
        try {
            waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.linkText(data.getPersonName()))), 5);
            driver.findElement(By.linkText(data.getPersonName())).click();
        } catch (Exception e) {
            reportWithScreenShot("Error While Employee link click due to:" + e.getMessage());
            Assert.fail();
        }

    }

    // User Navigate to Change Manager page
    public void navigateToChangeManagerPage() {
        try {
            int counter = 0;
            String personName = csvReader().get("personName");
            waitFor(ExpectedConditions.elementToBeClickable(personSearchTextBox), 15);
            personSearchTextBox.clear();
            personSearchTextBox.sendKeys(personName.trim());
            waitFor(ExpectedConditions.elementToBeClickable(searchImage), 15);
            searchImage.click();
            String moreInformationXpath = "(//a[text()='" + personName.trim() + "'])[1]/following::img[1]";
            Assert.assertTrue("Change Manager Link is not enabled", waitForChangeManagerLinkEnabled(moreInformationXpath));
            driver.findElement(By.xpath(moreInformationXpath)).click();
            waitFor(ExpectedConditions.elementToBeClickable(changeManagerLink), 15);
            changeManagerLink.click();
            waitFor(ExpectedConditions.elementToBeClickable(continueBtn), 15);
            continueBtn.click();
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Error While Click of Change Manager link due to:" + e.getMessage());
            Assert.fail();
        }

    }

    // user select change manager reason and click on continue button
    public void selectChangeManagerReason() {
        try {

            selectInputDropdownValue(changeManagerReason, data.getChangeManagerReason());
            waitFor(ExpectedConditions.elementToBeClickable(changeManagerContinueButton), 10);
            changeManagerContinueButton.click();
            reportWithScreenShot("Clicking on Continue button in Change Manager Screen");
        } catch (Exception e) {
            reportWithScreenShot("Error While Employee link click due to:" + e.getMessage());
            Assert.fail();
        }

    }

    // user select value in Manager dropdown
    public void selectNewManager() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(changeManagerEditButton), 10);
            changeManagerEditButton.click();
            waitFor(ExpectedConditions.elementToBeClickable(managerName), 15);
            managerName.clear();
            managerName.sendKeys(data.getManagerName());
            waitShortTime();
            waitFor(ExpectedConditions.elementToBeClickable(searchManagerDropdown), 15);
            searchManagerDropdown.click();
            waitFor(ExpectedConditions.elementToBeClickable(changeManagerContinueButton), 10);
            changeManagerContinueButton.click();
            reportWithScreenShot("Selecting New Manager :" + data.getManagerName() + ", and clicking on continue button");

        } catch (Exception e) {
            reportWithScreenShot("Error While selecting new Manager due to:" + e.getMessage());
            Assert.fail();
        }

    }

    // user Click on Review button
    public void clickReviewButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(btnReview), 15);
            btnReview.click();
            waitFor(ExpectedConditions.visibilityOf(btnBack), 60);
            assertThat(btnBack.isDisplayed()).isTrue();
            reportWithScreenShot("User clicks on review button:");
        } catch (Exception e) {
            reportWithScreenShot("Error While user clicks Review Button due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // To check if current and proposed value is displayed
    public void checkCurrentAndProposedValue() {

        try {
            reportWithScreenShot("Checking if current value is Displayed");
            waitFor(ExpectedConditions.visibilityOf(currentValue), 5);
            assertThat(currentValue.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Current Value is not Displayed");
            Assert.fail();
        }
    }

    // Click on Submit Button to submit new Hire details
    public void clickSubmitButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(managerChangeSubmit), 5);
            managerChangeSubmit.click();
            reportWithScreenShot("Warning message displayed");
        } catch (Exception e) {
            reportWithScreenShot("Error While Submitting new Hire information due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // Click on Ok Button if Warning is displayed
    public void clickOk() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(managerChangeWarningBtn), 5);
            managerChangeWarningBtn.click();
            reportWithScreenShot("Warning popup should be displayed");
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking OK button due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // Click on Ok Button if Warning is displayed
    public void clickConfirm() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(managerChangeConfirmBtn), 5);
            managerChangeConfirmBtn.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking confirm button due to:" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * Click on Employee More info in My Team page
     * Author: Koushik Kadimcherla
     */
    public void clickMoreInfo() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(txtboxMyTeam), 5);
            WebElement employeeElement = driver.findElement(By.xpath("//a[text()='" + data.getEmployeeName() + "']"));
            mouseHover(employeeElement);
            reportWithScreenShot("Clicking on More Info link");
            //waitFor(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='" + data.getEmployeeName() + "']/following::input[1]"))), 5);
            driver.findElement(By.xpath("(//a[text()='" + data.getEmployeeName() + "']/following::a[@title='More Information'])[1]")).click();
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking Employee More Info button due to:" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * Click on Compensation in Actions section
     * Author: Koushik Kadimcherla
     */
    public void clickCompensation() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(lnkCompensation_MyTeam), 15);
            lnkCompensation_MyTeam.click();
            reportWithScreenShot("Clicking on Compesation link");
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking on Compensation button due to:" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * Click on Manage Salary in Compensation section
     * Author: Koushik Kadimcherla
     */
    public void clickManageSalary() {
        try {
            waitShortTime();
            waitFor(ExpectedConditions.elementToBeClickable(lnkManageSalary_MyTeam), 15);
            lnkManageSalary_MyTeam.click();
            reportWithScreenShot("Clicking on Manage Salary link");
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking on Manage Salary button due to:" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * CHECK MANAGER SALARY PAGE is displayed
     * Author: Koushik Kadimcherla
     */
    public void checkManageSalaryPageDisplayed() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(btnProposeNewSal_ManageSalary), 15);
            reportWithScreenShot("Checking if Manage Salary page is Displayed");
            assertThat(btnProposeNewSal_ManageSalary.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Manage Salary page  is not Displayed" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * CLICK ON PROPOSE NEW SALARY
     * Author: Koushik Kadimcherla
     */
    public void clickProposeNewSalary() {

        try {

            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(btnProposeNewSal_ManageSalary), 15);
            btnProposeNewSal_ManageSalary.click();
            reportWithScreenShot("Clicked on Propose New Salary");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking on Propose New Salary button" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * Enter propose new Salary details
     * Author: Koushik Kadimcherla
     */
    public void enterProposeNewSalaryDetails() {
        try {
            waitShortTime();
            waitFor(ExpectedConditions.elementToBeClickable(dtStartDate_ManageSalary), 15);
            dtStartDate_ManageSalary.sendKeys(getCurrentDate());
            waitFor(ExpectedConditions.elementToBeClickable(drpdownAction_ManageSalary), 15);
            drpdownAction_ManageSalary.sendKeys(data.getActionManageSalary());
            waitShortTime();
            waitFor(ExpectedConditions.elementToBeClickable(drpdownReason_ManageSalary), 15);
            drpdownReason_ManageSalary.sendKeys(data.getActionReasonManageSalary());
            waitShortTime();
            reportWithScreenShot("Entering Propose New Salary details");
            btnOK.click();
        } catch (Exception e) {
            reportWithScreenShot("Error while entering data in Propose New Salary popup" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * check new salary page is displayed in My Team
     * Author: Koushik Kadimcherla
     */
    public void checkNewSalaryPageDisplayed() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(salaryAmount), 15);
            reportWithScreenShot("Checking if New Salary page is Displayed");
            assertThat(salaryAmount.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("New Salary page  is not Displayed" + e.getMessage());
            Assert.fail();
        }

    }

    /**
     * Setting salary for employee in My Team
     * Author: Koushik Kadimcherla
     */
    public void setSalaryinMyteam() {
        try {
            waitShortTime();
            waitFor(ExpectedConditions.visibilityOf(salaryAmount), 60);
            currentSalaryAmount = salaryAmount.getAttribute("value");
            salaryAmount.clear();
            salaryAmount.sendKeys(data.getSalaryAmount());
            salaryAmount.sendKeys(Keys.TAB);
            waitNormalTime();
            assertThat(AdjAmount.getAttribute("value").equals(data.getSalaryAmount().trim())).isTrue();
            reportWithScreenShot("Adjustment amount and percentage are calculated automatically");

        } catch (Exception e) {
            reportWithScreenShot("Adjustment amount and percentage are not calculated automatically" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * Clicks continue button in Manage Salary My Team
     * Author: Koushik Kadimcherla
     */
    public void clickButtonContinueInManageSalary() {
        try {
            btnContinue_ManageSalary.click();
            waitForLoad();
            waitFor(ExpectedConditions.visibilityOf(currentsal_ReviewSalary), 30);
            assertThat(currentsal_ReviewSalary.isDisplayed()).isTrue();
            reportWithScreenShot("Review Salary page is displayed");
        } catch (Exception e) {
            reportWithScreenShot("Review salary page is not displayed due to error while clicking on Continue button :"
                    + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * Review Salary page in Manage Salary My Team
     * Author: Koushik Kadimcherla
     */
    public void reviewSalaryInMyTeam() {
        try {
            assertThat(
                    driver.findElement(By.xpath("//div[contains(text(),'" + currentSalaryAmount + "')]")).isDisplayed())
                    .isTrue();
            assertThat(driver.findElement(By.xpath("//div[contains(text(),'" + data.getSalaryAmount() + "')]"))
                    .isDisplayed()).isTrue();
            reportWithScreenShot("Current and Proposed salaries are displayed correctly in Review Salary page");
        } catch (Exception e) {
            reportWithScreenShot("Current and Proposed salaries are not displayed correctly" + e.getMessage());
            Assert.fail();
        }

    }


    /**
     * Validate if user landed on Change Manager Page
     *
     * @author Rakesh Ghosal
     */
    public void checkChangeManagerPageDisplay() {
        try {
            reportWithScreenShot("Checking if Change Manager Page is Displayed");
            waitFor(ExpectedConditions.visibilityOf(changeManagerPageDisplayed), 5);
            assertThat(changeManagerPageDisplayed.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Change Manager Page is not displayed " + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * User enters comment under add comments section in Change Manager Page
     *
     * @author Rakesh Ghosal
     */
    public void enterComments(String comments) {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(addCommentsAndAttachments), 15);
            addCommentsAndAttachments.clear();
            addCommentsAndAttachments.sendKeys(comments);
            reportWithScreenShot("Entering comment for Change Manager transaction");

        } catch (Exception e) {
            reportWithScreenShot("Unable to enter comments for Change Manager transaction" + e.getMessage());
            Assert.fail();
        }
    }


    // Common Method to Select Links under Task Pane
    public void clickLinkElementInTaskPane(String linkName) {
        try {
            waitShortTime(); // To handle task pane load time
            waitFor(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='" + linkName + "']")), 15);
            appWebElement = driver.findElement(By.xpath("//a[text()='" + linkName + "']"));
            reportWithScreenShot("Link :" + linkName + " selected from Task pane");
            waitFor(ExpectedConditions.elementToBeClickable(appWebElement), 15);
            Assertions.assertThat(appWebElement.isDisplayed()).isTrue();
            appWebElement.click();
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Unable to open :" + linkName + " due to " + e.getMessage());
            org.testng.Assert.fail();
        }
    }

    // Common Method to Select Links under Task Pane
    public void manageWorkRelationShipPageDisplayed() {

        try {
            waitFor(ExpectedConditions.visibilityOf(workRelationshiDetailsTab), 60);
            Assertions.assertThat(workRelationshiDetailsTab.isDisplayed()).isTrue();
            reportWithScreenShot("Work Relationship details page is displayed");
        } catch (Exception e) {
            reportWithScreenShot("Error in displaying work relationship details page");
            Assert.fail();

        }
    }

    /*
     * This method is to click Action button and select Terminate.
     *
     * @author Sangameshwar Balur
     * */

    public void clickActionAndTerminate() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(buttonActions), 30);
            buttonActions.click();
            waitFor(ExpectedConditions.visibilityOf(buttonTerminate), 60);
            buttonTerminate.click();
            waitFor(ExpectedConditions.visibilityOf(terminationActionDropdown), 60);
            Assertions.assertThat(terminationActionDropdown.isDisplayed()).isTrue();
            reportWithScreenShot("User clicked on Action and Terminate link");

        } catch (Exception e) {
            reportWithScreenShot("Error in clicking Action and termination link");
            Assert.fail();
        }
    }

    /*
     * This method is to click Action button and select Cancel Work Relationship.
     *
     * @author Sangameshwar Balur
     * */

    public void clickActionAndCancelWorkRelation() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(buttonActions), 30);
            buttonActions.click();
            waitFor(ExpectedConditions.visibilityOf(comboBox_CancelWorkRelation), 60);
            comboBox_CancelWorkRelation.click();
            waitFor(ExpectedConditions.visibilityOf(btnSubmit), 60);
            Assertions.assertThat(btnSubmit.isDisplayed()).isTrue();
            reportWithScreenShot("User clicked on Action and Relationship option");

        } catch (Exception e) {
            reportWithScreenShot("Error in clicking Action and Relationship option :" + e.getMessage());
            Assert.fail();
        }
    }


    //Clicking View Termination link
    public void clickActionAndViewTermination() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(buttonActions), 30);
            buttonActions.click();
            waitShortTime();
            waitFor(ExpectedConditions.visibilityOf(link_ViewTermination), 45);
            link_ViewTermination.click();
            reportWithScreenShot("User clicked on Action and View Termination link");
        } catch (Exception e) {
            reportWithScreenShot("Error in clicking Action and View termination link");
            Assert.fail();
        }
    }

    //Clicking Reverse Termination link
    public void clickReverseTermination() {
        try {
            waitFor(ExpectedConditions.visibilityOf(button_ReverseTermination), 60);
            button_ReverseTermination.click();
            reportWithScreenShot("User clicked on Reverse Termination button");
        } catch (Exception e) {
            reportWithScreenShot("Error in clicking Reverse Termination Button");
            Assert.fail();
        }
    }

    //Clicking Yes in Warning Popup box
    public void clickYesWarningPopup() {
        try {
            waitFor(ExpectedConditions.visibilityOf(popup_WarningText), 60);
            Assertions.assertThat(popup_WarningText.isDisplayed()).isTrue();
            waitFor(ExpectedConditions.visibilityOf(btnYes), 60);
            btnYes.click();
            reportWithScreenShot("User clicked on Reverse Termination button");
        } catch (Exception e) {
            reportWithScreenShot("Error in clicking Reverse Termination Button");
            Assert.fail();
        }
    }

    public void terminationPageDisplayed() {
        try {
            waitFor(ExpectedConditions.visibilityOf(terminationActionDropdown), 60);
            Assertions.assertThat(terminationActionDropdown.isDisplayed()).isTrue();

            reportWithScreenShot("User clicked on Action and Terminate link");
        } catch (Exception e) {
            reportWithScreenShot("Error in clicking Action and termination link");
            Assert.fail();

        }
    }

    public void selectTerminationAction(String actionType) {

        try {
            terminationActionDropdown.click();
            waitShortTime();
            driver.findElement(By.xpath("//li[text()='" + actionType + "']")).click();
            waitShortTime();
            reportWithScreenShot("User selects Action reason");
        } catch (Exception e) {
            reportWithScreenShot("Error selecting Action and termination link");
            Assert.fail();
        }
    }

    public void selectTerminationReason(String actionReason) {

        try {
            waitShortTime();
            terminationSelectReasonDropdown.click();
            waitShortTime();
            driver.findElement(By.xpath("//li[text()='" + actionReason + "']")).click();
            reportWithScreenShot("User selects Action reason");
        } catch (Exception e) {
            reportWithScreenShot("Error selecting Action and termination link");
            Assert.fail();
        }
    }

    public void updateTerminationDate() {
        try {
            waitShortTime();
            System.out.println("Last 3 days Date -" + getLastTwoDaysDate());
            text_terminationDate_field.clear();
            text_terminationDate_field.sendKeys(getLastTwoDaysDate());
            reportWithScreenShot("Termination Date selected");
        } catch (Exception e) {
            reportWithScreenShot("Error while selecting Termination date");
            Assert.fail();
        }
    }

    public void selectRehireReason(String rehireYesNo) {
        try {
            terminationRecommendedforRehireDropdown.click();
            waitShortTime();
            driver.findElement(By.xpath("//li[text()='" + rehireYesNo + "']")).click();
            waitShortTime();
            reportWithScreenShot("User selected " + rehireYesNo + " from rehire dropdown");
        } catch (Exception e) {
            reportWithScreenShot("Error selecting " + rehireYesNo + " from rehire dropdown");
            Assert.fail();
        }
    }

    public void clickButtonSubmit() {
        try {
            waitNormalTime();
            btnSubmit.click();
            waitShortTime();
            waitFor(ExpectedConditions.visibilityOf(btnYes), 60);
            assertThat(btnYes.isDisplayed()).isTrue();
            reportWithScreenShot("User clicked on Submit button");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking Submit button");
            Assert.fail();
        }
    }

    public void clickOKOnPopup() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(btnOK), 30);
            btnOK.click();
            waitFor(ExpectedConditions.visibilityOf(WorkRelationshipDetails), 30);
            assertThat(WorkRelationshipDetails.isDisplayed()).isTrue();
            reportWithScreenShot(" Ok button in Manage salary review page is clicked");
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking ok button:" + e.getMessage());
            Assert.fail();
        }
    }

    public boolean waitForChangeManagerLinkEnabled(String xpath) {
        int counter = 0;
        while (counter < 20) {
            try {
                waitFor(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))), 1);
                return true;
            } catch (Exception e) {
                //System.out.println("Waiting for Change Manager Link to be enabled..");
                waitShortTime();
                counter++;
            }
        }
        return false;
    }


    public void clickContinueButtonInChangeManagerPage() {

        try {

            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(button_Continue), 15);
            button_Continue.click();
            reportWithScreenShot("Click on Continue Button");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking on Continue button" + e.getMessage());
            Assert.fail();
        }
    }
}
