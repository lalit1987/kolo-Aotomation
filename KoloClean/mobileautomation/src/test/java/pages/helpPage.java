package pages;

import java.util.concurrent.TimeUnit;

import org.aspectj.weaver.tools.cache.AsynchronousFileCacheBacking.ClearCommand;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class helpPage extends BasePage {

	
	public helpPage(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/dashboard_navigation_item_contact_us")
	private MobileElement helptab;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/onlineHelp")
	private MobileElement onlinehelp;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/phoneCall")
	private MobileElement call;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/termsAndConditions")
	private MobileElement terms;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/privacyPolicy")
	private MobileElement privacy;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/appVersion")
	private MobileElement appversion;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/actionBarClose")
	private MobileElement back;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/terms_and_conditions_action_bar_close")
	private MobileElement termsback;
	
	
	
     public void helpPage () throws InterruptedException{
    	 
    	 click(helptab);
    	 Thread.sleep(2000);
    	 click(onlinehelp);
    	 click(back);
    	 System.out.println("online help done");
    	 click(terms);
    	 click(termsback);
    	 System.out.println("Terms and conditions");
    	 click(privacy);
    	 click(back);
    	 System.out.println("privacy and policy done");
    	 String app_version = appversion.getText();
    	 System.out.println(app_version);
    	 Thread.sleep(2000);
    	 
    	 
    	 
    	 
    	 }

}	

