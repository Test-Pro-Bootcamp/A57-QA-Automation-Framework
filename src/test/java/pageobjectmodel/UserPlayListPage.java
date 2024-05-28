package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPlayListPage extends BasePage{

    public UserPlayListPage(WebDriver givenDriver) { super(givenDriver); }

    //WebElements
    @FindBy(css = "a[href^='#!/playlist/']")
    private WebElement userPlayListLink;

    @FindBy(css = "#playlistWrapper h1")
    private WebElement userPlayListPageHeader;

    @FindBy(css = "#playlistWrapper table[class='items'] > tr")
    private WebElement firstUserSongElement;

    public void clickUserPlayListLink() {
        userPlayListLink.click();
    }

    public boolean getUserPlayListPageHeader()
    {
        waitForVisibility(userPlayListPageHeader);
        return userPlayListPageHeader.isDisplayed();
    }

    public void playFirstUserPlayListSong()
    {
        actions.doubleClick(firstUserSongElement).perform();

    }
}
