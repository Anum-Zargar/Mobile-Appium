import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.prefs.Preferences;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import pageobjects.HomePage;
import pageobjects.dependencies;


public class Basic_Xpath extends Base{
	
	public static  void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement>  driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		//IS to call driver object from testcase to objectfile
		HomePage h =new HomePage(driver);
		h.Preferences.click();
		//constructor of class will be invoked when you create object of the class
		//default constructor will be call
		//constructor can be defined with arguments
		dependencies p =new dependencies(driver);
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference dependencies']").click();
		p.Preferencedependencies.click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("//android.widget.RelativeLayout[2]").click();
		driver.findElementByClassName("//android.widget.EditText").sendKeys("Anum");
		driver.findElementById("android:id/button1").click();
		//driver.findElementsByClassName("//android.widget.Button").get(1).click();
		h.buttons.get(1).click();
	}

	
	
	

}
