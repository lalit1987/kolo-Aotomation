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

public class ForgotPassword extends BasePage {


	public ForgotPassword(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/forgotPassword")
	private MobileElement forgotpassword;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/email")
	private MobileElement enteremail;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/forgotPasswordButton")
	private MobileElement submitbutton;
	
	@AndroidFindBy(id="android:id/button1")
	private MobileElement okbutton;
	
	@AndroidFindBy(id="android:id/message")
	private MobileElement  invalidusermsg;
	
	public void sendwrongemailforgotpassword (String enteremail) throws InterruptedException{
    	Thread.sleep(2000);
    	click(forgotpassword);
        writeText(this.enteremail,"vaishnavi.diggavi11@aricent.com");
        click(submitbutton);
        Thread.sleep(5000);
        verifyText(invalidusermsg, "User vaishnavi.diggavi11@aricent.com does not exist");
        click(okbutton);
	}
	public void sendemailforgotpassword (String enteremail) throws InterruptedException{
    	Thread.sleep(5000);
    	click(forgotpassword);
    	driver.findElement(By.id("com.teracode.koloconnect.staging:id/email")).clear();
        writeText(this.enteremail,"vaishnavi.diggavi@altran.com");
        click(submitbutton);
        Thread.sleep(5000);
        click(okbutton);
	}
	
}
	
	
	
        
        
	
	
	
	
