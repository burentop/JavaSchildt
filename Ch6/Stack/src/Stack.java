
public class Stack {
	
	private char[] s; // this array hold the stack
	private int loc;
	
	Stack(int size) {
		s = new char[size]; // allocate memory for stack
		loc = 0;
	}
	
	// Construct a Stack from a Stack
	Stack (Stack ob) {
		loc = ob.loc;
		s = new char[ob.s.length];
		
		// copy elements
		for (int i = 0; i < loc; i++)
			s[i] = ob.s[i];
	}
	
	// Construct a Stack with initial values.
	Stack (char a[]) {
		loc = 0;
		s = new char[a.length];
		
		for (int i = 0; i < a.length; i++) push(a[i]);
		loc = s.length - 1;
	}
	
	// push a character into the stack
	void push(char ch) {
		if (loc == s.length) {
			System.out.println(" - Stack is full.");
			return;
		}
		
		s[loc++] = ch;
	}
	
	// pop a character from the stack
	char pop() {
		if (loc == 0) {
			System.out.println(" - Stack is empty.");
			return (char) 0;
		} else {
			loc--;
			return s[loc];
		}
	}
	
}
