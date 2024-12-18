package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {




    public RegistrationPage (WebDriver givenDriver){

        super (givenDriver);

    }
    @FindBy (xpath = "//div[@id='app']//form/div[2]/a[@href='registration']")
    private WebElement registrationBtn ;

    @FindBy (css = "input[name='email']")
    private WebElement emailRegistrationField;

    @FindBy(css = "input#button")
    private WebElement submitBtn;

    @FindBy (css = "div.messages")

    private WebElement confirmationLinkMsg;

    @FindBy (css = "form[method='post'] > p:nth-of-type(3)")
    private WebElement symbolErrorMsg;

    @FindBy (css = "form[method='post'] > .errors")

    private WebElement domainErrorMsg;







    public RegistrationPage clickOnRegistrationBtn(){

        registrationBtn.click();
         return this ;
    }

    public RegistrationPage provideEmail(String email){
        emailRegistrationField.clear();
        emailRegistrationField.sendKeys(email);
        return this ;
    }

    public RegistrationPage clickSubmit(){
        submitBtn.click();
        return this ;
    }

public String getConfirmationLinkMsg(){

       return confirmationLinkMsg.getText();



}

public String getSymbolErrorMsg(){
        return symbolErrorMsg.getText();

}

public String getDomainErrorMsg(){
        return domainErrorMsg.getText();
}




}
