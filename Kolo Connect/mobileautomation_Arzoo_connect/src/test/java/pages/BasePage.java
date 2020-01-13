package pages;

import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class BasePage {
	
	public static AppiumDriver driver;
	public static SoftAssert softAssert = new SoftAssert();
	
	
	//constructor
	public BasePage (AppiumDriver driver){
        this.driver = driver;
      
    }
	
	//Click Method
    public void click (MobileElement element) {
    	element.click();
    }

    //Write Text
    public void writeText (MobileElement element, String text) {
    	element.sendKeys(text);
    }
    
    
    
    public static void verifyText(MobileElement locator, String expectedText) {
    	
    	String actualText;
		try {
			actualText = locator.getText();
			if (actualText.equals(expectedText)) {
				Reporter.log("Passed : Actual Text:= [" + actualText + "] Expected Text:= [" + expectedText + "]");
				System.out
						.println("Passed : Actual Text:= [" + actualText + "] Expected Text:= [" + expectedText + "]");
			} else {
				Reporter.log("Failed : Actual Text:= [" + actualText + "] Expected Text:= [" + expectedText + "]");
				System.out
						.println("Failed : Actual Text:= [" + actualText + "] Expected Text:= [" + expectedText + "]");
				softAssert.assertEquals(actualText, expectedText);
				//softAssert.assertAll();
				throw new Exception("Expected string not matched" + actualText);
			}
		} catch (Exception error) {
			error.printStackTrace();
			Reporter.log(error.getMessage());
		}
    	
    }

}
