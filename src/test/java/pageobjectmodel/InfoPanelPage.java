package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class InfoPanelPage extends BasePage{

    public InfoPanelPage(WebDriver givenDriver)
    {
        super(givenDriver);
    }

    @FindBy(css = "section[data-testid='extra-panel'][class='text-secondary showing']")
    private WebElement visibleInfoPanel;

    @FindBy(css = "section[data-testid='extra-panel'][class='text-secondary']")
    private  WebElement hiddenInfoPanel;

    @FindBy(css = "button[id='extraTabLyrics']")
    private WebElement lyricsTabBtn;

    //@FindBy(css = "#extraPanelLyrics p[class='none text-secondary']")
    @FindBy(css = "#lyrics > div > div")
    private  WebElement lyricsPanel;

    @FindBy(css = "button[id='extraTabArtist']")
    private  WebElement artistTabBtn;

    @FindBy(css = "button[id='extraTabAlbum']")
    private  WebElement albumTabBtn;

    @FindBy(css = "#extraPanelArtist h1 span")
    private  WebElement artistName;

    @FindBy(css = "#extraPanelArtist button")
    private  WebElement artistShuffleBtn;

    @FindBy(css = "#extraPanelAlbum h1 span")
    private  WebElement albumName;

    @FindBy(css = "#extraPanelAlbum span[class='cover']")
    private  WebElement albumCover;

    @FindBy(css = "#extraPanelAlbum button")
    private  WebElement albumShuffleBtn;


    public Boolean IsInfoPanelVisible()
    {
       return waitForVisibility(visibleInfoPanel).isDisplayed();
        //return visibleInfoPanel.isDisplayed();

    }

    public boolean IsInfoPanelHidden() {
        try {
              hiddenInfoPanel.getTagName();
              return true;
        } catch (NoSuchElementException ignored) {
              return false;
        }

    }

    public void clickLyricsTab()
    {
        actions.moveToElement(waitForVisibility(lyricsTabBtn)).click().perform();
    }

    public boolean isLyricsDisplayed()
    {
        boolean ldisplayed;
        String styleAttributeValue = "display: none;";
        ldisplayed = !lyricsPanel.getAttribute("style").equals(styleAttributeValue);

        return ldisplayed;

    }

    public void clickArtistTab()
    {
        actions.moveToElement(waitForVisibility(artistTabBtn)).click().perform();
    }

    public String getArtistName()
    {
        return waitForVisibility(artistName).getText();
    }

    public void clickArtistShuffle()
    {
        //waitForVisibility(artistShuffleBtn).click();
        actions.moveToElement(waitForVisibility(artistShuffleBtn)).click().perform();
    }

    public void clickAlbumTab()
    {
        actions.moveToElement(waitForVisibility(albumTabBtn)).click().perform();
    }

    public String getAlbumName()
    {
        return waitForVisibility(albumName).getText();
    }

    public boolean isAlbumCoverDisplayed()
    {
        boolean albumCoverDisplayed;
        String styleAttributeValue = "";
        albumCoverDisplayed = !(waitForVisibility(albumCover).getAttribute("style").equals(styleAttributeValue));
        return albumCoverDisplayed;
    }

    public void clickAlbumShuffle()
    {
        //waitForVisibility(albumShuffleBtn).click();
        actions.moveToElement(waitForVisibility(albumShuffleBtn)).click().perform();
    }

}
