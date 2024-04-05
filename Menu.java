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
		System.out.println("1. point");
		System.out.println("2. circle");
		
		System.out.print("3. option: ");
		
		return in.nextInt();		
	}
}
