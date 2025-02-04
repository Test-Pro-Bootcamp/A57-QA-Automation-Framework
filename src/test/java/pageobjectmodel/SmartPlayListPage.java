package pageobjectmodel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SmartPlayListPage extends BasePage {

    public SmartPlayListPage(WebDriver givenDriver) {
        super(givenDriver);
        //this.criteria1DropDowns = criteria1DropDowns;
    }

    //WebElements
    @FindBy(xpath = "//a [text() = 'TestEditRule']")
    private WebElement smartRulePlayListLink;

    @FindBy(xpath = "//a [text() = 'TestEditGroup']")
    private WebElement smartGroupPlayListLink;

    @FindBy(xpath = "//a [text() = 'TestDelete']")
    private WebElement smartDeletePlayListLink;

    @FindBy(css = "#playlistWrapper h1")
    private WebElement userPlayListPageHeader;

    @FindBy(css = "#playlistWrapper table[class='items'] > tr")
    private WebElement firstUserSongElement;

    @FindBy(css = "#playlistWrapper table[class='items'] td[class='artist']")
    private WebElement firstSongElementArtist;

    @FindBy(css = "#playlistWrapper  button[class='btn-shuffle-all']")
    private WebElement userPlayListShuffleAll;


    @FindBy(css = "[data-testid='create-smart-playlist-form'] input[name='name']")
    private WebElement smartPlayListNameField;

    @FindBy(css = "select[name^=\"model\"]")
    private WebElement modelDropDown;

    @FindBy(xpath = "//select[@name='model[]']")
    private List<WebElement> criteria1DropDowns;

    @FindBy(css = "select[name^=\"operator\"]")
    private WebElement operatorDropDown;

    @FindBy(xpath = "//select[@name='operator[]']")
    private List<WebElement> criteria2DropDowns;


    @FindBy(css = "input[name^=\"value\"]")
    private WebElement valueDropDown;

    @FindBy(xpath = "//input[@name='value[]']")
    private List<WebElement> criteria3DropDowns;

//    @FindBy(css = "[data-testid='create-smart-playlist-form'] button[type='submit']")
//    private WebElement saveBtn;

    @FindBy(css = "footer button[type='submit']")
    private WebElement saveBtn;

    @FindBy(css = "button[class='btn-add-rule']")
    private WebElement ruleBtn;

    @FindBy(css = "button[class='btn-add-group']")
    private WebElement groupBtn;

    @FindBy(css = "[data-test='smart-playlist-rule-row']:nth-child(3) input[name^=\"value\"]")
    private WebElement criteria3RuleField;

    @FindBy(css = "[class='rule-group']:nth-child(2) [data-test='smart-playlist-rule-row'] input[name^=\"value\"]")
    private WebElement criteria3GroupField;

    @FindBy(xpath = "//li [text() = 'Edit']")
    private WebElement editBtn;

    @FindBy(xpath = "//li [text() = 'Delete']")
    private WebElement deleteBtn;

    @FindBy(css = "button[class='ok']")
    private WebElement deleteOkBtn;


    public void createSmartPlayListOriginal(String playListName, String criteria1, String criteria2, String criteria3) {
        waitForVisibility(smartPlayListNameField).sendKeys(playListName);
         // Create an object of the Select class
        Select select1 = new Select(modelDropDown);
        select1.selectByVisibleText(criteria1);
        Select select2 = new Select(operatorDropDown);
        select2.selectByVisibleText(criteria2);
        valueDropDown.sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.BACK_SPACE));
        valueDropDown.sendKeys(criteria3);
        saveBtn.click();
    }

    public void createSmartPlayList(String playListName, List<String> criteria1, List<String> criteria2, List<String> criteria3, String ruleType) {
        waitForVisibility(smartPlayListNameField).sendKeys(playListName);

        switch (ruleType)
        {
            case "Single":
                break;
            case "Multiple":
                for (int count = 0; count < criteria1.size()-1; count ++) {
                    ruleBtn.click();
                }
                break;
            case "Group":
                ruleBtn.click();
                groupBtn.click();

        }

        int i = 0, j = 0, k = 0;
        for (WebElement dropDown : criteria1DropDowns) {
            // Create a Select object to interact with the dropdown
            Select select = new Select(dropDown);
            select.selectByVisibleText(criteria1.get(i));
            i++;
        }

        for (WebElement dropDown : criteria2DropDowns) {
            // Create a Select object to interact with the dropdown
            Select select = new Select(dropDown);
            select.selectByVisibleText(criteria2.get(j));
            j++;
        }

        for (WebElement dropDown : criteria3DropDowns) {
            dropDown.sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.BACK_SPACE));
            dropDown.sendKeys(criteria3.get(k));
            k++;
        }

        saveBtn.click();

    }

    public void editSmartPlayList(String criteria3, String type) {

        switch (type)
        {
            case "Rule":
                actions.contextClick(smartRulePlayListLink).perform();
                waitForVisibility(editBtn).click();
                criteria3RuleField.sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.BACK_SPACE));
                criteria3RuleField.sendKeys(criteria3);
                break;
            case "Group":
                actions.contextClick(smartGroupPlayListLink).perform();
                waitForVisibility(editBtn).click();
                criteria3GroupField.sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.BACK_SPACE));
                criteria3GroupField.sendKeys(criteria3);
                break;
        }

        saveBtn.click();

    }


    public void deleteSmartPlayList() {

        actions.contextClick(smartDeletePlayListLink).perform();
        waitForVisibility(deleteBtn).click();
        waitForVisibility(deleteOkBtn).click();

    }



//    public void clickSmartPlayListLink() {
//        waitForVisibility(smartPlayListLink).click();
//    }

    public boolean getUserPlayListPageHeader()
    {
        waitForVisibility(userPlayListPageHeader);
        return userPlayListPageHeader.isDisplayed();
    }

    public void playFirstUserPlayListSong()
    {
        actions.doubleClick(firstUserSongElement).perform();
    }

    public String getUserPlaylistFirstArtistName()
    {
        return waitForVisibility(firstSongElementArtist).getText();
    }

    public void shuffleAllSongs()
    {
        waitForVisibility(userPlayListShuffleAll).click();
    }


}
