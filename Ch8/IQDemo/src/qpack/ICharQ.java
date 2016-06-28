package qpack;

public interface ICharQ {

	// Put a character into the Queue.
	void put(char ch);
	
	// Get a character from the Queue.
	char get();
	
	// Resets the queue
	void reset();
	
	// Returns the size of the queue
	int getSize();
	
	// Return an item from the queue
	char viewChar(int x);
	
	static FixedQueue copyQ(ICharQ q) {
		
		FixedQueue newQ = new FixedQueue(q.getSize());
		for (int i = 0; i < q.getSize(); i++) {
			newQ.put((char) (q.viewChar(i)));
		}
		
		return newQ;
	}
	
}
