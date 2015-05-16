package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage { 

	public HomePage(WebDriver driver) {
		super(driver);
	
	}
	
	public LoginPage clickOnLogin() {
		driver.findElement(By.id("logInButton")).click();
		return new LoginPage(driver);
	}
	
}
