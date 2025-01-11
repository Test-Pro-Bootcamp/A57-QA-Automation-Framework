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


    @FindBy(css = ".songs")
    private WebElement allSongsBtn;

    @FindBy(css = "[href='\\#\\!\\/playlist\\/100815']")
    private WebElement oldSongsPlaylist;

    @FindBy(xpath = "//li[@class='has-sub']")
    private WebElement addToBtn;

    @FindBy(css = ".items button[title='Like HoliznaCC0 - Way Of The Samurai by Unknown Artist']")
    private WebElement holiznaLikeBtn;

    @FindBy(css = "tr:nth-of-type(3)  button[title='Like Riqui-Riqui by REW<<']")
    private WebElement riquiLikeBtn;

    @FindBy(css = ".favorites.playlist")
    private WebElement favoritePlaylist;

    @FindBy(css = ("section#favoritesWrapper > .screen-header  .meta.text-secondary > span"))

    private WebElement favoriteSongCount;

    @FindBy(css = "section#favoritesWrapper .item-container > .items button[title='Unlike HoliznaCC0 - Way Of The Samurai by Unknown Artist']")

    private WebElement holiznaUnlikeBtn;


    @FindBy(css = "section#favoritesWrapper .item-container > .items button[title='Unlike Riqui-Riqui by REW<<']")

    private WebElement riquiUnlikeBtn;


    @FindBy(css = "section#favoritesWrapper .item-container > .items button[title='Unlike For the Poor by Dan Brasco']")

    private WebElement brascoUnlikeBtn;


    @FindBy(css = "section#favoritesWrapper .item-container > .items button[title^='Unlike Scott Holmes Music - Soft Inspiration by Unknown Arti']")

    private WebElement scottUnlikeBtn;


    @FindBy(css = "section#favoritesWrapper .text")

    private WebElement noFavoritesMsg;


    @FindBy(css = ".song-menu .download")

    private WebElement downlaodBtn;


    @FindBy(css = "body > iframe:nth-of-type(6)")

    private WebElement downlaodElement;


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

    public HomePage clickHoliznaLikeBtn() {
        holiznaLikeBtn.click();
        return this;
    }

    public HomePage clickRiquiLikeBtn() {
        riquiLikeBtn.click();
        return this;
    }

    public HomePage clickFavoritePlaylist() {

        favoritePlaylist.click();
        return this;
    }

    public String getSongCountText() {
        return favoriteSongCount.getText();
    }


    public HomePage unlikeHoliznaSong() {
        holiznaUnlikeBtn.click();
        return this;

    }


    public HomePage unlikeRiquiSong() {
        riquiUnlikeBtn.click();

        return this;
    }

    public HomePage unlikeBrascoSong() {

        brascoUnlikeBtn.click();

        return this;
    }

    public HomePage unlikeScottSong() {

        scottUnlikeBtn.click();
        return this;
    }

    public String getNofavoritesyetMsg() {
        return noFavoritesMsg.getText();
    }


    public HomePage clickDownlaoadBtn() {
        downlaodBtn.click();
        return this;
    }


    public boolean getDownlaodNotification(){

        return downlaodElement.isDisplayed();


    }

}




