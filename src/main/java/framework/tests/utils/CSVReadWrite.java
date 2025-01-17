package framework.tests.utils;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import framework.tests.steps.oracle_fusion_cloud.Context;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class CSVReadWrite {

    private String[] value;
    private Context context;
    private String csvFile = "commonData.csv";

    public CSVReadWrite(Context context) {
        this.context = context;
    }

    public HashMap<String, String> read() throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(context.getPath() + File.separator + csvFile));
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

        // Create a HashMap
        HashMap<String, String> hmap = new HashMap<String, String>();

        String[] nextLine;

        // nextLine[] is an array of values from the line
        while ((nextLine = csvReader.readNext()) != null) {
            //value = nextLine;
            hmap.put("personNumber", nextLine[0]);
            hmap.put("personName", nextLine[1]);
        }
        return hmap;
    }

    public void write(String personNumber, String personName) throws IOException {
        Writer writer = Files.newBufferedWriter(Paths.get(context.getPath() + File.separator + csvFile));

        CSVWriter csvWriter = new CSVWriter(writer,
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);
        String[] headerRecord = {"personNumber", "personName"};
        csvWriter.writeNext(headerRecord);
        csvWriter.writeNext(new String[]{personNumber.trim(), personName.trim()});
        csvWriter.flush();
        csvWriter.close();
    }


}
