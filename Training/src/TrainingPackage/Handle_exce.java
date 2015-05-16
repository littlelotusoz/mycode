package TrainingPackage;

public class Handle_exce {

	 public static void main(String[] args) {
	  int a[] = {3,1,6};
	  try { //If any exception arise Inside this try block, Control goes to catch block.
	                         System.out.println("Before Exception"); 
	                         //unchecked exception         
	                         System.out.println(a[9]);//Exception will arise here because we have only 3 values In array.
	                         System.out.println("After Exception");
	  }catch(Exception e){
	   System.out.println("Exception Is "+e);   
	  }
	               System.out.println("Outside The try catch.");
	 }
	}