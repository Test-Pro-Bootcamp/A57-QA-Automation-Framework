package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllSongsPage extends BasePage {

    public AllSongsPage(WebDriver givenDriver) { super(givenDriver); }

    //WebElements
    @FindBy(css = "a[href='#!/songs']")
    private WebElement allSongsLink;

    @FindBy(css = "#songsWrapper h1")
    private WebElement allSongsPageHeader;

    public void clickAllSongsLink() {
        allSongsLink.click();
    }

    public boolean getAllSongsPageHeader()
    {
        waitForVisibility(allSongsPageHeader);
        return allSongsPageHeader.isDisplayed();
    }

}
