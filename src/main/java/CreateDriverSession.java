import com.aventstack.extentreports.App;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.URL;
public class CreateDriverSession {
    public static AppiumDriver initializeDriver(String platformName) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", platformName);
        caps.setCapability("newCommandTimeout", "300");
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        switch (platformName) {
            case "Android":
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3");
                caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                caps.setCapability("newCommandTimeout", 300);
                caps.setCapability("skipUnlock", "true");
                caps.setCapability("appPackage", "com.trivago");
                caps.setCapability("appActivity", "com.trivago.ft.main.frontend.MainActivity");
                //caps.setCapability("avd", "Pixel_3");
                caps.setCapability("autoAcceptAlerts", true);
                //caps.setCapability("avdLaunchTimeout", "180000");
                //caps.setCapability("avdReadyTimeout", "200000");
                //String appUrl = System.getProperty("user.dir") + File.separator + "src/main/resources/app/trivago.apk";
                //caps.setCapability(MobileCapabilityType.APP, appUrl);
                return new AndroidDriver(url,caps);
            case "iOS":
            default:
                throw new Exception("invalid platform");
        }
    }
}




/*import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CreateDriverSession {
    public static AppiumDriver initializeDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability("newCommandTimeout", 300);
        caps.setCapability("skipUnlock", "true");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel_3");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability("appPackage", "com.trivago");
        caps.setCapability("appActivity", "com.trivago.ft.main.frontend.MainActivity");
        //caps.setCapability("avd", "Pixel 3");
        //caps.setCapability("avdLaunchTimeout", 180000);
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "app" + File.separator + "trivago.apk";
        caps.setCapability(MobileCapabilityType.APP, appUrl);
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AppiumDriver driver = new AndroidDriver(url, caps);
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        return driver;
    }
}*/

