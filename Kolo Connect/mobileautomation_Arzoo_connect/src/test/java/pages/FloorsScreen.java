
package pages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

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

public class FloorsScreen extends BasePage {

	
	public FloorsScreen(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	String randomName = UUID.randomUUID().toString().trim();
	
	
	@AndroidFindBy(className="android.widget.TextView")
	private MobileElement FloorTitle;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/dashboard_menu_edit")
	private MobileElement editButton;
	
	@AndroidFindBy(className="android.view.View")
	private MobileElement plusButton;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/nameEditText")
	private MobileElement nameTextField;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/create_form_menu_done")
	private MobileElement doneButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/itemName'][contains(text(),randomName)]")
	private MobileElement allFloors;
	
	
//existing
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazooeditfloor']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionDelete']")
	private MobileElement FloorDeleteExisting;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/itemName'][contains(text(),'aazoonewfloor')]")
	private MobileElement FloorCreateExisting;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazoonewfloor']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionEdit']")
	private MobileElement FloorEditExisting;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazooeditfloor']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionClone']")
	private MobileElement FloorCloneExisting;
	

	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/actionMove")
	private MobileElement FloorMoveClonedExisting;
	//new
	
	
	@AndroidFindBy(id="android:id/button1")
	private MobileElement confirmDeleteButton;
	

	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/edit_form_menu_save")
	private MobileElement FloorEditSave;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazooclone1']")
	private MobileElement clonedFloor;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/itemName'][contains(text(),'aazooclone2')]")
	private MobileElement allFloorsClone;
	

	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/accountDefaultSwitch")
	private MobileElement connectionSettingsToggleFloor;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/etSsid")
	private MobileElement connectionSettingsSSID;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/etSecurityType")
	private MobileElement securityType;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/etPassword")
	private MobileElement connectionPassword;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='WEP']")
	private MobileElement connectionWEP;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='There is already a floor with that name in the selected building.']")
	private MobileElement existingFloorError;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	private MobileElement OKButton;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	private MobileElement backButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazoofloor']")
	private MobileElement clonedToBuilding;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='central']")
	private MobileElement movedToBuilding;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazoofloor']")
	private MobileElement buildingSelect;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/filterNotCommissioned")
	private MobileElement notCommissioned;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/filterAll")
	private MobileElement All;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='clonecheck']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionClone']")
	private MobileElement FloorCloneExisting1;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='arzooneh']")
	private MobileElement clonedToBuilding1;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='arzooneh']")
	private MobileElement clonedToarzooneh;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='clonefloortoarzooneh']")
	private MobileElement clonedfloorToarzooneh;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='clonefloortoarzooneh']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionDelete']")
	private MobileElement FloorDeleteCloned;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/action_mode_close_button")
	private MobileElement backCloned;
	
	
	
	
public void verifyFloorSuccessfull () throws InterruptedException {
			   
	           Thread.sleep(3000);
	           notCommissioned.click();
	           All.click();
	           click(buildingSelect);
	           Thread.sleep(8000);
			   FloorTitle.isDisplayed();
			   verifyText(FloorTitle, "aazoofloor");
		       
		    }

public void verifyNewFloorCreateRandom() throws InterruptedException {
	   
    
	   click(editButton);
	   Thread.sleep(2000);
	   click(plusButton);
	   Thread.sleep(5000);
	   writeText(nameTextField, randomName);
	   
	   Thread.sleep(2000);
	   connectionSettingsToggleFloor.click();
	   connectionSettingsSSID.clear();
	   
	   writeText(connectionSettingsSSID, "222");
	   
	   securityType.click();
	   
	   Thread.sleep(3000);
	   
	   
	   connectionWEP.click();
	   
	   Thread.sleep(2000);
	   writeText(connectionPassword, "abc123");
	   
	   click(doneButton);
	   Thread.sleep(20000);
	   //allFloors.isDisplayed();
	   System.out.println(randomName);
	   
	   System.out.println("create random floor successfull");
	   
	   backButton.click();
	   
	   Thread.sleep(8000);
	   
	   
}
		   
// existing functions
public void verifyNewExistingFloorCreate () throws InterruptedException {
	   
    
	   click(editButton);
	   Thread.sleep(2000);
	   click(plusButton);
	   Thread.sleep(5000);
	   writeText(nameTextField, "aazoonewfloor");
	   
	   Thread.sleep(2000);
	   click(doneButton);
	   Thread.sleep(17000);
	   //FloorCreateExisting.isDisplayed();
	   
	   click(editButton);
	   Thread.sleep(2000);
	   click(plusButton);
	   Thread.sleep(5000);
	   writeText(nameTextField, "aazoonewfloor");
	   
	   click(doneButton);
	   Thread.sleep(2000);
	   existingFloorError.isDisplayed();
	   OKButton.click();
	   
	   Thread.sleep(3000);
	   backButton.click();
	   
	   
	   Thread.sleep(5000);
	   click(editButton);
	   
	  
	   System.out.println("create existing Floor successfull with existing Floor error check");
 }

public void verifyEditExistingFloor() throws InterruptedException {
	
    click(editButton);
    Thread.sleep(4000);
    click(FloorEditExisting);
    
    Thread.sleep(5000);
    nameTextField.clear();
    writeText(nameTextField, "aazooeditfloor");
    Thread.sleep(8000);
    
    click(FloorEditSave);
    Thread.sleep(18000);
    System.out.println("Edit existing successfull floor");
 

}



public void verifyCloneExistingFloor() throws InterruptedException {
	
    click(editButton);
    Thread.sleep(2000);
  
    click(FloorCloneExisting);
    
    Thread.sleep(2000);
    nameTextField.clear();
    writeText(nameTextField, "aazooclonefloor");
    Thread.sleep(3000);
    
    testScroll();
    Thread.sleep(7000);
 
 

}

public void verifyCloneExistingFloor1() throws InterruptedException {
   clonedToBuilding.click();
   Thread.sleep(2000);
   click(doneButton);
    Thread.sleep(15000);
   System.out.println("Clone existing successfull  successfully");
}

public void verifyDeleteExistingFloor() throws InterruptedException {
	
	//click(editButton);
	Thread.sleep(2000);
    click(editButton);
    Thread.sleep(4000);
  
    click(FloorDeleteExisting);
    
    Thread.sleep(3000);
    click(confirmDeleteButton);
    Thread.sleep(10000);
    System.out.println("Delete existing successfull floor");
 

}

public void verifyMoveExistingFloor() throws InterruptedException {
	
	click(editButton);
	Thread.sleep(3000);
    click(editButton);
    

    click(FloorMoveClonedExisting);
    
    Thread.sleep(3000);
    movedToBuilding.click();
    Thread.sleep(2000);
    click(doneButton);
    Thread.sleep(8000);
    System.out.println("Moved existing floor to building");
 

}



//skip all for now
public void testScroll()throws InterruptedException 
{
    //driver.findElementByAccessibilityId("Views").click();
    AndroidElement list = (AndroidElement) driver.findElement(By.id("com.teracode.koloconnect.staging:id/buildingItem"));
    MobileElement listGroup = list
            .findElement(MobileBy
                    .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                            + "new UiSelector().text(\"aazoofloor\"));"));
    System.out.println(listGroup);
}

public void testScroll1()throws InterruptedException 
{

    AndroidElement list = (AndroidElement) driver.findElement(By.id("com.teracode.koloconnect.staging:id/itemName"));
    MobileElement listGroup = list
            .findElement(MobileBy
                    .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                            + "new UiSelector().text(\"clonefloortoarzooneh\"));"));
    System.out.println(listGroup);
}

public void testScroll2()throws InterruptedException 
{

    AndroidElement list = (AndroidElement) driver.findElement(By.id("com.teracode.koloconnect.staging:id/itemName"));
    MobileElement listGroup = list
            .findElement(MobileBy
                    .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                            + "new UiSelector().text(\"arzooneh\"));"));
    System.out.println(listGroup);
}


public void verifyCloneToAnotherBuilding0() throws InterruptedException {
	
	Thread.sleep(3000);
  click(editButton);
  
  click(FloorCloneExisting1);
  
  Thread.sleep(2000);
  nameTextField.clear();
  writeText(nameTextField, "clonefloortoarzooneh");
  Thread.sleep(3000);
  
  clonedToBuilding1.click();
  Thread.sleep(3000);
  click(doneButton);
   Thread.sleep(8000);
   
   click(backButton);
	
}


public void verifyCloneToAnotherBuilding1() throws InterruptedException {
	  Thread.sleep(12000);
	     testScroll2();
	     Thread.sleep(5000);
	}

public void verifyCloneToAnotherBuilding2() throws InterruptedException {
	

     clonedToarzooneh.click();
     Thread.sleep(5000);
     testScroll1();
     
     
}
     
   public void verifyCloneToAnotherBuilding3() throws InterruptedException {
     Thread.sleep(7000);
     clonedfloorToarzooneh.isDisplayed(); 
     System.out.println("Cloned to other building successfull");
     
    
     
     
      
   }
}
  
     
	



