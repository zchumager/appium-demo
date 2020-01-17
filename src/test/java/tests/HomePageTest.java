package tests;

import io.appium.java_client.AppiumDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.HomePage;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

public class HomePageTest {
    private DesiredCapabilities capabilities;
    private AppiumDriver driver;

    HomePage homePage;

    @Before
    public void setUp ()
            throws MalformedURLException, InvocationTargetException, NoSuchMethodException, InstantiationException,
            IllegalAccessException {

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

    @Test
    public void sendKeysMyTextField() {
        homePage.getMyTextField().sendKeys("Hello World");
    }

    @Test
    public void clickVisibleButtonTest() {
        homePage.getVisibleButtonTest().click();
    }

    @Test
    public void clickWaitingButtonTest() {
        homePage.getWaitingButtonTest().click();
    }
}
