import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelectDatesPage extends BaseScreen{
    @AndroidFindBy(id = "com.trivago:id/activityDatesSelectionCalendarApplyTextView") private static MobileElement applyDatesButton;
    public SelectDatesPage(AppiumDriver driver){
        super(driver);
    }

    public void selectDates(){
        applyDatesButton.click();
    }
}
