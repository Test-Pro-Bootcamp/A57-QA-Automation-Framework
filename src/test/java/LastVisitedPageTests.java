import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.thread.IThreadWorkerFactory;
import pageobjectmodel.*;

public class LastVisitedPageTests extends BaseTest {

    @Test (priority = 1)
    public void navigateToLastVisitedCurrentQueuePage() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to CurrentQueuePage
        currentQueuePage.clickCurrentQueueLink();

        //Log Out
        homePage.logOut();

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Validate that the Current Queue Page is displayed on the screen
        Assert.assertTrue(currentQueuePage.getQueuePageHeader());


    }

    @Test (priority = 2)
    public void navigateToLastVisitedAllSongsPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        AllSongsPage allSongsPage = new AllSongsPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to AllSongs Page
        allSongsPage.clickAllSongsLink();

        //Log Out
        homePage.logOut();

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Validate that AllSongs Page is displayed on the screen
        Assert.assertTrue(allSongsPage.getAllSongsPageHeader());

    }

    @Test (priority = 3)
    public void navigateToLastVisitedAlbumsPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        AlbumsPage albumsPage = new AlbumsPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to Albums Page
        albumsPage.clickAlbumsLink();

        //Log Out
        homePage.logOut();

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Validate that the Albums Page is displayed on the screen
        Assert.assertTrue(albumsPage.getAlbumsPageHeader());

    }

    @Test (priority = 4)
    public void navigateToLastVisitedArtistsPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ArtistsPage artistsPage = new ArtistsPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to Artists Page
        artistsPage.clickArtistsLink();

        //Log Out
        homePage.logOut();

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Validate that Artists Page is displayed on the screen
        Assert.assertTrue(artistsPage.getArtistsPageHeader());

    }

    @Test (priority = 5)
    public void navigateToLastVisitedFavoritesPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        FavoritesPage favoritesPage = new FavoritesPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to Favorites Page
        favoritesPage.clickFavoritesLink();

        //Log Out
        homePage.logOut();

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Validate that the Favorites Page is displayed on the screen
        Assert.assertTrue(favoritesPage.getFavoritesPageHeader());

    }

    @Test (priority = 6)
    public void navigateToLastVisitedRecentlyPlayedPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        RecentlyPlayedPage recentlyPlayedPage = new RecentlyPlayedPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to Recently Played Page
        recentlyPlayedPage.clickRecentlyPlayedLink();

        //Log Out
        homePage.logOut();

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Validate that the Recently Played Page is displayed on the screen
        Assert.assertTrue(recentlyPlayedPage.getRecentlyPlayedPageHeader());

    }

    @Test (priority = 7)
    public void navigateToLastVisitedUserPlayListPage() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        UserPlayListPage userPlayListPage = new UserPlayListPage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to User PlayList Page
        userPlayListPage.clickUserPlayListLink();

        //Log Out
        homePage.logOut();

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Validate that the User PlayList Queue Page is displayed on the screen
        Assert.assertTrue(userPlayListPage.getUserPlayListPageHeader());

    }



}
