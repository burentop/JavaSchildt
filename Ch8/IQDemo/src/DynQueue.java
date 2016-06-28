
public class DynQueue implements ICharQ {

	private char q[]; // holds the queue
	private int putloc, getloc;
	
	public DynQueue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}
	
	public void put(char ch) {
		if (putloc == q.length) {
			// increase queue size
			char t[] = new char[q.length * 2];
			
			// copy elements into new queue
			for (int i = 0; i < q.length; i++)
				t[i] = q[i];
			
			q = t;
		}
		
		q[putloc++] = ch;		
	}
	
	public char get() {
		if (getloc == putloc) {
			System.out.println(" - Queues is empty.");
			return (char) 0;
		}
		
		return q[getloc++];
	}
	
}
