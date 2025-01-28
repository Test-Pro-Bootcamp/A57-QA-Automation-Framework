import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddSongToNewPlaylist extends BaseTest {

    @Test

    public void createNewPlaylist(){//pass

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String successMsg= "Created playlist \"My Playlist.\"";


        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnCreatePlaylistBtn().clickOnCreateNewPlaylistDropDown().WritePlaylistName("My Playlist");
        Assert.assertEquals(homePage.getSuccessNotification(),successMsg);

    }

@Test

    public void addSongToPlaylist(){// pass
    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());
    String message = "Added 1 song into \"My Playlist.\"";

    loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.clickOnAllSongsBtn().contextClickPlutoSong();
    homePage.moveToAddToBtn();
    homePage.clickOnAddToBtn().clickOnMyPlaylist();

    Assert.assertEquals(homePage.getSuccessNotification(),message);
}


    @Test

    public void createNewPlaylistWith257Characters(){ // failed it is a bug

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String successMsg= "Created playlist \"WinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinte.\"";


        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnCreatePlaylistBtn().clickOnCreateNewPlaylistDropDown().WritePlaylistName("WinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinterWinte");
        Assert.assertEquals(homePage.getSuccessNotification(),successMsg);

    }

    @Test

    public void createNewPlaylistWith1Characters(){//pass

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String successMsg= "Created playlist \"A.\"";


        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnCreatePlaylistBtn().clickOnCreateNewPlaylistDropDown().WritePlaylistName("A");
        Assert.assertEquals(homePage.getSuccessNotification(),successMsg);

    }

    @Test

    public void createNewPlaylistWith0Characters(){ //Pass

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String successMsg= "Created playlist \"\"";


        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnCreatePlaylistBtn().clickOnCreateNewPlaylistDropDown().WritePlaylistName("");
        Assert.assertEquals(homePage.getSuccessNotification(),successMsg);

    }

}
