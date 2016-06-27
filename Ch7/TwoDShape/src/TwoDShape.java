// A simple class hierarchy.

// A class for two-dimensional objects.
abstract class TwoDShape {
	
	private double width;
	private double height;
	private String name;
	
	// Default constructor
	TwoDShape() {
		width = height = 0.0;
		name = "none";
	}
	
	// Parameterized constructor
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}
	
	// Construct object with equal width and height
	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}
	
	// Construct object from object
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	
	// Accessor methods for width and height
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) { width = w; }
	void setHeight(double h) { height = h; }
	
	String getName() { return name; }
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}	
	
	abstract double area();
}

//A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
	private String style;
	
	// Default constructor
	Triangle() {
		super();
		style = "none";
	}
	
	// Constructor
	Triangle(String s, double w, double h) {
		super(w, h, "triangle"); // call superclass constructor
		
		style = s;
	}
	
	// One argument constructor
	Triangle(double x) {
		super(x, "triangle");
		style = "filled";
	}
	
	// Construct object from object
	Triangle(Triangle ob) {
		super(ob); // pass object to TwoDShape constructor
		style = ob.style;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

class Shapes {
	public static void main (String[] args) {
		TwoDShape shapes[] = new TwoDShape[5];
		
		shapes[0] = new Triangle("outlined", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle(7.0);
		shapes[4] = new Circle(3.0);
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("object is " + shapes[i].getName());
			System.out.println("Area is " + shapes[i].area());
			System.out.println();
		}
		
	}
}