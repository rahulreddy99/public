package autopract.shoppingpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.Configuration;

public class WomenPage {
	
	public  WebDriver driver = Configuration.browser();
	
	
	@FindBy(linkText = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category']")
	WebElement wtab;
	@FindBy (xpath= "//a[text()='Casual Dresses']")
	WebElement casutab;
	@FindBy (xpath = "//input[@name='search_query']")
	WebElement searchtab;
	@FindBy(name="submit_search")
	WebElement submit;
	
	
	
	
	
	
	public WomenPage() {
		PageFactory.initElements(driver, this);
		
		}
	public void casualDresss(){
		casutab.click();
	}
	public void womentab(){
		wtab.click();
	
		
	}
	public void search(String S) {
		searchtab.sendKeys(S);
	}
	
	public void sclick(){
		searchtab.click();
	}
	public void submit(){
		submit.click();
	}
	
	

}
