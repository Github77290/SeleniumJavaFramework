package com.Guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Guru99.globalpagefactory.BasePage;
import com.Guru99.utilities.Log;

public class AmountDepositPage extends BasePage {

	public AmountDepositPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText="Deposit")
	WebElement DepositPage;
	
	@FindBy(name="accountno")
	WebElement AccountNum;
	
	@FindBy(name="ammount")
	WebElement Amount;
	
	@FindBy(name="desc")
	WebElement Description;
	
	@FindBy(name="AccSubmit")
	WebElement AccSubmit;
	
	public void navigateToDepositePage() {
		DepositPage.click();
	}
	public void AddDepositeAmount(String accnum,String amount,String desc) {
		try {
		AccountNum.sendKeys(accnum);
		Amount.sendKeys(amount);
		Description.sendKeys(desc);
		AccSubmit.click();
		Log.info("Successfully AddDepositeAmount");
	}catch(Exception e) {
		Log.error("Failed to AddDepositeAmount");
	}
	}
	
}
