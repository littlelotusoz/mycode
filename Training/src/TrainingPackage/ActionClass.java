package TrainingPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();

		// Instantiating Action Interface
		Actions actions=new Actions(driver);
		
		// hovering on the dropdown
		actions.moveToElement(driver.findElement(By.id("id of the dropdown"))).perform();
		
		// Clicking on one of the items in the list options
		
		WebElement subLinkOption=driver.findElement(By.id("id of the sub link"));
		
		subLinkOption.click();


	}

}
