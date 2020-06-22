package com.finance;

import androidMain.AndroidTestBase;
import com.operation.AllOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FinancialManager extends AndroidTestBase {
	
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet_name;
	private static FileInputStream fis;

	public static void main(String[] args) throws InterruptedException, IOException {
		try {
			AllOperations.performOperation("OpenApp", "");
			fis = new FileInputStream("./src/main/java/Excel/Test_Case.xlsx");
			wb = new XSSFWorkbook(fis);
			sheet_name = wb.getSheet("Financial apk");
			int column=0;
			int row = sheet_name.getPhysicalNumberOfRows();
			for(int i=1;i<row;i++) {
				column = sheet_name.getRow(i).getPhysicalNumberOfCells();
				for(int j=1;j<column;j++) {
					String Keyword = sheet_name.getRow(i).getCell(j).getStringCellValue();
					String data = sheet_name.getRow(i).getCell(++j).getStringCellValue();
					System.out.println("Keyword:"+Keyword);
					System.out.println("Data:"+data);
					AllOperations.performOperation(Keyword, data);
				}
			}
			System.out.println("TotalNoOfRow:"+row);
			System.out.println("TotalNoOfColumn:"+column);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error occured:"+e.toString());
		}
		
		System.out.println("All Menthods executed successfully");
	}
}
