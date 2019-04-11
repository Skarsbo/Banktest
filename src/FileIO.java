import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.util.List;

public class FileIO {

    public static void write(String path, String[][] data) {
        File file;
        try {
            file = new File(path);
            FileWriter writr = new FileWriter(file);
            for (String[] record : data) {
                for (String field : record) {
                    writr.append(field + ", ");
                }
                writr.append(System.getProperty("line.separator"));
            }
            writr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String[] read(String path) {
        File file;
        List<String> data = new ArrayList<String>();
        try {
            file = new File(path);
            FileReader reader = new FileReader(file);

            String element = "";
            int i;
            while ((i=reader.read())!= -1) {
                char ch = (char)i;
                if (ch != ',') {
                    if (ch != ' ') element += ch;
                } else {
                    data.add(element);
                    element = "";
                }
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int size = data.size();
        return data.toArray(new String[size]);
    }
}
