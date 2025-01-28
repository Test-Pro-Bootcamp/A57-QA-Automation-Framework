package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllSongsPage extends BasePage{


    public AllSongsPage (WebDriver givenDriver){

        super (givenDriver);
    }
    @FindBy(css = ".songs")
    private WebElement allSongsLocator;

    @FindBy (css = "section#songsWrapper > .screen-header  .meta.text-secondary > span")
    private WebElement songCountAndDurationText;

@FindBy (css = "section#songsWrapper .meta.text-secondary")
private WebElement songCountAndDuration;

@FindBy (css = "section#songsWrapper  .song-list-header.sortable .track-number")

private WebElement songId;

@FindBy (css = "section#songsWrapper  .song-list-header.sortable .artist")
private WebElement SongArtistField;

@FindBy (css = "section#songsWrapper  .song-list-header.sortable .title")
private WebElement songTitleField;

@FindBy(css = "section#songsWrapper  .song-list-header.sortable .album")
private WebElement songAlbumField;

@FindBy(css = "section#songsWrapper  .song-list-header.sortable .time")
private WebElement songTimeField;

public AllSongsPage clickOnAllSongs(){
     allSongsLocator.click();
     return this;

}

public boolean isSongsCountAndDurationDisplayed(){

    return songCountAndDuration.isDisplayed();
}

public String getSongCountAndDurationText(){

    return songCountAndDurationText.getText();
}

public boolean isSongIdDisplayed(){
    return songId.isDisplayed();
}

public boolean isSongArtistTabDisplayed(){
    return SongArtistField.isDisplayed();
}

public boolean isSongTitleTabDisplayed(){
    return songTitleField.isDisplayed();
}

public boolean isSongAlbumTabDisplayed(){
    return songAlbumField.isDisplayed();
}

public boolean isSongTimeFieldDisplayed(){
    return songTimeField.isDisplayed();
}

}
