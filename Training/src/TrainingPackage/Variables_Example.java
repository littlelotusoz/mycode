package TrainingPackage;

public class Variables_Example {

//Class Variables - College name will be same for both departments so declared as class(static) variable.
public static String College_Name = "A1 College"; 
		 
//Instance Variables
private String Department = "Computer Engineering";
private String name; 
private double percentile;

public static void main(String[] args) {//Static Method
//Can access class variable directly If needed. i.e. Collage_Name
	
		Variables_Example student1 = new Variables_Example("Robert");
		 student1.setPercentage(67.32);
		 student1.print_details();
		 //Can access Instance variable using object reference If needed. 
		 //Example : student1.name = "Robert";

		 Variables_Example student2 = new Variables_Example("Alex");
		  student2.setPercentage(72.95);
		  student2.print_details();
		 } 
public Variables_Example(String student_name){//Constructor
		  //Can access Instance variable directly Inside constructor.
		  name = student_name;   
		 }  
public void setPercentage(double perc){
		  //Can access Instance variable directly Inside non static method.
		  percentile = perc;  
		 }
		  
public void print_details(){
		  int Year = 2014; //Local Variable - Can not access It outside this method.
		  System.out.println("Resultg Of Year = "+Year);
		  System.out.println("Student's Collage Name = "+College_Name);
		  System.out.println("Student's Department = "+Department);
		  System.out.println("Student's Name = "+name);  
		  System.out.println("Student's percentile = "+percentile+"%");
		  System.out.println("**********************");   
		 }

		}
	


