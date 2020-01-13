package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseTest {
	
	static AppiumDriver<MobileElement> driver;
	public AppiumDriver getDriver(){
		return driver;
	}

    @BeforeSuite
	public void setup() throws MalformedURLException 
	{
		DesiredCapabilities caps= new DesiredCapabilities();
		//caps.setCapability("","");
		caps.setCapability("deviceName", "moto g6 plus");
		caps.setCapability("udid", "ZF6223JFCN");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.0.0");
		caps.setCapability("appPackage", "com.teracode.koloconnect.staging");
		caps.setCapability("appActivity", "com.teracode.koloconnect.login.login.views.LoginActivity");
		caps.setCapability("autoGrantPermissions","true");
		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		driver= new AppiumDriver<MobileElement>(url,caps);
	}
    
    
    @AfterSuite
	public void teardown()
	{
    	driver.quit();
	}
	
    
}
