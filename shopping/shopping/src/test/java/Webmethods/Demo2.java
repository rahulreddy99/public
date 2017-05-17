package Webmethods;



	import java.io.File;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class Demo2 {

		public static String filepath ;
		//public static String driver;
		public static  WebDriver driver;
		

		
		public static void main(String[] arga){
			filepath = "src/test/resources/chromedriver.exe";
			filepath = System.getProperty("user.dir") + "/" + filepath;
			File file = new File(filepath);
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		    driver = new ChromeDriver();
	  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
	  WebDriverWait wait=new WebDriverWait(driver,15);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='H-destination']")));
	  //System.out.println(wait.until(ExpectedConditions.elementToBeSelected(By.id("H-destination"))));
	  driver.findElement(By.xpath(".//*[@id='H-destination']")).clear();
	  driver.findElement(By.xpath(".//*[@id='H-destination']")).sendKeys("nyc");
	  driver.findElement(By.xpath(".//*[@id='H-destination']")).sendKeys(Keys.TAB);
	  driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//a[contains(@href,'Newark-Hotels-DoubleTree-By-Hilton-Hotel')]")).click();
	  
	  
	  
	 }

	}

