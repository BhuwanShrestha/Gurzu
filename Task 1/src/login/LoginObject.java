package login;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject {
	WebDriver driver;
	
		public LoginObject(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath= "//input[@type='text']")
		WebElement textarea;
		
		public void textInput(String text) {
			textarea.sendKeys(text);
			textarea.sendKeys(Keys.ENTER);
		}
		
		@FindBy(xpath="//a[@href='https://gurzu.com/']")
		WebElement link;
		
		public void linkClick() {
			link.click();
		}
		
		
		
		
}
