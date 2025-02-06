import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmartPlaylist extends BaseTest{



    @Test
    public void createSmartPlaylistWithOneRule(){//Pass

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String successMsg ="Created playlist \"Student playlist.\"";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnCreatePlaylistBtn().clickOnCreatePlaylistDropD();
        homePage.writeSmartPlaylistName("Student playlist").selectTitleFromDropDown();
        homePage.selectIsFromSecondDropDown();
        homePage.writeTheSongName("Dark Days").clickOnSaveBtn();
        Assert.assertEquals(homePage.getSuccessNotification(),successMsg);

    }
@Test

public void createSmartPlaylistWithOneRulRelatedSongsAppear() {//Pass
    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());
    loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.clickOnSmartPlaylist();
    Assert.assertTrue(homePage.isDarkDaysDisplayed());

}

@Test
    public void createSmartPlaylistWithMultipleRules() {//Pass

    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());
    String successMsg = "Created playlist \"Zina playlist.\"";

    loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.clickOnCreatePlaylistBtn().clickOnCreatePlaylistDropD();
    homePage.writeSmartPlaylistName("Zina playlist").clickOnRuleBtn().selectTitleFromDropDown();
    homePage.selectIsFromSecondDropDown();
    homePage.writeTheSongName("Pluto").selectAlbumFromDropDownRule2();
    homePage.selectIsFromDropDownRule2();
    homePage.writeNameOfAlbum("Airbit").clickOnSaveBtn();
    Assert.assertEquals(homePage.getSuccessMsg(), successMsg);

}

@Test
     public void createSmartPlaylistWithAGroup(){//Pass
    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());
    String successMsg = "Created playlist \"Tass Group Playlist.\"";
    loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.clickOnCreatePlaylistBtn().clickOnCreatePlaylistDropD();
    homePage.writeSmartPlaylistName("Tass Group Playlist").clickOnGroupBtn().selectAlbumFromFirstDropDown();
    homePage.selectIsFromGroupSecondDropDown();
    homePage.writeAlbum1Name("Airbit");
    homePage.selectAlbumFromThirdGroupDropDown();
    homePage.selectIsFromFourthGroupDropDown();
    homePage.writeAlbum2Name("Marginal");
    homePage.clickOnSaveBtn();
    Assert.assertEquals(homePage.getSuccessMsg(),successMsg);

}

    @Test
    public void createEmptySmartPlaylist(){//pass

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String successMsg ="Created playlist \"Zin playlist.\"";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnCreatePlaylistBtn().clickOnCreatePlaylistDropD();
        homePage.writeSmartPlaylistName("Zin playlist").selectTitleFromDropDown();
        homePage.selectIsFromSecondDropDown();
        homePage.writeTheSongName("love").clickOnSaveBtn();
        Assert.assertEquals(homePage.getSuccessNotification(),successMsg);

    }
@Test
    public void VerifyEmptySmartPlaylistHsNoSongs() {//Pass
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String emptyPlaylistMsg = "No songs match the playlist's criteria.";
        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnZinPlaylist();
        Assert.assertEquals(homePage.verifyPlaylistIsEmpty(), emptyPlaylistMsg);

    }
}



