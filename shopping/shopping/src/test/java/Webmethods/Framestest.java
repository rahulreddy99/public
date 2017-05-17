package Webmethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framestest {
	public static String filepath;
	public static  WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		filepath = "src/test/resources/chromedriver.exe";
		filepath = System.getProperty("user.dir") + "/" + filepath;
		File file = new File(filepath);
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	    driver = new ChromeDriver();
	    driver.get("http://jqueryui.com/droppable/");
	    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
	    //driver.findElement(By.id("draggable")).click();
	    Actions ac= new Actions(driver);
	    ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
	    
	    

	}

}
