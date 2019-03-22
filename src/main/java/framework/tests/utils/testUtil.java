package framework.tests.utils;

import framework.tests.steps.oracle_fusion_cloud.Context;

import java.io.IOException;

public class testUtil {

    public static void main(String args[]) throws IOException {
        Context context = new Context();

        CSVReadWrite csv = new CSVReadWrite((Context) context);
        csv.write("test1", "test2");

        System.out.println(csv.read()[1]);
    }
}
