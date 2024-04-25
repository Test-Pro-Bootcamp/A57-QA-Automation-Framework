import com.fasterxml.jackson.databind.util.LRUMap;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework17 extends BaseTest {

    private LRUMap<Object, Object> searchFiled;

    @Test
    public void addSongToPlaylist () {

        String expectedSongAddedMessage = "Added 1 song into \"My New Playlist. \"";

        provideEmail("sabrina.koulougli@testpro.io");
        providePassword("Student@test17");
        clickLoginBtn();
        Duration millis;
        Thread.sleep( millis:2000)
        searchSong("Pluto")
        Thread.sleep( millis:2000)
        clickViewAllBtn();
        Thread.sleep( millis:2000)
        selectFirstSigResult();
        Thread.sleep( millis:2000)
        clickAddToBtn();
        Thread.sleep( millis:2000)
        choosePlaylist();
        Thread.sleep( millis:2000)
        //Assertion
        Assert.assertEquals(getAddToPlayListSuccessMsg(),expectedSongAddedMessage);





    }

    public String getAddToPlayListSuccessMsg() {
        WebElement notification = driver.findElemnt(By.cssSelector("div.success.show"));
        return notification.getText();
    }

    public void choosePlaylist() {
        WebElement playlist = driver.findElement (By.xpath(xpathExpression:"//section[@id='songResultsWrapper']//li[contains(text();MyPlaylist)]"))

    }

    public void clickAddToBtn() {
        WebElement addToBtn = driver.findElement (By.xpath(xpathExpression= "// section [@id='songResultsWrapper']//button[@data-test='add-to-btn']"));

    }

    public void selectFirstSigResult() {
        WebElement firstSongInResult = driver.findelemt (By.xpathExpression= "// selection [@id='songResultWrapper']//tr[@class='song-item'][1]"));
        firstSongInResult.click();


    }

    public void clickViewAllBtn() {
        WebElement viewAllBtn = driver.findElement ( By. xpathExpression: "// button [@ data-test='view-alla-songs-btn']"))
        viewAllBtn.click();
    }

    public void searchSong(String songName) {
        WebElement searchField = driver.findElemnt (By.cssSelector (" dive# searchForm input [Type= 'search']"));
        searchFiled.clear ();
        searchField. sendKeys ( songName);
    }

    private void clickLoginBtn() {
    }

    private void providePassword() {
    }


    private void provideEmail() {
    }


}
