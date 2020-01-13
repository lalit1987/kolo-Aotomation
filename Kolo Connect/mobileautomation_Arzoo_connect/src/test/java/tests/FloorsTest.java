package tests;

import org.testng.annotations.Test;

import pages.FloorsScreen;


public class FloorsTest extends BaseTest {
    
	private FloorsScreen FloorsScreen;
	
	@Test(priority=12)
	public  void verifyFloorsuccessfull() throws InterruptedException
	{
		FloorsScreen=new FloorsScreen(driver);
		FloorsScreen.verifyFloorSuccessfull();
	}
	
	//existing 
	
	
   @Test(priority=13)
   public  void verifyNewExistingFloorCreate() throws InterruptedException
   {
	   FloorsScreen.verifyNewExistingFloorCreate();
   }
  
   @Test(priority=14)
   public  void verifyEditExistingFloor() throws InterruptedException
   {
	   FloorsScreen.verifyEditExistingFloor();
   }
  
   @Test(priority=15)
   public  void verifyCloneExistingFloor() throws InterruptedException
   {
	   FloorsScreen.verifyCloneExistingFloor();
   }
   
   @Test(priority=16)
   public  void verifyCloneExistingFloor1() throws InterruptedException
   {
	   FloorsScreen.verifyCloneExistingFloor1();
   }
  
   
   @Test(priority=17)
   public  void verifyDeleteExistingFloor() throws InterruptedException
   {
  	 FloorsScreen.verifyDeleteExistingFloor();
   }
	
   @Test(priority=18)
   public  void verifyMoveExistingFloor() throws InterruptedException
   {
  	 FloorsScreen.verifyMoveExistingFloor();
   }
   
   @Test(priority=19)
     public  void verifyNewFloorCreateRandom() throws InterruptedException
   {
	   FloorsScreen.verifyNewFloorCreateRandom();
   }
   
	
	
   
	
	//additional skip for now
   
//   @Test(priority=15)
//   public  void verifyCloneToAnotherBuilding0() throws InterruptedException
//   {
//	   FloorsScreen.verifyCloneToAnotherBuilding0();
//   }
	
//   @Test(priority=16)
//   public  void verifyCloneToAnotherBuilding1() throws InterruptedException
//   {
//	   FloorsScreen.verifyCloneToAnotherBuilding1();
//   }
//   
//   @Test(priority=17)
//   public  void verifyCloneToAnotherBuilding2() throws InterruptedException
//   {
//	   FloorsScreen.verifyCloneToAnotherBuilding2();
//   }
//   
//   @Test(priority=18)
//   public  void verifyCloneToAnotherBuilding3() throws InterruptedException
//   {
//	   FloorsScreen.verifyCloneToAnotherBuilding3();
//   }



}
