import java.util.LinkedList;

//Kevin Lin
public class ShapesRunnerSorter {
	
	public ShapesRunnerSorter() {
		//Create the array, use LinkedList because I'm doing an Insert Sort and we need the accessing speed
		LinkedList<Shape> shapes = new LinkedList<Shape>();
		shapes.add(new Circle(5));
		shapes.add(new Rectangle(10, 3));
		shapes.add(new Triangle(3, 4));
		shapes.add(new Trapezoid(4, 5, 6));
		shapes.add(new Rhombus(5, 6));
		
		shapes.add(new Circle(1));
		shapes.add(new Rectangle(5, 2));
		shapes.add(new Triangle(2, 2));
		shapes.add(new Trapezoid(2, 3, 3));
		shapes.add(new Rhombus(2, 3));
		
		shapes.add(new Circle(10));
		shapes.add(new Rectangle(20, 6));
		shapes.add(new Triangle(6, 8));
		shapes.add(new Trapezoid(8, 10, 12));
		shapes.add(new Rhombus(10, 12));
		
		shapes.add(new Circle(9));
		shapes.add(new Rectangle(3, 6));
		shapes.add(new Triangle(4, 10));
		shapes.add(new Trapezoid(14, 15, 26));
		shapes.add(new Rhombus(9, 9));
		
		shapes = insertSort(shapes);
		
		//Print the shapes' descriptions and their area
		for(int i = 0; i < shapes.size(); i++) {
			System.out.println("Area: " + shapes.get(i).getArea());
			shapes.get(i).printDescription();
			System.out.println();
		}
		
	}
	
	//Insert sort has a big O of O(n^2)
	private LinkedList<Shape> insertSort(LinkedList<Shape> shapes) {
		//For each one put it in the sorted list thats being created as it goes
		for(int i = 1; i < shapes.size(); i++) {
			for(int j = i; j > 0; j--) {
				if(shapes.get(j).getArea() < shapes.get(j - 1).getArea()) {
					Shape shape = shapes.get(j);
					shapes.set(j, shapes.get(j - 1));
					shapes.set(j - 1, shape);
				}
			}
		}
		return shapes;
	}
	
	public static void main(String[] args) {
		new ShapesRunnerSorter();
	}
	
}