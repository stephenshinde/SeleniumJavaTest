package com.automation.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.helpers.ReportHelper;
import com.automation.pages.LoginPage;

public class LoginTest extends TestBase {
	

	@Test
	public void LoginApplication() throws Exception {
		
		
		ReportHelper.extenttest = ReportHelper.addTestCasename("Login Application", "Verify Login application flow");

		LoginPage loginpage= new LoginPage();
		
		ReportHelper.extenttest.info("I navigate to Login page and verify Login page title");
		Assert.assertEquals(loginpage.getLoginPageHeader(),"Login Page");
		
		
		ReportHelper.extenttest.info("I enter Username");
		loginpage.enterUsername("tomsmith");
		
		ReportHelper.extenttest.info("I enter password");
		loginpage.enterPasswrod("SuperSecretPassword!");
		
		ReportHelper.extenttest.info("I click Login button");
		loginpage.clickLogin();
		
		ReportHelper.extenttest.info("I wait to load login success page");
		loginpage.waittoloadLoginSuccessFlash();
		
		ReportHelper.extenttest.info("I verify login success message");
		Assert.assertTrue(loginpage.isSuccessPresent());
		
		
		ReportHelper.extenttest.info("I click on logout link");
		loginpage.clickLogout();		
		
		ReportHelper.extenttest.info("I executed test case successfully");
	}
}