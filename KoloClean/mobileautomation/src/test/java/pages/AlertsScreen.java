package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AlertsScreen extends BasePage {
	public AlertsScreen(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub


}
	@AndroidFindBy(id="com.teracode.kolo.staging:id/actionBarTitle")
	private MobileElement alertScreenTitle;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/actionBarSelectLanguage")
	private MobileElement alertScreenLanguage;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/actionBarBack")
	private MobileElement backButtonAlerts;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/largeLabel")
	private MobileElement alertsBottomBar;
	
	@AndroidFindBy(id="com.teracode.kolo.staging:id/navigation")
	private MobileElement bottomNavigationBar;
	
	
	public void verifyAlertsScreen(){
		alertScreenTitle.isDisplayed();
		alertScreenLanguage.isDisplayed();
		backButtonAlerts.isDisplayed();
		alertsBottomBar.isDisplayed();
		bottomNavigationBar.isDisplayed();
		
		
		
	}
	
	
	
}
