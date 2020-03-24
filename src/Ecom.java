import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageobjects.HomePage;
import pageobjects.dependencies;

public class Ecom extends Base{
	public static  void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement>  driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
        driver.hideKeyboard();
        driver.findElementByXPath("//*[@text='female']").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
        driver.findElementByXPath("//*[@text='Argentina']").click();
        //driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
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
