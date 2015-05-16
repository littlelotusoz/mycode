package TrainingPackage;

public class TwoDimArray {

public static void main(String[] args) {

	//These two methods will run before they are called from the main method, which is what is called when you run as java application.
	//twoDimArray_Example1();
	//twoDimArray_Example2();
	twoDimArrya_Example2();
}
		
public static void twoDimArray_Example1() {
		
int[][] TwoDim = new int [4][3]; // This is declaring a two dimensional array with 4 columns and 3 rows
		
		int temp = 10;
		for(int h = 0; h < 4; h++) {
			for(int n = 0; n < 3; n++) {
				
				TwoDim[h][n] = temp;
				temp += 10;
				
				System.out.print(TwoDim [h][n] + "  " );
			}
			System.out.println();
			}
	}
	
		
public static void twoDimArray_Example2() {		
String str[][] = {{"User1","Password1"},{"User2","Password2"},{"User3","Password3"}};		
		
		for(int i=0; i<str.length; i++){//This for loop will be total executed 3 times.
			   for(int j=0; j<str[i].length; j++){//This for loop will be executed for 2 time on every iteration.
			    System.out.println(str[i][j]);
			    	
			   }
		}
}


public static void twoDimArrya_Example2() {
	
	int[][] myarray = new int[5][5];
	myarray[0][0] = 10;
	myarray[0][1] = 12;
	myarray[0][2] = 43;
	myarray[0][3] = 11;
	myarray[0][4] = 22;
	
	myarray[1][0] = 20;
	myarray[1][1] = 45;
	myarray[1][2] = 56;
	myarray[1][3] = 1;
	myarray[1][4] = 33;
	
	int rows = 5;
	int cols = 5;
	
	int i, j;
	
	for(i=0; i < rows; i++) {
		
		for(j=0; j < cols; j++) {
			
			System.out.println(myarray[i][j] + " ");
		}
			
}

}
}


