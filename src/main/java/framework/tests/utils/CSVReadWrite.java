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

public class CSVReadWrite {

    private String value;
    private Context context;
    private String csvFile = "commonData.csv";

    public CSVReadWrite(Context context) {
        this.context = context;
    }

    public String read() throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(context.getPath() + File.separator + csvFile));
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        String[] nextLine;
        // nextLine[] is an array of values from the line
        while ((nextLine = csvReader.readNext()) != null) {
            value = nextLine[0];
        }
        return value;
    }

    public void write(String updVal) throws IOException {
        Writer writer = Files.newBufferedWriter(Paths.get(context.getPath() + File.separator + csvFile));

        CSVWriter csvWriter = new CSVWriter(writer,
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);
        String[] headerRecord = {"personNumber", "firstName", ""};
        csvWriter.writeNext(headerRecord);
        csvWriter.writeNext(new String[]{updVal});
        csvWriter.flush();
        csvWriter.close();
    }
}
