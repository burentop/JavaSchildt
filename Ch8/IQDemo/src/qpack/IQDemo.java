package qpack;
// Demonstrate ICharQ interface
class IQDemo {
	public static void main (String[] args) {
		
		FixedQueue q1 = new FixedQueue(10);
		
		char ch;
		int i;
		
		try {
			for (i = 0; i < 11; i++) {
				System.out.print("Attempting to store : " + (char) ('A' + i));
				q1.put((char) ('A' + i));
				System.out.println(" - OK");
			}
			System.out.println();
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		
		try {
			for (i = 0; i < 11; i++) {
				System.out.print("Getting next char: ");
				ch = q1.get();
				System.out.println(ch);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		
	}
}
