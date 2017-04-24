package com.mushishi.appium.page;

import com.mushishi.appium.base.AndroidDriverBase;
import com.mushishi.appium.util.GetByLocator;

import io.appium.java_client.android.AndroidElement;
import com.mushishi.appium.base.AndroidDriverBase;

public class MySelfData extends BasePage{

	public MySelfData(AndroidDriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public AndroidElement major;
	public AndroidElement school;
	public AndroidElement year;
	
/*	public AndroidElement getMajor() {
		AndroidElement 
		super.driver.findElement(GetByLocator.getLocator("major")).click();
		super.driver.findElement(GetByLocator.getLocator("major_subject")).click();
		flag = super.driver.findElement(GetByLocator.getLocator("majorname")).isSelected();
		if(flag == true){
			driver.pressBack();
		}
		return null;
	}*/
	public AndroidElement getSchool() {
		return super.driver.findElement(GetByLocator.getLocator("school"));
	}
	public AndroidElement getYear() {
		return year;
	}
	

}
