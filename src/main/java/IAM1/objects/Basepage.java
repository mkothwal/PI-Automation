package IAM1.objects;

import org.openqa.selenium.WebDriver;

public class Basepage {
    private WebDriver driver;

    public Basepage(WebDriver driver){
        this.driver = driver;
    }

    public int getWindowHandlesNumber(){
        return driver.getWindowHandles().size();
    }
}
