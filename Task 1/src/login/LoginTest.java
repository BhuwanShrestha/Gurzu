package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@Test
		public void testLogin() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver2.40.exe");
			driver =  new ChromeDriver();
			driver.get("https://google.com/");			
			driver.manage().window().maximize();
			
			LoginObject login = new LoginObject(driver);
			login.textInput("Gurzu");
			driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
			login.linkClick();
		}
	
	@AfterTest
		public void closeBrowser() {
			driver.close();
	}
}