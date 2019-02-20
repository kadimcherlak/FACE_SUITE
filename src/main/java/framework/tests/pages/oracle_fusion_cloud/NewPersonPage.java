package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewPersonPage extends BasePage<NewPersonPage> {

    Context context;
    Data data;

    // Ner Person Page Elements
    @FindBy(xpath = "//img[@title='Tasks']")
    private WebElement taskButton;

    @FindBy(xpath = "//a[text()='Hire an Employee']")

    private WebElement hireAndEmployee;


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
            taskButton.click();
        } catch (Exception e) {
            reportWithScreenShot("Failed to open Task pane due to :" + e.getMessage());
        }
    }

    public void clickHireAnEmployee() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(hireAndEmployee), 5);
            hireAndEmployee.click();
            reportWithScreenShot("Select Hire An Employee");
        } catch (Exception e) {
            reportWithScreenShot("Failed to open Task pane due to :" + e.getMessage());
        }
    }
}
