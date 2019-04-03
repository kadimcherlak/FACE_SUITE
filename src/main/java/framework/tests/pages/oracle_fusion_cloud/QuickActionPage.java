package framework.tests.pages.oracle_fusion_cloud;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import junit.framework.Assert;

public class QuickActionPage extends BasePage<QuickActionPage> {

	Context context;
	Data data;
	
	@FindBy(xpath = "(//span[text()='Quick Actions'])[2]")
    private WebElement quickActionHeaderText;
	
	@FindBy(xpath = "(//span[text()='Quick Actions'])[2]/following::a[2]")
    private WebElement quickActionDropdown;
	
	@FindBy(xpath = "//input[contains(@type,'search')][@placeholder='Search person']")
    private WebElement quickActionSearchPerson;
	
	@FindBy(xpath = "//img[@title='Search for a Person']")
    private WebElement quickActionSearchPersonButton;
	
	@FindBy(xpath = "//h1[text()='Terminate Work Relationship']")
    private WebElement terminateWorkRelationshipPageHeaderText;

	public QuickActionPage(Context context) {

		super(context);
		this.context = context;
		this.data = context.getData();
		PageFactory.initElements(driver, this);
		logger.debug("{} loaded", this.getClass().getName());

	}
	
	
    /**
     * This method will validate that Quick Action Page is displayed
     * @author Rakesh
     */
    public void validateQuickActionPageDisplayed() {

        try {
            waitFor(ExpectedConditions.visibilityOf(quickActionHeaderText), 30);
            Assertions.assertThat(quickActionHeaderText.isDisplayed()).isTrue();
            reportWithScreenShot("Quick Action Page has been displayed:");
        } catch (Exception e) {
            reportWithScreenShot("Quick Action Page has not been displayed:");
            Assert.fail();

        }
    }
    
	/**
	 * This method will enter the person name created from new hire and select
	 * from the list
	 * 
	 * @author Rakesh
	 */
	public void selectPersonFromQuickActionDropdown() {

		try {
			String personName = csvReader()[1];
			String personXpathAfterSelection = "(//span[text()='Quick Actions'])[2]/following::a[2]/descendant::span[text()='"
					+ personName + "']";
			String personNameXpath = "(//a[text()='" + personName.trim() + "'])[1]";
			waitFor(ExpectedConditions.elementToBeClickable(quickActionDropdown), 15);
			quickActionDropdown.click();
			waitFor(ExpectedConditions.elementToBeClickable(quickActionSearchPerson), 15);
			quickActionSearchPerson.clear();
			quickActionSearchPerson.sendKeys(personName);
			waitFor(ExpectedConditions.elementToBeClickable(quickActionSearchPersonButton), 15);
			quickActionSearchPersonButton.click();
			Assert.assertTrue("Change Manager Link is not enabled",
					waitForDynamicXpathLinkToBeEnabled(personNameXpath));
			driver.findElement(By.xpath(personNameXpath)).click();
			Assert.assertTrue("Change Manager Link is not enabled",
					waitForDynamicXpathLinkToBeEnabled(personXpathAfterSelection));
			reportWithScreenShot("Person Name has been selected:");

		} catch (Exception e) {
			reportWithScreenShot("Error while selecting Person Name from the dropdown:");
			Assert.fail();

		}
	}
	
	/**
	 * This method will click on the Quick Action Menu Link as passed
	 * 
	 * @author Rakesh
	 */
	public void clickQuickActionMenuLink(String linkName) {

		try {
			String quickActionMenuXpath = "//a[@title='"+linkName+"']";
			Assert.assertTrue("Quick Action menu is not clicked :", clickOnQuickActionMenu(quickActionMenuXpath));

		} catch (Exception e) {
			reportWithScreenShot("Error while selecting Person Name from the dropdown:");
			Assert.fail();

		}
	}
	
	/**
	 * This method will handle those link to be enabled for which xpath is
	 * composed on the fly
	 * 
	 * @param xpath
	 * @return
	 * @author Rakesh
	 */
	public boolean clickOnQuickActionMenu(String xpath) {
		int counter = 0;
		int noOfOccurrance = 0;
		while (counter < 20) {
			try {
				noOfOccurrance = driver.findElements(By.xpath(xpath)).size();
				if (noOfOccurrance == 1) {
					driver.findElement(By.xpath(xpath)).click();
				} else if (noOfOccurrance > 1) {
					List<WebElement> allQuickActionLink = new ArrayList<WebElement>();
					allQuickActionLink = driver.findElements(By.xpath(xpath));
					for (int i = 0; i < allQuickActionLink.size(); i++) {
						try {
							allQuickActionLink.get(i).click();
							return true;
						} catch (Exception er) {
							System.out.println("More than one link availale with same name, trying another one");
						}
					}
				}

			} catch (Exception e) {
				waitShortTime();
				counter++;
			}
		}
		return false;

	}
	
	/**
     * This method will validate if Terminate Work Relationship Page is displayed
     * @author Rakesh
     */
    public void validateTerminateWorkRelationshipPageDisplayed() {

        try {
            waitFor(ExpectedConditions.visibilityOf(terminateWorkRelationshipPageHeaderText), 30);
            Assertions.assertThat(terminateWorkRelationshipPageHeaderText.isDisplayed()).isTrue();
            reportWithScreenShot("Terminate Work Relationship Page Displayed:");
        } catch (Exception e) {
            reportWithScreenShot("Terminate Work Relationship Page has not been displayed:");
            Assert.fail();

        }
    }

}
