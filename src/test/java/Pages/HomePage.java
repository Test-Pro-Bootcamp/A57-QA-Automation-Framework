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

    @FindBy (css = "section#playlists  i[role='button']")
    private WebElement createPlaylistBtn;

    @FindBy (css = "nav > ul > li:nth-of-type(2)")

    private WebElement smartPlaylistDropD;

    @FindBy (css = "input[name='name']")
    private WebElement smartPlaylistInput;

    @FindBy (css = ".row > select[name='model[]']")
    private WebElement selectDropDown;

    @FindBy (xpath = "//div[@id='mainWrapper']//div[@class='smart-playlist-form']/div/form//div[@class='rule-group']/div[@class='row']/select[@name='model[]']/option[1]")
    private WebElement titleSelectDropDown;


    @FindBy (css = ".row > select[name='operator[]']")
    private WebElement secondSelectDropDown;


    @FindBy (css = "select[name='operator[]'] > option:nth-of-type(1)")
    private WebElement selectIsDropDown;

    @FindBy(css = "input[name='value[]']")
    private WebElement inputField;

@FindBy (css = "footer > button:nth-of-type(1)")
private WebElement saveBtn;

@FindBy(css = "[href='\\#\\!\\/playlist\\/102263']")
private WebElement smartPlaylist;

@FindBy(css = "section#playlistWrapper .items > .song-item")
private WebElement songDarkDays;

@FindBy (css = "div:nth-of-type(3) > select[name='model[]']")
private WebElement selectOfRule2;

@FindBy (css = "div:nth-of-type(3)  input[name='value[]']")
private WebElement albumInput;

@FindBy (css = "div:nth-of-type(1) > .btn-add-rule")
private WebElement rule2Btn ;

@FindBy (css = ".btn-add-group")
private WebElement addGroupBtn;

@FindBy (css = "div:nth-of-type(1) > .row > select[name='model[]']")
private WebElement groupPlaylistSelect1;

@FindBy (css = "div:nth-of-type(1) > .row > select[name='operator[]']")

private WebElement groupPlaylistSelect2;

@FindBy(css = "div:nth-of-type(1) > .row  input[name='value[]']")
private WebElement groupPlaylistInput1;

@FindBy(css = "div:nth-of-type(2) > .row > select[name='model[]']")
private WebElement groupPlaylistSelect3;

@FindBy (css = "div:nth-of-type(2) > .row > select[name='operator[]']")
private WebElement groupPlaylistSelect4;

@FindBy(css = "div:nth-of-type(2) > .row > .value-wrapper > input[name='value[]']")
private WebElement groupPlaylistInput2;

@FindBy (css = "section#playlistWrapper .text")
private WebElement emptyPlaylistMsg;

@FindBy(css = "section#playlists > ul > li:nth-of-type(5)")

private WebElement emptyPlaylist;

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

    public void clickOnCreatePlaylistDropD(){
        actions.moveToElement(smartPlaylistDropD).perform();
        smartPlaylistDropD.click();
    }

    public HomePage writeSmartPlaylistName(String PlaylistName){
        smartPlaylistInput.sendKeys(PlaylistName);
        return this ;
    }

   //public HomePage clickSelectDropDown(){
        //selectDropDown.click();
       // return this;
   // }

    public void selectTitleFromDropDown(){

        WebElement selectDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".row > select[name='model[]']")));
        Select select = new Select(selectDropDown);
        select.selectByIndex(0);

    }


    //public HomePage clickSelectForSecondDropDown(){
        //secondSelectDropDown.click();
       // return this ;

//}

public void selectIsFromSecondDropDown(){
    WebElement selectSecondDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".row > select[name='operator[]']")));
    Select select = new Select(selectSecondDropDown);
    select.selectByIndex(0);

        //actions.moveToElement(selectIsDropDown).perform();
       // selectIsDropDown.click();
}
public HomePage writeTheSongName(String songName){
        inputField.sendKeys(songName);
        return this;
}

public HomePage clickOnSaveBtn(){
        saveBtn.click();
        return this;
}

public String getSuccessNotification(){
      return   successNotificationMsg.getText();

}

public HomePage clickOnSmartPlaylist(){
        smartPlaylist.click();
        return this;
}

public boolean isDarkDaysDisplayed(){
        return songDarkDays.isDisplayed();
}

    public void selectAlbumFromDropDownRule2(){

        WebElement selectDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(3) > select[name='model[]']")));
        Select select = new Select(selectDropDown);
        select.selectByIndex(1);

    }

    public void selectIsFromDropDownRule2(){

        WebElement selectDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(3) > select[name='operator[]']")));
        Select select = new Select(selectDropDown);
        select.selectByIndex(0);

    }

    public HomePage writeNameOfAlbum(String albumName){
        albumInput.sendKeys(albumName);
        return this;

    }

    public HomePage clickOnRuleBtn(){
        rule2Btn.click();
        return this;

    }

    public String getSuccessMsg(){
        WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
       return successMsg.getText();

    }

    public HomePage clickOnGroupBtn(){
        addGroupBtn.click();
        return this ;
    }

    public void selectAlbumFromFirstDropDown(){
        WebElement groupFirstDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .row > select[name='model[]']")));
        Select select = new Select(groupFirstDropDown);
        select.selectByIndex(1);
    }

public void selectIsFromGroupSecondDropDown(){
        WebElement groupSecondDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .row > select[name='operator[]']")));
        Select select = new Select(groupSecondDropDown);
        select.selectByIndex(0);
}

public HomePage writeAlbum1Name(String AlbumName1){
        groupPlaylistInput1.sendKeys(AlbumName1);
        return this;
}

    public void selectAlbumFromThirdGroupDropDown(){
        WebElement groupThirdDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .row > select[name='model[]']")));
        Select select = new Select(groupThirdDropDown);
        select.selectByIndex(1);
    }
    public void selectIsFromFourthGroupDropDown(){
        WebElement groupFourthDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .row > select[name='operator[]']")));
        Select select = new Select(groupFourthDropDown);
        select.selectByIndex(0);
    }

    public HomePage writeAlbum2Name(String AlbumName2) {
        groupPlaylistInput2.sendKeys(AlbumName2);
        return this;
    }

    public HomePage clickOnZinPlaylist(){
        emptyPlaylist.click();
        return this ;
    }

    public String verifyPlaylistIsEmpty(){
       return emptyPlaylistMsg.getText();

    }
}
