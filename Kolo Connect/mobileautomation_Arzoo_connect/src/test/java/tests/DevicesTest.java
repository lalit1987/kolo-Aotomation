package tests;

import org.testng.annotations.Test;

import pages.DevicesScreen;
import pages.firstLoginPage;

public class DevicesTest extends BaseTest {
    
	private DevicesScreen DevicesScreen;
	
	@Test(priority=14)
	public  void verifyDevicesuccessfull() throws InterruptedException
	{
		DevicesScreen=new DevicesScreen(driver);
		DevicesScreen.verifyDevicesSuccessfull();
	}


}
