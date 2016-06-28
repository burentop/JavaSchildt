
public class SeriesDemo {

	public static void main (String[] args) {
		
		ByTwos ob = new ByTwos();
		ByThrees ob2 = new ByThrees();
		
		for(int i = 0; i < 5; i++)
			System.out.println("Next value is " + ob.getNext());
		
		System.out.println("\nResetting");
		ob.reset();
		for(int i = 0; i < 5; i++)
			System.out.println("Next value is " + ob.getNext());
		
		System.out.println("\nBy Threes");
		ob2.setStart(3);
		for(int i = 0; i < 5; i++)
			System.out.println("Next value is " + ob2.getNext());
		
	}
}
