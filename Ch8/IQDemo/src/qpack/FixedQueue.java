package qpack;
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
	public void put(char ch) throws QueueFullException {
		if (putloc == q.length) {
			throw new QueueFullException(q.length);
		}
		
		q[putloc++] = ch;
	}
	
	// Get a character from the queue
	public char get() throws QueueEmptyException {
		if (getloc == putloc) {
			throw new QueueEmptyException();
		}
		
		return q[getloc++];
	}
	
	public void reset() {
		putloc = getloc = 0;
	}
	
	public int getSize() {
		return q.length;
	}
	
	public char viewChar(int x) {
		return q[x];
	}
}
