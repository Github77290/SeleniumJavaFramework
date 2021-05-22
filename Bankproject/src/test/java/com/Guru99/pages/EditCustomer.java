package com.Guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Guru99.globalpagefactory.BasePage;
import com.Guru99.utilities.Log;

public class EditCustomer extends BasePage{
	
	
	
	public EditCustomer(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText="Edit Customer")
	WebElement EditCustomer;
	
	@FindBy(name="cusid")
	WebElement custId;
	
	@FindBy(name="AccSubmit")
	WebElement Submit;
	
	@FindBy(name="telephoneno")
	WebElement mobilephone;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="name")
	WebElement name;
	
	@FindBy(name="sub")
	WebElement Save;
	
	public void navigateToEditCustomer() {
		EditCustomer.click();
	}
	
	public void EntercustomerId(String CustId) {
		custId.sendKeys(CustId);
		Submit.click();
	}
	
	public void EditcustomerDetails(String NAME,String City,String phonenum) {
		try {
		name.sendKeys(NAME);
		city.sendKeys(City);
		mobilephone.sendKeys(phonenum);
		Save.click();
		Log.info("Successfully EditEmployee");
	}catch(Exception e) {
		Log.error("Failed to EditEmployee");
	}
		
	}
	
	
	

}
