import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.RegistrationPage;


public class AccountCreationTests extends BaseTest {

    private static final String VALID_EMAIL = "sakthibala.sengottiyan@testpro.io";
    private static final String VALID_PASSWORD = "te$t$tudent1";
    private static final String SAME_EMAIL = "sakthibala.sengottiyan+1@testpro.io";


    @Test (description="Create account from Registration Page",priority = 1)
    public void testCreateAccount()
    {
        LoginPage loginPage = new LoginPage(getDriver());
        RegistrationPage registrationPage = new RegistrationPage(getDriver());

        String expectedMessage = "We've sent a confirmation link to the email. Please continue by clicking on it";
        loginPage.clickRegisterLink();
        registrationPage.enterEmail(VALID_EMAIL);

        registrationPage.clickSubmit();
        Assert.assertEquals(registrationPage.getMessage(), expectedMessage, "Confirmation email sent message should be displayed");

    }

    @Test (description="Register using same email with number",priority = 2)
    public void testRegistrationUsingSameEmailWithNumber()
    {
        LoginPage loginPage = new LoginPage(getDriver());
        RegistrationPage registrationPage = new RegistrationPage(getDriver());

        String expectedMessage = "We've sent a confirmation link to the email. Please continue by clicking on it";
        loginPage.clickRegisterLink();
        registrationPage.enterEmail(SAME_EMAIL);
        registrationPage.clickSubmit();

        boolean confirmationEmail = false;

        if (registrationPage.getMessage().equals(expectedMessage))
        {
            confirmationEmail = true;
        }


        Assert.assertFalse(confirmationEmail, "Registering using same email with number is not allowed");

    }


    @Test (description="Register using existing email",priority = 3)
    public void testRegistrationUsingExistingEmail()
    {
        LoginPage loginPage = new LoginPage(getDriver());
        RegistrationPage registrationPage = new RegistrationPage(getDriver());

        String expectedMessage = "We've sent a confirmation link to the email. Please continue by clicking on it";
        loginPage.clickRegisterLink();
        registrationPage.enterEmail(VALID_EMAIL);
        registrationPage.clickSubmit();

        boolean confirmationEmail = false;

        if (registrationPage.getMessage().equals(expectedMessage))
        {
            confirmationEmail = true;
        }

        Assert.assertFalse(confirmationEmail, "Registering using existing email is not allowed");

    }

    @Test(description = "Login with invalid email credentials", dataProvider = "invalidEmails", priority = 4)
    public void testInvalidEmailsLogin(String email, String expectedErrorValidationMessage) {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.login(email,VALID_PASSWORD);

        String actualErrorValidationMessage = loginPage.getTextEmailValidationMessage();

        Assert.assertEquals(actualErrorValidationMessage, expectedErrorValidationMessage,
                "Incorrect error message for invalid email login: " + email);

    }

    @DataProvider(name = "invalidEmails")
    private Object[][] provideInvalidEmails() {
        return new Object[][]{
                {"sakthibala.sengottiyantestpro.io", "Please include an '@' in the email address. 'sakthibala.sengottiyantestpro.io' is missing an '@'."},
                {"sakthibala.sengottiyan@testproio", "'.' is missing in 'testpro..io'."},
                {"sakthibala.sengottiyan@", "Please enter a part following '@'. 'sakthibala.sengottiyan@' is incomplete."}
        };
    }


    @Test (description = "Successful login with valid credentials",priority = 5)
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.login(VALID_EMAIL,VALID_PASSWORD);
        Assert.assertTrue(homePage.getUserAvatar(),"Login with valid credentials should be successful.");
    }

}
