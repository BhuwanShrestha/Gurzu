package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.VERSION,"10");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus5");
		cap.setCapability(MobileCapabilityType.UDID, "e1ed9d42");
	//	cap.setCapability(MobileCapabilityType.APP, "");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		URL url = new URL("https://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,cap);
	}
	
	@Test
	public void testClass() {
		System.out.println("test");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
