package com.Guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Guru99.globalpagefactory.BasePage;
import com.Guru99.utilities.Log;

public class BalanceEnquiry extends BasePage{
	
	
	
	public BalanceEnquiry(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText="Balance Enquiry")
	WebElement BalanceEnquiry;
	
	@FindBy(name="accountno")
	WebElement AccountNumber;
	
	
	@FindBy(name="AccSubmit")
	WebElement Submit;
	
	public void navigateToBalanceEnquiry() {
		BalanceEnquiry.click();
	}
	
	
	
	public void getBalanceEnquiry(String accountnumber) {
		try {
			AccountNumber.sendKeys(accountnumber);
			Submit.click();
		Log.info("Successfully EditEmployee");
	}catch(Exception e) {
		Log.error("Failed to EditEmployee");
	}
		
	}
	
	
	

}
