
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.ProfilePage;
public class PasswordTests extends BaseTest
{
    private static final String VALID_EMAIL = "sakthibala.sengottiyan@testpro.io";
    private static final String VALID_PASSWORD = "te$t$tudent1";

    private static final String EMAIL = "sakthibala.sengottiyan+3@testpro.io";
    private static final String OLD_PASSWORD = "te$t$tudent2";
    private static final String NEW_PASSWORD = "te$t$tudent1";


    @Test (description="Update password and login",priority = 1)
    public void testUpdatePassword() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        //Login using Email and Password
        loginPage.login(EMAIL,OLD_PASSWORD);

        //Click Profile
        homePage.clickProfile();

        //Update Password and Save
        profilePage.updatePassword(OLD_PASSWORD,NEW_PASSWORD);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Login with updated password is successful.");

    }


    @Test (description = "Login with invalid (old) password",priority = 2)
    //Login using Old password
    public void testOldPasswordLogin() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        loginPage.login(EMAIL,OLD_PASSWORD);
        Assert.assertTrue(homePage.isNotDisplayedUserAvatarIcon(),"Incorrect error message for invalid (old) password login.");

     }

    @Test (description="Update password to the original",priority = 3)
    public void testUpdatePasswordToOriginal() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        //Login using Email and Password
        loginPage.login(EMAIL,NEW_PASSWORD);

        //Click Profile
        homePage.clickProfile();

        //Update Password and Save
        profilePage.updatePassword(NEW_PASSWORD,OLD_PASSWORD);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Login with updated password is successful.");

    }

    @Test (description = "Test Password Masking",priority = 4)
    //Login using Old password
    public void testPasswordMasking() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.login(VALID_EMAIL,VALID_PASSWORD);
        Assert.assertTrue(loginPage.isPasswordMasked(),"Password is masked");
    }

    @Test(description = "Update new password with invalid passwords", dataProvider = "invalidPasswords", priority = 5)
    public void testInvalidPasswordsLogin(String password, String description) {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        //Click Profile
        homePage.clickProfile();

        //Update Password and Save
        profilePage.updatePassword(VALID_PASSWORD,password);

        String getPasswordErrorAlert = homePage.getErrorAlertText();

        Assert.assertEquals(getPasswordErrorAlert,description,"Wrong password: " + description);

    }


    @DataProvider(name = "invalidPasswords")
    private Object[][] provideInvalidPasswords() {
        return new Object[][]{
                {"abc12345!", "The new password must be at least 10 characters."},
                {"abc123456789", "The new password must contain at least one symbol."},
                {"abcdefghi!", "The new password must contain at least one number."},
                {"123456789012345", "The new password must contain at least one letter."},
                {"abc123456!", "The given new password has appeared in a data leak. Please choose a different new password."}
        };
    }



}
