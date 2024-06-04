package pageobjectmodel;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver givenDriver)
    {
        super(givenDriver);
    }

    //WebElements
    @FindBy(xpath = "//i[@data-testid='play-next-btn']")
    private WebElement playerControlsBtn;

    @FindBy(css = "#mainFooter span[class='play']")
    private WebElement playNextSongBtn;

    @FindBy(css = "img[alt='Sound bars']")
    private  WebElement soundBar;

    @FindBy(css = "img[class='avatar']")
    private WebElement avatarIcon;

    @FindBy(css = "a[data-testid='btn-logout']")
    private WebElement logOutBtn;

    @FindBy(css = "a[href='/#!/profile'] + a[data-testid='btn-logout']")
    private WebElement logStudentOutBtn;

    @FindBy(css = "a[href='/#!/profile']")
    private WebElement profileBtn;

    @FindBy(css = "button[data-testid='toggle-extra-panel-btn']")
    private WebElement infoPanelBtn;

    @FindBy(css = "[data-testid='other-controls']")
    private WebElement otherControlsBtn;

    @FindBy(css = "div[data-testid='footer-middle-pane'] a:first-child")
    private WebElement footerArtistNameElement;

    @FindBy(css = "#homeWrapper ol[class='top-song-list'] > li:first-child span")
    private WebElement firstMostPlayedSongElement;

    @FindBy(css = "a[href='#!/home']")
    private WebElement homePageLink;

    @FindBy(css = "#homeWrapper h1")
    private WebElement homePageHeader;

    @FindBy(css = "div[class='success show'")
    private WebElement successAlertElement;

    @FindBy(css=" [data-theme='violet']")
    private WebElement violetThemeElement;



    public void playNextSong() {
        playerControlsBtn.click();
        playNextSongBtn.click();
    }

    public boolean getUserAvatar()
    {
        return avatarIcon.isDisplayed();
    }

    public boolean isSoundBarVisible()
    {
        return waitForVisibility(soundBar).isDisplayed();
    }

    public void clickLogOut()
    {
        int attempt = 0;

        while (attempt < 2) {
            try {
                waitForVisibility(logOutBtn).click();
                break;
            } catch (StaleElementReferenceException ignored) { }
            attempt ++;
        }
    }

    public boolean isLogOutNextToProfile()
    {
       return logStudentOutBtn.isDisplayed();
    }

    public void clickProfile()
    {
        profileBtn.click();
    }

    public void clickInfoPanel()
    {
       actions.moveToElement(waitForVisibility(infoPanelBtn)).click().perform();
    }


    public boolean isNotDisplayedUserAvatarIcon() {
        // Utilizes the waitForElementToBeNotVisible method to check if the user avatar icon is not visible
        return waitForElementToBeNotVisible(avatarIcon);
    }

    public String getFooterArtistName()
    {
        return waitForVisibility(footerArtistNameElement).getText();
    }

    public void playFirstMostPlayedSong()
    {
        actions.doubleClick(firstMostPlayedSongElement).perform();
    }


    public void clickHomePageLink() { homePageLink.click(); }

    public boolean getHomePageHeader()
    {
        waitForVisibility(homePageHeader);
        return homePageHeader.isDisplayed();
    }

    public boolean isNotDisplayedSuccessAlert()
    {
        return waitForElementToBeNotVisible(successAlertElement);
    }

    public boolean isUpdatedThemeDisplayed()
    {
        return waitForVisibility(violetThemeElement).isDisplayed();
    }


}
