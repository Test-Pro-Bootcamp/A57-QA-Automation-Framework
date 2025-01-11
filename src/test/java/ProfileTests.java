import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTests extends BaseTest{

    @Test

public void changeProfileName(){

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homepage =new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        String SuccessMsg= "Profile updated";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2026@").clickSubmit();
        homepage.getAvatarIcon();
        profilePage.provideCurrentPassword("Password2026@").provideProfileName("Adam");
        profilePage.clickSaveBtn();
            Assert.assertEquals(profilePage.getUpdatedProfileMsg(),SuccessMsg);











}
}
