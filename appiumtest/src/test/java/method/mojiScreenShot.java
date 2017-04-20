package method;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import appiumtest.TestNew;
import io.appium.java_client.AppiumDriver;

/**
 * 截图并保存至本地
 * 
 * @author Charlie.chen
 */
public class mojiScreenShot {

    private static AppiumDriver<?> driver;
    // 测试失败截屏保存的路径
    private static String path;

    public mojiScreenShot(AppiumDriver<?> dr){
    	mojiScreenShot.driver= TestNew.getDriver();;
        path=System.getProperty("user.dir")+ "/snapshot/"+ this.getClass().getSimpleName()+"_"+getCurrentTime() + ".png";
        System.out.println("path" +":" + path);
    }

    public void getScreenShot() {
    	System.out.println("startcopy");
        File screen =driver.getScreenshotAs(OutputType.FILE);
        File screenFile = new File(path);
        try {
            FileUtils.copyFile(screen, screenFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取当前时间
     */
    public static String getCurrentTime(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String currentTime=sdf.format(date);
        return currentTime; 
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}