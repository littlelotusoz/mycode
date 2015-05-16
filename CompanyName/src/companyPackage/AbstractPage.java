package companyPackage;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage (WebDriver driver) {
		this.driver = driver;
	}
	public WebDriver getDriver() {
		return driver;
	}

public LoginPage navigateToWebApp() {
	driver.navigate().to(urlvariable);
	return new LoginPage(driver);
	}
}

