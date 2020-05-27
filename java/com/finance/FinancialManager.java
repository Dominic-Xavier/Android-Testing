package com.finance;

import androidMain.AndroidTestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.Xls.ExcelConfig;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FinancialManager extends AndroidTestBase {
	
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet_name;
	private static FileInputStream fis;

	public static void main(String[] args) throws InterruptedException, IOException {
		try {
			AndroidTestBase.setUp();
			fis = new FileInputStream("./src/main/java/Exce/Test_Case.xlsx");
			wb = new XSSFWorkbook(fis);
			sheet_name = wb.getSheet("Financial apk");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error occured:"+e.toString());
		}
	}
}
