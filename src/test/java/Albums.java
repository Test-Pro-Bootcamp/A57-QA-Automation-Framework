import Pages.AlbumPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Albums extends BaseTest{

    @Test

    public void VerifyCoverIsPresent(){

        LoginPage loginPage = new LoginPage(getDriver());

        AlbumPage albumPage = new AlbumPage(getDriver());

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        albumPage.clickOnAlbumBtn();
        Assert.assertTrue(albumPage.verifyAlbumCoverExists());

    }

    @Test
    public void verifyKoelStandardAlbumCoverIsPresent(){
        LoginPage loginPage = new LoginPage(getDriver());

        AlbumPage albumPage = new AlbumPage(getDriver());

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        albumPage.clickOnAlbumBtn();

        Assert.assertTrue(albumPage.VerifyKoelStandardCoverExists());

    }

    @Test
    public void verifyAlbumNameIsDisplayed(){
        LoginPage loginPage = new LoginPage(getDriver());

        AlbumPage albumPage = new AlbumPage(getDriver());

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        albumPage.clickOnAlbumBtn();

        Assert.assertTrue(albumPage.verifyAlbumNameIsDisplayed());

    }

    @Test
    public void verifyAlbumArtistNameIsDisplayed(){
        LoginPage loginPage = new LoginPage(getDriver());

        AlbumPage albumPage = new AlbumPage(getDriver());

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        albumPage.clickOnAlbumBtn();

        Assert.assertTrue(albumPage.verifyAlbumArtistNameIsDisplayed());

    }

    @Test
    public void verifyAlbumSongCountIsDisplayed(){
        LoginPage loginPage = new LoginPage(getDriver());

        AlbumPage albumPage = new AlbumPage(getDriver());

        String songCountText= "3 songs.10:32.2 plays";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        albumPage.clickOnAlbumBtn();

        Assert.assertTrue(albumPage.verifyAlbumSongCountIsDisplayed(),songCountText);

    }

    // I did all the acceptance criteria except the two last ones concerning shuffle icon and download icon since I couldnt locate them in devtools , they dont show until I hover on them , so please if you can show me how I can do it .//

}
