package elementsFactory;

import elementsTest.commonElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class startingUpElements {
    AndroidDriver driver;

    public commonElement weclomeTitle;
    public commonElement confirmBtn;
    public commonElement acceptBtn;


    public startingUpElements(AndroidDriver driver) {
        this.driver = driver;
        WiniumElement();
    }

    private void WiniumElement() {
        //        settingBtn = new commonElement(By.xpath("//android.widget.Button[@text='Settings']"),driver);
        weclomeTitle = new commonElement(By.id("com.trivago:id/activityPlatformSelectionWelcomeTextView1"),driver);
        confirmBtn = new commonElement(By.id("com.trivago:id/activityPlatformSelectionConfirmButton"),driver);
        acceptBtn = new commonElement(By.id("com.trivago:id/activityCookieConsentContentAcceptButton"),driver);

    }
}
