package com.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.helpers.WaitHelper;
import com.automation.helpers.WebElementHelper;


public class LoginPage extends BasePage{

	public LoginPage(){
		PageFactory.initElements(driver, this);// 'this' means current class objects. 		
	}

	@FindBy(xpath="//h2")
	private WebElement pageHeader;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement userNameTxt;

	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordTxt;

	@FindBy(xpath  = "//button[@type= 'submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath  = "//div[@id='flash']")
	private WebElement loginSuccess;
	
	
	@FindBy(xpath  = "//a[@href='/logout']")
	private WebElement logoutLink;
	
	public String getLoginPageHeader() {
		return getTextName(pageHeader);
	}

	public void enterUsername(String userName) {
		sendText(userNameTxt, userName);
	}

	public void enterPasswrod(String password) {
		sendText(passwordTxt, password);
	}

	public void clickLogin() {
		clickButton(loginBtn);
	}
	
	public String getLoginSuccessFlash() {
		return getTextName(loginSuccess);
	}

	public void clickLogout() {
		clickButton(logoutLink);
	}
	
	public void waittoloadLoginSuccessFlash() {
		WaitHelper.waituntillElementVisible(driver, loginSuccess);
	}
	public boolean isSuccessPresent() {

		return WebElementHelper.isElementDisplayed(loginSuccess);
	}

}
