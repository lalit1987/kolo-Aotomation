package tests;

import org.testng.annotations.Test;

import pages.firstLoginPage;
import pages.splash;

public class splashTest extends BaseTest {
    
	private splash splash;
	
	@Test(priority=0)
	public  void spalshScreens() throws InterruptedException
	{
		splash=new splash(driver);
		splash.splashScreen();
	}
	
	@Test(priority=1)
	public  void verifysSplash() throws InterruptedException
	{
		splash.verifySplash();
	}
}
