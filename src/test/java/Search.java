import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search extends BaseTest{


    @Test

    public void searchForASong(){

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String songResults = "Pluto\n" +
                "Makaih Beats";
        String artistErrorMg= "None found.";
        String albumErrorMsg ="None found.";

        loginPage.provideEmail("tassadit.test@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.provideSongName("Pluto");
        Assert.assertEquals(homePage.verifySongResult(),songResults);
        Assert.assertFalse(homePage.verifyAlbumResult(),albumErrorMsg);
        Assert.assertFalse(homePage.verifyArtistResult(),artistErrorMg);

    }


@Test

    public void verifyEmptyListIsDisplayedForNonExistingSong(){
    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());


    loginPage.provideEmail("tassadit.test@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.provideSongName("Rihanna");
    Assert.assertFalse(homePage.isSearchResultDisplayed());

}
@Test

    public void searchASongWithUpperCase(){

    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());


    loginPage.provideEmail("tassadit.test@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.provideSongName("PLUTO");
    Assert.assertFalse(homePage.isSearchResultDisplayed());


}
@Test

    public void searchForASongWithLowerCase(){
    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());


    loginPage.provideEmail("tassadit.test@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.provideSongName("pluto");
    Assert.assertFalse(homePage.isSearchResultDisplayed());

}

@Test

    public void verifyUserCanClearSearchWithKeyboard(){

    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());
    String searchFieldText ="Press F to search";

    loginPage.provideEmail("tassadit.test@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.provideSongName("Pluto").clearTheSearchResult();
    Assert.assertEquals(homePage.clickOnSearchField(),searchFieldText);

}
@Test

    public void verifyUserCanClearSearchWithXBtn(){ //couldn't find the x button locator

    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());
    String searchFieldText ="Press F to search";


    loginPage.provideEmail("tassadit.test@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.provideSongName("Pluto").clearTheSearchResult();
    Assert.assertEquals(homePage.clickOnXBtn(),searchFieldText);


}



}
