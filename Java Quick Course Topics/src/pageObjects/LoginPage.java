package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
		
		public LoginPage(WebDriver driver) {
			super(driver);
		}
	
		public LoginPage fillFormWithData() {
			//fill data here
			driver.findElement(By.id("Email")).sendKeys("wrong@wrong.com");
			driver.findElement(By.id("Password")).sendKeys("wrong");
			return new LoginPage(driver);
		}

		public LoginResultPage submitForm() {
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/form/div/button")).click();
			return new LoginResultPage(driver);
			
		}
}



