package com.elementDetails;

import org.openqa.selenium.By;

import androidMain.AndroidTestBase;
import io.appium.java_client.MobileElement;

public class DisplayDate extends AndroidTestBase {
	
	public static MobileElement startDate() {
		return driver.findElement(By.id("com.myapp.finance:id/start_date"));
	}
	
	public static MobileElement endDate() {
		return driver.findElement(By.id("com.myapp.finance:id/end_date"));
	}
	
	public static MobileElement incomeCheckBox() {
		return 	driver.findElement(By.id("com.myapp.finance:id/income_check_box"));
	}
	
	public static MobileElement expenseCheckBox() {
		return 	driver.findElement(By.id("com.myapp.finance:id/expense_check_box"));
	}
	
	public static MobileElement canncel() {
		return driver.findElement(By.id("android:id/button2"));
	}
	
	public static MobileElement okButton() {
		return driver.findElement(By.id("android:id/button1"));
	}
	
	public static MobileElement close() {
		return driver.findElement(By.id("com.myapp.finance:id/cl")); 
	}
	
	public static MobileElement expense_IncomeClose() {
		return driver.findElement(By.id("com.myapp.finance:id/quit"));
	}

}
