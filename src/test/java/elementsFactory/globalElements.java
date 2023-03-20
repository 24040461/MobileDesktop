package elementsFactory;

import elementsTest.commonElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class globalElements {
    AndroidDriver driver;

    public commonElement staysBtn;
    public commonElement favBtn;
    public commonElement settingBtn;


    public globalElements(AndroidDriver driver) {
        this.driver = driver;
        WiniumElement();
    }

    private void WiniumElement() {
        staysBtn = new commonElement(By.xpath("//android.widget.TextView[@text='Stays']"),driver);
        favBtn = new commonElement(By.xpath("//android.widget.TextView[@text='Favorites']"),driver);
        settingBtn = new commonElement(By.xpath("//android.widget.TextView[@text='Settings']"),driver);
    }
}
