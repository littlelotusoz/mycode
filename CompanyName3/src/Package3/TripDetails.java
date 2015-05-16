package Package3;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import jxl.*;
import jxl.read.biff.BiffException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Package3.LoginPage;
import Package3.FirstTab;
import Package3.SignIn_Action;

import org.openqa.selenium.WebElement;

public class TripDetails {
	
	static WebDriver driver;

//Wait method that is called in various tests.
	public WebElement waitForPageElementVis(By locator, int maxSeconds) {
		return (new WebDriverWait (driver, 5000)).until(ExpectedConditions.visibilityOfElementLocated(locator));
		}

	public static void wait(int seconds) {
		try {
				Thread.sleep(seconds * 1000);
					
			} catch (InterruptedException e) {
					e.printStackTrace();
		}
			}
	
private static WebElement element = null;

// Locating the 'Type of Policy' drop down WebElement
public static WebElement typeOfPolicy_Dropdown(WebDriver driver) {
	
	element = driver.findElement(By.id("PurchasePathCode"));
	return element;
	}

	//Locating the 'Area of Travel' drop down WebElement
public static WebElement areaOfTravel_Dropdown(WebDriver driver) {
	
	element = driver.findElement(By.id("AreaCode"));
	return element;
}

//Locating the 'Country most time spent in' drop down WebElement
public static WebElement countryMostTimeSpentIn_Dropdown(WebDriver driver) {
	
	element = driver.findElement(By.id("CountryName"));
	return element;
}

//Locating the 'Start Date' date picker WebElement
public static WebElement departure_DatePicker(WebDriver driver) {
	
	element = driver.findElement(By.id("StartDate"));
	return element;
}

//Locating the 'End Date' date picker WebElement
public static WebElement returnDatePicker(WebDriver driver) {
	
	element = driver.findElement(By.id("EndDate"));
	return element;
}

//Locating the 'Duration' field WebElement
public static WebElement duration_field(WebDriver driver) {
	
	element = driver.findElement(By.id("Duration"));
	return element;
}

//Locating the Annual Multi-Trip Only' WebElement
public static WebElement AMTOnly_field(WebDriver driver) {
	
	element = driver.findElement(By.id("AmtOnly"));
	return element;
}

//Locating the Travellers Age - 'By Age' radio button WebElement
public static WebElement byAge_RadioButton(WebDriver driver) {
	
	element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/div[1]/form/div[2]/div[3]/div[1]/div[1]/input"));
	return element;
}
//Locating the Travellers Age - 'By DOB' radio button WebElement
public static WebElement byDOB_RadioButton(WebDriver driver) {
	
	element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/div[1]/form/div[2]/div[3]/div[1]/div[2]/input"));
	return element;
}

//Locating the Adult 1 Age field WebElement
public static WebElement adult1_Field(WebDriver driver) {
	element = driver.findElement(By.id("AdultAges_0__Age"));
	return element;
}

//Locating the Adult 2 Age field WebElement
public static WebElement adult2_Field(WebDriver driver) {
	element = driver.findElement(By.id("AdultAges_1__Age"));
	return element;
}

//Locating the Child 1 Age field WebElement
public static WebElement child1_Field(WebDriver driver) {
	element = driver.findElement(By.id("ChildAges_0__Age"));
	return element;
}

//Locating the Child 2 Age field WebElement
public static WebElement child2_Field(WebDriver driver) {
	element = driver.findElement(By.id("ChildAges_1__Age"));
	return element;
}

//Locating the Child 3 Age field WebElement
public static WebElement child3_Field(WebDriver driver) {
	element = driver.findElement(By.id("ChildAges_2__Age"));
	return element;
}

//Locating the Child 4 Age field WebElement
public static WebElement child4_Field(WebDriver driver) {
	element = driver.findElement(By.id("ChildAges_3__Age"));
	return element;
}

//Locating the Add More Travellers' link WebElement
public static WebElement addMoreTravellers_Link(WebDriver driver) {
	element = driver.findElement(By.id("lnkAddMoreTravellers"));
	return element;
}

//Locating the 'Get a Quote' button WebElement
public static WebElement getAQuote_Button(WebDriver driver) {
	element = driver.findElement(By.id("GetQuoteLink"));
	return element;
}

//Locating the Adult 1 DOB field WebElement
public static WebElement adult1_dob(WebDriver driver) {
	element = driver.findElement(By.id("AdultDobs_0__Dob"));
	return element;
}

//Locating the Adult 2 DOB field WebElement
public static WebElement adult2_dob(WebDriver driver) {
	element = driver.findElement(By.id("AdultDobs_1__Dob"));
	return element;
}
//Locating the 'Agent Rate' Radio button value of 'Yes'. For Type of Policy - 'Business'
public static WebElement agentRateYes_RadioButton(WebDriver driver) {
	element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/div[1]/form/div[2]/div[1]/div[2]/div[1]/input"));
	return element;
}

//Locating the 'Agent Rate' Radio button value of 'No'. For Type of Policy - 'Business'
public static WebElement agentRateNo_RadioButton(WebDriver driver) {
	element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/div[1]/form/div[2]/div[1]/div[2]/div[2]/input"));
	return element;
}

//Locating the 'Add / Edit Traveller Details' link for Type of Policy - 'Group'.
public static WebElement importGroup_Link(WebDriver driver) {
	element = driver.findElement(By.id("ImportTravellerDetailFromExcel"));
	return element;
}

//Locating 'Show limits' link for Type of Policy 'Group'
public static WebElement showLimits_Link(WebDriver driver) {
	element = driver.findElement(By.id("showLimits"));
	return element;
}

//Locating the 'Will these limits be exceeded' Radio button value of 'No'. For Type of Policy - 'Group'
public static WebElement groupLimitExceededNo_RadioButton(WebDriver driver) {
	element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/div[1]/form/div[2]/div[3]/div[2]/div[3]/input"));
	return element;
}

//Locating the 'Will these limits be exceeded' Radio button value of 'Yes'. For Type of Policy - 'Group'
public static WebElement groupLimitExceededYes_RadioButton(WebDriver driver) {
	element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/div[1]/form/div[2]/div[3]/div[2]/div[2]/input"));
	return element;
}

//Locating the Address Details link WebElement
public static WebElement aboutUs_Link(WebDriver driver) {
	element = driver.findElement(By.xpath("/html/body/div[2]/map/area[2]"));
	return element;	
}

//Locating the Address Details link WebElement
public static WebElement closeButton(WebDriver driver) {
	element = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a/img"));
	return element;	
}


//Identifying what the first selected option is within drop down 'Type of Policy'
public static String typeofPolicy_Selection(WebDriver driver) {
	
	Select option1 = new Select(driver.findElement(By.id("PurchasePathCode")));
	String mystring = option1.getFirstSelectedOption().getText();
	
	return mystring;
}

//Identifying the current web page title.
public static String getTitle(WebDriver driver) {
	
	String title = driver.getTitle();
	return title;
}

//Identifying the expected UI location of the 'Area of Travel' drop down WebElement
public static Point expectedDropdownLocation(WebDriver driver) {
	
	int x = 80;
	int y = 350;
	Point pointexp = new Point(x,y);
	
	return pointexp;
}
	
//Identifying the actual UI location of the 'Area of Travel' drop down WebElement
public static Point actualDropdownLocation(WebDriver driver) {
	
	Point dropdown = driver.findElement(By.id("AreaCode")).getLocation();
	return dropdown;
	
}

//Selecting an option from the 'Type of Policy' drop down using drop down index as variable
public static Select select_TypeOfPolicy(WebDriver driver, int index) {
	
	Select option = new Select(driver.findElement(By.id("PurchasePathCode")));
	option.selectByIndex(index);
	return option;
	
}

//Selecting an option from the 'Area of Travel' drop down using drop down index as variable
public static Select select_AreaOfTravel(WebDriver driver, int index) {
	
	Select option = new Select(driver.findElement(By.id("AreaCode")));
	option.selectByIndex(index);
	return option;
	
}
//Selecting an option from the 'Country most time spent in' drop down using drop down index as variable
public static Select select_CountryMostTimeSpentIn(WebDriver driver, int index) {
	
	Select option = new Select(driver.findElement(By.id("CountryName")));
	option.selectByIndex(index);
	return option;
}

//Identifying the default 'Start Date' that is selected
public static String getDefaultDepartureDate(WebDriver driver) {
	
	String datepicker = driver.findElement(By.id("StartDate")).getAttribute("value");
	return datepicker;	
}
//Identifying todays date and converting it into the same format that is returned by the above method 'getDefaultDepartureDate'
public static String getTodaysDate(WebDriver driver) {
	
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	Calendar calobj = Calendar.getInstance();
	String cal = df.format(calobj.getTime());
	return cal;
	}

//Creates a String of a date. Contains a int variable which adds days onto the current date. Used for sending specific dates to 'Departure' and 'Return' date pickers.
public static String addToDate(WebDriver driver, int plusdays) {
	
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	Calendar calobj = Calendar.getInstance();
	calobj.add(Calendar.DATE, plusdays);
	String cal = df.format(calobj.getTime());
	return cal;
	}

//sends the ages of Adult 1 age and Adult 2 age as variables to the Adult fields.
public static void adult1_Adult2_Ages(WebDriver driver, String adult1, String adult2) {
	
	driver.findElement(By.id("AdultAges_0__Age")).sendKeys(adult1);
	driver.findElement(By.id("AdultAges_1__Age")).sendKeys(adult2);	
	
	}
//sends the ages of Child 1, Child 2, Child 3 and Child 4 as variables to the Child fields.
public static void childAges(WebDriver driver, String child1, String child2, String child3, String child4) {
	driver.findElement(By.id("ChildAges_0__Age")).sendKeys(child1);
	driver.findElement(By.id("ChildAges_1__Age")).sendKeys(child2);
	driver.findElement(By.id("ChildAges_2__Age")).sendKeys(child3);
	driver.findElement(By.id("ChildAges_3__Age")).sendKeys(child4);	

	}
//sends the ages of Adult 1 and Adult 2 DOB as variables to the Adult fields.
public static void adultsDOB(WebDriver driver, String adult1, String adult2) {
	driver.findElement(By.id("AdultDobs_0__Dob")).click();
	driver.findElement(By.id("AdultDobs_0__Dob")).sendKeys(adult1);
	driver.findElement(By.id("AdultDobs_1__Dob")).click();
	driver.findElement(By.id("AdultDobs_1__Dob")).sendKeys(adult2);
		
	}
//sends the ages of Child 1, Child 2, Child 3 and Child 4 DOB as variables to the Child fields.
public static void childDOB(WebDriver driver, String child1, String child2, String child3, String child4) {
	driver.findElement(By.id("ChildDobs_0__Dob")).click();
	driver.findElement(By.id("ChildDobs_0__Dob")).sendKeys(child1);
	driver.findElement(By.id("ChildDobs_1__Dob")).click();
	driver.findElement(By.id("ChildDobs_1__Dob")).sendKeys(child2);	
	driver.findElement(By.id("ChildDobs_2__Dob")).click();
	driver.findElement(By.id("ChildDobs_2__Dob")).sendKeys(child3);
	driver.findElement(By.id("ChildDobs_3__Dob")).click();
	driver.findElement(By.id("ChildDobs_3__Dob")).sendKeys(child4);
			
	}

//Selects the 'Agent Rate' Radio button value of 'Yes'. For Type of Policy - 'Business'
public static void select_AgentRateYes_RadioButton(WebDriver driver) {
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/div[1]/form/div[2]/div[1]/div[2]/div[1]/input")).click();

	}

//Selects the 'Agent Rate' Radio button value of 'No'. For Type of Policy - 'Business'
public static void select_AgentRateNo_RadioButton(WebDriver driver) {
driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/div[1]/form/div[2]/div[1]/div[2]/div[2]/input")).click();
	
	}
//Gets all of the text on the current page. Used for identifying field validation errors are present.
public static String fieldValidationError(WebDriver driver) {
	String bodytext = driver.findElement(By.tagName("body")).getText();
	return bodytext;
	}

//Gets the link associated with the about us 'Address details' link
public static String aboutUsUrl_Link(WebDriver driver) {
	String aboutus = driver.findElement(By.xpath("/html/body/div[2]/map/area[2]")).getAttribute("href");
	return aboutus;
}

//Scenario method. Will be useful if wanting to test subsequent pages loaded after submitting the quote.
public static void populateTripDetails_TOPBusiness(WebDriver driver) {
	TripDetails.select_TypeOfPolicy(driver, 1);
	TripDetails.select_AgentRateYes_RadioButton(driver);
	TripDetails.select_AreaOfTravel(driver, 1);
	TripDetails.departure_DatePicker(driver).click();
	TripDetails.departure_DatePicker(driver).sendKeys(TripDetails.addToDate(driver, 2));	
	TripDetails.byDOB_RadioButton(driver);
	TripDetails.adultsDOB(driver, "12031982", "14041984");
	TripDetails.getAQuote_Button(driver).click();
}

//Creates a list of the expected values for the 'Area of Travel' drop down when 'Type of policy' is 'Leisure'.
public static String areaOfTravel_ExpectedDropdownValues_PolicyLeisure() {
	
String listingexpected = "Area\nWorldwide (inc. Americas and Africa)\nEurope, Asia and the Middle East\nUK and South East Asia\nIndonesia, NZ and South West Pacific\nAustralia\nAustralia Inbound";

return listingexpected;
}

//Creates a list of the expected values for the 'Area of Travel' drop down when 'Type of Policy' set to 'Group' or 'Direct'.
public static String areaOfTravel_ExpectedDropdownValues_PolicyGroupOrDirectOrAgeApproved() {
	
String listingexpected = "Area\nWorldwide (inc. Americas and Africa)\nEurope, Asia and the Middle East\nUK and South East Asia\nIndonesia, NZ and South West Pacific\nAustralia";

return listingexpected;
}

//Creates a list of the expected values for the 'Area of Travel' drop down when 'Type of Policy' set to 'Age Approved'.
public static String areaOfTravel_ExpectedDropdownValues_PolicyAgeApproved() {
	
String listingexpected = "Area\nWorldwide (inc. Americas and Africa)\nEurope, Asia and the Middle East\nUK and South East Asia\nIndonesia, NZ and South West Pacific";

return listingexpected;
}


//Creates a list of the expected values for the 'Type of Policy' drop down.
public static String typeOfPolicy_ExpectedDropdownValues() {
	
String listingexpected = "Leisure\nBusiness\nGroup\nAge Approved\nDirect";

return listingexpected;
}

//Creates a list of the expected values for the 'Country most time spent in' drop down when 'Area of Travel' is 'Australia'.
public static String areaOfTravelAustralia_CountryExpectedDropdownValues() {
	
String listingexpected = "Country most time spent in\nAntarctica-Sightseeing Flight\nAustralia";

return listingexpected;

}

//Creates a list of the expected values for the 'Area of Travel' drop down when Type of Policy is 'Business'.
public static String businessPolicy_areaOfTravel_ExpectedDropdownValues() {
	
String listingexpected = "Area\nWorldwide (inc. Americas and Africa)\nEurope, Asia and the Middle East";

return listingexpected;
}

//Creates an array of the current listings in the 'Country most time spent in' drop down list.
public static String[] actualCountryMostTimeSpentIn_Array(WebDriver driver) {
	
	String str = driver.findElement(By.id("CountryName")).getText();
	String[] array=str.split("\n");

	return array;
}

//Creates an array of the expected listings of the 'Country most time spent in' dropdown when 'Area of Travel' is set to 'Worldwide (inc. Americas and Africa)'
public static String[] expectedWorldwideCountryArrayFromFile() throws FileNotFoundException {

	
	Scanner sc = new Scanner(new File("/Users/myname/documents/companyfiles/worldwide_countries.csv"));
    String[] items = new String[236]; 
    int i = 0;
    while(sc.hasNextLine() && i < items.length) {
        items[i] = sc.nextLine();
        i++;
}
	return items;

}

//Creates an array of the expected listings of the 'Country most time spent in' dropdown when 'Area of Travel' is set to 'Europe Asia and the Middle East)'
public static String[] expectedEuropeCountryArrayFromFile() throws FileNotFoundException {

	
	Scanner sc = new Scanner(new File("/Users/myname/documents/companyfiles/AreaOfTravel_Europe.csv"));
    String[] items = new String[131]; 
    int i = 0;
    while(sc.hasNextLine() && i < items.length) {
        items[i] = sc.nextLine();
        i++;
}
	return items;

}

//Creates an array of the expected listings of the 'Country most time spent in' dropdown when 'Area of Travel' is set to 'UK and South East Asia)'
public static String[] expectedUKCountryArrayFromFile() throws FileNotFoundException {

	
	Scanner sc = new Scanner(new File("/Users/myname/documents/companyfiles/AreaOfTravel_UK.csv"));
    String[] items = new String[42]; 
    int i = 0;
    while(sc.hasNextLine() && i < items.length) {
        items[i] = sc.nextLine();
        i++;
}
	return items;

}

//Creates an array of the expected listings of the 'Country most time spent in' dropdown when 'Area of Travel' is set to 'Indonesia, NZ and South West Pacific)'
public static String[] expectedIndonesiaCountryArrayFromFile() throws FileNotFoundException {

	
	Scanner sc = new Scanner(new File("/Users/myname/documents/companyfiles/AreaOfTravel_Indonesia.csv"));
    String[] items = new String[21]; 
    int i = 0;
    while(sc.hasNextLine() && i < items.length) {
        items[i] = sc.nextLine();
        i++;
}
	return items;

}

//Creates an array of the expected listings of the 'Country most time spent in' dropdown when 'Area of Travel' is set to 'Australia'
public static String[] expectedAustralia_CountryArrayFromFile() throws FileNotFoundException {

	
	Scanner sc = new Scanner(new File("/Users/myname/documents/companyfiles/AreaOfTravel_Australia.csv"));
    String[] items = new String[3]; 
    int i = 0;
    while(sc.hasNextLine() && i < items.length) {
        items[i] = sc.nextLine();
        i++;
}
	return items;

}

//Creates an array of the expected listings of the 'Country most time spent in' dropdown when 'Area of Travel' is set to 'Australia Inbound'
public static String[] expectedAustraliaInbound_CountryArrayFromFile() throws FileNotFoundException {

	
	Scanner sc = new Scanner(new File("/Users/myname/documents/companyfiles/AreaOfTravel_AustraliaInbound.csv"));
    String[] items = new String[2]; 
    int i = 0;
    while(sc.hasNextLine() && i < items.length) {
        items[i] = sc.nextLine();
        i++;
}
	return items;

}

//Creates a file containing contents of dropdown. Mainly here for reference purposes.
public static void createFilefromDropdown(WebDriver driver) throws IOException {
	
	TripDetails.select_TypeOfPolicy(driver, 0);
	TripDetails.select_AreaOfTravel(driver, 6);
	
	wait(1);
	
	String TestFile = "/Users/myname/Documents/companyfiles/AreaOfTravel_AustraliaInbound.csv";
	File FC = new File(TestFile);
	FC.createNewFile();
	FileWriter FW = new FileWriter(TestFile);
	BufferedWriter BW = new BufferedWriter(FW);
	BW.write(TripDetails.countryMostTimeSpentIn_Dropdown(driver).getText()); 
	BW.close();
}

//Creates a screenshot of what is currently displayed on the screen. Variable is the file name which should be different per Junit test.
public static void createScreenshot(WebDriver driver, String filename) throws IOException {
File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

// Code to copy the screenshot in the desired location
FileUtils.copyFile(scrFile, new File("/users/myname/documents/companyfiles/"+ filename + ".jpg"));                  

}

//Reads values from cells in excel file and adds these cell values to specified fields.
public static void useExcel(WebDriver driver) throws BiffException, IOException {

	String FilePath = "/Users/myname/Documents/companyfiles/ages.xls";
	FileInputStream fs = new FileInputStream(FilePath);
	Workbook wb = Workbook.getWorkbook(fs);
	Sheet sh = wb.getSheet(0);
	String CellGetContent = sh.getCell(0,0).getContents();
	driver.findElement(By.id("AdultAges_0__Age")).sendKeys(CellGetContent);
	String CellGetContent2 = sh.getCell(1,0).getContents();
	driver.findElement(By.id("AdultAges_1__Age")).sendKeys(CellGetContent2);
	System.out.println(CellGetContent);
	System.out.println(CellGetContent2);

}


public static String[] testing() throws FileNotFoundException {

		Scanner sc = new Scanner(new File("/Users/myname/documents/companyfiles/group.xls"));
	    String[] items = new String[4]; 
	    int i = 0;
	    while(sc.hasNextLine() && i < items.length) {
	        items[i] = sc.nextLine();
	        i++;
	}
		return items;

	}

}

/*public static String fieldValidationError(WebDriver driver) {
	String error = driver.switchTo().alert().getText();
	return error;*/








