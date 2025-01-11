import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginCases extends BaseTest {

    @Test

    public void loginWithCorrectCredentials(){

        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2026@").clickSubmit();
        Assert.assertTrue(homePage.getAvatarIcon().isDisplayed());


    }

    @Test
    public void LoginWithIncorrectCredentials(){

        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        String expectedUrl= "https://qa.koel.app";

        loginPage.provideEmail("tassadit.talbitestpro.io").providePassword("Password").clickSubmit();

        //Assert.assertTrue(loginPage.getCurrentUrl(),expectedUrl);


    }



    












}
