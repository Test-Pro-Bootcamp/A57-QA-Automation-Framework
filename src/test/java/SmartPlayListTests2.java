import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.SmartPlayListPage;

import java.util.ArrayList;
import java.util.List;

public class SmartPlayListTests2 extends BaseTest {

    private static final String VALID_EMAIL = "sakthibala.sengottiyan@testpro.io";
    private static final String VALID_PASSWORD = "te$t$tudent1";


    @Test (description="Create a Smart playlist With Rule",priority = 1)
    public void testCreateSmartPlaylistWithRule() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        SmartPlayListPage smartPlayListPage = new SmartPlayListPage(getDriver());

        //Login using Email and Password
        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        String ruleType = "Multiple";

        List<String> criteria1 = new ArrayList<>();
        List<String> criteria2 = new ArrayList<>();
        List<String> criteria3 = new ArrayList<>();

        criteria1.add("Artist");
        criteria1.add("Title");

        criteria2.add("contains");
        criteria2.add("is");

        criteria3.add("Beats");
        criteria3.add("Pluto");

        String playListName = "TestEditRule";

        homePage.clickNewSmartPlaylist();
        smartPlayListPage.createSmartPlayList(playListName,criteria1, criteria2, criteria3, ruleType);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Created playlist \"" + playListName + ".\"");

    }

    @Test (description="Create a Smart playlist With Group",priority = 2)
    public void testCreateSmartPlaylistWithGroup() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        SmartPlayListPage smartPlayListPage = new SmartPlayListPage(getDriver());

        //Login using Email and Password
        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        String ruleType = "Group";

        List<String> criteria1 = new ArrayList<>();
        List<String> criteria2 = new ArrayList<>();
        List<String> criteria3 = new ArrayList<>();

        criteria1.add("Artist");
        criteria1.add("Length");
        criteria1.add("Album");

        criteria2.add("begins with");
        criteria2.add("is less than");
        criteria2.add("begins with");

        criteria3.add("The");
        criteria3.add("100");
        criteria3.add("Nameless");

        String playListName = "TestEditGroup";

        homePage.clickNewSmartPlaylist();
        smartPlayListPage.createSmartPlayList(playListName,criteria1, criteria2, criteria3, ruleType);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Created playlist \"" + playListName + ".\"");

    }

    @Test (description="Create a Delete Smart playlist",priority = 3)
    public void testCreateDeleteSmartPlaylist() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        SmartPlayListPage smartPlayListPage = new SmartPlayListPage(getDriver());

        //Login using Email and Password
        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        String ruleType = "Single";

        List<String> criteria1 = new ArrayList<>();
        List<String> criteria2 = new ArrayList<>();
        List<String> criteria3 = new ArrayList<>();

        criteria1.add("Album");
        criteria2.add("is");
        criteria3.add("Airbit");

        String playListName = "TestDelete";

        homePage.clickNewSmartPlaylist();
        smartPlayListPage.createSmartPlayList(playListName,criteria1, criteria2, criteria3, ruleType);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Created playlist \"" + playListName + ".\"");

    }

    @Test (description="Edit the Smart playlist rule",priority = 4)
    public void testEditSmartPlaylistRule() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        SmartPlayListPage smartPlayListPage = new SmartPlayListPage(getDriver());

        //Login using Email and Password
        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        String playListName = "TestEditRule";
        String criteria3NewValue = "BornKing";
        String type = "Rule";

        smartPlayListPage.editSmartPlayList(criteria3NewValue,type);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Updated playlist \"" + playListName + ".\"");

    }

    @Test (description="Edit the Smart playlist group",priority = 5)
    public void testEditSmartPlaylistGroup() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        SmartPlayListPage smartPlayListPage = new SmartPlayListPage(getDriver());

        //Login using Email and Password
        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        String playListName = "TestEditGroup";
        String criteria3NewValue = "Entries";
        String type = "Group";


        smartPlayListPage.editSmartPlayList(criteria3NewValue,type);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Updated playlist \"" + playListName + ".\"");

    }


    @Test (description="Delete the Smart playlist",priority = 6)
    public void testDeleteSmartPlaylist() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        SmartPlayListPage smartPlayListPage = new SmartPlayListPage(getDriver());

        //Login using Email and Password
        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        String playListName = "TestDelete";


        smartPlayListPage.deleteSmartPlayList();

        //smartPlayListPage.editSmartPlayList(criteria3NewValue,type);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Deleted playlist \"" + playListName + ".\"");

    }



}
