package com.sel.commons;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel {
	
	
	
	@DataProvider (name ="Regression")
	public void readexcel() throws BiffException, IOException {
		
		Cell Cell = null;
		 String str = null;
		
		 WebDriver driver;
		
		 String st = System.getProperty("user.dir" ) + "\\src\\test\\resources\\Results.xls";
		 
		 System.out.println("stringvalue" + st);
		/* File fs = new File("C:\\Users\\rahul\\workspace1\\pa\\src\\test\\resources\\Results.xls");
		 FileInputStream fi = new FileInputStream(fs);*/
		 
		 //XSSFWorkbook xw = new XSSFWorkbook(fi);
		 
		 Workbook wb = Workbook.getWorkbook(new File(st));
		 
		 Sheet sh = wb.getSheet("Sheet1");
		 System.out.println("sheet gata:"+ sh);
		 
		/* Cell cell1 = sh.getCell(0, 0);
		 System.out.println("cell1:" +cell1.getContents());
		 Cell cell2 = sh.getCell(1, 0);
		 System.out.println("cell2:" +cell2.getContents());*/
		 int rows = sh.getRows();
		 int cols = sh.getColumns();
		 
	/*	 Cell cell1 = sh.getCell(0, 4);
		 System.out.println("first row data"  + cell1.getContents());*/
		 
		
		 for(int i=0;i<rows;i++){
			 for(int j=0; j<cols;j++){
				 Cell data = sh.getCell(j, i);
				 System.out.println("all the file" + data.getContents());
				 
				//ystem.out.println("No. of rows:" + i+"no. of cols:" + j + "is "+ data.getContents() +"\t");
			 }
		 }
		 
		 
		 
		 }
		 
	public static void main(String[] args) throws JXLException, IOException{
		
		Excel ex = new Excel();
		ex.readexcel();
		

		
		
		
	}

}
