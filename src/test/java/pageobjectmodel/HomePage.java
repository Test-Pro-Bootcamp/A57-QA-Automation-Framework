package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

}
