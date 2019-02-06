package framework.tests.pages.oracle_fusion_cloud;

import framework.core.drivers.web.WebPage;
import framework.tests.steps.oracle_fusion_cloud.Context;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasePage<T> extends WebPage {

    @FindBy(tagName = "html")
    private WebElement __document;


    public BasePage(Context context) {
        super(context);
        logger.debug("{} loaded", this.getClass().getName());
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

    public String getCurrentDate() {
        //To input current system date into Hire Date Field
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-YYYY");
        Date date = new Date();
        String current_date = dateFormat.format(date);
        return current_date;
    }

    private static void selectFromDropDown(WebElement name, String value) {
        Select dropdown = new Select(name);
        dropdown.selectByVisibleText(value);
    }
}
