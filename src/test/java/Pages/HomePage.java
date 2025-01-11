package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver givenDriver) {
        super(givenDriver);


    }

    //By userAvatarIcon = By.cssSelector("img.avatar");
    @FindBy(css = "img.avatar")
    private WebElement userAvatarIcon;
    @FindBy(css = "section#playlists > ul > li:nth-of-type(5)")
    private WebElement newPlaylist;

    @FindBy(css = ".btn-delete-playlist")
    private WebElement deleteButton;

    @FindBy(css = "div.success.show")
    private WebElement successNotificationMsg;


    @FindBy(css = "a.songs.active")
    private WebElement allSongsBtn;

    @FindBy(css = "[href='\\#\\!\\/playlist\\/100815']")
    private WebElement oldSongsPlaylist;

    @FindBy(xpath = "//li[@class='has-sub']")
    private WebElement addToBtn;

    @FindBy(css = "div#searchForm > input[name='q']")

    private WebElement searchField;

    @FindBy (css = ".songs > ul")

    private WebElement songResult;


    @FindBy(css = ".results .artists")

    private WebElement artistResult;

    @FindBy (css = ".results .albums")

    private WebElement albumResult;

    @FindBy(css ="section#searchExcerptsWrapper" )

    private WebElement searchResultSection;

    public WebElement getAvatarIcon() {
        return findElement(userAvatarIcon);
    }

    public HomePage clickPlaylist() {
        newPlaylist.click();
        return this;


    }

    public HomePage clickDeleteBtn() {

        deleteButton.click();
        return this;
    }

    public String getDeletedPlaylistMsg() {
        return successNotificationMsg.getText();

    }

    public HomePage clickOnAllSongsBtn() {
        allSongsBtn.click();
        return this;


    }

    public HomePage clickOnAddToBtn() {
        addToBtn.click();
        return this;
    }

    public HomePage clickOnOldSongsPlaylist() {

        oldSongsPlaylist.click();
        return this;

    }


    public String getAddedSongSuccessMsg() {

        return successNotificationMsg.getText();

    }

    public HomePage provideSongName(String Song){

        searchField.clear();
        searchField.sendKeys(Song);
        return  this ;

    }

    public String verifySongResult(){
       return songResult.getText();

    }

    public boolean verifyArtistResult(){
        return artistResult.isDisplayed();

    }


    public boolean verifyAlbumResult(){
        return albumResult.isDisplayed();

    }

    public boolean isSearchResultDisplayed(){
        return searchResultSection.isDisplayed();
    }
public HomePage clearTheSearchResult(){
        searchField.clear();
        return this;
}


public String clickOnSearchField(){

     return   searchField.getAttribute("placeholder");


}

public HomePage clickOnXBtn(){
        searchField.click();
        return this;
}


}
