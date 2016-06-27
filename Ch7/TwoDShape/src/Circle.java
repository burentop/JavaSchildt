// Extends TwoDShape
public class Circle extends TwoDShape {
	Circle(double r) {
		super(2 * r, "circle");
	}
	
	double area() {
		return Math.PI * Math.pow((getWidth() / 2), 2);
	}
}
