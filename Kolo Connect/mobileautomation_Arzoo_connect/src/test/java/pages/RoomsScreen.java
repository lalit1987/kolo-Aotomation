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

public class RoomsScreen extends BasePage {

	
	public RoomsScreen(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	String randomName = UUID.randomUUID().toString().trim();
	
	
	@AndroidFindBy(className="android.widget.TextView")
	private MobileElement RoomTitle;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/dashboard_menu_edit")
	private MobileElement editButton;
	
	@AndroidFindBy(className="android.view.View")
	private MobileElement plusButton;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/nameEditText")
	private MobileElement nameTextField;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/create_form_menu_done")
	private MobileElement doneButton;
	
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/itemName'][contains(text(),randomName)]")
	private MobileElement allRooms;
	

	
//existing
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazooeditRoom']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionDelete']")
	private MobileElement RoomDeleteExisting;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/itemName'][contains(text(),'aazoonewRoom')]")
	private MobileElement RoomCreateExisting;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazoonewRoom']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionEdit']")
	private MobileElement RoomEditExisting;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazooeditRoom']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionClone']")
	private MobileElement RoomCloneExisting;
	
//	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazoocloneRoom']/following-sibling::android.widget.ImageButton[@index='0']")
//	private MobileElement RoomMoveClonedExisting;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/actionMove")
	private MobileElement RoomMoveClonedExisting;
	

	//new
	
	
	@AndroidFindBy(id="android:id/button1")
	private MobileElement confirmDeleteButton;
	
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/edit_form_menu_save")
	private MobileElement RoomEditSave;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazooclone1']")
	private MobileElement clonedRoom;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.teracode.koloconnect.staging:id/itemName'][contains(text(),'aazooclone2')]")
	private MobileElement allRoomsClone;
	

	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/accountDefaultSwitch")
	private MobileElement connectionSettingsToggleRoom;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/etSsid")
	private MobileElement connectionSettingsSSID;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/etSecurityType")
	private MobileElement securityType;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/etPassword")
	private MobileElement connectionPassword;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='WEP']")
	private MobileElement connectionWEP;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='There is already a room with this identifier:']")
	private MobileElement existingRoomError;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	private MobileElement OKButton;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	private MobileElement backButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aazooRoom']")
	private MobileElement clonedToBuilding;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='central']")
	private MobileElement movedToBuilding;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='roommove']")
	private MobileElement movedToFloor;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aarzroombuild']")
	private MobileElement buildingSelect;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aarzroomfloor']")
	private MobileElement floorSelect;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/filterNotCommissioned")
	private MobileElement notCommissioned;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/filterAll")
	private MobileElement All;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='clonecheck']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionClone']")
	private MobileElement RoomCloneExisting1;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='arzooneh']")
	private MobileElement clonedToBuilding1;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='arzooneh']")
	private MobileElement clonedToarzooneh;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='cloneRoomtoarzooneh']")
	private MobileElement clonedRoomToarzooneh;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='cloneRoomtoarzooneh']/following-sibling::android.widget.ImageButton[@resource-id='com.teracode.koloconnect.staging:id/actionDelete']")
	private MobileElement RoomDeleteCloned;
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/action_mode_close_button")
	private MobileElement backCloned;
	
	
	@AndroidFindBy(id="com.teracode.koloconnect.staging:id/roomTypeContainer")
	private MobileElement typeRoom;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Classroom']")
	private MobileElement typeRoom1;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Skip']")
	private MobileElement RoomSkip;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aarzroombuild']")
	private MobileElement clonedToRoom;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='aarzroomfloor']")
	private MobileElement clonedToRoom1;
	
	
public void verifyRoomSuccessfull () throws InterruptedException {
			   
	           Thread.sleep(3000);
	           
	           click(buildingSelect);
	           Thread.sleep(3000);
	           click(floorSelect);
	           
	           Thread.sleep(3000);
	
			   verifyText(RoomTitle, "aarzroomfloor");
		       
		    }

public void verifyNewRoomCreateRandom() throws InterruptedException {
	   
    
	   click(editButton);
	   Thread.sleep(2000);
	   click(plusButton);
	   Thread.sleep(5000);
	   writeText(nameTextField, randomName);
	   
	   Thread.sleep(2000);
	   
	   typeRoom.click();
	   typeRoom1.click();
	   connectionSettingsToggleRoom.click();
	   connectionSettingsSSID.clear();
	   
	   writeText(connectionSettingsSSID, "222");
	   
	   securityType.click();
	   
	   Thread.sleep(3000);
	   
	   
	   connectionWEP.click();
	   
	   Thread.sleep(2000);
	   writeText(connectionPassword, "abc123");
	   
	   click(doneButton);
	   Thread.sleep(20000);
	   //allRooms.isDisplayed();
	   System.out.println(randomName);
	   
	   System.out.println("create random Room successfull");
	   
	   RoomSkip.click();
	   System.out.println("Room skip successfull");
	   Thread.sleep(4000);
	   
	   backButton.click();
	   backButton.click();
}
		   
// existing functions
public void verifyNewExistingRoomCreate () throws InterruptedException {
	   
    
	   click(editButton);
	   Thread.sleep(2000);
	   click(plusButton);
	   Thread.sleep(5000);
	   writeText(nameTextField, "aazoonewRoom");
	   
	   Thread.sleep(2000);
	   
	   typeRoom.click();
	   typeRoom1.click();
	   click(doneButton);
	   
	   //RoomCreateExisting.isDisplayed();
	   System.out.println("Create existing successfull Room");
	   
	   RoomSkip.click();
	   Thread.sleep(13000);
	   System.out.println("Room skip successfull");
	   Thread.sleep(4000);
 }

public void verifyEditExistingRoom() throws InterruptedException {
	
    click(editButton);
    Thread.sleep(4000);
    click(RoomEditExisting);
    
    Thread.sleep(5000);
    nameTextField.clear();
    writeText(nameTextField, "aazooeditRoom");
    typeRoom.click();
	typeRoom1.click();
    
    
    click(RoomEditSave);

    Thread.sleep(12000);
    System.out.println("Edit existing successfull Room");
 

}



public void verifyCloneExistingRoom() throws InterruptedException {
	
    click(editButton);
    Thread.sleep(2000);
  
    click(RoomCloneExisting);
    
    Thread.sleep(2000);
    nameTextField.clear();
    writeText(nameTextField, "aazoocloneRoom");
    Thread.sleep(3000);
    
    testScroll();
    Thread.sleep(7000);
 
 

}

public void verifyCloneExistingRoom1() throws InterruptedException {
   clonedToRoom.click();
   clonedToRoom1.click();
   Thread.sleep(2000);
   click(doneButton);
    Thread.sleep(15000);
   System.out.println("Clone existing room successfully");
}

public void verifyDeleteExistingRoom() throws InterruptedException {
	
	//click(editButton);
	Thread.sleep(2000);
    click(editButton);
    Thread.sleep(4000);
  
    click(RoomDeleteExisting);
    
    Thread.sleep(3000);
    click(confirmDeleteButton);
    Thread.sleep(10000);
    System.out.println("Delete existing successfull Room");
 

}

public void verifyMoveExistingRoom() throws InterruptedException {
	
	//click(editButton);
	Thread.sleep(3000);
    click(editButton);
    

    click(RoomMoveClonedExisting);
    
    Thread.sleep(3000);
    movedToBuilding.click();
    movedToFloor.click();
    Thread.sleep(5000);
    click(doneButton);
    Thread.sleep(8000);
    System.out.println("Moved existing Room to building");
 

}


public void testScroll()throws InterruptedException 
{
    //driver.findElementByAccessibilityId("Views").click();
    AndroidElement list = (AndroidElement) driver.findElement(By.id("com.teracode.koloconnect.staging:id/buildingItem"));
    MobileElement listGroup = list
            .findElement(MobileBy
                    .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                            + "new UiSelector().text(\"aazooRoom\"));"));
    System.out.println(listGroup);
}


}

  
     
	



