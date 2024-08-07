import Pages.HomePage;
import Pages.LoginPage;
import Pages.PlaylistPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework22 extends BaseTest{

    @Test
public void testRenamePlaylist()  {
        String newPlaylistName = "Test2";
     String updatedPlaylistMsg = "Updated playlist \""+newPlaylistName+".\"";

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);

        // Login to Koel page:
        loginPage.login();

        // Double-click on a playlist:
        homePage.doubleClickPlaylist();

        //Clear and Rename the playlist:
        playlistPage.enterNewPlaylistName(newPlaylistName);

        //Assert (Actual vs Expected):
        Assert.assertEquals(playlistPage.expectedSuccessMsg(),updatedPlaylistMsg);

    }

      //public void doubleClickPlaylist() {
        //WebElement playlistElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#playlists > ul > li:nth-child(3)")));
        //actions.doubleClick(playlistElement).perform();
    //}
    //public void enterNewPlaylistName(){
        //WebElement playListInputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name']")));
        //playListInputField.sendKeys(Keys.chord(Keys.COMMAND, "A", Keys.BACK_SPACE));
        //playListInputField.sendKeys(newPlaylistName);
        //playListInputField.sendKeys(Keys.ENTER);
   // }
    //public String expectedSuccessMsg(){
     //  WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
     //  return successMsg.getText();
   // }

}
