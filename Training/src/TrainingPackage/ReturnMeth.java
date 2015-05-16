package TrainingPackage;

import java.util.Scanner;

public class ReturnMeth {
	
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		inputTest();	
	}
	
	public static void inputTest() {
		String message = input.nextLine();
		System.out.println(Hello(message));
		
	}
	
	public static String Hello(String message) {
		if (message.equals("Hi")) {
			return "Hello";
		} else {
			return "Goodbye";
			
		}

	}

}