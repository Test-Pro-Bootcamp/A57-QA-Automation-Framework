import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectmodel.*;

public class PageNavigationCurrentQueueTests extends BaseTest{

    @Test (description="Check navigation from Home Page to Current Queue Page",priority = 1)
    public void navigateFromHomePage() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        currentQueuePage.clickCurrentQueueLink();

        homePage.clickHomePageLink();

        if (homePage.getHomePageHeader()) {

            homePage.playFirstMostPlayedSong();
        }

        Assert.assertTrue(currentQueuePage.isCurrentQueuePageHeaderDisplayed());

    }

    @Test (description="Check navigation from All Songs Page to Current Queue Page",priority = 2)
    public void navigateFromAllSongsPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        AllSongsPage allSongsPage = new AllSongsPage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to AllSongs Page
        allSongsPage.clickAllSongsLink();

        if (allSongsPage.getAllSongsPageHeader()) {

            allSongsPage.playFirstAllSongsPageSong();
        }

        Assert.assertTrue(currentQueuePage.isCurrentQueuePageHeaderDisplayed());

    }

    @Test (description="Check navigation from Albums Page to Current Queue Page", priority = 3)
    public void navigateFromAlbumsPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        AlbumsPage albumsPage = new AlbumsPage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to Albums Page
        albumsPage.clickAlbumsLink();

        if (albumsPage.getAlbumsPageHeader()) {
            albumsPage.playFirstAlbumSong();
        }

        Assert.assertTrue(currentQueuePage.isCurrentQueuePageHeaderDisplayed());


    }

    @Test (description="Check navigation from Artists Page to Current Queue Page",priority = 4)
    public void navigateToArtistsPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        ArtistsPage artistsPage = new ArtistsPage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to Artists Page
        artistsPage.clickArtistsLink();

        if (artistsPage.getArtistsPageHeader()) {
            artistsPage.playFirstArtistSong();
        }

        //Validate that the Artists Page is displayed on the screen
        Assert.assertTrue(currentQueuePage.isCurrentQueuePageHeaderDisplayed());

    }

    @Test (description="Check navigation from Favorites Page to Current Queue Page",priority = 5)
    public void navigateToFavoritesPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        FavoritesPage favoritesPage = new FavoritesPage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to Favorites Page
        favoritesPage.clickFavoritesLink();

        if (favoritesPage.getFavoritesPageHeader())
        {
            favoritesPage.playFavoriteSong(1);
        }

        Assert.assertTrue(currentQueuePage.isCurrentQueuePageHeaderDisplayed());

    }

    @Test (description="Check navigation from Recently Played Page to Current Queue Page",priority = 6)
    public void navigateToRecentlyPlayedPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        RecentlyPlayedPage recentlyPlayedPage = new RecentlyPlayedPage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to Recently Played Page
        recentlyPlayedPage.clickRecentlyPlayedLink();

        if (recentlyPlayedPage.getRecentlyPlayedPageHeader())
        {
            recentlyPlayedPage.playFirstRecentlyPlayedSong();
        }

        Assert.assertTrue(currentQueuePage.isCurrentQueuePageHeaderDisplayed());

    }

    @Test (description="Check navigation from User Playlist Page to Current Queue Page",priority = 7)
    public void navigateToUserPlayListPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        UserPlayListPage userPlayListPage = new UserPlayListPage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to User PlayList Page
        userPlayListPage.clickUserPlayListLink();

        if (userPlayListPage.getUserPlayListPageHeader())
        {
            userPlayListPage.playFirstUserPlayListSong();
        }

       Assert.assertTrue(currentQueuePage.isCurrentQueuePageHeaderDisplayed());

    }


}
