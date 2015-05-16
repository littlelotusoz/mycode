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

public class TripDetailsTest {

	public static void main(String[] args) {
		
	}
		private WebDriver driver; 

		
		@Before 
		public void testSetup(){
			
					
		}
		
		@After
		public void testShutdown() {
			//driver.close();
		}
		
		
		
		@Test public void testLogin()
		{
		driver = new FirefoxDriver();
		driver.navigate().to("http://training-b2b.covermore.com/au");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[1]/span/input")).sendKeys("qat");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[2]/span/input")).sendKeys("test");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[3]/span/input")).sendKeys("tin1121");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[5]/span/input")).click();	
		
		}
		
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
			Assert.assertTrue(
					driver.findElement(By.id("PurchasePathCode")).isSelected());	
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
		}	
			
		@Test
		public void testSelectionOfOptionFrom_AreaOfTravelDropdown() 
		{
			Select sel2 = new Select(driver.findElement(By.id("AreaCode")));
			sel2.selectByIndex(5);//selects an option from the 'Area of Travel' dropdown		
			
			wait(2);
			
			//waitForPageUtilElementIsVisible(By.id("CountryName"), 5000); // waits for the 'Country most time spent in' field to load its entries based on previous selections.
			
			/*WebElement selectElement = driver.findElement(By.id("CountryName"));
			Select listBox = new Select(selectElement);
			int size1 = listBox.getOptions().size();
			System.out.println(size1);
			*/
		}
			
		@Test
		public void testSelectionOfOptionFrom_CountryMostTimeSpentDropdown() 
		{
			Select sel3 = new Select(driver.findElement(By.id("CountryName"))); 
			sel3.selectByIndex(2); //selects an option from the 'Country most time spent in' dropdown
			
		}
			
		//WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/div[1]/form/div[2]/div[1]/div[5]/select"));
	//System.out.println(dropdown.getText().contains("Australia")
			  
		//	int optionCount = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/div[1]/form/div[2]/div[1]/div[5]/select")).size();
			
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
		
		@Test
		public void testSelectingDepartureDate()
		{
			driver.findElement(By.id("StartDate")).sendKeys("28/03/2015"); //populates the 'Departure Dates' field.	
		}
			
		@Test
		public void testSelectReturnDate()
		{
			driver.findElement(By.id("EndDate")).sendKeys("30/03/2015"); //populates the 'Return Dates' field.
		}	
			
		
		@Test
		public void testSelectDuration()
		{
			driver.findElement(By.id("Duration")).sendKeys("2"); //populates the 'Duration (days)' field.	
		}
		
		@Test
		public void testSelectAMTOnlyOption()
		{		
			driver.findElement(By.id("AmtOnly")).click(); //enables tick box 'Annual Multi-Trip Only'.	
		}
			
		@Test
		public void testSelectAMTOnlyHidesDateFields()
		{
			assertTrue(!isElementPresent(By.id("EndDate"))); //verifies that 'End Date' field is no longer displayed after selecting 'Annual Multi-Trip Only' option.
			assertTrue(!isElementPresent(By.id("Duration"))); //verifies that 'Duration' field is no longer displayed after selecting 'Annual Multi-Trip Only' option.
		}
		
		
		@Test
		public void testSelectTravellersAgent_ByAge()
		{
			driver.findElement(By.id("AgeBase")).click(); //enables tick box 'By Age' for field 'Travellers Age'
			assertTrue(
			driver.findElement(By.id("AgeBase")).isSelected());//Verifies that the 'By Age' radio button is currently selected	
		}
		
		@Test
		public void testFillAdult_andChild_AgeFields()
		{
			waitForPageElementVis(By.id("AdultAges_0__Age"), 5000); //waits for Adults age fields to appear
			driver.findElement(By.id("AdultAges_0__Age")).sendKeys("32"); //populate with age
			driver.findElement(By.id("AdultAges_1__Age")).sendKeys("42"); //populate with age
			driver.findElement(By.id("ChildAges_0__Age")).sendKeys("1"); //populate with age
			driver.findElement(By.id("ChildAges_1__Age")).sendKeys("15"); //populate with age
		}
			
		@Test
		public void testClickLink_AddMoreTravellers()
		{
			driver.findElement(By.id("lnkAddMoreTravellers")).click(); // Clicks link 'Add More Travellers'		
			waitForPageElementVis(By.id("AdultAges_2__Age"), 5000); //waits for additional Adults age fields to appear		
		}	
		
		@Test
		public void testFillMoreTravellerFields()
		{
			driver.findElement(By.id("AdultAges_2__Age")).sendKeys("53"); //populate with age
			driver.findElement(By.id("ChildAges_2__Age")).sendKeys("16"); //populate with age
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
			
				
			
			//driver.findElement(By.xpath("id('selectsId')/option[3]")).click();
			
			//boolean policy = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/div[1]/form/div[2]/div[1]/div[1]/select")).isSelected();
			
			

	

