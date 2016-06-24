
public class AvgDouble {
	public static void main (String[] args) {
		
		double[] myDouble = {3.14, 6.49, 10.56, 4.56, 23.98, 98.45, 45.23, 1.23, 9.23, 77.34};
		double totalDouble = 0;
		double avgDouble;
		
		for (double number : myDouble) {
			totalDouble += number;
		}
		
		avgDouble = totalDouble / myDouble.length;
		
		System.out.println("The average of the array is: " + avgDouble);
		
	}
}
