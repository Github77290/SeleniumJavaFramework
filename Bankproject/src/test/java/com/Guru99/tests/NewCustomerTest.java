package com.Guru99.tests;

import org.testng.annotations.Test;

import com.Guru99.globaltest.BaseTest;
import com.Guru99.pages.LoginPage;
import com.Guru99.pages.NewCustomer;
import com.Guru99.utilities.Excelutil;
import com.Guru99.utilities.Log;

public class NewCustomerTest extends BaseTest {
	
	@Test
	public void VerifyNewCustomer() throws InterruptedException {
		Log.startTestCase("VerifyNewCustomer");		
		LoginPage loginpage=new LoginPage(getDriver());	
		loginpage.login(Excelutil.readData(1,1),Excelutil.readData(1,2));
		NewCustomer newCoustomer=new NewCustomer(getDriver());
		newCoustomer.navigateNewCustomer();
		Thread.sleep(5000);
		newCoustomer.AddNewCustomer("prasad", "12-5-1996", "Kompally hanuman street h no 1 2 65 3", "Hyderabad",
				"Telangana", "500008", "9988665544", "brnusd@gmail.com", "Prasad@123");
		Thread.sleep(5000);
		/*
		 * newCoustomer.AddNewCustomer( Excelutil.readData(8,1),
		 * Excelutil.readData(8,3), Excelutil.readData(8,4), Excelutil.readData(8,5),
		 * Excelutil.readData(8,6), Excelutil.readData(8,7), Excelutil.readData(8,8),
		 * Excelutil.readData(8,9), Excelutil.readData(8,10));
		 */
	}

}
