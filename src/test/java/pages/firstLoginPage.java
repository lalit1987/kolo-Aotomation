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
	
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/username")
	private MobileElement username;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/password")
	private MobileElement password;
	
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/username")
	private MobileElement username1;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/password")
	private MobileElement password1;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/loginButton")
	private MobileElement loginButton;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/logout")
	private MobileElement logoutButton;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/actionBarTitle")
	private MobileElement AccountsTitle;
	
	
	@AndroidFindBy(id="android:id/message")
	private MobileElement incorrectloginpassword;
	
	@AndroidFindBy(id="android:id/button1")
	private MobileElement okbutton;
	

	 public void loginInValidUserInvalidPassword (String username1, String password1) throws InterruptedException{
	    	Thread.sleep(5000);
	        writeText(this.username1,username1);
	        writeText(this.password1, password1);
	        click(loginButton);
	        Thread.sleep(5000);
	        verifyText(incorrectloginpassword, "Log in failed - identity could not be verified");
	        //Assert.assertEquals(incorrectloginpassword.getText(), "Log in failed - identity could not be verified");
	        Thread.sleep(5000);
	        click(okbutton);
	    }

	public void loginToConnect (String username, String password) throws InterruptedException{
		   Thread.sleep(3000);
	        writeText(this.username,username);
	        writeText(this.password, password);
	        click(loginButton);
	        
	        Thread.sleep(8000);
	        
	    }
	   
		   public void verifyLoginSuccessfull () {
			   
			   logoutButton.isDisplayed();
			   AccountsTitle.isDisplayed();
		       
		    }
		}	

