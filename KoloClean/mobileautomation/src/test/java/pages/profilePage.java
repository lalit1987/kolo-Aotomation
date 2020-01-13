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

public class profilePage extends BasePage {

	
	public profilePage(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/dashboard_navigation_item_profile")
	private MobileElement profiletab;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/profile_edit")
	private MobileElement edit;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/profile_first_name")
	private MobileElement firstname;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/profile_last_name")
	private MobileElement lastname;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/profile_edit_action_save")
	private MobileElement save;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/profile_notifications")
	private MobileElement pushnotification;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/profile_digest_subscription") 
	private MobileElement emaildigest;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/profile_language") 
	private MobileElement language;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Español']")
	private MobileElement french;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='English']")
	private MobileElement english;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/profile_edit_action_cancel")
	private MobileElement cancel;
	
	
	
     public void profilePageEdit (String firstname, String lastname) throws InterruptedException{
    	 
    	 click(profiletab);
    	 Thread.sleep(2000);
    	 click(edit);
    	 writeText(this.firstname,firstname);
    	 writeText(this.lastname,lastname);
    	 System.out.println("Name edit is done");
    	 click(pushnotification);
    	 Thread.sleep(3000);
    	 click(emaildigest);
    	 System.out.println("Toggle done");
    	 Thread.sleep(4000);
    	 click(language);
    	 click(french);
    	 System.out.println("French selected");
    	 click(save);
    	 System.out.println("Changes saved");
    	 Thread.sleep(2000);
    	 click(edit);
    	 click(language);
    	 click(english);
    	 click(save);
    	 System.out.println("Language changed to English and saved");
    	 Thread.sleep(2000);
    	 click(edit);
    	 click(pushnotification);
    	 Thread.sleep(3000);
    	 click(cancel);
    	 System.out.println("Email digest toggle change cancel");
    	 
    	 }

}	

