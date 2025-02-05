package poo;

 import java.util.Scanner;
 
public class main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
				
		System.out.println("Escribe el color: ");
		String color = sc.next();
		
		Coche coche = new Coche(4, 5, color, "diesel", "AB2620", 20000.75, true);

		System.out.println(coche);
		
	}
}