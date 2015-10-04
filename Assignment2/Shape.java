//Kevin Lin
public abstract class Shape implements Printable {
	
	//Every shape will have a type and a name
	private String shapeType = "";
	private String shapeName = "";
	
	//Returns the type of the shape
	public String getShapeType() {
		return shapeType;
	}
	
	//Returns the shapes name
	public String getShapeName() {
		return shapeName;
	}
	
	//Sets the shape type
	public void setShapeType(String type) {
		shapeType = type;
	}
	
	//Sets the shape name
	public void setShapeName(String name) {
		shapeName = name;
	}
	
	//Gets the area of the sahape
	public abstract double getArea();
	
	public void printDescription() {
		
	}
	
}