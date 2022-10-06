import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LenguagePage extends BaseScreen{
    @AndroidFindBy(id = "com.trivago:id/activityPlatformSelectionConfirmButton") private static MobileElement confirmButton;
    public LenguagePage(AppiumDriver driver){
        super(driver);
    }

    public void selectLenguage(){
        confirmButton.click();
    }

}
