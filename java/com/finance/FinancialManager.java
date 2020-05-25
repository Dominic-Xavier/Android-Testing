package com.finance;

import com.elementDetails.LoginDetails;
import androidMain.AndroidTestBase;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

public class FinancialManager extends AndroidTestBase {

	public static void main(String[] args) throws InterruptedException {
		try {
			AndroidTestBase.setUp();
			Thread.sleep(3000);
			
			 LoginDetails.userName().sendKeys("Xavier");
			 LoginDetails.passWord().sendKeys("Dominic"); 
			 driver.navigate().back();
			 LoginDetails.loginButton().click();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error occured:"+e.toString());
		}
	}
}
