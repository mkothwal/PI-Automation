package IAM1.pageObjects;

import IAM1.resources.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileNotFoundException;

public class LoginPage extends BasePage {
    WebDriver driver;


    public LoginPage(WebDriver driver) throws FileNotFoundException {
       // super(driver);
        this.driver = driver;
    }

    @FindBy (xpath="/html/body/div[1]/div/main/div/div/div/div/div[3]/form/div[1]/div/div[1]/div[2]/input")
    WebElement inputUsername;

    @FindBy (xpath="/html/body/div[1]/div/main/div/div/div/div/div[3]/form/div[2]/div/div[1]/div[2]/input")
    WebElement inputPassword;

    @FindBy (xpath="//*[@id='app']/div/main/div/div/div/div/div[3]/form/div[3]/div/div/div/div/div")
    WebElement rememberMeCheckbox;

    @FindBy (xpath="//body/div[@id='app']/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement rememberMeText;

    @FindBy (xpath="//*[@id='app']/div/main/div/div/div/div/div[3]/form/div[3]/a")
    WebElement forgotPasswordLinkText;

    @FindBy (xpath="//*[@id='app']/div/main/div/div/div/div/div[4]/a")
    WebElement createAnAccountLinkText;

    @FindBy (xpath="//*[@id='app']/div/main/div/div/div/div/div[3]/form/button/span")
    WebElement loginButton;

    @FindBy (xpath="//*[@id='app']/div/main/div/div/div/div/div[1]/a/div/div[3]")
    WebElement elmLogo;

    @FindBy (xpath = "//*[@id='error-information-popup-content']/div[2]")
    WebElement errorCodeforIamLoginPageFail;

    public WebElement errorCodeforIamLoginPageFail(){return errorCodeforIamLoginPageFail;}

    public WebElement elmLogo() {
        return elmLogo;
    }

    public WebElement loginButton() {
        return loginButton;
    }

    public WebElement createAnAccountLinkText() {
        return createAnAccountLinkText;
    }

    public WebElement forgotPasswordLinkText() {
        return forgotPasswordLinkText;
    }

    public WebElement rememberMeText() {
        return rememberMeText;
    }

    public WebElement rememberMeCheckbox() {
        return rememberMeCheckbox;
    }

    public WebElement inputPassword() {
        return inputPassword;
    }

    public WebElement inputUsername() {
        return inputUsername;
    }

}
