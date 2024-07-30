import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest{
    @Test
    public void testDeletePlaylist()  {
        String expectedDeletedMessage = "Deleted playlist \"MMM.\"";
        // Login to Koel page:

        provideEmail("elena.churinova@testpro.io");
        providePassword("skL&mpg67");
        clickLoginBtn();

        // Create and save a new playlist:
        createNewPlaylistBtn();
        clickOnNewPlaylist();
        newPlaylist("MMM");

        // Delete Playlist:
        deletePlaylist();

        //Assertion ( Actual vs Expected)
        Assert.assertEquals(successMessage(),expectedDeletedMessage);

    }
    public void newPlaylist(String name) {
        WebElement playlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='↵ to save']")));
        playlist.clear();
        playlist.sendKeys(name);
        playlist.submit();
    }

    public void createNewPlaylistBtn() {
        WebElement clickOnCreateNewPlaylistBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class = 'fa fa-plus-circle create']")));
        clickOnCreateNewPlaylistBtn.click();
    }

    public void deletePlaylist()  {
        WebElement deletePlaylistBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='playlistWrapper']/header/div[3]/span/button")));
        deletePlaylistBtn.click();
    }
    public  void clickOnNewPlaylist()  {
        WebElement NewPlaylistField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-testid = 'playlist-context-menu-create-simple']")));
        NewPlaylistField.click();
    }
    public String successMessage(){
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.alertify-logs.top.right > div:nth-child(2)")));
        return message.getText();
    }

}
