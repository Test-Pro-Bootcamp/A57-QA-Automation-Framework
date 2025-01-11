package Pages;

import org.openqa.selenium.WebDriver;

import java.io.File;

public class DownlaodPage extends BasePage{


    public DownlaodPage(WebDriver givenDriver ) {
       super (givenDriver);
    }



    public boolean isFileDownloaded(String fileName) {
      String downloadDirectory = "downloadDirectory";
        File downloadedFile = new File(downloadDirectory + "/" + fileName);
        return downloadedFile.exists();
    }











}
