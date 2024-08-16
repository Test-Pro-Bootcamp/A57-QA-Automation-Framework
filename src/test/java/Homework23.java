import pages.HomePage;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework23 extends BaseTest {

    @Test
    public void testRenamePlaylist() {
        String newPlaylistName = "Test3";
        String updatedPlaylistMsg = "Updated playlist \"" + newPlaylistName + ".\"";

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        // Login to Koel page:
        loginPage.login();

        // Double-click on a playlist:
        homePage.doubleClickPlaylist();

        //Clear and Rename the playlist:
        homePage.enterNewPlaylistName(newPlaylistName);

        //Assert (Actual vs Expected):
        Assert.assertEquals(homePage.expectedSuccessMsg(), updatedPlaylistMsg);

    }

}
