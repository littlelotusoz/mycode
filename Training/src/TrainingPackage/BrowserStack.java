package TrainingPackage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Platform;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import java.net.URL;
	
	public class BrowserStack {
		
		

	 public static final String USERNAME = "";
	  public static final String AUTOMATE_KEY = "";
	  public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {
		 
		
	    
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "IE");
	    caps.setCapability("browser_version", "7.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "XP");
	    caps.setCapability("browserstack.debug", "true");

	    WebDriver driver = new RemoteWebDriver(
			    new URL(""), 
			    DesiredCapabilities.firefox()
			  );
	   driver.get("http://www.google.com/ncr");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();

	  }
	}


