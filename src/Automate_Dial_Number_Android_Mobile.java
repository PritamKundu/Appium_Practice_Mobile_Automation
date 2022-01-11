import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Automate_Dial_Number_Android_Mobile {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities Dc = new DesiredCapabilities();
		Dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		Dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		Dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		Dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pritam");
		
		//Install the Apps
		//Dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\PRITAM\\Downloads\\apkinfo.apk");
	    
		//Launch the Calculator Apps
		Dc.setCapability("appPackage", "com.android.dialer");
	    Dc.setCapability("appActivity", "com.android.dialer.app.DialtactsActivity");
		
	    URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,Dc);
	    
		driver.findElementById("com.android.dialer:id/fab").click();
		//driver.findElementByXPath("//android.widget.TextView[@content-desc='Phone']").click();
		
		Thread.sleep(5000);
		
		//Dial 01743739440
		driver.findElementById("com.android.dialer:id/zero").click(); //Zero
		driver.findElementById("com.android.dialer:id/one").click(); //One
		driver.findElementById("com.android.dialer:id/seven").click(); //seven
		driver.findElementById("com.android.dialer:id/four").click(); //four
		driver.findElementById("com.android.dialer:id/three").click(); //three
		driver.findElementById("com.android.dialer:id/seven").click(); //seven
		driver.findElementById("com.android.dialer:id/three").click(); //three
		driver.findElementById("com.android.dialer:id/nine").click(); //nine
		driver.findElementById("com.android.dialer:id/four").click(); //four
		driver.findElementById("com.android.dialer:id/four").click(); //four
		driver.findElementById("com.android.dialer:id/zero").click(); //Zero
		Thread.sleep(4000);
		
		//Dial Action button
		driver.findElementById("com.android.dialer:id/dialpad_floating_action_button").click();
		
		Thread.sleep(4000);
		
		driver.findElementById("com.android.dialer:id/incall_end_call").click();
        driver.getDeviceTime("300000");
	}

}
