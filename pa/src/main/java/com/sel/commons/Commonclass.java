package com.sel.commons;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commonclass {
	
	public WebDriver driver = ConfigurationClass.browser();
	
	public void Implicitywait(int arg1){
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	public void Explictywait(By by , int i){
		WebDriverWait wait = new WebDriverWait(driver,5);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
		
	}
	public void Actionsclass(WebElement src, WebElement des){
		Actions action = new Actions(driver);
		action.dragAndDrop(src, des).build().perform();
	}
	public void takescrrenshot() {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("c:\\phptravels\\screenshot\\" +currentDateTime()+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String currentDateTime() {
	    DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	    Calendar cal = Calendar.getInstance();
	    String cal1 = dateFormat.format(cal.getTime());
	    return cal1;
	}
}
