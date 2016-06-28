import qpack.CirDynQueue;
import qpack.CircularQueue;
import qpack.FixedQueue;
import qpack.ICharQ;

// Demonstrate ICharQ interface
public class IQDemo {
	public static void main (String[] args) {
		
		FixedQueue q1 = new FixedQueue(10);
		
		CircularQueue q3 = new CircularQueue(10);
		CirDynQueue q4 = new CirDynQueue(5);
		
		ICharQ iQ;
		
		char ch;
		int i;
		
		
		
		iQ = q1;
		// Fixed queue
		for (i = 0; i < 10; i++)
			iQ.put((char) ('A' + i));
		
		FixedQueue q2 = ICharQ.copyQ(q1);
		
		System.out.print("Contents of fixed queue: ");
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();
		
		
		
		
		iQ = q2;

		System.out.print("Contents of dynamic queue: ");
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		
		System.out.println();
		
		iQ = q4;
		// Circular queue
		for (i = 0; i < 10; i++)
			iQ.put((char) ('A' + i));
		
		System.out.print("Contents of circular dynamic queue: ");
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		
		System.out.println();
		
		// Add more characters to circular queue
		for (i = 10; i < 20; i++)
			iQ.put((char) ('A' + i));
		
		System.out.print("Contents of circular dynamic queue: ");
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		
		System.out.println("\nStore and consume from circular queue.");
		
		for (i = 0; i < 20; i++) {
			iQ.put((char) ('A' + i));
			ch = iQ.get();
			System.out.print(ch);
		}
		
	}
}
