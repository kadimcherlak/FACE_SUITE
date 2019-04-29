package framework.template;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class GenerateTestNGXmlFile {

	public static final String xmlFilePath = System.getProperty("user.dir") + "\\src\\main\\resources\\testng.xml";

	public static void main(String argv[]) {

		try {

			List<String> runnerClassName = new ArrayList<>();

			try {
				if (System.getProperty("runMode").equalsIgnoreCase("parallel")
						|| System.getProperty("runMode").equalsIgnoreCase("sequence")) {
					runnerClassName = getRunnerClassName(
							System.getProperty("user.dir") + "\\src\\main\\java\\framework\\selective\\runner");
				} else {
					runnerClassName = getRunnerClassName(System.getProperty("user.dir") + "\\src\\main\\java");
				}
			} catch (Exception e) {
				runnerClassName = getRunnerClassName(System.getProperty("user.dir") + "\\src\\main\\java");
			}

			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

			Document document = documentBuilder.newDocument();

			// root element
			Element root = document.createElement("suite");
			document.appendChild(root);

			Attr suiteName = document.createAttribute("name");
			suiteName.setValue("Testng Cucumber Suite");
			root.setAttributeNode(suiteName);

			Attr parallelMethod = document.createAttribute("parallel");
			parallelMethod.setValue("tests");
			root.setAttributeNode(parallelMethod);

			Attr threadCount = document.createAttribute("thread-count");
			try {
				if (System.getProperty("runMode").equalsIgnoreCase("sequence")) {
					threadCount.setValue("1");
				} else {
					threadCount.setValue("2");
				}

			} catch (Exception e) {
				threadCount.setValue("2");
			}
			root.setAttributeNode(threadCount);

			if (System.getProperty("runMode").equalsIgnoreCase("parallel")||System.getProperty("runMode").equalsIgnoreCase("sequence")) {
				for (int i = 0; i < runnerClassName.size(); i++) {
					Element test = document.createElement("test");
					Attr testName = document.createAttribute("name");
					testName.setValue("Oracle Fusion Tests " + (i + 1));
					test.setAttributeNode(testName);
					root.appendChild(test);

					Element classes = document.createElement("classes");
					test.appendChild(classes);
					Element runnerClass = document.createElement("class");
					Attr runnerName = document.createAttribute("name");
					runnerName.setValue("framework.selective.runner." + runnerClassName.get(i));
					runnerClass.setAttributeNode(runnerName);
					classes.appendChild(runnerClass);
				}
			} else {

				for (int i = 0; i < runnerClassName.size(); i++) {
					Element test = document.createElement("test");
					Attr testName = document.createAttribute("name");
					testName.setValue("Oracle Fusion Tests " + (i + 1));
					test.setAttributeNode(testName);
					root.appendChild(test);

					Element classes = document.createElement("classes");
					test.appendChild(classes);
					Element runnerClass = document.createElement("class");
					Attr runnerName = document.createAttribute("name");
					runnerName.setValue(runnerClassName.get(i));
					runnerClass.setAttributeNode(runnerName);
					classes.appendChild(runnerClass);
				}
			}

			// create the xml file
			// transform the DOM Object to an XML File
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			StreamResult streamResult = new StreamResult(new File(xmlFilePath));

			// If you use
			// StreamResult result = new StreamResult(System.out);
			// the output will be pushed to the standard output ...
			// You can use that for debugging

			transformer.transform(domSource, streamResult);

			System.out.println("testng.xml file has been generated on the fly");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}

	public static List<String> getRunnerClassName(String filePath) {

		List<String> runnerClassName = new ArrayList<>();
		try {

			File folder = new File(filePath);
			File[] listOfFiles = folder.listFiles();

			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {

					if (listOfFiles[i].getName().endsWith(".java")) {
						System.out.println("Runner Picked Up " + listOfFiles[i].getName());
						runnerClassName
								.add(listOfFiles[i].getName().substring(0, listOfFiles[i].getName().indexOf(".java")));
					}

				}
			}

			return runnerClassName;
		} catch (Exception e) {
			System.out.println("Exception occurred while getting runner class :" + e);
			return runnerClassName;
		}

	}
}
