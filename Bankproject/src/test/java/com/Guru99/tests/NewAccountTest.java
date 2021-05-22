package com.Guru99.tests;

import org.testng.annotations.Test;

import com.Guru99.globaltest.BaseTest;
import com.Guru99.pages.LoginPage;
import com.Guru99.pages.NewAccount;
import com.Guru99.utilities.Excelutil;
import com.Guru99.utilities.Log;

public class NewAccountTest extends BaseTest {
	@Test
	public void verifyAddnewAccount() throws InterruptedException {
		   
		Log.startTestCase("verifyEditCustomerDetails");		
		LoginPage loginpage=new LoginPage(getDriver());	
		loginpage.login(Excelutil.readData(1,1),Excelutil.readData(1,2));
		NewAccount newAccount=new NewAccount(getDriver());
		newAccount.navigateToNewAccount();
		newAccount.AddnewAccount("42805","10000");
		Thread.sleep(5000);
	}
}
