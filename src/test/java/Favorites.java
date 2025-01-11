import Pages.BasePage;
import Pages.DownlaodPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Favorites extends BaseTest{


    @Test

    public void addSongsToFavorites(){

        String songCount = "2 songs • 04:17 • Download All";

        LoginPage loginPage= new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnAllSongsBtn().clickHoliznaLikeBtn().clickRiquiLikeBtn().clickFavoritePlaylist();
        Assert.assertEquals(homePage.getSongCountText(),songCount);
    }
    @Test
    public void deleteSongsFromFavorites(){

String noFavoriteMsg = "No favorites yet.\n" +
        "Click the icon to mark a song as favorite.";
        LoginPage loginpage = new LoginPage(getDriver());
        HomePage homepage = new HomePage(getDriver());

        loginpage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homepage.clickFavoritePlaylist().unlikeHoliznaSong().unlikeRiquiSong();
        Assert.assertEquals(homepage.getNofavoritesyetMsg(),noFavoriteMsg);


    }

    @Test

    public void downlaodSongdFromFavorites(){  //dont know how to write code for downlaod 

       String downloadDir = "C:\\Users\\Zina\\Downloads"; // Set the path to your download folder
        String songFileName = "REW_-Riqui-Riqui(8)"; // Set the expected downloaded file name

       LoginPage loginPage=new LoginPage(getDriver());
       HomePage homePage = new HomePage(getDriver());
        BasePage basePage = new BasePage(getDriver());
        DownlaodPage downloadPage = new DownlaodPage(getDriver());


    loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.clickFavoritePlaylist();
    basePage.contextClickSong();
    homePage.clickDownlaoadBtn();
    Assert.assertTrue(downloadPage.isFileDownloaded());


    }

}
