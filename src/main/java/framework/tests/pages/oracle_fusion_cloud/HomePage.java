package framework.tests.pages.oracle_fusion_cloud;

import framework.core.exceptions.FrameworkException;
import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends OracleBasePage<HomePage> {

    Context context;
    Data data;
    boolean status;

    // Locators in Login Page
    @FindBy(id = "pt1:_UIScmil1u")
    private WebElement userName;

    public HomePage(Context context) {
        super(context);
        this.context = context;
        this.data = context.getData();
        PageFactory.initElements(driver, this);
        logger.debug("{} loaded", this.getClass().getName());
    }

    // Home Page check available
    public boolean checkPageAvailable(){
        waitUntilPageLoad();
        report("Checking if Home Page is Displayed");
        return userName.isDisplayed();
    }

}
