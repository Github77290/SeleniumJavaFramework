package com.Guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Guru99.globalpagefactory.BasePage;
import com.Guru99.utilities.Log;

public class NewCustomer extends BasePage{
	
	public NewCustomer(WebDriver driver) {
		super(driver);
		
	}
	


	@FindBy(linkText="New Customer")
	WebElement Linknewcustomer;
	
	@FindBy(name="name")
	WebElement txtname;
	
	@FindBy(xpath="//input[@name='rad1']")
	WebElement gender;
	
	@FindBy(id="dob")
	WebElement DateOfBarth;
	
	@FindBy(name="addr")
	WebElement Address;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	@FindBy(name="pinno")
	WebElement PIN;
	
	@FindBy(name="telephoneno")
	WebElement MobileNumber;
	
	@FindBy(name="emailid")
	WebElement E_mailId;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="sub")
	WebElement Submit;
	
	public void navigateNewCustomer() {
		Linknewcustomer.click();
	}
	
	
	public void AddNewCustomer(String name, String dob, String address, String city, String state, String pin,
			String mobile, String email, String pass_word) {
		try {
		
		txtname.sendKeys(name);
		gender.click();
		DateOfBarth.sendKeys(dob);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		PIN.sendKeys(pin);
		MobileNumber.sendKeys(mobile);
		E_mailId.sendKeys(email);
		Password.sendKeys(pass_word);
		Submit.click();
		Log.info("Successfully AddNewCustome");
	}catch(Exception e) {
		Log.error("Failed AddNewCustome");
	}
		

	}

}
