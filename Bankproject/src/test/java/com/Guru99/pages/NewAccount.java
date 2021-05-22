package com.Guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Guru99.globalpagefactory.BasePage;
import com.Guru99.utilities.Log;

public class NewAccount extends BasePage{

	public NewAccount(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(linkText="New Account")
	WebElement NEWACCOUNT;
	
	@FindBy(name="cusid")
	WebElement cus_id;
	
	@FindBy(name="inideposit")
	WebElement inideposit ;

	@FindBy(name="button2")
	WebElement submit;
	
	public void navigateToNewAccount() {
		NEWACCOUNT.click();
	}
	
	public void AddnewAccount(String custid,String deposit) {
		try {
		cus_id.sendKeys(custid);
		inideposit.sendKeys(deposit);
		submit.click();
		Log.info("Successfully AddNewAccount");
	}catch(Exception e) {
		Log.error("Failed to AddNewAccount");
	}
		
	}
}
