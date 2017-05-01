package com.sel.pa;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sel.commons.Commonclass;
import com.sel.commons.ConfigurationClass;
import com.sel.pages.HomePage;
import com.sel.pages.LoginPage;
import com.sel.pages.TourPage;

public class SmokeTest {
	public WebDriver driver;
	public HomePage home;
	public LoginPage login;
	public TourPage tour;
	public Commonclass commonclass;
	
	
	public  SmokeTest() {
		//System.setProperty("EnvType", "Dev");
		System.setProperty("EnvType", "QA");
		driver = ConfigurationClass.browser();
		driver.get(ConfigurationClass.LoginURL());
		//driver.manage().window().maximize();
			
		//Reporter.log("Dev Environment selected");
		home = new HomePage();
		tour = new TourPage();
		login = new LoginPage();
		commonclass = new Commonclass();
		}
	
	
	
	@BeforeSuite
	public void beforesuite(){
		home.homepage();
		
		commonclass.takescrrenshot();
	}
	
	
	@Test(priority =1, groups="SmokeTest")
	public void user() throws IOException{
		
		tour.Tourprocess();
		commonclass.Explictywait(By.className("select2-input"), 5);
		tour.searchname1("Ban");
		commonclass.Explictywait(By.xpath(".//*[@id='select2-drop']/ul/li/ul/li/div"), 3);
		//commonclass.Implicitywait(2);
		tour.aftersearchclick();
		tour.date();
		tour.selectdt();
		//tour.selctadults();
		tour.selectadultno();
		tour.tourtypeselect();
		commonclass.Explictywait(By.xpath(".//*[@id='tourtype']/option[11]"), 5);
		tour.optiontype();
		commonclass.Explictywait(By.xpath("html/body/div[5]/div[2]/div/div[2]/form/div[5]/div/button"), 2);
		tour.searchclk();
		commonclass.takescrrenshot();
		tour.detailsclick();
		tour.bookingadults();
		tour.booknow();
		//commonclass.takescrrenshot();
		commonclass.Explictywait(By.xpath(".//*[@id='bookingdetails']/div[2]/table/tbody/tr[1]/td[4]/label/span/span[1]"), 5);
		commonclass.Actionsclass(driver.findElement(By.xpath(".//*[@id='bookingdetails']/div[2]/table/tbody/tr[1]/td[4]/label/span/span[1]")), driver.findElement(By.xpath(".//*[@id='bookingdetails']/div[2]/table/tbody/tr[1]/td[4]/label/span/span[2]")));
		tour.confirmbknow();
		commonclass.takescrrenshot();
		
		System.out.println("Successful");
		
		//driver.quit();
		}
/*	@Test(priority = 2, groups ="SmokeTest")
	public void test2(){
		tour.Tourprocess();
		commonclass.Explictywait(By.className("select2-input"), 5);
		tour.searchname1("Ban");
		commonclass.Explictywait(By.xpath(".//*[@id='select2-drop']/ul/li/ul/li/div"), 3);
		//commonclass.Implicitywait(2);
		tour.aftersearchclick();
		tour.date();
		tour.selectdt();
		//tour.selctadults();
		tour.selectadultno();
		tour.tourtypeselect();
		commonclass.Explictywait(By.xpath(".//*[@id='tourtype']/option[11]"), 3);
		tour.optiontype();
		commonclass.Explictywait(By.xpath("html/body/div[5]/div[2]/div/div[2]/form/div[5]/div/button"), 2);
		tour.searchclk();
		tour.detailsclick();
		tour.bookingadults();
		tour.booknow();
		commonclass.Actionsclass(driver.findElement(By.xpath(".//*[@id='bookingdetails']/div[2]/table/tbody/tr[1]/td[4]/label/span/span[1]")), driver.findElement(By.xpath(".//*[@id='bookingdetails']/div[2]/table/tbody/tr[1]/td[4]/label/span/span[2]")));
		tour.confirmbknow();
		
		
	}*/
	@AfterSuite
	   public void aftersuite(){
			commonclass.takescrrenshot();
		   driver.close();
		   
	   }
	
}
   
