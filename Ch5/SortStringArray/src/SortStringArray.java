/*
 * Self-Test 5.4
 * 
 * Sort array of Strings.
 * 
 */
public class SortStringArray {
	public static void main (String[] args) {
		
		String[] words = {"zebra", "apple", "rocket", "computer", "laptop", "phone", "music", "eighty", "no", "yes"};
		int a, b, size;
		String t;
		
		size = 10; // number of words in the array
		
		// display original array
		System.out.print("Original array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + words[i]);
		}
		System.out.println();
		
		// Bubble sort
		for (a = 1; a < size; a++) {
			for (b = size - 1; b >= a; b--) {
				if (words[b - 1].compareToIgnoreCase(words[b]) > 0) { // if out of order
					// exchange elements
					t = words[b - 1];
					words[b - 1] = words[b];
					words[b] = t;
				}
			}
		}
		
		// display sorted array
		System.out.print("Sorted array is: ");
		for (int i = 0; i < size; i++)
			System.out.print(" " + words[i]);
		System.out.println();
		
	}
}
