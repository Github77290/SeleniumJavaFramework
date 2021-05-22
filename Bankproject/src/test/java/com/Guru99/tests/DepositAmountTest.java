package com.Guru99.tests;

import org.testng.annotations.Test;

import com.Guru99.globaltest.BaseTest;
import com.Guru99.pages.AmountDepositPage;
import com.Guru99.pages.LoginPage;
import com.Guru99.utilities.Excelutil;
import com.Guru99.utilities.Log;

public class DepositAmountTest extends BaseTest{
	@Test
	public void verifyDepositAmount() {
	Log.startTestCase("DepositAmountTest");		
	LoginPage loginpage=new LoginPage(getDriver());	
	loginpage.login(Excelutil.readData(1,1),Excelutil.readData(1,2));
	AmountDepositPage amountDepositPage=new AmountDepositPage(getDriver());
	amountDepositPage.navigateToDepositePage();
	amountDepositPage.AddDepositeAmount("92757", "10000","credit amount");
	
	
	}
	
	
	}
