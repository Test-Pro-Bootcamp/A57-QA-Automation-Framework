package pageobjectmodel;

import org.openqa.selenium.By;
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

    @FindBy(css="button[class='btn-submit']")
    private WebElement saveBtn;

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

}
