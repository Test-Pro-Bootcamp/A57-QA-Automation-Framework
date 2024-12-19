package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

    public ProfilePage (WebDriver givenDriver){

        super (givenDriver);

    }

    @FindBy(css="#inputProfileCurrentPassword")

   private WebElement currentPasswordField;

    @FindBy (css="input#inputProfileName")

    private WebElement profileNameField;

    @FindBy (css="button.btn-submit")
    private WebElement saveButton;

    @FindBy (css = "div.success.show")
    private WebElement profileUpdatedMsg;
    @FindBy(css = "input#inputProfileNewPassword")
    private WebElement NewPasswordField;

    @FindBy (css = ".view-profile")
    private WebElement viewProfileBtn;

    @FindBy (css = "div.error.show")
    private WebElement errorMsg;

    public ProfilePage provideCurrentPassword (String Password){
       currentPasswordField.clear();
        currentPasswordField.sendKeys(Password);
        return this;

    }

    public ProfilePage provideProfileName(String Name ){
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

    public ProfilePage provideNewPassword (String NewPassword){
        NewPasswordField.clear();
        NewPasswordField.sendKeys(NewPassword);
        return this;
    }

    public ProfilePage clickViewProfile(){
        viewProfileBtn.click();
        return this ;

    }

    public String getErrorMsg(){

        return errorMsg.getText();

    }

    public boolean getUpdatedPasswordMsg(){
        return profileUpdatedMsg.isDisplayed();

    }









}
