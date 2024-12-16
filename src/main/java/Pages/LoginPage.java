package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // locators
    private By inputUsername = By.id("username");
    private By inputPassword = By.id("password");
    private By btnLogin = By.cssSelector("button[type='submit']");
    private By messageInvalidLogin = By.id("flash");


    // actions
    public void setUsername(String username){
        driver.findElement(inputUsername).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void btnLoginClick(){
        driver.findElement(btnLogin).click();
    }

    public String setInvalidMessage(){
        return driver.findElement(messageInvalidLogin).getText();
    }
}
