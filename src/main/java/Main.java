import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //LenguagePage lenguage = new LenguagePage(driver);
        //lenguage.selectLenguage();
        //driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
        //driver.findElementById("com.trivago:id/activityCookieConsentContentAcceptButton").click();
        HomePage home = new HomePage(driver);
        home.clickSearchButton();
        SearchTextPage text = new SearchTextPage(driver);
        text.setDestination("aruba");
        text.selectDestination();
        SelectDatesPage dates = new SelectDatesPage(driver);
        dates.selectDates();
        HotelsPage hotel = new HotelsPage(driver);
        hotel.selectHotel();
        hotel.tapBack();
        hotel.tapBack();
    }
}
