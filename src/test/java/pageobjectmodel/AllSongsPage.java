package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllSongsPage extends BasePage {

    public AllSongsPage(WebDriver givenDriver) { super(givenDriver); }

    //WebElements
    @FindBy(css = "a[href='#!/songs']")
    private WebElement allSongsLink;

    @FindBy(css = "#songsWrapper h1")
    private WebElement allSongsPageHeader;

    @FindBy(css = "#songsWrapper span[class='meta text-secondary'] span")
    private WebElement allSongsCountElement;

    @FindBy(css = "#songsWrapper button[data-test='btn-shuffle-all']")
    private WebElement allSongsShuffleAllBtn;


    @FindBy(css = "#songsWrapper table[class='items'] > tr")
    private WebElement firstAllSongsElement;



    public void clickAllSongsLink() {
        allSongsLink.click();
    }

    public boolean getAllSongsPageHeader()
    {
        waitForVisibility(allSongsPageHeader);
        return allSongsPageHeader.isDisplayed();
    }

    public void clickAllSongsShuffle() {

        actions.moveToElement(waitForVisibility(allSongsShuffleAllBtn)).click().perform();

    }

    public String getAllSongsCount()
    {
        return allSongsCountElement.getText();
    }

    public void playFirstAllSongsPageSong()
    {
        actions.doubleClick(firstAllSongsElement).perform();
        //actions.moveToElement(waitForVisibility(firstArtistSongElement)).click().perform();
    }
}


