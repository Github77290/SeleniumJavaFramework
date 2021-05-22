package com.Guru99.tests;

import org.testng.annotations.Test;

import com.Guru99.globaltest.BaseTest;
import com.Guru99.pages.FundTransferPage;
import com.Guru99.pages.LoginPage;
import com.Guru99.utilities.Excelutil;
import com.Guru99.utilities.Log;

public class FundTransferTest extends BaseTest{
	@Test
	public void verifyFundsTranfer() {
	Log.startTestCase("verifyFundsTranfer");		
	LoginPage loginpage=new LoginPage(getDriver());	
	loginpage.login(Excelutil.readData(1,1),Excelutil.readData(1,2));
	FundTransferPage fundTransferPage=new FundTransferPage(getDriver());
	fundTransferPage.navigateToFundTransferPage();
	fundTransferPage.WithdrowAmount("92757","92758","600","amount");
	
	}
	
	
	}
