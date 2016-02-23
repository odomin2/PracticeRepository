package Fire.Danger.Sandbox;

import java.util.Scanner;


public class nfdri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wc = 0;
		int grass = 1;
		int timber = 1; 
		int precip = 10;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a snow amout");
    wc = in.nextInt(); 
    //If statement will test for input on the weather condition and set the condition for the case.  
    if (wc <= -1 ){
    	wc = -1;
	 }
	  else if (wc == 0){
		  wc = 0;
		}
	  else {
		  wc = 1; 
	  }
		//bite, short, int, or char. 
		switch (wc)
		{
		case -1 :
			grass = 0;
			timber = 0; 
			
			System.out.println("Go to line 5 case -1");
			System.out.println("Grass is set to" + " "+grass);
			break;
		case 0 :
			System.out.println("Go to line 5.1 case 0");
			break;
		case 1 :
			System.out.println("Go to line 1 case 1");
			break;
		}
	}

}
