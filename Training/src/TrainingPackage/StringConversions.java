package TrainingPackage;

public class StringConversions {

	public static void main(String[] args) {
	
		String x = "James Dean";
		
		System.out.println("Hello " + x);
//These are string methods
		System.out.println(x.toUpperCase());
		System.out.println(x.substring(2));
		System.out.println(x.substring(2,7));
		System.out.println(x.charAt(3));
		
		String age = "37";
				String salary = "78965.83";
				//Wrapper classes
				
		int a= Integer.parseInt(age) /2; //cannot do calculations on a string so the string is converted to a integer first
		System.out.println(a);
		
		double s = Double.parseDouble(salary) * .15; //same as above but because it is an int with a decimal point 
		//therefore it needs to use the double command to convert.

		System.out.println(s);
	}

}
