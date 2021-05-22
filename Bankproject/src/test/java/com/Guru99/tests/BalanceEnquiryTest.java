package com.Guru99.tests;

import org.testng.annotations.Test;

import com.Guru99.globaltest.BaseTest;
import com.Guru99.pages.BalanceEnquiry;
import com.Guru99.pages.LoginPage;
import com.Guru99.utilities.Excelutil;
import com.Guru99.utilities.Log;

public class BalanceEnquiryTest extends BaseTest {
	@Test
	public void verifyEditCustomerDetails() throws InterruptedException {
		Log.startTestCase("verifyEditCustomerDetails");		
		LoginPage loginpage=new LoginPage(getDriver());	
		loginpage.login(Excelutil.readData(1,1),Excelutil.readData(1,2));
		BalanceEnquiry balanceEnquiry=new BalanceEnquiry(getDriver());
		balanceEnquiry.navigateToBalanceEnquiry();
		balanceEnquiry.getBalanceEnquiry("92757");
	
	}
}
