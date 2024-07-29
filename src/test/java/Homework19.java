import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest{
    @Test
    public void testDeletePlaylist() throws InterruptedException {
        String expectedDeletedMessage = "Deleted playlist \"MMM.\"";
        // Login to Koel page:
        Thread.sleep(2000);
        provideEmail("elena.churinova@testpro.io");
        Thread.sleep(2000);
        providePassword("skL&mpg67");
        Thread.sleep(2000);
        clickLoginBtn();
        Thread.sleep(2000);
        // Create and save a new playlist:
        createNewPlaylistBtn();
        Thread.sleep(2000);
        clickOnNewPlaylist();
        Thread.sleep(2000);
        newPlaylist("MMM");
        Thread.sleep(8000);
        // Delete Playlist:
        deletePlaylist();
        Thread.sleep(2000);
        //Assertion ( Actual vs Expected)
        Assert.assertEquals(successMessage(),expectedDeletedMessage);

    }
    public void newPlaylist(String name) {
        WebElement playlist = driver.findElement(By.xpath("//input[@placeholder='↵ to save']"));
        playlist.clear();
        playlist.sendKeys(name);
        playlist.submit();
    }

    public void createNewPlaylistBtn() {
        WebElement clickOnCreateNewPlaylistBtn = driver.findElement(By.xpath("//i[@class = 'fa fa-plus-circle create']"));
        clickOnCreateNewPlaylistBtn.click();
    }

    public void deletePlaylist()  {
        WebElement deletePlaylistBtn = driver.findElement(By.xpath("//*[@id='playlistWrapper']/header/div[3]/span/button"));
        deletePlaylistBtn.click();
    }
    public  void clickOnNewPlaylist()  {
        WebElement NewPlaylistField = driver.findElement(By.xpath("//li[@data-testid = 'playlist-context-menu-create-simple']"));
        NewPlaylistField.click();
    }
    public String successMessage(){
        WebElement message = driver.findElement(By.cssSelector("div.alertify-logs.top.right > div"));
        return message.getText();
    }

}
