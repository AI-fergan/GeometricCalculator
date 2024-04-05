import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	static Scanner in = new Scanner(System.in);
	
	public static int openScreen() {		
		System.out.println(" ----------------------\n"
				 	   	 + "| Geometric Calculator |\n"
				 		 + " ----------------------");

		System.out.println("1. Add Shape\n"
						 + "2. Remove Shape\n"
						 + "3. Calc Shape\n"
						 + "4. Print all shapes\n"
						 + "5. Exit");
		
		System.out.print("option: ");
		
		return in.nextInt();
	}
	
	public static int shapesMenu() {
		int option = 0;
		System.out.println("shapes:");
		System.out.println("1. circle");		
		System.out.print("option: ");
		
		return in.nextInt();		
	}
	
	public static Shape getCircle() {
		String name;		
		int x, y;
		double radius;
		System.out.println("Circle: ");		
		
		System.out.print("Please enter shape name: ");
		name = in.nextLine();
		
		System.out.println("please etner coordinates: ");
		System.out.print("x = ");
		x = in.nextInt();
		System.out.print("y = ");
		y = in.nextInt();
		
		System.out.print("please enter radius: ");
		radius = in.nextDouble();
		Shape shape = new Circle(name, new Point(x, y), radius);
		
		return shape;
	}
	
	public static void calcShape(Shape shape) {
		System.out.println(" ---------------\n"
						+  "| Shape details |\n"
						+  " ---------------");
		
		System.out.print("Perimeter: ");
		System.out.println(shape.getPerimeter());
		
		System.out.print("Area: ");
		System.out.println(shape.getArea());
	}
	
	public static int getShapeIndex(ArrayList<Shape> shapes) {
		Shape shape;
		System.out.println("Shapes: ");
		for(int i = 0; i < shapes.size(); i++) {
			shape = shapes.get(i);
			System.out.println("name" + shape.getName() + "type" + shape.getType());
			
		}
		return in.nextInt();
	}
}
