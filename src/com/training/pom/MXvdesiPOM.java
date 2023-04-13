package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MXvdesiPOM {
	private WebDriver driver; 
	
	public MXvdesiPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/header[1]/div[1]/ul[1]/div[5]/a[1]/span[1]")
	private WebElement  VDesibtn; 
	
	@FindBy(xpath="//body/div[@id='app']/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[1]/*[1]")
	private WebElement VDesiPlaybtn ;
	
	@FindBy(xpath="//body[1]/div[1]/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/a[2]")
	private WebElement VDesiMoreInfobtn ;
	
	@FindBy(xpath="//body/div[@id='app']/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")
	private WebElement VDesiAddToListbtn ;
	
	@FindBy(xpath="//body/div[@id='app']/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[2]/*[1]")
	private WebElement VDesiCarousalNextbtn ;
	
	@FindBy(xpath="//body/div[@id='app']/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/*[1]")
	private WebElement VDesiCarousalPreviousbtn ;
	
	@FindBy(xpath="//body/div[@id='app']/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/*[1]")
	private WebElement VDesiMuteUnmutebtn ;
//	@FindBy(id="password")
//	private WebElement password;
//	
//	@FindBy(id="formLogin_submitAuth")
//	private WebElement loginBtn; 
//	
	public void VDesiBtn() {
		this.VDesibtn.click();
	};
      public void VDesiPlayBtn() throws InterruptedException {
		this.VDesiPlaybtn.click();
		Thread.sleep(10000);
		this.driver.navigate().back();
	};
	public void VDesiMoreInfoButton() throws InterruptedException {
		this.VDesiMoreInfobtn.click();
		Thread.sleep(5000);
		this.driver.navigate().back();
	};
	
	public void VDesiAddToListButton() throws InterruptedException {
		this.VDesiAddToListbtn.click();
	};
	
	
	public void VDesiCarousalNextButton() throws InterruptedException {
		Thread.sleep(5000);
		this.VDesiCarousalNextbtn.click();
	};
	
	public void VDesiCarousalPreviousButton() throws InterruptedException {
		this.VDesiCarousalPreviousbtn.click();
	};
	
	public void VDesiMuteUnmuteButton() throws InterruptedException {
		this.VDesiMuteUnmutebtn.click();
//		Thread.sleep(5000);
//		this.VDesiMuteUnmutebtn.click();
		
	};
	
//	public void sendPassword(String password) {
//		this.password.clear(); 
//		this.password.sendKeys(password); 
//	}
//	
//	public void clickLoginBtn() {
//		this.loginBtn.click(); 
//	}
}
