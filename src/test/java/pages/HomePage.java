package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }

    // Web Elements:
    private By playlistElement = By.cssSelector("#playlists > ul > li:nth-child(3)");


    // Helper methods:
    public void doubleClickPlaylist() {
        WebElement playlist = findElement(playlistElement);
        actions.doubleClick(playlist).perform();
    }


}
