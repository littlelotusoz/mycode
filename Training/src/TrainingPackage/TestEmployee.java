package TrainingPackage;

public class TestEmployee {

	public static void main(String[] args) {
	
		Employee alex, linda, john; //creating objects of the employee class
		
		alex = new Employee(); //it is required that you do this so as to initialize the object, alex as a new employee.
		linda = new Employee();
		john = new Employee();
		
		alex.salary = 90000; //now when you type alex, it will show salary bonus and method calculateTotalPay as options 
		alex.bonus = 20000;
		alex.calculateTotalPay();
		
	}

}
