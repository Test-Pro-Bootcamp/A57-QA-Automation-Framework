import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.SmartPlayListPage;

import java.util.ArrayList;
import java.util.List;

public class SmartPlayListTests1 extends BaseTest {

    private static final String VALID_EMAIL = "sakthibala.sengottiyan@testpro.io";
    private static final String VALID_PASSWORD = "te$t$tudent1";



    @Test (description="Create a Smart playlist with single rule",priority = 1)
    public void testCreateSmartPlaylistWithSingleRule() {

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

        String playListName = "Test Smart " + homePage.generateRandomName().substring(0,4);

        homePage.clickNewSmartPlaylist();
        smartPlayListPage.createSmartPlayList(playListName,criteria1, criteria2, criteria3, ruleType);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Created playlist \"" + playListName + ".\"");

    }

    @Test (description="Create an empty Smart playlist",priority = 2)
    public void testCreateEmptySmartPlaylist() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        SmartPlayListPage smartPlayListPage = new SmartPlayListPage(getDriver());

        //Login using Email and Password
        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        String ruleType = "Single";

        List<String> criteria1 = new ArrayList<>();
        List<String> criteria2 = new ArrayList<>();
        List<String> criteria3 = new ArrayList<>();

        criteria1.add("Title");
        criteria2.add("is");
        criteria3.add("Birthday");

        String playListName = "Test Smart " + homePage.generateRandomName().substring(0,4);

        homePage.clickNewSmartPlaylist();
        smartPlayListPage.createSmartPlayList(playListName,criteria1, criteria2, criteria3, ruleType);

        Assert.assertEquals(homePage.getEmptySmartPlaylistText(),"No songs match the playlist's criteria.");

    }

    @Test (description="Create a Smart playlist with multiple rules - Scenario 1",priority = 3)
    public void testCreateSmartPlaylistWithMultipleRulesS1() {

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

        String playListName = "Test Smart " + homePage.generateRandomName().substring(0,4);
        homePage.clickNewSmartPlaylist();
        smartPlayListPage.createSmartPlayList(playListName,criteria1, criteria2, criteria3, ruleType);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Created playlist \"" + playListName + ".\"");

    }

    @Test (description="Create a Smart playlist with multiple rules - Scenario 2",priority = 4)
    public void testCreateSmartPlaylistWithMultipleRulesS2() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        SmartPlayListPage smartPlayListPage = new SmartPlayListPage(getDriver());

        //Login using Email and Password
        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        String ruleType = "Multiple";

        List<String> criteria1 = new ArrayList<>();
        List<String> criteria2 = new ArrayList<>();
        List<String> criteria3 = new ArrayList<>();

        criteria1.add("Album");
        criteria1.add("Title");
        criteria1.add("Length");

        criteria2.add("ends with");
        criteria2.add("begins with");
        criteria2.add("is greater than");

        criteria3.add("Album");
        criteria3.add("Take");
        criteria3.add("100");


        String playListName = "Test Smart " + homePage.generateRandomName().substring(0,4);
        homePage.clickNewSmartPlaylist();
        smartPlayListPage.createSmartPlayList(playListName,criteria1, criteria2, criteria3, ruleType);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Created playlist \"" + playListName + ".\"");

    }

    @Test (description="Create a Smart playlist with multiple rules - Scenario 3",priority = 5)
    public void testCreateSmartPlaylistWithMultipleRulesS3() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        SmartPlayListPage smartPlayListPage = new SmartPlayListPage(getDriver());

        //Login using Email and Password
        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        String ruleType = "Multiple";

        List<String> criteria1 = new ArrayList<>();

        List<String> criteria2 = new ArrayList<>();

        List<String> criteria3 = new ArrayList<>();

        criteria1.add("Album");
        criteria1.add("Artist");

        criteria2.add("does not contain");
        criteria2.add("is not");

        criteria3.add("Unknown Album");
        criteria3.add("Makaih Beats");


        String playListName = "Test Smart " + homePage.generateRandomName().substring(0,4);

        homePage.clickNewSmartPlaylist();
        smartPlayListPage.createSmartPlayList(playListName,criteria1, criteria2, criteria3, ruleType);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Created playlist \"" + playListName + ".\"");

    }

    @Test (description="Create a Smart playlist with multiple rules - Scenario 4",priority = 6)
    public void testCreateSmartPlaylistWithMultipleRulesS4() {

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

        String playListName = "Test Smart " + homePage.generateRandomName().substring(0,4);

        homePage.clickNewSmartPlaylist();
        smartPlayListPage.createSmartPlayList(playListName,criteria1, criteria2, criteria3, ruleType);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Created playlist \"" + playListName + ".\"");

    }

    @Test (description="Create a Smart playlist with Group",priority = 7)
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

        String playListName = "Test Smart " + homePage.generateRandomName().substring(0,4);

        homePage.clickNewSmartPlaylist();
        smartPlayListPage.createSmartPlayList(playListName,criteria1, criteria2, criteria3, ruleType);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Created playlist \"" + playListName + ".\"");

    }

    @Test (description="Create a Smart playlist with valid names",dataProvider = "validNames",priority = 8)
    public void testCreateSmartPlaylistWithValidNames(String validName, String nameDescription) {

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


        homePage.clickNewSmartPlaylist();
        smartPlayListPage.createSmartPlayList(validName,criteria1, criteria2, criteria3, ruleType);

        Assert.assertTrue(homePage.isSuccessAlertDisplayed(),"Created playlist \"" + validName + ".\"");

    }


    @DataProvider(name = "validNames")
    private Object[][] provideValidNames() {
        return new Object[][]{
                {"!@#$%^&*()", "Valid name with special characters"},
                {"1234567890123456789012345678901234567890123456789012345678901234567890123456789012131313131313131313131313131312352352512136756858574747474747474747475858585865858585858585858585858585858524124124141414141414141414141414123463636363636363636363123112313132", "Long name with 256 characters"},
                {"1", "Short name"},
        };
    }


    @Test (description="Create a Smart playlist with invalid length",priority = 9)
    public void testCreateSmartPlaylistWithInvalidLength() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        SmartPlayListPage smartPlayListPage = new SmartPlayListPage(getDriver());

        //Login using Email and Password
        loginPage.login(VALID_EMAIL,VALID_PASSWORD);

        String ruleType = "Single";

        List<String> criteria1 = new ArrayList<>();
        List<String> criteria2 = new ArrayList<>();
        List<String> criteria3 = new ArrayList<>();

        criteria1.add("Artist");
        criteria2.add("is");
        criteria3.add("Airbit");

        String playListName = "12345678901234567890123456789012345678901234567890123456789012345678901234567890121313131313131313131313131313123523525121367568585747474747474747474758585858658585858585858585858585858585241241241414141414141414141414141234636363636363636363631231123131323";

        homePage.clickNewSmartPlaylist();
        smartPlayListPage.createSmartPlayList(playListName,criteria1, criteria2, criteria3, ruleType);

        Assert.assertFalse(homePage.isSuccessAlertDisplayed(),"Created playlist \"" + playListName + ".\"");

    }



}
