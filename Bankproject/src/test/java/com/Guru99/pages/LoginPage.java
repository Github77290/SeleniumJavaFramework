package com.Guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Guru99.globalpagefactory.BasePage;
import com.Guru99.utilities.Log;




public class LoginPage extends BasePage{
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	@FindBy(id="welcome")
	WebElement link_Welcome;
	
	@FindBy(id="spanMessage")
	WebElement Link_invalied;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}


	public void login(String USERNAME,String PASSWORD) {
		try {
			userName.sendKeys(USERNAME);
			password.sendKeys(PASSWORD);
			login.click();
			Log.info("Successfully Login");
	}catch(Exception e) {
		Log.error("Failed to 'Login'");
	}
			
	}
	/*
	 * public void verifyWelcomeMessage(){
	 * 
	 * String actualMsg = link_Welcome.getText(); Assert.assertEquals(actualMsg,
	 * "Welcome Namrata","Verify Welcome message");
	 * 
	 * 
	 * }
	 */
	
	
	/*
	 * public void Loginerrormsg(String error,String validationstep) {
	 * 
	 * String actualMsg=Link_invalied.getText();
	 * Assert.assertEquals(actualMsg,error,validationstep);
	 * 
	 * }
	 */
}
