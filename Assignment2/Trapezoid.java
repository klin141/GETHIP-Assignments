//Kevin Lin
public class Trapezoid extends Shape implements Printable {

	//Every trapezoid has two bases and a height
	private int baseA;
	private int baseB;
	private int height;
	
	//Constructor
	public Trapezoid(int baseA, int baseB, int height) {
		this.baseA = baseA;
		this.baseB = baseB;
		this.height = height;
		setShapeType("Quadrilateral");
		setShapeName("Trapezoid");
	}
	
	//Get the area of this trapezoid
	@Override
	public double getArea() {
		return ((baseA + baseB) / 2) * height;
	}
	
	//Print the description
	@Override
	public void printDescription() {
		System.out.println("Type is " + getShapeType());
		System.out.println("Base A is " + baseA);
		System.out.println("Base B is " + baseB);
		System.out.println("Height is " + height);
	}
	
}