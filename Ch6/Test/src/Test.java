
public class Test {

	int a;
	String aString;
	
	Test (int i) {
		a = i;
		aString = "reverse";
	}
	
	void swap(Test ob1, Test ob2) {
		int temp = ob1.a;
		ob1.a = ob2.a;
		ob2.a = temp;
	}
	
	void reverseIt(int idx) {
		if (idx != this.aString.length() - 1) reverseIt(idx + 1);
		
		System.out.print(this.aString.charAt(idx));
	}
	
}
