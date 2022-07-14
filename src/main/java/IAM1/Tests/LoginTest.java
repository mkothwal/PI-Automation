package IAM1.Tests;

import IAM1.objects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class LoginTest {

    @Test
    public void Login() throws IOException, InterruptedException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Dev\\Automation\\ELM\\IAM\\src\\main\\resources\\iam1_data.properties");
        prop.load(fis);

        System.setProperty("webdriver.chrome.driver", "C:/Dev//Automation//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        driver.manage().window().maximize();
        driver.get(url);
//        Thread.sleep(1800); //Input implict wait here

        LoginPage loginpage = new LoginPage(driver);
        loginpage.inputUsername(username);
        loginpage.inputPassword(password);
        loginpage.loginButton();
//         driver.close();

    }

}
