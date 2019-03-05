package framework.tests.pages.oracle_fusion_cloud;

import framework.core.drivers.web.WebPage;
import framework.core.utils.DataLoader;
import framework.tests.steps.oracle_fusion_cloud.Context;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
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

import static org.assertj.core.api.Assertions.assertThat;

public class BasePage<T> extends WebPage {

    private WebElement appWebElement;

    @FindBy(tagName = "html")
    private WebElement __document;

    @FindBy(xpath = "//*[text()='Sub']")
    private WebElement submit;

    @FindBy(xpath = "(//button[text()='OK'])[1]")
    private WebElement okButton;

    @FindBy(xpath = "//button[contains(@id,'okWarningDialog')]")
    private WebElement warningBtn;

    @FindBy(xpath = "//div[@title='Next']")
    private WebElement next;

    @FindBy(xpath = "//button[contains(@id,'okConfirmationDialog')]")
    private WebElement confirmBtn;

    @FindBy(xpath = "//img[@title='Create']")
    private WebElement createBtn;

    @FindBy(xpath = "//button[text()='Search']")
    private WebElement searchBtn;

    @FindBy(xpath = "//img[@title='Tasks']")
    private WebElement taskButton;

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
            Assert.fail();
        }
    }

    // Method to get Page Name
    public String getPageName() {
        return driver.getTitle();
    }

    // Method to get Current Date
    public String getCurrentDate() {
        //To input current system date into Hire Date Field
        //DateFormat dateFormat = new SimpleDateFormat("dd-MMM-YYYY");
        DateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    // Click on Submit Button
    public void clickSubmitButton() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(submit), 15);
            submit.click();
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Error While Submitting new Hire information due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // Click on Ok Button
    public void clickOkButton() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(okButton), 15);
            okButton.click();
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking OK button due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // Click on Ok Button if Warning is displayed
    public void clickWarningOkButton() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(warningBtn), 15);
            reportWithScreenShot("Confirmation message displayed");
            warningBtn.click();
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking OK button due to:" + e.getMessage());
            Assert.fail();
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
            Assert.fail();
        }
    }

    // Click on Confirm Button
    public void clickConfirmButton() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(confirmBtn), 15);
            confirmBtn.click();
            waitShortTime();
            reportWithScreenShot("Confirm button clicked successfully");
        } catch (Exception e) {
            reportWithScreenShot("Submission not successful due to:" + e.getMessage());
            Assert.fail();
        }
    }

    // Click on Create button
    public void clickCreateButton() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(createBtn), 15);
            createBtn.click();
            waitNormalTime();
        } catch (Exception e) {
            reportWithScreenShot("Error While user click on Create button:" + e.getMessage());
            Assert.fail();
        }
    }

    // Click on Search Button
    public void clickSearch() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(searchBtn), 15);
            searchBtn.click(); // Click Search Button
        } catch (Exception e) {
            reportWithScreenShot("Error While clicking search button:" + e.getMessage());
            Assert.fail();
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
    public void clickLinkElement(String linkName) {
        try {
            waitShortTime(); // To handle task pane load time
            if (linkName.equals("New Person")) {
                waitFor(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='" + linkName + "'])[4]")), 15);
                appWebElement = driver.findElement(By.xpath("(//a[text()='" + linkName + "'])[4]"));
            } else {
                waitFor(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='" + linkName + "'])[2]")), 15);
                appWebElement = driver.findElement(By.xpath("(//a[text()='" + linkName + "'])[2]"));
            }
            reportWithScreenShot("Link :" + linkName + " selected from Navigator pane");
            waitFor(ExpectedConditions.elementToBeClickable(appWebElement), 15);
            assertThat(appWebElement.isDisplayed()).isTrue();
            appWebElement.click();
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Unable to open :" + linkName + " due to " + e.getMessage());
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
            assertThat(appWebElement.isDisplayed()).isTrue();
            appWebElement.click();
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Unable to open :" + linkName + " due to " + e.getMessage());
            Assert.fail();
        }
    }

    // Custom wait and click method
    public boolean custom_wait_clickable_and_click(WebElement element) {
        int counter = 0;
        int attempts = 5;
        while (counter < attempts) {
            try {
                waitFor(ExpectedConditions.elementToBeClickable(element), 15);
                element.click();
                return true;
            } catch (WebDriverException e) {
                if (e.getMessage().contains("is not clickable at point")) {
                    waitShortTime();
                    counter += 1;
                } else {
                    Assert.fail();
                }
            }
        }
        try {
            Assert.fail();
            throw new Exception("Click Action failed on Element: " + element);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * This function is being used to perform action for each test step in the application
     *
     * @param action
     * @param element
     * @param objectName
     * @param value      Author Koushik Kadimcherla
     */
    public void performAction(String action, WebElement element, String objectName, String value) {
        try {
            switch (action.toUpperCase()) {
                case "CLICK": {
                    custom_wait_clickable_and_click(element);
                }
                case "TYPE": {
                    waitFor(ExpectedConditions.elementToBeClickable(element), 15);
                    element.clear();
                    element.sendKeys(value);
                }
            }
        } catch (Exception e) {
            reportWithScreenShot("Unable to perform the operation " + action.toUpperCase() + "on object " + objectName
                    + " due to " + e.getMessage());
            Assert.fail();
        }
    }


    //Select the dropdown value passed as parameter in an input field

    /**
     * This method will select the dropdown value passed as parameter in an input field
     *
     * @param element
     * @param dropdownValue
     * @author Rakesh Ghosal
     */
    public void selectInputDropdownValue(WebElement element, String dropdownValue) {
        try {
            String dropdownXpathValue = "//li[text()='" + dropdownValue + "']";
            waitFor(ExpectedConditions.elementToBeClickable(element), 15);
            element.click();
            waitFor(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(dropdownXpathValue))), 15);
            driver.findElement(By.xpath(dropdownXpathValue)).click();


        } catch (Exception e) {
            reportWithScreenShot("Error While selecting dropdown value:" + e.getMessage());
            Assert.fail();
        }
    }


    /**
     * This method will validate if a Web Element is displayed or not
     *
     * @param element
     * @author Rakesh Ghosal
     */
    public void validateElementIsDisplayed(WebElement element) {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(element), 15);
            assertThat(element.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Element is not present:" + e.getMessage());
            Assert.fail();
        }
    }

    /**
     * This method will Update data to excel sheet
     *
     * @param rowName
     * @param colName
     * @param valToUpdate
     * @author Raghavendran Ramasubramanian
     */
    public void writeToExcel(String rowName, String colName, String valToUpdate) {
        DataLoader.writeDataToExcel(rowName, colName, valToUpdate);
    }
}

