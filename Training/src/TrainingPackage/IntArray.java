package TrainingPackage;

public class IntArray {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50}; // Creation of an array and storing these numbers in the array.
		System.out.println(a[2] + " " + a[4]+ "........................");
		{
		System.out.println("Next it prints all contents of array");
		
		}
		
		for (int temp : a) { //prints out all contents of above array
			System.out.println(temp);
			
			{
				System.out.println("......");
			}
			
	
		int[] x = new int[5]; //adding a new integer array containing 5 numbers
		x[3] = 25; // declaring what the 3rd spot in the array should be
		x[0] = 12; // declaring what the first spot in the array should be
		//if you don't declare all spots in the array it defaults to 0 for an integer array
		
		
		for(int temp2 : x) {
			System.out.println(temp2); //prints out all contents of array x
		}
		
		}
	}
}

		
	
		
		

	
		
					


