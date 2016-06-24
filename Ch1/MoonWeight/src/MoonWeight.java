import java.util.Scanner;
public class MoonWeight {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int weight, moonWeight;
		
		System.out.print("Enter your weight in lbs: ");
		weight = scan.nextInt();
		
		moonWeight = (int) (weight * 0.17);
		
		System.out.println("Your effective weight on the moon is " + moonWeight + " lbs.");
		
		scan.close();
		
	}
}
