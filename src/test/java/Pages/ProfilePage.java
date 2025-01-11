package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

    public ProfilePage (WebDriver givenDriver){

        super (givenDriver);

    }

    @FindBy(css="input#inputProfileCurrentPassword")

   private WebElement currentPasswordField;

    @FindBy (css="input#inputProfileName")

    private WebElement profileNameField;

    @FindBy (css="button.btn-submit")
    private WebElement saveButton;

    @FindBy (css = "div.success.show")
    private WebElement profileUpdatedMsg;

    @FindBy(css = "input#inputProfileEmail")
    private WebElement emailInputField;

    @FindBy(css = "div.error.show")
    private WebElement emailErrorMsg;




    public ProfilePage provideCurrentPassword (String currentPassword){
        currentPasswordField.clear();
        currentPasswordField.sendKeys(currentPassword);
        return this;

    }

    public ProfilePage provideProfileName(String newProfileName){
        profileNameField.clear();
        profileNameField.sendKeys();
        return  this;

    }

    public ProfilePage clickSaveBtn(){

        saveButton.click();
        return this;
    }

    public String getUpdatedProfileMsg (){
        return profileUpdatedMsg.getText();
    }

    public ProfilePage provideNewEmail(String newEmail){
        emailInputField.clear();
        emailInputField.sendKeys(newEmail);
        return this;

    }
public boolean getUpdatedProfileNotif(){
        return profileUpdatedMsg.isDisplayed();
}

public String getEmailUpdateErrorMsg(){

        return emailErrorMsg.getText();
}













}
