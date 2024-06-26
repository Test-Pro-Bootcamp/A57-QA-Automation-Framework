package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    public HomePage (WebDriver givenDriver){
        super(givenDriver);


    }

    //By userAvatarIcon = By.cssSelector("img.avatar");
    @FindBy(css="img.avatar")
    private WebElement userAvatarIcon ;
    @FindBy(css="section#playlists > ul > li:nth-of-type(6)")
    private WebElement newPlaylist;

    @FindBy(css = ".btn-delete-playlist")
    private WebElement deleteButton ;

    @FindBy (css = "div.success.show")
    private WebElement successNotificationMsg;


    public WebElement getAvatarIcon  (){
        return findElement(userAvatarIcon);
    }

    public HomePage clickPlaylist (){
        newPlaylist.click();
        return this;


    }

    public HomePage clickDeleteBtn(){

        deleteButton.click();
        return this;
    }

    public HomePage getDeletedPlaylistMsg (){
        successNotificationMsg.getText();
        return this;


    }
}
