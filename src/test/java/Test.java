import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {
    private DesiredCapabilities capabilities;
    private AppiumDriver<WebElement> driver;

    @FindBy(id = "io.selendroid.testapp:id/my_text_field")
    WebElement txtField;

    @Before
    public void setUp () throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion", "8.1");
        capabilities.setCapability("deviceName","First_Device");

        File appDir = new File("/Users/developer/Downloads/appium/sample-apps-master/pre-built");
        File app = new File(appDir, "selendroid-test-app.apk");
        capabilities.setCapability("app", app.getAbsolutePath());

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @org.junit.Test
    public void sendKeys() {
        txtField.sendKeys("Hello World");
    }
}
