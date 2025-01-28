import Pages.AllSongsPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllSongs extends BaseTest{

    @Test

    public void VerifyTotalCountAndDurationOfSongsIsDisplayed(){

        LoginPage loginPage = new LoginPage(getDriver());
        AllSongsPage allSongsPage = new AllSongsPage(getDriver());
        String songCountDurationText= "66 songs.04:32:57";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        allSongsPage.clickOnAllSongs();
        Assert.assertTrue(allSongsPage.isSongsCountAndDurationDisplayed(),songCountDurationText);
    }

    @Test

    public void VerifyIdIsCorrectlyDisplayed(){

        LoginPage loginPage = new LoginPage(getDriver());
        AllSongsPage allSongsPage = new AllSongsPage(getDriver());
        String songIdText= "#";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        allSongsPage.clickOnAllSongs();
        Assert.assertTrue(allSongsPage.isSongIdDisplayed(),songIdText);
    }


    @Test

    public void VerifyArtistIsCorrectlyDisplayed(){

        LoginPage loginPage = new LoginPage(getDriver());
        AllSongsPage allSongsPage = new AllSongsPage(getDriver());
        String songArtistText= "Artist";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        allSongsPage.clickOnAllSongs();
        Assert.assertTrue(allSongsPage.isSongArtistTabDisplayed(),songArtistText);
    }
    @Test

    public void VerifyTitleIsCorrectlyDisplayed(){

        LoginPage loginPage = new LoginPage(getDriver());
        AllSongsPage allSongsPage = new AllSongsPage(getDriver());
        String songTitleText= "TITLE";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        allSongsPage.clickOnAllSongs();
        Assert.assertTrue(allSongsPage.isSongTitleTabDisplayed(),songTitleText);
    }
    @Test

    public void VerifyAlbumIsCorrectlyDisplayed(){

        LoginPage loginPage = new LoginPage(getDriver());
        AllSongsPage allSongsPage = new AllSongsPage(getDriver());
        String songAlbumText= "ALBUM";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        allSongsPage.clickOnAllSongs();
        Assert.assertTrue(allSongsPage.isSongAlbumTabDisplayed(),songAlbumText);
    }
    @Test

    public void VerifyTimeIsCorrectlyDisplayed(){

        LoginPage loginPage = new LoginPage(getDriver());
        AllSongsPage allSongsPage = new AllSongsPage(getDriver());
        String songTimeText= "TIME";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        allSongsPage.clickOnAllSongs();
        Assert.assertTrue(allSongsPage.isSongTimeFieldDisplayed(),songTimeText);
    }



}
