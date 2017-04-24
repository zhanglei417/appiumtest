package com.mushishi.appium.page;

import java.util.List;

import com.mushishi.appium.base.AndroidDriverBase;
import com.mushishi.appium.util.GetByLocator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class Home extends BasePage{

	public List<AndroidElement> tvWeek;
	public List<AndroidElement> datefix;
	public List<AndroidElement> radiogroup;
	

	public Home(AndroidDriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public List<MobileElement> getTvWeek() {
		return getListElement("vppic","vppic");
	}


	public List<MobileElement> getDatefix() {
		return getListElement("module");
	}


	public List<MobileElement> getRadiogroup() {
		return getListElement("table");
	}
	
	public void date(){
		List<MobileElement> date = getTvWeek();
		for(MobileElement element :date){
			element.click();
		}
	}
	
	public void module(){
		List<MobileElement> module = getDatefix();
		for(MobileElement element :module){
			element.click();
			driver.pressBack();
		}
	}

}
