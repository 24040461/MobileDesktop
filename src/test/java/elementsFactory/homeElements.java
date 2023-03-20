package elementsFactory;

import elementsTest.commonElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class homeElements {

    AndroidDriver driver;

    public commonElement homeLogo;
    public commonElement destSearch;
    public commonElement dates;
    public commonElement rooms;
    public commonElement search;
    public commonElement recentSearchResult;



//       android.widget.TextView[@text='Log in']


    public homeElements(AndroidDriver driver){
        this.driver = driver;
        WiniumElement();
    }

    private void WiniumElement() {
        homeLogo = new commonElement(By.id("com.trivago:id/fragmentHomeLogoImageView"),driver);
        destSearch = new commonElement(By.id("com.trivago:id/fragmentHomeExpandedDealformDestinationTextView"),driver);
        dates = new commonElement(By.id("com.trivago:id/fragmentHomeExpandedDealformCalendarTextView"),driver);
        rooms = new commonElement(By.id("com.trivago:id/fragmentHomeExpandedDealformRoomTextView"),driver);
        search = new commonElement(By.id("com.trivago:id/fragmentHomeExpandedDealformSearchTextView"),driver);
        recentSearchResult = new commonElement(By.xpath("//android.widget.TextView[@text='Burnley']"),driver);

    }
}
