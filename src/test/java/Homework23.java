import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework23 extends BaseTest{

    @Test

public void deletePlaylist() {
       String  playlistDeletedMsg = "Deleted playlist\"New playlist\"";
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2026@").clickSubmit();
        homePage.clickPlaylist().clickDeleteBtn();
        Assert.assertEquals(homePage.getDeletedPlaylistMsg(),playlistDeletedMsg);







    }










}
