package tests;

import org.testng.annotations.Test;

import pages.firstLoginPage;
import pages.BasePage;
import pages.ForgotPassword;

public class ForgotPasswordtest extends BaseTest {
    
	private ForgotPassword forgotPassword;
	
//	@Test(priority=0)
//	public  void loginInValidUserInvalidPassword() throws InterruptedException
//	{
//		forgotPassword=new ForgotPassword(driver);
//		forgotPassword.sendwrongemailforgotpassword("vaishnavi.diggavi11@aricent.com");
//	}
	
	@Test(priority=1)
	public  void sendemailforgotpassword() throws InterruptedException
	{
		forgotPassword=new ForgotPassword(driver);
		forgotPassword.sendemailforgotpassword("vaishnavi.diggavi@altran.com");
	}
	
}
