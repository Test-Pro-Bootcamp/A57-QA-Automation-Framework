package pageobjectmodel;

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

    @FindBy(css = "#queueWrapper table[class='items'] > tr > td:nth-child(2)")
    private WebElement playingSongTitleName;

    @FindBy(css = "tr[class='song-item playing selected'] td[class='artist']")
    private WebElement playingSongArtistName;

    @FindBy(css = "tr[class='song-item playing selected'] td[class='album']")
    private WebElement playingSongAlbumName;

    @FindBy(css = "#queueWrapper td.title")
    private List<WebElement> songList;


    public void clickCurrentQueueLink() {
        queueLink.click();
    }

    public boolean getQueuePageHeader()
    {
        waitForVisibility(queuePageHeader);
        return queuePageHeader.isDisplayed();
    }

    public String getPlayingSongTitleName()
    {
        return waitForVisibility(playingSongTitleName).getText();
    }

    public String getPlayingSongArtistName()
    {
        return waitForVisibility(playingSongArtistName).getText();
    }

    public String getPlayingSongAlbumName()
    {
        return waitForVisibility(playingSongAlbumName).getText();
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

}
