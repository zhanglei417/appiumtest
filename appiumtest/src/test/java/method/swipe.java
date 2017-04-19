package method;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class swipe {
	/** 
	 * 上滑 
	 *  
	 * @param driver 
	 * @param during 
	 * @param num 
	 * @throws InterruptedException 
	 */  
	public static void swipeToUp(AppiumDriver<WebElement> driver,int during, int num) throws InterruptedException {  
	    int width = driver.manage().window().getSize().width;  
	    int height = driver.manage().window().getSize().height;  
	    for (int i = 0; i < num; i++) {  
	        driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);  
	        Thread.sleep(3000);  
	    }  
	}  
	  
	/** 
	 * 下拉 
	 *  
	 * @param driver 
	 * @param during 
	 * @param num 
	 * @throws InterruptedException 
	 */  
	public static void swipeToDown(AppiumDriver<WebElement> driver,int during, int num) throws InterruptedException {  
	    int width = driver.manage().window().getSize().width;  
	    int height = driver.manage().window().getSize().height;  
	    System.out.println(width);  
	    System.out.println(height);  
	    for (int i = 0; i < num; i++) {  
	        driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);  
	        Thread.sleep(3000);  
	    }  
	}  
	  
	/** 
	 * 向左滑动 
	 *   
	 * @param driver 
	 * @param during 
	 * @param num 
	 * @throws InterruptedException 
	 */  
	public static void swipeToLeft(AppiumDriver<WebElement> driver,int during, int num) throws InterruptedException {  
	    int width = driver.manage().window().getSize().width;  
	    int height = driver.manage().window().getSize().height;  
	    for (int i = 0; i < num; i++) {  
	        driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);  
	        Thread.sleep(3000);  
	    }  
	}  
	  
	/** 
	 * 向右滑动 
	 *  
	 * @param driver 
	 * @param during 
	 * @param num 
	 * @throws InterruptedException 
	 */  
	public static void swipeToRight(AppiumDriver<WebElement> driver,int during, int num) throws InterruptedException {  
	    int width = driver.manage().window().getSize().width;  
	    int height = driver.manage().window().getSize().height;  
	    for (int i = 0; i < num; i++) {  
	        driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);  
	        Thread.sleep(3000);  
	    }  
	}  
}
