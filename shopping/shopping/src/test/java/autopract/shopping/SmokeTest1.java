package autopract.shopping;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.common.Common;
import com.common.Configuration;
import com.common.ReadExcel;

import autopract.shoppingpages.Login;
import autopract.shoppingpages.WomenPage;
import jxl.read.biff.BiffException;

public class SmokeTest1 {
	
	public WebDriver driver= Configuration.browser();
	
	public WomenPage wpage;
	public Login ln;
	public ReadExcel re;
	public Common cm;
	
	
public SmokeTest1(){
		
		System.setProperty("EnvType", "QA");
		driver = Configuration.browser();
		driver.manage().window().maximize();
		driver.get(Configuration.LoginURL());
		wpage = new WomenPage();
		cm = new Common();
		ln = new Login();
		re = new ReadExcel();
		
		
		
	}
	
	@Test(dataProvider = "Test")
	public void signinpage(String un, String pwd) throws BiffException, IOException{
		
		ln.signin();
		//ln.username(re.Rexcel());
		
		
		
	}
	

}
