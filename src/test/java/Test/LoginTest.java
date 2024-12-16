package Test;

import Base.BaseTest;
import Pages.SecurePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin(){
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.btnLoginClick();

        SecurePage securePage = new SecurePage(driver);
        securePage.btnLogoutClick();
    }

    @Test
    public void testInvalidLogin(){
        loginPage.setUsername("invalidusername");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.btnLoginClick();
        String invalidLoginMessage = loginPage.setInvalidMessage();
        Assert.assertTrue(invalidLoginMessage.toLowerCase().contains("invalid"));
    }
}
