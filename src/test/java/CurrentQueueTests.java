import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectmodel.*;

public class CurrentQueueTests extends BaseTest{

    private static final String EMAIL = "sakthibala.sengottiyan@testpro.io";
    private static final String PASSWORD = "te$t$tudent1";
    @Test (description="Current Queue is displaying the playing song",priority = 1)

    public void isCurrentQueuePlayingSongDisplayed() {
        //Display currently played songs by a user
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
        //UserPlayListPage userPlayListPage = new UserPlayListPage(getDriver());
        ArtistsPage artistsPage = new ArtistsPage(getDriver());

        String currentQueueArtistName = "";
        String footerArtistName = "";

        loginPage.login(EMAIL,PASSWORD);

        //Navigate to Artists Page
        artistsPage.clickArtistsLink();

        artistsPage.playFirstArtistSong();

        if (currentQueuePage.getQueuePageHeader())
        {
            currentQueueArtistName = currentQueuePage.getPlayingSongArtistName();

            footerArtistName = homePage.getFooterArtistName();
        }

        Assert.assertEquals(currentQueueArtistName,footerArtistName);

    }

    //Total count of songs
    @Test (description="Display the Current Queue Song Count",priority = 2)

    public void isCurrentQueueSongCountDisplayed() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
        ArtistsPage artistsPage = new ArtistsPage(getDriver());

        int currentQueueSongCount;

        boolean songCountDisplayed = false;

        String[] currentQueueSongInfo = new String[5];

        loginPage.login(EMAIL,PASSWORD);

        //Navigate to Artists Page
        artistsPage.clickArtistsLink();

        artistsPage.playFirstArtistSong();

        if (currentQueuePage.getQueuePageHeader())
        {
            currentQueueSongInfo = currentQueuePage.getCurrentQueueSongCount().split("[ ]");

        }
        currentQueueSongCount = Integer.parseInt(currentQueueSongInfo[0]);

        if (currentQueueSongCount > 0)
        {
            songCountDisplayed = true;
        }
        Assert.assertTrue(songCountDisplayed);

    }

    //Total duration count of all songs should be displayed
    @Test (description="Display Current Queue Song Duration",priority = 3)

    public void isCurrentQueueSongDurationDisplayed() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
        ArtistsPage artistsPage = new ArtistsPage(getDriver());

        String[] songDuration;

        boolean songDurationDisplayed = false;

        String[] currentQueueSongInfo = new String[5];

        loginPage.login(EMAIL,PASSWORD);

        //Navigate to Artists Page
        artistsPage.clickArtistsLink();

        artistsPage.playFirstArtistSong();

        if (currentQueuePage.getQueuePageHeader())
        {
            currentQueueSongInfo = currentQueuePage.getCurrentQueueSongCount().split("[ ]");
        }

        songDuration = currentQueueSongInfo[currentQueueSongInfo.length-1].split(":");

        if ((Integer.parseInt(songDuration[0]) > 0 ) || (Integer.parseInt(songDuration[1]) > 0))
        {
            songDurationDisplayed = true;
        }
        Assert.assertTrue(songDurationDisplayed);

    }

    //ID, Title, Album, and TIme should be correctly displayed
    @Test (description="Verify if ID, Title, Artist, Album, and Time are displayed in Current Queue",priority = 4)

    public void isCurrentQueueSongInfoDisplayed() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
        ArtistsPage artistsPage = new ArtistsPage(getDriver());

        boolean songInfoDisplayed = false;

        String[] songInfo = new String[5];

        loginPage.login(EMAIL, PASSWORD);

        //Navigate to Artists Page
        artistsPage.clickArtistsLink();

        artistsPage.playFirstArtistSong();

        if (currentQueuePage.getQueuePageHeader()) {
            songInfo = currentQueuePage.getCurrentQueueSongInfo();
        }

        if ((!songInfo[0].isEmpty()) && (!songInfo[1].isEmpty()) && (!songInfo[2].isEmpty()) && (!songInfo[3].isEmpty()) && (!songInfo[4].isEmpty())) {
            songInfoDisplayed = true;
        }
        Assert.assertTrue(songInfoDisplayed, "Complete song information should be displayed");

    }

    //Shuffle All button should shuffle songs

    @Test (description="Shuffle All Current Queue Songs", priority = 5)
    //Verify if songs by Album are shuffled
    public void testShuffleCurrentQueueSongs() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
        InfoPanelPage infoPanelPage = new InfoPanelPage(getDriver());
        AlbumsPage albumsPage = new AlbumsPage(getDriver());
        UserPlayListPage userPlayListPage = new UserPlayListPage(getDriver());

        boolean shuffleSuccessful = true;
        int sameOrderCount = 0;
        int songListcount = 0;

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to Albums Page
        albumsPage.clickAlbumsLink();

        albumsPage.playFirstAlbumSong();

        if (currentQueuePage.getQueuePageHeader()) {
            songListcount = currentQueuePage.songCount();
        }

        String[] songListBeforeShuffle = new String[songListcount];
        String[] songListAfterShuffle = new String[songListcount];

        songListBeforeShuffle = currentQueuePage.queueSongList();

        currentQueuePage.clickCurrentShuffleAll();

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

    //Verify clear button displays blank page with a message

    @Test (description="Clear button clears the Current Queue ",priority = 6)

    public void testCurrentQueueClear() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
        ArtistsPage artistsPage = new ArtistsPage(getDriver());

        String currentQueueExpectedValidationMessage = "No songs queued." + "\n" + "How about shuffling all songs?";

        loginPage.login(EMAIL,PASSWORD);

        //Navigate to Artists Page
        artistsPage.clickArtistsLink();

        artistsPage.playFirstArtistSong();

        if (currentQueuePage.getQueuePageHeader())
        {
            currentQueuePage.clearCurrentQueue();
        }

        Assert.assertEquals(currentQueueExpectedValidationMessage,currentQueuePage.getTextCurrentQueueValidationMessage());

    }

    //Songs appear on the current queue page when clicking on the 'shuffling' all songs
    @Test (description="Test All Songs Shuffle", priority = 7)
    //Verify if songs by Album are shuffled
    public void testAllSongsShuffle() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
        AllSongsPage allSongsPage = new AllSongsPage(getDriver());

        int currentQueueSongCount;
        int allSongsCount;

        String[] currentQueueSongInfo = new String[5];
        String[] allSongsInfo = new String[5];

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Navigate to AllSongs Page
        allSongsPage.clickAllSongsLink();

        if (allSongsPage.getAllSongsPageHeader()) {

            allSongsInfo = allSongsPage.getAllSongsCount().split("[ ]");
        }

        allSongsCount = Integer.parseInt(allSongsInfo[0]);

        allSongsPage.clickAllSongsShuffle();

        if (currentQueuePage.getQueuePageHeader()) {
            currentQueueSongInfo = currentQueuePage.getCurrentQueueSongCount().split("[ ]");
        }

        currentQueueSongCount = Integer.parseInt(currentQueueSongInfo[0]);

        Assert.assertEquals(currentQueueSongCount,allSongsCount);

    }



}
