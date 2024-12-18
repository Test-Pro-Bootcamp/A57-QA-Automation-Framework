import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountCreation extends BaseTest{



    @Test

    public void createAccountWithCorrectCredentials(){//pass

        String LinkConfirmationMsg ="We've sent a confirmation link to the email.Please continue by clicking on it";

        RegistrationPage registrationPage= new RegistrationPage(getDriver());
         registrationPage.clickOnRegistrationBtn().provideEmail("talbi.tassadit@testpro.io").clickSubmit();
        Assert.assertEquals(registrationPage.getConfirmationLinkMsg(),LinkConfirmationMsg);

    }
    @Test

    public void createAccountWithoutSpecialSymbol(){ //pass

        String errorMsg ="Please include an \'@\' in the email address.'tassadit.talbitestpro.io' is missing an \'@\'.";

        RegistrationPage registrationPage= new RegistrationPage(getDriver());
        registrationPage.clickOnRegistrationBtn().provideEmail("talbi.tassadittestpro.io").clickSubmit();
        Assert.assertEquals(registrationPage.getSymbolErrorMsg(),errorMsg);

    }
    @Test


    public void createAccountwithoutdot(){//fail; i dont know how to assert here

        String errorMsg ="";

        RegistrationPage registrationPage= new RegistrationPage(getDriver());
        registrationPage.clickOnRegistrationBtn().provideEmail("talbi.tassadittestpro.io").clickSubmit();
        Assert.assertEquals(registrationPage.getConfirmationLinkMsg(),errorMsg);

    }
    @Test
    public void createAccountWithoutTestproDomain(){ //pass

        String errorMsg ="Sorry, only certain emails are allowed.Please do not use your personal email";

        RegistrationPage registrationPage= new RegistrationPage(getDriver());
        registrationPage.clickOnRegistrationBtn().provideEmail("talbi.tassadit@gmail.com").clickSubmit();
        Assert.assertEquals(registrationPage.getDomainErrorMsg(),errorMsg);

    }

    @Test

    public void createAccountWithPlusSign(){ //fail dont know how to assert

        String errorMsg ="We've sent a confirmation link to the email.Please continue by clicking on it";

        RegistrationPage registrationPage= new RegistrationPage(getDriver());
        registrationPage.clickOnRegistrationBtn().provideEmail("talbi.tassadittestpro.io").clickSubmit();
        Assert.assertEquals(registrationPage.getConfirmationLinkMsg(),errorMsg);

    }

    @Test

    public void createAccountWithAnExistingEmail(){//fail dot know how to assert
        String errorMsg ="We've sent a confirmation link to the email.Please continue by clicking on it";

        RegistrationPage registrationPage= new RegistrationPage(getDriver());
        registrationPage.clickOnRegistrationBtn().provideEmail("talbi.tassadittestpro.io").clickSubmit();
        Assert.assertEquals(registrationPage.getConfirmationLinkMsg(),errorMsg);

    }
@Test
    public void loginToNewAccountAfterRegistration(){//pass
        RegistrationPage registrationPage= new RegistrationPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
       loginPage.provideEmail("tassadit.talbi+2@testpro.io").providePassword("Ut2Ds4O9").clickSubmit();
       Assert.assertTrue(homePage.getAvatarIcon().isDisplayed());
       
    }







}
