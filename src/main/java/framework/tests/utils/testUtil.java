package framework.tests.utils;

import framework.tests.steps.oracle_fusion_cloud.Context;
import org.testng.annotations.Test;

import java.io.IOException;

public class testUtil {

    @Test
    public void runCSVTest() {
        Context context = new Context();

        CSVReadWrite csv = new CSVReadWrite((Context) context);
        try {
            csv.write("test1", "test2");
            System.out.println(csv.read().get("personNumber"));
            System.out.println(csv.read().get("personName"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
