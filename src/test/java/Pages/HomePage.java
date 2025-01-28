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

    @FindBy(css = ".has-sub")
    private WebElement addToBtn;

    @FindBy (css = "section#playlists  i[role='button']")
    private WebElement createPlaylistBtn;
    @FindBy (css = "nav > ul > li:nth-of-type(1)")
    private WebElement newPlaylistDropDown;

    @FindBy(css = "input[name='name']")

    private WebElement inputField;

@FindBy ( css = ".menu.menu-add-to.submenu > li:nth-of-type(9)")
private WebElement myPlaylist;

@FindBy (css = ".items > tr:nth-of-type(15)")

private WebElement plutoSong;
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



    public HomePage clickOnCreatePlaylistBtn(){
        createPlaylistBtn.click();
        return this;
    }

    public HomePage clickOnCreateNewPlaylistDropDown(){
        newPlaylistDropDown.click();
        return this;
    }

    public HomePage WritePlaylistName(String playlistName){
        inputField.clear();
        inputField.sendKeys(playlistName);
        inputField.submit();
        return  this;
    }

public String getSuccessNotification(){

        return successNotificationMsg.getText();
}

public void contextClickPlutoSong(){
        actions.contextClick(plutoSong).perform();
}

public HomePage clickOnMyPlaylist(){
        myPlaylist.click();
        return  this;
}

public void moveToAddToBtn(){
        actions.moveToElement(addToBtn).perform();
}

}
