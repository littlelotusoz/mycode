package TrainingPackage;

import java.io.*;
import java.util.*;

public class CreateArrayFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File(path));
	        String[] items = new String[3]; // use ArrayList if you don't know how many
	        int i = 0;
	        while(sc.hasNextLine() && i < items.length) {
	            items[i] = sc.nextLine();
	            System.out.println(items[i]);
	            i++;
		
	}
		

	}

}
