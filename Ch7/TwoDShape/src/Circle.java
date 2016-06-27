// Extends TwoDShape
public class Circle extends TwoDShape {
	Circle() {
		super();
	}
	
	Circle(double r) {
		super(2 * r, "circle");
	}
	
	double area() {
		return Math.PI * Math.pow((getWidth() / 2), 2);
	}
}
