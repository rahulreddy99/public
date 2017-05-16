package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	public static WebDriver driver = Configuration.browser();
	
	public void implivitywait(int i){
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
	public void explicitwait(By by, int i){
		WebDriverWait wait = new WebDriverWait(driver,5);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
		
	}
	
	
	
/*	
	public void Actionclass(WebElement ac, By by){ 
		Actions action = new Actions(driver);
		
		action.moveToElement(ac).moveToElement((WebElement) by).click().build().perform();
	
		
		
		
	}*/
	public void Actionclass(WebElement wb){
		Actions action = new Actions(driver);
		action.moveToElement(wb).build().perform();
	}

	public void Actionclass1(WebElement ac){
		Actions action = new Actions(driver);
		
		action.doubleClick(ac).build().perform();
		
		
		
	}
	
	
	

}
