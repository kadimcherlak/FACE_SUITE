package framework.template;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import framework.core.CucumberRunnerOptions;
import framework.core.drivers.Core;
import framework.core.models.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

@CucumberOptions(
		glue = "framework.tests.steps.oracle_fusion_cloud",
        features = {"target/parallel/features/[CUCABLE:FEATURE].feature"},
        plugin = {"json:target/test-output/reports/json/[CUCABLE:RUNNER].json"})
public class CucableJavaTemplate {

private static final Logger logger = LogManager.getLogger(CucableJavaTemplate.class);
private static TestNGCucumberRunner runner;
private static Config config;

public CucableJavaTemplate() {
}

@BeforeClass
public void setup() {
try {

	StringWriter writer = new StringWriter();
	Properties props = System.getProperties();
	props.list(new PrintWriter(writer));
	logger.info("System properties set at runtime: {}", writer.toString());

	Core.initialize();
	config = Core.getConfig();
	CucumberRunnerOptions.load(config.getTestConfig());
	runner = new TestNGCucumberRunner(CucableJavaTemplate.class);
} catch (Exception e) {
	logger.error("Exception:setup = Failed to set up Cucumber - {}", e.getMessage());
	e.printStackTrace();
}
}

@Test(dataProvider = "scenarios")
public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
runner.runScenario(pickleEvent.getPickleEvent());
}

@AfterClass
public void teardown() {
if (!Core.isDriverNull()) {
	Core.stopWebDriver();
}
logger.debug("Writing reports");
runner.finish();
}


@DataProvider
private Object[][] scenarios() {
return runner.provideScenarios();
}

}
