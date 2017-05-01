package autopract.shopping;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.common.Configuration;

import autopract.shoppingpages.WomenPage;

public class SmokeTest {
	
	
	public  WebDriver driver;
	
	public WomenPage wpage;
	
	
	public SmokeTest(){
		
		System.setProperty("EnvType", "QA");
		driver = Configuration.browser();
		driver.manage().window().maximize();
		driver.get(Configuration.LoginURL());
		wpage = new WomenPage();
		
		
	}
	
	@Test(dataProvider="Test")
	public  void Women() throws InterruptedException{
		wpage.womentab();
		wpage.casualDresss();
		}
	@AfterMethod
	public void closebrowser(){
		driver.close();
	}

	
	}
