package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import CovermoreTests.TripDetailsTest;

public class WaitClasses extends TripDetailsTest {
	
}

public boolean waitForPageUtilElementIsVisible(By locator, int maxSeconds) {
	
	return (new WebDriverWait(driver, maxSeconds))
			.until(ExpectedConditions.textToBePresentInElementLocated(locator, "Australia"));
	
}
	
public WebElement waitForPageElementVis(By locator, int maxSeconds) {
	return (new WebDriverWait (driver, 5000)).until(ExpectedConditions.visibilityOfElementLocated(locator));
}


	public void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
	}
	

}
