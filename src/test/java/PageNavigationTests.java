import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectmodel.*;

public class PageNavigationTests extends BaseTest{

    @Test (priority = 1)
    public void navigateToCurrentQueuePage() {

        LoginPage loginPage = new LoginPage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to CurrentQueue Page
        currentQueuePage.clickCurrentQueueLink();

        //Validate that the Current Queue Page is displayed on the screen
        Assert.assertTrue(currentQueuePage.getQueuePageHeader());

    }

    @Test (priority = 2)
    public void navigateToAllSongsPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        AllSongsPage allSongsPage = new AllSongsPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to AllSongs Page
        allSongsPage.clickAllSongsLink();

        //Validate that the AllSongs Page is displayed on the screen
        Assert.assertTrue(allSongsPage.getAllSongsPageHeader());

    }

    @Test (priority = 3)
    public void navigateToAlbumsPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        AlbumsPage albumsPage = new AlbumsPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to Albums Page
        albumsPage.clickAlbumsLink();

        //Validate that the Albums Page is displayed on the screen
        Assert.assertTrue(albumsPage.getAlbumsPageHeader());

    }

    @Test (priority = 4)
    public void navigateToArtistsPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        ArtistsPage artistsPage = new ArtistsPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to Artists Page
        artistsPage.clickArtistsLink();

        //Validate that the Artists Page is displayed on the screen
        Assert.assertTrue(artistsPage.getArtistsPageHeader());

    }

    @Test (priority = 5)
    public void navigateToFavoritesPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        FavoritesPage favoritesPage = new FavoritesPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to Favorites Page
        favoritesPage.clickFavoritesLink();

        //Validate that the Favorites Page is displayed on the screen
        Assert.assertTrue(favoritesPage.getFavoritesPageHeader());

    }

    @Test (priority = 6)
    public void navigateToRecentlyPlayedPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        RecentlyPlayedPage recentlyPlayedPage = new RecentlyPlayedPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to Recently Played Page
        recentlyPlayedPage.clickRecentlyPlayedLink();

        //Validate that the Recently Played Page is displayed on the screen
        Assert.assertTrue(recentlyPlayedPage.getRecentlyPlayedPageHeader());

    }

    @Test (priority = 7)
    public void navigateToUserPlayListPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        UserPlayListPage userPlayListPage = new UserPlayListPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to User PlayList Page
        userPlayListPage.clickUserPlayListLink();

        //Validate that the User PlayList Page is displayed on the screen
        Assert.assertTrue(userPlayListPage.getUserPlayListPageHeader());

    }


}
