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

public class DevicesScreen extends BasePage {

	
	public DevicesScreen(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	

	
	
	//devices
	
	@AndroidFindBy(className="android.widget.TextView")
	private MobileElement DevicesTitle;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aarzroombuild']")
	private MobileElement buildingSelect;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='devices floor']")
	private MobileElement floorSelect;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='devicesroom']")
	private MobileElement roomSelect;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/dashboard_menu_edit")
	private MobileElement editButton;
	
	@AndroidFindBy(className="android.view.View")
	private MobileElement plusButton;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/nameEditText")
	private MobileElement nameTextField;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/create_form_menu_done")
	private MobileElement doneButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Towel']")
	private MobileElement Towel;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Soap']")
	private MobileElement Soap;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='1']")
	private MobileElement amount;
	
	
	@AndroidFindBy(xpath="//com.teracode.koloconnect.staging:id/notCommissionedQuantity[@text='2']")
	private MobileElement notCommissionedQuantity;
	
public void verifyDevicesSuccessfull () throws InterruptedException {
			   
	         Thread.sleep(3000);
    
              click(buildingSelect);
              Thread.sleep(3000);
              click(floorSelect);
    
              Thread.sleep(3000);
              roomSelect.click();
              Thread.sleep(5000);
              
              editButton.click();
			  plusButton.click();
			  Thread.sleep(3000);
			  verifyText(DevicesTitle, "Add devices");
			  Thread.sleep(3000);
			  
			  Towel.click();
			  amount.click();
			  Soap.click();
			  amount.click();
			  
			  doneButton.click();
			  
			  Thread.sleep(3000);
			 
			  
		    }





}	

