import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    @Test
    public void renamePlaylist() {
        String newName = "My private playlist";

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.provideEmail("nemanja.sijacic@testpro.io")
                .providePassword("Vojvodina.021")
                .clickSubmitBtn();

        homePage.doubleClick();
        homePage.enterNewPlName(newName);


    }
}