package Webmethods;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class webmethod {
	
	public static String filepath ;
	//public static String driver;
	public WebDriver driver;
	

	
	public void driverpath() throws InterruptedException{
		filepath = "src/test/resources/chromedriver.exe";
		filepath = System.getProperty("user.dir") + "/" + filepath;
		File file = new File(filepath);
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	    driver = new ChromeDriver();
	    driver.get("https://www.makemytrip.com");
	    System.out.println("clicking the roundrip");
	    driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[2]/label")).click();
	    System.out.println("before clicking mutlicity");
	    Thread.sleep(5000);
	    //driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed();
	    Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
	   
	    driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed();
	    System.out.println(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
	    driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[3]/label")).click();
	    Thread.sleep(5000);
	    Assert.assertFalse(driver.findElement(By.id("hp-widget__return")).isDisplayed());
	    driver.findElement(By.id("hp-widget__return")).isDisplayed();
	    System.out.println(	    driver.findElement(By.id("hp-widget__return")).isDisplayed());
	    driver.close();
	    
	}

	@Test
	public static void makemytip() throws InterruptedException {
		// TODO Auto-generated method stub
		webmethod wb = new webmethod();
		
		
		wb.driverpath();
		
		
	}

}
