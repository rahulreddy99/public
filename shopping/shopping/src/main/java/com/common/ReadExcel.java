package com.common;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ReadExcel {
	
	public WebDriver driver;
	
	@DataProvider(name = "Test")
	
	public  Object [] [] Rexcel() throws BiffException, IOException {
		File src = new File("C:\\Users\\rahul\\workspace1\\shopping\\src\\test\\resorces\\Results.xls");
		
		FileInputStream sr = new FileInputStream(src);
		System.out.println(sr);
		Workbook wb = Workbook.getWorkbook(sr);
		Sheet sh = wb.getSheet(0);
		
		int rows = sh.getRows();
		int cols = sh.getColumns();
		
		String inputdata [] [] = new String [rows] [cols];
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				
			Cell c = sh.getCell(j, i);
			 System.out.println(c.getContents());
			/* ArrayList list = new ArrayList();
			 list.add(c.getContents());
			 System.out.println("output add  "   + c);*/
			}
			
		}
		return inputdata;
		
		
		
		
		
		
		
		
		
	
		
		
	
				


			
			
			
			
		
		}
	}


/*	Workbook wb = Workbook.getWorkbook(f);
Sheet sh = wb.getSheet(0);
int rows = sh.getRows();
int Cols = sh.getColumns();
System.out.println(rows);

for(int i=0; i<rows; i++){
	for(int j=0; j<Cols; j++){
		//System.out.println("value of     :"  + );
		Cell c = sh.getCell(j, i);
		inputsheet [i] [j] = c.getContents();
		
		
	}
}*/

