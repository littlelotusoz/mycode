package Package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
private static WebElement element = null;

public static WebElement userName(WebDriver driver) {
	
	element = driver.findElement(By.id("UserName"));
	return element;
}

public static WebElement password(WebDriver driver) {
	
	element = driver.findElement(By.id("Password"));
	return element;
	
}
	
	public static WebElement alphaCode(WebDriver driver) {
		
		element = driver.findElement(By.id("AlphaCode"));
		return element;
}
	
public static WebElement Loginbutton(WebDriver driver) {
		
		element = driver.findElement(By.id("login"));
		return element;
}


}
