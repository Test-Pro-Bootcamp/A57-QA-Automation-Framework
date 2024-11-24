package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css= "input[type='email']")
    private WebElement emailField;
    @FindBy(css ="input[type='password']")
    private WebElement  passwordField ;
    @FindBy(css = "button[type='submit']" )
    private WebElement submitBtn;





    public LoginPage(WebDriver givenDriver){

        super(givenDriver);
    }
   //By emailField = By.cssSelector("input[type='email']");
   // By passwordField = By.cssSelector("input[type='password']");
    //By submitBtn= By.cssSelector("input[type='email']");

    //public void provideEmail (String email ) {
        //emailField.sendKeys(email);
    //}
    //public void providePassword(String password ){
        //passwordField.sendKeys(password);
    //}
    //public void clickSubmit(){
        //submitBtn.click();
    //}

public LoginPage provideEmail(String email){
        emailField.sendKeys(email);
        return this;
}

public LoginPage providePassword (String password){
        passwordField.sendKeys(password);
        return this;

}

public LoginPage clickSubmit (){
        submitBtn.click();
        return this ;
}









}

