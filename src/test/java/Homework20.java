import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework20 extends BaseTest{

    @Test
    public void deletePlaylist() throws InterruptedException {


        String expectedPlaylistDeletedMessage = "Deleted playlist \"Zina Playlist.\"";
        provideEmail("tassadit.talbi@testpro.io");
        providePassword("Password2026@");
        clickLoginBtn();

        clickOnPlaylist();

        clickDeletePlaylist ();

        Assert.assertEquals(getDeletedPlaylistMsg(),expectedPlaylistDeletedMessage );





    }

    public String getDeletedPlaylistMsg() {
        //WebElement notificationMsg = driver.findElement(By.cssSelector("div.success.show"));
        WebElement notificationMsg= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
        return notificationMsg.getText();
    }

    public void clickDeletePlaylist() {
        //WebElement deletePlaylist = driver.findElement(By.cssSelector(".btn-delete-playlist"));
        WebElement deletePlaylist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-delete-playlist")));
        deletePlaylist.click();
    }

    public void clickOnPlaylist() {
        //WebElement playlist = driver.findElement(By.cssSelector(".playlist:nth-child(3)"));
        WebElement playlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)")));
        playlist.click();

    }



}
