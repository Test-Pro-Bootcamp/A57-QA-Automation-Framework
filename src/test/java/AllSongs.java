import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllSongs extends BaseTest {


    @Test

    public void deletePlaylist() {
        String playlistDeletedMsg = "Deleted playlist\"New playlist\"";
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2026@").clickSubmit();
        homePage.clickPlaylist().clickDeleteBtn();
        Assert.assertEquals(homePage.getDeletedPlaylistMsg(), playlistDeletedMsg);


    }


    @Test
    public void addASongToAPlaylist() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        BasePage basePage = new BasePage(getDriver());

        String successMsg = "Added 1 song into \"Old Songs.\"";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2026@").clickSubmit();
        homePage.clickOnAllSongsBtn();
      //  basePage.contextClickSong();
        homePage.clickOnAddToBtn().clickOnOldSongsPlaylist();
        Assert.assertEquals(homePage.getAddedSongSuccessMsg(), successMsg);


    }
}
