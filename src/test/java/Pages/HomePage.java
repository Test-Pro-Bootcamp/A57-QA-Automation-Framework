package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

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
@FindBy (css = "section#playlists > ul > li:nth-of-type(3)")
private WebElement studentPlaylist;

@FindBy (css = ".menu.playlist-item-menu > ul > li:nth-of-type(1)")
private WebElement studentPlaylistEditBt;



@FindBy (css = "div:nth-of-type(2) > .row > select[name='model[]']")
private WebElement studentPllst1stSelect;

@FindBy (css = "div:nth-of-type(2) > .row > select[name='operator[]']")
private WebElement studentPllst2ndSelect;

@FindBy (css = "div:nth-of-type(2) > .row  input[name='value[]']")
private WebElement InputField;

@FindBy (css = "footer > button:nth-of-type(1)")

private WebElement saveBtn;

@FindBy (css = ".btn-add-group")
private WebElement groupBtn;

@FindBy (css = "section#playlists > ul > li:nth-of-type(5)")
private WebElement zinPlaylist;

@FindBy (css = ".menu.playlist-item-menu > ul > li:nth-of-type(2)")

private WebElement deleteDropDown;
@FindBy(css = "nav > .ok")

private WebElement okBtn;

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


    public String getSuccessMsg() {
        WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));

        return successNotificationMsg.getText();
    }

    public HomePage contextClickOnStudentPlaylist(){
      actions.contextClick(studentPlaylist).perform();
      return this;

    }

    public HomePage clickOnStudentPlaylistEditBtn(){
        studentPlaylistEditBt.click();
        return this;
    }



    public void clickOnSmartPlaylistFirstSelect(){
        WebElement smartPlaylistFirstSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .row > select[name='model[]']")));
        Select select = new Select(smartPlaylistFirstSelect);
        select.selectByIndex(0);
    }
    public void clickOnSmartPlaylistSecondSelect(){
        WebElement smartPlaylistSecondSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .row > select[name='operator[]']")));
        Select select = new Select(smartPlaylistSecondSelect);
        select.selectByIndex(0);
    }

    public HomePage WriteSongName(String SongName){
        InputField.sendKeys(SongName);
        return this;
    }

    public HomePage clickOnSveBtn(){
        saveBtn.click();
        return this;

    }

    public HomePage clickOnEditBtn(){
        studentPlaylistEditBt.click();
        return this;
    }
 public HomePage clickOnGroupBtn(){
        groupBtn.click();
        return this ;
 }

 public HomePage contextClickOnZinPlaylist(){

        actions.contextClick(zinPlaylist).perform();
        return this ;

 }
 public HomePage clickOnDeleteBtn(){
        deleteDropDown.click();
        return this ;
 }


 public HomePage clickOnOkBtn(){
        okBtn.click();
        return this ;
 }

}
