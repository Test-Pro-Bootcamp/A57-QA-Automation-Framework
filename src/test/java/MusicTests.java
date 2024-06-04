import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;

public class MusicTests extends BaseTest {

    @Test
    public void playSong() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login("sakthibala.sengottiyan@testpro.io","te$t$tudent1");

        //Click Play Next Song
        homePage.playNextSong();

        //Validate that the song is playing by checking the sound bar
        Assert.assertTrue(homePage.isSoundBarVisible());

    }

}
