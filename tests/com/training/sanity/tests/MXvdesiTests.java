package com.training.sanity.tests;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
//import com.training.pom.LoginPOM;
import com.training.pom.MXvdesiPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MXvdesiTests {

	private WebDriver driver;
	private String baseUrl;
//	private LoginPOM loginPOM;
	private MXvdesiPOM mxvdesiPOM;
	private static Properties properties;
	private ScreenShot screenShot;


	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
    	driver = DriverFactory.getDriver(DriverNames.FIREFOX);
//		System.setProperty("webdriver.http.factory", "jdk-http-client");
//		WebDriver driver = new ChromeDriver();
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
//		loginPOM = new LoginPOM(driver); 
		mxvdesiPOM = new MXvdesiPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	}
//	
//	@AfterTest
//	public void tearDown() throws Exception {
//		Thread.sleep(1000);
//	}
//	@Test(priority=0)
//	public void validLoginTest() {
//		loginPOM.sendUserName("admin");
//		loginPOM.sendPassword("admin@123");
//		loginPOM.clickLoginBtn(); 
//		screenShot.captureScreenShot("First");
//	}
	@Test(priority = 1)
	public void TC_158_TC_159() throws InterruptedException {
		Thread.sleep(3000);
		mxvdesiPOM.VDesiBtn();
		System.out.println("MX-VDesi option is Visible");
	}
	@Test (priority=2)
	public void TC_160_TC_161() throws InterruptedException {
		Thread.sleep(5000);
		mxvdesiPOM.VDesiPlayBtn();
        System.out.println("Play button is Visible");
		
	}
	@Test(priority=3)
	public void TC_167() throws InterruptedException {
		Thread.sleep(1000);
		mxvdesiPOM.VDesiMoreInfoButton();
			
	}
	
	@Test(priority=4)
	public void TC_169() throws InterruptedException {
		Thread.sleep(1000);
		mxvdesiPOM.VDesiAddToListButton();
			
	}
	
	@Test(priority=5)
	public void TC_173() throws InterruptedException {
		Thread.sleep(1000);
		mxvdesiPOM.VDesiCarousalNextButton();
			
	}
	
	@Test(priority=6)
	public void TC_171() throws InterruptedException {
		Thread.sleep(5000);
		mxvdesiPOM.VDesiCarousalPreviousButton();
			
	}
	
	@Test(priority=6)
	public void TC_175() throws InterruptedException {
		Thread.sleep(10000);
		mxvdesiPOM.VDesiMuteUnmuteButton();
			
	}
}
