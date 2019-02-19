package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
    private WebElement PersonalInfoMyDetailsPage;
    
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
        } catch (Exception e) {
            reportWithScreenShot("Failed while trying to open Url: " + context.getEnvironment().getWebUrl()
                    + " due to :" + e.getMessage());
        }
    }

    // Login Page check available
    public boolean checkLoginPageAvailable() {
        waitFor(ExpectedConditions.elementToBeClickable(signIn), 15);
        return signIn.isDisplayed();
    }

    // Login Page enter credentials
    public void enterCredentials() {
        try {
            userId.sendKeys(data.getUserName());
            password.sendKeys(data.getPassword());
        } catch (Exception e) {
            reportWithScreenShot("Failed to pass username:" + data.getUserName() + " or Password:" + data.getPassword()
                    + " due to :" + e.getMessage());
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

    // Navigator Selection Screen
    // New Person selection in Navigator Screen
    public void navigatorScreen() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(navigatorOpen), 5);
            navigatorOpen.click();
        } catch (Exception e) {
            reportWithScreenShot("Unable to open Navigator Screen");
        }
    }

    // New Person selection in Navigator Screen
    public void navigatorScreenNewPersonSelect() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(newPerson), 5);
            newPerson.click();
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Unable to open New Person on Navigator Screen due to:" + e.getMessage());
        }
    }
    
    // open Personal Info My Details Page 
    public void navigateToPersonalInfoMyDetailspage() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(PersonalInfoMyDetailsPage), 5);
            PersonalInfoMyDetailsPage.click();
            waitUntilPageLoad();
        } catch (Exception e) {
            reportWithScreenShot("Unable to open Personal Info My Details Page due to:" + e.getMessage());
        }
    }
    
    public boolean checkEmpMyDetailsPageDisplayed() {
        try {
            waitUntilPageLoad();
            reportWithScreenShot("Checking if My Details Page is Displayed");
            return empMyDetails.isDisplayed();
        } catch (Exception e) {
            reportWithScreenShot("My Details Page is not Displayed");
            return false;
        }
    }
    
    public boolean checkEmpMyDetailsContactInfoPageDisplayed() {
        try {
            waitUntilPageLoad();
            reportWithScreenShot("Checking if My Details Contact Info Page is Displayed");
            return empMyDetailsContactInfo.isDisplayed();
        } catch (Exception e) {
            reportWithScreenShot("My Details Contact Info Page is not Displayed");
            return false;
        }
    }
    
    public boolean checkEmpMyDetailsContactPageDisplayed() {
        try {
            waitUntilPageLoad();
            reportWithScreenShot("Checking if My Details Contact Page is Displayed");
            return empMyDetailsContactPage.isDisplayed();
        } catch (Exception e) {
            reportWithScreenShot("My Details Contact Page is not Displayed");
            return false;
        }
    }
    
    

    // Person Management selection in Navigator Screen
    public void navigatorPersonManagement() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(personManagement), 5);
            personManagement.click();
            waitUntilPageLoad();
            reportWithScreenShot("search screen");
        } catch (Exception e) {
            reportWithScreenShot("Unable to open Person Management on Navigator Screen due to:" + e.getMessage());
        }
    }

// // Search for Person created in Person Management Screen
//    public void searchPerson() {
//        try {
//            waitFor(ExpectedConditions.elementToBeClickable(personManagement), 5);
//            personManagement.click();
//            waitUntilPageLoad();
//        } catch (Exception e) {
//            reportWithScreenShot("Unable to open Person Management on Navigator Screen due to:" + e.getMessage());
//        }
//    }
//    

    // Signout perform SignOut
    public void signOut() {
        try {
            dropDownButtonForSignOut.click();
            waitFor(ExpectedConditions.elementToBeClickable(signOut), 5);
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
            reportWithScreenShot("Login Page not Displayed due to:" + e.getMessage());
        }
    }
}
