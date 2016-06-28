// Fixed-size queue for characters.
public class FixedQueue implements ICharQ {

	private char q[]; // array that holds the queue
	private int putloc, getloc; // put and get indices
	
	// Construct empty queue with given size
	public FixedQueue(int size) {
		q = new char[size]; // allocate memory for queue
		
		putloc = getloc = 0;
	}
	
	// Put character into the queue
	public void put(char ch) {
		if (putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		
		q[putloc++] = ch;
	}
	
	// Get a character from the queue
	public char get() {
		if (getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		
		return q[getloc++];
	}
	
	public void reset() {
		putloc = getloc = 0;
	}
	
}
