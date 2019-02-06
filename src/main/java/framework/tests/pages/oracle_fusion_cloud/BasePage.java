package framework.tests.pages.oracle_fusion_cloud;

import framework.core.drivers.web.WebPage;
import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage<T> extends WebPage {

    Context context;
    Data data;
    boolean status;

    @FindBy(tagName = "html")
    private WebElement __document;

    // Login Page Elements
    @FindBy(id = "userid")
    private WebElement userId;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "btnActive")
    private WebElement signIn;

    // Home Page Elements
    @FindBy(id = "pt1:_UIScmil1u")
    private WebElement userName;

    @FindBy(id = "pt1:_UIScmil1u::icon")
    private WebElement dropDownIcon;

    @FindBy(id = "pt1:_UISlg1")
    private WebElement signOut;

    @FindBy(id = "Confirm")
    private WebElement signOutConfirm;


    public BasePage(Context context) {
        super(context);
        this.context = context;
        this.data = context.getData();
        PageFactory.initElements(driver, this);
        logger.debug("{} loaded", this.getClass().getName());
    }

    @SuppressWarnings("unchecked")
    public T goTo(String link) {
        driver.get(link);
        waitUntilPageLoad();
        return (T) this;
    }

    public void waitUntilPageLoad() {
        try {
            new WebDriverWait(driver, 10).until((ExpectedCondition<Boolean>) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
        } catch (Exception e) {
            logger.error("Exception:waitUntilPageLoad = Error running JavascriptExecutor - {}", e.getMessage());
        }
    }

    public String getPageName() {
        return driver.getTitle();
    }

    // Login Page Related Methods
    public void goTo() {
        try {
            logger.debug("{}:{} called", this.getClass().getName(), "goTo");
            driver.get(context.getEnvironment().getWebUrl());
            waitUntilPageLoad();
            waitShortTime();
            reportWithScreenShot("Go to :" + context.getEnvironment().getWebUrl());
        } catch (Exception e) {
            reportWithScreenShot("Failed while trying to open Url: " + context.getEnvironment().getWebUrl() + " due to :" + e.getMessage());
        }
    }

    // Login Page check available
    public boolean checkLoginPageAvailable() {
        return signIn.isDisplayed();
    }

    // Login Page enter credentials
    public void enterCredentials() {
        try {
            userId.sendKeys(data.getUserName());
            password.sendKeys(data.getPassword());
        } catch (Exception e) {
            reportWithScreenShot("Failed to pass username:" + data.getUserName() + " or Password:" + data.getPassword() + " due to :" + e.getMessage());
        }
    }

    // Login Page perform SignIn
    public void signIn() {
        signIn.click();
    }

    // Home Page Related Methods
    // Home Page check available
    public boolean checkHomePageAvailable() {
        try {
            waitUntilPageLoad();
            reportWithScreenShot("Checking if Home Page is Displayed");
            return userName.isDisplayed();
        } catch (Exception e) {
            reportWithScreenShot("Hope Page not Displayed");
            return false;
        }
    }

    // Signout perform SignOut
    public void signOut() {
        try {
            dropDownIcon.click();
            waitFor(ExpectedConditions.elementToBeClickable(signOut), 5000);
            signOut.click();
        } catch (Exception e) {
            reportWithScreenShot("Unable to Signout due to :" + e.getMessage());
        }

    }

    // Signout Confirm
    public void signOutConfirm() {
        try {
            signOutConfirm.click();
            reportWithScreenShot("Checking if Login Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Login Page not Displayed");
        }
    }

}
