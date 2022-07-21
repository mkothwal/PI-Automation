package IAM1.Tests;

import IAM1.pageObjects.DashboardPage;
import IAM1.resources.BasePage;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class DashboardTest extends BasePage {

    public void navigateToLoginPage() throws IOException, InterruptedException {
        String dashboardPageUrl = getStringFromPropertiesFile("dashboardPageUrl");
        String iamLoginPageUrl = getStringFromPropertiesFile("iamLoginPage");
        if(false){
        driver = initializeDriver();
            System.out.println("False executed");
        }
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println((CurrentUrl+" "+driver));
        if (driver.getCurrentUrl().equals(iamLoginPageUrl) || (driver.getCurrentUrl().equals("data:,")) ) {
            System.out.println("URL Matches");
            LoginTest.Login();
            System.out.println("Logged in Successfully");
        }
        int windowHandles = getWindowHandlesNumber();
        System.out.println(windowHandles);
    }

    @Test
    public void Dashboard() throws IOException, InterruptedException {
        DashboardPage dashboardPage = new DashboardPage(driver);
        String dashboardPageUrl1 = getStringFromPropertiesFile("dashboardPageUrl");
        String dashboardExpectedText = getStringFromPropertiesFile("dashboardText");
        try {
            Assert.assertTrue(dashboardPage.dashboardHomeWebElement().isDisplayed());
            Assert.assertTrue(dashboardPage.setDashboardHomePage().isDisplayed());
        } catch (Exception e) {
            System.out.println("Dashboard page is not the default page");
            driver = initializeDriver();
            navigateToLoginPage();
            Thread.sleep(1000);
        }
        String actualTitle = dashboardPage.dashboardHomeText();
        Assert.assertEquals(actualTitle, dashboardExpectedText);
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


    @AfterTest
    public void closeBrowsers() {
        if(true)
        System.out.println(driver + " in Dashboard closeBrowser");
        driver.close();
    }
}
