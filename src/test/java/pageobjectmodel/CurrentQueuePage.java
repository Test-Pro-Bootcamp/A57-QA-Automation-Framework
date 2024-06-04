package pageobjectmodel;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class CurrentQueuePage extends BasePage{

    public CurrentQueuePage(WebDriver givenDriver) { super(givenDriver); }

    //WebElements
    @FindBy(css = "a[href='#!/queue']")
    private WebElement queueLink;

    @FindBy(css = "#queueWrapper h1")
    private WebElement queuePageHeader;

    @FindBy(css = "#queueWrapper table[class='items'] > tr > td:nth-child(1)")
    private WebElement playingSongIdElement;

    @FindBy(css = "#queueWrapper table[class='items'] > tr > td:nth-child(2)")
    private WebElement playingSongTitleNameElement;

    @FindBy(css = "#queueWrapper table[class='items'] > tr > td:nth-child(3)")
    private WebElement playingSongArtistNameElement;

    @FindBy(css = "#queueWrapper table[class='items'] > tr > td:nth-child(4)")
    private WebElement playingSongAlbumNameElement;

    @FindBy(css = "#queueWrapper table[class='items'] > tr > td:nth-child(5)")
    private WebElement playingSongDurationElement;

    @FindBy(css = "#queueWrapper td.title")
    private List<WebElement> songList;

    //@FindBy(css = "#playlistWrapper  span[class='meta']")
    @FindBy(css = "#queueWrapper [data-test='list-meta']")
    private WebElement currentQueueSongCount;

    @FindBy(css = "button[class='btn-clear-queue']")
    private WebElement currentClearBtn;

    @FindBy(css = "#queueWrapper button[data-test='btn-shuffle-all']")
    private WebElement currentShuffleAllBtn;

    @FindBy(css = "#queueWrapper div[class='text']")
    private WebElement currentQueueMessageElement;

    public void clickCurrentQueueLink() {
        queueLink.click();
    }

    public boolean getQueuePageHeader()
    {
        waitForVisibility(queuePageHeader);
        return queuePageHeader.isDisplayed();
    }

    public boolean isCurrentQueuePageHeaderDisplayed() {
        int attempt = 0;
        boolean currentQueueVisible = false;

        while (attempt < 2) {
            try {
                waitForVisibility(queuePageHeader).isDisplayed();
                currentQueueVisible = true;
                break;
            } catch (StaleElementReferenceException ignored) {
            }
            attempt++;
        }

        return currentQueueVisible;
    }

    public String getPlayingSongId()
    {
        return waitForVisibility(playingSongIdElement).getText();
    }

    public String getPlayingSongTitleName()
    {
        return waitForVisibility(playingSongTitleNameElement).getText();
    }

    public String getPlayingSongArtistName()
    {
        return waitForVisibility(playingSongArtistNameElement).getText();
    }

    public String getPlayingSongAlbumName()
    {
        return waitForVisibility(playingSongAlbumNameElement).getText();
    }

    public String getPlayingSongDuration()
    {
        return waitForVisibility(playingSongDurationElement).getText();
    }

    public int songCount()
    {
        return songList.size();
    }

    public String[] queueSongList()
    {

        String[] songTitles = new String[songList.size()];

        for (int i = 0; i < songList.size(); i++)
            songTitles[i] = songList.get(i).getText();

        return  songTitles;
    }

    public void clearCurrentQueue() {
        waitForVisibility(currentClearBtn).click();
    }

    public String getCurrentQueueSongCount()
    {
        return currentQueueSongCount.getText();
    }

    public String[] getCurrentQueueSongInfo()
    {
        String[] currentQueueSongInfo = new String[5];

        currentQueueSongInfo[0] = getPlayingSongId();
        currentQueueSongInfo[1] = getPlayingSongTitleName();
        currentQueueSongInfo[2] = getPlayingSongArtistName();
        currentQueueSongInfo[3] = getPlayingSongAlbumName();
        currentQueueSongInfo[4] = getPlayingSongDuration();

        return currentQueueSongInfo;
    }

    public void clickCurrentShuffleAll() {

           actions.moveToElement(waitForVisibility(currentShuffleAllBtn)).click().perform();

    }

    public String getTextCurrentQueueValidationMessage()
    {
        return waitForVisibility(currentQueueMessageElement).getText();
    }


}
