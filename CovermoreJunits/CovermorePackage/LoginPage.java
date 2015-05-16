package CovermorePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
	public LoginPage userLogin() {
		
	driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[1]/span/input")).sendKeys("qat");
	driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[2]/span/input")).sendKeys("test");
	driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[3]/span/input")).sendKeys("tin1121");
	driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[5]/span/input")).click();
	
	return new LoginPage(driver);
	
	}

}
