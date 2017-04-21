package appiumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.URL;
import java.util.List;

public class testios {
	
    private IOSDriver driver;
 
    @BeforeMethod(alwaysRun=true)
    public void setUp() throws Exception {
        // set up appium
        DesiredCapabilities capabilities = new DesiredCapabilities();  
        capabilities.setCapability("appium-version", "1.6.3");  
        capabilities.setCapability("platformName", "iOS");  
        capabilities.setCapability("platformVersion", "10.2");  
        capabilities.setCapability("deviceName", "iPhone 7");  
        capabilities.setCapability("newCommandTimeout",60000);  
        capabilities.setCapability("launchTimeout",60000);  
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");  
        capabilities.setCapability("app", "/Users/phoenixzhang/Downloads/test/test1.app");  
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);  
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
}
