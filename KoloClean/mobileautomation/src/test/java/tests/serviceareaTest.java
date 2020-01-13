package tests;

import org.testng.annotations.Test;

import pages.serviceAreaPage;


public class serviceareaTest extends BaseTest {
    
	private serviceAreaPage serviceAreaPage;
	
	@Test(priority=10)
	public  void serviceArea() throws InterruptedException
	{
		serviceAreaPage = new serviceAreaPage(driver);
		serviceAreaPage.serviceArea();
	}
	
	
}
