package IAM1.pageObjects;

import IAM1.resources.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileNotFoundException;

public class DashboardPage extends BasePage {
    WebDriver driver;


    public DashboardPage(WebDriver driver) throws FileNotFoundException {
        // super(driver);
        this.driver = driver;
    }

    By dashboardHomePage =By.className("v-main__wrap");
    public WebElement setDashboardHomePage(){
        return driver.findElement(dashboardHomePage);
    }

    By navigationDrawer = By.xpath("//*[@id='core-navigation-drawer']/div[1]/div[2]");
    public WebElement navigationDrawer()
    {
      return driver.findElement(navigationDrawer);
    }

    By dashboardItem = By.xpath("//div[contains(text(),'Dashboard')]");
    public WebElement DashboardItem()
    {
        return driver.findElement(dashboardItem);
    }

    By profileItem = By.xpath("//div[contains(text(),'Profiles')]");
    public WebElement profileItem()
    {
        return driver.findElement(profileItem);
    }

    By yakeenServicesItem = By.xpath("//div[contains(text(),'Yakeen Services')]");
    public WebElement yakeenServicesItem()
    {
        return driver.findElement(yakeenServicesItem);
    }

    By usageCodeItem = By.xpath("//a[@href='#/usage-code/index']//div[@class='v-list-item__content']");
    public WebElement usageCodeItem()
    {
        return driver.findElement(usageCodeItem);
    }

    By exceptionsListItem = By.xpath("//a[@href='#/exceptions/index']//div[@class='v-list-item__content']");
    public WebElement exceptionsListItem()
    {
        return driver.findElement(exceptionsListItem);
    }

    By accessControlListItem = By.xpath("//div[contains(text(),'Access Control')]");
    public WebElement accessControlListItem()
    {
        return driver.findElement(accessControlListItem);
    }

    By accCtrlListItemUsersManagement = By.xpath("//div[contains(text(),'Users Management')]");
    public WebElement accCtrlListItemUsersManagement()
    {
        return driver.findElement(accCtrlListItemUsersManagement);
    }

    By accCtrlListItemRoleManagement = By.xpath("//div[contains(text(),'Role Management')]");
    public WebElement accCtrlListItemRoleManagement()
    {
        return driver.findElement(accCtrlListItemRoleManagement);
    }

    By dashboardHomeWebElement = By.xpath("//a[contains(@class,'black--text')]");
    public WebElement dashboardHomeWebElement()
    {
        return driver.findElement(dashboardHomeWebElement);
    }

    By dashboardHomeText = By.xpath("//a[contains(@class,'black--text')]");
    public String dashboardHomeText()
    {
        return driver.findElement(dashboardHomeText).getText();
    }

}
