package IAM1.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class BasePage {

    public static WebDriver driver;
   // public static Logger log = LogManager.getLogManager().getLogger(BasePage.class.getName());

    public static String getStringFromPropertiesFile(String propertyValue) throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Dev\\Automation\\ELM\\PI-Automation\\src\\main\\java\\IAM1\\resources\\data.properties");
        prop.load(fis);
        propertyValue = prop.getProperty(propertyValue);
       // log.info("returned "+propertyValue);
        return propertyValue;
    }

    public WebDriver initializeDriver() throws IOException {
        String browserName = getStringFromPropertiesFile("browser");

        System.out.println(browserName);

        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C://Dev//Automation//drivers//chromedriver.exe");
            driver = new ChromeDriver();
          //  log.info("returned "+driver);
        }
        else if (browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "C://Dev//Automation//drivers//geckodriver.exe");
            driver = new FirefoxDriver();
        }
//download IE driver and update the path
        else if (browserName.equals("IE")){
            System.setProperty("webdriver.gecko.driver", "C://Dev//Automation//drivers//geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;



    }

    @AfterSuite
    public void closWindowes () {
        driver.quit();
        System.out.println(driver + " All the windowesd closed ");
        //       System.out.println(windowHandles +" ***  " + driver);

    }


    public int getWindowHandlesNumber(){
        return driver.getWindowHandles().size();
    }
}
