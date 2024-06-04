package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlbumsPage extends BasePage{

    public AlbumsPage(WebDriver givenDriver) { super(givenDriver); }

    //WebElements
    @FindBy(css = "a[href='#!/albums']")
    private WebElement albumsLink;

    @FindBy(css = "#albumsWrapper h1")
    private WebElement albumsPageHeader;

    @FindBy(css = "#albumsWrapper article:first-child")
    private WebElement firstAlbumSongElement;

    public void clickAlbumsLink() {
        albumsLink.click();
    }

    public boolean getAlbumsPageHeader()
    {
        waitForVisibility(albumsPageHeader);
        return albumsPageHeader.isDisplayed();
    }
    public void playFirstAlbumSong()
    {
        //actions.doubleClick(firstUserSongElement).perform();
        actions.moveToElement(waitForVisibility(firstAlbumSongElement)).click().perform();
    }
}
