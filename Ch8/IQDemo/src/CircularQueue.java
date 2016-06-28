
public class CircularQueue implements ICharQ {

	private char q[]; // holds the queue
	private int putloc, getloc; // put and get indices
	
	public CircularQueue(int size) {
		q = new char[size + 1];
		putloc = getloc = 0;
	}
	
	public void put(char ch) {
		/* Queue is full if 1) putloc is one less than getloc, or
		 * 2) putloc is at the end of the array and getloc at beginning.
		 */
		if (putloc + 1 == getloc | ((putloc == q.length) & (getloc == 0))) {
			System.out.println(" - Queue is full.");
			return;
		}
		
		q[putloc++] = ch;
		if (putloc == q.length) putloc = 0; // loop back
	}
	
	public char get() {
		if (getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		
		char ch = q[getloc++];
		if (getloc == q.length) getloc = 0; // loop back
		return ch;
	}
	
}
