package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonManagementPage extends BasePage<PersonManagementPage> {

    Context context;
    Data data;

    // Peron Management Page Elements
    @FindBy(id = "userid")
    private WebElement userId;

    public PersonManagementPage(Context context) {
        super(context);
        this.context = context;
        this.data = context.getData();
        PageFactory.initElements(driver, this);
        logger.debug("{} loaded", this.getClass().getName());
    }

    // New Person selection in Navigator Screen
    public void navigatorScreen() {
        try {
        } catch (Exception e) {
            reportWithScreenShot("Unable to open Navigator Screen");
        }
    }
}
