import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiAutomator extends Base{
	

	public static  void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement>  driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Text\")").click();
		//System.out.println(driver.findElementsByAndroidUIAutomator("new Uiselector.clickable(true)").size());
		
				

}
}