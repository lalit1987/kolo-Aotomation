package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class splash extends BasePage {

	
	public splash(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/notificationsCheckbox")
	private MobileElement enableNotification;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/permissions_continue")
	private MobileElement save;
	
	@AndroidFindBy(id="android:id/button1")
	private MobileElement allow;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/login_selector_installation_id_continue")
	private MobileElement Continue;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/cameraCheckbox")
	private MobileElement cameracheckbox;
	
	@AndroidFindBy(id=" com.android.packageinstaller:id/permission_allow_button")
	private MobileElement allowcamera;
	
	
     public void splashScreen () throws InterruptedException{
    	    Thread.sleep(2000);
//    	    cameracheckbox.click(); // enable camera
//    	    allowcamera.click();   // allow camera
    	 	enableNotification.click();
	    	allow.click();
	    	save.click();
	    	System.out.println("Clicked on Save button");
	    	
     }


		   public void verifySplash () {
			   Continue.isDisplayed();
			   System.out.println("Splash Screen verified and clicked on login button");
			   
			   
			}
		}	

