import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework21 extends BaseTest{
    String newPlaylistName ="Test1";
    @Test
public void testRenamePlaylist()  {
     String updatedPlaylistMsg = "Updated playlist \""+newPlaylistName+".\"";

        // Login to Koel page:
        provideEmail("elena.churinova@testpro.io");
        providePassword("skL&mpg67");
        clickLoginBtn();

        // Double-click on a playlist:
        doubleClickPlaylist();

        //Clear and Rename the playlist:
        enterNewPlaylistName();

        //Assert (Actual vs Expected):
        Assert.assertEquals(expectedSuccessMsg(),updatedPlaylistMsg);

    }

    public void doubleClickPlaylist() {
        WebElement playlistElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#playlists > ul > li:nth-child(3)")));
        actions.doubleClick(playlistElement).perform();
    }
    public void enterNewPlaylistName(){
        WebElement playListInputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name']")));
        playListInputField.sendKeys(Keys.chord(Keys.COMMAND, "A", Keys.BACK_SPACE));
        playListInputField.sendKeys(newPlaylistName);
        playListInputField.sendKeys(Keys.ENTER);
    }
    public String expectedSuccessMsg(){
       WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
       return successMsg.getText();
    }

}
