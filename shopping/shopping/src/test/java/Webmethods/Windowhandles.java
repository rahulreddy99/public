package Webmethods;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandles {
	public static String filepath ;
	//public static String driver;
	public WebDriver driver;
	

	
	public void driverpath() throws InterruptedException{
		filepath = "src/test/resources/chromedriver.exe";
		filepath = System.getProperty("user.dir") + "/" + filepath;
		File file = new File(filepath);
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	    driver = new ChromeDriver();
	    driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath(".//*[@id='button1']")).click();
	    //Thread.sleep(3000);
	    Set<String> sd = driver.getWindowHandles();
	    System.out.println(sd.size());
	    Iterator<String> it = sd.iterator();
	    /*while(it.hasNext()){
	    	System.out.println(it.next());
	    }
	    System.out.println(it);*/
	    String Parent = it.next();
	    String Child = it.next();
	    driver.switchTo().window(Child); //switching back to child
	    System.out.println(driver.getTitle());
	    driver.switchTo().window(Parent); //switching back to parent
	    System.out.println(driver.getTitle()); // to get the title of the parent
	    driver.close();
	    
	    

	}
	
	@Test
	
	public static void excute() throws InterruptedException{
		Windowhandles ws = new Windowhandles();
		ws.driverpath();
	}
}
