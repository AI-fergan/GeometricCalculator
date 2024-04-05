import java.util.LinkedList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<Shape> shapes = new LinkedList<Shape>();
		int option;
		System.out.println("------------------------\n"
						 + "| Geometric Calculator |\n"
				    	 + "------------------------");
		
		System.out.println("1. Add Shape\n"
						 + "2. Remove Shape\n"
						 + "3. Calc Shape\n"
						 + "4. Print all shapes\n"
						 + "5. Exit");
		
		do {
			System.out.print("option: ");
			option = in.nextInt();
			
			switch(option) {
				case 1:
					System.out.flush();
					System.out.println("shapes:");
					System.out.println("1. point");
					System.out.println("2. circle");
					System.out.print("option: ");
					option = in.nextInt();
					switch(option) {
						case 1:
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
