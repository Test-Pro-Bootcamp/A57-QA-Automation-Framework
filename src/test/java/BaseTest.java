import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTest {

    protected  WebDriver driver = null;

    //public WebDriver driver;

    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }


 @BeforeMethod
 @Parameters ("baseUrl")

public void launchBrowser(String baseUrl) {
     ChromeOptions options = new ChromeOptions();
     options.addArguments("--remote-allow-origins=*");
     options.addArguments("--disable-notifications");
     options.addArguments("--remote-allow-origins=*");
     options.addArguments("-incognito");
     options.addArguments("--start-maximized");
     options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
     driver = new ChromeDriver(options);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.manage().window().maximize();
     navigateToPage(baseUrl);
 }
@AfterMethod
    public void closeBrowser (){
    driver.quit();
     }




    public void clickLoginBtn() {
        WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
        loginBtn.click();
    }

    public  void providePassword(String password) {
        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
        passwordField.clear();
        passwordField.sendKeys("Password2026@");
    }

    public void provideEmail(String email) {
        WebElement emailField = driver.findElement(By.cssSelector("input[type='email']"));
        emailField.clear();
        emailField.sendKeys("tassadit.talbi@testpro.io");
    }

    public void navigateToPage(String baseUrl) {
        //String url = "https://qa.koel.app/";
        driver.get(baseUrl);







    }
}




