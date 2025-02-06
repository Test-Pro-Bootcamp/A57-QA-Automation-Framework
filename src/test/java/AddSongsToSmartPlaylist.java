import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddSongsToSmartPlaylist extends BaseTest{





    @Test

    public void addSongsToTheSmartPlaylistByEditingExistingRulesAndGroupSettings(){ // pass
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage =new HomePage(getDriver());
        String successMsg = "Updated playlist \"Student playlist.\"";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.contextClickOnStudentPlaylist().clickOnEditBtn().clickOnGroupBtn().clickOnSmartPlaylistFirstSelect();
        homePage.clickOnSmartPlaylistSecondSelect();
        homePage.WriteSongName("Pluto").clickOnSveBtn();
        Assert.assertEquals(homePage.getSuccessMsg(),successMsg);



    }

@Test

    public void deleteSmartPlaylist(){ // pass : for homework checkers , the playlist i used here is deleted
    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage =new HomePage(getDriver());
    String successMsg = "Deleted playlist \"Zin playlist\"";
    loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.contextClickOnZinPlaylist().clickOnDeleteBtn().clickOnOkBtn();
    Assert.assertEquals(homePage.getSuccessMsg(),successMsg);


}




}
