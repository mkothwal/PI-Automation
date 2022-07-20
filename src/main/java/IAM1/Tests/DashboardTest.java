package IAM1.Tests;

import IAM1.pageObjects.DashboardPage;
import IAM1.pageObjects.LoginPage;
import IAM1.resources.BasePage;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DashboardTest extends BasePage {
   // int windowHandles = getWindowHandlesNumber();
    @BeforeSuite
    public void navigateToLoginPage() throws IOException, InterruptedException
    {
        driver = initializeDriver();
        LoginTest.Login();
        int windowHandles = getWindowHandlesNumber();
        System.out.println(windowHandles);
    }

    @Test
    public void Dashboard() throws IOException, InterruptedException {
        DashboardPage dashboardPage = new DashboardPage(driver);
        String dashboardPageUrl = getStringFromPropertiesFile("dashboardPageUrl");
        String dashboardText = getStringFromPropertiesFile("dashboardText");
        String actualTitle = dashboardPage.dashboardText().getText();

        try {
            Assert.assertTrue(dashboardPage.dashboardText().isDisplayed());
            Assert.assertTrue(dashboardPage.setDashboardHomePage().isDisplayed());
        } catch (Exception e){
            System.out.println("Dashboard page is not the default page");
        }
        Assert.assertEquals(actualTitle,dashboardText);
        Assert.assertTrue(dashboardPage.navigationDrawer().isDisplayed());
        Assert.assertTrue(dashboardPage.DashboardItem().isDisplayed());
        Assert.assertTrue(dashboardPage.profileItem().isDisplayed());
        Assert.assertTrue(dashboardPage.yakeenServicesItem().isDisplayed());
        Assert.assertTrue(dashboardPage.usageCodeItem().isDisplayed());
        Assert.assertTrue(dashboardPage.exceptionsListItem().isDisplayed());
        Assert.assertTrue(dashboardPage.accessControlListItem().isDisplayed());
        dashboardPage.accessControlListItem().click();
        Thread.sleep(2000);
        Assert.assertTrue(dashboardPage.accCtrlListItemUsersManagement().isDisplayed());
        Assert.assertTrue(dashboardPage.accCtrlListItemRoleManagement().isDisplayed());
        System.out.println("All assertions completed");

    }



//    @AfterTest
//    public void closeBrowsers() {
//        System.out.println(driver + " in Dashboard closeBrowser");
// //       System.out.println(windowHandles +" ***  " + driver);
//        driver.close();
//    }

//    @AfterSuite
//    public void closeAllBrowsers()
//    {
//        System.out.println(driver+" in Dashboard closeAllBrowsers");
//  //      System.out.println(windowHandles +" ***  " + driver);
//        try {
//            driver.close();
//        }
//        catch(Exception e) {
//
//    }
//    }
}
