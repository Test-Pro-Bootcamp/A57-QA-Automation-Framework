import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectmodel.*;

public class PageNavigationCurrentQueueTests extends BaseTest{

//    @Test (priority = 1)
//    public void navigateToHomePage() {
//
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
//
//        //Login using Email and Password
//        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");
//
//        //Navigate to CurrentQueue Page
//        currentQueuePage.clickCurrentQueueLink();
//
//        //Navigate to AllSongs Page
//        homePage.clickHomePageLink();
//
//        if (homePage.getHomePageHeader()) {
//
//            homePage.playFirstMostPlayedSong();
//        }
//
//        //Validate that the Current Queue Page is displayed on the screen
//        Assert.assertTrue(currentQueuePage.isCurrentQueuePageHeaderDisplayed());
//
//    }
//
//    @Test (priority = 2)
//    public void navigateFromAllSongsPage() {
//
//        LoginPage loginPage = new LoginPage(getDriver());
//        AllSongsPage allSongsPage = new AllSongsPage(getDriver());
//        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
//
//        //Login using Email and Password
//        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");
//
//        //Navigate to AllSongs Page
//        allSongsPage.clickAllSongsLink();
//
//        if (allSongsPage.getAllSongsPageHeader()) {
//
//            allSongsPage.playFirstAllSongsPageSong();
//        }
//
//        //Validate that the AllSongs Page is displayed on the screen
//        Assert.assertTrue(currentQueuePage.isCurrentQueuePageHeaderDisplayed());
//
//    }
//
//    @Test (priority = 3)
//    public void navigateFromAlbumsPage() {
//
//        LoginPage loginPage = new LoginPage(getDriver());
//        AlbumsPage albumsPage = new AlbumsPage(getDriver());
//        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
//
//        //Login using Email and Password
//        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");
//
//        //Navigate to Albums Page
//        albumsPage.clickAlbumsLink();
//
//        if (albumsPage.getAlbumsPageHeader()) {
//            albumsPage.playFirstAlbumSong();
//        }
//        //Validate that the Albums Page is displayed on the screen
//        Assert.assertTrue(currentQueuePage.isCurrentQueuePageHeaderDisplayed());
//
//
//    }
//
//    @Test (priority = 4)
//    public void navigateToArtistsPage() {
//
//        LoginPage loginPage = new LoginPage(getDriver());
//        ArtistsPage artistsPage = new ArtistsPage(getDriver());
//        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
//
//        //Login using Email and Password
//        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");
//
//        //Navigate to Artists Page
//        artistsPage.clickArtistsLink();
//
//        if (artistsPage.getArtistsPageHeader()) {
//            artistsPage.playFirstArtistSong();
//        }
//
//        //Validate that the Artists Page is displayed on the screen
//        Assert.assertTrue(currentQueuePage.isCurrentQueuePageHeaderDisplayed());
//
//    }
//
//    @Test (priority = 5)
//    public void navigateToFavoritesPage() {
//
//        LoginPage loginPage = new LoginPage(getDriver());
//        FavoritesPage favoritesPage = new FavoritesPage(getDriver());
//        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
//
//        //Login using Email and Password
//        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");
//
//        //Navigate to Favorites Page
//        favoritesPage.clickFavoritesLink();
//
//        if (favoritesPage.getFavoritesPageHeader())
//        {
//            favoritesPage.playFavoriteSong(1);
//        }
//
//        //Validate that the Favorites Page is displayed on the screen
//        Assert.assertTrue(currentQueuePage.isCurrentQueuePageHeaderDisplayed());
//
//    }
//
//    @Test (priority = 6)
//    public void navigateToRecentlyPlayedPage() {
//
//        LoginPage loginPage = new LoginPage(getDriver());
//        RecentlyPlayedPage recentlyPlayedPage = new RecentlyPlayedPage(getDriver());
//        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
//
//        //Login using Email and Password
//        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");
//
//        //Navigate to Recently Played Page
//        recentlyPlayedPage.clickRecentlyPlayedLink();
//
//        if (recentlyPlayedPage.getRecentlyPlayedPageHeader())
//        {
//            recentlyPlayedPage.playFirstRecentlyPlayedSong();
//        }
//
//        //Validate that the Recently Played Page is displayed on the screen
//        Assert.assertTrue(currentQueuePage.isCurrentQueuePageHeaderDisplayed());
//
//    }
//
//    @Test (priority = 7)
//    public void navigateToUserPlayListPage() {
//
//        LoginPage loginPage = new LoginPage(getDriver());
//        UserPlayListPage userPlayListPage = new UserPlayListPage(getDriver());
//        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
//
//        //Login using Email and Password
//        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");
//
//        //Navigate to User PlayList Page
//        userPlayListPage.clickUserPlayListLink();
//
//        if (userPlayListPage.getUserPlayListPageHeader())
//        {
//            userPlayListPage.playFirstUserPlayListSong();
//        }
//
//        //Validate that the User PlayList Page is displayed on the screen
//        Assert.assertTrue(currentQueuePage.isCurrentQueuePageHeaderDisplayed());
//
//    }


}
