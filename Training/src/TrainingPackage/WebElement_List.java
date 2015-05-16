package TrainingPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement_List {
	
public static void main(String[] args) {
	
WebDriver driver = new FirefoxDriver();
		
// Storing the list
List <WebElement> elementList = driver.findElements(By.xpath("//div[@id='example']//ul//li"));

// Fetching the size of the list
		
int listSize = elementList.size();
for (int i=0; i<listSize; i++)
		{
		// Clicking on each service provider link
		
		serviceProviderLinks.get(i).click();
		
		// Navigating back to the previous page that stores link to service providers
		
		driver.navigate().back();
		
		}


	}

}
