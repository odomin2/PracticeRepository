package Fire.Danger.Sandbox;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Obed Dominguez
 *
 */

public class Test1 {

	private static Scanner scan;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		askforInput("snow");
		
		scan = new Scanner(System.in);
		int user_input_number = scan.nextInt();
		
		int result = Calculate(user_input_number);
	
		System.out.println("The user's input was " + user_input_number);
		
		//bite, short, int, or char. 
		switch (result){
		//Equivalent of line 5
			case 1 :
				System.out.println("Go to line 1 case 1..this was set to positive");
				System.out.println("Grass and timber are set to zero" );
				int grass = 0;
				int timber = 0;
				
				askforInput("precip");
				
				Scanner scan1 = new Scanner(System.in);
				int user_input_number1 = scan1.nextInt();
				
				double x, y, answer;
				x = user_input_number1;
				y = (double) .1;
				answer = x - y; 
										
				System.out.println("The user's input was " + user_input_number1);
				System.out.println("The precip is "+ answer);
				
				int result1 = Calculate(user_input_number1);
				
			switch (result1){
			case 1 :
				System.out.println("This is line 2");
								
				int result2 = BUOTest(10,0);
				System.out.println("This is a random number " + result2);
			
				break;
			case 0 : 
				System.out.println("This is line 4.1");
				break; 
			case -1 :
				System.out.println("This is line 4");
				break;
			
			}
			break;
			//equivalent to line 5
			case 0 :
				System.out.println("Go to line 5.1 case 0");
				break;
			//equivalent to line 5 
			case - 1 :
				System.out.println("Go to line 1 case -1");
				break;
				}	
		
				
	}
	//This method is for asking the dry, wet, isnow, precip, wind, buo, iherb, df, ffm, adfm, grass, timber, and fload.
	public static void askforInput(String name){ 
		  System.out.println("Enter the " + name + " amount");
		    		   
		  }
	//This method is going to calculate the weather condition and set the condition for the case. 
	public static int Calculate(int user_input_number){
 
		if (user_input_number <= -1 ){
	    	user_input_number = -1;
	    	System.out.println("The user's input is set to negative " + user_input_number);
		 }
		  else if (user_input_number == 0){
			  user_input_number = 0;
			  System.out.println("The user's input is set to zero " + user_input_number);
			}
		  else {
			  user_input_number = 1; 
			  System.out.println("The user's input is set to positive " + user_input_number);
		  }
		return (user_input_number);
	    
	}

	/*This method will calculate the build up index BUO. 
	This should be the complicated formula BUO = -50 *ALOG(1.-(1.exp(-BUO/50.))*EXP....etc.., 
	but for code simplification the result will yield a 
	negative, zero, or positive result. */
	//generatRandomPositiveNegitiveValue
	public static int BUOTest (int min , int max) {
	    //Random rand = new Random();
		int random1 = -min + (int) (Math.random() * ((max - (-min)) + 1));
		return random1;
	}
		
}


