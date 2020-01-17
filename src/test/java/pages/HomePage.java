package pages;

import bases.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "io.selendroid.testapp:id/my_text_field")
    WebElement myTextField;

    @AndroidFindBy(id = "io.selendroid.testapp:id/waitingButtonTest")
    WebElement waitingButtonTest;

    @AndroidFindBy(id = "io.selendroid.testapp:id/visibleButtonTest")
    WebElement visibleButtonTest;

    @AndroidFindBy(id = "io.selendroid.testapp:id/showToastButton")
    WebElement showToastButton;

    public WebElement getMyTextField() {
        return myTextField;
    }

    public WebElement getWaitingButtonTest() {
        return waitingButtonTest;
    }

    public WebElement getVisibleButtonTest() {
        return visibleButtonTest;
    }

    public WebElement getShowToastButton() {
        return showToastButton;
    }
}
