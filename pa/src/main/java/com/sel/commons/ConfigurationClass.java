package com.sel.commons;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class ConfigurationClass {
	public static Properties  properties = new Properties();
	
	public static String username;
	public static String password;
	public static String URL;
	public static String Browser;
	public static WebDriver driver;
	public static FileInputStream fi;
	public static String filepath;
	
	static{
		
		try{
			
		if(System.getProperty("EnvType") == null){
			filepath = "src/test/resources/QA-Details.properties";
			fi = new FileInputStream(System.getProperty("user.dir") + "/" + filepath);
			properties.load(fi);
			Reporter.log("in properties QA- Environment", true);
			
			}
		else if(System.getProperty("EnvType") == "QA"){
			/*filepath = "src/test/resources/QA-Details.properties";
			fi = new FileInputStream(System.getProperty("user.dir") + "/" + filepath);*/
			fi = new FileInputStream(System.getProperty("C:\\Users\\rahul\\workspace1\\shopping\\src\\test\\resorces\\QADetails.properties"));

			properties.load(fi);
			Reporter.log("in QA loop properties", true);
			
			
		} else if(System.getProperty("EnvType") == "Dev"){
			//filepath = "src/test/resources/Dev-Details.properties";
			//fi = new FileInputStream(System.getProperty("user.dir") + "/" + filepath);
			fi = new FileInputStream(System.getProperty("C:\\Users\\rahul\\workspace1\\shopping\\src\\test\\resorces\\DevDetails.properties"));
			
			properties.load(fi);
			Reporter.log("in Dev loop properties", true);
			
			
		}
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	URL = properties.getProperty("url");
	
	Browser = properties.getProperty("Browser");
	username = properties.getProperty("username");
	password = properties.getProperty("password");
	}

	public static WebDriver browser() {
		Reporter.log("Browser loop", true);
		if(Browser.equalsIgnoreCase("firefox")){
			if(driver== null){
				driver = new FirefoxDriver();
			}
			else{
				return driver;	
			}
		} else if(Browser.equalsIgnoreCase("chrome")){
		if(driver ==null){
				Reporter.log("Chrome Browser loop start", true);

				filepath = "src/test/resources/chromedriver.exe";
				filepath = System.getProperty("user.dir") + "/" + filepath;
				File file = new File(filepath);
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			    driver = new ChromeDriver();
			    //.manage().window().maximize();
				Reporter.log("Chrome Browser loop", true);
			}
			else{
				return driver;
			} 
			}
		else if(Browser.equalsIgnoreCase("ie")){
			if(driver==null){
				filepath = "C:\\Users\\rahul\\Desktop\\Selenium\\chromedriver.exe";
				filepath = System.getProperty("C:\\Users\\rahul\\Desktop\\Selenium\\chromedriver.exe");
				File file = new File(filepath);
				System.setProperty("Webdriver.IEexplorer.driver",file.getAbsolutePath());
				driver = new InternetExplorerDriver();
				
			}
			else {
				return driver;
				
			}
			
		}
		return driver;		
		}
	
	
	/*public static String readProperty(String propName){
		return properties.getProperty(propName);
	}*/
	public static String LoginURL(){
		Reporter.log("log HomePage" + URL, true);
		return URL;
	}

	public static String LoginUsername(){
		return username;
		
	}
	
	public static String LoginPassword(){
		return password;
		
	}
}

			
	
	
	
		
	
	
	
	


