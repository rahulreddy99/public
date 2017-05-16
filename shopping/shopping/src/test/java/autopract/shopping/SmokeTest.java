package autopract.shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.common.Common;
import com.common.Configuration;
import com.common.ReadExcel;

import autopract.shoppingpages.WomenPage;

public class SmokeTest {
	
	
	public  WebDriver driver;
	
	public WomenPage wpage;
	public Common cm;
	public ReadExcel re;
	
	
	
	public SmokeTest(){
		
		System.setProperty("EnvType", "QA");
		driver = Configuration.browser();
		driver.manage().window().maximize();
		driver.get(Configuration.LoginURL());
		wpage = new WomenPage();
		
		
	}
	
	@Test
	public  void Women() throws Throwable {

		wpage.sclick();
		/*cm.explicitwait((By.xpath("//input[@name='search_query']")), 7);*/
		Thread.sleep(3000);
		cm.Actionclass(driver.findElement(By.xpath("//a[text()='Women']")));
		/*wpage.search("Tab");
		wpage.submit();*/
	//page.casualDresss();
		}
	@AfterMethod
	public void closebrowser(){
		driver.close();
	}

	
	}
