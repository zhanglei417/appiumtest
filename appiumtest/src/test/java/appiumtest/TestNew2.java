package appiumtest;



import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class TestNew2 {
	
 
    @BeforeSuite(alwaysRun=true)
    public void setUp() throws Exception {
        // set up appium
    }
 
    @AfterSuite(alwaysRun=true)
    public void tearDown() throws Exception {
  
    }

    @Test(groups={"MojiMain"})
    public void startApp() throws InterruptedException{
    	Thread.sleep(3000);
    }
    
 
}

