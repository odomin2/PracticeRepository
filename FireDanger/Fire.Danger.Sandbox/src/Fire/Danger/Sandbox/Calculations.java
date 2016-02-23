package Fire.Danger.Sandbox;

import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weatherconditions = 0;
		
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println("Enter a snow amout");
	      weatherconditions = in.nextInt(); 
		
	  if (weatherconditions <= 0 ){
		System.out.println("Go to line 5");
	 
	  }
	  else {
		  System.out.println("Go to line 1");
		}
	}

	}


