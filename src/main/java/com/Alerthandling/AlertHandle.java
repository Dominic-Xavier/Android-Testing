package com.Alerthandling;

import org.openqa.selenium.By;

import androidMain.AndroidTestBase;
import io.appium.java_client.MobileElement;

public class AlertHandle extends AndroidTestBase {
	
	public static MobileElement accept() {
		return driver.findElement(By.id("android:id/button1"));
	}
	
	public static MobileElement decline() {
		return driver.findElement(By.id("android:id/button2"));
	}
}
