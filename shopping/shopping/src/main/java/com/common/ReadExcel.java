package com.common;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.util.Strings;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ReadExcel {
	
	public WebDriver driver;
	
	@DataProvider(name = "testdata")
	
	public  Object [] [] Rexcel() throws BiffException, IOException {
		File src = new File("C:\\Users\\rahul\\workspace1\\shopping\\src\\test\\resorces\\shopping1.xls");
		
		FileInputStream sr = new FileInputStream(src);
		System.out.println(sr);
		Workbook wb = Workbook.getWorkbook(sr);
		Sheet sh = wb.getSheet(1);
		
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



