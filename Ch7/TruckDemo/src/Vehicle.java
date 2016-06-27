public class Vehicle {

	private int passengers; // number of passengers
	private int fuelcap; // fuel capacity in gallons
	private int mpg; // fuel consumption in miles per gallon
	
	// Vehicle constructor
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	// Display the range
	int range() {
		return fuelcap * mpg;
	}
	
	// Compute fuel needed for a given distance.
	double fuelneeded (int miles) {
		return (double) miles / mpg;
	}
	
	// Accessor methods
	int getPassengers() { return passengers; }
	void setPassengers(int p) { passengers = p; }
	int getFuelCap() { return fuelcap; }
	void setFuelCap(int f) { fuelcap = f; }
	int getMpg() { return mpg; }
	void setMpg(int m) { mpg = m; }
	
}
