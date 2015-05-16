package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage2 extends AbstractPage2 {
		
		public static void main(String[] args) {
			
		}
				
				public LoginPage2(WebDriver driver) {
					super(driver);
				
				}
				public LoginPage2 enterLoginDetails() {
					
				driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[1]/span/input")).sendKeys(login);
				driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[2]/span/input")).sendKeys(password);
				driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[3]/span/input")).sendKeys(alphacode);
				return new LoginPage2(driver);
				}
				
				public FirstTab2 userLogin() {
					
				driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div/div[1]/div[5]/span/input")).click();
				return new FirstTab2(driver);
				
				}
			
		}


