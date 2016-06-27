// Extend Vehicle to create a Truck specialization.
public class Truck extends Vehicle {
	private int cargocap; // cargo capacity in pounds
	
	// This is a constructor for Truck
	Truck(int p, int f, int m, int c) {
		super(p, f, m);
		
		cargocap = c;
	}
	
	// Accessor methods
	int getCargo() { return cargocap; }
	void putCargo(int c) { cargocap = c; }
}
