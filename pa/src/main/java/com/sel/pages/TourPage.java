package com.sel.pages;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import org.testng.annotations.Test;

import com.sel.commons.ConfigurationClass;


public class TourPage {
	public WebDriver driver = ConfigurationClass.browser();
	
	@FindBy (linkText="Tours")
	 WebElement tour;
	@FindBy (className ="select2-input")
	 WebElement searchname;
	@FindBy (className ="select2-chosen")
	WebElement sclick;
	@FindBy (xpath =".//*[@id='select2-drop']/ul/li/ul/li/div")
	WebElement aftersclick;
	@FindBy (xpath =".//*[@id='tchkin']/div/input")
	WebElement dt;
	@FindBy(xpath ="html/body/div[10]/div[1]/table/tbody/tr[5]/td[7]")
	WebElement selectdate;
	@FindBy (xpath = "//tr[4]/td[6]")
	WebElement listofdates;
	@FindBy (xpath =".//*[@id='adults']")
	WebElement select;
	@FindBy (xpath =".//*[@id='adults']/option[3]")
	WebElement seladult;
	@FindBy (id ="tourtype")
	WebElement tourtype;
	@FindBy (xpath =".//*[@id='tourtype']/option[11]")
	WebElement optiontourtype;
	@FindBy (xpath= "html/body/div[5]/div[2]/div/div[2]/form/div[5]/div/button")
	WebElement searchclick;
	@FindBy(xpath ="html/body/div[5]/div[3]/div/table/tbody/tr/td/div/div[2]/div/div[1]/a/button")
	WebElement details;
	@FindBy (xpath =".//*[@id='selectedAdults']/option[2]")
	WebElement bkadult;
	@FindBy(xpath = ".//*[@id='OVERVIEW']/div/div[2]/div[2]/div[2]/div/form/div[4]/button")
	WebElement bknw;
	@FindBy (xpath ="html/body/div[3]/div/div/div[1]/div/div[2]/div[5]/button")
	WebElement conbknw;
	
	
	
	public TourPage() {
	
		PageFactory.initElements(driver, this);
		
		}
	
	public void searchname1(String searchstring){
		searchname.sendKeys(searchstring);
	}
	public void aftersearchclick(){
		aftersclick.click();
	}
	public void date(){
		dt.click();
		
	}
	public void selectdt(){
		selectdate.click();
	}
	public void selctadults(){
		select.clear();
	}
	public void selectadultno(){
		seladult.click();
	}
	public void tourtypeselect(){
		tourtype.click();
		Reporter.log("selected tour", true);
	}
	public void optiontype(){
		optiontourtype.click();
		Reporter.log("optiontype", true);
	}
	public void searchclk(){
		searchclick.click();
	}
	public void detailsclick(){
		details.click();
	}
	public void bookingadults(){
		bkadult.click();
	}
	public void booknow(){
		bknw.click();
	}
	public void confirmbknow(){
		conbknw.click();
	}
/*	public void pickingdate(String[] args){
		
		List<WebElement> alldates = dt.findElements(listofdates);
		
		for(WebElement ele:alldates)
		{ if(ele.getText().equals(today))
		
	}*/

	public void Tourprocess(){
		Reporter.log("TourProcess started");
		tour.click();
		sclick.click();
		searchname.clear();
		Reporter.log("searchstringended");
		//searchname.click();
		
	}
	

}
