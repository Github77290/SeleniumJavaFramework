package com.Guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Guru99.globalpagefactory.BasePage;
import com.Guru99.utilities.Log;

public class FundTransferPage extends BasePage {
	public FundTransferPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Fund Transfer")
	WebElement FundTransfer;
	
	@FindBy(name="payersaccount")
	WebElement payersaccount;
	
	@FindBy(name="payeeaccount")
	WebElement Payeeaccount;
	
	@FindBy(name="ammount")
	WebElement amount;
	
	@FindBy(name="desc")
	WebElement description;
	
	@FindBy(name="AccSubmit")
	WebElement Submit;
	
	public void navigateToFundTransferPage() {
		FundTransfer.click();
	}
	public void WithdrowAmount(String payeraccount,String payeeaccount,String AMOUNT,String Description) {
		try {
			payersaccount.sendKeys(payeraccount);
			Payeeaccount.sendKeys(payeeaccount);
			amount.sendKeys(AMOUNT);
			description.sendKeys(Description);
			Submit.click();
		Log.info("Successfully TransferAmount");
	}catch(Exception e) {
		Log.error("Failed to TransferAmount");
	}
	}


}
