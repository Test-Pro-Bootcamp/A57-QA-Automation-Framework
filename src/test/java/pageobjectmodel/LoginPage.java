package pageobjectmodel;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver givenDriver)
    {
        super(givenDriver);
    }

    //WebElements
    @FindBy(css="input[type='email']")
    private WebElement emailField;

    @FindBy(css="input[type='password']")
    private WebElement passwordField;

    @FindBy(css="button[type='submit']")
    private WebElement logInBtn;

    public void provideEmail(String email)
    {
        emailField.sendKeys(email);
        //return this;
    }

    public void providePassword(String password)
    {
        passwordField.sendKeys(password);
        //return this;
    }

    public void clickLogIn()
    {
        logInBtn.click();
        //return this;
    }

    public void login(String email,String password)
    {
        provideEmail(email);
        providePassword(password);
        clickLogIn();

    }

    public boolean isEmailFieldVisible(){
        int attempt = 0;
        boolean emailVisible = false;

        while (attempt < 2) {
            try {
                waitForVisibility(emailField).isDisplayed();
                emailVisible = true;
                break;
            } catch (StaleElementReferenceException ignored) { }
            attempt ++;
        }

        return emailVisible;

    }

    public String getTextEmailValidationMessage()
    {
        return emailField.getAttribute("validationMessage");
    }

    public String getTextPasswordValidationMessage()
    {
        return passwordField.getAttribute("validationMessage");
    }

    public boolean isDisplayedLogInBtn(){

        return logInBtn.isDisplayed();
    }

}
