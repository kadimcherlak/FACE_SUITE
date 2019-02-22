package framework.tests.pages.oracle_fusion_cloud;

import framework.core.drivers.web.WebPage;
import framework.tests.steps.oracle_fusion_cloud.Context;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasePage<T> extends WebPage {

    @FindBy(tagName = "html")
    private WebElement __document;

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

}
