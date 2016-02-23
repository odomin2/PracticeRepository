/**
 * 
 */
package Fire.Danger.Sandbox;

/**
 * @author Obed Dominguez
 *
 */
public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void BUOTest (int max , int min) {
	    //Random rand = new Random();
	    int random1 = -min + (int) (Math.random() * ((max - (-min)) + 1));
	    
	    System.out.println("This is a random number" + random1);
	}
}
