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

public class TestNew {
	
    private static AndroidDriver driver;
 
    @BeforeSuite(alwaysRun=true)
    public void setUp() throws Exception {
        // set up appium
//        File classpathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classpathRoot, "apps");
//        File app = new File(appDir, "ContactManager.apk");
//        File app = new File("/Users/phoenixzhang/AndroidStudioProjects/Activity03/app/build/outputs/apk/app-release.apk");
        File app = new File("/Users/phoenixzhang/downloads/moji.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName","MSM8926");
        capabilities.setCapability("platformVersion", "4.3");
//        capabilities.setCapability("deviceName","127.0.0.1:62001");
//        capabilities.setCapability("platformVersion", "6.0");
//        capabilities.setCapability("deviceName","Android Emulator");
//        capabilities.setCapability("platformVersion", "5.1.1");
        capabilities.setCapability("app", app.getAbsolutePath());
//        capabilities.setCapability("appPackage", "com.example.android.contactmanager");
//      此处写package名
//        capabilities.setCapability("appPackage", "com.example.phoenixzhang.activity03");
        capabilities.setCapability("appPackage", "com.moji.mjweather");
//		此处写入口activity名
        capabilities.setCapability("appActivity", "LauncherActivity");
//        capabilities.setCapability("appActivity", "LauncherActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
    }
 
    @AfterSuite(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test(groups={"MojiMain"})
    public void startApp() throws InterruptedException{
    	Thread.sleep(3000);
//    	screenshot.mojiScreenShot(driver);
    	
//    	WebElement element = driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'comd/y_')]"));
//    	driver.quit();
    	swipe.swipeToLeft(driver, 500, 1);
    	Thread.sleep(2000);
    	WebElement element = driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'com.moji.mjweather:id/y_')]"));
    	driver.tap(1, element, 100);
    	Thread.sleep(2000);
    	System.out.println(driver.getPageSource());
//    	driver.pressKeyCode(AndroidKeyCode.HOME);
//    	Thread.sleep(2000);
    	List<WebElement> elements = driver.findElements(By.xpath("//android.widget.ImageView"));
    	for (WebElement element1:elements){
    		driver.tap(1, element1, 100);
    		Thread.sleep(2000);
    		String s = driver.getPageSource();
    		if(!(s.contains("反馈天气")&&s.contains("今天")&&s.contains("明天"))){
        		driver.pressKeyCode(AndroidKeyCode.BACK);
        		Thread.sleep(2000);
    		}
    		if(driver.getPageSource().contains("墨迹天气")){
    			driver.tap(1, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'墨迹天气')]")), 100);
        		Thread.sleep(2000);
    		}
    	}
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

