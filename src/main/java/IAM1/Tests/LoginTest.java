package IAM1.Tests;

import IAM1.resources.BasePage;
import IAM1.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;


import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoginTest extends BasePage {
    /* public static Logger log = LogManager.getLogManager().getLogger(BasePage.class.getName()); */

    @BeforeTest
    public void accessDrivers() throws IOException {
        driver = initializeDriver();
        // log.info("Navigated to homePage");
    }

    @Test//(dataProvider = "getData")
    public static void Login() throws IOException, InterruptedException {
        //Use this when you are not passing data through Data Provider else the below method

        //  public void Login(String username, String password, String outputText) throws IOException, InterruptedException {

        String webUrl = getStringFromPropertiesFile("iamLoginPage");
        String username = getStringFromPropertiesFile("username");
        String password = getStringFromPropertiesFile("password");

        LoginPage loginpage = new LoginPage(driver);
        String exceptedErrorCode = "This site can’t be reached";

        try {
            driver.navigate().to(webUrl);
            //  log.info("Server not reachable, check if server is down");
        } catch (Exception e) {
            System.out.println("IAM portal or webpage is down");
            //    log.info("page is down, further execution will be halted");
            return;
        }
        //  log.info("IAM portal is up and can input Username");
/*        if(loginpage.elmLogo().isDisplayed()) //inputUsername().isDisplayed())
        {*/
        System.out.println("IAM portal accessed " + driver);
        // Thread.sleep(3000);
        loginpage.setInputUsername().click();
        System.out.println("Username textbox clicked " + driver);
        loginpage.setInputUsername().sendKeys(username);
        // log.info("input Username successful");
        loginpage.setInputPassword().sendKeys(password);
        //System.out.println(outputText);
        // log.info("input Password successful");
        loginpage.setLoginButton().click();
        System.out.println("Successfully Logged-in");
        Thread.sleep(1000);
        // }
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[2][3];
        data[0][0] = "admin@abc.com";
        data[0][1] = "password";
        data[0][2] = "restricted user";

        data[1][0] = "admin";
        data[1][1] = "password";
        data[1][2] = "input correct details";

        return data;
    }

    @AfterTest
    public void closeBrowsers() {
        System.out.println(driver + " in LoginTest closeBrowser");
        // System.out.println(windowHandles +" ***  " + driver);
        if(false)
        {
            System.out.println(driver + " trying to closeBrowser");
            driver.close();
        }
    }
}
