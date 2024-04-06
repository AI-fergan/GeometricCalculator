import java.awt.Color;
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
						 + "4. Exit");
		
		System.out.print("option: ");
		
		return in.nextInt();
	}
	
	public static int shapesMenu() {
		int option = 0;
		System.out.println("shapes:");
		System.out.println("1. circle");
		System.out.println("2. line");
		System.out.println("3. triangle");
		System.out.print("option: ");
		
		return in.nextInt();		
	}
	
	public static Color getColor() {
		System.out.println("(Note: default color is black)");
		System.out.println("Colors:");
		System.out.println("1. Red");
		System.out.println("2. Green");
		System.out.println("3. Blue");
		
		switch(in.nextInt()) {
		case 1:
			return Color.RED;
		case 2:
			return Color.GREEN;
		case 3:
			return Color.BLUE;
		}
		
		return Color.BLACK;
	}
	
	public static Shape getCircle() {
		String name;		
		int x, y;
		double radius;
		System.out.println("Circle: ");		
		
		System.out.print("Please enter shape name: ");
		in.nextLine();
		name = in.nextLine();
		
		System.out.println("please etner coordinates: ");
		System.out.print("x = ");
		
		x = in.nextInt();
		System.out.print("y = ");
		y = in.nextInt();
		
		System.out.print("please enter radius: ");
		radius = in.nextDouble();
		Shape shape = new Circle(name, new Point(x, y), radius, getColor());
		
		return shape;
	}
	
	public static Shape getLine() {
		String name;		
		int x1, y1, x2, y2;
		System.out.println("Line: ");		
		
		System.out.print("Please enter shape name: ");
		in.nextLine();
		name = in.nextLine();
		
		System.out.println("Point 1:");
		System.out.print("x = ");
		
		x1 = in.nextInt();
		System.out.print("y = ");
		y1 = in.nextInt();
		
		System.out.println("Point 2:");
		System.out.print("x = ");
		
		x2 = in.nextInt();
		System.out.print("y = ");
		y2 = in.nextInt();

		Shape shape = new Line(name, new Point[] {new Point(x1, y1), new Point(x2, y2)}, getColor());
		
		return shape;
	}
	
	public static Shape getTriangle() {
		String name;		
		int x1, y1, x2, y2, x3, y3;
		System.out.println("Triangle: ");		
		
		System.out.print("Please enter shape name: ");
		in.nextLine();
		name = in.nextLine();
		
		System.out.println("Point 1:");
		System.out.print("x = ");
		
		x1 = in.nextInt();
		System.out.print("y = ");
		y1 = in.nextInt();
		
		System.out.println("Point 2:");
		System.out.print("x = ");
		
		x2 = in.nextInt();
		System.out.print("y = ");
		y2 = in.nextInt();
		
		System.out.println("Point 3:");
		System.out.print("x = ");
		
		x3 = in.nextInt();
		System.out.print("y = ");
		y3 = in.nextInt();

		Shape shape = new Triangle(name, new Point[] {new Point(x1, y1), new Point(x2, y2), new Point(x3, y3)}, getColor());
		
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
	
	public static Shape getShapeIndex(ArrayList<Shape> shapes) {
		Shape shape;
		System.out.println("Shapes: ");
		for(int i = 0; i < shapes.size(); i++) {
			shape = shapes.get(i);
			System.out.println("shape " + i + ".\n" + shape);			
		}
		
		System.out.print("option: ");
		
		return shapes.get(in.nextInt());
	}

}
