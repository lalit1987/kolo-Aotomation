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

public class firstLoginPage extends BasePage {

	
	public firstLoginPage(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/account_login_account")
	private MobileElement username;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/account_login_password")
	private MobileElement password;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/account_login_done")
	private MobileElement loginButton;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/account_login_forgot_password")
	private MobileElement forget;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/forgot_password_login_id")
	private MobileElement forgetusername;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/forgot_password_reset")
	private MobileElement resetpassword;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/login_selector_login")
	private MobileElement loginButton1;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/alertTitle")
	private MobileElement incorrectloginpassword;
	
	@AndroidFindBy(id="android:id/button1")
	private MobileElement okbutton;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/forgot_password_close")
	private MobileElement forgetclose;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/login_selector_help")
	private MobileElement needhelp;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/title")
	private MobileElement helptext;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/onlineHelp")
	private MobileElement onlinehelp;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/phoneCall")
	private MobileElement call;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/termsAndConditions")
	private MobileElement terms;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/privacyPolicy")
	private MobileElement policy;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/actionBarClose")
	private MobileElement back;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/terms_and_conditions_action_bar_close")
	private MobileElement termsback;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/actionBarTitle")
	private MobileElement policytext;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/actionBarBack")
	private MobileElement helpback;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/login_selector_installation_id_continue")
	private MobileElement logincontinue;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/navigationBarBackButton")
	private MobileElement serviceback;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/acceptance_agree")
	private MobileElement termsandcondition;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/acceptance_cancel")
	private MobileElement cancel;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/terms_and_conditions_web_view")
	private MobileElement termsview;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/webView")
	private MobileElement policyview;
	
	
	public void needHelp() throws InterruptedException{
		click(needhelp);
		verifyText(helptext, "Need help?");
		click(onlinehelp);
		click(back);
		verifyText(call, "+1 (800) 890–0896");
		Thread.sleep(2000);
		click(terms);
		//termsview.isDisplayed();
		click(termsback);
		click(policy);
		Thread.sleep(2000);
		//policyview.isDisplayed();
		Thread.sleep(2000);
		click(back);
		click(helpback);
		System.out.println("I am there on Login Page");
	}

	 public void loginInValidUserInvalidPassword (String username, String password) throws InterruptedException{
		    click(loginButton1);
	        writeText(this.username,username);
	        writeText(this.password, password);
	        click(loginButton);
	        verifyText(incorrectloginpassword, "Could not login");
	        click(okbutton);
	    }
	 
	 public void loginInValidUservalidPassword (String username, String password) throws InterruptedException{
		    click(loginButton1);
	        writeText(this.username,username);
	        writeText(this.password, password);
	        click(loginButton);
	        Thread.sleep(2000);
	        verifyText(incorrectloginpassword, "Could not login");
	        click(okbutton);
	      
	    }
	 
	 public void loginValidUserInvalidPassword (String username, String password) throws InterruptedException{
		    click(loginButton1);
	        writeText(this.username,username);
	        writeText(this.password, password);
	        click(loginButton);
	        Thread.sleep(2000);
	        verifyText(incorrectloginpassword, "Could not login");
	        click(okbutton);
	        
	      
	    }
	 
	 public void forgetPassword (String forgetusername) throws InterruptedException{
		    click(loginButton1);
		    forget.click();
	        writeText(this.forgetusername,forgetusername);
	        resetpassword.click();
	        click(forgetclose);
	        Thread.sleep(2000);
	        
	    }
	 
	 
	   

	public void loginToClean (String username, String password) throws InterruptedException{
		    Thread.sleep(2000);
	        writeText(this.username,username);
	        Thread.sleep(2000);
	        writeText(this.password, password);
	        click(loginButton);
	       // click(termsandcondition); // Accepting acknowledgement for first time user
	        Thread.sleep(3000);
	        
	    }
	
	public void continueLogin () throws InterruptedException{
		Thread.sleep(2000);
		   click(serviceback);
		   click(logincontinue);
		   System.out.println("Login continue");
	        
	    }
	   
	
		}	

