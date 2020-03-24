import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	//public static AndroidDriver<AndroidElement> main1(String[] args) throws MalformedURLException {
		//public static void  main(String[] args) throws MalformedURLException {
		public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException{
	
	AndroidDriver<AndroidElement>  driver;
	
	// TODO Auto-generated method stub
	File appDir = new File("src");
	     //File app = new File(appDir, "ApiDemos-debug.apk");
	     File app = new File(appDir, "General-Store.apk");
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Anum");
	     capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	     capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"14");	 
	     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	   
	   return driver;
}
}

	   















