//Kevin Lin
public class Rectangle extends Shape implements Printable {
	
	//Every rectangle has a width and a height
	private int height;
	private int width;
	
	//Constructor
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
		setShapeType("Quadrilateral");
		setShapeName("Rectangle");
	}
	
	//Get the area of this rectangle
	@Override
	public double getArea() {
		return height * width;
	}
	
	//Prints the description
	@Override
	public void printDescription() {
		System.out.println("Type is " + getShapeType());
		System.out.println("Height is " + height);
		System.out.println("Width is " + width);
	}
	
}