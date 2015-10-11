//Kevin Lin
public class Circle extends Shape implements Printable {
	
	//Every circle has a radius
	private int radius;

	//Constructor
	public Circle(int radius) {
		this.radius = radius;
		setShapeType("Circle");
		setShapeName("Circle");
	}
	
	//Get the area of this circle
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	//Prints the description
	@Override
	public void printDescription() {
		System.out.println("Type is " + getShapeType());
		System.out.println("Radius is " + radius);
	}

}