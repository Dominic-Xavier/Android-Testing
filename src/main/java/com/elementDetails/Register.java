package com.elementDetails;

import org.openqa.selenium.By;

import androidMain.AndroidTestBase;
import io.appium.java_client.MobileElement;

public class Register extends AndroidTestBase {
	
	public static MobileElement username() {
		return driver.findElement(By.id("com.myapp.finance:id/user")); 
	}
	
	public static MobileElement password() {
		return driver.findElement(By.id("com.myapp.finance:id/pass")); 
	}
	
	public static MobileElement rePassword() {
		return driver.findElement(By.id("com.myapp.finance:id/repass")); 
	}
	
	public static MobileElement mobileNumber() {
		return driver.findElement(By.id("com.myapp.finance:id/mob_num")); 
	}
	
	public static MobileElement registerButton() {
		return driver.findElement(By.id("com.myapp.finance:id/create")); 
	}
	
	public static MobileElement backToLogin() {
		return driver.findElement(By.id("com.myapp.finance:id/cancel")); 
	}
}
