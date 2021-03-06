package com.mushishi.appium.operation;

import com.mushishi.appium.base.AndroidDriverBase;
import com.mushishi.appium.page.LoginPage;

import io.appium.java_client.TouchAction;

public class LoginOperation {
	public AndroidDriverBase driver;
	TouchAction action = new TouchAction(driver);
	LoginPage login = new LoginPage(driver);
	/**
	 * 用户名输入
	 * */
	public void sendUserName(String username){
		login.getUsername().sendKeys(username);
	}
	/**
	 * 密码输入
	 * */
	public void sendPassWord(String password){
		login.getPassword().sendKeys(password);
	}
	/**
	 * 点击登陆
	 * */
	public void clickLoginButton(String password){
		action.tap(login.getLoginbutton()).release().perform();
	}
}
