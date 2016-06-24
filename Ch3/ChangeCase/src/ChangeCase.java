
public class ChangeCase {
	public static void main (String[] args) throws java.io.IOException {
		
		char input = 'a';
		int count = 0;
		
		System.out.print("Press a key and then hit ENTER (press '.' to quit): ");
		
		while (input != '.') {
			input = (char) System.in.read();
			
			if (input > 96 && input < 123) {
				input = (char) (input - 32);
				count++;
				System.out.println(input);
			}
			else if (input > 64 && input < 91) {
				input = (char) (input + 32);
				count++;
				System.out.println(input);
			}
			
		}
		
		System.out.println("Total case changes: " + count);
		
	}
}
