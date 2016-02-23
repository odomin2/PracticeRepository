/**
 * 
 */
package Fire.Danger.Sandbox;

import java.util.Scanner;

/**
 * @author Obed Dominguez
 *
 */

public class NFDRI1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		askforInput("snow");
		
		Scanner scan = new Scanner(System.in);
		int user_input_number = scan.nextInt();
		
		int result = Calculate(user_input_number);
	
		System.out.println("The user's input was " + user_input_number);
		
		//bite, short, int, or char. 
				switch (result)
				{
				case -1 :
					System.out.println("Go to line 5 case -1");
					System.out.println("Grass is set to" );
					break;
				case 0 :
					System.out.println("Go to line 5.1 case 0");
					break;
				case 1 :
					System.out.println("Go to line 1 case 1");
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
}
