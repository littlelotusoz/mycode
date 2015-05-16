package CovermoreTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepTests {

	private WebDriver driver; 

			
@Before 
		public void testSetup(){
				driver = new FirefoxDriver();
				driver.navigate().to("http://training-b2b.covermore.com/au");
				driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[1]/span/input")).sendKeys("login");
				driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[2]/span/input")).sendKeys("password");
				driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[3]/span/input")).sendKeys("alphacode");
				driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[5]/span/input")).click();				
			}
			
	@After
		public void testShutdown() {
				driver.close();
			}
			
	@Test
		public void testPageLocation()
			{
		Assert.assertTrue(driver.getTitle().equals("Quote Box")); //verifies the current title of the current page is "Quote Box"	
			}
			
			
	@Test
		public void testTypePolicyDropdownVisible() 
			{
				Assert.assertTrue(
				driver.findElement(By.id("PurchasePathCode")).isDisplayed()); //verifies that the 'Type of Policy' dropdown is visible	
			}
				
	@Test
		public void testDefaultSelectedDropdownItem() 
			{	
				Select testy = new Select(driver.findElement(By.id("PurchasePathCode")));
				String selectedValue = testy.getFirstSelectedOption().getText();
				Assert.assertEquals("Leisure", selectedValue);	
			}
						
	@Test
		public void testVerify_ValuesInTypePolicyDropdrown()
			{
				String leisure = ("Leisure");
				String business = ("Business");
				String group = ("Group");
				String ageapproved = ("Age Approved");	
				String direct = ("Direct");
				
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
			}
			
	@Test
		public void testSelectionOfOptionFrom_TypeOfPolicyDropdown() 
			{
				Select sel = new Select(driver.findElement(By.id("PurchasePathCode")));
				sel.selectByIndex(0); //selects an option from the 'Type of Policy' dropdown.
				String v2 = sel.getFirstSelectedOption().getText();
				Assert.assertEquals("Leisure", v2);
				
				
				Select sel2 = new Select(driver.findElement(By.id("AreaCode")));
				sel2.selectByIndex(5);//selects an option from the 'Area of Travel' dropdown		
				String v3 = sel2.getFirstSelectedOption().getText();
				Assert.assertEquals("Australia", v3);
				
				wait(2);
	
				Select sel3 = new Select(driver.findElement(By.id("CountryName"))); 
				sel3.selectByIndex(2); //selects an option from the 'Country most time spent in' dropdown	
				String v4 = sel3.getFirstSelectedOption().getText();
				Assert.assertEquals("Australia", v4);		
			}
			
	@Test
		public void testDefaultDepartureDate()
			{
				String todayd = driver.findElement(By.id("StartDate")).getAttribute("value");
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				Calendar calobj = Calendar.getInstance();
				System.out.println("Systems date here "+ df.format(calobj.getTime()));
				System.out.println(todayd);
				Assert.assertEquals(df.format(calobj.getTime()), todayd);	
			}

	public void testSelectingDepartureDate()
	{
		driver.findElement(By.id("StartDate")).sendKeys("28/03/2015"); //populates the 'Departure Dates' field.	
	}
		

	public void testSelectReturnDate()
	{
		driver.findElement(By.id("EndDate")).sendKeys("30/03/2015"); //populates the 'Return Dates' field.
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
			


