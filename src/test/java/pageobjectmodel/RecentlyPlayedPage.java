package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RecentlyPlayedPage extends BasePage{

    public RecentlyPlayedPage(WebDriver givenDriver) { super(givenDriver); }

    //WebElements
    @FindBy(css = "a[href='#!/recently-played']")
    private WebElement recentlyPlayedLink;

    @FindBy(css = "#recentlyPlayedWrapper h1")
    private WebElement recentlyPlayedPageHeader;

    @FindBy(css = "#recentlyPlayedWrapper table[class='items'] > tr")
    private WebElement firstRecentlyPlayedSongElement;


    public void clickRecentlyPlayedLink() { recentlyPlayedLink.click(); }

    public boolean getRecentlyPlayedPageHeader()
    {
        waitForVisibility(recentlyPlayedPageHeader);
        return recentlyPlayedPageHeader.isDisplayed();
    }

    public void playFirstRecentlyPlayedSong()
    {
        actions.doubleClick(firstRecentlyPlayedSongElement).perform();
        //actions.moveToElement(waitForVisibility(firstArtistSongElement)).click().perform();
    }
}
