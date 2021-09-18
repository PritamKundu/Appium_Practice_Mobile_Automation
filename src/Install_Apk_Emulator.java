import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Install_Apk_Emulator {

	public static void main(String[] args) throws MalformedURLException {
		

		DesiredCapabilities Dc = new DesiredCapabilities();
		Dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		Dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		Dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		Dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		Dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\PRITAM\\Downloads\\Calculator_v7.8.apk");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,Dc);
		driver.close();
		
	}

}
