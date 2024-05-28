import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Homework22 extends BaseTest {


    @Test

    public void deletePlaylist (){

        LoginPage loginPage = new LoginPage (driver);
        HomePage homePage = new HomePage(driver);

        String expectedPlaylistDeletedMsg= "\"Deleted playlist \" tassadit playlist.\"";

        loginPage.provideEmail("tassadit.talbi@testpro.io");
        loginPage.providePassword("Password2026@");
        loginPage.clickSubmit();
        //Assert.assertTrue(homePage.getAvatarIcon().isDisplayed());
        homePage.clickOnPlaylist();
        homePage.clickDeletePlaylist();
        Assert.assertEquals(homePage.getDeletedPlaylistMsg(),expectedPlaylistDeletedMsg);

    }
}
