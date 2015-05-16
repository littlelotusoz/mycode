package TrainingPackage;

public class Employee { //creating a new class
	
double salary; //defining new variable fields for this class
double bonus; //defining new variable fields for this class

void calculateTotalPay() { //creating a new method
	double totalPay = salary + bonus; //defining what the method does. Creates a new variable of type double int called totalpay and does
	//calculations to find out what it is based on above salary and bonus variables already defined.
		
	System.out.println("Total Pay = " + totalPay); //then it prints out the value

}
}
