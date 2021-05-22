package com.Guru99.tests;

import org.testng.annotations.Test;

import com.Guru99.globaltest.BaseTest;
import com.Guru99.pages.LoginPage;
import com.Guru99.pages.MiniStatementpage;
import com.Guru99.utilities.Excelutil;
import com.Guru99.utilities.Log;

public class MiniStatementTest extends BaseTest{
	@Test
	public void verifyMiniStatement() {
	Log.startTestCase("verifyMiniStatement");		
	LoginPage loginpage=new LoginPage(getDriver());	
	loginpage.login(Excelutil.readData(1,1),Excelutil.readData(1,2));
	MiniStatementpage miniStatementpage=new MiniStatementpage(getDriver());
	miniStatementpage.navigateToMiniStatement();
	miniStatementpage.getBalanceEnquiry("92757");
	
	}
	
	
	}
