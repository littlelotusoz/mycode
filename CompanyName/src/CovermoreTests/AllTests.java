package CovermoreTests;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Point;

public class AllTests {

	public static void main(String[] args) {
	
	}
	private WebDriver driver; 

	
	@Before 
	public void testSetup(){
		driver = new FirefoxDriver();
		driver.navigate().to("http://training-b2b.covermore.com/au");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[1]/span/input")).sendKeys(login);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[2]/span/input")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[3]/span/input")).sendKeys(alphacode);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[5]/span/input")).click();				
	}
	
	@After
	public void testShutdown() {
		//driver.close();
	}
	
	@Test
	public void TestStart()
	{
//verifies the current title of the current page is "Quote Box".
Assert.assertTrue(driver.getTitle().equals("Quote Box")); 	

//verifies that the 'Type of Policy' dropdown is visible.	
Assert.assertTrue(
		driver.findElement(By.id("PurchasePathCode")).isDisplayed()); 
		Select select = new Select(driver.findElement(By.id("PurchasePathCode"))); 

//verifies that 'Leisure' is selected in the dropdown by default.
assertEquals("Leisure",select.getFirstSelectedOption().getText());
			
		String leisure = ("Leisure");
		String business = ("Business");
		String group = ("Group");
		String ageapproved = ("Age Approved");	
		String direct = ("Direct");
		
//verifies that the 'Type of policy' dropdown contains the right listings in the dropdown.
Assert.assertTrue(
		driver.findElement(By.id("PurchasePathCode")).getText().contains(leisure));

Assert.assertTrue(
		driver.findElement(By.id("PurchasePathCode")).getText().contains(business));

Assert.assertTrue(
		driver.findElement(By.id("PurchasePathCode")).getText().contains(group));

Assert.assertTrue(
		driver.findElement(By.id("PurchasePathCode")).getText().contains(ageapproved));

Assert.assertTrue(
		driver.findElement(By.id("PurchasePathCode")).getText().contains(direct));
	
		int x = 80;
		int y = 350;
		Point point1 = new Point(x,y);
	
		Point dropdown = driver.findElement(By.id("AreaCode")).getLocation();
//Verifies that the 'Area of travel' dropdown is in the correct location on the web page
assertEquals(point1, dropdown);
		
		String listingactual = driver.findElement(By.id("AreaCode")).getText(); 
		String listingexpected = "Area\nWorldwide (inc. Americas and Africa)\nEurope, Asia and the Middle East\nUK and South East Asia\nIndonesia, NZ and South West Pacific\nAustralia\nAustralia Inbound";
//verifies that the correct listings are in the 'Area of Travel' dropdown.
assertEquals(listingexpected, listingactual);

		Select sel = new Select(driver.findElement(By.id("PurchasePathCode")));
		sel.selectByIndex(0); //selects an option from the 'Type of Policy' dropdown.	
		
		Select sel2 = new Select(driver.findElement(By.id("AreaCode")));
		sel2.selectByIndex(5);//selects an option from the 'Area of Travel' dropdown		
		
		wait(2);

		Select sel3 = new Select(driver.findElement(By.id("CountryName"))); 
		sel3.selectByIndex(2); //selects an option from the 'Country most time spent in' dropdown
	
		String todayd = driver.findElement(By.id("StartDate")).getAttribute("value");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calobj = Calendar.getInstance();
		System.out.println("Systems date here "+ df.format(calobj.getTime()));
		System.out.println(todayd);
		
//Verifies that the Departure Date is set to todays date by default
Assert.assertEquals(df.format(calobj.getTime()), todayd);	
	
		driver.findElement(By.id("StartDate")).sendKeys("28/03/2015"); //populates the 'Departure Dates' field.	

		driver.findElement(By.id("EndDate")).sendKeys("30/03/2015"); //populates the 'Return Dates' field.
	
		driver.findElement(By.id("Duration")).sendKeys("2"); //populates the 'Duration (days)' field.	
	
		driver.findElement(By.id("AmtOnly")).click(); //enables tick box 'Annual Multi-Trip Only'.	

//verifies that 'End Date' field is no longer displayed after selecting 'Annual Multi-Trip Only' option.
assertTrue(!isElementPresent(By.id("EndDate"))); 

//verifies that 'Duration' field is no longer displayed after selecting 'Annual Multi-Trip Only' option.
assertTrue(!isElementPresent(By.id("Duration"))); 

		driver.findElement(By.id("AgeBase")).click(); //enables tick box 'By Age' for field 'Travellers Age'

//Verifies that the 'By Age' radio button is currently selected	
assertTrue(
		driver.findElement(By.id("AgeBase")).isSelected());
	
		waitForPageElementVis(By.id("AdultAges_0__Age"), 5000); //waits for Adults age fields to appear
		driver.findElement(By.id("AdultAges_0__Age")).sendKeys("32"); //populate with age
		driver.findElement(By.id("AdultAges_1__Age")).sendKeys("42"); //populate with age
		driver.findElement(By.id("ChildAges_0__Age")).sendKeys("1"); //populate with age
		driver.findElement(By.id("ChildAges_1__Age")).sendKeys("15"); //populate with age
		
		//driver.findElement(By.id("lnkAddMoreTravellers")).getAttribute(arg0)
	
//assertTrue(driver.findElement(By.id("lnkAddMoreTravellers")));
//(driver.findElement(By.id("lnkAddMoreTravellers"))).

		driver.findElement(By.id("lnkAddMoreTravellers")).click(); // Clicks link 'Add More Travellers'		
		waitForPageElementVis(By.id("AdultAges_2__Age"), 5000); //waits for additional Adults age fields to appear		
	
		driver.findElement(By.id("AdultAges_2__Age")).sendKeys("53"); //populate with age
		driver.findElement(By.id("ChildAges_2__Age")).sendKeys("16"); //populate with age
		
		
	}
	
	public void getDropdownListings() {
		
		WebElement element = driver.findElement(By.id("PurchasePathCode"));
		Select dd=new Select(element);
		List<WebElement> allOptions = dd.getOptions();
		Iterator<WebElement> it = allOptions.iterator();
		while(it.hasNext()){
			WebElement el = it.next();
			System.out.println(el.getText()); }
		
		}

	private boolean isElementPresent(By id) {
		
		return false;
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

}
