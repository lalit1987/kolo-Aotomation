package tests;

import org.testng.annotations.Test;

import pages.RoomsScreen;


public class RoomsTest extends BaseTest {
    
	private RoomsScreen RoomsScreen;
	
	@Test(priority=20)
	public  void verifyRoomSuccessfull() throws InterruptedException
	{
		RoomsScreen=new RoomsScreen(driver);
		RoomsScreen.verifyRoomSuccessfull();
	}
	
	//existing 
	
	 @Test(priority=21)
	   public  void verifyNewExistingRoomCreate() throws InterruptedException
	   {
		   RoomsScreen.verifyNewExistingRoomCreate();
	   }
  
   
   @Test(priority=22)
   public  void verifyEditExistingRoom() throws InterruptedException
   {
	   RoomsScreen.verifyEditExistingRoom();
   }
   
   @Test(priority=23)
   public  void verifyCloneExistingRoom() throws InterruptedException
   {
	   RoomsScreen.verifyCloneExistingRoom();
   }
   
   @Test(priority=24)
   public  void verifyCloneExistingRoom1() throws InterruptedException
   {
	   RoomsScreen.verifyCloneExistingRoom1();
   }
  
   @Test(priority=25)
   public  void verifyDeleteExistingRoom() throws InterruptedException
   {
  	 RoomsScreen.verifyDeleteExistingRoom();
   }
	
   @Test(priority=26)
   public  void verifyMoveExistingRoom() throws InterruptedException
   {
  	 RoomsScreen.verifyMoveExistingRoom();
   }
   
   @Test(priority=27)
   public  void verifyNewRoomCreateRandom() throws InterruptedException
   {
	   RoomsScreen.verifyNewRoomCreateRandom();
   }
	

}
