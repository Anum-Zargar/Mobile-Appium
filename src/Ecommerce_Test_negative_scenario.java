

	import java.net.MalformedURLException;

	import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;



	import io.appium.java_client.MobileBy;

	import io.appium.java_client.android.AndroidDriver;

	import io.appium.java_client.android.AndroidElement;



	public class Ecommerce_Test_negative_scenario  extends Base{



	public static void main(String[] args) throws MalformedURLException, InterruptedException {

	AndroidDriver<AndroidElement> driver=capabilities();

	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    // driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");

	   //  driver.hideKeyboard();

	     driver.findElement(By.xpath("//*[@text='Female']")).click();

	     driver.findElement(By.id("android:id/text1")).click();

	     

	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");

	  //   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     

	     driver.findElement(By.xpath("//*[@text='Argentina']")).click();

	     driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	     String toastmessage =driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
	     System.out.println(" Toast messsage " + toastmessage);
	   //  Asserts.assertEquals("Please enter your name" ,toastmessage);//Actual message to validate
	   

	    }

	}


