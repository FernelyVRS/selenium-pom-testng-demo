package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SecurePage {
    private WebDriver driver;

    public SecurePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // locators
    private By btnLogout = By.cssSelector("#content > div > a > i");

    // actions
    public void btnLogoutClick(){
        driver.findElement(btnLogout).click();
    }

}
