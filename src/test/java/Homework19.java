import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest{
    @Test
    public void deletePlaylist() throws InterruptedException {
        String expectedPlaylistDeleteMessage; = "Deleted Playlist\ myPlaylist.\"";

        provideEmail("sabrina.koulougli@testpro.io");
        providePassword("Student@test17");
        clickSubmit();
        openPlaylist();
        clickDeletePlaylistBtn();
        Assert.assertEquals("getDeletePlaylistMsg");

    }

    public void clickDeletePlaylistBtn() {
        WebElement deletePlaylist = driver.findElement(new By.ByCssSelector(".bnt-delete-playlist"));
        deletePlaylist.click();
        Thread(2000);
    }

    public void openPlaylist() {
        WebElement emptyPlaylist = driver.findElement(new By.ByCssSelector(".playlist: myPlaylist"));
        emptyPlaylist.click();
    }
}
