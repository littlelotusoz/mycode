package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;

public class AbstractPage2 {
	
public static void main(String[] args) {
		
	}
public WebDriver driver;
public AbstractPage2 (WebDriver driver) {
			this.driver = driver;
		}
		public WebDriver getDriver() {
			return driver;
		}

	public LoginPage2 navigateToWebApp() {
		driver.navigate().to(urlvariable);
		return new LoginPage2(driver);
		}
	}


