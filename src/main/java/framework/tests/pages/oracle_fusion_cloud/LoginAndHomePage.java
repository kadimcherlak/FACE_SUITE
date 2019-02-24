package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginAndHomePage extends BasePage<LoginAndHomePage> {

    private Context context;
    private Data data;
    private WebElement appWebElement;

    // Login Page Elements
    @FindBy(id = "userid")
    private WebElement userId;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "btnActive")
    private WebElement signIn;

    // Home Page Elements
    @FindBy(xpath = "//a[contains(@class,'AFBrandingLinkColor svg-glob menu')]")
    private WebElement userName;

    @FindBy(id = "pt1:_UIScmil1u::icon")
    private WebElement dropDownButtonForSignOut;

    @FindBy(xpath = "//a[text()='Sign Out']")
    private WebElement signOut;

    @FindBy(id = "Confirm")
    private WebElement signOutConfirm;

    @FindBy(xpath = "//h1[contains(.,'Navigator')]")
    private WebElement navigator;

    @FindBy(linkText = "New Person")
    private WebElement newPerson;

    @FindBy(linkText = "Personal Information")
    private WebElement personalInfoMyDetailsPage;

    //@FindBy(xpath = "(//div[@title='My Details'])[2]")
    @FindBy(xpath = "//h1[@class='xmt '][contains(.,'My Details')]")
    private WebElement empMyDetails;

    //    @FindBy(xpath = "(//div[@title='Edit My Details: Contact Information'])[1]")
    @FindBy(xpath = "//h1[contains(.,'Edit My Details: Contact Information')]")
    private WebElement empMyDetailsContactInfo;

    // @FindBy(xpath = "(//div[@title='Edit My Details: Contacts'])[1]")
    //@FindBy(xpath = "//h1[contains(.,'Edit My Details: Contact Information')]")
    @FindBy(xpath = "//span[@class='section-title'][contains(.,'Contacts')]")
    private WebElement empMyDetailsContactPage;

    @FindBy(linkText = "Person Management")
    private WebElement personManagement;

    // Navigator Screen in Home Page
    @FindBy(className = "svg-icon03")
    private WebElement navigatorOpen;

    // Home Icon in Home Page
    @FindBy(xpath = "//path[@class='svg-outline']")
    private WebElement homeIcon;

    public LoginAndHomePage(Context context) {
        super(context);
        this.context = context;
        this.data = context.getData();
        PageFactory.initElements(driver, this);
        logger.debug("{} loaded", this.getClass().getName());
    }

    // Login Page Related Methods
    public void openUrl() {
        try {
            logger.debug("{}:{} called", this.getClass().getName(), "goTo");
            driver.get(context.getEnvironment().getWebUrl());
            waitUntilPageLoad();
            reportWithScreenShot("Go to :" + context.getEnvironment().getWebUrl());
            assertThat(userId.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Failed while trying to open Url: " + context.getEnvironment().getWebUrl()
                    + " due to :" + e.getMessage());
            assertThat(userId.isDisplayed()).isTrue();
        }
    }

    // Login Page check available
    public void checkLoginPageAvailable() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(signIn), 15);
            assertThat(signIn.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Login Page not available due to :" + e.getMessage());
            assertThat(signIn.isDisplayed()).isTrue();
        }
    }

    // Login Page enter credentials
    public void enterCredentials() {
        try {
            userId.sendKeys(data.getUserName());
            password.sendKeys(data.getPassword());
            assertThat(userId.isDisplayed()).isTrue();
            assertThat(password.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Failed to pass username:" + data.getUserName() + " or Password:" + data.getPassword()
                    + " due to :" + e.getMessage());
            assertThat(userId.isDisplayed()).isTrue();
            assertThat(password.isDisplayed()).isTrue();
        }
    }

    // Login Page perform SignIn
    public void signIn() {
        try {
            assertThat(signIn.isDisplayed()).isTrue();
            signIn.click();
        } catch (Exception e) {
            reportWithScreenShot("Failed to click SignIn button due to: " + e.getMessage());
            assertThat(signIn.isDisplayed()).isTrue();
        }
    }

    // Home Page Related Methods
    // Home Page check available
    public void checkHomePageAvailable() {
        try {
            waitUntilPageLoad();
            assertThat(userName.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Home Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Hope Page not Displayed");
            assertThat(userName.isDisplayed()).isTrue();
        }
    }

    // Navigator Selection Screen
    // New Person selection in Navigator Screen
    public void navigatorScreen() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(navigatorOpen), 5);
            assertThat(navigatorOpen.isDisplayed()).isTrue();
            navigatorOpen.click();
        } catch (Exception e) {
            reportWithScreenShot("Unable to open Navigator Screen");
            assertThat(navigatorOpen.isDisplayed()).isTrue();
        }
    }

    // open Personal Info My Details Page 
    public void navigateToPersonalInfoMyDetailspage() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(personalInfoMyDetailsPage), 5);
            assertThat(personalInfoMyDetailsPage.isDisplayed()).isTrue();
            personalInfoMyDetailsPage.click();
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Unable to open Personal Info My Details Page due to:" + e.getMessage());
            assertThat(personalInfoMyDetailsPage.isDisplayed()).isTrue();
        }
    }

    public void checkEmpMyDetailsPageDisplayed() {
        try {
            waitUntilPageLoad();
            assertThat(empMyDetails.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if My Details Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("My Details Page is not Displayed");
            assertThat(empMyDetails.isDisplayed()).isTrue();
        }
    }

    public void checkEmpMyDetailsContactInfoPageDisplayed() {
        try {
            waitUntilPageLoad();
            assertThat(empMyDetailsContactInfo.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if My Details Contact Info Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("My Details Contact Info Page is not Displayed");
            assertThat(empMyDetailsContactInfo.isDisplayed()).isTrue();
        }
    }

    public void checkEmpMyDetailsContactPageDisplayed() {
        try {
            waitUntilPageLoad();
            assertThat(empMyDetailsContactPage.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if My Details Contact Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("My Details Contact Page is not Displayed");
            assertThat(empMyDetailsContactPage.isDisplayed()).isTrue();
        }
    }


//    // Person Management selection in Navigator Screen
//    public void navigatorPersonManagement() {
//        try {
//            waitFor(ExpectedConditions.elementToBeClickable(personManagement), 15);
//            assertThat(personManagement.isDisplayed()).isTrue();
//            personManagement.click();
//            waitUntilPageLoad();
//            reportWithScreenShot("search screen");
//        } catch (Exception e) {
//            reportWithScreenShot("Unable to open Person Management on Navigator Screen due to:" + e.getMessage());
//            assertThat(personManagement.isDisplayed()).isTrue();
//        }
//    }

    // Common Method to Select Application in Navigator Pane
    public void selectApplicationInNavigatorPane(String applicationName) {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(navigator), 15);
            appWebElement = driver.findElement(By.xpath("//a[text()='" + applicationName + "']"));
            assertThat(appWebElement.isDisplayed()).isTrue();
            reportWithScreenShot("Application :" + applicationName + " selected from Navigator pane");
            appWebElement.click();
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Unable to open :" + applicationName + " due to" + e.getMessage());
            assertThat(appWebElement.isDisplayed()).isTrue();
        }
    }

    // Signout perform SignOut
    public void signOut() {
        try {
            waitNormalTime(); //Few methods unable to click on username and then signout due to timing issue
            //5 seconds wait provided
            waitUntilPageLoad();
            waitFor(ExpectedConditions.elementToBeClickable(userName), 15);
            userName.click();

            waitFor(ExpectedConditions.elementToBeClickable(signOut), 15);
            assertThat(signOut.isDisplayed()).isTrue();
            signOut.click();
        } catch (Exception e) {
            reportWithScreenShot("Unable to Signout due to :" + e.getMessage());
            assertThat(signOut.isDisplayed()).isTrue();
        }
    }

    // Signout Confirm
    public void signOutConfirm() {
        try {
            assertThat(signOutConfirm.isDisplayed()).isTrue();
            waitFor(ExpectedConditions.elementToBeClickable(signOutConfirm), 15);
            signOutConfirm.click();
            reportWithScreenShot("Checking if Login Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Login Page not Displayed due to:" + e.getMessage());
            assertThat(signOutConfirm.isDisplayed()).isTrue();
        }
    }
}
