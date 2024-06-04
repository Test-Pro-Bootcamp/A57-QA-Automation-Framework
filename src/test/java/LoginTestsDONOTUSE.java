import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;

public class LoginTestsDONOTUSE extends BaseTest {

    @Test (priority = 1)
    //Login using valid email and password
    public void loginValidEmailPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");
        Assert.assertTrue(homePage.getUserAvatar());
    }

    @Test (priority = 2)
    //Login using Updated email
    public void loginUpdatedEmailValidPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Updated Email and Password
        loginPage.login("sakthibala.sengottiyan+2@testpro.io","te$t$tudent2");
        Assert.assertTrue(homePage.getUserAvatar());
    }

    @Test (priority = 3)
    //Login using Old email
    public void loginOldEmailValidPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Old Email and Password
        loginPage.login("sakthibala.sengottiyan+1@testpro.io","te$t$tudent2");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);

    }

    @Test (priority = 4)
    //Login using Updated password
    public void loginValidEmailUpdatedPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan+2@testpro.io","te$t$tudent2");
        //Assert.assertEquals(getDriver().getCurrentUrl(),url);
        Assert.assertTrue(homePage.getUserAvatar());
    }

    @Test (priority = 5)
    //Login using Old password
    public void loginValidEmailOldPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan+2@testpro.io","te$t$tudent1");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
    }

    @Test (priority = 6)
    //Login using Invalid email format 1 (without @) and valid password
    public void loginInvalidEmailFormat1ValidPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyantestpro.io","te$t$tudent1");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
    }

    @Test (priority = 7)
    //Login using Invalid email format 2 (without dot) and valid password
    public void loginInvalidEmailFormat2ValidPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibalasengottiyan@testproio","te$t$tudent1");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
    }

    @Test (priority = 8)
    //Login using Invalid email format 3 (without domain) and valid password
    public void loginInvalidEmailFormat3ValidPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@","te$t$tudent1");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
    }

    @Test (priority = 9)
    //Login using Valid email and Invalid password
    public void loginValidEmailInvalidPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","e$t$tudent1");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
    }

    @Test (priority = 10)
    //Login using Empty email and valid password
    public void loginEmptyEmailValidPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("","te$t$tudent1");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
    }
    @Test (priority = 11)
    //Login using valid email and Empty password
    public void loginValidEmailEmptyPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
    }

    @Test (priority = 12)
    //Login using Empty email and Empty password
    public void loginEmptyEmailEmptyPassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("","");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
    }



}
