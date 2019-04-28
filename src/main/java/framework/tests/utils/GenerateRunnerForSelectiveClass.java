package framework.tests.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.x5.template.Chunk;
import com.x5.template.Theme;

public class GenerateRunnerForSelectiveClass {

	public static void main(String args[]) throws IOException {

		List<String> allTagToRun = new ArrayList<>();
		allTagToRun = getSelectiveScenarios();
		//System.out.println("Scenario Selected :"+allTagToRun);
		for (int i = 0; i < allTagToRun.size(); i++) {
			String runnerClassName = "Runner" + (i + 1)+"_IT";
			Theme theme = new Theme();
			Chunk chunk = theme.makeChunk("OracleFusionCloudRunnerTemplate", "txt");

			// replace static values below with user input
			chunk.set("class_name", runnerClassName);
			chunk.set("tags", allTagToRun.get(i));
			chunk.set("featuresDirectory",System.getProperty("featureDir"));
			// chunk.set("favorite_color", "blue");

			String outfilePath = System.getProperty("user.dir") + "//src//main//java//framework//selective//runner//" + runnerClassName
					+ ".java";
			File file = new File(outfilePath);
			FileWriter out = new FileWriter(file);

			chunk.render(out);

			out.flush();
			out.close();
			System.out.println("Generated Runner "+runnerClassName+" for tag :"+allTagToRun.get(i));
		}

	}

	public static List<String> getSelectiveScenarios() {

		List<String> tags = new ArrayList<>();
		try {

			if (System.getProperty("runMode").equalsIgnoreCase("selective")) {
				File excel = null;
				if (System.getProperty("testFile").isEmpty()) {
					excel = new File(System.getProperty("user.dir") + File.separator
							+ "src/main/resources/testdata/TestData.xlsx");
				} else {
					excel = new File(System.getProperty("testFile"));
				}

				FileInputStream fis = new FileInputStream(excel);

				XSSFWorkbook wb = new XSSFWorkbook(fis);

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
					System.out.println("Scenario Selected for Selective Run :"+tags);
					return tags;
				} else {
					System.out.println(
							"Selective scenario execution requested but none of the scenario execution flag is set to value 'Yes'");
					System.exit(1);
				}
				return tags;
			}

		} catch (Exception e) {
			System.out.println("Exception occurred while getting tags for selective run :" + e);
			return tags;
		}
		return tags;
	}

}
