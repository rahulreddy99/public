package autopract.shopping;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.common.Common;
import com.common.Configuration;
import com.common.ReadExcel;

import autopract.shoppingpages.Login;
import autopract.shoppingpages.WomenPage;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {
	
public WebDriver driver= Configuration.browser();

public WomenPage wpage;
public Login ln;
public ReadExcel re;
public Common cm;


public DataDriven(){
	
	System.setProperty("EnvType", "QA");
	driver = Configuration.browser();
	driver.manage().window().maximize();
	driver.get(Configuration.LoginURL());
	wpage = new WomenPage();
	cm = new Common();
	ln = new Login();
	re = new ReadExcel();
	
	
	
}


@Test (dataProvider = "testdata")
public void adminLogin(String E, String Fn, String Ln) throws InterruptedException, IOException{
//driver.get("http://www.gcrit.com/build3/admin/");
	
	ln.signin();
/*	ln.username(Usern);
	ln.password(Pwd);
	ln.Submitbutton();
	cm.explicitwait(By.linkText("Women"), 5);
	Thread.sleep(3000);
	//cm.explicitwait(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[1]/a"), 10);
	wpage.womentab();
	wpage.addingtocart();*/
	
	ln.enteremailid(E);
	ln.submitemailid();
	Thread.sleep(2000);
	ln.gender1();
	//Thread.sleep(2000);
	cm.explicitwait(By.xpath(".//*[@id='customer_firstname']"), 10);
	ln.Fistname(Fn);
	cm.explicitwait(By.xpath(".//*[@id='customer_lastname']"), 10);
	ln.Lastname(Ln);
	
	
	
}
@AfterMethod
public void closeBrowser(){
driver.close(); 
}
 
@DataProvider (name="testdata")
public Object [] [] readExcel() throws BiffException, IOException {

File f = new File ("C:\\Users\\rahul\\pa\\shopping\\shopping\\src\\test\\resources\\shopping1.xls");
Workbook wb = Workbook.getWorkbook(f);
Sheet s = wb.getSheet("Sheet2");

int rows = s.getRows();
int columns = s.getColumns();
//System.out.println(rows);
//System.out.println(columns);

String inputData [] [] = new String [rows] [columns];

for (int i = 0; i <rows; i++){
for (int j = 0 ; j <columns; j++){
Cell c = s.getCell(j,i);
inputData [i][j] = c.getContents();
//System.out.println(inputData[i][j]);
}
}
return inputData;
}
}
