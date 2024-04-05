import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {		
        ArrayList<Shape> shapes = new ArrayList<>();
		int option;
		
		do {
			option = Menu.openScreen();
			System.out.flush();
			switch(option) {
				case 1:				
					switch(Menu.shapesMenu()) {
						case 1:
							shapes.add(Menu.getCircle());
							break;
					}
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					System.out.println("Bye !");
					break;
				default:
					System.out.println("please choose only between 1 - 5");
			}
			
		} while(option != 5);
	}

}
