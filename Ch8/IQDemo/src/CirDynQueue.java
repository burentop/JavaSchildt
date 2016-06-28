
public class CirDynQueue implements ICharQ {

	private char q[]; // holds the queue
	private int putloc, getloc; // put and get indices
	
	public CirDynQueue(int size) {
		q = new char[size + 1];
		putloc = getloc = 0;
	}
	
	public void put(char ch) {
		/* Queue is full if 1) putloc is one less than getloc, or
		 * 2) putloc is at the end of the array and getloc at beginning.
		 * If the queue is full then a new one (double in size) is created.
		 */
		if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
			// Create new queue
			char t[] = new char[q.length * 2];
			
			// Copy elements from q to t
			for (int i = 0; i < q.length; i++)
				t[i] = q[i];
			
			q = t;
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
	
	public void reset() {
		getloc = putloc = 0;
	}
	
}
