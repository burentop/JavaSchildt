// A subclass of TwoDShape
public class Rectangle extends TwoDShape {

	// default constructor
	Rectangle() {
		super();
	}
	
	// Constructor for Rectangle
	Rectangle(double w, double h) {
		super(w, h, "rectangle");
	}
	
	// Construct a square
	Rectangle(double x) {
		super(x, "rectangle");
	}
	
	// Construct object from object
	Rectangle(Rectangle ob) {
		super(ob);
	}
	
	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
	
	// Override area()
	double area() {
		return getWidth() * getHeight();
	}
	
}
