
public class TestDemo {
	public static void main (String[] args) {
		
		Test test1 = new Test(3);
		Test test2 = new Test(4);
		
		test1.swap(test1, test2);
		
		System.out.println("test1: " + test1.a);
		System.out.println("test2: " + test2.a);
		
		test1.reverseIt(0);
		
		System.out.println();
		
		System.out.println(test1.sumInt(3, 4, 7, 12));
		System.out.println(test1.sumInt(3, 4, 7));
		
		
	}
}
