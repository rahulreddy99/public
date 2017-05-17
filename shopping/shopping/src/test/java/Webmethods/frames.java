package Webmethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {
	public static String filepath;
	public static  WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		filepath = "src/test/resources/chromedriver.exe";
		filepath = System.getProperty("user.dir") + "/" + filepath;
		File file = new File(filepath);
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	    driver = new ChromeDriver();
	    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_frame_cols");
	    //driver.findElements(By.tagName("frameset")).size();
	    System.out.println(driver.findElements(By.tagName("iframe")).size());
	    driver.switchTo().frame(0);
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(1);
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(2);
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(3);
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//button[class='w3-button w3-bar-item w3-green w3-hover-white w3-hover-text-green']"));
	    
	   // System.out.println(driver.findElements(By.tagName("iframes")).size());
	    
	    //System.out.println(driver.findElements(By.tagName("frame")).size());
	    //driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_a.htm']")));
	    /*driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_b.htm']")));
	    driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_c.htm']")));*/
	    /*driver.switchTo().frame(0);
	    driver.switchTo().frame(1);
	    driver.switchTo().frame(2);*/
	    //driver.switchTo().defaultContent();
	   
	   
	    
	    

	}

}
