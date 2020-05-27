package operation;

import org.openqa.selenium.Alert;

import com.elementDetails.DatabaseElements;
import com.elementDetails.DisplayDate;
import com.elementDetails.LoginDetails;
import com.elementDetails.NavigationView;
import com.elementDetails.Register;
import com.elementDetails.UserAccountDetails;

public class AllOperations {
	
	public static void operation(String Keyword,String Data) throws InterruptedException {
		
		String values[] = Data.split(";;");
		
		switch(Keyword.toLowerCase()) {
		
			case "register":{
				Register.username().sendKeys(values[0]);
				Register.password().sendKeys(values[1]);
				Register.rePassword().sendKeys(values[2]);
				Register.mobileNumber().sendKeys(values[3]);
				break;
			}
			
			case "login":{
				LoginDetails.userName().sendKeys(values[0]);
				LoginDetails.passWord().sendKeys(values[1]);
				LoginDetails.loginButton().click();
				break;
			}
			
			case "select option":{
				DatabaseElements.optionSelect().click();
				if(values[0].equals("Expense"))
					DatabaseElements.option_Expense().click();
				else
					DatabaseElements.option_Income().click();
				break;
			}
			
			case "insert data":{
				int noOfRows = Integer.parseInt(values[0]);
				for(int i=0;i<noOfRows;i++)
					DatabaseElements.addRow().click();
				for(int i=1;i<values.length;i++) {
					DatabaseElements.description(i).sendKeys(values[i]);
					DatabaseElements.amount(i).sendKeys(values[i]);
				}
				break;
			}
			
			//have to write code for handling alerts
			case "display":{ 
				DisplayDate.startDate().sendKeys(values[0]);
				DisplayDate.endDate().sendKeys(values[1]);
				DisplayDate.okButton().click();
				break;
			}
			
			case "Close display activity":{
				Thread.sleep(5000);
				DisplayDate.close();
				break;
			}
			
			case "my account":{
				NavigationView.navigationDrawer().click();
				NavigationView.myAccount().click();
				Thread.sleep(3000);
				UserAccountDetails.Close().click();
				break;
			}
			
			case "expense tab":{
				NavigationView.totalExpense().click();
				Thread.sleep(3000);
				NavigationView.totalExpenseIncomeClose().click();
				break;
			}
			
			case "logout":{
				NavigationView.logout().click();
				AlertHandle.alertAccept();
			}
		}
	}
}