package TrainingPackage;

import org.testng.annotations.Test;

public class Prac {

public static void main(String[] args) {
	
	
}
		
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
			  
			if(aSmile==bSmile) {
			  
			  return true;
			}
			  else {
			  return false;
			}

}

public static boolean parrotTrouble(boolean talking, int hour) {
	  return (talking && (hour < 7 || hour > 20));
	  // Need extra parenthesis around the || clause
	  // since && binds more tightly than ||
	  // && is like arithmetic *, || is like arithmetic +
	}



public boolean makes10(int a, int b) {
	
	  if(a==10 || b==10) {
		  return true;
	  }
	  
		  else if(a+b == 10) {
			  return true;
		  }
		  
		  else {
			  return false;
		  }
	  }
	

public boolean nearHundred(int n) {
	
	if(Math.abs(n-100) <=10) {
		return true;
	}
	else if(Math.abs(n-200) <=10)	 {
		return true;
	}
		else 
			return false;
}

public boolean posNeg(int a, int b, boolean negative) {
	
	if(a < 0 && b < 0 && negative == true) {
		return true;
	}
	
	else if(a > 0 && b < 0 || a < 0 && b > 0) {
			return true;
		}
	else
		return false;
	
	}

public String notString(String str) {
	
	if(str.startsWith("not")) {
		return str;
	}
		else
			return "not "+str;
}


public String front3(String str) {
	
	String mystring = "";
	
	if(mystring.length() < 3){
		
		str = mystring.substring(0, mystring.length()-1);
	}
	
	else if(mystring.length() >= 3) {
		
	str = mystring.substring(0, 2);
	
	}
	
	str = mystring+mystring+mystring;
	
	{
	
	return str;
	
	}
	
	
public String front22(String str) {
		
		
		
		if(str.length() < 2) {
			return str+str+str;
		}
		
		else {
			String front=str.substring(0, 2);
			return front+str+front;
			}
		
		  
	}
	
	public boolean startHi(String str) {
		
		if(str.startsWith("hi")) {
			return true;
		}
		
		else 
			return false;
			
			
		}
		  
	public boolean hasTeen(int a, int b, int c) {
		
		if(a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19) {
			return true;
		}
		
		else
			return false;
		  
	}
		
	public String delDel(String str) {
		
		String del = "del";
		String start = str.substring(1, del.length()-1);	
		
		if(start.equals("del")) {
			return
			str = str.substring(del.length()-1, str.length());
		}
		
			else 
				return str;
		  
	}

public int close10(int a, int b) {
	
	if(Math.abs(a-10) < Math.abs(b-10)) {
	return a;
	}
	if(Math.abs(a-10) == Math.abs(b-10)) {
		return 0;
	}
	else 
		return b;
			
}
		
public boolean in3050(int a, int b) {
	
	if((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
		return true;	
	}
	
	else if((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) {
		return true;
	}
	
	else 
		return false;
  
}

public boolean stringE(String str) {

String me = "e";
	int counter = 0;
	
	for(int i= 0; str.contains(me); i++) {
		str = str.replaceFirst(me, "b");
		counter++;		
	}
	if(counter >=1 && counter <=3) {
		return true;
	}
	
	else
	{
	return false;
	}

		
		public boolean lastDigit(int a, int b) {
			
		String stringa = String.valueOf(a);
		String stringb = String.valueOf(b);
		
		String lasta = stringa.substring(stringa.length()-1);
		String lastb = stringb.substring(stringb.length()-1);
		
		if(lasta.equals(lastb)) {
			return true;
			
		}
			else 
				return false;
		}
		
	}

}
  
		  



	
}	

	 }



		
	
	
	  


	
	
	
	  

	
