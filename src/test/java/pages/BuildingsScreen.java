package pages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.UUID;
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

public class BuildingsScreen extends BasePage {

	
	public BuildingsScreen(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@AndroidFindBy(className="android.widget.TextView")
	private MobileElement buildingTitle;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/dashboard_menu_edit")
	private MobileElement editButton;
	
	@AndroidFindBy(className="android.view.View")
	private MobileElement plusButton;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/nameEditText")
	private MobileElement nameTextField;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/create_form_menu_done")
	private MobileElement doneButton;
	
	
	
	String randomName = UUID.randomUUID().toString().trim();
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/itemName'][contains(text(),randomName)]")
	private MobileElement allBuildings;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/itemName'][contains(text(),randomName)]/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionDelete']")
	private MobileElement buildingDelete;
	
	@AndroidFindBy(id="android:id/button1")
	private MobileElement confirmDeleteButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/itemName'][contains(text(),randomName)]/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionEdit']")
	private MobileElement buildingEdit;
	
	
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/edit_form_menu_save")
	private MobileElement buildingEditSave;
	
public void verifyBuildingSuccessfull () {
			   
			   buildingTitle.isDisplayed();
			   verifyText(buildingTitle, "AricentNew");
		       
		    }
		   
 public void verifyNewBuildingCreate () throws InterruptedException {
			   
	           
			   click(editButton);
			   Thread.sleep(2000);
			   click(plusButton);
			   Thread.sleep(5000);
			   writeText(nameTextField, randomName);
			   
			   Thread.sleep(2000);
			   click(doneButton);
			   Thread.sleep(20000);
			   allBuildings.isDisplayed();
			   //verifyText(allBuildings, randomName);
			   System.out.println(randomName);
			   
			   System.out.println("Search successfull");
		    }

public void verifyDeleteBuilding() throws InterruptedException {
	
	       click(editButton);
	       Thread.sleep(4000);
	       buildingDelete.isDisplayed();
	       click(buildingDelete);
	       
	       Thread.sleep(3000);
	       click(confirmDeleteButton);
	       Thread.sleep(8000);
	       System.out.println("Delete successfull");
	    
	
}

public void verifyEditBuilding() throws InterruptedException {
	
    click(editButton);
    Thread.sleep(4000);
    //buildingDelete.isDisplayed();
    click(buildingEdit);
    
    Thread.sleep(5000);
    writeText(nameTextField, randomName);
    Thread.sleep(8000);
    
    click(buildingEditSave);
    Thread.sleep(8000);
    System.out.println("Edit successfull");
 

}
	}	

