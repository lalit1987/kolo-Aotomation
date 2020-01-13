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

public class serviceAreaPage extends BasePage {

	
	public serviceAreaPage(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/navigationBarBackButton")
	private MobileElement back;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/actionBarBack")
	private MobileElement areaback;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/selectionButton")
	private MobileElement deselect;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/continueButton")
	private MobileElement servicecontinue;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/checkbox")
	private MobileElement selectarea;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/navigationBarSelectLanguageButton")
	private MobileElement language;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Español']") 
	private MobileElement french;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='English']")
	private MobileElement english;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/selectionButton")
	private MobileElement selectall;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/nameTextView")
	private MobileElement serviceareaname;
	
	
	
     public void serviceArea () throws InterruptedException{
    	    Thread.sleep(2000);
    	    selectall.click();
    	    Thread.sleep(2000);
    	    servicecontinue.click();
    	    Thread.sleep(2000);
    	    areaback.click();
	    	System.out.println("Selected All and click on areas back button");
	    	 Thread.sleep(2000);
	    	deselect.click();
	    	Thread.sleep(3000);
	    	System.out.println("Deselected all service area");
	    	selectarea.click();
	    	Thread.sleep(3000);
	    	String service_name=serviceareaname.getText();
	    	System.out.println(service_name);
	    	System.out.println("Service Area selected and clicked on Continue button");
	    	
	    	Thread.sleep(2000);
	    	language.click();
	    	french.click();
	    	Thread.sleep(2000);
	    	language.click();
	    	french.click();
	    	System.out.println("French dropdown slected");
	    	language.click();
	    	english.click();
	    	System.out.println("English dropdown slected");
	    	Thread.sleep(3000);
	    	servicecontinue.click();
	    	System.out.println("Service Area selected and clicked on Continue button");
	    	Thread.sleep(3000);
	    	
	    	
	    }


		}	

