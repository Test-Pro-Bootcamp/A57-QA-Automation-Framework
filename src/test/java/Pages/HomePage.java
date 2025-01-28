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


}
