package autopract.shoppingpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.Configuration;

public class WomenPage {
	
	public  WebDriver driver = Configuration.browser();
	
	
	@FindBy(linkText = "Women")
	WebElement wtab;
	@FindBy (xpath= ".//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[1]/a")
	WebElement casutab;
	
	
	
	
	
	public WomenPage() {
		PageFactory.initElements(driver, this);
		
		}
	public void casualDresss(){
		casutab.click();
	}
	public void womentab(){
		wtab.click();
		
	}
	
	
	
	

}
