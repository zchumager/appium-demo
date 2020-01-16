import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.HomePage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {
    private DesiredCapabilities capabilities;
    private AppiumDriver driver;

    HomePage homePage;

    @Before
    public void setUp () throws MalformedURLException {

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion", "8.1");
        capabilities.setCapability("deviceName","First_Device");

        File appDir = new File("/Users/developer/Downloads/appium/sample-apps-master/pre-built");
        File app = new File(appDir, "selendroid-test-app.apk");

        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        homePage = new HomePage(driver);
    }

    @org.junit.Test
    public void sendKeysMyTextField() {
        homePage.getMyTextField().sendKeys("Hello World");
    }

    @org.junit.Test
    public void clickVisibleButtonTest() {
        homePage.getVisibleButtonTest().click();
    }

    @org.junit.Test
    public void clickWaitingButtonTest() {
        homePage.getWaitingButtonTest().click();
    }
}
