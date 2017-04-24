package com.mushishi.appium.testcases;

import com.mushishi.appium.base.AndroidDriverBase;
import com.mushishi.appium.base.CrazyPath;
import com.mushishi.appium.util.ProUtil;

public class CaseBaseTest {
	public AndroidDriverBase driverInit(String udid, String port)
			throws Exception {
		String input = "com.tencent.qqpinyin/.QQPYInputMethodService";
		ProUtil p = new ProUtil(CrazyPath.globalPath);
		String server=p.getPro("server");
		String capsPath=CrazyPath.capsPath;
		//AndroidSpecific as=new AndroidSpecific();
		//String input=as.getDefaultInput(udid);
		System.out.println("连接"+udid+"端口"+port);
		System.out.println("开始创建server连接");
		
		return new AndroidDriverBase(server, port, capsPath, udid, input);
		
	}
}
