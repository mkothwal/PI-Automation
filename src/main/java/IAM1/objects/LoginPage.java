package IAM1.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;

public class LoginPage extends Basepage {
    WebDriver driver;

    public LoginPage(WebDriver driver) throws FileNotFoundException {
        super(driver);
        this.driver = driver;
    }

    public void inputUsername(String username) {
        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/div/div[3]/form/div[1]/div/div[1]/div[2]/input")).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/div/div[3]/form/div[2]/div/div[1]/div[2]/input")).sendKeys(password);
    }

    public void rememberMeCheckbox() {
        driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div/div/div[3]/form/div[3]/div/div/div/div/div")).click();
    }

    public void rememberMeText() {
        driver.findElement(By.xpath("//body/div[@id='app']/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]"));
    }

    public void forgotPasswordLinkText() {
        driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div/div/div[3]/form/div[3]/a"));
    }

    public void createAnAccountLinkText() {
        driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div/div/div[4]/a"));
    }

    public void loginButton() {
        driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div/div/div[3]/form/button/span")).click();
    }

    public void elmLogo() {
        driver.findElement(By.xpath("//*[@id='app']/div/main/div/div/div/div/div[1]/a/div/div[3]"));
    }

}
