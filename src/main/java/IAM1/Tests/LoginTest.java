package IAM1.Tests;

import IAM1.resources.BasePage;
import IAM1.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.io.IOException;

public class LoginTest extends BasePage {

    @BeforeTest
    public void accessDrivers() throws IOException {
        driver = initializeDriver();
    }
    @Test//(dataProvider = "getData")
    public void Login() throws IOException, InterruptedException {
     //Use this when you are not passing data through Data Provider else the below method

    //public void Login(String username, String password, String outputText) throws IOException, InterruptedException {

        String webUrl = getStringFromPropertiesFile("iamLoginPage");
        String username = getStringFromPropertiesFile("username");
        String password = getStringFromPropertiesFile("password");

        LoginPage loginpage = new LoginPage(driver);
        String exceptedErrorCode = "This site can’t be reached";

        try
        {
            driver.navigate().to(webUrl);
        }
        catch(Exception e)
        {
           System.out.println("IAM portal or webpage is down");
            return;
        }
        if(loginpage.inputUsername().isDisplayed())
        {
            loginpage.inputUsername().sendKeys(username);
            loginpage.inputPassword().sendKeys(password);
            //System.out.println(outputText);
            loginpage.loginButton().click();
            System.out.println("Successfully Logged-in");
        }
    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = new Object[2][3];
        data [0][0] = "admin@abc.com";
        data [0][1] = "password";
        data [0][2] = "restricted user";

        data [1][0] ="admin";
        data [1][1] ="password";
        data [1][2] ="input correct details";

        return data;
    }

    @AfterTest
    public void closeBrowsers()
    {
        driver.close();
    }

}
