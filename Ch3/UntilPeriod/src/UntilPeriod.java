
public class UntilPeriod {
	public static void main (String[] args) throws java.io.IOException {
		
		
		char input = 'a';
		int count = 0;
		
		System.out.print("Press a key, followed by ENTER (press '.' to exit): ");
		
		while (input != '.') {
			input = (char) System.in.read();
			if (input == ' ')
				count++;
		}
		
		System.out.println("Total spaces: " + count);
		
	}
}
