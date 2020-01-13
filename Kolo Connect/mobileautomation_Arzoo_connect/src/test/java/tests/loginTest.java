package tests;

import org.testng.annotations.Test;

import pages.firstLoginPage;

public class loginTest extends BaseTest {
    
	private firstLoginPage firstLoginPage;
	
//	@Test(priority=0)
//	public  void loginInValidUserInvalidPassword() throws InterruptedException
//	{
//		firstLoginPage=new firstLoginPage(driver);
//		firstLoginPage.loginInValidUserInvalidPassword("arzoo.gupkj", "kgfugyf");
//	}
	
	@Test(priority=1)
	public  void firstLoginTest() throws InterruptedException
	{
		firstLoginPage=new firstLoginPage(driver);
		firstLoginPage.loginToConnect("arzoo.gupta@aricent.com", "Kolo1234");
	}
	
	@Test(priority=2)
	public  void verifyLoginisSuccessfull() throws InterruptedException
	{
		//firstLoginPage=new firstLoginPage(driver);
		firstLoginPage.verifyLoginSuccessfull();
	}
}
