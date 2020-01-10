package tests;

import org.testng.annotations.Test;

import pages.AccountsScreen;
import pages.firstLoginPage;

public class AccountsTest extends BaseTest {
    
	private AccountsScreen accountsScreen;
	
	@Test(priority=2)
	public  void verifyAccountSuccessfull() throws InterruptedException
	{
		accountsScreen=new AccountsScreen(driver);
		accountsScreen.verifyAccountSuccessfull();
	}
	


//	@Test(priority=3)
//	public  void verifyTermsConditionSuccessfull() throws InterruptedException
//	{
//		
//		accountsScreen.verifyTermsConditionSuccessfull();
//	}
//	  @Test(priority=4)
//	  public  void verifyNeedHelpSuccessfull() throws InterruptedException
//	{
//		accountsScreen.verifyNeedHelpSuccessfull();
//	}
	  
//	  @Test(priority=5)
//	  public  void verifyPrivacyPolicySuccessfull() throws InterruptedException
//	{
//		accountsScreen.verifyPrivacyPolicySuccessfull();
//	}

  @Test(priority=6)
   public  void verifyAccountSearchSuccessfull() throws InterruptedException
{
	  
	accountsScreen.verifyAccountSearchSuccessfull();
}


}
