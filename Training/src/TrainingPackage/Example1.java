package TrainingPackage;

//Example of if, else if and else statements

public class Example1 {
	
	public static void main(String[] args) {
	
	int x = 10;
	int y = 10;
	
	{

	if (x > 0 && y > 0) { // && means basically AND
		System.out.println("Both Numbers are positive"); 
	}
	else if (x > 0 || y > 0) {
		System.out.println(" at least one number is positive"); // || two pipes means OR
	}
	else {
		System.out.println("Both nums are negatives");
	}
}

}
}