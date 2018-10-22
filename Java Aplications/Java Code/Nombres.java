import java.util.Scanner;
public class Nombres{
	public static void main(String args[]) {
		
		String nombre1 = "";
		String nombre2 = "";
		Scanner in  = new Scanner(System.in);

		System.out.println("equals");

		System.out.print("Ingresa el primer nombre: ");
		nombre1 = in.nextLine();
		System.out.println("");

		System.out.print("Ingresa el segundo nombre: ");
		nombre2 = in.nextLine();
		System.out.println("");

		if (nombre1.equals(nombre2)) {
			System.out.println("Los nombres son iguales.");
			System.out.println("");
		}
		else{
			System.out.println("Los Nombres no son iguales.");
			System.out.println("");
		}


		System.out.println("equalsIgnoreCase");

		System.out.print("Ingresa el primer nombre: ");
		nombre1 = in.nextLine();
		System.out.println("");

		System.out.print("Ingresa el segundo nombre: ");
		nombre2 = in.nextLine();
		System.out.println("");

		if (nombre1.equalsIgnoreCase(nombre2)) {
			System.out.println("Los nombres son iguales.");
			System.out.println("");
		}

		else{
			System.out.println("Los Nombres no son iguales.");
			System.out.println("");
		}
	}
}