package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResults extends AbstractPage {

public SearchResults(WebDriver driver) {
		super(driver);
	}

		public WebElement getPageDetails() {
			return driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/form/fieldset/ul/li[1]/span[2]"));
			
		}

}
