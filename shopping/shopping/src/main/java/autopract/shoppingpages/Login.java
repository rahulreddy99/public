package autopract.shoppingpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.Configuration;

public class Login {
	
	public WebDriver driver = Configuration.browser();
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=my-account']")
	WebElement signin;
	
	@FindBy(id ="email")
	WebElement username;
	@FindBy(id="passwd")
	WebElement passwrd;
	
	
	
	
	
	public Login(){
		PageFactory.initElements(driver, this);
	}
	
	public void signin(){
		signin.click();
	}
	
	public void username(String usern){
		username.sendKeys(usern);
		
	}
	public void password(String pwd){
		passwrd.sendKeys(pwd);
	}



	
	



}
