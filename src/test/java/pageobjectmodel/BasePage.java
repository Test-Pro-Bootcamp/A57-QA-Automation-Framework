package pageobjectmodel;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    public BasePage(WebDriver givenDriver){
        driver = givenDriver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
    }

    public WebElement waitForVisibility(WebElement element)
    {
        return new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(element));
    }

    protected boolean waitForElementToBeNotVisible(WebElement webElement) {
        // Initialize a flag to track if the web element is not visible
        boolean isWebElementNotVisible = false;
        try {
            // Wait for the given web element to become invisible within 1 second
            isWebElementNotVisible = new WebDriverWait(driver, Duration.ofSeconds(1)).until(ExpectedConditions
                    .invisibilityOf(webElement));
        } catch (TimeoutException e) {
            // If the element is still visible after waiting, set the flag to true
            isWebElementNotVisible = true;
        }
        // Return whether the web element is not visible
        return isWebElementNotVisible;
    }

}
