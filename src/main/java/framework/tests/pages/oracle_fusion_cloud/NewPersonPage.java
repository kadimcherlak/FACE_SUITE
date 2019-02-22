package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NewPersonPage extends BasePage<NewPersonPage> {

    Context context;
    Data data;

    // Ner Person Page Elements
    @FindBy(xpath = "//img[@title='Tasks']")
    private WebElement taskButton;

    @FindBy(xpath = "//a[text()='Hire an Employee']")
    private WebElement hireAndEmployee;

    @FindBy(xpath = "//a[text()='Add a Contingent Worker']")
    private WebElement addContingentWorker;

    @FindBy(xpath = "//a[text()='Add a Nonworker']")
    private WebElement addNonworker;

    @FindBy(xpath = "//a[text()='Add a Pending Worker']")
    private WebElement addPendingWorker;

    public NewPersonPage(Context context) {
        super(context);
        this.context = context;
        this.data = context.getData();
        PageFactory.initElements(driver, this);
        logger.debug("{} loaded", this.getClass().getName());
    }

    // Open task pane in New Person page credentials
    public void clickTaskButton() {
        try {
            waitUntilPageLoad();
            waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(.,'Overview')]"))), 15);
            assertThat(taskButton.isDisplayed()).isTrue();
            taskButton.click();
        } catch (Exception e) {
            reportWithScreenShot("Failed to open Task pane due to :" + e.getMessage());
            assertThat(taskButton.isDisplayed()).isTrue();
        }
    }

    public void clickHireAnEmployee() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(hireAndEmployee), 15);
            assertThat(hireAndEmployee.isDisplayed()).isTrue();
            hireAndEmployee.click();
            reportWithScreenShot("Select Hire An Employee");
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Failed to open Task pane due to :" + e.getMessage());
            assertThat(hireAndEmployee.isDisplayed()).isTrue();
        }
    }


    public void clickAddContingentWorker() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(addContingentWorker), 5);
            assertThat(addContingentWorker.isDisplayed()).isTrue();
            addContingentWorker.click();
            reportWithScreenShot("Select Add a Contingent Worker");
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Failed to open Task pane due to :" + e.getMessage());
            assertThat(addContingentWorker.isDisplayed()).isTrue();
        }
    }

    public void clickAddNonworker() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(addNonworker), 5);
            assertThat(addNonworker.isDisplayed()).isTrue();
            addNonworker.click();
            reportWithScreenShot("Select Add a Nonworker");
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Failed to open Task pane due to :" + e.getMessage());
            assertThat(addNonworker.isDisplayed()).isTrue();
        }
    }

    public void clickAddPendingWorker() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(addPendingWorker), 5);
            assertThat(addPendingWorker.isDisplayed()).isTrue();
            addPendingWorker.click();
            reportWithScreenShot("Select Add a Pending Worker");
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Failed to open Task pane due to :" + e.getMessage());
            assertThat(addPendingWorker.isDisplayed()).isTrue();
        }
    }
}
