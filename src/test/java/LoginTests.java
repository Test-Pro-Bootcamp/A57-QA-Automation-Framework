import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class LoginTests extends BaseTest {

    @Test

        public void loginWithValidCredentials() {
            LoginPage loginPage = new LoginPage(driver);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            loginPage.provideEmail("nemanja.sijacic@testpro.io")
                    .providePassword("Vojvodina.021")
                    .clickSubmitBtn();

            WebDriver driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            String url = "https://qa.koel.app/";
            driver.get(url);
            Assert.assertEquals(driver.getCurrentUrl(), url);
            driver.quit();
        }

        @Test
        public void loginWithInvalidCredentials() {
            LoginPage loginPage = new LoginPage(driver);

            loginPage.provideEmail("InvalidEmail")
                    .providePassword("InvalidPassword")
                    .clickSubmitBtn();
        }

        @Test
        public void loginWithValidEmailInvalidPassword() {
            LoginPage loginPage = new LoginPage(driver);

            loginPage.provideEmail("nemanja.sijacic@testpro.io")
                    .providePassword("InvalidPassword")
                    .clickSubmitBtn();

        }

        @Test
        public void loginWithEmptyEmailValidPassword() {
            LoginPage loginPage = new LoginPage(driver);

            loginPage.provideEmail(" ")
                    .providePassword("Vojvodina.021")
                    .clickSubmitBtn();

        }

    }