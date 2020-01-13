package tests;

import org.testng.annotations.Test;

import pages.helpPage;



public class helpTest extends BaseTest {
    
	private helpPage helpPage;
	
	@Test(priority=12)
	public  void profilePage() throws InterruptedException
	{
		helpPage = new helpPage(driver);
		helpPage.helpPage();
	}
	
	
}
