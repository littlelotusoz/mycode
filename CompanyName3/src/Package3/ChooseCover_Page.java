package Package3;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Package3.LoginPage;
import Package3.FirstTab;
import Package3.SignIn_Action;

import org.openqa.selenium.WebElement;

public class ChooseCover_Page {
	
private static WebElement element = null;

public static String getTitle(WebDriver driver) {
	
	String title = driver.getTitle();
	return title;
}

}
