/*
 * Self-Test 1.10
 * 
 * Converts 12 feet of inches to meters
 * 
 */
public class InchToMeterTable {
	public static void main (String[] args) {
		double meters, inches;
		int counter;
		
		counter = 0;
		for (inches = 1; inches <= 144; inches++) {
			meters = inches * 39.37; // convert inches to meters
			System.out.println(inches + " inches is " + meters + " meters.");
			
			counter++;
			// every 12th line print a blank line
			if (counter == 12) {
				System.out.println();
				counter = 0; // reset the line counter
			}
		}
	}
}
