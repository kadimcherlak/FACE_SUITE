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

public class ChangeManagerPage extends BasePage<ChangeManagerPage> {

    Context context;
    Data data;
    Actions actions;
    WebElement hireActionElement;
    WebElement hireReasonElement;

    // Hire An Employee Page Elements

    @FindBy(linkText = "My Team")
    private WebElement myTeam;

    @FindBy(xpath = "//*[text()='Employment Info:']")
    private WebElement employmentInfoPageCheck;

    //@FindBy(xpath = "//button[@title='Actions']")
    @FindBy(xpath = "//img[contains(@src,'/hcmUI/images/func_contextpop_orange_20_hov.png')]")
    private WebElement moreInfoIcon;

    // To check if My Team page is displayed
    @FindBy(xpath = "//*[contains(@class,'xwb') and contains(text(),'Filter')]")
    private WebElement filterBtn;

    // To select Change Manager option
    @FindBy(xpath = "//span[text()='Change Manager']")
    private WebElement changeManagerLink;

    // To Click Continue Button
    @FindBy(xpath = "//span[text()='Continue']")
    private WebElement continueBtn;

    // To Click Continue Button after selecting Change Manager Reason
    @FindBy(xpath = "//button[@title='Continue']")
    private WebElement continueBtnAftrMgrChange;

    // To select Change Manager option
    // @FindBy(xpath = "//*[contains(@class,'xmz') and contains(text(),'Change Manager')]")
    // private WebElement changeManagerOption;

    // Change Manager Reason
    @FindBy(xpath = "//input[contains(@class,'x2h')]")
    private WebElement changeManagerReason;

    //@FindBy(xpath = "//button[@title='Actions']")
    @FindBy(xpath = "//*[@id=\"_FOpt1:_FOr1:0:_FOSrPER_HCMPEOPLETOP_FUSE_MY_TEAM:0:MAnt2:4:up1Upl:UPsp1:gpRgn:0:GPmtfr1:1:pce1:lv1Lv:0:pse1:PSEcil6::icon\"]")
    private WebElement editBtn;

    // New Manager Name
    @FindBy(xpath = "//input[@class='x1wf']")
    private WebElement managerName;

    // Click review button
    @FindBy(xpath = "//span[text()='Review']")
    private WebElement reviewBtn;

    // To check for Current value and new value displayed
    @FindBy(xpath = "//div[@title='Current Value']")
    private WebElement currentValue;

    @FindBy(xpath = "//div[@title='Submit']")
    private WebElement managerChangeSubmit;

    @FindBy(xpath = "//button[contains(@id,'okWarningDialog')]")
    private WebElement managerChangeWarningBtn;

    @FindBy(xpath = "//button[contains(@id,'okConfirmationDialog')]")
    private WebElement managerChangeConfirmBtn;

    public ChangeManagerPage(Context context) {
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
        }
    }

    // To check if My Team page is displayed
    public boolean checkMyTeamPageDisplay() {

        try {
            reportWithScreenShot("Checking if My Team Page is Displayed");
            waitFor(ExpectedConditions.visibilityOf(filterBtn), 5);
            return filterBtn.isDisplayed();
        } catch (Exception e) {
            reportWithScreenShot("My Team Page not Displayed");
            return filterBtn.isDisplayed();
        }
    }

    // user clicks on the Employee link
    public void clickEmpLink() {
        try {
            waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.linkText(data.getPersonName()))), 5);
            driver.findElement(By.linkText(data.getPersonName())).click();

        } catch (Exception e) {
            reportWithScreenShot("Error While Employee link click due to:" + e.getMessage());
        }

    }

    // User Navigate to Change Manager page
    public void navigateToChangeManagerPage() {
        try {
            moreInfoIcon.click();
            changeManagerLink.click();
            continueBtn.click();
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Error While Click of Change Manager link due to:" + e.getMessage());
        }

    }

    // user select change manager reason
    public void selectChangeManagerReason() {
        try {
            changeManagerReason.click();
            waitFor(ExpectedConditions.visibilityOf(
                    driver.findElement(By.xpath("//li[text()='" + data.getChangeManagerReason() + "']"))), 5);
            driver.findElement(By.xpath("//li[text()='" + data.getChangeManagerReason() + "']")).click();
            changeManagerReason.sendKeys(Keys.TAB);
            continueBtnAftrMgrChange.click();

        } catch (Exception e) {
            reportWithScreenShot("Error While Employee link click due to:" + e.getMessage());
        }

    }

    // user select value in Manager dropdown
    public void selectNewManager() {
        try {
            editBtn.click();
            waitFor(ExpectedConditions.elementToBeClickable(managerName), 5);
            managerName.sendKeys(data.getManagerName());
            managerName.sendKeys(Keys.TAB);

        } catch (Exception e) {
            reportWithScreenShot("Error While selecting new Manager due to:" + e.getMessage());
        }

    }

    // user Click on Review button
    public void clickReviewButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(reviewBtn), 5);
            reviewBtn.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While user clicks Review Button due to:" + e.getMessage());
        }
    }

    // To check if current and proposed value is displayed
    public boolean checkCurrentAndProposedValue() {

        try {
            reportWithScreenShot("Checking if current value is Displayed");
            waitFor(ExpectedConditions.visibilityOf(currentValue), 5);
            return currentValue.isDisplayed();
        } catch (Exception e) {
            reportWithScreenShot("Current Value is not Displayed");
            return currentValue.isDisplayed();
        }
    }

    // Click on Submit Button to submit new Hire details
    public void clickSubmitButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(managerChangeSubmit), 5);
            managerChangeSubmit.click();
        } catch (Exception e) {
            reportWithScreenShot("Error While Submitting new Hire information due to:" + e.getMessage());
        }
    }

    // Click on Ok Button if Warning is displayed
    public void clickOk() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(managerChangeWarningBtn), 5);
            managerChangeWarningBtn.click();

        } catch (Exception e) {
            reportWithScreenShot("Error While clicking OK button due to:" + e.getMessage());
        }
    }

    // Click on Ok Button if Warning is displayed
    public void clickConfirm() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(managerChangeConfirmBtn), 5);
            managerChangeConfirmBtn.click();

        } catch (Exception e) {
            reportWithScreenShot("Error While clicking confirm button due to:" + e.getMessage());
        }
    }

}
