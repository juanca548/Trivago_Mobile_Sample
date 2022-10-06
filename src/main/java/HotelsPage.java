import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HotelsPage extends BaseScreen{
    @AndroidFindBy(id = "com.trivago:id/viewBestDealViewOfferTextView") private static MobileElement hotelOption;
    public HotelsPage(AppiumDriver driver){
        super(driver);
    }

    public void selectHotel(){
        hotelOption.click();
    }
}
