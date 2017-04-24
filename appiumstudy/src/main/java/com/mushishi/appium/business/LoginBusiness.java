package com.mushishi.appium.business;

import com.mushishi.appium.operation.LoginOperation;

public class LoginBusiness {
	LoginOperation loginopear = new LoginOperation();
	public void login(){
		loginopear.sendUserName("mushishi01");
		loginopear.sendPassWord("111111");
	}
}
