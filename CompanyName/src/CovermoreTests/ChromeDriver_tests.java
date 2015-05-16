package CovermoreTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;


public class ChromeDriver_tests {
	
	public static void main(String[] args) {
		
	}
	
	public static WebDriver driver; 
	


@Before
	public void testSetup(){
	
	System.setProperty("webdriver.chrome.driver", "/Applications/Google Chrome.app/Contents/MacOS/chromedriver-2");
	driver = new ChromeDriver(); 
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

}
}

