package CovermorePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TripDetailsTab extends AbstractPage {
	
public TripDetailsTab(WebDriver driver) {
			super(driver);
}
public TripDetailsTab location() {
	
driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/div[1]/form/div[2]/div[1]/div[1]/select")).isDisplayed();

return new TripDetailsTab(driver);
			
	}
}


	

		
		
		


