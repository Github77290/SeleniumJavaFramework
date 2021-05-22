package com.Guru99.globaltest;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Guru99.utilities.Excelutil;
import com.Guru99.utilities.Log;
import com.Guru99.utilities.propertyutil;


public class BaseTest {
	private WebDriver driver;
	
	
	  @BeforeSuite 
	  public void intialize() throws IOException {
	  propertyutil.intializeproperty(); 
	  Excelutil.intializeproperty();
	  DOMConfigurator.configure("log4j.xml");
	  }
	 
	@BeforeMethod
	public void launchbrowser() {
		String browserName=propertyutil.readproperty("browsername");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",propertyutil.readproperty("chromedriverpath"));
		 driver=new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",propertyutil.readproperty("firefoxdriverpath"));
			 driver=new FirefoxDriver();
		}else if(browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver",propertyutil.readproperty("iedriverpath"));
			 driver=new InternetExplorerDriver();
		}else {
			System.out.println("Look like you passed invalied Browser");
			Log.error("Look like you passed invalied Browser");
		}
		Log.info("Successfully Lanch the Browser");
		
	}
	@BeforeMethod
	public void openApplication() {
		String Url=propertyutil.readproperty("url");
		driver.get(Url);
		Log.info("Successfully Open the Application");
	}
	@AfterMethod
	public void closebrowser() {
		driver.quit();
		Log.info("Successfully Close the Browser");
	}
	
	public WebDriver getDriver() {
		return driver;
		
	}

}
