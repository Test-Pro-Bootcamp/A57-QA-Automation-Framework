import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {
    @Test
    public void testPlaySong() throws InterruptedException {
        // Login to Koel:
        provideEmail("elena.churinova@testpro.io");
        providePassword("skL&mpg67");
        clickOnLoginButton();
        Thread.sleep(2000);
        // Click «Play next song":
        clickPlayNextSong();
        Thread.sleep(2000);
        // Click Play button:
        clickPlayBtn();
        Thread.sleep(4000);
        // Sound bar icon displayed:
        Thread.sleep(2000);
        //Assertion
        WebElement soundBarIconDisplayed = driver.findElement(By.cssSelector("div.bars>img"));
        Assert.assertTrue(soundBarIconDisplayed.isDisplayed());


    }


    public void clickPlayBtn() {
        WebElement playBtn = driver.findElement(By.cssSelector("span.album-thumb-wrapper"));
        playBtn.click();
    }

    public void clickPlayNextSong() {
        WebElement playNextSongBtn = driver.findElement(By.xpath("//*[@id=\"mainFooter\"]/div[1]/i[2]"));
        playNextSongBtn.click();
    }

}
