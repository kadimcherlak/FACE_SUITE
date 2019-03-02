package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
}
