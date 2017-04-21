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

public class testios2 {
	
    private IOSDriver driver;
 
    @BeforeMethod(alwaysRun=true)
    public void setUp() throws Exception {
        // set up appium
        DesiredCapabilities capabilities = new DesiredCapabilities();  
//        capabilities.setCapability("appium-version", "1.6.3");  
        capabilities.setCapability("platformName", "iOS");  
        capabilities.setCapability("platformVersion", "10.0");  
        capabilities.setCapability("deviceName", "iPhone 6p");  
        capabilities.setCapability("newCommandTimeout",60000);  
        capabilities.setCapability("launchTimeout",60000);  
        capabilities.setCapability("bootstrapPath", "/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent");
        capabilities.setCapability("agentPath", "/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent/WebDriverAgent.xcodeproj");
        capabilities.setCapability(MobileCapabilityType.UDID, "b17e524ddd89b34088e568183a9adae7128ea11a");  
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest"); 
        capabilities.setCapability("app", "/Users/phoenixzhang/Downloads/test/YYContact.app");  
        driver = new IOSDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);  
    }
 
    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }
 
    @Test(groups={"addContact"})
    public void addContact()  throws InterruptedException{
    	Thread.sleep(3000);
//        WebElement el = driver.findElement(By.xpath("//android.widget.Button"));throws
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
