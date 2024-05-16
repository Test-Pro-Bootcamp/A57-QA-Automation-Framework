import com.fasterxml.jackson.databind.util.LRUMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework17 extends BaseTest {


    @Test
    public void addSongToPlaylist () throws InterruptedException {

        String expectedSongAddedMessage = "Added 1 song into \"My New Playlist. \"";

        provideEmail("sabrina.koulougli@testpro.io");
        providePassword("Student@test17");
        clickLoginBtn();
        Duration millis;
        Thread.sleep( 2000);
        searchSong("Pluto");
        Thread.sleep( 2000);
        clickViewAllBtn();
        Thread.sleep( 2000);
        selectFirstSigResult();
        Thread.sleep(2000);
        clickAddToBtn();
        Thread.sleep(2000);
        choosePlaylist();
        Thread.sleep(2000
        );
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
        WebElement searchField = driver.findElemnt (By.cssSelector ("dive# searchForm input [Type= 'search']"));
        searchFiled.clear ();
        searchField. sendKeys ( songName);
    }

    public void clickLoginBtn() {
        LogingPage LoginPage;
        LoginPage = new LoginPage (get driver());

    }
    public void loginHomePage
            HomePage HomePage= new HomePage();

    public void providePassword() {
        ProvidePassword ProvidePassword;
        ProvidePassword = new ProvidePassword (get driver());
    }
    public class HomePage {
        HomePage Homepage= new HomePage(getdriver());

        public Object getDriver() {
            return driver;
        }

        public void setDriver(Object driver) {
            this.driver = driver;
        }
    }




}
