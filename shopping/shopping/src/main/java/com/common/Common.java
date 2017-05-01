package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	public static WebDriver driver = Configuration.browser();
	
	public void implivitywait(){
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
	public void explicitwait(int i, By by){
		WebDriverWait wait = new WebDriverWait(driver,5);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
		
	}
	
	
	

}
