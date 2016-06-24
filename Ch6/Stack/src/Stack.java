
public class Stack {
	
	private char[] s; // this array hold the stack
	private int pushloc, poploc;
	
	Stack(int size) {
		s = new char[size]; // allocate memory for stack
		pushloc = poploc = 0;
	}
	
	// Construct a Stack from a Stack
	Stack (Stack ob) {
		pushloc = ob.pushloc;
		poploc = ob.poploc;
		s = new char[ob.s.length];
		
		// copy elements
		for (int i = poploc; i < pushloc; i++)
			s[i] = ob.s[i];
	}
	
	// Construct a Stack with initial values.
	Stack (char a[]) {
		pushloc = 0;
		poploc = 0;
		s = new char[a.length];
		
		for (int i = 0; i < a.length; i++) push(a[i]);
		poploc = s.length - 1;
	}
	
	// push a character into the stack
	void push(char ch) {
		if (pushloc == s.length) {
			System.out.println(" - Stack is full.");
			return;
		}
		
		s[pushloc++] = ch;
		poploc = pushloc;
	}
	
	// pop a character from the stack
	char pop() {
		if (poploc < 0) {
			System.out.println(" - Stack is empty.");
			return (char) 0;
		}
		char toReturn = s[poploc];
		poploc--;
		return toReturn;
	}
	
}
