package androidMain;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.Alerthandling.AlertHandle;
import com.elementDetails.NavigationView;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidTestBase {
	
	public static WebDriver driver;
	
	public static void setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi Note 6 Pro");
		cap.setCapability("udId", "4f784ae8");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion","9");
		cap.setCapability("appPackage", "com.myapp.finance");
		cap.setCapability("appActivity", "com.myapp.finance.Database");
		cap.setCapability("automationName", "UIautomator1");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		System.out.println("Application started");
		
	}
	
	public static void backButtonClick() {
		driver.navigate().back();
	}
	
	public static void slideBar() {
		NavigationView.navigationDrawer().click();
	}
	
	public static void alertAccept() {
		AlertHandle.accept().click();
	}
	
	public static void alertDecline() {
		AlertHandle.decline().click();
	}
	
	public static boolean checkIfAlertIsPresent() {
		try {
			alertAccept();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
}
