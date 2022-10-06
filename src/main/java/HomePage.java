import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BaseScreen{
    @AndroidFindBy(id = "com.trivago:id/fragmentHomeExpandedDealformDestinationTextView") private static MobileElement searchButton;
    public HomePage(AppiumDriver driver){
        super(driver);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

}
