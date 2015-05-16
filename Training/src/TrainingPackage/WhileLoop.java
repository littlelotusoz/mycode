package TrainingPackage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WhileLoop {

	public static void main(String[] args) {
		  
	//while loop - will be executed till condition returns true.
	System.out.println("***while loop example***");
	int i = 0; //Variable initialization
		while(i<=3){
			  System.out.println("Value Of Variable i Is "+i);
			   i++;//Incrementing value of i by 1.
			  	}
			  
	//do while loop - will be executed minimum one time without considering condition.
	System.out.println("");
	System.out.println("***do while loop example***");
	int j=3; //Variable initialization
		do{
			System.out.println("Value Of Variable j Is "+j);
			  j=j-1;//Decrementing value of j by 1;
		 } while(j>=0);
			 }
		
	}


List<WebElement> allerrors = driver.findElements(By.className("error-msg"));
Iterator<WebElement> it = allerrors.iterator();
while(it.hasNext()){
WebElement el = it.next();
String errorstrings = el.getText();
return errorstrings;
	