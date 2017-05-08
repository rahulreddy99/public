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
	WebElement userna;
	@FindBy(id="passwd")
	WebElement passwrd;
	@FindBy(id ="SubmitLogin")
	WebElement submit;
	@FindBy(id ="email_create")
	WebElement emailid;
	@FindBy(id = "SubmitCreate")
	WebElement submitemail;
	@FindBy(id ="id_gender1")
	WebElement Gender;
	@FindBy(xpath =".//*[@id='customer_firstname']")
	WebElement Finame;
	@FindBy(xpath =".//*[@id='customer_lastname']")
	WebElement Liname;
	
	
	
	
	
	
	
	
	
	public Login(){
		PageFactory.initElements(driver, this);
	}
	
	public void signin(){
		signin.click();
	}
	
	public void username(String Usern){
		userna.sendKeys(Usern);
		
	}
	public void password(String Pwd){
		passwrd.sendKeys(Pwd);
	}

	public void Submitbutton(){
		submit.click();
	}
	public void enteremailid(String E){
		emailid.sendKeys(E);
	}
	public void submitemailid(){
		submitemail.click();
	}
	public void gender1(){
		Gender.click();
	}
	public void Fistname(String Fn){
		Finame.sendKeys(Fn);
	}
	public void Lastname(String Ln){
		Liname.sendKeys(Ln);
	}


	
	



}
