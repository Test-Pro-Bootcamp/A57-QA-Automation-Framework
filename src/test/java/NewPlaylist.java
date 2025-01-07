import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewPlaylist extends BaseTest {

    @Test

    public void createNewPlaylistWithCorrectRequirements() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        BasePage basePage = new BasePage(getDriver());

        String playListCreationSuccessMsg = "Created playlist \"New playlist.\"";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2025@").clickSubmit();
        homePage.clickTheCreatePlaylistBtn().selectNewPlaylist().providePlaylistName("New playlist");
        Assert.assertEquals(homePage.getPlaylistCreationSuccessMsg(), playListCreationSuccessMsg);


    }


    @Test

    public void createDuplicatePlaylist() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        BasePage basePage = new BasePage(getDriver());

        String playListCreationErrorMsg = "Created playlist \"New playlist.\"";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2025@").clickSubmit();
        homePage.clickTheCreatePlaylistBtn().selectNewPlaylist().providePlaylistName("New playlist");
        Assert.assertFalse();

    }

    @Test

    public void createNewPlaylistWithLessThanThreeCharacters() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        BasePage basePage = new BasePage(getDriver());

        String playListCreationErrorMsg = "Created playlist \"Tt.\"";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2025@").clickSubmit();
        homePage.clickTheCreatePlaylistBtn().selectNewPlaylist().providePlaylistName("Tt");
        Assert.assertEquals(homePage.getPlaylistCreationSuccessMsg(), playListCreationErrorMsg);


    }

    @Test

    public void createNewPlaylistWithMoreThanTenCharacters() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        BasePage basePage = new BasePage(getDriver());

        String playListCreationErrorMsg = "Created playlist \"TesttalbiTa.\"";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2025@").clickSubmit();
        homePage.clickTheCreatePlaylistBtn().selectNewPlaylist().providePlaylistName("TesttalbiTa");
        Assert.assertEquals(homePage.getPlaylistCreationSuccessMsg(), playListCreationErrorMsg);


    }










}
