package pages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BuildingsScreen extends BasePage {

	
	public BuildingsScreen(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	String randomName = UUID.randomUUID().toString().trim();
	
	//UUID uuid = UUID.randomUUID();
	//String randomName1 =UUID.randomUUID().Long.toString(uuid.getMostSignificantBits(),94) + Long.toString(uuid.getLeastSignificantBits(),94);
	//String s = Long.toString(uuid.getMostSignificantBits(), 94) + '-' + Long.toString(uuid.getLeastSignificantBits(), 94);
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='AricentNew']")
	private MobileElement buildingTitle;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/dashboard_menu_edit")
	private MobileElement editButton;
	
	@AndroidFindBy(className="android.view.View")
	private MobileElement plusButton;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/nameEditText")
	private MobileElement nameTextField;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/create_form_menu_done")
	private MobileElement doneButton;
	
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/itemName'][contains(text(),randomName)]")
	private MobileElement allBuildings;
	
	
//	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/itemName'][contains(text(),randomName)]/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionDelete']")
//	private MobileElement buildingDelete;
	
//existing
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazooedit']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionDelete']")
	private MobileElement buildingDeleteExisting;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/itemName'][contains(text(),'aazoonew')]")
	private MobileElement buildingCreateExisting;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazoonew']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionEdit']")
	private MobileElement buildingEditExisting;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazooedit']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionClone']")
	private MobileElement buildingCloneExisting;
	
	//new
	
	
	@AndroidFindBy(id="android:id/button1")
	private MobileElement confirmDeleteButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='randomName']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionEdit']")
	private MobileElement buildingEdit;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='randomName']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionDelete']")
	private MobileElement buildingDelete;
	
	
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/edit_form_menu_save")
	private MobileElement buildingEditSave;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazooclone1']")
	private MobileElement clonedBuilding;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/itemName'][contains(text(),'aazooclone2')]")
	private MobileElement allBuildingsClone;
	

	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/accountDefaultSwitch")
	private MobileElement connectionSettingsToggleBuilding;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/etSsid")
	private MobileElement connectionSettingsSSID;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/etSecurityType")
	private MobileElement securityType;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/etPassword")
	private MobileElement connectionPassword;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='WEP']")
	private MobileElement connectionWEP;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='There is already a building with that name in the selected account.']")
	private MobileElement existingBuildingError;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	private MobileElement OKButton;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	private MobileElement backButton;
	
	
	
	
	
	
public void verifyBuildingSuccessfull () throws InterruptedException {
			   
			   buildingTitle.isDisplayed();
			   verifyText(buildingTitle, "AricentNew");

			   
		    }

public void verifyNewBuildingCreateRandom() throws InterruptedException {
	   
    
	   click(editButton);
	   Thread.sleep(2000);
	   click(plusButton);
	   Thread.sleep(5000);
	   writeText(nameTextField, randomName);
	   
	   Thread.sleep(2000);
	   connectionSettingsToggleBuilding.click();
	   connectionSettingsSSID.clear();
	   
	   writeText(connectionSettingsSSID, "222");
	   
	   securityType.click();
	   
	   Thread.sleep(3000);
	   
	   
	   connectionWEP.click();
	   
	   Thread.sleep(2000);
	   writeText(connectionPassword, "abc123");
	   
	   click(doneButton);
	   Thread.sleep(20000);
	   //allBuildings.isDisplayed();
	   System.out.println(randomName);
	   
	   System.out.println("create random successfull");
}
		   
// existing functions
public void verifyNewExistingBuildingCreate () throws InterruptedException {
	   
    
	   click(editButton);
	   Thread.sleep(2000);
	   click(plusButton);
	   Thread.sleep(5000);
	   writeText(nameTextField, "aazoonew");
	   
	   Thread.sleep(2000);
	   click(doneButton);
	   Thread.sleep(17000);
	   //buildingCreateExisting.isDisplayed();
	   
	   click(editButton);
	   Thread.sleep(2000);
	   click(plusButton);
	   Thread.sleep(5000);
	   writeText(nameTextField, "aazoonew");
	   
	   click(doneButton);
	   Thread.sleep(2000);
	   existingBuildingError.isDisplayed();
	   OKButton.click();
	   
	   Thread.sleep(3000);
	   backButton.click();
	   
	   
	   Thread.sleep(5000);
	   click(editButton);   
	   click(editButton);
	   
       
       Thread.sleep(4000);
	   System.out.println("create existing building successfull with existing building error check");
	   
 }

public void verifyEditExistingBuilding() throws InterruptedException {
	
    //click(editButton);
	
	//testScroll1();
    Thread.sleep(4000);
    click(buildingEditExisting);
    
    Thread.sleep(5000);
    nameTextField.clear();
    writeText(nameTextField, "aazooedit");
    Thread.sleep(8000);
    
    click(buildingEditSave);
    Thread.sleep(18000);
    System.out.println("Edit existing successfull");
 

}



public void verifyCloneExistingBuilding() throws InterruptedException {
	
    click(editButton);
    Thread.sleep(4000);
    //buildingDelete.isDisplayed();
    click(buildingCloneExisting);
    
    Thread.sleep(5000);
    nameTextField.clear();
    writeText(nameTextField, "aazooclone6");
    Thread.sleep(4000);
    click(doneButton);
    Thread.sleep(18000);
    //allBuildingsClone.isDisplayed();
    System.out.println("Clone existing successfull");
 

}

public void verifyDeleteExistingBuilding() throws InterruptedException {
	
    click(editButton);
    Thread.sleep(4000);
    //buildingDelete.isDisplayed();
    click(buildingDeleteExisting);
    
    Thread.sleep(3000);
    click(confirmDeleteButton);
    Thread.sleep(10000);
    System.out.println("Delete existing successfull");
 

}


public void testScroll1()throws InterruptedException 
{

    AndroidElement list = (AndroidElement) driver.findElement(By.id("com.teracode.koloconnect.staging:id/itemName"));
    MobileElement listGroup = list
            .findElement(MobileBy
                    .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                            + "new UiSelector().text(\"aazoonew\"));"));
    System.out.println(listGroup);
}


}
