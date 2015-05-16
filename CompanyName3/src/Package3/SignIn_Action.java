package Package3;

import static org.junit.Assert.*;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Package3.LoginPage;
import Package3.FirstTab;

public class SignIn_Action {
	
	public static void Execute(WebDriver driver,String userName, String password, String alphaCode) {
		
		LoginPage.userName(driver).sendKeys(userName);
		LoginPage.password(driver).sendKeys(password);
		LoginPage.alphaCode(driver).sendKeys(alphaCode);
	
	}

}
