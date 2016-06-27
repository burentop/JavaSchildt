// Create super class
class A {
	A() {
		System.out.println("Constructing A.");
	}
}

// Extend A to subclass
class B extends A {
	B() {
		System.out.println("Constructing B.");
	}
}

// Extend subclass B to another subclass
class C extends B {
	C() {
		System.out.println("Constructing C.");
	}
}

public class OrderofConstruction {
	public static void main (String[] args) {
		C c = new C();
	}
}
