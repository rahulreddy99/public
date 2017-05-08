package autopract.shoppingpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.Configuration;

public class WomenPage {
	
	public  WebDriver driver = Configuration.browser();
	
	
	@FindBy(xpath =".//*[@id='block_top_menu']/ul/li[1]/a")
	WebElement wtab;
	@FindBy (xpath= "//a[text()='Casual Dresses']")
	WebElement casutab;
	@FindBy (xpath = "//input[@name='search_query']")
	WebElement searchtab;
	@FindBy(name="submit_search")
	WebElement submit;
	@FindBy(xpath =".//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement addtocart;
	
	
	
	
	
	
	
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
	
	public void addingtocart(){
		addtocart.click();
	}
	
	

}
