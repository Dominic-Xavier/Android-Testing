package com.operation;

import java.net.MalformedURLException;

import com.Alerthandling.AlertHandle;
import com.Allfunctions.OperationMethods;
import com.elementDetails.DatabaseElements;
import com.elementDetails.DisplayDate;
import com.elementDetails.LoginDetails;
import com.elementDetails.NavigationView;
import com.elementDetails.Register;
import com.elementDetails.UserAccountDetails;

import androidMain.AndroidTestBase;

public class AllOperations {
	
	public static void performOperation(String Keyword,String Data) throws InterruptedException, MalformedURLException {
		
		String values[] = Data.split(";;");
		
		switch(Keyword.toLowerCase()) {
		
			case "register":
				OperationMethods.register(values[0], values[1], values[2], values[3]);
				break;
			
			case "login":
				OperationMethods.login(values[0], values[1]);
				break;
			
			case "select option":
				OperationMethods.selectOption(values[0]);
				break;
			
			case "insert data":
				OperationMethods.insertData(values[0], values);
				break;
			
			
			//have to write code for handling alerts
			case "display":
				OperationMethods.display(values[0], values[1], values[2]);
				break;
			
			
			case "close display activity":
				DisplayDate.close().click();
				break;
			
			
			case "my account":{
				OperationMethods.myAccount();
				break;
			}
			
			case "expense tab":{
				OperationMethods.expenseTab();
				break;
			}
			
			case "logout":{
				OperationMethods.logOut();
				break;
			}
			
			case "close app":{
				OperationMethods.closeApp();
				break;
			}
			
			case "openapp":{
				AndroidTestBase.setUp();
				break;
			}
			
			case "delete row":{
				OperationMethods.deleteRow(values[1]);
				break;
			}
			
			case "close both activity":{
				DisplayDate.expense_IncomeClose().click();
				break;
			}
		}
	}
}