package framework.tests.utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class Fusion_USNH25 {

    static int waitTime = 70;
    DataFormatter dataFormatter = new DataFormatter();

    public static void main(String[] args) throws InterruptedException, IOException, AWTException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Application Login Url
        driver.get(UIElements.URL);

        //Data input from Excel
        FileInputStream file = new FileInputStream(
                new File("C:\\Users\\somu.suganya\\Desktop\\Input_data.xlsx"));
        XSSFWorkbook Workbook = new XSSFWorkbook(file);
        XSSFSheet InputSheet = Workbook.getSheet("Sheet1");
        DataFormatter df = new DataFormatter();

        enterTextByName(driver, "userid", UIElements.LoginID);
        enterTextByName(driver, "password", UIElements.Password);
        clickByXpath(driver, UIElements.Signin_Xpath);
        clickByXpath(driver, UIElements.Menu_Xpath);
        clickByID(driver, UIElements.NewPerson_ID);
        clickByID(driver, UIElements.Task_ID);
        clickByID(driver, UIElements.Hire_Emp_ID);

        //***********Hire an Employee: Identification section*******************

        //To input current system date into Hire Date Field
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-YYYY");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        sendByXpath(driver, UIElements.Hire_Date_ID, date1);
        SelectDrop_ID(driver, UIElements.Hire_Action_ID, InputSheet.getRow(3).getCell(1).getStringCellValue());
        SelectDrop(driver, UIElements.Hire_Reason_name, InputSheet.getRow(4).getCell(1).getStringCellValue());
        enterTextByName(driver, UIElements.Legal_Emp_name, InputSheet.getRow(5).getCell(1).getStringCellValue());
        String Worker_type = driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div[1]/div/div/div/div[4]/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/table/tbody/tr/td/div/div[1]/div/div/div[2]/div/div[1]/div[1]/div/div/div[1]/div/div[1]/table/tbody/tr/td[1]/div/div/div/div/div[1]/div[2]/table/tbody/tr/td[1]/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/span/div[1]/div[2]/div/div[1]/table/tbody/tr/td/table/tbody/tr[8]/td[2]")).getText();
        if (Worker_type.equalsIgnoreCase(InputSheet.getRow(6).getCell(1).getStringCellValue())) {
            Actions action = new Actions(driver);
            action.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(500);
            enterTextByName(driver, UIElements.Last_Name_name, InputSheet.getRow(7).getCell(1).getStringCellValue());
            enterTextByName(driver, UIElements.First_Name_name, InputSheet.getRow(8).getCell(1).getStringCellValue());
            SelectDrop(driver, UIElements.Gender_name, InputSheet.getRow(9).getCell(1).getStringCellValue());
            enterTextByName(driver, UIElements.DOB_name, df.formatCellValue(InputSheet.getRow(10).getCell(1)));
            SelectDrop(driver, UIElements.Email_Req_name, InputSheet.getRow(11).getCell(1).getStringCellValue());

            //Unable to click on add Button so used Keyboard event
            Thread.sleep(500);
            action.sendKeys(Keys.TAB).build().perform();
            action.sendKeys(Keys.TAB).build().perform();
            action.sendKeys(Keys.TAB).build().perform();
            action.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(500);
            action.sendKeys(Keys.ENTER).build().perform();

            enterTextByName(driver, UIElements.Country_name, InputSheet.getRow(12).getCell(1).getStringCellValue());
            SelectDrop(driver, UIElements.National_ID_Type_name, InputSheet.getRow(13).getCell(1).getStringCellValue());
            enterTextByName(driver, UIElements.National_ID_name, df.formatCellValue(InputSheet.getRow(14).getCell(1)));
            clickByXpath(driver, UIElements.Next1_Xpath);

            // ***********Hire an Employee: Person Information*******************

            sendByXpath(driver, UIElements.Address_Line1_Xpath, InputSheet.getRow(16).getCell(1).getStringCellValue());
            SelectListBox(driver, UIElements.Address_Line2_Xpath, InputSheet.getRow(17).getCell(1).getStringCellValue());
            SelectListBox(driver, UIElements.Zipcode_Xpath, df.formatCellValue(InputSheet.getRow(18).getCell(1)));
            SelectListBox(driver, UIElements.City_Xpath, InputSheet.getRow(19).getCell(1).getStringCellValue());
            SelectListBox(driver, UIElements.County_Xpath, InputSheet.getRow(20).getCell(1).getStringCellValue());
            SelectListBox(driver, UIElements.State_Xpath, InputSheet.getRow(21).getCell(1).getStringCellValue());

            // Unable to click on add Button so used Keyboard event
            Thread.sleep(500);
            action.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(500);
            action.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(500);
            action.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(500);
            action.sendKeys(Keys.TAB).build().perform();
            action.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(500);
            action.sendKeys(Keys.ENTER).build().perform();
            SelectDrop(driver, UIElements.Phone_type_name, InputSheet.getRow(22).getCell(1).getStringCellValue());
            enterTextByName(driver, UIElements.Country_code_name, df.formatCellValue(InputSheet.getRow(23).getCell(1)));
            enterTextByName(driver, UIElements.Phone_number_name, df.formatCellValue(InputSheet.getRow(24).getCell(1)));

            //Unable to click on add Button so used Keyboard event
            Thread.sleep(500);
            action.sendKeys(Keys.TAB).build().perform();
            action.sendKeys(Keys.TAB).build().perform();
            action.sendKeys(Keys.TAB).build().perform();
            action.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(500);
            action.sendKeys(Keys.ENTER).build().perform();
            SelectDrop(driver, UIElements.Email_Type_name, InputSheet.getRow(25).getCell(1).getStringCellValue());
            enterTextByName(driver, UIElements.Email_name, df.formatCellValue(InputSheet.getRow(26).getCell(1)));
            SelectDrop(driver, UIElements.Marital_status_name, InputSheet.getRow(27).getCell(1).getStringCellValue());
            enterTextByName(driver, UIElements.Veteran_status_name, df.formatCellValue(InputSheet.getRow(28).getCell(1)));

            // ***********Hire an Employee: Employment Information*******************
            clickByXpath(driver, UIElements.Next2_Xpath);
            SelectListBox(driver, UIElements.Bus_Unit_Xpath, df.formatCellValue(InputSheet.getRow(29).getCell(1)));
            SelectListBox(driver, UIElements.Job_Xpath, df.formatCellValue(InputSheet.getRow(30).getCell(1)));
            SelectListBox(driver, UIElements.Grade_Xpath, df.formatCellValue(InputSheet.getRow(31).getCell(1)));
            SelectListBox(driver, UIElements.Dept_Xpath, df.formatCellValue(InputSheet.getRow(32).getCell(1)));
            SelectListBox(driver, UIElements.Location_Xpath, df.formatCellValue(InputSheet.getRow(33).getCell(1)));
            SelectListBox(driver, UIElements.Assign_catgry_Xpath, df.formatCellValue(InputSheet.getRow(34).getCell(1)));
            SelectListBox(driver, UIElements.Salaried_Xpath, df.formatCellValue(InputSheet.getRow(36).getCell(1)));
            SelectListBox(driver, UIElements.Company_Xpath, df.formatCellValue(InputSheet.getRow(37).getCell(1)));
            SelectListBox(driver, UIElements.Cost_Center_Xpath, df.formatCellValue(InputSheet.getRow(38).getCell(1)));
            // SelectListBox(driver,"//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:0:pt1:pt_r1:0:pt1:sP2:NewPe3:0:JobDe1:0:df2_BaseWorkerAsgDFFIteratorxxpsoerprofitcenter__FLEX_EMPTY::content\"]",df.formatCellValue(InputSheet.getRow(39).getCell(1)));
            // clickByXpath(driver,"//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:pt1:sP2:NewPe3:0:r1:0:AT1:_ATp:cil113::icon\"]");
            // action.sendKeys(Keys.TAB).build().perform();
            // action.sendKeys(Keys.TAB).build().perform();
            // action.sendKeys(Keys.TAB).build().perform();
            // sendByXpath(driver,"//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:0:pt1:pt_r1:0:pt1:sP2:NewPe3:0:r1:0:AT1:_ATp:table1:0:selectOneChoice1::content\"]",df.formatCellValue(InputSheet.getRow(40).getCell(1)));
            clickByXpath(driver, UIElements.Next3_Xpath);

            // ***********Hire an Employee: Compensation and Other
            // Information*******************

            SelectListBox(driver, UIElements.Salary_Basis__Xpath, df.formatCellValue(InputSheet.getRow(41).getCell(1)));
            Thread.sleep(400);
            action.sendKeys(Keys.TAB).build().perform();
            sendByXpath(driver, UIElements.Salary_Amt_Xpath, df.formatCellValue(InputSheet.getRow(42).getCell(1)));
            clickByXpath(driver, UIElements.Salary_Cmp);
            action.sendKeys(Keys.TAB).build().perform();
            clickByXpath(driver, UIElements.Next4_Xpath);
            clickByXpath(driver, "//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:4:pt1:AP1:panelBox3::_afrDscl\"]");
            clickByXpath(driver, "/html/body/div[2]/form/div[1]/div[1]/div/div/div/div[4]/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/table/tbody/tr/td/div/div[1]/div/div/div[2]/div/div[1]/div[1]/div/div/div[1]/div/div[1]/table/tbody/tr/td[1]/div/div/div/div/div[1]/div[2]/table/tbody/tr/td[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[2]/div/div/div[1]/div/div[1]/div[3]/div/div[1]/div[1]/table/tbody/tr/td/div[1]/div[1]/div[1]/table/tbody/tr/td[6]");
            //clickByXpath(driver,
            //"//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:0:pt1:pt_r1:0:pt1:AP1:tt1:submit\"]/a");
            clickByXpath(driver,
                    "//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:4:pt1:AP1:tt1:okWarningDialog\"]");
            clickByXpath(driver,
                    "//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:4:pt1:AP1:tt1:okConfirmationDialog\"]");
            // driver.findElement(By.linkText("Mary Test")).click();
            clickByXpath(driver, "//*[@id=\"_afrFilter_FOpt1_afr__FOr1_afr_0_afr__FOSritemNode_workforce_management_new_person_afr_0_afr__FOTsr1_afr_0_afr_pt1_afr_AddPe1_afr_0_afr_r1_afr_0_afr_AT1_afr__ATp_afr_ATt1_afr_c11::content\"]");
            clickByXpath(driver, "//*[@id=\"_FOpt1:_UIScmil1u::icon\"]");
            clickByXpath(driver, "//*[@id='_FOpt1:_UISlg1']");
            Thread.sleep(1200);
            driver.quit();
        } else {
            System.out.println("Worker type is not Employee ");
        }
    }

    private static void enterTextByName(WebDriver driver, String name, String value) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.elementToBeClickable(By.name(name)));
        driver.findElement(By.name(name)).clear();
        driver.findElement(By.name(name)).sendKeys(value);
    }

    private static void clickByXpath(WebDriver driver, String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();
    }

    private static void sendByXpath(WebDriver driver, String xpath, String value) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath)).click();
        driver.findElement(By.xpath(xpath)).sendKeys(value);
    }

    private static void clickByID(WebDriver driver, String ID) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(ID)));
        driver.findElement(By.id(ID)).click();
    }

    private static void SelectDrop(WebDriver driver, String name, String value) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.elementToBeClickable(By.name(name)));
        WebElement myselectelement = driver.findElement(By.name(name));
        Select dropdown = new Select(myselectelement);
        dropdown.selectByVisibleText(value);
    }

    private static void SelectDrop_ID(WebDriver driver, String id, String value) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
        WebElement myselectelement = driver.findElement(By.id(id));
        Select dropdown = new Select(myselectelement);
        dropdown.selectByVisibleText(value);
    }

    private static void SelectListBox(WebDriver driver, String xpath, String value) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        WebElement ListBox = driver.findElement(By.xpath(xpath));
        ListBox.sendKeys(value);
    }

}
