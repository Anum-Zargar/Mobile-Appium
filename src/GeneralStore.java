
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
 
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
 
public class GeneralStore {
 
	AppiumDriver driver;
 
	@BeforeTest
	public AppiumDriver init() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "0797818a87d4f5cb");
		cap.setCapability(MobileCapabilityType.VERSION, "10.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability("chromedriverExecutable", "/Users/tyuiuy/node_modules/chromedriver/bin/chromedriver");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.androidsample.generalstore");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".SplashActivity");
 
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}
 
	@Test
	public void testcase1() throws InterruptedException {
 
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
 
		scrollToText("Argentina");
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
 
		List<MobileElement> addtocard = driver.findElements(By.xpath("//*[@text='ADD TO CART']"));
		addtocard.get(0).click();
	
		driver.findElement(By.xpath("//*[@text='Air Jordan 1 Mid SE']/..//*[@text='ADD TO CART']")).click();
		scrollToText("Jordan 6 Rings");
		driver.findElement(By.xpath("//*[@text='Jordan 6 Rings']/..//*[@text='ADD TO CART']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
 
		MobileElement checkBox = (MobileElement) driver.findElement(By.className("android.widget.CheckBox"));
		new TouchAction(driver).tap(tapOptions().withElement(element(checkBox)))
				.waitAction(waitOptions(Duration.ofMillis(250))).perform();
 
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
 
		Thread.sleep(4000);
		
		Set<String> contexts = driver.getContextHandles();
 
		for (String contextName : contexts)
		{
			System.out.println(contextName);
 
		}
 
		
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.name("q")).sendKeys("hello");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context("NATIVE_APP");
		Thread.sleep(4000);
 
	}
 
		@AfterTest
		public void tearDown()
		{
		driver.quit();
		}
		 
		public void scrollToText(String containedText)
		{
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));
		}
		}
