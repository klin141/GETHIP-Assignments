//Kevin Lin
public class Rhombus extends Shape implements Printable {

	//Every rhombus has two diagonals
	private int diagonal1;
	private int diagonal2;
	
	//Constructor
	public Rhombus(int diagonal1, int diagonal2) {
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
		setShapeType("Quadrilateral");
		setShapeName("Rhombus");
	}
	
	//Get the area of this rhombus
	@Override
	public double getArea() {
		return (diagonal1 * diagonal2) / 2;
	}
	
	//Prints the description
	@Override
	public void printDescription() {
		System.out.println("Type is " + getShapeType());
		System.out.println("Diagonal 1 is " + diagonal1);
		System.out.println("Diagonal 2 is " + diagonal2);
	}
	
}