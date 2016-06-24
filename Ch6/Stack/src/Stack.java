
public class Stack {
	
	private char[] s; // this array hold the stack
	private int pushloc, poploc;
	
	Stack(int size) {
		s = new char[size]; // allocate memory for stack
		pushloc = poploc = 0;
	}
	
	// push a character into the stack
	void push(char ch) {
		if (pushloc == s.length) {
			System.out.println(" - Stack is full.");
			return;
		}
		
		s[pushloc++] = ch;
	}
	
	// pop a character from the stack
	char pop() {
		if (poploc == pushloc) {
			System.out.println(" - Stack is empty.");
			return (char) 0;
		}
		
		return s[poploc++];
	}
	
}
