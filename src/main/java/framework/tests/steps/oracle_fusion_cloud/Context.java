package framework.tests.steps.oracle_fusion_cloud;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import framework.core.drivers.Core;
import framework.core.models.Config;
import framework.core.models.DataStore;
import framework.core.models.Environment;
import framework.core.utils.DataLoader;
import framework.tests.pages.oracle_fusion_cloud.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Context extends framework.core.models.Context {
    private Logger logger = LogManager.getLogger(Context.class);
    private WebDriver driver;
    private Config config;
    private Environment environment;
    private DataStore dataStore = new DataStore();
    private Data data = new Data();
    public LoginAndHomePage loginAndHome;
    public NewPersonPage newPerson;
    public HireAnEmployeePage hireAnEmployee;
    public EmployeeEditMyDetailsPage employeeEditMyDetails;
    public ChangeManagerPage changeManager;
    
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
        data = (Data) dataStore.getNode(key);
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        setScenario(scenario);
        logger.debug("Starting Feature: {} - Scenario: {}", getFeatureFile(scenario.getId()), scenario.getName());

        dataStore = DataLoader.loadDataStoreFromYaml(getFeatureDataFile(scenario.getId()), data);
        logger.debug("Initialized dataStore at the context layer");

        driver = Core.getWebDriver();
        logger.debug("Initialized driver at the context layer");

    }

    @After
    public void afterScenario(Scenario scenario) {
        logger.debug("Finishing Feature: {} - Scenario: {}", getFeatureFile(scenario.getId()), scenario.getName());
        logger.debug("STATUS: {}", scenario.getStatus());
    }

    private String getFeatureFile(String scenarioId) {
        return scenarioId.substring(0, scenarioId.lastIndexOf(":"));
    }

    private String getFeatureDataFile(String scenarioId) {
        int index = getFeatureFile(scenarioId).lastIndexOf(".");
        return getFeatureFile(scenarioId).substring(0, index) + ".yaml";
    }

    public void setPages(Context context) {
        changeManager = new ChangeManagerPage(context);
        employeeEditMyDetails = new EmployeeEditMyDetailsPage(context);
        hireAnEmployee = new HireAnEmployeePage(context);
        loginAndHome = new LoginAndHomePage(context);
        newPerson = new NewPersonPage(context);
    }

//    public List getPages() {
//        List pages = new ArrayList();
//        pages.add(changeManager);
//        pages.add(employeeEditMyDetails);
//        pages.add(hireAnEmployee);
//        pages.add(employeeEditMyDetails);
//        pages.add(newPerson);
//        return pages;
//    }
}