import pages.HomePage;
import pages.LoginPage;
import pages.PlaylistPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework22 extends BaseTest {

    @Test
    public void testRenamePlaylist() {
        String newPlaylistName = "Test22";
        String updatedPlaylistMsg = "Updated playlist \"" + newPlaylistName + ".\"";

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);

        // Login to Koel page:
        loginPage.login();

        // Double-click on a playlist:
        homePage.doubleClickPlaylist();

        //Clear and Rename the playlist:
        playlistPage.enterNewPlaylistName(newPlaylistName);

        //Assert (Actual vs Expected):
        Assert.assertEquals(playlistPage.expectedSuccessMsg(), updatedPlaylistMsg);

    }

}
