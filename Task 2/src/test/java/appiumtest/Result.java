package appiumtest;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Result {
	
	WebDriver driver;
	
	DesiredCapabilities cap = new DesiredCapabilities();
	
	@BeforeTest
	public void initConfig() {
		cap.setCapability("deviceName", "OnePlus5");
		cap.setCapability("udid", "e1ed9d42");
		cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(CapabilityType.VERSION, "10");
		
		}
	
	@Test
	public void testApp() throws IOException {
		driver = new RemoteWebDriver(new URL("https://127.0.0.1:4723/wd/hub"),cap);
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("2+2");
		driver.findElement(By.xpath("//div[@class='PaQdxb UpZIS']")).click();
		this.takeSnapShot(driver, "c://test.png") ;
	}

	private void takeSnapShot(WebDriver driver, String fileWithPath) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	
	

}
