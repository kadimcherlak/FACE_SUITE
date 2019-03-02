package framework.tests.pages.oracle_fusion_cloud;

import framework.core.drivers.web.WebPage;
import framework.tests.steps.oracle_fusion_cloud.Context;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BasePage<T> extends WebPage {


    @FindBy(tagName = "html")
    private WebElement __document;
    private WebElement appWebElement;
    @FindBy(xpath = "//*[text()='Sub']")
    private WebElement submit;

    @FindBy(xpath = "//button[text()='OK']")
    private WebElement okButton;

    @FindBy(xpath = "//button[contains(@id,'okWarningDialog')]")
    private WebElement warningBtn;

    @FindBy(xpath = "//div[@title='Next']")
    private WebElement next;

    @FindBy(xpath = "//button[contains(@id,'okConfirmationDialog')]")
    private WebElement confirmBtn;

    @FindBy(xpath = "//img[@title='Create']")
    private WebElement createBtn;

    @FindBy(xpath = "//img[@title='Tasks']")
    private WebElement taskButton;

    @FindBy(xpath = "//a[text()='Hire an Employee']")
    private WebElement hireAndEmployee;

    public BasePage(Context context) {
        super(context);
        logger.debug("{} loaded", this.getClass().getName());
    }

    private static void selectFromDropDown(WebElement name, String value) {
        Select dropdown = new Select(name);
        dropdown.selectByVisibleText(value);
    }

    public void waitUntilPageLoad() {
        try {
            new WebDriverWait(driver, 40).until((ExpectedCondition<Boolean>) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
        } catch (Exception e) {
            logger.error("Exception:waitUntilPageLoad = Error running JavascriptExecutor - {}", e.getMessage());
        }
    }

    public String getPageName() {
        return driver.getTitle();
    }

    public String getCurrentDate() {
        //To input current system date into Hire Date Field
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-YYYY");
        Date date = new Date();
        return dateFormat.format(date);
    }

    // Click on Submit Button to submit new Hire details
    public void clickSubmitButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(submit), 15);
            submit.click();
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Error While Submitting new Hire information due to:" + e.getMessage());
        }
    }

    // Click on Submit Button to submit new Hire details
    public void clickOkButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(okButton), 15);
            okButton.click();
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking OK button due to:" + e.getMessage());
        }
    }

    // Click on Ok Button if Warning is displayed
    public void clickWarningOkButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(warningBtn), 15);
            warningBtn.click();
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking OK button due to:" + e.getMessage());
        }
    }

    // Click on Next to goto next tab
    public void clickNextButton() {
        try {
            waitFor(ExpectedConditions.visibilityOf(next), 15);
            next.click();
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Error While Next Button due to:" + e.getMessage());
        }
    }

    // Click on Confirm Button
    public void clickConfirmButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(confirmBtn), 15);
            confirmBtn.click();
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Submission not successful due to:" + e.getMessage());
        }
    }

    // User click on Create button
    public void clickCreateButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(createBtn), 15);
            createBtn.click();
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on Create button:" + e.getMessage());
        }
    }

    // Open task pane
    public void clickTaskButton() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.visibilityOf(taskButton), 15);
            assertThat(taskButton.isDisplayed()).isTrue();
            taskButton.click();
        } catch (Exception e) {
            reportWithScreenShot("Failed to open Task pane due to :" + e.getMessage());
            Assert.fail();
        }
    }

    // Common Method to Select Links under Task Pane
    public void selectLinkInTaskPane(String linkName) {
        try {
            waitFor(ExpectedConditions.visibilityOf(taskButton), 15);
            waitNormalTime();  //Introduced Normalwait of 5 secs for the links to be loaded
            appWebElement = driver.findElement(By.xpath("//a[text()='" + linkName + "']"));
            reportWithScreenShot("Link :" + linkName + " selected from Task pane");
            waitFor(ExpectedConditions.elementToBeClickable(appWebElement), 15);
            assertThat(appWebElement.isDisplayed()).isTrue();
            appWebElement.click();
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Unable to open link :" + linkName + " due to" + e.getMessage());
            Assert.fail();
        }
    }

}
