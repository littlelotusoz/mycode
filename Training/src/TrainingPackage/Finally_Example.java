package TrainingPackage;

import org.testng.annotations.Test;

@Test(timeOut=2000) //It will allow maximum 2000 milliseconds to complete the execution of test1() method. After 2000 milliseconds, it will skip remaining execution and test1() will be marked with error.
public class Finally_Example {
	 
public static void main(String[] args) {
		try{
		   int i=5/0; //Exception will be thrown.
		   System.out.println("Value Of i Is "+i);//This statement will be not executed.
		  }catch (Exception e)//Exception will be caught. 
		  {
		   System.out.println("Inside catch."+e);//print the exception.
		  }finally//finally block will be executed.
		  {
		   System.out.println("Inside finally. Please take appropriate action");
		  }
		  
		  try{
		   int j=5/2; //Exception will be not thrown.
		   System.out.println("Value Of j Is "+j);//This statement will be executed.
		  }catch (Exception e)//No exception so catch block code will not execute.
		  {
		   System.out.println("Inside catch."+e);
		  }finally//finally block code will be executed.
		  {
		   System.out.println("Inside finally. Please take appropriate action");
		  }
		 } 
		}

