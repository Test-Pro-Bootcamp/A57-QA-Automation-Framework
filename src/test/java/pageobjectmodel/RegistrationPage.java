package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage{

    public RegistrationPage(WebDriver givenDriver)
    {
        super(givenDriver);
    }

    //WebElements
    private By regEmailField = By.cssSelector("input[type='email']");

    private By regSubmitBtn = By.cssSelector("input[type='submit']");

    private By regMessage = By.cssSelector("div[class='messages']");

    public void enterEmail(String email)
    {
        findElement(regEmailField).sendKeys(email);
    }

    public void clickSubmit()
    {
        findElement(regSubmitBtn).click();
    }

    public String getMessage()
    {
        return findElement(regMessage).getText();
    }


}
