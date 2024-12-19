import Pages.LoginPage;
import Pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Passwordup extends BaseTest{

    @Test

    public void updatePasswordWithCorrectRequirements(){

        LoginPage loginPage = new LoginPage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        String updatedProfileMsg = "Profile updated.";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passworda2024@").clickSubmit();
        profilePage.clickViewProfile().provideCurrentPassword("Passworda2024@").provideNewPassword("Password2025@").clickSaveBtn();
        Assert.assertEquals(profilePage.getUpdatedProfileMsg(),updatedProfileMsg);

    }

    @Test

    public void updatePasswordWithLessThenTenCharacters(){
        LoginPage loginPage = new LoginPage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        String errorNotification = "The new password must be at least 10 characters.";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2025@").clickSubmit();
        profilePage.clickViewProfile().provideCurrentPassword("Password2025@").provideNewPassword("Pass2025@").clickSaveBtn();
        Assert.assertEquals(profilePage.getErrorMsg(),errorNotification);

    }

    @Test

    public void updatePasswordWithMoreThenFifteenCharacters(){ // need error message
        LoginPage loginPage = new LoginPage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        String successNotification = "Profile updated.";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2025@").clickSubmit();
        profilePage.clickViewProfile().provideCurrentPassword("Password2025@").provideNewPassword("Passwordtest2025@").clickSaveBtn();
        Assert.assertFalse(profilePage.getUpdatedPasswordMsg(),successNotification);


    }


    @Test

    public void updatePasswordWithLowercaseLettersOnly(){   //need error msg

        LoginPage loginPage = new LoginPage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        String errorNotification = "Profile updated.";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2025@").clickSubmit();
        profilePage.clickViewProfile().provideCurrentPassword("Password2025@").provideNewPassword("password2025@").clickSaveBtn();
        Assert.assertEquals(profilePage.getErrorMsg(),errorNotification);

    }

    @Test

    public void updatePasswordWithUppercaseLettersOnly() { // need error msg

        LoginPage loginPage = new LoginPage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        String errorNotification = "Profile updated.";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2025@").clickSubmit();
        profilePage.clickViewProfile().provideCurrentPassword("Password2025@").provideNewPassword("PASSWORD2025@").clickSaveBtn();
        Assert.assertEquals(profilePage.getErrorMsg(), errorNotification);

    }

    @Test


    public void updatePasswordWithLettersOnly(){
        LoginPage loginPage = new LoginPage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        String errorNotification = "The new password must contain at least one number.";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2025@").clickSubmit();
        profilePage.clickViewProfile().provideCurrentPassword("Password2025@").provideNewPassword("Passwordtest@").clickSaveBtn();
        Assert.assertEquals(profilePage.getErrorMsg(), errorNotification);

    }
    @Test

    public void updatePasswordWithNumbersOnly(){
        LoginPage loginPage = new LoginPage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        String errorNotification = "The new password must contain at least one letter.";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2025@").clickSubmit();
        profilePage.clickViewProfile().provideCurrentPassword("Password2025@").provideNewPassword("12345678954@").clickSaveBtn();
        Assert.assertEquals(profilePage.getErrorMsg(), errorNotification);

    }
@Test

    public void updatePasswordWithoutSpecialCharacter(){
        LoginPage loginPage = new LoginPage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        String errorNotification = "The new password must contain at least one symbol.";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2025@").clickSubmit();
        profilePage.clickViewProfile().provideCurrentPassword("Password2025@").provideNewPassword("Passworda2024").clickSaveBtn();
    Assert.assertEquals(profilePage.getErrorMsg(), errorNotification);



}








}



