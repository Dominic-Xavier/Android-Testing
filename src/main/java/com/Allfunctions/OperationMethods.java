package com.Allfunctions;

import com.elementDetails.DatabaseElements;
import com.elementDetails.DisplayDate;
import com.elementDetails.LoginDetails;
import com.elementDetails.NavigationView;
import com.elementDetails.Register;
import com.elementDetails.UserAccountDetails;

import androidMain.AndroidTestBase;

public class OperationMethods {
	
	public static void register(String UserName,String Password,String Repassword, String MobileNumber) {
		LoginDetails.registerButton().click();
		Register.username().sendKeys(UserName);
		Register.password().sendKeys(Password);
		Register.rePassword().sendKeys(Repassword);
		AndroidTestBase.backButtonClick();
		Register.mobileNumber().sendKeys(MobileNumber);
		AndroidTestBase.backButtonClick();
		Register.registerButton().click();
		if(AndroidTestBase.checkIfAlertIsPresent()) 
			AndroidTestBase.backButtonClick();
	}
	
	public static void login(String UserName,String Password) {
		LoginDetails.userName().sendKeys(UserName);
		LoginDetails.passWord().sendKeys(Password);
		AndroidTestBase.backButtonClick();
		LoginDetails.loginButton().click();
		if(AndroidTestBase.checkIfAlertIsPresent()) {
			LoginDetails.closeButton().click();
			AndroidTestBase.alertAccept();
		}
	}
	
	public static void selectOption(String option) {
		DatabaseElements.optionSelect().click();
		if(option.equals("Expense"))
			DatabaseElements.option_Expense().click();
		else
			DatabaseElements.option_Income().click();
	}
	
	public static void insertData(String numberOfRows,String values[]) throws InterruptedException {
		int a = 1;
		int noOfRows = Integer.parseInt(numberOfRows);
		for(int addrow=0;addrow<noOfRows;addrow++) 
			DatabaseElements.addRow().click();
		for(int i=1;i<=noOfRows;i++) {
			for(int j=1;j<2;j++) {
				try {
					System.out.println("Table:"+i+","+"EditText:"+j);
					DatabaseElements.description(i,j).sendKeys(values[a]);
					System.out.println("Des:"+values[a]);
					DatabaseElements.amount(i,++j).sendKeys(values[++a]);
					System.out.println("Table:"+i+","+"EditText:"+j);
					System.out.println("Amt"+values[a]);
					a++;
				}
				catch (ArrayIndexOutOfBoundsException e) {
					break;
				}
			}
		}
		DatabaseElements.saveData().click();
		AndroidTestBase.alertAccept();
	}
	
	public static void logOut() {
		AndroidTestBase.slideBar();
		NavigationView.logout().click();
		AndroidTestBase.alertAccept();
	}
	
	public static void display(String start_date,String end_date,String keyword) throws InterruptedException {
		DatabaseElements.displayButton().click();
		DisplayDate.startDate().sendKeys(start_date);
		DisplayDate.endDate().sendKeys(end_date);
		if(keyword.equals("Expense")) {
			DisplayDate.expenseCheckBox().click();
		}
		else if(keyword.equals("Income"))
			DisplayDate.incomeCheckBox().click();
		else if(keyword.equals("Both")) {
			DisplayDate.expenseCheckBox().click();
			DisplayDate.incomeCheckBox().click();
		}
		Thread.sleep(2000);
		DisplayDate.okButton().click();
	}
	
	public static void deleteRow(String no_OfRows) {
		int noOfRows = Integer.parseInt(no_OfRows);
		for(int i=0;i<noOfRows;i++)
		DatabaseElements.deleteRow().click();
	}
	
	public static void closeApp() {
		LoginDetails.closeButton().click();
		AndroidTestBase.alertAccept();
	}
	
	public static void expenseTab() throws InterruptedException {
		AndroidTestBase.slideBar();
		NavigationView.totalExpense().click();
		Thread.sleep(3000);
		NavigationView.totalExpenseIncomeClose().click();
	}
	
	public static void myAccount() throws InterruptedException {
		AndroidTestBase.slideBar();
		NavigationView.myAccount().click();
		Thread.sleep(3000);
		UserAccountDetails.Close().click();
	}
}
