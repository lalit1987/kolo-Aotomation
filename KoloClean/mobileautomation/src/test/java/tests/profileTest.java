package tests;

import org.testng.annotations.Test;

import pages.profilePage;



public class profileTest extends BaseTest {
    
	private profilePage profilePage;
	
	@Test(priority=11)
	public  void profilePage() throws InterruptedException
	{
		profilePage = new profilePage(driver);
		profilePage.profilePageEdit("Ne", "Sh");
	}
	
	
}
