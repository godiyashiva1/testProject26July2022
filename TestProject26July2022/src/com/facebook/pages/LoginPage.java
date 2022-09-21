package com.facebook.pages;

import com.facebook.genericPage.MasterPage;

public class LoginPage extends MasterPage {

	public LoginPage() throws Exception {
		super();
	}

	//Click Email or Phone
	public void clickEmailorPhone() {
		click("EmailorPhone");
		
	}
	//Enter UserName
	public void enterUserName() {
		enterData("EmailorPhone", "testdata1");
	}
	
	//Click Password
		public void clickPassword() {
			click("Password");
			
		}
		//Enter Password
		public void enterPassword() {
			enterData("Password", "testdata2");
		}
		
		// Click on Login button
		public void clickLoginButton() {
			click("LoginButton");
		}
}
