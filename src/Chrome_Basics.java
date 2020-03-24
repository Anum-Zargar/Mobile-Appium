import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Chrome_Basics extends Base_Chrome {
	public static  void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement>  driver=capabilities();
		driver.get("http://google.com");
	

}
}
