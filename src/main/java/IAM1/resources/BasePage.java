package IAM1.objects.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BasePage {

    public WebDriver driver;

    public String getStringFromPropertiesFile(String propertyValue) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Dev\\Automation\\ELM\\PI-Automation\\src\\main\\java\\IAM1\\data.properties");
        prop.load(fis);
        propertyValue = prop.getProperty(propertyValue);
        return propertyValue;
    }

    public WebDriver initializeDriver() throws IOException {
        String browserName = getStringFromPropertiesFile("browser");

        System.out.println(browserName);

        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C://Dev//Automation//drivers//chromedriver.exe");
            driver = new ChromeDriver();
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

    public int getWindowHandlesNumber(){
        return driver.getWindowHandles().size();
    }
}
