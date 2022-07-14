package IAM1.objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalData {

        //@BeforeSuite
        public static void main(String[] args) throws IOException {
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Dev\\Automation\\ELM\\IAM\\src\\main\\resources\\iam1_data.properties");
            prop.load(fis);

            System.out.println(prop.getProperty("browser"));

        }
    }
