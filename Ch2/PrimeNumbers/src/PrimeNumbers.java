/*
 * Self-Test 2.10
 * 
 * Finds prime numbers between 2 and 100
 * 
 */
public class PrimeNumbers {
	public static void main (String[] args) {
		
		int loop, counter = 3;
		boolean prime = true;
		
		System.out.println(2);
		
		while (counter <= 100) {
			for (loop = 2; loop < counter; loop++) {
				if (counter % loop == 0) 
					prime = false;
			}
			if (prime)
				System.out.println(counter);
			counter++;
			prime = true;
		}
		
	}
}
