import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Automate_Messaging_Android {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities Dc = new DesiredCapabilities();
		Dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		Dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		Dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		Dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pritam");
		Dc.setCapability("noReset", "true");
		
		Dc.setCapability("appPackage", "com.samsung.android.messaging");
		Dc.setCapability("appActivity", "com.samsung.android.messaging.ui.view.main.WithActivity");

		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,Dc);
		Thread.sleep(4000);
		
		driver.findElementById("com.samsung.android.messaging:id/fab").click();
		WebElement Number = driver.findElementById("com.samsung.android.messaging:id/recipients_editor_to");
		Number.sendKeys("01753960263");
		
		//Number.click();
		WebElement Message = driver.findElementById("com.samsung.android.messaging:id/message_edit_text");
		Message.sendKeys("My Name is Pritam Kundu");
		
		
//		driver.findElementById("com.android.messaging:id/start_new_conversation_button").click();
//		Thread.sleep(4000);
//		driver.findElementById("com.android.messaging:id/action_ime_dialpad_toggle").click();
//		
//		Thread.sleep(3000);
//		WebElement Number = driver.findElementById("com.android.messaging:id/recipient_text_view");
//		Number.sendKeys("01743739440");
		
		driver.close();
		
	}

}
