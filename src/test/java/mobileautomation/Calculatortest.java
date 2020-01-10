package mobileautomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Calculatortest {
	
 //	WebDriver driver;
	static AppiumDriver<MobileElement> driver;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			openCalculator();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void openCalculator() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "moto g6 plus");
		cap.setCapability("udid", "ZF6223JFCN");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.0.0");
		cap.setCapability("autoGrantPermissions","true");
		
		//cap.setCapability("appPackage", "com.google.android.calculator");
		//cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
//		cap.setCapability("appPackage", "com.teracode.kolo.staging");
//		cap.setCapability("appActivity", "com.teracode.kolo.activities.SplashActivity");
		
		cap.setCapability("appPackage", "com.teracode.koloconnect.staging");
		cap.setCapability("appActivity", "com.teracode.koloconnect.login.login.views.LoginActivity");
		//cap.setCapability("appActivity", "com.teracode.koloconnect.accounts.views.AccountsActivity");
		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		
		System.out.println("Application started .....");
		
		driver= new AppiumDriver<MobileElement>(url,cap);
		
		//MobileElement conti=driver.findElement(By.id("com.teracode.kolo.staging:id/permissions_continue"));
		
		
		MobileElement user=driver.findElement(By.id("com.teracode.koloconnect.staging:id/username"));
		MobileElement pass=driver.findElement(By.id("com.teracode.koloconnect.staging:id/password"));
		
		MobileElement loginButton=driver.findElement(By.id("com.teracode.koloconnect.staging:id/loginButton"));
		
		user.sendKeys("arzoo.gupta@aricent.com");
		pass.sendKeys("Kolo1234");
		loginButton.click();
		
		System.out.println("Completed1  .....");
		
		Thread.sleep(20000);
		
		MobileElement accountsSearch=driver.findElement(By.id("com.teracode.koloconnect.staging:id/search_src_text"));
		accountsSearch.sendKeys("AricentNew");
		
		MobileElement accountSelect=driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/accountName']"));
		
		accountSelect.click();
		
		Thread.sleep(10000);
		
		System.out.println("Completed .....");
		
	}

}
