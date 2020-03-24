import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.AbstractOptionCombinedWithPosition;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
public class gestures extends Base{
	

	public static  void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement>  driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		//((RemoteWebElement) driver.findElementsByXPath("//android.widget.TextView[@text='Views']")).click();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		TouchAction t = new TouchAction(driver);
		WebElement expandlist = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandlist))).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement pn =driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
		Thread.sleep(2000);
}
	
}