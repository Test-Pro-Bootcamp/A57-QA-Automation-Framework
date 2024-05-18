import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;

import java.time.Duration;

public class LoginTests extends BaseTest {

    @Test
    //Login using valid email and password
    public void loginValidEmailPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","Smg6reUh");
        Assert.assertTrue(homePage.getUserAvatar());
    }

    @Test
    //Login using Invalid email and valid password
    public void loginInvalidEmailValidPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengo@testpro.io","Smg6reUh");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
    }

    @Test
    //Login using Valid email and Invalid password
    public void loginValidEmailInvalidPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","mg6reUh");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
    }

    @Test
    //Login using Empty email and valid password
    public void loginEmptyEmailValidPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("","Smg6reUh");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
    }
    @Test
    //Login using valid email and Empty password
    public void loginValidEmailEmptyPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
    }
}
