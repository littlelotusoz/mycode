package WebTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WaitingClass {

public static void main(String[] args) {
	
}

private WebDriver driver; 

@Before 
public void testSetup(){
	driver = new FirefoxDriver();
		
}

@After
public void testShutdown() {
	driver.close();

}


@Test
	
	public void wait(int seconds) {
	try {
		Thread.sleep(seconds * 1000);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
}
	}
}



