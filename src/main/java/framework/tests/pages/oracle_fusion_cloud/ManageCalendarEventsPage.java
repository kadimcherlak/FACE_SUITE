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

import static org.assertj.core.api.Assertions.assertThat;

public class ManageCalendarEventsPage extends BasePage<ManageCalendarEventsPage> {

    private Context context;
    private Data data;
    private Actions actions;
    private WebElement appWebElement;
    private WebElement typeSelection;
    private WebElement categorySelection;
    private WebElement wsName;
    private String workScheduleName;
    private int elementsize;

    // Calendar Event Page Elements
    @FindBy(xpath = "//nobr[contains(.,'Calendar Event')]")
    private WebElement calendarEventPage;

    @FindBy(xpath = "//h1[contains(.,'Manage Work Schedules')]")
    private WebElement manageWorkSchedulePage;

    @FindBy(xpath = "//img[@title='Add Row']")
    private WebElement addRow;

    @FindBy(xpath = "(//button[contains(.,'OK')])[1]")
    private WebElement okButton;

    @FindBy(xpath = "//span[@class='xwb' and text()='Create']")
    private WebElement createButton;

    @FindBy(xpath = "//span[@class='xwb' and text()='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[@class='x10v' and text()='Y']")
    private WebElement yesButton;

    @FindBy(xpath = "//h1[contains(.,'Create Work Schedule')]")
    private WebElement createWorkSchedule;

    @FindBy(xpath = "//label[text()='Name']/following::input[1]")
    private WebElement name;

    @FindBy(xpath = "//label[text()='Type']/following::input[1]")
    private WebElement type;

    @FindBy(xpath = "//label[text()='Effective from Date']/following::input[1]")
    private WebElement effectiveFromDate;

    @FindBy(xpath = "//label[text()='Effective to Date']/following::input[1]")
    private WebElement effectiveToDate;

    @FindBy(xpath = "//label[text()='Category']/following::input[1]")
    private WebElement category;

    @FindBy(xpath = "//textarea[@class='x25']")
    private WebElement description;

    @FindBy(xpath = "(//input[@class='x25'])[2]")
    private WebElement patternSequence;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    private WebElement patternName;

    @FindBy(xpath = "(//div[text()='Confirmation']")
    private WebElement confirmationPopUp;

    @FindBy(xpath = "(//div[contains(.,'The work schedule was')])[9]")
    private WebElement confirmMessage;

    @FindBy(xpath = "(//img[@title='Error'])[1]")
    private WebElement errorMessage;

    @FindBy(xpath = "//img[@title='Home']")
    private WebElement homeButton;


    public ManageCalendarEventsPage(Context context) {
        super(context);
        this.context = context;
        this.data = context.getData();
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
        logger.debug("{} loaded", this.getClass().getName());
    }

    // Check if Calendar Event Page is displayed
    public void checkCalendarEventPageDisplayed() {
        try {
            waitFor(ExpectedConditions.visibilityOf(calendarEventPage), 15);
            assertThat(calendarEventPage.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Calendar Event page is displayed");
        } catch (Exception e) {
            reportWithScreenShot("Calendar Event page not Displayed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // Common Method to Select different Links on Calendar Event Page
    public void clickLinkInCalendarEventPage(String linkName) {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(calendarEventPage), 15);
            clickLinkElement(linkName);
        } catch (Exception e) {
            reportWithScreenShot("Unable to open :" + linkName + " due to" + e.getMessage());
            Assert.fail();
        }
    }

    // Check if Manage Work Schedule page is displayed
    public void checkManageWorkSchedulesPageDisplayed() {
        try {
            waitFor(ExpectedConditions.visibilityOf(manageWorkSchedulePage), 15);
            assertThat(manageWorkSchedulePage.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Manage Work Schedule page is displayed");
        } catch (Exception e) {
            reportWithScreenShot("Manage Work Schedule page not Displayed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // Click Create Button in Create Work Schedule page
    public void clickCreateInCreateWorkSchedule() {
        try {
            // click create button
            custom_wait_clickable_and_click(createButton);
            createButton.click();

            // check create work schedule page is displayed
            waitFor(ExpectedConditions.visibilityOf(createWorkSchedule), 15);
        } catch (Exception e) {
            reportWithScreenShot("Click Create Button failed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // Enter Schedule Information
    public void enterWorkScheduleInfo() {
        try {
            // Enter Schedule details
            name.click();
            name.sendKeys(data.getName());
            name.sendKeys(Keys.TAB);

            type.click();
            typeSelection = driver.findElement(By.xpath("//li[contains(.,'" + data.getType() + "')]"));
            waitFor(ExpectedConditions.visibilityOf(typeSelection), 15);
            typeSelection.click();
            type.sendKeys(Keys.TAB);

            effectiveFromDate.clear();
            effectiveFromDate.sendKeys(data.getEffectiveFromDate());
            effectiveFromDate.sendKeys(Keys.TAB);

            effectiveToDate.clear();
            effectiveToDate.sendKeys(data.getEffectiveToDate());
            effectiveToDate.sendKeys(Keys.TAB);

            category.click();
            categorySelection = driver.findElement(By.xpath("//li[@class='x1pk'][contains(.,'" + data.getCategory() + "')]"));
            waitFor(ExpectedConditions.visibilityOf(categorySelection), 15);
            categorySelection.click();
            category.sendKeys(Keys.TAB);

            description.click();
            description.sendKeys(data.getDescription());

            // Click to create new row for pattern creation
            waitFor(ExpectedConditions.elementToBeClickable(addRow), 15);
            addRow.click();

            waitFor(ExpectedConditions.visibilityOf(patternSequence), 15);
            patternSequence.sendKeys(data.getSequence());
            patternSequence.sendKeys(Keys.TAB);

            patternName.click();
            patternName.sendKeys(data.getPatternName());
            patternName.sendKeys(Keys.ENTER);
            patternName.sendKeys(Keys.TAB);
            waitShortTime();
            reportWithScreenShot("Work Schedule Created");
        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value into Create Work Schedule due to: " + e.getMessage());
            Assert.fail();
        }

    }

    // Check if Confirm message is present
    public void checkConfirmationMessage(String message) {
        try {
            waitFor(ExpectedConditions.visibilityOf(confirmMessage), 15);
            assertThat(confirmMessage.getText().equals(message)).isTrue();
            reportWithScreenShot("Checking if Confirmation message is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Confirmation message not Displayed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // Click Home button currently only for Calendar Event Page
    public void clickHomeButton() {
        try {
            waitFor(ExpectedConditions.visibilityOf(homeButton), 15);
            homeButton.click();
            waitUntilPageLoad();
            reportWithScreenShot("Home page loaded successfully");
        } catch (Exception e) {
            reportWithScreenShot("Home button click failed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    // For Data re-usability check schedule if existing and delete
    public void checkExistingScheduleAndDelete() {
        try {
            // Enter Schedule name to search
            name.click();
            name.sendKeys(data.getName());
            name.sendKeys(Keys.TAB);

            // Click on Search
            clickSearch();

            // Check if name is displayed in the result set
            elementsize = driver.findElements(By.xpath("(//td[contains(.,'" + data.getName() + "')])[2]")).size();
            int counter = 0;
            while (elementsize == 0 && counter <= 5) {
                elementsize = driver.findElements(By.xpath("(//td[contains(.,'" + data.getName() + "')])[2]")).size();
                clickSearch();
                waitShortTime();
                counter++;
            }

            reportWithScreenShot("Existing Schedule checked and deleted if present");

            if (elementsize > 0) {
                // delete the record
                deleteButton.click();
                waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='x10v' and text()='Y']")), 15);
                yesButton.click();
                waitUntilPageLoad();
            }
        } catch (Exception e) {
            reportWithScreenShot("Delete button click failed due to: " + e.getMessage());
            Assert.fail();
        }
    }

    public void searchWorkSchedule() {
        try {
            // Enter Schedule name to search
            name.click();
            name.sendKeys(data.getName());
            name.sendKeys(Keys.TAB);

            // Click on Search
            clickSearch();

            // Check if name is displayed in the result set
            elementsize = driver.findElements(By.xpath("(//td[contains(.,'" + data.getName() + "')])[2]")).size();
            int counter = 0;
            while (elementsize == 0 && counter <= 5) {
                elementsize = driver.findElements(By.xpath("(//td[contains(.,'" + data.getName() + "')])[2]")).size();
                clickSearch();
                waitShortTime();
                counter++;
            }

            if (elementsize > 0) {
                reportWithScreenShot("Existing Schedule found");
                //driver.findElement(By.xpath("(//td[contains(.,'" + data.getName() + "')])[2]")).click();
            } else {
                throw new Exception("Schedule with Name: " + data.getName() + " is not found");
            }

        } catch (Exception e) {
            reportWithScreenShot("Work Schedule not found due to: " + e.getMessage());
            Assert.fail();
        }
    }

    public void checkWorkScheduleDisplayed() {
        try {
            wsName = driver.findElement(By.xpath("(//td[contains(.,'" + data.getName() + "')])[2]"));
            workScheduleName = driver.findElement(By.xpath("(//td[contains(.,'" + data.getName() + "')])[2]")).getText();
            assertThat(workScheduleName.equals(data.getName())).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Work Schedule not found due to: " + e.getMessage());
            Assert.fail();
        }
    }

    public void clickWorkScheduleName() {
        try {
            wsName.click();
            waitShortTime();
        } catch (Exception e) {
            reportWithScreenShot("Unable to click on Work Schedule Name due to: " + e.getMessage());
            Assert.fail();
        }
    }

    public void updateWorkSchedule() {
        try {
            // Update Schedule details
            waitFor(ExpectedConditions.visibilityOf(effectiveToDate), 15);
            effectiveToDate.clear();
            effectiveToDate.sendKeys(data.getEffectiveToDate());
            effectiveToDate.sendKeys(Keys.TAB);

            waitShortTime();
            reportWithScreenShot("Work Schedule Updated");
        } catch (Exception e) {
            reportWithScreenShot("Error While Entering Value to Update Work Schedule due to: " + e.getMessage());
            Assert.fail();
        }

    }
}
