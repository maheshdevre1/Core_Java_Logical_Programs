package DesignPattern;

interface Shape {
	void draw();
}

class Circle implements Shape {
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

class Rectangle implements Shape {
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

class Square implements Shape {
	public void draw() {
		System.out.println("Drawing a Square");
	}
}

class ShapeFactory {

	// Factory method
	public Shape getShape(String shapeType) {
		if (shapeType == null)
			return null;

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}
}

public class FactoryDesignPattern {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw(); // Output: Drawing a Circle

		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw(); // Output: Drawing a Rectangle

		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw(); // Output: Drawing a Square
	}

}
