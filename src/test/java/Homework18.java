import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {

    @Test
    public void playSong () throws InterruptedException{
        String url= "https://qa.koel.app";

        provideEmail("tassadit.talbi@testpro.io");
        providePassword("Password2026@");
        clickLoginBtn();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        Thread.sleep(2000);
        clickPlayNextSongBtn();
        Thread.sleep(2000);
        clickPlayBtn ();
        Thread.sleep(2000);
        Assert.assertTrue(isSongPlaying());








    }

    public void clickPlayBtn() {
        WebElement playBtn =driver.findElement(By.xpath("//i[@data-testid='play-next-btn']"));
        playBtn.click();
    }

    public void clickPlayNextSongBtn() {
        WebElement playNextSongBtn = driver.findElement(By.xpath("//span[@data-testid='play-btn']"));
        playNextSongBtn.click();
    }
    public boolean isSongPlaying (){
        WebElement soundbar = driver.findElement(By.xpath("//div[@data-testid=sound-bar-play']"));
        return soundbar.isDisplayed();
    }



}
