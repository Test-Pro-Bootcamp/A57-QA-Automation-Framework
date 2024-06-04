import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.ProfilePage;
public class LogoutTests extends BaseTest{

    private static final String VALID_EMAIL = "sakthibala.sengottiyan@testpro.io";
    private static final String VALID_PASSWORD = "te$t$tudent1";

    @Test (description="Logout button is next to profile",priority = 1)
    public void testLogoutNextToProfile() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        Assert.assertTrue(homePage.isLogOutNextToProfile());

    }

    @Test (description="User logs out",priority = 2)
    public void isLogOutSuccessful() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        //Log Out
        homePage.clickLogOut();

        Assert.assertTrue(homePage.isNotDisplayedUserAvatarIcon(),"User should be logged out");

    }

    @Test (description="User should be redirected to login page after log out", priority = 3)
    public void testLoginPageDisplayedAfterLogOut() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        homePage.clickLogOut();

        Assert.assertTrue(loginPage.isEmailFieldVisible(),"User should be redirected to login page after log out");

    }

    @Test (description="Log out after updating email",priority = 4)
    public void testLogOutAfterEmailUpdate() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        loginPage.login("sakthibala.sengottiyan+2@testpro.io","te$t$tudent2");

        //Click Profile
        homePage.clickProfile();

        //Update Email and Save
        profilePage.updateEmail("te$t$tudent2","sakthibala.sengottiyan+3@testpro.io");

        homePage.clickLogOut();

        //Verify if the user is successfully logged out
        Assert.assertTrue(homePage.isNotDisplayedUserAvatarIcon());
        //Assert.assertTrue(loginPage.isEmailFieldVisible());

    }

    @Test (description="Log out after updating password",priority = 5)
    public void testLogOutAfterPasswordUpdate() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan+3@testpro.io","te$t$tudent2");

        //Click Profile
        homePage.clickProfile();

        //Update Password and Save
        profilePage.updatePassword("te$t$tudent2","te$t$tudent1");

        //Log Out
        homePage.clickLogOut();

        Assert.assertTrue(homePage.isNotDisplayedUserAvatarIcon());
        //Assert.assertTrue(loginPage.isEmailFieldVisible());

    }

    @Test (description="Log out after updating both email and password",priority = 6)
    public void testLogOutAfterEmailPasswordUpdate() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan+3@testpro.io","te$t$tudent1");

        //Click Profile
        homePage.clickProfile();

        //Update Email and Password and Save
        profilePage.updateEmailPassword("te$t$tudent1","sakthibala.sengottiyan+2@testpro.io","te$t$tudent2");

        homePage.clickLogOut();

        Assert.assertTrue(homePage.isNotDisplayedUserAvatarIcon());
        //Assert.assertTrue(loginPage.isEmailFieldVisible());

    }

}

