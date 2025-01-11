import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateEmail extends BaseTest{


    @Test


public void updateEmailWithCorrectAcceptanceCriteria(){ //Passed

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        String successMsg = "Profile Updated.";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnViewProfile();
        profilePage.provideCurrentPassword("Passwordtest2025@").provideNewEmail("tassadit.test@testpro.io").clickSaveBtn();


            Assert.assertEquals(profilePage.getUpdatedProfileMsg(), successMsg);

}

@Test

public void updateEmailWithoutAPoint(){ // failed , there is abug

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        String successMsg = "Profile Updated.";

        loginPage.provideEmail("tassadit.test@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnViewProfile();
        profilePage.provideCurrentPassword("Passwordtest2025@").provideNewEmail("tassadittest@testpro.io").clickSaveBtn();


        Assert.assertFalse(profilePage.getUpdatedProfileNotif(),successMsg);

}


@Test

 public void updateEmailWithoutAtSymbol(){ //unable to find the error message webelement

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        String successMsg = "Profile Updated.";

        loginPage.provideEmail("tassadit.test@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnViewProfile();
        profilePage.provideCurrentPassword("Passwordtest2025@").provideNewEmail("tassadit.adamtestpro.io").clickSaveBtn();


        Assert.assertFalse(profilePage.getUpdatedProfileNotif(),successMsg);



}

@Test

    public void updateEmailWithoutADomain (){  //unable to find the error message webelement

    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());
    ProfilePage profilePage = new ProfilePage(getDriver());
    String errorMsg = "Please enter a part following '@'.'tassadit.talbi@'is complete.";

    loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.clickOnViewProfile();
    profilePage.provideCurrentPassword("Passwordtest2025@").provideNewEmail("tassadit.talbi@").clickSaveBtn();


    Assert.assertEquals(profilePage.getEmailUpdateErrorMsg(),errorMsg);

}
@Test

public void updateEmailWitPlusSign() {  //failed : its a bug

    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());
    ProfilePage profilePage = new ProfilePage(getDriver());
    String successMsg = "Profile Updated.";

    loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.clickOnViewProfile();
    profilePage.provideCurrentPassword("Passwordtest2025@").provideNewEmail("tassadit.test+@testpro.io").clickSaveBtn();


    Assert.assertFalse(profilePage.getUpdatedProfileNotif(), successMsg);
}

@Test

    public void updateEmailWithAnAlreadyExistingEmail(){ //passed
    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());
    ProfilePage profilePage = new ProfilePage(getDriver());
    String errorMsg = "The email has already been taken.";

    loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.clickOnViewProfile();
    profilePage.provideCurrentPassword("Passwordtest2025@").provideNewEmail("talbi.tassadit@testpro.io").clickSaveBtn();


    Assert.assertEquals(profilePage.getEmailUpdateErrorMsg(),errorMsg);


}

@Test

    public void loginWithNewUpdatedEmail(){ // passed
    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());

    loginPage.provideEmail("tassadit.test@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    Assert.assertTrue(homePage.isAvatarIconDisplayed());

}

   // https://qa.koel.app/#!/home
//https://qa.koel.app/

@Test

    public void loginWithOldEmail(){
    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());
    String Url ="https://qa.koel.app/";

    loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    Assert.assertTrue(loginPage.isLoginBtnEnabled(),"Login button should remain enabled after a failed login.");


}


}
