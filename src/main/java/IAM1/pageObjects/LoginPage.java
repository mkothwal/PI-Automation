package IAM1.pageObjects;

import IAM1.resources.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileNotFoundException;

public class LoginPage extends BasePage {
    public WebDriver driver;


    public LoginPage(WebDriver driver) throws FileNotFoundException {
       // super(driver);
        this.driver = driver;
    }

    By getInputUsername = By.xpath("//input[@id='input-46']");

    By getInputPassword = By.xpath("//input[@id='input-50']");

    By getLoginButton = By.xpath("//span[@class='v-btn__content']");

/*    @FindBy (xpath="//input[@id='input-46']")
    WebElement inputUsername;*/

/*    @FindBy (xpath="//input[@id='input-50']")
    WebElement inputPassword;*/

    @FindBy (xpath="//*[@id='app']/div/main/div/div/div/div/div[3]/form/div[3]/div/div/div/div/div")
    WebElement rememberMeCheckbox;

    @FindBy (xpath="//body/div[@id='app']/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement rememberMeText;

    @FindBy (xpath="//*[@id='app']/div/main/div/div/div/div/div[3]/form/div[3]/a")
    WebElement forgotPasswordLinkText;

    @FindBy (xpath="//*[@id='app']/div/main/div/div/div/div/div[4]/a")
    WebElement createAnAccountLinkText;

    @FindBy (xpath="//span[@class='v-btn__content']")
    WebElement loginButton;

    @FindBy (xpath="//div[@class='v-responsive__content']")
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

/*    public WebElement inputPassword() {
        return inputPassword;
    }*/

/*    public WebElement inputUsername() {
        return inputUsername;*/

    public WebElement setInputUsername(){
        return driver.findElement(getInputUsername);
    }

    public WebElement setInputPassword(){
        return driver.findElement(getInputPassword);
    }

    public WebElement setLoginButton(){
        return driver.findElement(getLoginButton);
    }

}
