package appiumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import method.swipe;
import method.mojiScreenShot;
import method.screenshot;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.net.URL;
import java.util.List;

public class TestMukewang {
	
    private static AndroidDriver driver;
 
    @BeforeSuite(alwaysRun=true)
    public void setUp() throws Exception {

        File app = new File("/Users/phoenixzhang/downloads/mukewang.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("noReset", true);
	    capabilities.setCapability("deviceName","MSM8926");
	    capabilities.setCapability("platformVersion", "4.3");
//	    capabilities.setCapability("automationName", "Selendroid");
//      capabilities.setCapability("deviceName","127.0.0.1:62001");
//      capabilities.setCapability("platformVersion", "4.4.2");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "cn.com.open.mooc");
        capabilities.setCapability("appActivity", ".index.splash.MCSplashActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
    }
 
    @AfterSuite(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test(groups={"MojiMain"})
    public void startApp() throws InterruptedException{
    	Thread.sleep(4000);
    	WebElement element = driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'cn.com.open.mooc:id/icon_close')]"));
    	driver.tap(1, element, 100);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[contains(@resource-id,'cn.com.open.mooc:id/rv_home')]/android.widget.LinearLayout[1]/android.widget.ImageView[3]")).click();
    	Thread.sleep(2000);
    	WebElement element4 = driver.findElement(By.xpath("//android.widget.ListView[contains(@resource-id,'cn.com.open.mooc:id/mc_pull_list_view')]/android.widget.RelativeLayout[2]/android.widget.TextView[contains(@resource-id,'cn.com.open.mooc:id/course_question_title')]"));
    	driver.tap(1, element4, 100);
    	Thread.sleep(8000);
    	System.out.println(driver.getContextHandles());
    	Thread.sleep(8000);
    	

//    	WebElement element3 = driver.findElement(By.xpath("//android.support.v4.view.ViewPager[contains(@resource-id,'cn.com.open.mooc:id/viewpager')]"));
//    	driver.tap(1, element3, 100);
//    	Thread.sleep(6000);
//    	System.out.println(driver.getContextHandles());
//    	WebElement element4 = driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'cn.com.open.mooc:id/left_icon')]"));
//    	driver.tap(1, element4, 100);
//    	Thread.sleep(2000);
 
//    	System.out.println(driver.getPageSource());
//    	driver.pressKeyCode(AndroidKeyCode.HOME);
//    	Thread.sleep(2000);
//    	WebElement element2 = driver.findElement(By.xpath("//android.widget.HorizontalScrollView[contains(@resource-id,'cn.com.open.mooc:id/sliding_tabs')]"));
//    	driver.tap(1, element2, 100);
//    	Thread.sleep(2000);
//    	WebElement element2 = driver.findElement(By.xpath("//android.widget.HorizontalScrollView[contains(@text,'课程')]"));
//    	遍历所有class名字为xxx的元素
    	List<WebElement> tabs = driver.findElements(By.className("android.support.v7.a.a$c"));
//    	tabs为所有class匹配的集合，之后功过get index来定位元素。
    	tabs.get(1).click();
    	Thread.sleep(2000);

   
//    	driver.findElementByAndroidUIAutomator("text(\"CSS3\")").click();
//    	Thread.sleep(2000);
    	
//    	通过content-desc属性定位单个元素
//    	WebElement backicon = driver.findElementByAccessibilityId("Navigate up");
//    	backicon.click();
//    	Thread.sleep(2000);
    	
//    	新版本appium不支持byName，换成下面格式
    	WebElement downloaditem = driver.findElementByAndroidUIAutomator("text(\"下载\")");
    	downloaditem.click();
    	Thread.sleep(2000);
    	WebElement childExample = driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[contains(@resource-id,'cn.com.open.mooc:id/rv_downloads')]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
    	childExample.click();
    	Thread.sleep(5000);
    	WebElement element5 = driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'cn.com.open.mooc:id/left_icon')]"));
    	driver.tap(1, element5, 100);
    	Thread.sleep(2000);
    	childExample = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'课程推荐')]/parent::android.widget.LinearLayout/following-sibling::android.widget.FrameLayout[4]/child::android.widget.LinearLayout/android.widget.ImageView"));
    	childExample.click();
    	Thread.sleep(2000);
    	
//    	for (WebElement element1:elements){
//    		driver.tap(1, element1, 100);
//    		Thread.sleep(2000);
//    		driver.pressKeyCode(AndroidKeyCode.BACK);
//    		String s = driver.getPageSource();
//    		if(!(s.contains("反馈天气")&&s.contains("今天")&&s.contains("明天"))){
//        		driver.pressKeyCode(AndroidKeyCode.BACK);
//        		Thread.sleep(2000);
//    		}

//    	}
    }
//    @Test(groups={"MojiMain"})
//    public void startApp2() throws InterruptedException{
//    	driver.startActivity("com.moji.mjweather", "MainActivity");
//    	Thread.sleep(5000);
//    }
    
    public static AppiumDriver getDriver(){
        return driver;
    }    
 
}

