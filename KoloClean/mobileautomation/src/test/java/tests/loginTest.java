package tests;

import org.testng.annotations.Test;

import pages.firstLoginPage;

public class loginTest extends BaseTest {
    
	private firstLoginPage firstLoginPage;
	
	@Test(priority=3)
	public  void needHelplink() throws InterruptedException
	{   
		firstLoginPage=new firstLoginPage(driver);
		firstLoginPage.needHelp();
		System.out.println("Need Help successful");
	}
	
	@Test(priority=4)
	public  void loginInValidUserInvalidPassword() throws InterruptedException
	{
		firstLoginPage.loginInValidUserInvalidPassword("neha.gupkj", "kgfugyf");
		System.out.println("loginInValidUserInvalidPassword");
		
	}
	
	@Test(priority=5)
	public  void loginInValidUservalidPasswords() throws InterruptedException
	{
		firstLoginPage.loginInValidUservalidPassword("neha.gupkj", "Kolo1234");
		System.out.println("loginInValidUservalidPasswords");
	}
	
	@Test(priority=6)
	public  void loginValidUserInvalidPasswords() throws InterruptedException
	{
		firstLoginPage.loginValidUserInvalidPassword("neha4.sharma@aricent.com", "kgfugyf");
		System.out.println("loginValidUserInvalidPasswords");
	}
	
	@Test(priority=7)
	public  void forgetPasswordLink() throws InterruptedException
	{
		firstLoginPage.forgetPassword("neha4.sharma@aricent.com");
		System.out.println("forgetpassword");
	}
	
	@Test(priority=8)
	public  void firstLoginTest() throws InterruptedException
	{   
		firstLoginPage.loginToClean("arzoo.gupta@aricent.com", "Kolo1234");
		System.out.println("Successful Login");
	}
	
	@Test(priority=9)
	public  void loginContinue() throws InterruptedException
	{
		firstLoginPage.continueLogin();
		
	}
	
	
}
