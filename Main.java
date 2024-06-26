import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {		
        ArrayList<Shape> shapes = new ArrayList<>();
		int option;
		
		do {
			option = Menu.openScreen();			
			switch(option) {
				case 1:				
					switch(Menu.shapesMenu()) {
						case 1:
							shapes.add(Menu.getCircle());
							break;
						case 2:
							shapes.add(Menu.getLine());
							break;
						case 3:
							shapes.add(Menu.getTriangle());
							break;
						default:
							System.out.println("Invalid shape :(");
							break;
					}
					break;
				case 2:
					shapes.remove(Menu.getShapeIndex(shapes));
					break;
				case 3:					
					Menu.calcShape(Menu.getShapeIndex(shapes));					
					break;
				case 4:
					Canvas.paint(shapes);
					break;
				case 5:
					System.out.println("Bye !");
					break;
				default:
					System.out.println("please choose only between 1 - 4");
			}
			
		} while(option != 5);
	}

}
