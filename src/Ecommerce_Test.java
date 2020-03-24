
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

	import io.appium.java_client.android.AndroidElement;
	import static io.appium.java_client.touch.TapOptions.tapOptions;
	import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
	import io.appium.java_client.touch.TapOptions;
	import io.appium.java_client.touch.offset.AbstractOptionCombinedWithPosition;
	import static io.appium.java_client.touch.offset.ElementOption.element;



	public class Ecommerce_Test  extends Base{



	public static void main(String[] args) throws MalformedURLException, InterruptedException {

	AndroidDriver<AndroidElement> driver=capabilities();

	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	     driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");

	     driver.hideKeyboard();

	     driver.findElement(By.xpath("//*[@text='Female']")).click();

	     driver.findElement(By.id("android:id/text1")).click();

	     

	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");

	  //   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     

	     driver.findElement(By.xpath("//*[@text='Argentina']")).click();

	     driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	    // driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
	     driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	     driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	     //com.androidsample.generalstore:id/appbar_btn_cart
	     //Thread.sleep(4000);

		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	     
	     Thread.sleep(4000);
	  /*  String Amount1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
	   //remove $ from $120
	  Amount1  =Amount1.substring(1);// Output will be 120.0 now
	  
    double Amount1value = Double.parseDouble(Amount1);//convert them to double as string cannot be added
	  String Amount2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
	   //remove $ from $160.97
	  Amount2  =Amount2.substring(1);// Output will be 160.97 now
	  double Amount2value = Double.parseDouble(Amount2);
	 // Convert these string to integers,we have to convert them to double datatype
	  double sumofProduct=Amount1value +Amount2value;
	 String totalamount= driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	   totalamount= totalamount.substring(1);//remove $ from total
	  double totalvalue= Double.parseDouble(totalamount);
	  System.out.println("Total Value of product " +totalvalue);
	 // Assert.assertEquals(sumofProduct,totalvalue);*/
	     driver.findElement(By.className("android.widget.CheckBox"));
	  //Mobile gestures
	 WebElement CheckBox=  driver.findElement(By.className("android.widget.CheckBox"));
	 TouchAction t = new TouchAction(driver);
	 t.tap(tapOptions().withElement(element(CheckBox))).perform();
	WebElement tc = driver.findElement(By.xpath("//*[@text='Please read our terms of conditions']"));
	t.longPress(longPressOptions().withElement(element(tc)).withDuration(ofSeconds(2))).release().perform();
	driver.findElement(By.id("//android:id/button1")).click();
	}

	}


