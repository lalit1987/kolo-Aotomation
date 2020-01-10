package tests;

import org.testng.annotations.Test;

import pages.BuildingsScreen;


public class BuildingsTest extends BaseTest {
    
	private BuildingsScreen buildingsScreen;
	
	@Test(priority=7)
	public  void verifyBuildingSuccessfull() throws InterruptedException
	{
		buildingsScreen=new BuildingsScreen(driver);
		buildingsScreen.verifyBuildingSuccessfull();
	}
	

   @Test(priority=8)
   public  void verifyNewBuildingCreate() throws InterruptedException
   {
	   buildingsScreen.verifyNewBuildingCreate();
   }
   
   @Test(priority=9)
   public  void verifyEditBuilding() throws InterruptedException
   {
	   buildingsScreen.verifyEditBuilding();
   }
   
   
//   @Test(priority=10)
//   public  void verifyDeleteBuilding() throws InterruptedException
//   {
//	   buildingsScreen.verifyDeleteBuilding();
//   }
   

}
