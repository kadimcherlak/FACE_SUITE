package framework.tests.utils;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class selectiveScenario {

    @Test(alwaysRun = true, priority = 1)
    public void extractTags() throws Exception {
        if (System.getProperty("tags") == null || System.getProperty("tags").equals("")) {

            File excel = null;
            if (System.getProperty("testFile").isEmpty()) {
                excel = new File(System.getProperty("user.dir") + File.separator + "src/main/resources/testdata/TestData.xlsx");
            } else {
                excel = new File(System.getProperty("testFile"));
            }


            FileInputStream fis = new FileInputStream(excel);

            XSSFWorkbook wb = new XSSFWorkbook(fis);
            List<String> tags = new ArrayList<>();

            int sheetCount = wb.getNumberOfSheets();

            for (int i = 0; i < sheetCount; i++) {
                XSSFSheet ws = wb.getSheetAt(i);

                int rowNum = ws.getLastRowNum() + 1;
                XSSFRow rowHeader = ws.getRow(0);

                for (int j = 1; j < rowNum; j++) {
                    XSSFRow row = ws.getRow(j);

                    String flag = row.getCell(1).getStringCellValue();
                    if (flag.equals("Yes")) {
                        tags.add("@" + row.getCell(0).getStringCellValue());
                    }
                }
            }

            if (tags.size() != 0) {
                String finalTags = StringUtils.join(tags, ',');
                System.out.println("Tags selected by Users for Execution are: " + finalTags);
                System.setProperty("tags", finalTags);
            } else {
                System.out.println("Selective scenario execution requested but none of the scenario execution flag is set to value 'Yes'");
                System.exit(1);
            }

        } else {
            System.out.println("Selective scenario execution not requested");
        }
    }
}
