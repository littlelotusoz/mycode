package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import jxl.*;
import jxl.read.biff.BiffException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

import Package3.LoginPage;
import Package3.FirstTab;
import Package3.SignIn_Action;
import Package3.TripDetails;
import Package3.ChooseCover_Page;

public class Test_QuoteBoxPage_Elements {
	
	public void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
}
	}
	
private static WebDriver driver = null;

@Before
	public void testSetup(){
	driver = new FirefoxDriver();
	driver.get(urlvariable);
	SignIn_Action.Execute(driver, login, password, alphacode);
	LoginPage.Loginbutton(driver).click();
		
	}


@After
	public void testShutdown() {
	//driver.close();
		
	} 
	
//@Test // To verify that the help dialog appears for 'Type of Policy'
	public void test_HelpAppears() throws IOException {
	driver.findElement(By.id("PolicyTypeHelp")).click();
		wait(1);
	driver.switchTo().frame(0);
	String bodytext = driver.findElement(By.tagName("body")).getText();
	Assert.assertTrue(bodytext.contains("By selecting Leisure, you will be able to quote/issue from the selection of leisure products and plans available."));
	TripDetails.createScreenshot(driver, "ScreenshotOfHelpDialog");
	
	 }

@Test

public void whatever() {
	
	List <WebElement> framesList = driver.findElements(By.xpath("//iframe"));

	int numOfFrames = framesList.size();
	System.out.println(numOfFrames);
}

    
 

    
}

	








	





	
		


