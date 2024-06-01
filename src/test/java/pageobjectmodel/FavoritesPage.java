package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FavoritesPage extends BasePage{

    public FavoritesPage(WebDriver givenDriver) { super(givenDriver); }

    //WebElements
    @FindBy(css = "a[href='#!/favorites']")
    private WebElement favoritesLink;

    @FindBy(css = "#favoritesWrapper h1")
    private WebElement favoritesPageHeader;

    @FindBy(css = "#favoritesWrapper .song-item:nth-child(1)")
    private WebElement firstSongElement;

    @FindBy(css = "#favoritesWrapper .song-item:nth-child(2)")
    private WebElement secondSongElement;


    public void clickFavoritesLink() {
        favoritesLink.click();
    }

    public boolean getFavoritesPageHeader()
    {
        waitForVisibility(favoritesPageHeader);
        return favoritesPageHeader.isDisplayed();
    }

    public void playFavoriteSong(int songNumber)
    {
        if (songNumber == 1)
        {
           actions.doubleClick(firstSongElement).perform();
        } else if (songNumber == 2) {
            actions.doubleClick(secondSongElement).perform();
        }
    }
}
