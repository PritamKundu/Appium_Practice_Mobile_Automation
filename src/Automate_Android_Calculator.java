import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Automate_Android_Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
			
			DesiredCapabilities Dc = new DesiredCapabilities();
			Dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			Dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			Dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
			Dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pritam");
			
			//Install the Apps
			//Dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\PRITAM\\Downloads\\apkinfo.apk");
		    
			//Launch the Calculator Apps
			Dc.setCapability("appPackage", "com.google.android.calculator");
		    Dc.setCapability("appActivity", "com.android.calculator2.Calculator");
			
		    URL url = new URL("http://localhost:4723/wd/hub");
			AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,Dc);
		    
			WebElement Seven = driver.findElementById("com.google.android.calculator:id/digit_7");
			Seven.click(); //Seven Button
			
			driver.findElementById("com.google.android.calculator:id/op_sub").click(); //Subtarct
			
			WebElement Three = driver.findElementById("com.google.android.calculator:id/digit_3");
			Three.click(); //Three Button
			
			driver.findElementById("com.google.android.calculator:id/eq").click(); //Equal
			Thread.sleep(4000);
			
			String results = driver.findElementById("com.google.android.calculator:id/result_final").getText();
			
			if(results.equals("4"))
			
			{
				System.out.println("Test Passed..");
			}
			else
			{
				System.out.println("Test Failed..");
			}
			
			
			
			
		}

	}


