//Kevin Lin
public class Triangle extends Shape implements Printable {
	
	//Every triangle has a base and height
	private int base;
	private int height;
	
	//Constructor
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
		setShapeType("Triangle");
		setShapeName("Triangle");
	}
	
	//Get the area of this triangle
	@Override
	public double getArea() {
		return (base * height) / 2;
	}
	
	//Prints the description
	@Override
	public void printDescription() {
		System.out.println("Type is " + getShapeType());
		System.out.println("Base is " + base);
		System.out.println("Height is " + height);
	}
	
}