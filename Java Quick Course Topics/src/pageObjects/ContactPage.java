package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends AbstractPage {
	
	public ContactPage(WebDriver driver) {
		super(driver);
	}
	
	public ContactPage fillFormWithData() {
		//fill data here
		driver.findElement(By.id("name_field")).sendKeys("test name");
		return new ContactPage(driver);
	}

	public ContactResultPage submitForm() {
		driver.findElement(By.id("Submit_message")).click();
		return new ContactResultPage(driver);
		
	}
	
}
