package framework.tests.pages.oracle_fusion_cloud;

import framework.tests.steps.oracle_fusion_cloud.Context;
import framework.tests.steps.oracle_fusion_cloud.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonManagementPage extends BasePage<PersonManagementPage> {

    Context context;
    Data data;

    // Hire An Employee Page Elements

    @FindBy(linkText = "My Team")
    private WebElement myTeam;

    @FindBy(xpath = "//*[text()='Person Management: Search']")
    private WebElement personManagementSearch;

    @FindBy(xpath = "//label[text()='Keywords']/following::input[1]")
    private WebElement keywords;

    @FindBy(xpath = "//label[text()='Effective As-of Date']/following::input[1]")
    private WebElement effectiveAsOfDate;

    @FindBy(xpath = "//button[text()='Search']")
    private WebElement searchBtn;

    @FindBy(xpath = "//img[@title='Actions']")
    private WebElement actionsBtn;

    public PersonManagementPage(Context context) {
        super(context);
        this.context = context;
        this.data = context.getData();
        PageFactory.initElements(driver, this);
        logger.debug("{} loaded", this.getClass().getName());
    }


}
