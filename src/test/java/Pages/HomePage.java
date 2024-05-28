package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    public HomePage (WebDriver givenDriver){
        super(givenDriver);


    }

    By userAvatarIcon = By.cssSelector("img.avatar");
    By playlist = By.cssSelector("section#playlists > ul > li:nth-of-type(8)");
    By deleteBtn = By.cssSelector(".btn-delete-playlist");
    By deleteMsg = By.cssSelector("div.success.show");





    public WebElement getAvatarIcon  (){
        return findElement(userAvatarIcon);
    }

    public void clickOnPlaylist (){
         findElement(playlist);


    }

    public void clickDeletePlaylist (){
        findElement(deleteBtn);
    }

    public String getDeletedPlaylistMsg (){
        return findElement(deleteMsg).getText();
    }


}
