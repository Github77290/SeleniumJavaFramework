package com.Guru99.tests;

import org.testng.annotations.Test;

import com.Guru99.globaltest.BaseTest;
import com.Guru99.pages.EditCustomer;
import com.Guru99.pages.LoginPage;
import com.Guru99.utilities.Excelutil;
import com.Guru99.utilities.Log;

public class EditCustomerTest extends BaseTest {
	@Test
	public void verifyEditCustomerDetails() throws InterruptedException {
		Log.startTestCase("verifyEditCustomerDetails");		
		LoginPage loginpage=new LoginPage(getDriver());	
		loginpage.login(Excelutil.readData(1,1),Excelutil.readData(1,2));
		EditCustomer editCustomer=new EditCustomer(getDriver());
		editCustomer.navigateToEditCustomer();
		editCustomer.EntercustomerId("42805");
		editCustomer.EditcustomerDetails("Prasad B","Banglour","9988554433");
		Thread.sleep(5000);
		
	
	}
}
