package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AccountsScreen extends BasePage {

	
	public AccountsScreen(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/logout")
	private MobileElement logoutButton;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/actionBarTitle")
	private MobileElement AccountsTitle;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/accountSubtitle")
	private MobileElement AccountsSubTitle;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/accountNeedHelp")
	private MobileElement Needhelp;
	
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/privacyPolicy")
	private MobileElement privacyPolicy;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/search_src_text")
	private MobileElement accountsSearch;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/accountName']")
	private MobileElement accountSelect;
	
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/termsAndConditions")
	private MobileElement termsAndConditions;
	

	@AndroidFindBy(className="android.widget.TextView")
	private MobileElement termsAndConditionsTitle;
	
	@AndroidFindBy(className="android.widget.ImageButton")
	private MobileElement termsAndConditionsBack;
	

	@AndroidFindBy(className="android.widget.TextView")
	private MobileElement needhelpTitle;

	@AndroidFindBy(className="android.widget.ImageButton")
	private MobileElement needhelpBack;

	@AndroidFindBy(className="android.widget.TextView")
	private MobileElement privacyPolicyTitle;

	@AndroidFindBy(className="android.widget.ImageButton")
	private MobileElement privacypolicyBack;
	
	
public void verifyAccountSuccessfull () throws InterruptedException {
			   
			   logoutButton.isDisplayed();
			   AccountsTitle.isDisplayed();
			   Needhelp.isDisplayed();
			   termsAndConditions.isDisplayed();
			   privacyPolicy.isDisplayed();
			   verifyText(AccountsSubTitle, "Please, select an account from the list");
			   Thread.sleep(5000);
		       
		    }

public void verifyTermsConditionSuccessfull () throws InterruptedException {
	   
	  
	   //Needhelp.isDisplayed();
	   termsAndConditions.isDisplayed();
	   click(termsAndConditions);
	   Thread.sleep(5000);
	   verifyText(termsAndConditionsTitle, "Terms and Conditions");
	   Thread.sleep(3000);
	   click(termsAndConditionsBack);
	   Thread.sleep(4000);
}




public void verifyNeedHelpSuccessfull () throws InterruptedException {
		   
		  
		   
           Needhelp.isDisplayed();
		   click(Needhelp);
		   Thread.sleep(5000);
		   verifyText(needhelpTitle, "Help");
		   Thread.sleep(3000);
		   click(needhelpBack);
		   Thread.sleep(3000);
	    }

public void verifyPrivacyPolicySuccessfull () throws InterruptedException {
	   
	  
	   privacyPolicy.isDisplayed();
	   click(privacyPolicy);
	   Thread.sleep(5000);
	   verifyText(privacyPolicyTitle, "Privacy Policy");
	   Thread.sleep(3000);
	   click(privacypolicyBack);
	   Thread.sleep(3000);
 }
		   
 public void verifyAccountSearchSuccessfull () throws InterruptedException {
	 
			   writeText(accountsSearch, "AricentNew");
			   click(accountSelect);
			   Thread.sleep(20000);
		    }
		}	

