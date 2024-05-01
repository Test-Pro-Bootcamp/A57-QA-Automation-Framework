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
        Thread.sleep(4000);
        //Assert.assertEquals(driver.getCurrentUrl(), url);
        //Thread.sleep(2000);


        clickPlayBtn ();
        Thread.sleep(2000);
        Assert.assertTrue(isSongPlaying());








    }

    public void clickPlayBtn() {
        WebElement playNextSongBtn = driver.findElement(By.xpath("//span[@data-testid='play-btn']"));
        WebElement playBtn =driver.findElement(By.xpath("//i[@data-testid='play-next-btn']"));
        playNextSongBtn.click();
        playBtn.click();
    }


    public boolean isSongPlaying (){
        WebElement soundbar = driver.findElement(By.xpath("//div[@data-testid=sound-bar-play']"));
        return soundbar.isDisplayed();
    }



}
