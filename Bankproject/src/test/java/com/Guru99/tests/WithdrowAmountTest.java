package com.Guru99.tests;

import org.testng.annotations.Test;

import com.Guru99.globaltest.BaseTest;
import com.Guru99.pages.AmountWithdrowPage;
import com.Guru99.pages.LoginPage;
import com.Guru99.utilities.Excelutil;
import com.Guru99.utilities.Log;

public class WithdrowAmountTest extends BaseTest{
	@Test
	public void verifyWithdrowAmount() {
	Log.startTestCase("verifyWithdrowAmount");		
	LoginPage loginpage=new LoginPage(getDriver());	
	loginpage.login(Excelutil.readData(1,1),Excelutil.readData(1,2));
	AmountWithdrowPage amountWithdrowPage=new AmountWithdrowPage(getDriver());
	amountWithdrowPage.navigateToWithdrowPage();
	amountWithdrowPage.WithdrowAmount("92757","1000","withdrow");
	
	
	}
	
	
	}
