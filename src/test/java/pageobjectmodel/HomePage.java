package pageobjectmodel;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.UUID;

public class HomePage extends BasePage {

    public HomePage(WebDriver givenDriver)
    {
        super(givenDriver);
    }

    //WebElements
//    @FindBy(xpath = "//i[@data-testid='play-next-btn']")
//    private WebElement playerControlsBtn;
//
//    @FindBy(css = "#mainFooter span[class='play']")
//    private WebElement playNextSongBtn;
//
//    @FindBy(css = "img[alt='Sound bars']")
//    private  WebElement soundBar;

//    @FindBy(css = "img[class='avatar']")
//    private WebElement avatarIcon;
//
    private By avatarIcon = By.cssSelector("img[class='avatar']");

//    @FindBy(css = "a[data-testid='btn-logout']")
//    private WebElement logOutBtn;

    private By logOutBtn = By.cssSelector("a[data-testid='btn-logout']");

//
//    @FindBy(css = "a[href='/#!/profile'] + a[data-testid='btn-logout']")
//    private WebElement logStudentOutBtn;
//
//    @FindBy(css = "a[href='/#!/profile']")
//    private WebElement profileBtn;

    private By profileBtn = By.cssSelector("a[href='/#!/profile']");
//
//    @FindBy(css = "button[data-testid='toggle-extra-panel-btn']")
//    private WebElement infoPanelBtn;
//
//    @FindBy(css = "[data-testid='other-controls']")
//    private WebElement otherControlsBtn;
//
//    @FindBy(css = "div[data-testid='footer-middle-pane'] a:first-child")
//    private WebElement footerArtistNameElement;
//
//    @FindBy(css = "#homeWrapper ol[class='top-song-list'] > li:first-child span")
//    private WebElement firstMostPlayedSongElement;
//
//    @FindBy(css = "a[href='#!/home']")
//    private WebElement homePageLink;
//
//    @FindBy(css = "#homeWrapper h1")
//    private WebElement homePageHeader;
//

    private By successAlertElement = By.cssSelector("div[class='success show'");

    private By errorAlertElement = By.cssSelector("div[class='error show'");

    private By playlistPlusBtn = By.cssSelector("#playlists [data-testid='sidebar-create-playlist-btn']");
    private By newPlaylistBtn = By.cssSelector("#playlists [data-testid='playlist-context-menu-create-simple']");

    private By newPlaylistInputField = By.cssSelector("#playlists [name='name']");

//
//    @FindBy(css=" [data-theme='violet']")
//    private WebElement violetThemeElement;



//    public void playNextSong() {
//        playerControlsBtn.click();
//        playNextSongBtn.click();
//    }

    public boolean getUserAvatar()
    {
        return findElement(avatarIcon).isDisplayed();
    }

//    public boolean isSoundBarVisible()
//    {
//        return waitForVisibility(soundBar).isDisplayed();
//    }
//
    public void clickLogOut()
    {
        int attempt = 0;

        while (attempt < 2) {
            try {
                findElement(logOutBtn).click();
                break;
            } catch (StaleElementReferenceException ignored) { }
            attempt ++;
        }
    }
//
//    public boolean isLogOutNextToProfile()
//    {
//       return logStudentOutBtn.isDisplayed();
//    }
//
    public void clickProfile()
    {
        findElement(profileBtn).click();
    }
//
//    public void clickInfoPanel()
//    {
//       actions.moveToElement(waitForVisibility(infoPanelBtn)).click().perform();
//    }
//
//
    public boolean isNotDisplayedUserAvatarIcon() {
        // Utilizes the waitForElementToBeNotVisible method to check if the user avatar icon is not visible
//        WebElement avatarIconElement = findElement(avatarIcon);
//        return waitForElementToBeNotVisible(avatarIconElement);

        return waitForElementToBeNotVisible(avatarIcon);
    }
//
//    public String getFooterArtistName()
//    {
//        return waitForVisibility(footerArtistNameElement).getText();
//    }
//
//    public void playFirstMostPlayedSong()
//    {
//        actions.doubleClick(firstMostPlayedSongElement).perform();
//    }
//
//
//    public void clickHomePageLink() { homePageLink.click(); }
//
//    public boolean getHomePageHeader()
//    {
//        waitForVisibility(homePageHeader);
//        return homePageHeader.isDisplayed();
//    }
//
    public boolean isNotDisplayedSuccessAlert()
    {
        return waitForElementToBeNotVisible(successAlertElement);
    }

    public boolean isSuccessAlertDisplayed()
    {
        return findElement(successAlertElement).isDisplayed();
    }

    public String getSuccessAlertText()
    {
        return findElement(successAlertElement).getText();
    }

    public String getErrorAlertText()
    {
        return findElement(errorAlertElement).getText();
    }

//
//    public boolean isUpdatedThemeDisplayed()
//    {
//        return waitForVisibility(violetThemeElement).isDisplayed();
//    }

     public void createNewPlaylist(String newPlayListName)
     {
         findElement(playlistPlusBtn).click();
         findElement(newPlaylistBtn).click();
         WebElement playListInputField = findElement(newPlaylistInputField);
         playListInputField.sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.BACK_SPACE));
         playListInputField.sendKeys(newPlayListName);
         playListInputField.sendKeys(Keys.ENTER);
     }

    public String generateRandomName(){
        return UUID.randomUUID().toString().replace("-","");
    }

    public String getTextPlayListValidationMessage()
    {
        return findElement(newPlaylistInputField).getAttribute("validationMessage");
    }


}
