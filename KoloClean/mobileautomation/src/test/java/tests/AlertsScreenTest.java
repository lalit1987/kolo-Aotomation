package tests;

import org.testng.annotations.Test;
import pages.AlertsScreen;
import pages.AccountsScreen;

public class AlertsScreenTest extends BaseTest{
	private AlertsScreen alertsScreen;
	
@Test(priority=3)	
public void verifyAlertsScreen() throws InterruptedException{
	alertsScreen = new AlertsScreen(driver);
	alertsScreen.verifyAlertsScreen();
	
}
}
