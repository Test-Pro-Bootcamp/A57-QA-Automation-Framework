package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProfilePage extends BasePage{

    public ProfilePage(WebDriver givenDriver)
    {
        super(givenDriver);
    }

    //WebElements
    @FindBy(css="input[id='inputProfileCurrentPassword']")
    private WebElement currentPasswordField;

    @FindBy(css="input[id='inputProfileEmail']")
    private WebElement emailAddressField;

    @FindBy(css="input[id='inputProfileNewPassword']")
    private WebElement newPasswordField;

    @FindBy(css="#inputProfileName")
    private WebElement newNameField;

    @FindBy(css="#userBadge span[class='name']")
    private WebElement profileNameField;

    @FindBy(css="button[class='btn-submit']")
    private WebElement saveBtn;

    @FindBy(css="#profileWrapper ul[class='themes'] li:nth-child(2)")
    private WebElement profileThemeListElement;
    //@FindBy(css="input[name='show_album_art_overlay']")
    @FindBy(css="input[name='show_album_art_overlay'][type='checkbox']")
    private WebElement showAlbumArtOverlayElement;

    @FindBy(css="[data-testid='album-art-overlay']")
    private WebElement albumArtOverlayElement;

    @FindBy(css="input[name='confirm_closing'][type='checkbox']")
    private WebElement confirmClosingElement;


    public void updateEmail(String curPassword, String newEmail){

        waitForVisibility(currentPasswordField).sendKeys(curPassword);
        emailAddressField.clear();
        emailAddressField.sendKeys(newEmail);
        saveBtn.click();
    }

    public void updatePassword(String curPassword, String newPassword){

        waitForVisibility(currentPasswordField).sendKeys(curPassword);
        newPasswordField.sendKeys(newPassword);
        saveBtn.click();
    }

    public void updateEmailPassword(String curPassword, String newEmail, String newPassword){

        waitForVisibility(currentPasswordField).sendKeys(curPassword);
        emailAddressField.clear();
        emailAddressField.sendKeys(newEmail);
        newPasswordField.sendKeys(newPassword);
        saveBtn.click();
    }

    public void updateName(String curPassword, String newName){

        waitForVisibility(currentPasswordField).sendKeys(curPassword);
        newNameField.clear();
        newNameField.sendKeys(newName);
        saveBtn.click();
    }

    public String getProfileName()
    {
        return waitForVisibility(profileNameField).getText();
    }

    public void changeThemeToViolet()
    {
        waitForVisibility(profileThemeListElement).click();
    }

    public void clickShowBlurredAlbumArtOverlay() {
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        //actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
        //Thread.sleep(2000);
        if (!showAlbumArtOverlayElement.isSelected()) {
            actions.moveToElement(showAlbumArtOverlayElement).click().perform();

        }

    }

    public boolean isAlbumArtOverlayDisplayed()
    {
        return waitForVisibility(albumArtOverlayElement).isDisplayed();
    }


    public void clickConfirmClosingKoel() {
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        if (!confirmClosingElement.isSelected()) {
            actions.moveToElement(confirmClosingElement).click().perform();

        }

    }

}
