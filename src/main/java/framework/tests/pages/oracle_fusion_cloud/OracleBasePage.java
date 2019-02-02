package framework.tests.pages.oracle_fusion_cloud;

import framework.core.drivers.web.WebPage;
import framework.tests.steps.oracle_fusion_cloud.Context;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OracleBasePage<T> extends WebPage {

    @FindBy(tagName = "html")
    private WebElement __document;

    public OracleBasePage(Context context) {
        super(context);
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

}
