package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PlaylistPage extends BasePage{
    public PlaylistPage(WebDriver givenDriver) {
        super(givenDriver);
    }
    // Web Elements
    private By playListInputField = By.cssSelector("[name='name']");
    private By successMsg = By.cssSelector("div.success.show");

    // Helper Nethods:
    public void enterNewPlaylistName(String newPlaylistName){
        findElement(playListInputField).sendKeys(Keys.chord(Keys.COMMAND, "A", Keys.BACK_SPACE));
        findElement(playListInputField).sendKeys(newPlaylistName);
        findElement(playListInputField).sendKeys(Keys.ENTER);
    }

    public String expectedSuccessMsg(){
        return findElement(successMsg).getText();


    }
}
