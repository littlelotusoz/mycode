package pageObjects;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class GoToPage {

	public static void main(String[] args) {
	
RemoteWebDriver DRIVER = new SafariDriver();

DRIVER.get("http://www.seek.com.au");
		
}
}