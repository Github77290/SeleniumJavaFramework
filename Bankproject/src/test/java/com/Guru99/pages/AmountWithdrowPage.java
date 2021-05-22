package com.Guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Guru99.globalpagefactory.BasePage;
import com.Guru99.utilities.Log;

public class AmountWithdrowPage extends BasePage {

	public AmountWithdrowPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText="Withdrawal")
	WebElement Withdrawal;
	
	@FindBy(name="accountno")
	WebElement AccountNum;
	
	@FindBy(name="ammount")
	WebElement Amount;
	
	@FindBy(name="desc")
	WebElement Description;
	
	@FindBy(name="AccSubmit")
	WebElement AccSubmit;
	
	public void navigateToWithdrowPage() {
		Withdrawal.click();
	}
	public void WithdrowAmount(String accnum,String amount,String desc) {
		try {
		AccountNum.sendKeys(accnum);
		Amount.sendKeys(amount);
		Description.sendKeys(desc);
		AccSubmit.click();
		Log.info("Successfully WithdrowAmount");
	}catch(Exception e) {
		Log.error("Failed to WithdrowAmount");
	}
	}
	
}
