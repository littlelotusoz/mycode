package TrainingPackage;

import java.util.Scanner; //importing some java files that allow user input

public class testtax2 {
	
public static void main(String[] args) {
	
	System.out.println("Enter Salary");
	
	Scanner scan = new Scanner(System.in);
	int wage = scan.nextInt();
	
	System.out.println(wage);
	
		double salary = wage;
		double tax = 0.0;
		
		if(salary <= 18200){
			tax=0.0;
	
			{
			System.out.println("Tax for this Salary = " + tax);
			}
		}
		else if (salary >= 18201 && salary <= 37000){
			tax=(salary -18200) * 0.19;
			
			{
			System.out.println("Tax for this Salary = " + tax);
			}
		}
		else if (salary >= 37001 && salary <= 80000){
				tax=((salary -37000) * 0.325)+3572;
				
				{
				System.out.println("Tax for this Salary = " + tax);
				}
		}
		else if (salary >= 80001 && salary <= 180000){
					tax=((salary -80000) * 0.37)+17547;
					
					{
					System.out.println("Tax for this Salary = " + tax);
					}
		}			
		else if (salary >180001){
						tax=((salary -180000) * 0.45)+54547;
						
						{
						System.out.println("Tax for this Salary = " + tax);
						}	
		}				
		else 			
						{
						System.out.println("Unknown");
						}
				
		}
		}



				


	



