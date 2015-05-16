package TrainingPackage;

public class ThrowException {
		 
	public static void main(String[] args) {
		  catchexc();
		 }
		 private static void catchexc() {
		     try {
		      //throwexc() Method called.
		      throwexc();
		     } catch (ArithmeticException e) { //Exception of throwexc() will be caught here and take required action.
		         System.out.println("Devide by 0 error.");
		     }
		 } 
		 //This method will throw ArithmeticException divide by 0.
		 private static void throwexc() throws ArithmeticException {  
		     int i=15/0;     
	} 
}
	
	
