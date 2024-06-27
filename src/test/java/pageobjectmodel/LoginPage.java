package pageobjectmodel;

import org.openqa.selenium.By;
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

    //private WebElement emailField;
    private By emailField = By.cssSelector("input[type='email']");

//    @FindBy(css="input[type='password']")
//    private WebElement passwordField;

    private By passwordField = By.cssSelector("input[type='password']");

//    @FindBy(css="button[type='submit']")
//    private WebElement logInBtn;

    private By logInBtn = By.cssSelector("button[type='submit']");


    private By registerLink = By.cssSelector("a[href='registration']");

    public void provideEmail(String email)
    {
        findElement(emailField).clear();
        findElement(emailField).sendKeys(email);
        //return this;
    }

    public void providePassword(String password)
    {
        findElement(passwordField).clear();
        findElement(passwordField).sendKeys(password);
        //passwordField.sendKeys(password);
        //return this;
    }

    public void clickLogIn()
    {
        findElement(logInBtn).click();;
        //logInBtn.click();
        //return this;
    }

    public void login(String email,String password)
    {
        provideEmail(email);
        providePassword(password);
        clickLogIn();
    }



    public void clickRegisterLink()
    {
        findElement(registerLink).click();
    }

//    public boolean isEmailFieldVisible(){
//        int attempt = 0;
//        boolean emailVisible = false;
//
//        while (attempt < 2) {
//            try {
//                waitForVisibility(emailField).isDisplayed();
//                emailVisible = true;
//                break;
//            } catch (StaleElementReferenceException ignored) { }
//            attempt ++;
//        }
//
//        return emailVisible;
//
//    }

    public String getTextEmailValidationMessage()
    {
        return findElement(emailField).getAttribute("validationMessage");
    }

    public String getTextPasswordValidationMessage()
    {
        return findElement(passwordField).getAttribute("validationMessage");
    }

    public boolean isDisplayedLogInBtn(){

        return findElement(logInBtn).isDisplayed();
    }

    public boolean isPasswordMasked()
    {
        return findElement(passwordField).getAttribute("type").equals("password");
    }


}
