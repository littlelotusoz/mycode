package TrainingPackage;

public class StringArray {

	public static void main(String[] args) {
		

		String[] st = {"one", "two", "three"}; //creation of a string array
		
		{
			System.out.println(st[0]+ "," + st[1]+ "," + st[2] + ". This is string array 1...");
		}
		
		String[] stx = new String[5];
				
				stx[3] = "third";
				stx[0] = "first";
				{
					System.out.println(stx[0]+ "," + stx[3]+ ". This is string array 2...");
				}
	}

}
