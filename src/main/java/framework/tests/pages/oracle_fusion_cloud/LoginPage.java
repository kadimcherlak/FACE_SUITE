package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage<LoginPage> {

    Context context;
    Data data;
    boolean status;

    // Locators in Login Page
    @FindBy(id = "userid")
    private WebElement userId;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "btnActive")
    private WebElement signIn;

    // Login page constructor
    public LoginPage(Context context) {
        super(context);
        this.context = context;
        this.data = context.getData();
        PageFactory.initElements(driver, this);
        logger.debug("{} loaded", this.getClass().getName());
    }

    public void goTo() {
        logger.debug("{}:{} called", this.getClass().getName(), "goTo");
        driver.get(context.getEnvironment().getWebUrl());
        waitUntilPageLoad();
        waitShortTime();
        reportWithScreenShot("Got to :" + context.getEnvironment().getWebUrl());
    }

    // Login Page check available
    public boolean checkPageAvailable(){
        return signIn.isDisplayed();
    }

    // Login Page enter credentials
    public void enterCredentials() {
        userId.sendKeys(data.getUserId());
        password.sendKeys(data.getPassword());
    }

    // Login Page perform SignIn
    public void signIn() {
        signIn.click();
    }
}
