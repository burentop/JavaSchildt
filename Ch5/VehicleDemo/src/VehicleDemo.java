// Program that uses the Vehicle class.
public class VehicleDemo {
	public static void main (String[] args) {
		Vehicle minivan = new Vehicle(7, 16, 21);
		int range;
		

		// compute the range assuming a full tank of gas
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);
	}
}
