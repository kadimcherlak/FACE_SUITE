package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginAndHomePage extends BasePage<LoginAndHomePage> {

    Context context;
    Data data;

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

    @FindBy(xpath = "//a[contains(@class,'AFBrandingLinkColor svg-glob menu')]//img")
    private WebElement dropDownButtonForSignOut;

    @FindBy(xpath = "//a[text()='Sign Out']")
    private WebElement signOut;

    @FindBy(id = "Confirm")
    private WebElement signOutConfirm;

    @FindBy(linkText = "New Person")
    private WebElement newPerson;

    @FindBy(linkText = "Personal Information")
    private WebElement personalInfoMyDetailsPage;

    @FindBy(xpath = "(//div[@title='My Details'])[2]")
    private WebElement empMyDetails;

    @FindBy(xpath = "(//div[@title='Edit My Details: Contact Information'])[1]")
    private WebElement empMyDetailsContactInfo;

    @FindBy(xpath = "(//div[@title='Edit My Details: Contacts'])[1]")
    private WebElement empMyDetailsContactPage;

    @FindBy(linkText = "Person Management")
    private WebElement personManagement;

    // Navigator Screen in Home Page
    @FindBy(className = "svg-icon03")
    private WebElement navigatorOpen;

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
            assertThat(false).isTrue();
        }
    }

    // Login Page check available
    public void checkLoginPageAvailable() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(signIn), 15);
            assertThat(signIn.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Login Page not available due to :" + e.getMessage());
            assertThat(false).isTrue();
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
            assertThat(false).isTrue();
        }
    }

    // Login Page perform SignIn
    public void signIn() {
        try {
            assertThat(signIn.isDisplayed()).isTrue();
            signIn.click();
        } catch (Exception e) {
            reportWithScreenShot("Failed to click SignIn button due to: " + e.getMessage());
            assertThat(false).isTrue();
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
            assertThat(false).isTrue();
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
            assertThat(false).isTrue();
        }
    }

    // New Person selection in Navigator Screen
    public void navigatorScreenNewPersonSelect() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(newPerson), 5);
            assertThat(newPerson.isDisplayed()).isTrue();
            newPerson.click();
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Unable to open New Person on Navigator Screen due to:" + e.getMessage());
            assertThat(false).isTrue();
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
            assertThat(false).isTrue();
        }
    }

    public void checkEmpMyDetailsPageDisplayed() {
        try {
            waitUntilPageLoad();
            assertThat(empMyDetails.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if My Details Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("My Details Page is not Displayed");
            assertThat(false).isTrue();
        }
    }

    public void checkEmpMyDetailsContactInfoPageDisplayed() {
        try {
            waitUntilPageLoad();
            assertThat(empMyDetailsContactInfo.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if My Details Contact Info Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("My Details Contact Info Page is not Displayed");
            assertThat(false).isTrue();
        }
    }

    public void checkEmpMyDetailsContactPageDisplayed() {
        try {
            waitUntilPageLoad();
            assertThat(empMyDetailsContactPage.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if My Details Contact Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("My Details Contact Page is not Displayed");
            assertThat(false).isTrue();
        }
    }


    // Person Management selection in Navigator Screen
    public void navigatorPersonManagement() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(personManagement), 5);
            personManagement.click();
            waitUntilPageLoad();
            assertThat(personManagement.isDisplayed()).isTrue();
            reportWithScreenShot("search screen");
        } catch (Exception e) {
            reportWithScreenShot("Unable to open Person Management on Navigator Screen due to:" + e.getMessage());
            assertThat(false).isTrue();
        }
    }

    /*// Search for Person created in Person Management Screen
    public void searchPerson() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(personManagement), 5);
            personManagement.click();
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Unable to open Person Management on Navigator Screen due to:" + e.getMessage());
        }
    }*/


    // Signout perform SignOut
    public void signOut() {
        try {
            dropDownButtonForSignOut.click();
            waitFor(ExpectedConditions.elementToBeClickable(signOut), 5);
            assertThat(signOut.isDisplayed()).isTrue();
            signOut.click();
        } catch (Exception e) {
            reportWithScreenShot("Unable to Signout due to :" + e.getMessage());
            assertThat(false).isTrue();
        }
    }

    // Signout Confirm
    public void signOutConfirm() {
        try {
            assertThat(signOutConfirm.isDisplayed()).isTrue();
            signOutConfirm.click();
            reportWithScreenShot("Checking if Login Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Login Page not Displayed due to:" + e.getMessage());
            assertThat(false).isTrue();
        }
    }
}
