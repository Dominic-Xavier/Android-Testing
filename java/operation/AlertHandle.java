package operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import androidMain.AndroidTestBase;

public class AlertHandle extends AndroidTestBase {
	
	static Alert alert;
	
	public static void alerts(String data) {
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		alert.sendKeys(data);
		alert.accept();
	}
	
	public static void alertAccept() {
		alert = driver.switchTo().alert();
		alert.accept();
	}

}
