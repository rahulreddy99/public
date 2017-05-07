import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	
	public static WebDriver driver;
	

	public Frames() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rahul\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		
		}
	
	
	@Test
	
	public void iframes(){
	
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_frame_cols");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("html/body/h3/text()"));
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("html/body/h3")).click();
		driver.switchTo().frame("frame_c");
		driver.findElement(By.linkText("frame_c")).click();
		//driver.switchTo().frame(2);
		driver.findElement(By.xpath("html/body/div[4]/div/button[4]"));
	
		
		
		
	}

}
