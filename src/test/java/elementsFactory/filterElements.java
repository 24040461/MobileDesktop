package elementsFactory;

import elementsTest.commonElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class filterElements {
    AndroidDriver driver;

    public commonElement settingBtn;


    public filterElements(AndroidDriver driver) {
        this.driver = driver;
        WiniumElement();
    }

    private void WiniumElement() {
        settingBtn = new commonElement(By.xpath("//android.widget.Button[@text='Settings']"),driver);
    }
}
