package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlbumPage extends BasePage{

    public AlbumPage (WebDriver givenDriver){

        super (givenDriver);
    }

@FindBy(css = "section#albumsWrapper  article[title='Dark Days EP by Grav']  .cover")

    private WebElement darkDaysCover;


@FindBy (css = "[href='\\#\\!\\/albums']")

    private WebElement albumsLocator;

@FindBy (css = "section#albumsWrapper  article[title='Airbit by Makaih Beats']  .cover")

private WebElement koelStardardAirbitCover;

@FindBy (css = "section#albumsWrapper  article[title='Airbit by Makaih Beats'] .name")

private WebElement airbitName;


@FindBy (css = "section#albumsWrapper  article[title='Airbit by Makaih Beats'] .artist")
private WebElement airbitArtistName;

@FindBy (css = "section#albumsWrapper  article[title='Airbit by Makaih Beats'] .left")

private WebElement songsCount;


public AlbumPage clickOnAlbumBtn(){
    albumsLocator.click();
    return  this;
}

public boolean verifyAlbumCoverExists(){

    return darkDaysCover.isDisplayed() ;
}

public boolean VerifyKoelStandardCoverExists(){

    return koelStardardAirbitCover.isDisplayed();
}


public boolean verifyAlbumNameIsDisplayed(){
    return airbitName.isDisplayed();
}


    public boolean verifyAlbumArtistNameIsDisplayed() {
        return airbitArtistName.isDisplayed();


    }

    public boolean verifyAlbumSongCountIsDisplayed() {
        return songsCount.isDisplayed();

    }

    public String getSongCountText(){
    return songsCount.getText();
    }

}



