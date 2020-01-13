package tests;

import org.testng.annotations.Test;

import pages.BuildingsScreen;


public class BuildingsTest extends BaseTest {
    
	private BuildingsScreen buildingsScreen;
	
	@Test(priority=6)
	public  void verifyBuildingSuccessfull() throws InterruptedException
	{
		buildingsScreen=new BuildingsScreen(driver);
		buildingsScreen.verifyBuildingSuccessfull();
	}
	
	//existing 
	
//   @Test(priority=7)
//   public  void verifyNewExistingBuildingCreate() throws InterruptedException
//   {
//	   buildingsScreen.verifyNewExistingBuildingCreate();
//   }
   
   @Test(priority=8)
   public  void verifyEditExistingBuilding() throws InterruptedException
   {
	   buildingsScreen.verifyEditExistingBuilding();
   }
  

   @Test(priority=9)
   public  void verifyCloneExistingBuilding() throws InterruptedException
   {
	   buildingsScreen.verifyCloneExistingBuilding();
   }
   
   @Test(priority=10)
   public  void verifyDeleteExistingBuilding() throws InterruptedException
   {
	   buildingsScreen.verifyDeleteExistingBuilding();
   }
   
   @Test(priority=11)
   public  void verifyNewBuildingCreateRandom() throws InterruptedException
   {
	   buildingsScreen.verifyNewBuildingCreateRandom();
   }




}
