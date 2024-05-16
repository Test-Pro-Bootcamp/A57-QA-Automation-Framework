import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {
    @Test
    public void playSong(){
        //Login
        provideEmail("sabrina.koulougli@testpro.io");
        providePassword("Student@test17");
        clickLoginBtn();
        // click on Play button
        clickPlay();
        // Assert that song is playing
        Assert.assertTrue(isSongPlaying());


    }

    public void clickPlay() {
        WebElement playNextBtn=driver.findElemnt(By.xpath("//i[@data-testid='play-next-btn']"));
        WebElement playBtn=driver.findElement(By.xpath("//span[@data-testid='play.btn']"));
        playNextBtn.click();
        Thread.sleep(2000);
        playBtn.click();
        Thread.sleep(2000);

    Public boolean isSongPlaying() {
        WebElement soundBar= driver.findElement(By.xpath("//div[@data-testid='sound-bar-play']"));
        return soundBar.isDisplayed();

    }




    }


}
