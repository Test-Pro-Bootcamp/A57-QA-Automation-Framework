import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectmodel.*;

public class InfoPanelTests extends BaseTest{


    @Test (priority = 1)
    //Display Info panel
    public void checkInfoPanelVisibility() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        InfoPanelPage infoPanelPage = new InfoPanelPage(getDriver());


        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io", "te$t$tudent1");

        homePage.clickInfoPanel();

        homePage.clickInfoPanel();

        //Verify if info panel is visible
        Assert.assertTrue(infoPanelPage.IsInfoPanelVisible());

    }


    @Test (priority = 2)
    //Hide Info panel
    public void checkInfoPanelInvisibility() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        InfoPanelPage infoPanelPage = new InfoPanelPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io", "te$t$tudent1");

        //Click Info Panel as it is displayed by default
        if (infoPanelPage.IsInfoPanelVisible()) {
            homePage.clickInfoPanel();
        }
        //Verify if info panel is hidden
        Assert.assertTrue(infoPanelPage.IsInfoPanelHidden());

    }

    @Test (priority = 3)
    //Verify if Lyrics is displayed on the info panel
    public void checkSongLyricsDisplayed() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        //CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
        InfoPanelPage infoPanelPage = new InfoPanelPage(getDriver());
        FavoritesPage favoritesPage = new FavoritesPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io", "te$t$tudent1");

        //Navigate to Favorites Page
        favoritesPage.clickFavoritesLink();

        //Click Play Favorite Song
        favoritesPage.playFavoriteSong(1);

        //Click Info Panel
        if (!infoPanelPage.IsInfoPanelVisible()) {
            homePage.clickInfoPanel();
        }
        //Click Lyrics tab
        infoPanelPage.clickLyricsTab();

        //Check if Lyrics is displayed for the song
        Assert.assertTrue(infoPanelPage.isLyricsDisplayed(),"Lyrics is displayed in Info Panel");

    }

    @Test (priority = 4)
    //Verify if Lyrics is not displayed on the info panel
    public void checkSongLyricsNotDisplayed() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        InfoPanelPage infoPanelPage = new InfoPanelPage(getDriver());
        FavoritesPage favoritesPage = new FavoritesPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io", "te$t$tudent1");

        //Navigate to Favorites Page
        favoritesPage.clickFavoritesLink();

        //Click Play Favorite Song
        favoritesPage.playFavoriteSong(2);

        //Click Info Panel
        if (!infoPanelPage.IsInfoPanelVisible()) {
            homePage.clickInfoPanel();
        }
        //Click Lyrics tab
        infoPanelPage.clickLyricsTab();

        //Check if Lyrics is not displayed for the song
        Assert.assertFalse(infoPanelPage.isLyricsDisplayed(),"Lyrics is not displayed in Info Panel");

    }
    @Test (priority = 5)
    //Verify if Artist Name is displayed on the info panel
    public void checkPlayingSongArtistName() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        InfoPanelPage infoPanelPage = new InfoPanelPage(getDriver());
        FavoritesPage favoritesPage = new FavoritesPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io", "te$t$tudent1");

        //Navigate to Favorites Page
        favoritesPage.clickFavoritesLink();

        //Click Play Favorite Song
        favoritesPage.playFavoriteSong(2);

        //Click Info Panel
        if (!infoPanelPage.IsInfoPanelVisible()) {
            homePage.clickInfoPanel();
        }

        //Click Artist tab
        infoPanelPage.clickArtistTab();

        //Check if the artist name is displayed on the info panel
        Assert.assertEquals(infoPanelPage.getArtistName(),"Chad Crouch");

    }
    @Test (priority = 6)
    //Verify if Album Name is displayed on the info panel
    public void checkPlayingSongAlbumName() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        InfoPanelPage infoPanelPage = new InfoPanelPage(getDriver());
        FavoritesPage favoritesPage = new FavoritesPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io", "te$t$tudent1");

        //Navigate to Favorites Page
        favoritesPage.clickFavoritesLink();

        //Click Play Favorite Song
        favoritesPage.playFavoriteSong(2);

        //Click Info Panel
        if (!infoPanelPage.IsInfoPanelVisible()) {
            homePage.clickInfoPanel();
        }

        //Click Album tab
        infoPanelPage.clickAlbumTab();

        //Check if the album name is displayed on the info panel
        Assert.assertEquals(infoPanelPage.getAlbumName(),"Arps");

    }


    @Test (priority = 7)
    //Verify if Album Cover is displayed on the info panel
    public void checkPlayingSongAlbumCover() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        InfoPanelPage infoPanelPage = new InfoPanelPage(getDriver());
        FavoritesPage favoritesPage = new FavoritesPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io", "te$t$tudent1");

        //Navigate to Favorites Page
        favoritesPage.clickFavoritesLink();

        //Click Play Favorite Song
        favoritesPage.playFavoriteSong(2);

        //Click Info Panel
        if (!infoPanelPage.IsInfoPanelVisible()) {
            homePage.clickInfoPanel();
        }

        //Click Album tab
        infoPanelPage.clickAlbumTab();

        //Check if the album cover is displayed on the info panel
        Assert.assertTrue(infoPanelPage.isAlbumCoverDisplayed());

    }

    @Test (priority = 8)
    //Verify if songs by Artist are shuffled
    public void shuffleArtistSongs() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
        InfoPanelPage infoPanelPage = new InfoPanelPage(getDriver());
        UserPlayListPage userPlayListPage = new UserPlayListPage(getDriver());

        boolean shuffleSuccessful = true;
        int sameOrderCount = 0;
        int songListcount = 0;

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to User PlayList Page
        userPlayListPage.clickUserPlayListLink();

        userPlayListPage.playFirstUserPlayListSong();

        //Click Info Panel
        if (!infoPanelPage.IsInfoPanelVisible()) {
            homePage.clickInfoPanel();
        }

        //Click Artist tab
        infoPanelPage.clickArtistTab();

        //Click Artist Shuffle button
        infoPanelPage.clickArtistShuffle();

        songListcount = currentQueuePage.songCount();

        String[] songListBeforeShuffle = new String[songListcount];
        songListBeforeShuffle = currentQueuePage.queueSongList();

        infoPanelPage.clickArtistShuffle();

        String[] songListAfterShuffle = new String[songListcount];
        songListAfterShuffle =  currentQueuePage.queueSongList();

        //Check if the song is shuffled by comparing the title before and after shuffle
        for (int i=0; i<songListcount; i++)
        {
            if (songListBeforeShuffle[i].equals(songListAfterShuffle[i]))
            {
                sameOrderCount = sameOrderCount + 1;
            }
        }

        if (sameOrderCount == songListcount)
        {
            shuffleSuccessful =  false;
        }

        //Check if songs by Artist are shuffled
        Assert.assertTrue(shuffleSuccessful);

    }

    @Test (priority = 9)
    //Verify if songs by Album are shuffled
    public void shuffleAlbumSongs() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
        InfoPanelPage infoPanelPage = new InfoPanelPage(getDriver());
        UserPlayListPage userPlayListPage = new UserPlayListPage(getDriver());

        boolean shuffleSuccessful = true;
        int sameOrderCount = 0;
        int songListcount = 0;

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to User PlayList Page
        userPlayListPage.clickUserPlayListLink();

        userPlayListPage.playFirstUserPlayListSong();

        //Click Info Panel
        if (!infoPanelPage.IsInfoPanelVisible()) {
            homePage.clickInfoPanel();
        }

        //Click Album tab
        infoPanelPage.clickAlbumTab();

        //Click Album Shuffle button
        infoPanelPage.clickAlbumShuffle();

        songListcount = currentQueuePage.songCount();

        String[] songListBeforeShuffle = new String[songListcount];
        songListBeforeShuffle = currentQueuePage.queueSongList();

        infoPanelPage.clickAlbumShuffle();

        String[] songListAfterShuffle = new String[songListcount];
        songListAfterShuffle =  currentQueuePage.queueSongList();

        //Check if the song is shuffled by comparing the title before and after shuffle
        for (int i=0; i<songListcount; i++)
        {
            if (songListBeforeShuffle[i].equals(songListAfterShuffle[i]))
            {
                sameOrderCount = sameOrderCount + 1;
            }
        }

        if (sameOrderCount == songListcount)
        {
            shuffleSuccessful =  false;
        }

        //Check if songs by Album are shuffled
        Assert.assertTrue(shuffleSuccessful);

    }

}
