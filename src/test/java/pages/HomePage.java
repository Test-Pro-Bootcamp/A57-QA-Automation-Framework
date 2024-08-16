package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }

    // Web Elements:

    @FindBy (css = "#playlists > ul > li:nth-child(3)")
    WebElement playlistElement;

    @FindBy (css = "[name='name']")
    WebElement playListInputField;

    @FindBy(css = "div.success.show" )
    WebElement successMsg;


    // Helper methods:
    public void doubleClickPlaylist() {
        //WebElement playlist = findElement(playlistElement);
        actions.doubleClick(playlistElement).perform();

    }

    public void enterNewPlaylistName(String newPlaylistName){
        playListInputField.sendKeys(Keys.chord(Keys.COMMAND, "A", Keys.BACK_SPACE));
        playListInputField.sendKeys(newPlaylistName);
        playListInputField.sendKeys(Keys.ENTER);
    }

    public String expectedSuccessMsg(){
        return successMsg.getText();

    }
}
