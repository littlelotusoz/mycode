package TrainingPackage;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver = new FirefoxDriver();	
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// Code to copy the screenshot in the desired location
		FileUtils.copyFile(scrFile, new File("path"));                  
	
		  }

}	
		

