package com.mushishi.appiumstudy;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mushishi.appium.base.AndroidDriverBase;
import com.mushishi.appium.base.CrazyPath;
import com.mushishi.appium.page.Home;
import com.mushishi.appium.server.Port;
import com.mushishi.appium.server.Servers;
import com.mushishi.appium.util.DosCmd;
import com.mushishi.appium.util.GetByLocator;
import com.mushishi.appium.util.ImageUtil;
import com.mushishi.appium.util.ProUtil;
import com.mushishi.appium.util.SendMail;
import com.mushishi.appium.util.XmlUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Hello world!
 *
 */
public class App 
{
	private AndroidDriverBase driver;
	@BeforeClass
	public void beforeClass() throws Exception{
		List<String> s=XmlUtil.readXML("configs/device.xml");
		String server = "http://127.0.0.1";
		String port = s.get(3);
		String capsPath = CrazyPath.capsPath;
		String udid= s.get(2);
		String input = "";
		try {
			driver = new AndroidDriverBase(server,port,capsPath,udid,input);
			System.out.print("!!!!!这是执行的app.class类,他的port是"+port+"他的udid是"+udid);
			driver.implicitlyWait(15);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test_upload() throws Exception{
		driver.findElement(GetByLocator.getLocator("username")).sendKeys("mushishi01");
		driver.findElement(GetByLocator.getLocator("pwd")).sendKeys("111111");
		driver.findElement(GetByLocator.getLocator("login")).click();
	}
	
	@AfterClass
	public void afterClass(){
		driver.quit();
		
	}
	

	
}
