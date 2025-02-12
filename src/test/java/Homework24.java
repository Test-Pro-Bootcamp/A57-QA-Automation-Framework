import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework24 extends BaseTest {


    @Test

    public void deletePlaylist() {
        String  playlistDeletedMsg = "Deleted playlist \"Zina Playlist.\"";
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2026@").clickSubmit();
        homePage.clickPlaylist().clickDeleteBtn();
        Assert.assertEquals(homePage.getDeletedPlaylistMsg(),playlistDeletedMsg);

    }

}








