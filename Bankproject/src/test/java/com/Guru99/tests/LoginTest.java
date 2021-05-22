package com.Guru99.tests;

import org.testng.annotations.Test;

import com.Guru99.globaltest.BaseTest;
import com.Guru99.pages.LoginPage;
import com.Guru99.utilities.Excelutil;
import com.Guru99.utilities.Log;


public class LoginTest extends BaseTest{
	@Test
	public void verifyvaliedcredentals() {
		Log.startTestCase("verifyvaliedcredentals");		
		LoginPage loginpage=new LoginPage(getDriver());	
		loginpage.login(Excelutil.readData(1,1),Excelutil.readData(1,2));
		//loginpage.verifyWelcomeMessage();
		
		
	}
	/*
	 * @Test public void verifyinvaliedcredentails() {
	 * 
	 * LoginPage loginpage=new LoginPage(getDriver());
	 * loginpage.login(Excelutil.readData(2,1),Excelutil.readData(2,2));
	 * loginpage.Loginerrormsg("Invalid credentials"
	 * ,"Verify error msg if user enter invalied credentials"); }
	 * 
	 * @Test public void verifyusernameBlank() {
	 * 
	 * LoginPage loginpage=new LoginPage(getDriver());
	 * loginpage.login("",Excelutil.readData(1,2));
	 * loginpage.Loginerrormsg("Username cannot be empty"
	 * ,"Verify error msg if user UserName name is Blank"); }
	 * 
	 * @Test public void verifypasswordBlank() {
	 * 
	 * LoginPage loginpage=new LoginPage(getDriver());
	 * loginpage.login(Excelutil.readData(1,1),"");
	 * loginpage.Loginerrormsg("Password cannot be empty"
	 * ,"Verify error msg if user Password name is Blank"); }
	 */
}
