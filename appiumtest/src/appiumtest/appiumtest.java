package appiumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import method.swipe;

import java.io.File;
import java.net.URL;
import java.util.List;

public class appiumtest {
	
    private  AndroidDriver driver;
 
    @BeforeMethod(alwaysRun=true)
    public void setUp() throws Exception {
        // set up appium
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apps");
//        File app = new File(appDir, "ContactManager.apk");
        File app = new File("/Users/phoenixzhang/AndroidStudioProjects/Activity03/app/build/outputs/apk/app-release.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName","127.0.0.1:62001");
//        capabilities.setCapability("platformVersion", "6.0");
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("platformVersion", "5.1.1");
        capabilities.setCapability("app", app.getAbsolutePath());
//        capabilities.setCapability("appPackage", "com.example.android.contactmanager");
//      此处写package名
        capabilities.setCapability("appPackage", "com.example.phoenixzhang.activity03");
//		此处写入口activity名
        capabilities.setCapability("appActivity", "MainActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
 
    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }
 
    @Test(groups={"addContact"})
    public void addContact() throws InterruptedException{
    	Thread.sleep(3000);
//        WebElement el = driver.findElement(By.xpath("//android.widget.Button"));
//        Thread.sleep(3000);
//        el.click();
//        Thread.sleep(3000);
////      id通过viewer获取 前面是包名：id
//        driver.findElementById("com.example.android.contactmanager:id/contactSaveButton").click();
//        Thread.sleep(3000);
////      driver.findElementByName("Add Contact").click();
////    	Thread.sleep(3000);
    }
    
    @Test(groups={"addContact2"})
    public void addContact2() throws InterruptedException{
    	Thread.sleep(3000);
        WebElement el = driver.findElement (By.xpath("//android.widget.Button1"));
        Thread.sleep(3000);
        el.click();
        Thread.sleep(3000);
        driver.findElementByName("Add Contact").click();
    	Thread.sleep(3000);
    }
}

