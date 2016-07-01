// Demonstrate the Stack class
public class StackDemo {
	public static void main (String[] args) {
		
		Stack bigS = new Stack(100);
		Stack smallS = new Stack(4);
		char ch;
		int i;
		
		try {
			System.out.println("Using bigS to store the alphabet.");
			// put some numbers into bigS
			for (i = 0; i < 26; i++)
				bigS.push((char) ('A' + i)); 
		}
		catch (FullStackException exc) {
			System.out.println(exc);
		}
		
		try {
			// retrieve and display elements from bigS
			System.out.print("Contents of bigS: ");
			for (i = 0; i < 26; i++) {
				ch = bigS.pop();
				if (ch != (char) 0) System.out.print(ch);
			}
		}
		catch (EmptyStackException exc) {
			System.out.println(exc);
		}
		
		
		
		System.out.println("\n");
		
		try {
			System.out.println("Using smallS to generate errors.");
			// Now, use smallS to generate some errors
			for (i = 0; i < 5; i++) {
				System.out.print("Attempting to store " + (char) ('A' + i));
				smallS.push((char) ('A' + i));
				System.out.println();
			}
		}
		catch (FullStackException exc) {
			System.out.println(exc);
		}
		
		
		System.out.println();
		
		try {
			// more errors on smallS
			System.out.print("Contents of smallS: ");
			for (i = 0; i < 5; i++) {
				ch = smallS.pop();
				if (ch != (char) 0) System.out.print(ch);
			}
		}
		catch (EmptyStackException exc) {
			System.out.println(exc);
		}
		
		
		
	}
}
