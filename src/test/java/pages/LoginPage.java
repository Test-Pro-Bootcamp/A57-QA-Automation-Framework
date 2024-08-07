package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    //WEb Elements:
    private By emailField = By.cssSelector("input[type='email']");
    private By passwordField = By.cssSelector("input[type='password']");
    private By clickBtn = By.cssSelector("button[type='submit']");

    // Helper methods:

    public void provideEmail(String email) {
        findElement(emailField).sendKeys(email);
    }

    public void providePassword(String password) {
        findElement(passwordField).sendKeys(password);
    }

    public void clickLoginBtn() {
        findElement(clickBtn).click();
    }

    public void login() {
        provideEmail("elena.churinova@testpro.io");
        providePassword("skL&mpg67");
        clickLoginBtn();
    }

}
