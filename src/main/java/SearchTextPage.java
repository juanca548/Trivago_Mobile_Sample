import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchTextPage extends BaseScreen{
    @AndroidFindBy(id = "com.trivago:id/activitySearchDestinationSearchEditText") private static MobileElement textField;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]") private static MobileElement ubication;
    public SearchTextPage(AppiumDriver driver)
    {
        super(driver);
    }

    public void setDestination(String destination){
        textField.sendKeys(destination);
    }

    public void selectDestination(){
        ubication.click();
    }
}
