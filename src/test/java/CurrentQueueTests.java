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

        //String userListFirstArtistName = "";

        //Login using Email and Password
        loginPage.login(EMAIL,PASSWORD);

        //Navigate to Artists Page
        artistsPage.clickArtistsLink();

        artistsPage.playFirstArtistSong();

        //Navigate to CurrentQueue Page
        //currentQueuePage.clickCurrentQueueLink();
        //currentQueuePage.clearCurrentQueue();

        if (currentQueuePage.getQueuePageHeader())
        {
            currentQueueArtistName = currentQueuePage.getPlayingSongArtistName();

            footerArtistName = homePage.getFooterArtistName();
        }

        System.out.println(currentQueueArtistName);
        System.out.println(footerArtistName);
        //Navigate to User PlayList Page
        //userPlayListPage.clickUserPlayListLink();

        //userListFirstArtistName = userPlayListPage.getUserPlaylistFirstArtistName();
       // userPlayListPage.playFirstUserPlayListSong();

        Assert.assertEquals(currentQueueArtistName,footerArtistName);

    }

    //Total count of songs
    @Test (description="Current Queue Song Count is displayed",priority = 2)

    public void isCurrentQueueSongCountDisplayed() {
        //Display currently played songs by a user
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
        //UserPlayListPage userPlayListPage = new UserPlayListPage(getDriver());
        ArtistsPage artistsPage = new ArtistsPage(getDriver());

        //int songListcount = 0;
        int currentQueueSongCount;
        //char countCharacter;
        boolean songCountDisplayed = false;

        String[] currentQueueSongInfo = new String[5];


        //Login using Email and Password
        //loginPage.login("sakthibala.sengottiyan@testpro.io", "te$t$tudent1");

        loginPage.login(EMAIL,PASSWORD);

        //Navigate to Artists Page
        artistsPage.clickArtistsLink();

        artistsPage.playFirstArtistSong();

        //String[] abc = new String[5];

        if (currentQueuePage.getQueuePageHeader())
        {
            currentQueueSongInfo = currentQueuePage.getCurrentQueueSongCount().split("[ ]");
            //System.out.println(abc[0]);
            //System.out.println(abc[abc.length-1]);
            //currentQueueSongCount = (currentQueuePage.getCurrentQueueSongCount()).charAt(0);
        }

        //Navigate to User PlayList Page
        //userPlayListPage.clickUserPlayListLink();

        //Click Shuffle All button
        //userPlayListPage.shuffleAllSongs();

        //currentQueueSongCount = (currentQueuePage.getCurrentQueueSongCount()).charAt(0);

        currentQueueSongCount = Integer.parseInt(currentQueueSongInfo[0]);

        //System.out.println(currentQueueSongCount);

        //if (Character.getNumericValue(currentQueueSongCount) > 0)
        if (currentQueueSongCount > 0)
        {
            songCountDisplayed = true;
        }
        Assert.assertTrue(songCountDisplayed);

    }

    //Total duration count of all songs should be displayed
    @Test (description="Current Queue Song Duration is displayed",priority = 3)

    public void isCurrentQueueSongDurationDisplayed() {
        //Display currently played songs by a user
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
        //UserPlayListPage userPlayListPage = new UserPlayListPage(getDriver());
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

        System.out.println(songDuration[0]);
        System.out.println(songDuration[1]);

        if ((Integer.parseInt(songDuration[0]) > 0 ) || (Integer.parseInt(songDuration[1]) > 0))
        {
            songDurationDisplayed = true;
        }
        Assert.assertTrue(songDurationDisplayed);

    }

    //ID, Title, Album, and TIme should be correctly displayed
    @Test (description="ID, Title, Artist, Album, and Time should be displayed",priority = 4)

    public void isCurrentQueueSongInfoDisplayed() {
        //Display currently played songs by a user
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
       // UserPlayListPage userPlayListPage = new UserPlayListPage(getDriver());
        ArtistsPage artistsPage = new ArtistsPage(getDriver());
        //InfoPanelPage infoPanelPage = new InfoPanelPage(getDriver());

        boolean songInfoDisplayed = false;

        String[] songInfo = new String[5];

        loginPage.login(EMAIL, PASSWORD);

        //Navigate to Artists Page
        artistsPage.clickArtistsLink();

        artistsPage.playFirstArtistSong();

//        //Navigate to User PlayList Page
//        userPlayListPage.clickUserPlayListLink();
//
//        userPlayListPage.playFirstUserPlayListSong();
//
//        //Click Info Panel
//        if (!infoPanelPage.IsInfoPanelVisible()) {
//            homePage.clickInfoPanel();
//        }
//
//        //Click Artist tab
//        infoPanelPage.clickArtistTab();
//
//        //Click Artist Shuffle button
//        infoPanelPage.clickArtistShuffle();

        if (currentQueuePage.getQueuePageHeader()) {
            //currentQueueSongInfo = currentQueuePage.getCurrentQueueSongCount().split("[ ]");
            songInfo = currentQueuePage.getCurrentQueueSongInfo();
        }

        if ((!songInfo[0].isEmpty()) && (!songInfo[1].isEmpty()) && (!songInfo[2].isEmpty()) && (!songInfo[3].isEmpty()) && (!songInfo[4].isEmpty())) {
            songInfoDisplayed = true;
        }
        Assert.assertTrue(songInfoDisplayed, "Complete song information should be displayed");

    }

    //Navigate to Current Queue Page from Home on double-clicking the song

    //Navigate to Current Queue Page from All Songs on double-clicking the song

    //Navigate to Current Queue Page from Albums on double-clicking the song

    //Navigate to Current Queue Page from Artists on double-clicking the song

    //Navigate to Current Queue Page from Favorites on double-clicking the song

    //Navigate to Current Queue Page from Recently played on double-clicking the song

    //Navigate to Current Queue Page from User's created playlist on double-clicking the song

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

        //infoPanelPage.clickAlbumShuffle();

        currentQueuePage.clickCurrentShuffleAll();

        songListAfterShuffle =  currentQueuePage.queueSongList();

        //Check if the song is shuffled by comparing the title before and after shuffle
        for (int i=0; i<songListcount; i++)
        {
            System.out.println(songListBeforeShuffle[i]);
            System.out.println(songListAfterShuffle[i]);
            System.out.println("\n");
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
        //Display currently played songs by a user
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        CurrentQueuePage currentQueuePage = new CurrentQueuePage(getDriver());
        ArtistsPage artistsPage = new ArtistsPage(getDriver());

        String currentQueueExpectedValidationMessage = "No songs queued." + "\n" + "How about shuffling all songs?";

        //Login using Email and Password
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

        //System.out.println(allSongsCount);

        allSongsPage.clickAllSongsShuffle();

        if (currentQueuePage.getQueuePageHeader()) {
            currentQueueSongInfo = currentQueuePage.getCurrentQueueSongCount().split("[ ]");
        }


        currentQueueSongCount = Integer.parseInt(currentQueueSongInfo[0]);

        //System.out.println(currentQueueSongCount);

        Assert.assertEquals(currentQueueSongCount,allSongsCount);

    }



}
