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

public class Swipe extends Base{
	

	public static  void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement>  driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		//((RemoteWebElement) driver.findElementsByXPath("//android.widget.TextView[@text='Views']")).click();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2.Inline\")").click();
		WebElement first =driver.findElementByXPath("//*[@content-desc='45']");
		WebElement second =driver.findElementByXPath("//*[@content-desc='15']");
		TouchAction t = new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
}
}