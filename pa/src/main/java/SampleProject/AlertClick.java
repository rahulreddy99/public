package SampleProject;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class AlertClick {
	public static String filepath;
	public static WebDriver driver;
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		filepath = "src/test/resources/chromedriver.exe";
		filepath = System.getProperty("user.dir") + "/" + filepath;
		File file = new File(filepath);
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	    driver = new ChromeDriver();
	    
	    driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	   /* JavaScriptExecutor js = (JavaScriptExecutor)driver;
	    ((RemoteWebDriver) js).executeScript("window.scrollBy(0,250)", "");*/
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)", "");
	    //driver.findElement(By.name("sa")).click();
	    //driver.findElement(By.linkText("Conformation Alert")).click();
	    
	    driver.findElement(By.cssSelector("input[value='Confirmation Alert']")).click();
	    driver.switchTo().alert().accept();

	}

}
