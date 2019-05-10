package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginAndHomePage extends BasePage<LoginAndHomePage> {

    private Context context;
    private Data data;
    private WebElement appWebElement;
    private int elementsize;

    // Login Page Elements
    @FindBy(id = "userid")
    private WebElement userId;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "btnActive")
    private WebElement signIn;

    // Home Page Elements
    //@FindBy(xpath = "//a[contains(@class,'AFBrandingLinkColor svg-glob menu')]")
    @FindBy(xpath = "//img[contains(@id,'pt1:_UIScmil2u::icon')]")
    private WebElement userName;

    @FindBy(xpath = "//a[text()='Sign Out']")
    private WebElement signOut;

    @FindBy(id = "Confirm")
    private WebElement signOutConfirm;

    @FindBy(xpath = "//h1[contains(.,'Navigator')]")
    private WebElement navigator;

    //  @FindBy(linkText = "New Person")
    @FindBy(xpath = "//a[text()='New Person' and contains(@id,'manager_resources')]")
    private WebElement newPerson;

    @FindBy(linkText = "Personal Information")
    private WebElement personalInfoMyDetailsPage;

    //@FindBy(xpath = "//h1[contains(.,'My Details')]")
    //private WebElement empMyDetails;

    @FindBy(xpath = "//h1[contains(.,'Personal Info')]")
    private WebElement personalInfo;

    @FindBy(xpath = "//h1[contains(.,'Edit My Details: Contact Information')]")
    private WebElement empMyDetailsContactInfo;

    @FindBy(xpath = "//span[@class='section-title'][contains(.,'Contacts')]")
    private WebElement empMyDetailsContactPage;

    @FindBy(linkText = "Person Management")
    private WebElement personManagement;

    // Navigator Screen in Home Page
    @FindBy(className = "svg-icon03")
    private WebElement navigatorOpen;

    @FindBy(xpath = "//h1[contains(.,'Navigator')]")
    private WebElement navigatorTitle;

    // Home Icon in Home Page
    @FindBy(xpath = "//path[@class='svg-outline']")
    private WebElement homeIcon;

    @FindBy(xpath = "//a[text()='My Team']")
    private WebElement myTeamIcon;

    @FindBy(xpath = "//*[contains(@aria-label,'Notifications') and contains(@id,'pt1:_UISatr:0:cil1::icon')]")
    private WebElement bellIcon;

    @FindBy(xpath = "//input[contains(@id,'it1::content') and contains(@name,'pt1:_UISatr:0:it1')]")
    private WebElement searchNotification;

    @FindBy(xpath = "//*[contains(@title,'Quick Actions')]")
    private WebElement quickAction;

    @FindBy(xpath = "//a[@title='Home'][contains(@id,'home')]")
    private WebElement homeIconForQuickAction;


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
            Assert.fail();
        }
    }

    // Login Page check available
    public void checkLoginPageAvailable() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(signIn), 15);
            assertThat(signIn.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Login Page not available due to :" + e.getMessage());
            Assert.fail();
        }
    }

    // Login Page enter credentials
    public void enterCredentials() {
        try {
            waitFor(ExpectedConditions.visibilityOf(userId), 15);
            userId.sendKeys(data.getUserName());
            waitFor(ExpectedConditions.visibilityOf(password), 15);
            password.sendKeys(data.getPassword());
            assertThat(userId.isDisplayed()).isTrue();
            assertThat(password.isDisplayed()).isTrue();
        } catch (Exception e) {
            reportWithScreenShot("Failed to pass username:" + data.getUserName() + " or Password:" + data.getPassword()
                    + " due to :" + e.getMessage());
            Assert.fail();
        }
    }

    // Login Page perform SignIn
    public void signIn() {
        try {
            assertThat(signIn.isDisplayed()).isTrue();
            signIn.click();
        } catch (Exception e) {
            reportWithScreenShot("Failed to click SignIn button due to: " + e.getMessage());
            Assert.fail();
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
            Assert.fail();
        }
    }

    // Navigator Selection Screen
    // New Person selection in Navigator Screen
    public void navigatorScreen() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(navigatorOpen), 15);
            assertThat(navigatorOpen.isDisplayed()).isTrue();
            navigatorOpen.click();
            waitFor(ExpectedConditions.visibilityOf(navigatorTitle), 15);
            reportWithScreenShot("User open Navigator Screen");
        } catch (Exception e) {
            reportWithScreenShot("Unable to open Navigator Screen");
            Assert.fail();
        }
    }

    //Check for Personal Info page is displayed
    public void checkPersonalInfoPageDisplayed() {
        try {
            waitUntilPageLoad();
            assertThat(personalInfo.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if Personal Info Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Personal Info Page is not Displayed");
            Assert.fail();
        }
    }

    public void checkEmpMyDetailsContactInfoPageDisplayed() {
        try {
            waitUntilPageLoad();
            assertThat(empMyDetailsContactInfo.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if My Details Contact Info Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("My Details Contact Info Page is not Displayed");
            Assert.fail();
        }
    }


    public void checkEmpMyDetailsContactPageDisplayed() {
        try {
            waitUntilPageLoad();
            assertThat(empMyDetailsContactPage.isDisplayed()).isTrue();
            reportWithScreenShot("Checking if My Details Contact Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("My Details Contact Page is not Displayed");
            Assert.fail();
        }
    }

    // Common Method to Select Application in Navigator Pane
    public void selectLinkInNavigatorPane(String linkName) {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(navigator), 15);
            clickLinkElement(linkName);
        } catch (Exception e) {
            reportWithScreenShot("Unable to open :" + linkName + " due to" + e.getMessage());
            Assert.fail();
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
            reportWithScreenShot("User clicked Signout");
        } catch (Exception e) {
            reportWithScreenShot("Unable to Signout due to :" + e.getMessage());
            Assert.fail();
        }
    }

    // Signout Confirm
    public void signOutConfirm() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(signOutConfirm), 15);
            assertThat(signOutConfirm.isDisplayed()).isTrue();
            signOutConfirm.click();
            reportWithScreenShot("Checking if Login Page is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Login Page not Displayed due to:" + e.getMessage());
            Assert.fail();
        }
    }

    public void clickBellIcon() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(bellIcon), 15);
            assertThat(bellIcon.isDisplayed()).isTrue();
            bellIcon.click();
            reportWithScreenShot("Checking if Bell Icon is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Bell Icon not Displayed due to:" + e.getMessage());
            Assert.fail();
        }
    }

    public void checkNotification() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(searchNotification), 15);
            searchNotification.clear();
            waitShortTime();
            searchNotification.sendKeys(csvReader().get("personNumber"));
            waitNormalTime();
            searchNotification.sendKeys(Keys.ENTER);
            reportWithScreenShot("Checking if Search Value is Displayed");
        } catch (Exception e) {
            reportWithScreenShot("Search value not Displayed due to:" + e.getMessage());
            Assert.fail();
        }
    }

    public void checkApproved() {
        try {

            // Check for Employee for max 60 seconds
            elementsize = driver
                    .findElements(By.xpath("//a[contains(@id,':0:gl2') and contains(@title,'" + csvReader().get("personNumber") + "') and contains(@title,'Approved:')]")).size();
            int counter = 0;
            while (elementsize == 0 && counter <= 10) {
                checkNotification();
                elementsize = driver
                        .findElements(By.xpath("//a[contains(@id,':0:gl2') and contains(@title,'" + csvReader().get("personNumber") + "') and contains(@title,'Approved:')]")).size();
                waitShortTime();
                counter++;
            }

            if (elementsize == 1) {
                waitFor(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(@id,':0:gl2') and contains(@title,'" + csvReader().get("personNumber") + "') and contains(@title,'Approved:')]"))), 15);
                assertThat(driver.findElement(By.xpath("//a[contains(@id,':0:gl2') and contains(@title,'" + csvReader().get("personNumber") + "') and contains(@title,'Approved:')]")).isDisplayed()).isTrue();
                reportWithScreenShot("Termination/Retirement is present");
            } else if (elementsize == 0 || elementsize > 0) {
                // Throw Exception if Person name now found after 60 seconds
                throw new Exception("Person number not present in Notification for Approved Termination/Retirement");
            }

        } catch (Exception e) {
            reportWithScreenShot("Termination/Retirement is not present:" + e.getMessage());
            Assert.fail();
        }
    }


    /**
     * User clicks on quick action link
     *
     * @author Rakesh
     */
    public void navigateToQuickAction() {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(homeIconForQuickAction), 15);
            homeIconForQuickAction.click();
            waitFor(ExpectedConditions.elementToBeClickable(quickAction), 15);
            quickAction.click();
            reportWithScreenShot("Clicked on the Quick Action Menu :");
        } catch (Exception e) {
            reportWithScreenShot("Error while clicking on quick action link:" + e.getMessage());
            Assert.fail();
        }
    }
}
