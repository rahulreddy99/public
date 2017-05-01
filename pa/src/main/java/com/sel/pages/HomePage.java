package com.sel.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sel.commons.ConfigurationClass;
import com.sel.commons.ExcelReader;

public class HomePage {
	
	public WebDriver driver = ConfigurationClass.browser();
	public ExcelReader read;
	
	
	@FindBy (className="dropdown-toggle")
	public WebElement home;
	
	public HomePage(){
		
	PageFactory.initElements(driver, this);
	}
	
	public void homepage(){
	
		home.click();
	}
	
	

	
	


	

}
