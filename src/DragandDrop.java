import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.AbstractOptionCombinedWithPosition;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
public class DragandDrop  extends Base{
	

	public static  void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement>  driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		WebElement source=driver.findElementsByClassName("android.view.View").get(0);
		WebElement destination=driver.findElementsByClassName("android.view.View").get(1);
		
		TouchAction t = new TouchAction(driver);
		//For drag and drop move,longpress,release,perfrom
		t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		
}
}
