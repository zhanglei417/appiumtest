package com.mushishi.appium.testng;

import org.testng.Assert;
import org.testng.Reporter;

import com.mushishi.appium.base.AndroidDriverBase;
import com.mushishi.appium.base.CrazyPath;

public class Assertion  {
	  private  AndroidDriverBase driver;
	  public Assertion(AndroidDriverBase driver){
		  this.driver=driver;
	  }
	  //注意断言的失败不是一个exception，而是一个error
	  public  void assertEquals(Object actual, Object expected,String fileName){
	        try{
	            Assert.assertEquals(actual, expected);
	        }catch(AssertionError e){
	        	fail(fileName);
	        }
	  }
	  public  void assertEquals(Object actual, Object expected, String fileName,String message){
	        try{
	            Assert.assertEquals(actual, expected, message);
	        }catch(AssertionError e){
	        	fail(fileName,message);
	        }
	  }
	  public  void verifyEquals(Object actual, Object expected,String fileName){
	        try{
	            Assert.assertEquals(actual, expected);
	        }catch(AssertionError e){
	        	try {
	        		driver.takeScreen(CrazyPath.path, "\\images\\"+Thread.currentThread().getId()+fileName);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	        }
	  }
	  public  void verifyEquals(Object actual, Object expected,String fileName,String message){
	        try{
	            Assert.assertEquals(actual, expected, message);
	        }catch(AssertionError e){
	           	try {
	        		driver.takeScreen(CrazyPath.path, "\\images\\"+Thread.currentThread().getId()+fileName);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	        }
	  }
	  public void fail(String fileName){
		  try {
    			//System.out.println(CrazyPath.path+"\\images\\"+Thread.currentThread().getId()+fileName);
			    Long date=System.currentTimeMillis();
			  	System.out.println(date);
			    Reporter.log("<a href=http://localhost:8080/" + Thread.currentThread().getId()+"_"+date+fileName + " target=_blank>失败截图</a>", true);  
			    Reporter.log("<img src=http://localhost:8080/"+Thread.currentThread().getId()+"_"+date+fileName +" style=width:30px;height:30px img/>", true);
				driver.takeScreen("D:/apache-tomcat-8.5.4-windows-x64/apache-tomcat-8.5.4/webapps/ROOT/",Thread.currentThread().getId()+"_"+date+fileName);
		  } catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		  }
		  Assert.fail();
	  }
	  public void fail(String fileName,String message){
		  try {
    			//System.out.println(CrazyPath.path+"\\images\\"+Thread.currentThread().getId()+fileName);
			  	Long date=System.currentTimeMillis();
			  	System.out.println(date);
  			Reporter.log("<a href=http://localhost:8080/" + Thread.currentThread().getId()+"_"+date+fileName + " target=_blank>失败截图</a>", true);  
  			Reporter.log("<img src=http://localhost:8080/"+Thread.currentThread().getId()+"_"+date+fileName +" style=width:30px;height:30px img/>", true);
				driver.takeScreen("D:/apache-tomcat-8.5.4-windows-x64/apache-tomcat-8.5.4/webapps/ROOT/",Thread.currentThread().getId()+"_"+date+fileName);
		  } catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		  }
		  Assert.fail(message);
	  }
}
