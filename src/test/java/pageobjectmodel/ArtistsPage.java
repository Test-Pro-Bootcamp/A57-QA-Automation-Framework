package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArtistsPage extends BasePage{

    public ArtistsPage(WebDriver givenDriver) { super(givenDriver); }

    //WebElements
    @FindBy(css = "a[href='#!/artists']")
    private WebElement artistsLink;

    @FindBy(css = "#artistsWrapper h1")
    private WebElement artistsPageHeader;

    @FindBy(css = "#artistsWrapper article:first-child")
    private WebElement firstArtistSongElement;

    public void clickArtistsLink() {
        artistsLink.click();
    }

    public boolean getArtistsPageHeader()
    {
        waitForVisibility(artistsPageHeader);
        return artistsPageHeader.isDisplayed();
    }

    public void playFirstArtistSong()
    {
        //actions.doubleClick(firstUserSongElement).perform();
        actions.moveToElement(waitForVisibility(firstArtistSongElement)).click().perform();
    }
}
