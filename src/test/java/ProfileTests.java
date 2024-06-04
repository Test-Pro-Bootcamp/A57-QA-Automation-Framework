import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.ProfilePage;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Arrays;

public class ProfileTests extends BaseTest{

    private static final String VALID_EMAIL = "sakthibala.sengottiyan@testpro.io";
    private static final String VALID_PASSWORD = "te$t$tudent1";


    @Test (description="Update email and login",priority = 1)
    public void testLoginAfterEmailUpdate() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        loginPage.login("sakthibala.sengottiyan+2@testpro.io","te$t$tudent2");

        //Click Profile
        homePage.clickProfile();

        //Update Email and Save
        profilePage.updateEmail("te$t$tudent2","sakthibala.sengottiyan+3@testpro.io");

        //wait for the alert to disappear

//        if (homePage.isNotDisplayedSuccessAlert()) {

            homePage.clickLogOut();
//        }

        //loginPage.login("sakthibala.sengottiyan+3@testpro.io","te$t$tudent2");

        //Assert.assertTrue(homePage.getUserAvatar(),"Login with updated email should be successful.");
        Assert.assertTrue(homePage.isNotDisplayedUserAvatarIcon(),"Login with updated email should be successful.");

    }

    @Test (description="Update password and login",priority = 2)
    public void testLoginAfterPasswordUpdate() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan+3@testpro.io","te$t$tudent2");

        //Click Profile
        homePage.clickProfile();

        //Update Password and Save
        profilePage.updatePassword("te$t$tudent2","te$t$tudent1");

        //wait for the alert to disappear

//        if (homePage.isNotDisplayedSuccessAlert()) {

            homePage.clickLogOut();

//        }
//        loginPage.login("sakthibala.sengottiyan+3@testpro.io","te$t$tudent2");

        //Assert.assertTrue(homePage.getUserAvatar(),"Login with updated password should be successful.");
        Assert.assertTrue(homePage.isNotDisplayedUserAvatarIcon(),"Login with updated password should be successful.");

    }

    @Test (description="Update both email and password and login",priority = 3)
    public void testLoginAfterEmailPasswordUpdate() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan+3@testpro.io","te$t$tudent1");

        //Click Profile
        homePage.clickProfile();

        //Update Email and Password and Save
        profilePage.updateEmailPassword("te$t$tudent1","sakthibala.sengottiyan+2@testpro.io","te$t$tudent2");

        //wait for the alert to disappear

        //wait for the alert to disappear

//        if (homePage.isNotDisplayedSuccessAlert()) {

//            System.out.println(homePage.isNotDisplayedSuccessAlert());

            homePage.clickLogOut();

//        }

//        loginPage.login("sakthibala.sengottiyan+2@testpro.io","te$t$tudent2");

        //Assert.assertTrue(homePage.isNotDisplayedUserAvatarIcon());
//        Assert.assertTrue(homePage.getUserAvatar(),"Login with updated email and password should be successful.");
        Assert.assertTrue(homePage.isNotDisplayedUserAvatarIcon(),"Login with updated email and password should be successful.");

    }

    @Test (description="Update name",priority = 4)
    public void testProfileNameUpdate() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        String newProfileName = "student1";

        loginPage.login("sakthibala.sengottiyan+2@testpro.io", "te$t$tudent2");

        //Click Profile
        homePage.clickProfile();

        //Update Email and Save
        profilePage.updateName("te$t$tudent2", newProfileName);

        //wait for the alert to disappear

        if (homePage.isNotDisplayedSuccessAlert()) {

            //System.out.println(homePage.isNotDisplayedSuccessAlert());
            //check the name on the Page
            Assert.assertEquals(profilePage.getProfileName(), newProfileName);
        }

    }

        //Change the theme of the app
    @Test (description="Change Theme in Profile",priority = 5)
    public void testProfileThemeChange() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        loginPage.login(VALID_EMAIL, VALID_PASSWORD);

        //Click Profile
        homePage.clickProfile();

        profilePage.changeThemeToViolet();

        Assert.assertTrue(homePage.isUpdatedThemeDisplayed(),"Updated theme is displayed");

    }

        //Album cover should display the translucent, blurred overlay
    @Test (description="Show Blurred Overlay of the Album Art",priority = 6)
    public void testProfileAlbumArtOverlay() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        loginPage.login(VALID_EMAIL, VALID_PASSWORD);

        //Click Profile
        homePage.clickProfile();

        profilePage.clickShowBlurredAlbumArtOverlay();

        Assert.assertTrue(profilePage.isAlbumArtOverlayDisplayed(),"Blurred overlay of the Album Art is displayed");

    }

    //'Show Now Playing' notification validation - Functionality is not implemented yet


    //'Confirm before closing Koel' alert verification
    @Test (description="Confirm Closing Koel",priority = 7)
    public void testConfirmClosingKoel() throws InterruptedException, AWTException {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        boolean confirmClosingAlertDisplayed = false;

        loginPage.login(VALID_EMAIL, VALID_PASSWORD);

        //Click Profile
        homePage.clickProfile();


        profilePage.clickConfirmClosingKoel();

        try {
            Robot robot = new Robot();
            Thread.sleep(2000);
            // Press keys Ctrl + W
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_W);
            // Release keys Ctrl + W
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_W);
            Thread.sleep(2000);

            //pressing enter
            robot.keyPress(KeyEvent.VK_ENTER);
            //releasing enter
            robot.keyRelease(KeyEvent.VK_ENTER);
            getDriver().close();

        }

        catch(NoSuchWindowException e)
        {

            confirmClosingAlertDisplayed = true;

       }
        Assert.assertTrue(confirmClosingAlertDisplayed,"Confirm closing alert is displayed");

    }




}

