R.Sena, [02.02.20 14:30]
        package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {


    public static String getData(String whichData) {
        String path = "configuration.properteis";
        String result = null;
        try {
            InputStream input = new FileInputStream(path);
            Properties p = new Properties();
            p.load(input);
            result = p.getProperty(whichData);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}