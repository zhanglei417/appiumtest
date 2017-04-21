package method;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

import bsh.This;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class screenshot {

	public static void mojiScreenShot(AppiumDriver<?> driver) {  
		
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd-mm-ss");
		 //生成时间戳
		String dateString =formatter.format(new Date());
		// 截图文件夹
        File path = new File("screenshots");
        //截图位置及文件名  名称为 标识 + 类名 + 方法名
        String name = path.getAbsolutePath() + File.separator + dateString + File.separator + "driver.getClass().getSimpleName()" + ".png";
        // 
        System.out.println(name);
        File screenShot = driver.getScreenshotAs(OutputType.FILE);
	     System.out.println(screenShot);
	       try {
	          FileUtils.copyFile(screenShot, new File(name));
	     } catch (IOException e) {
	          e.printStackTrace();
	     }
}

}
