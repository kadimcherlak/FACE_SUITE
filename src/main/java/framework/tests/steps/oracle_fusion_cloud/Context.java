package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import framework.core.drivers.Core;
import framework.core.models.Config;
import framework.core.models.DataStore;
import framework.core.models.Environment;
import framework.core.utils.DataLoader;
import framework.core.utils.HighLight;
import framework.tests.pages.oracle_fusion_cloud.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.File;

import static framework.core.drivers.Core.getWebDriver;

public class Context extends framework.core.models.Context {
    public LoginAndHomePage loginAndHome;
    public BasePage basePage;
    public NewPersonPage newPerson;
    public HireAnEmployeePage hireAnEmployee;
    public EmployeeEditMyDetailsPage employeeEditMyDetails;
    public LineManagerPage lineManager;
    public PersonManagementPage personManagment;
    public ManageCalendarEventsPage manageCalendarEvents;
    public QuickActionPage quickActionPage;
    public String scenarioName = null;
    private Logger logger = LogManager.getLogger(Context.class);
    private WebDriver driver;
    private Config config;
    private Environment environment;
    private HighLight highLight;
    private DataStore dataStore = new DataStore();
    private Data data = new Data();

    public Context() {
        logger.debug("Initializing context");
        environment = Core.getEnvironment();
        config = Core.getConfig();
    }

    public Logger getLogger() {
        return logger;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Config getConfig() {
        return config;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public Data getData() {
        return data;
    }

    public void setData(String key) {
        this.scenarioName = key;
        data = (Data) dataStore.getNode(key);
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        logger.debug("Initialized driver at the context layer");

        setScenario(scenario);
        logger.debug("Starting Feature: {} - Scenario: {}", getFeatureFile(scenario.getId()), scenario.getName());
        logger.debug("Initialized dataStore at the context layer");

    }

    public void setExcelDataStore(String excelName, String sheetName) {
        try {
            if (System.getProperty("testFile").isEmpty())
                // Code to Load Date from Excel file
                dataStore = DataLoader.loadDataStroreFromExcel(getPath() + File.separator + excelName, sheetName, data);
            else
                // Use the Test File passed from maven command
                dataStore = DataLoader.loadDataStroreFromExcel(System.getProperty("testFile"), sheetName, data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDriver() {
        driver = getWebDriver();
        highLight = new HighLight(driver);
    }

    @After
    public void afterScenario(Scenario scenario) {
        logger.debug("Finishing Feature: {} - Scenario: {}", getFeatureFile(scenario.getId()), scenario.getName());
        logger.debug("STATUS: {}", scenario.getStatus());
        System.out.println(scenario.getStatus());
        if (scenario.getStatus().toString().equalsIgnoreCase("FAILED")) {
            driver.quit();
        }
    }

    private String getFeatureFile(String scenarioId) {
        return scenarioId.substring(0, scenarioId.lastIndexOf(":"));
    }

    private String getFeatureDataFile(String scenarioId) {
        int index = getFeatureFile(scenarioId).lastIndexOf(".");
        //return getFeatureFile(scenarioId).substring(0, index) + ".yaml";
        return getFeatureFile(scenarioId).substring(0, index) + ".xlsx";
    }

    public String getPath() {
        return System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "testdata";
    }

    public void setPages(Context context) {
        lineManager = new LineManagerPage(context);
        employeeEditMyDetails = new EmployeeEditMyDetailsPage(context);
        hireAnEmployee = new HireAnEmployeePage(context);
        loginAndHome = new LoginAndHomePage(context);
        newPerson = new NewPersonPage(context);
        personManagment = new PersonManagementPage(context);
        manageCalendarEvents = new ManageCalendarEventsPage(context);
        quickActionPage = new QuickActionPage(context);
    }

}
