package WebTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test1 {

	private WebDriver driver; 

	
	@Before 
	public void testSetup(){
		driver = new FirefoxDriver();
		driver.navigate().to("Training-b2b.covermore.com/au");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[1]/span/input")).sendKeys("qat");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[2]/span/input")).sendKeys("test");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[3]/span/input")).sendKeys("tin1121");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[5]/span/input")).click();	
	}
	
	@After
	public void testShutdown() {
		driver.close();
	
	}
	
	@Test
	
	public void test2() {
		
		String x = ("Help");
		if	x == ("leisure"); {
		System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
			
		}
		String dropdown = driver.findElement(By.id("PurchasePathCode")).getText();
		System.out.println("dropdown");
	}
	
	
	}

}
