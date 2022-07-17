package IAM1.Tests;

import IAM1.objects.BasePage;
import IAM1.objects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class LoginTest extends BasePage {

    @Test
    public void Login() throws IOException, InterruptedException {
        driver = initializeDriver();

        String webUrl = getStringFromPropertiesFile("iamLoginPage");
        String username = getStringFromPropertiesFile("username");
        String password = getStringFromPropertiesFile("password");

        LoginPage loginpage = new LoginPage(driver);

        driver.navigate().to(webUrl);
        loginpage.inputUsername().sendKeys(username);
        loginpage.inputPassword().sendKeys(password);
        loginpage.loginButton().click();
        driver.close();

    }

}
