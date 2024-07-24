import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework17 extends BaseTest{

     String expectedMessage = "Added 1 song into \"hhh.\"";
    @Test
    public void testAddSongToPlaylist() throws InterruptedException {
        // Login to Koel:
        provideEmail("elena.churinova@testpro.io");
        providePassword("skL&mpg67");
        clickOnLoginButton();
        Thread.sleep(2000);
        
        
        //Search for a song:
        searchSong("Paean");
        Thread.sleep(2000);

        //Click 'View All' button:
        clickViewAllBtn();
        Thread.sleep(2000);
        
        //Click the first song in the search results:
        clickFirstSong();
        Thread.sleep(2000);
        
        //Click 'ADD TO...' button:
        clickAddToBtn();
        Thread.sleep(2000);

       // Choose the playlist to add it to:
        chooseThePlaylist();
        Thread.sleep(2000);

        // Get a message, the song was added to a playlist:

        //Assertions (Actual vs Expected):
        Assert.assertEquals(getSongAddedMsg(), expectedMessage);

    }
    public void chooseThePlaylist() {
        WebElement nnnPlayList = driver.findElement(By.cssSelector("#songResultsWrapper > header > div.song-list-controls > div > section.existing-playlists > ul > li.playlist"));
        nnnPlayList.click();
    }
    public void clickAddToBtn() {
        WebElement addToBtn = driver.findElement(By.cssSelector("div > span >button.btn-add-to"));
        addToBtn.click();
    }
    public void clickFirstSong() {
        WebElement firstSong = driver.findElement(By.cssSelector("#songResultsWrapper > div > div > div.item-container > table > tr"));
        firstSong.click();
    }
    public void clickViewAllBtn() {
        WebElement viewAllBtn = driver.findElement(By.cssSelector(" section.songs > h1 > button"));
        viewAllBtn.click();
    }
    public void searchSong(String song) {
        WebElement searchBar = driver.findElement(By.cssSelector("input[type='search']"));
        searchBar.clear();
        searchBar.sendKeys(song);
    }
    public String getSongAddedMsg(){
        WebElement message = driver.findElement(By.cssSelector("div.success.show"));
        return message.getText();

    }
}
