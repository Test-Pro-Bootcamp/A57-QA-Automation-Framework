import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;

public class LoginTests extends BaseTest {

//    private static final String VALID_EMAIL = "sakthibala.sengottiyan@testpro.io";
//    private static final String VALID_PASSWORD = "te$t$tudent1";
//    private static final String OLD_EMAIL = "sakthibala.sengottiyan+1@testpro.io";
//    private static final String OLD_PASSWORD = "te$t$tudent";
//    private static final String INVALID_PASSWORD = "1111111";
//
//    @Test (description = "Successful login with valid credentials",priority = 1)
//    public void testSuccessfulLogin() {
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//
//        loginPage.login(VALID_EMAIL,VALID_PASSWORD);
//        Assert.assertTrue(homePage.getUserAvatar(),"Login with valid credentials should be successful.");
//    }
//
//    @Test (description = "Login with invalid email", priority = 2)
//    public void testInvalidEmailLogin() {
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//
//        loginPage.login(OLD_EMAIL,VALID_PASSWORD);
//        Assert.assertTrue(homePage.isNotDisplayedUserAvatarIcon(),"Incorrect error message for invalid email (old) login.");
//
//    }
//
//    @Test (description = "Login with invalid password",priority = 3)
//    public void testInvalidPasswordLogin() {
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//
//        loginPage.login(VALID_EMAIL,INVALID_PASSWORD);
//        Assert.assertTrue(homePage.isNotDisplayedUserAvatarIcon(),"Incorrect error message for invalid password login.");
//    }
//
//
//    @Test (description = "Login with wrong email",priority = 4)
//    //Login using Old password
//    public void testWrongEmailLogin() {
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//
//        loginPage.login("\\\\\\\\\\",VALID_PASSWORD);
//        Assert.assertTrue(homePage.isNotDisplayedUserAvatarIcon());
//    }
//
//    @Test (description = "Login with invalid (old) password",priority = 5)
//    //Login using Old password
//    public void testOldPasswordLogin() {
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//
//        loginPage.login(VALID_EMAIL,OLD_PASSWORD);
//        Assert.assertTrue(homePage.isNotDisplayedUserAvatarIcon(),"Incorrect error message for invalid (old) password login.");
//    }
//
//    @Test (description = "Login with Empty email",priority = 6)
//    //Login using Empty email
//    public void testEmptyEmailLogin() {
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//
//        loginPage.login("",VALID_PASSWORD);
//
//        String actualErrorValidationMessage = loginPage.getTextEmailValidationMessage();
//        String expectedErrorValidationMessage = "Please fill out this field.";
//
//        Assert.assertEquals(actualErrorValidationMessage, expectedErrorValidationMessage,
//                "Incorrect error message for empty email login.");
//    }
//    @Test (description = "Login with Empty password",priority = 7)
//    //Login using valid email and Empty password
//    public void testEmptyPasswordLogin() {
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//
//        loginPage.login(VALID_EMAIL,"");
//        String actualErrorValidationMessage = loginPage.getTextPasswordValidationMessage();
//        String expectedErrorValidationMessage = "Please fill out this field.";
//
//        Assert.assertEquals(actualErrorValidationMessage, expectedErrorValidationMessage,
//                "Incorrect error message for empty email login.");
//    }
//
//    @Test (description = "Login with both empty email and password", priority = 8)
//    //Login using Empty email and Empty password
//    public void testEmptyEmailPasswordLogin() {
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//
//        loginPage.login("","");
//        String actualErrorValidationMessage = loginPage.getTextEmailValidationMessage();
//        String expectedErrorValidationMessage = "Please fill out this field.";
//        Assert.assertEquals(actualErrorValidationMessage, expectedErrorValidationMessage,
//                "Incorrect error message for empty email and password login.");
//    }
//
//    @Test(description = "Login with invalid email credentials", dataProvider = "invalidEmails", priority = 9)
//    public void testInvalidEmailsLogin(String email, String expectedErrorValidationMessage) {
//        LoginPage loginPage = new LoginPage(getDriver());
//
//        loginPage.login(email,VALID_PASSWORD);
//
//        String actualErrorValidationMessage = loginPage.getTextEmailValidationMessage();
//
//        Assert.assertEquals(actualErrorValidationMessage, expectedErrorValidationMessage,
//                "Incorrect error message for invalid email login: " + email);
//
//    }
//
//    @Test(description = "Login with additional invalid password credentials", dataProvider = "invalidPasswords", priority = 10)
//    public void testInvalidPasswordsLogin(String password, String description) {
//        LoginPage loginPage = new LoginPage(getDriver());
//
//        loginPage.login(VALID_EMAIL,password);
//
//        System.out.println(password);
//        System.out.println(description);
//
//        Assert.assertTrue(loginPage.isDisplayedLogInBtn(), "Wrong password: " + description);
//    }
//    @DataProvider(name = "invalidEmails")
//    private Object[][] provideInvalidEmails() {
//        return new Object[][]{
//                {"sakthibala.sengottiyan@@testpro.io", "A part following '@' should not contain the symbol '@'."},
//                {"sakthibala.sengottiyan@testpro..io", "'.' is used at a wrong position in 'testpro..io'."},
//                {"sakthibala.sengottiyan @testpro.io", "A part followed by '@' should not contain the symbol ' '."},
//        };
//    }
//
//    @DataProvider(name = "invalidPasswords")
//    private Object[][] provideInvalidPasswords() {
//        return new Object[][]{
//                {"te$t$tudent..", "Invalid password"},
//                {"!@#$%^&*()", "Invalid password with special characters"},
//                {"123456789012345678901234567890123456789012345678901234567890123456789012345678901", "Long password"},
//                {"1", "Short password"},
//        };
//    }

}
