
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.ProfilePage;

public class UserPlayListTests extends BaseTest{

    private static final String VALID_EMAIL = "sakthibala.sengottiyan@testpro.io";
    private static final String VALID_PASSWORD = "te$t$tudent1";


    @Test (description="Create a new playlist",priority = 1)
    public void testCreatePlaylist() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        String playListName = "Test " + homePage.generateRandomName().substring(0,4);

        homePage.createNewPlaylist(playListName);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"New playlist created.");

    }

    @Test (description="Create playlist with empty name",priority = 2)
    public void testCreatePlaylistWithEmptyName() {

        String expectedErrorValidationMessage = "Please fill out this field.";

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        //Login using Email and Password
        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        homePage.createNewPlaylist("");

        Assert.assertEquals(homePage.getTextPlayListValidationMessage(),expectedErrorValidationMessage,"");

    }

    @Test(description = "Create playlist with invalid names", dataProvider = "invalidPlayListNames", priority = 3)
    public void testInvalidPlayListNames(String playListName, String description) {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        homePage.createNewPlaylist(playListName);

        Assert.assertFalse(homePage.isSuccessAlertDisplayed(),"Incorrect PlayListName: " + description);

    }

    @DataProvider(name = "invalidPlayListNames")
    private Object[][] provideInvalidPlaylistNames() {
        return new Object[][]{
                {"Test1", "Playlist with existing name"},
                {"ab", "Playlist with less than 3 characters"},
                {"Test1234567", "Playlist with more than 10 characters"}
        };
    }

}
